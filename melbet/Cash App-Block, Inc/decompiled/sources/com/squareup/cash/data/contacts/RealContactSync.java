package com.squareup.cash.data.contacts;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.passcode.flows.RealPasscodeFlowStarter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.datadog.trace.core.util.Matchers;
import com.squareup.cash.afterpayapplet.backend.AfterpayEligibleRetroTransactionsProvider;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayAppletRepository;
import com.squareup.cash.cashapplite.cashin.RealLiteCashInRepo$MetroFactory;
import com.squareup.cash.cdf.ContactClearDataReason;
import com.squareup.cash.cdf.contact.ContactSyncReset;
import com.squareup.cash.clientroutes.ClientRoutesConfig;
import com.squareup.cash.clientroutes.RealClientRouteParser;
import com.squareup.cash.clientrouting.RealClientRouteToScreenMapping;
import com.squareup.cash.data.contacts.ContactSync$ResetReason;
import com.squareup.cash.data.contacts.ContactSyncEvent;
import com.squareup.cash.data.contacts.ContactSyncState;
import com.squareup.cash.data.contacts.ContactsSyncResponse;
import com.squareup.cash.data.contacts.RealContactDetailsSyncState;
import com.squareup.cash.db.SessionQueries;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.StampsConfigQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.db2.Sync_details;
import com.squareup.cash.db2.WebLoginConfigQueries$$ExternalSyntheticLambda2;
import com.squareup.cash.db2.contacts.ContactQueries;
import com.squareup.cash.featureflags.RealSessionFlags;
import com.squareup.cash.fillr.real.FillrInitializer;
import com.squareup.cash.history.analytics.LoadTimeClock;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.keystore.RealMessageSigner;
import com.squareup.cash.moneybot.presenters.MoneybotAmountInputPresenter$Factory$Impl;
import com.squareup.cash.moneybot.presenters.MoneybotAutomationsPresenter$Factory$Impl;
import com.squareup.cash.moneybot.presenters.MoneybotChatHistoryPresenter$Factory$Impl;
import com.squareup.cash.moneybot.presenters.MoneybotChatPresenter$Factory$Impl;
import com.squareup.cash.moneybot.presenters.MoneybotDebugOverlayPresenter$Factory$Impl;
import com.squareup.cash.moneybot.presenters.MoneybotFeedbackPresenter$Factory$Impl;
import com.squareup.cash.moneybot.presenters.MoneybotHomePresenter$Factory$Impl;
import com.squareup.cash.moneybot.presenters.MoneybotOverflowMenuPresenter$Factory$Impl;
import com.squareup.cash.moneybot.presenters.MoneybotPreambleEditorPresenter$Factory$Impl;
import com.squareup.cash.moneybot.presenters.MoneybotStaticPickerPresenter$Factory$Impl;
import com.squareup.cash.moneybot.presenters.MoneybotTextInputPresenter$Factory$Impl;
import com.squareup.cash.moneybot.presenters.RawMessagesPresenter$Factory$Impl;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.music.views.MusicViewFactory$MetroFactory;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.offers.presenters.OffersPresenterFactory;
import com.squareup.cash.payments.backend.real.RealActivityPaymentManager;
import com.squareup.cash.payments.backend.real.RealActivityPaymentManager2;
import com.squareup.cash.payments.backend.real.RealPaymentActionCompletionDispatcher;
import com.squareup.cash.payments.backend.real.RealPaymentManager;
import com.squareup.cash.permissions.ReadOnlyPermissions;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.storage.RealFileDownloader;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.moshi.Moshi;
import com.squareup.preferences.EnumPreference;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.cashsuggest.api.CashSuggestClientService;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.util.coroutines.Teardown;
import com.squareup.util.coroutines.UiSetupTeardown;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import dev.zacsweers.metro.internal.InstanceFactory;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.internal.ContextScope;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.PapaEvent;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class RealContactSync implements UiSetupTeardown {
    public static final /* synthetic */ int $r8$clinit = 0;
    public static final long RATE_LIMITED_DELAY;
    public static final long SOFT_RATE_LIMIT_DELAY;
    public final Analytics analytics;
    public final AndroidClock clock;
    public final RealContactDetailsSyncState contactDetailsSyncState;
    public final RealContactRepository contactRepository;
    public final RealContactSyncDetailsRepository contactSyncDetailsRepository;
    public final EnumPreference contactsSyncState;
    public final BufferedChannel eventsAndRoutines = PapaEvent.Channel$default(50, null, null, 6);
    public final RealContactSyncEventAggregator$Factory$Impl eventsFactory;
    public final CoroutineContext ioDispatcher;
    public final ReadOnlyPermissions readContactsPermission;
    public final RealContactSyncRoutineAggregator$Factory$Impl routinesFactory;
    public final ContextScope scope;
    public final SessionManager sessionManager;

    /* loaded from: classes6.dex */
    public abstract class RateLimitedState {

        public final class NotRateLimited extends RateLimitedState {
            public static final NotRateLimited INSTANCE = new NotRateLimited();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof NotRateLimited);
            }

            public final int hashCode() {
                return 1082501060;
            }

            public final String toString() {
                return "NotRateLimited";
            }
        }

        public final class RateLimited extends RateLimitedState {
            public final long next;

            public RateLimited(long j) {
                this.next = j;
            }

            public final long getNext() {
                return this.next;
            }
        }
    }

    static {
        Duration.Companion companion = Duration.Companion;
        RATE_LIMITED_DELAY = Duration.m4167getInWholeMillisecondsimpl(DurationKt.toDuration(1, DurationUnit.DAYS));
        SOFT_RATE_LIMIT_DELAY = Duration.m4167getInWholeMillisecondsimpl(DurationKt.toDuration(5, DurationUnit.MINUTES));
    }

    public RealContactSync(CoroutineScope coroutineScope, CoroutineContext coroutineContext, RealContactSyncEventAggregator$Factory$Impl realContactSyncEventAggregator$Factory$Impl, RealContactSyncRoutineAggregator$Factory$Impl realContactSyncRoutineAggregator$Factory$Impl, RealContactSyncDetailsRepository realContactSyncDetailsRepository, RealContactRepository realContactRepository, RealContactDetailsSyncState realContactDetailsSyncState, SessionManager sessionManager, ReadOnlyPermissions readOnlyPermissions, EnumPreference enumPreference, AndroidClock androidClock, Analytics analytics) {
        this.ioDispatcher = coroutineContext;
        this.eventsFactory = realContactSyncEventAggregator$Factory$Impl;
        this.routinesFactory = realContactSyncRoutineAggregator$Factory$Impl;
        this.contactSyncDetailsRepository = realContactSyncDetailsRepository;
        this.contactRepository = realContactRepository;
        this.contactDetailsSyncState = realContactDetailsSyncState;
        this.sessionManager = sessionManager;
        this.readContactsPermission = readOnlyPermissions;
        this.contactsSyncState = enumPreference;
        this.clock = androidClock;
        this.analytics = analytics;
        this.scope = JobKt.plus(new CoroutineName("Contacts"), JobKt.plus(coroutineContext, coroutineScope));
        JobKt.launch$default(coroutineScope, null, null, new RealContactSync$setup$1$1(this, null, 1), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0108, code lost:
    
        if (kotlinx.coroutines.JobKt.cancelAndJoin(r1, r5) == r6) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0123, code lost:
    
        if (kotlinx.coroutines.JobKt.cancelAndJoin(r1, r5) == r6) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b8, code lost:
    
        if (r2 == r6) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$resetState(RealContactSync realContactSync, ContactSyncState contactSyncState, ContactSync$ResetReason contactSync$ResetReason, ContinuationImpl continuationImpl) {
        RealContactSync$resetState$1 realContactSync$resetState$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        ContactSyncReset.ResetReason resetReason;
        ContactClearDataReason contactClearDataReason;
        ContactSyncState contactSyncState2;
        String detailed_sync_token;
        ContactSyncState contactSyncState3;
        Boolean bool;
        Analytics analytics;
        ContactSyncReset.ResetReason resetReason2;
        RealContactSyncDetailsRepository realContactSyncDetailsRepository = realContactSync.contactSyncDetailsRepository;
        Analytics analytics2 = realContactSync.analytics;
        if (continuationImpl instanceof RealContactSync$resetState$1) {
            realContactSync$resetState$1 = (RealContactSync$resetState$1) continuationImpl;
            int i2 = realContactSync$resetState$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realContactSync$resetState$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realContactSync$resetState$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realContactSync$resetState$1.label;
                int i3 = 0;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Timber.Forest.i("Resetting Contacts: " + contactSync$ResetReason, new Object[0]);
                    ContactSync$ResetReason.PermissionDenied permissionDenied = ContactSync$ResetReason.PermissionDenied.INSTANCE;
                    boolean areEqual = Intrinsics.areEqual(contactSync$ResetReason, permissionDenied);
                    ContactSync$ResetReason.SignOut signOut = ContactSync$ResetReason.SignOut.INSTANCE;
                    if (areEqual) {
                        resetReason = ContactSyncReset.ResetReason.PERMISSION_DENIED;
                    } else {
                        if (!Intrinsics.areEqual(contactSync$ResetReason, signOut)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        resetReason = ContactSyncReset.ResetReason.SIGNOUT;
                    }
                    if (Intrinsics.areEqual(contactSync$ResetReason, permissionDenied)) {
                        contactClearDataReason = ContactClearDataReason.PERMISSION_DENIED;
                    } else {
                        if (!Intrinsics.areEqual(contactSync$ResetReason, signOut)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        contactClearDataReason = ContactClearDataReason.SIGN_OUT;
                    }
                    Matchers.trackContactSyncClearData(analytics2, contactClearDataReason);
                    Matchers.trackContactEncryptedSyncClearData(analytics2, contactClearDataReason);
                    contactSyncState2 = contactSyncState;
                    realContactSync$resetState$1.L$0 = contactSyncState2;
                    realContactSync$resetState$1.L$4 = analytics2;
                    realContactSync$resetState$1.L$5 = resetReason;
                    realContactSync$resetState$1.label = 1;
                    Sync_details fetchDetails = realContactSyncDetailsRepository.fetchDetails();
                    obj = fetchDetails != null ? fetchDetails.getSync_token() : null;
                } else if (i == 1) {
                    ContactSyncReset.ResetReason resetReason3 = realContactSync$resetState$1.L$5;
                    analytics2 = realContactSync$resetState$1.L$4;
                    ContactSyncState contactSyncState4 = realContactSync$resetState$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    resetReason = resetReason3;
                    contactSyncState2 = contactSyncState4;
                } else {
                    if (i != 2) {
                        if (i != 3 && i != 4) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        realContactSyncDetailsRepository.syncDetailsQueries.transactionWithWrapper(new StampsConfigQueries$$ExternalSyntheticLambda0(realContactSyncDetailsRepository, 5));
                        SessionQueries sessionQueries = realContactSync.contactDetailsSyncState.details;
                        sessionQueries.driver.execute(-920376760, "DELETE FROM contact_detailed_sync_state", null);
                        sessionQueries.notifyQueries(-920376760, new WebLoginConfigQueries$$ExternalSyntheticLambda2(22, false));
                        RealContactRepository realContactRepository = realContactSync.contactRepository;
                        ContactQueries contactQueries = realContactRepository.contactQueries;
                        RealContactRepository$$ExternalSyntheticLambda5 realContactRepository$$ExternalSyntheticLambda5 = new RealContactRepository$$ExternalSyntheticLambda5(realContactRepository, i3);
                        contactQueries.getClass();
                        contactQueries.transactionWithWrapper(realContactRepository$$ExternalSyntheticLambda5);
                        return ContactSyncState.Unsynced.INSTANCE;
                    }
                    bool = realContactSync$resetState$1.L$6;
                    resetReason2 = realContactSync$resetState$1.L$5;
                    analytics = realContactSync$resetState$1.L$4;
                    contactSyncState3 = realContactSync$resetState$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    Matchers.trackContactSyncReset(analytics, resetReason2, bool, Boolean.valueOf(obj != null));
                    if (contactSyncState3 instanceof ContactSyncState.Syncing) {
                        if (contactSyncState3 instanceof ContactSyncState.SyncingInvalidated) {
                            Deferred job = ((ContactSyncState.SyncingInvalidated) contactSyncState3).getJob();
                            realContactSync$resetState$1.L$0 = null;
                            realContactSync$resetState$1.L$4 = null;
                            realContactSync$resetState$1.L$5 = null;
                            realContactSync$resetState$1.L$6 = null;
                            realContactSync$resetState$1.label = 4;
                        }
                        realContactSyncDetailsRepository.syncDetailsQueries.transactionWithWrapper(new StampsConfigQueries$$ExternalSyntheticLambda0(realContactSyncDetailsRepository, 5));
                        SessionQueries sessionQueries2 = realContactSync.contactDetailsSyncState.details;
                        sessionQueries2.driver.execute(-920376760, "DELETE FROM contact_detailed_sync_state", null);
                        sessionQueries2.notifyQueries(-920376760, new WebLoginConfigQueries$$ExternalSyntheticLambda2(22, false));
                        RealContactRepository realContactRepository2 = realContactSync.contactRepository;
                        ContactQueries contactQueries2 = realContactRepository2.contactQueries;
                        RealContactRepository$$ExternalSyntheticLambda5 realContactRepository$$ExternalSyntheticLambda52 = new RealContactRepository$$ExternalSyntheticLambda5(realContactRepository2, i3);
                        contactQueries2.getClass();
                        contactQueries2.transactionWithWrapper(realContactRepository$$ExternalSyntheticLambda52);
                        return ContactSyncState.Unsynced.INSTANCE;
                    }
                    Deferred job2 = ((ContactSyncState.Syncing) contactSyncState3).getJob();
                    realContactSync$resetState$1.L$0 = null;
                    realContactSync$resetState$1.L$4 = null;
                    realContactSync$resetState$1.L$5 = null;
                    realContactSync$resetState$1.L$6 = null;
                    realContactSync$resetState$1.label = 3;
                }
                Boolean valueOf = Boolean.valueOf(obj == null);
                realContactSync$resetState$1.L$0 = contactSyncState2;
                realContactSync$resetState$1.L$4 = analytics2;
                realContactSync$resetState$1.L$5 = resetReason;
                realContactSync$resetState$1.L$6 = valueOf;
                realContactSync$resetState$1.label = 2;
                Sync_details fetchDetails2 = realContactSyncDetailsRepository.fetchDetails();
                detailed_sync_token = fetchDetails2 == null ? fetchDetails2.getDetailed_sync_token() : null;
                if (detailed_sync_token != coroutineSingletons) {
                    String str = detailed_sync_token;
                    contactSyncState3 = contactSyncState2;
                    bool = valueOf;
                    obj = str;
                    ContactSyncReset.ResetReason resetReason4 = resetReason;
                    analytics = analytics2;
                    resetReason2 = resetReason4;
                    Matchers.trackContactSyncReset(analytics, resetReason2, bool, Boolean.valueOf(obj != null));
                    if (contactSyncState3 instanceof ContactSyncState.Syncing) {
                    }
                }
                return coroutineSingletons;
            }
        }
        realContactSync$resetState$1 = new RealContactSync$resetState$1(realContactSync, continuationImpl);
        Object obj2 = realContactSync$resetState$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realContactSync$resetState$1.label;
        int i32 = 0;
        if (i != 0) {
        }
        Boolean valueOf2 = Boolean.valueOf(obj2 == null);
        realContactSync$resetState$1.L$0 = contactSyncState2;
        realContactSync$resetState$1.L$4 = analytics2;
        realContactSync$resetState$1.L$5 = resetReason;
        realContactSync$resetState$1.L$6 = valueOf2;
        realContactSync$resetState$1.label = 2;
        Sync_details fetchDetails22 = realContactSyncDetailsRepository.fetchDetails();
        if (fetchDetails22 == null) {
        }
        if (detailed_sync_token != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0073, code lost:
    
        if (r13 == r1) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$syncContactsToDatabaseAndUploadAliases(RealContactSync realContactSync, List list, ContactSyncEvent.SyncRoutines syncRoutines, boolean z, Long l, ContactSync$SyncReason contactSync$SyncReason, ContinuationImpl continuationImpl) {
        RealContactSync$syncContactsToDatabaseAndUploadAliases$1 realContactSync$syncContactsToDatabaseAndUploadAliases$1;
        Object obj;
        Object obj2;
        int i;
        ContactsSyncResponse contactsSyncResponse;
        List list2;
        boolean z2;
        ContactSyncEvent.SyncRoutines syncRoutines2;
        ContactSync$SyncReason contactSync$SyncReason2;
        ContactsSyncRoutine contactsSyncRoutine;
        if (continuationImpl instanceof RealContactSync$syncContactsToDatabaseAndUploadAliases$1) {
            realContactSync$syncContactsToDatabaseAndUploadAliases$1 = (RealContactSync$syncContactsToDatabaseAndUploadAliases$1) continuationImpl;
            int i2 = realContactSync$syncContactsToDatabaseAndUploadAliases$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realContactSync$syncContactsToDatabaseAndUploadAliases$1.label = i2 - PKIFailureInfo.systemUnavail;
                obj = realContactSync$syncContactsToDatabaseAndUploadAliases$1.result;
                obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realContactSync$syncContactsToDatabaseAndUploadAliases$1.label;
                Object obj3 = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ContactsSyncRoutine contactsSyncRoutine2 = syncRoutines.databaseUpdate;
                    realContactSync$syncContactsToDatabaseAndUploadAliases$1.L$0 = list;
                    realContactSync$syncContactsToDatabaseAndUploadAliases$1.L$1 = syncRoutines;
                    realContactSync$syncContactsToDatabaseAndUploadAliases$1.L$2 = l;
                    realContactSync$syncContactsToDatabaseAndUploadAliases$1.L$3 = contactSync$SyncReason;
                    realContactSync$syncContactsToDatabaseAndUploadAliases$1.Z$0 = z;
                    realContactSync$syncContactsToDatabaseAndUploadAliases$1.label = 1;
                    if (contactsSyncRoutine2 != null) {
                        obj = contactsSyncRoutine2.contactsSync(list, contactSync$SyncReason, realContactSync$syncContactsToDatabaseAndUploadAliases$1);
                        if (obj != obj2) {
                            obj = (ContactsSyncResponse) obj;
                        }
                    } else {
                        obj = null;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                SafeTrace.throwOnFailure(obj);
                                return obj;
                            }
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z2 = realContactSync$syncContactsToDatabaseAndUploadAliases$1.Z$0;
                        contactSync$SyncReason2 = realContactSync$syncContactsToDatabaseAndUploadAliases$1.L$3;
                        syncRoutines2 = realContactSync$syncContactsToDatabaseAndUploadAliases$1.L$1;
                        list2 = realContactSync$syncContactsToDatabaseAndUploadAliases$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        RateLimitedState rateLimitedState = (RateLimitedState) obj;
                        if (z2 && (rateLimitedState instanceof RateLimitedState.RateLimited)) {
                            Timber.Forest.i(Boxes$$ExternalSyntheticOutline1.m((((RateLimitedState.RateLimited) rateLimitedState).getNext() - realContactSync.clock.millis()) / 1000, "The attempt to sync contacts was rate limited. Retry in ", " seconds."), new Object[0]);
                            return ContactsSyncResponse.WasRateLimited.INSTANCE;
                        }
                        contactsSyncRoutine = syncRoutines2.hashAliasUpload;
                        realContactSync$syncContactsToDatabaseAndUploadAliases$1.L$0 = null;
                        realContactSync$syncContactsToDatabaseAndUploadAliases$1.L$1 = null;
                        realContactSync$syncContactsToDatabaseAndUploadAliases$1.L$2 = null;
                        realContactSync$syncContactsToDatabaseAndUploadAliases$1.L$3 = null;
                        realContactSync$syncContactsToDatabaseAndUploadAliases$1.Z$0 = z2;
                        realContactSync$syncContactsToDatabaseAndUploadAliases$1.label = 3;
                        if (contactsSyncRoutine != null && (obj3 = contactsSyncRoutine.contactsSync(list2, contactSync$SyncReason2, realContactSync$syncContactsToDatabaseAndUploadAliases$1)) != obj2) {
                            obj3 = (ContactsSyncResponse) obj3;
                        }
                        return obj3 != obj2 ? obj2 : obj3;
                    }
                    z = realContactSync$syncContactsToDatabaseAndUploadAliases$1.Z$0;
                    contactSync$SyncReason = realContactSync$syncContactsToDatabaseAndUploadAliases$1.L$3;
                    l = realContactSync$syncContactsToDatabaseAndUploadAliases$1.L$2;
                    syncRoutines = realContactSync$syncContactsToDatabaseAndUploadAliases$1.L$1;
                    list = realContactSync$syncContactsToDatabaseAndUploadAliases$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                contactsSyncResponse = (ContactsSyncResponse) obj;
                if ((contactsSyncResponse instanceof ContactsSyncResponse.Success) || !((ContactsSyncResponse.Success) contactsSyncResponse).getNothingChanged()) {
                    l = null;
                }
                realContactSync$syncContactsToDatabaseAndUploadAliases$1.L$0 = list;
                realContactSync$syncContactsToDatabaseAndUploadAliases$1.L$1 = syncRoutines;
                realContactSync$syncContactsToDatabaseAndUploadAliases$1.L$2 = null;
                realContactSync$syncContactsToDatabaseAndUploadAliases$1.L$3 = contactSync$SyncReason;
                realContactSync$syncContactsToDatabaseAndUploadAliases$1.Z$0 = z;
                realContactSync$syncContactsToDatabaseAndUploadAliases$1.label = 2;
                obj = realContactSync.checkRateLimited(l, realContactSync$syncContactsToDatabaseAndUploadAliases$1);
                if (obj != obj2) {
                    list2 = list;
                    z2 = z;
                    syncRoutines2 = syncRoutines;
                    contactSync$SyncReason2 = contactSync$SyncReason;
                    RateLimitedState rateLimitedState2 = (RateLimitedState) obj;
                    if (z2) {
                    }
                    contactsSyncRoutine = syncRoutines2.hashAliasUpload;
                    realContactSync$syncContactsToDatabaseAndUploadAliases$1.L$0 = null;
                    realContactSync$syncContactsToDatabaseAndUploadAliases$1.L$1 = null;
                    realContactSync$syncContactsToDatabaseAndUploadAliases$1.L$2 = null;
                    realContactSync$syncContactsToDatabaseAndUploadAliases$1.L$3 = null;
                    realContactSync$syncContactsToDatabaseAndUploadAliases$1.Z$0 = z2;
                    realContactSync$syncContactsToDatabaseAndUploadAliases$1.label = 3;
                    if (contactsSyncRoutine != null) {
                        obj3 = (ContactsSyncResponse) obj3;
                    }
                    if (obj3 != obj2) {
                    }
                }
            }
        }
        realContactSync$syncContactsToDatabaseAndUploadAliases$1 = new RealContactSync$syncContactsToDatabaseAndUploadAliases$1(realContactSync, continuationImpl);
        obj = realContactSync$syncContactsToDatabaseAndUploadAliases$1.result;
        obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realContactSync$syncContactsToDatabaseAndUploadAliases$1.label;
        Object obj32 = null;
        if (i != 0) {
        }
        contactsSyncResponse = (ContactsSyncResponse) obj;
        if (contactsSyncResponse instanceof ContactsSyncResponse.Success) {
        }
        l = null;
        realContactSync$syncContactsToDatabaseAndUploadAliases$1.L$0 = list;
        realContactSync$syncContactsToDatabaseAndUploadAliases$1.L$1 = syncRoutines;
        realContactSync$syncContactsToDatabaseAndUploadAliases$1.L$2 = null;
        realContactSync$syncContactsToDatabaseAndUploadAliases$1.L$3 = contactSync$SyncReason;
        realContactSync$syncContactsToDatabaseAndUploadAliases$1.Z$0 = z;
        realContactSync$syncContactsToDatabaseAndUploadAliases$1.label = 2;
        obj = realContactSync.checkRateLimited(l, realContactSync$syncContactsToDatabaseAndUploadAliases$1);
        if (obj != obj2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object checkRateLimited(Long l, ContinuationImpl continuationImpl) {
        RealContactSync$checkRateLimited$1 realContactSync$checkRateLimited$1;
        int i;
        Long l2;
        long longValue;
        if (continuationImpl instanceof RealContactSync$checkRateLimited$1) {
            realContactSync$checkRateLimited$1 = (RealContactSync$checkRateLimited$1) continuationImpl;
            int i2 = realContactSync$checkRateLimited$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realContactSync$checkRateLimited$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realContactSync$checkRateLimited$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realContactSync$checkRateLimited$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    realContactSync$checkRateLimited$1.L$0 = l;
                    realContactSync$checkRateLimited$1.label = 1;
                    Sync_details fetchDetails = this.contactSyncDetailsRepository.fetchDetails();
                    obj = fetchDetails != null ? fetchDetails.getRate_limited_time() : null;
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    l = realContactSync$checkRateLimited$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                l2 = (Long) obj;
                if (l2 != null) {
                    if (l != null) {
                        longValue = l.longValue();
                    }
                    return RateLimitedState.NotRateLimited.INSTANCE;
                }
                longValue = l2.longValue();
                if (this.clock.millis() <= longValue) {
                    return new RateLimitedState.RateLimited(longValue);
                }
                return RateLimitedState.NotRateLimited.INSTANCE;
            }
        }
        realContactSync$checkRateLimited$1 = new RealContactSync$checkRateLimited$1(this, continuationImpl);
        Object obj2 = realContactSync$checkRateLimited$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realContactSync$checkRateLimited$1.label;
        if (i != 0) {
        }
        l2 = (Long) obj2;
        if (l2 != null) {
        }
        if (this.clock.millis() <= longValue) {
        }
        return RateLimitedState.NotRateLimited.INSTANCE;
    }

    public final Object reset(ContactSync$ResetReason contactSync$ResetReason, Continuation continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        cancellableContinuationImpl.initCancellability();
        ChannelResult.m4192getOrThrowimpl(this.eventsAndRoutines.mo1159trySendJP2dKIU(new ContactSyncEvent.Reset(contactSync$ResetReason, new RealContactSync$reset$2$1(cancellableContinuationImpl, 0))));
        Object result = cancellableContinuationImpl.getResult();
        return result == CoroutineSingletons.COROUTINE_SUSPENDED ? result : Unit.INSTANCE;
    }

    @Override // com.squareup.util.coroutines.UnitSetupTeardown
    public final Teardown setup(CoroutineScope coroutineScope) {
        coroutineScope.getClass();
        Continuation continuation = null;
        JobKt.launch$default(coroutineScope, null, null, new RealContactSync$setup$1$1(this, continuation, 0), 3);
        JobKt.launch$default(coroutineScope, null, null, new RealContactSync$setup$1$1(this, continuation, 2), 3);
        return StateFlowKt.noOpTeardown;
    }

    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId = 3;
        public final Provider analytics;
        public final Provider clock;
        public final Provider contactDetailsSyncState;
        public final Provider contactRepository;
        public final Provider contactSyncDetailsRepository;
        public final Provider contactsSyncState;
        public final Provider eventsFactory;
        public final Provider ioDispatcher;
        public final Provider readContactsPermission;
        public final Provider routinesFactory;
        public final InstanceFactory scope;
        public final Provider sessionManager;

        public MetroFactory(DoubleCheck doubleCheck, DoubleCheck doubleCheck2, RealLiteCashInRepo$MetroFactory realLiteCashInRepo$MetroFactory, DoubleCheck doubleCheck3, DoubleCheck doubleCheck4, DoubleCheck doubleCheck5, DoubleCheck doubleCheck6, DoubleCheck doubleCheck7, InstanceFactory instanceFactory, LambdaProvider lambdaProvider, LambdaProvider lambdaProvider2, DoubleCheck doubleCheck8) {
            this.ioDispatcher = doubleCheck;
            this.contactSyncDetailsRepository = doubleCheck2;
            this.contactRepository = realLiteCashInRepo$MetroFactory;
            this.contactDetailsSyncState = doubleCheck3;
            this.sessionManager = doubleCheck4;
            this.readContactsPermission = doubleCheck5;
            this.contactsSyncState = doubleCheck6;
            this.clock = doubleCheck7;
            this.scope = instanceFactory;
            this.analytics = lambdaProvider;
            this.eventsFactory = lambdaProvider2;
            this.routinesFactory = doubleCheck8;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            Provider provider = this.contactDetailsSyncState;
            Provider provider2 = this.routinesFactory;
            Provider provider3 = this.eventsFactory;
            Provider provider4 = this.analytics;
            InstanceFactory instanceFactory = this.scope;
            Provider provider5 = this.clock;
            Provider provider6 = this.contactsSyncState;
            Provider provider7 = this.readContactsPermission;
            Provider provider8 = this.sessionManager;
            Provider provider9 = this.contactRepository;
            Provider provider10 = this.contactSyncDetailsRepository;
            Provider provider11 = this.ioDispatcher;
            switch (i) {
                case 0:
                    CoroutineScope coroutineScope = (CoroutineScope) instanceFactory.value;
                    CoroutineContext coroutineContext = (CoroutineContext) provider11.invoke();
                    RealContactSyncEventAggregator$Factory$Impl realContactSyncEventAggregator$Factory$Impl = (RealContactSyncEventAggregator$Factory$Impl) ((InstanceFactory) provider3).value;
                    RealContactSyncRoutineAggregator$Factory$Impl realContactSyncRoutineAggregator$Factory$Impl = (RealContactSyncRoutineAggregator$Factory$Impl) ((InstanceFactory) provider2).value;
                    RealContactSyncDetailsRepository realContactSyncDetailsRepository = (RealContactSyncDetailsRepository) provider10.invoke();
                    RealContactRepository realContactRepository = (RealContactRepository) provider9.invoke();
                    RealContactDetailsSyncState realContactDetailsSyncState = (RealContactDetailsSyncState) provider.invoke();
                    SessionManager sessionManager = (SessionManager) provider8.invoke();
                    ReadOnlyPermissions readOnlyPermissions = (ReadOnlyPermissions) provider7.invoke();
                    EnumPreference enumPreference = (EnumPreference) provider6.invoke();
                    AndroidClock androidClock = (AndroidClock) provider5.invoke();
                    Analytics analytics = (Analytics) provider4.invoke();
                    coroutineScope.getClass();
                    coroutineContext.getClass();
                    realContactSyncEventAggregator$Factory$Impl.getClass();
                    realContactSyncRoutineAggregator$Factory$Impl.getClass();
                    realContactSyncDetailsRepository.getClass();
                    realContactRepository.getClass();
                    realContactDetailsSyncState.getClass();
                    sessionManager.getClass();
                    readOnlyPermissions.getClass();
                    enumPreference.getClass();
                    androidClock.getClass();
                    analytics.getClass();
                    return new RealContactSync(coroutineScope, coroutineContext, realContactSyncEventAggregator$Factory$Impl, realContactSyncRoutineAggregator$Factory$Impl, realContactSyncDetailsRepository, realContactRepository, realContactDetailsSyncState, sessionManager, readOnlyPermissions, enumPreference, androidClock, analytics);
                case 1:
                    CashSuggestClientService cashSuggestClientService = (CashSuggestClientService) provider11.invoke();
                    CashAccountDatabaseImpl cashAccountDatabaseImpl = (CashAccountDatabaseImpl) provider10.invoke();
                    AndroidClock androidClock2 = (AndroidClock) provider9.invoke();
                    ErrorReporter errorReporter = (ErrorReporter) provider.invoke();
                    SampleStrategy sampleStrategy = (SampleStrategy) provider8.invoke();
                    LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) ((RealMessageSigner.MetroFactory) provider3).invoke();
                    CoroutineContext coroutineContext2 = (CoroutineContext) provider7.invoke();
                    CoroutineScope coroutineScope2 = (CoroutineScope) instanceFactory.value;
                    AfterpayEligibleRetroTransactionsProvider afterpayEligibleRetroTransactionsProvider = (AfterpayEligibleRetroTransactionsProvider) provider6.invoke();
                    KeyValue keyValue = (KeyValue) ((RealPasscodeFlowStarter.MetroFactory) provider2).invoke();
                    KeyValue keyValue2 = (KeyValue) ((RealPasscodeFlowStarter.MetroFactory) provider5).invoke();
                    KeyValue keyValue3 = (KeyValue) ((RealPasscodeFlowStarter.MetroFactory) provider4).invoke();
                    cashSuggestClientService.getClass();
                    cashAccountDatabaseImpl.getClass();
                    androidClock2.getClass();
                    errorReporter.getClass();
                    sampleStrategy.getClass();
                    coroutineContext2.getClass();
                    coroutineScope2.getClass();
                    afterpayEligibleRetroTransactionsProvider.getClass();
                    return new RealAfterpayAppletRepository(cashSuggestClientService, cashAccountDatabaseImpl, androidClock2, errorReporter, sampleStrategy, factory, coroutineContext2, coroutineScope2, afterpayEligibleRetroTransactionsProvider, keyValue, keyValue2, keyValue3);
                case 2:
                    MoneybotChatPresenter$Factory$Impl moneybotChatPresenter$Factory$Impl = (MoneybotChatPresenter$Factory$Impl) instanceFactory.value;
                    MoneybotChatHistoryPresenter$Factory$Impl moneybotChatHistoryPresenter$Factory$Impl = (MoneybotChatHistoryPresenter$Factory$Impl) ((InstanceFactory) provider3).value;
                    RawMessagesPresenter$Factory$Impl rawMessagesPresenter$Factory$Impl = (RawMessagesPresenter$Factory$Impl) ((InstanceFactory) provider2).value;
                    MoneybotPreambleEditorPresenter$Factory$Impl moneybotPreambleEditorPresenter$Factory$Impl = (MoneybotPreambleEditorPresenter$Factory$Impl) ((InstanceFactory) provider11).value;
                    MoneybotHomePresenter$Factory$Impl moneybotHomePresenter$Factory$Impl = (MoneybotHomePresenter$Factory$Impl) ((InstanceFactory) provider10).value;
                    MoneybotOverflowMenuPresenter$Factory$Impl moneybotOverflowMenuPresenter$Factory$Impl = (MoneybotOverflowMenuPresenter$Factory$Impl) ((InstanceFactory) provider9).value;
                    MoneybotAutomationsPresenter$Factory$Impl moneybotAutomationsPresenter$Factory$Impl = (MoneybotAutomationsPresenter$Factory$Impl) ((InstanceFactory) provider).value;
                    MoneybotDebugOverlayPresenter$Factory$Impl moneybotDebugOverlayPresenter$Factory$Impl = (MoneybotDebugOverlayPresenter$Factory$Impl) ((InstanceFactory) provider8).value;
                    MoneybotFeedbackPresenter$Factory$Impl moneybotFeedbackPresenter$Factory$Impl = (MoneybotFeedbackPresenter$Factory$Impl) ((InstanceFactory) provider7).value;
                    MoneybotAmountInputPresenter$Factory$Impl moneybotAmountInputPresenter$Factory$Impl = (MoneybotAmountInputPresenter$Factory$Impl) ((InstanceFactory) provider6).value;
                    MoneybotStaticPickerPresenter$Factory$Impl moneybotStaticPickerPresenter$Factory$Impl = (MoneybotStaticPickerPresenter$Factory$Impl) ((InstanceFactory) provider5).value;
                    MoneybotTextInputPresenter$Factory$Impl moneybotTextInputPresenter$Factory$Impl = (MoneybotTextInputPresenter$Factory$Impl) ((InstanceFactory) provider4).value;
                    moneybotChatPresenter$Factory$Impl.getClass();
                    moneybotChatHistoryPresenter$Factory$Impl.getClass();
                    rawMessagesPresenter$Factory$Impl.getClass();
                    moneybotPreambleEditorPresenter$Factory$Impl.getClass();
                    moneybotHomePresenter$Factory$Impl.getClass();
                    moneybotOverflowMenuPresenter$Factory$Impl.getClass();
                    moneybotAutomationsPresenter$Factory$Impl.getClass();
                    moneybotDebugOverlayPresenter$Factory$Impl.getClass();
                    moneybotFeedbackPresenter$Factory$Impl.getClass();
                    moneybotAmountInputPresenter$Factory$Impl.getClass();
                    moneybotStaticPickerPresenter$Factory$Impl.getClass();
                    moneybotTextInputPresenter$Factory$Impl.getClass();
                    return new OffersPresenterFactory(moneybotChatPresenter$Factory$Impl, moneybotChatHistoryPresenter$Factory$Impl, rawMessagesPresenter$Factory$Impl, moneybotPreambleEditorPresenter$Factory$Impl, moneybotHomePresenter$Factory$Impl, moneybotOverflowMenuPresenter$Factory$Impl, moneybotAutomationsPresenter$Factory$Impl, moneybotDebugOverlayPresenter$Factory$Impl, moneybotFeedbackPresenter$Factory$Impl, moneybotAmountInputPresenter$Factory$Impl, moneybotStaticPickerPresenter$Factory$Impl, moneybotTextInputPresenter$Factory$Impl);
                default:
                    RealPaymentManager realPaymentManager = (RealPaymentManager) provider11.invoke();
                    RealClientRouteParser realClientRouteParser = (RealClientRouteParser) provider10.invoke();
                    RealClientRouteToScreenMapping realClientRouteToScreenMapping = (RealClientRouteToScreenMapping) provider9.invoke();
                    ClientRoutesConfig clientRoutesConfig = (ClientRoutesConfig) provider8.invoke();
                    Analytics analytics2 = (Analytics) provider7.invoke();
                    LoadTimeClock loadTimeClock = (LoadTimeClock) provider6.invoke();
                    RealPaymentActionCompletionDispatcher realPaymentActionCompletionDispatcher = (RealPaymentActionCompletionDispatcher) provider5.invoke();
                    CoroutineScope coroutineScope3 = (CoroutineScope) instanceFactory.value;
                    CoroutineContext coroutineContext3 = (CoroutineContext) provider4.invoke();
                    Moshi moshi = (Moshi) provider3.invoke();
                    RealActivityPaymentManager2 realActivityPaymentManager2 = (RealActivityPaymentManager2) ((DoubleCheck) provider2).getValue();
                    realPaymentManager.getClass();
                    realClientRouteParser.getClass();
                    realClientRouteToScreenMapping.getClass();
                    Provider provider12 = this.contactDetailsSyncState;
                    provider12.getClass();
                    clientRoutesConfig.getClass();
                    analytics2.getClass();
                    loadTimeClock.getClass();
                    realPaymentActionCompletionDispatcher.getClass();
                    coroutineScope3.getClass();
                    coroutineContext3.getClass();
                    moshi.getClass();
                    realActivityPaymentManager2.getClass();
                    return new RealActivityPaymentManager(realPaymentManager, realClientRouteParser, realClientRouteToScreenMapping, provider12, clientRoutesConfig, analytics2, loadTimeClock, realPaymentActionCompletionDispatcher, coroutineScope3, coroutineContext3, moshi, realActivityPaymentManager2);
            }
        }

        public MetroFactory(DoubleCheck doubleCheck, DoubleCheck doubleCheck2, LambdaProvider lambdaProvider, LambdaProvider lambdaProvider2, MusicViewFactory$MetroFactory musicViewFactory$MetroFactory, RealMessageSigner.MetroFactory metroFactory, LambdaProvider lambdaProvider3, InstanceFactory instanceFactory, RealFileDownloader.MetroFactory metroFactory2, RealPasscodeFlowStarter.MetroFactory metroFactory3, RealPasscodeFlowStarter.MetroFactory metroFactory4, RealPasscodeFlowStarter.MetroFactory metroFactory5) {
            this.ioDispatcher = doubleCheck;
            this.contactSyncDetailsRepository = doubleCheck2;
            this.contactRepository = lambdaProvider;
            this.contactDetailsSyncState = lambdaProvider2;
            this.sessionManager = musicViewFactory$MetroFactory;
            this.eventsFactory = metroFactory;
            this.readContactsPermission = lambdaProvider3;
            this.scope = instanceFactory;
            this.contactsSyncState = metroFactory2;
            this.routinesFactory = metroFactory3;
            this.clock = metroFactory4;
            this.analytics = metroFactory5;
        }

        public MetroFactory(InstanceFactory instanceFactory, LambdaProvider lambdaProvider, InstanceFactory instanceFactory2, InstanceFactory instanceFactory3, FillrInitializer.MetroFactory metroFactory, RealSessionFlags.MetroFactory metroFactory2, RealContactDetailsSyncState.MetroFactory metroFactory3, LambdaProvider lambdaProvider2, LambdaProvider lambdaProvider3, DoubleCheck doubleCheck, LambdaProvider lambdaProvider4, DoubleCheck doubleCheck2) {
            this.scope = instanceFactory;
            this.ioDispatcher = lambdaProvider;
            this.eventsFactory = instanceFactory2;
            this.routinesFactory = instanceFactory3;
            this.contactSyncDetailsRepository = metroFactory;
            this.contactRepository = metroFactory2;
            this.contactDetailsSyncState = metroFactory3;
            this.sessionManager = lambdaProvider2;
            this.readContactsPermission = lambdaProvider3;
            this.contactsSyncState = doubleCheck;
            this.clock = lambdaProvider4;
            this.analytics = doubleCheck2;
        }

        public MetroFactory(InstanceFactory instanceFactory, InstanceFactory instanceFactory2, InstanceFactory instanceFactory3, InstanceFactory instanceFactory4, InstanceFactory instanceFactory5, InstanceFactory instanceFactory6, InstanceFactory instanceFactory7, InstanceFactory instanceFactory8, InstanceFactory instanceFactory9, InstanceFactory instanceFactory10, InstanceFactory instanceFactory11, InstanceFactory instanceFactory12) {
            this.scope = instanceFactory;
            this.eventsFactory = instanceFactory2;
            this.routinesFactory = instanceFactory3;
            this.ioDispatcher = instanceFactory4;
            this.contactSyncDetailsRepository = instanceFactory5;
            this.contactRepository = instanceFactory6;
            this.contactDetailsSyncState = instanceFactory7;
            this.sessionManager = instanceFactory8;
            this.readContactsPermission = instanceFactory9;
            this.contactsSyncState = instanceFactory10;
            this.clock = instanceFactory11;
            this.analytics = instanceFactory12;
        }
    }
}
