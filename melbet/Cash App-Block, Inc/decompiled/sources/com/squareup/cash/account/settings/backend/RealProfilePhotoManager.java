package com.squareup.cash.account.settings.backend;

import android.graphics.Bitmap;
import androidx.core.text.TextUtilsCompat;
import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.account.navigation.RealAccountOutboundNavigator;
import com.squareup.cash.account.navigation.RealAccountOutboundNavigator$Factory$Impl;
import com.squareup.cash.card.onboarding.EquatableBitmap$Companion$toEquatable$2;
import com.squareup.cash.clientsync.EntitySyncerKt$hasSyncedFlow$1;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.profile.RealCropResultManager;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.data.profile.RealProfileManager$setPhoto$2;
import com.squareup.cash.permissions.AndroidPermissionManager;
import com.squareup.cash.permissions.AndroidPermissionManager$create$1;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.storage.AndroidFileProvider;
import com.squareup.cash.storage.Storage;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.flow.Flow;
import okio.ByteString;
import okio.Path;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class RealProfilePhotoManager {
    public static final Bitmap.CompressFormat PHOTO_FORMAT = Bitmap.CompressFormat.JPEG;
    public final RealAccountOutboundNavigator accountOutboundNavigator;
    public final Flow activityResults;
    public final AndroidPermissionManager$create$1 cameraPermissions;
    public final CoroutineContext computationDispatcher;
    public final RealCropResultManager cropResultManager;
    public final AndroidFileProvider fileProvider;
    public final CoroutineContext ioDispatcher;
    public StandaloneCoroutine photoJob;
    public final RealProfileManager profileManager;
    public final CoroutineScope scope;
    public final Storage storage;
    public final AndroidStringManager stringManager;
    public Path tempPath;

    public RealProfilePhotoManager(RealProfileManager realProfileManager, RealAccountOutboundNavigator$Factory$Impl realAccountOutboundNavigator$Factory$Impl, AndroidStringManager androidStringManager, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, AndroidFileProvider androidFileProvider, Flow flow, RealCropResultManager realCropResultManager, CoroutineScope coroutineScope, AndroidPermissionManager androidPermissionManager, Storage storage, BetterNavigator.ScreenNavigator screenNavigator) {
        this.profileManager = realProfileManager;
        this.stringManager = androidStringManager;
        this.ioDispatcher = coroutineContext;
        this.computationDispatcher = coroutineContext2;
        this.fileProvider = androidFileProvider;
        this.activityResults = flow;
        this.cropResultManager = realCropResultManager;
        this.scope = coroutineScope;
        this.storage = storage;
        this.cameraPermissions = androidPermissionManager.create("android.permission.CAMERA");
        this.accountOutboundNavigator = realAccountOutboundNavigator$Factory$Impl.create$1(screenNavigator);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object clear(ContinuationImpl continuationImpl) {
        RealProfilePhotoManager$clear$1 realProfilePhotoManager$clear$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof RealProfilePhotoManager$clear$1) {
            realProfilePhotoManager$clear$1 = (RealProfilePhotoManager$clear$1) continuationImpl;
            int i2 = realProfilePhotoManager$clear$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realProfilePhotoManager$clear$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realProfilePhotoManager$clear$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realProfilePhotoManager$clear$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    realProfilePhotoManager$clear$1.label = 1;
                    RealProfileManager realProfileManager = this.profileManager;
                    obj = JobKt.withContext(realProfileManager.ioDispatcher, new EntitySyncerKt$hasSyncedFlow$1(realProfileManager, continuation, 20), realProfilePhotoManager$clear$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Success)) {
                    if (!(apiResult instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    Integer valueOf = Integer.valueOf(R.string.profile_error_message_update);
                    this.accountOutboundNavigator.goToError(TextUtilsCompat.errorMessaging(this.stringManager, (ApiResult.Failure) apiResult, valueOf).message);
                }
                return Unit.INSTANCE;
            }
        }
        realProfilePhotoManager$clear$1 = new RealProfilePhotoManager$clear$1(this, continuationImpl);
        Object obj2 = realProfilePhotoManager$clear$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realProfilePhotoManager$clear$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        if (r8 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0045, code lost:
    
        if (r8 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object save(Bitmap bitmap, ContinuationImpl continuationImpl) {
        RealProfilePhotoManager$save$1 realProfilePhotoManager$save$1;
        int i;
        if (continuationImpl instanceof RealProfilePhotoManager$save$1) {
            realProfilePhotoManager$save$1 = (RealProfilePhotoManager$save$1) continuationImpl;
            int i2 = realProfilePhotoManager$save$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realProfilePhotoManager$save$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realProfilePhotoManager$save$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realProfilePhotoManager$save$1.label;
                int i3 = 1;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    EquatableBitmap$Companion$toEquatable$2 equatableBitmap$Companion$toEquatable$2 = new EquatableBitmap$Companion$toEquatable$2(bitmap, continuation, i3);
                    realProfilePhotoManager$save$1.label = 1;
                    obj = JobKt.withContext(this.computationDispatcher, equatableBitmap$Companion$toEquatable$2, realProfilePhotoManager$save$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        ApiResult apiResult = (ApiResult) obj;
                        if (!(apiResult instanceof ApiResult.Success)) {
                            if (!(apiResult instanceof ApiResult.Failure)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            Integer valueOf = Integer.valueOf(R.string.profile_error_message_update);
                            this.accountOutboundNavigator.goToError(TextUtilsCompat.errorMessaging(this.stringManager, (ApiResult.Failure) apiResult, valueOf).message);
                        }
                        return Unit.INSTANCE;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                realProfilePhotoManager$save$1.label = 2;
                RealProfileManager realProfileManager = this.profileManager;
                obj = JobKt.withContext(realProfileManager.ioDispatcher, new RealProfileManager$setPhoto$2((ByteString) obj, realProfileManager, continuation, 0), realProfilePhotoManager$save$1);
            }
        }
        realProfilePhotoManager$save$1 = new RealProfilePhotoManager$save$1(this, continuationImpl);
        Object obj2 = realProfilePhotoManager$save$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realProfilePhotoManager$save$1.label;
        int i32 = 1;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        realProfilePhotoManager$save$1.label = 2;
        RealProfileManager realProfileManager2 = this.profileManager;
        obj2 = JobKt.withContext(realProfileManager2.ioDispatcher, new RealProfileManager$setPhoto$2((ByteString) obj2, realProfileManager2, continuation2, 0), realProfilePhotoManager$save$1);
    }
}
