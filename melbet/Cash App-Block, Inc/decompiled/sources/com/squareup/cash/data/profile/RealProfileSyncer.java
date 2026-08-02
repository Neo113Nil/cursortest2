package com.squareup.cash.data.profile;

import app.cash.api.ApiResult;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import app.cash.sqldelight.SimpleQuery;
import app.cash.sqldelight.db.SqlDriver;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda11;
import com.squareup.cash.data.contacts.RealContactSync$syncRequest$2;
import com.squareup.cash.db.SessionQueries;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.db2.SyncDetailsQueries$$ExternalSyntheticLambda2;
import com.squareup.cash.db2.profile.ProfileQueries$$ExternalSyntheticLambda4;
import com.squareup.cash.db2.profile.ProfileQueries$selectPhotoUrl$2;
import com.squareup.cash.db2.profile.SelectPhotoUrl;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.graphics.swampgl.components.Scene;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.session.backend.TimeToLiveSyncState;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.GetProfileRequest;
import com.squareup.protos.franklin.app.GetProfileResponse;
import com.squareup.protos.franklin.common.DirectDepositAccount;
import com.squareup.protos.franklin.common.Profile;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.JobImpl;
import kotlinx.coroutines.JobKt;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class RealProfileSyncer {
    public final AppService appService;
    public final InstrumentQueries balanceDataQueries;
    public final SessionQueries databaseQueries;
    public final Lazy demandDepositAccountManager;
    public final FeatureFlagManager featureFlagManager;
    public final InstrumentQueries instrumentLinkingQueries;
    public final CoroutineContext ioDispatcher;
    public final InstrumentQueries notificationPreferenceQueries;
    public final InstrumentQueries profileAliasQueries;
    public final AtomicInteger profilePhotoVersion;
    public final InstrumentQueries profileQueries;
    public final TimeToLiveSyncState profileSyncState;
    public final InstrumentQueries scenarioPlanQueries;
    public final SessionManager sessionManager;

    public RealProfileSyncer(TimeToLiveSyncState timeToLiveSyncState, AppService appService, AtomicInteger atomicInteger, Lazy lazy, CashAccountDatabaseImpl cashAccountDatabaseImpl, SessionManager sessionManager, FeatureFlagManager featureFlagManager, CoroutineContext coroutineContext) {
        this.profileSyncState = timeToLiveSyncState;
        this.appService = appService;
        this.profilePhotoVersion = atomicInteger;
        this.demandDepositAccountManager = lazy;
        this.sessionManager = sessionManager;
        this.featureFlagManager = featureFlagManager;
        this.ioDispatcher = coroutineContext;
        this.scenarioPlanQueries = cashAccountDatabaseImpl.scenarioPlanQueries;
        this.balanceDataQueries = cashAccountDatabaseImpl.balanceDataQueries;
        this.instrumentLinkingQueries = cashAccountDatabaseImpl.instrumentLinkingOptionQueries;
        this.notificationPreferenceQueries = cashAccountDatabaseImpl.notificationPreferenceQueries;
        this.profileAliasQueries = cashAccountDatabaseImpl.profileAliasQueries;
        this.profileQueries = cashAccountDatabaseImpl.profileQueries;
        this.databaseQueries = cashAccountDatabaseImpl.databaseQueries;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0069, code lost:
    
        if (r7.updateProfile(r2, r8, r0) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0047, code lost:
    
        if (r8 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$performSync(RealProfileSyncer realProfileSyncer, ContinuationImpl continuationImpl) {
        RealProfileSyncer$performSync$1 realProfileSyncer$performSync$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof RealProfileSyncer$performSync$1) {
            realProfileSyncer$performSync$1 = (RealProfileSyncer$performSync$1) continuationImpl;
            int i2 = realProfileSyncer$performSync$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realProfileSyncer$performSync$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realProfileSyncer$performSync$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realProfileSyncer$performSync$1.label;
                boolean z = true;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    AppService appService = realProfileSyncer.appService;
                    GetProfileRequest getProfileRequest = new GetProfileRequest(ByteString.EMPTY);
                    realProfileSyncer$performSync$1.label = 1;
                    obj = appService.getProfile(getProfileRequest, realProfileSyncer$performSync$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Boolean.valueOf(z);
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Success)) {
                    GetProfileResponse getProfileResponse = (GetProfileResponse) ((ApiResult.Success) apiResult).response;
                    Profile profile = getProfileResponse.profile;
                    if (getProfileResponse.status == GetProfileResponse.Status.SUCCESS && profile != null) {
                        String str = getProfileResponse.profile_token;
                        realProfileSyncer$performSync$1.label = 2;
                    }
                } else {
                    if (!(apiResult instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    z = false;
                    Timber.Forest.e("Profile failed to update", new Object[0]);
                }
                return Boolean.valueOf(z);
            }
        }
        realProfileSyncer$performSync$1 = new RealProfileSyncer$performSync$1(realProfileSyncer, continuationImpl);
        Object obj3 = realProfileSyncer$performSync$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realProfileSyncer$performSync$1.label;
        boolean z2 = true;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj3;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
        return Boolean.valueOf(z2);
    }

    public final void blockingUpdateProfilePhoto(String str) {
        InstrumentQueries instrumentQueries = this.profileQueries;
        instrumentQueries.getClass();
        ProfileQueries$selectPhotoUrl$2 profileQueries$selectPhotoUrl$2 = ProfileQueries$selectPhotoUrl$2.INSTANCE;
        SqlDriver sqlDriver = instrumentQueries.driver;
        ProfileQueries$$ExternalSyntheticLambda4 profileQueries$$ExternalSyntheticLambda4 = new ProfileQueries$$ExternalSyntheticLambda4();
        sqlDriver.getClass();
        SelectPhotoUrl selectPhotoUrl = (SelectPhotoUrl) new SimpleQuery(84512947, new String[]{"profile"}, sqlDriver, "Profile.sq", "selectPhotoUrl", "SELECT photo_url\nFROM profile", profileQueries$$ExternalSyntheticLambda4).executeAsOneOrNull();
        String photo_url = selectPhotoUrl != null ? selectPhotoUrl.getPhoto_url() : null;
        if (photo_url == null) {
            photo_url = "";
        }
        if (!photo_url.equals(str)) {
            this.profilePhotoVersion.incrementAndGet();
        }
        sqlDriver.execute(2389888, "UPDATE profile\nSET photo_url = ?", new SyncDetailsQueries$$ExternalSyntheticLambda2(str, 18));
        instrumentQueries.notifyQueries(2389888, new ProfileQueries$$ExternalSyntheticLambda4(9));
    }

    public final Object refresh(boolean z, ContinuationImpl continuationImpl) {
        AppLockMonitor$special$$inlined$map$2 appLockMonitor$special$$inlined$map$2 = new AppLockMonitor$special$$inlined$map$2(new Scene.AnonymousClass1(this, (Continuation) null, 19), 18);
        JobImpl Job$default = JobKt.Job$default();
        TimeToLiveSyncState timeToLiveSyncState = this.profileSyncState;
        JobKt.launch$default(timeToLiveSyncState.scope, null, null, new RealContactSync$syncRequest$2.AnonymousClass1(timeToLiveSyncState, Job$default, z, appLockMonitor$special$$inlined$map$2, null), 3);
        Object join = Job$default.join(continuationImpl);
        return join == CoroutineSingletons.COROUTINE_SUSPENDED ? join : Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006a, code lost:
    
        if (r6.sessionManager.updateActiveAccountToken(r7, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        if (r8.updateDemandDepositAccount(r9) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateProfile(Profile profile, String str, ContinuationImpl continuationImpl) {
        RealProfileSyncer$updateProfile$1 realProfileSyncer$updateProfile$1;
        int i;
        if (continuationImpl instanceof RealProfileSyncer$updateProfile$1) {
            realProfileSyncer$updateProfile$1 = (RealProfileSyncer$updateProfile$1) continuationImpl;
            int i2 = realProfileSyncer$updateProfile$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realProfileSyncer$updateProfile$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realProfileSyncer$updateProfile$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realProfileSyncer$updateProfile$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.profileQueries.transactionWithWrapper(new CaptureCheckFaceKt$$ExternalSyntheticLambda11(23, this, profile, str));
                    RealDemandDepositAccountManager realDemandDepositAccountManager = (RealDemandDepositAccountManager) this.demandDepositAccountManager.getValue();
                    DirectDepositAccount directDepositAccount = profile.direct_deposit_account;
                    realProfileSyncer$updateProfile$1.L$0 = profile;
                    realProfileSyncer$updateProfile$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    profile = realProfileSyncer$updateProfile$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                String str2 = profile.customer_token;
                str2.getClass();
                realProfileSyncer$updateProfile$1.L$0 = null;
                realProfileSyncer$updateProfile$1.label = 2;
            }
        }
        realProfileSyncer$updateProfile$1 = new RealProfileSyncer$updateProfile$1(this, continuationImpl);
        Object obj2 = realProfileSyncer$updateProfile$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realProfileSyncer$updateProfile$1.label;
        if (i != 0) {
        }
        String str22 = profile.customer_token;
        str22.getClass();
        realProfileSyncer$updateProfile$1.L$0 = null;
        realProfileSyncer$updateProfile$1.label = 2;
    }
}
