package com.squareup.cash.session.backend;

import app.cash.cdp.integration.CdpModule$Companion$$ExternalSyntheticLambda0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.arcade.ArcadeModule$ProvideHapticVibratorMetroFactory;
import com.squareup.cash.borrow.views.BorrowUiFactory;
import com.squareup.cash.cdf.account.AccountCleanupCleanupCompleted;
import com.squareup.cash.cdf.account.AccountCleanupCleanupStarted;
import com.squareup.cash.cdf.account.CleanupStyle;
import com.squareup.cash.clipboard.RealClipboardManager;
import com.squareup.cash.data.contacts.RealContactDetailsSyncState;
import com.squareup.cash.e2ee.trifle.RealTrifleService;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.intent.RealDeepLinking;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.storage.SandboxJanitor;
import com.squareup.cash.treehouse.android.configuration.TreehouseStartupSetupTeardown;
import com.squareup.cash.ui.BreadcrumbListener;
import com.squareup.cash.ui.BroadwayModule$ProvideBroadwayMetroFactory;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.util.RealDrawerOpener$MetroFactory;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import java.util.Iterator;
import java.util.List;
import kotlin.Function;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealOnSessionChangeActionsExecutor {
    public final Analytics analytics;
    public final CdpModule$Companion$$ExternalSyntheticLambda0 clearDeferredDeepLinkOnSignOut;
    public final OnAccountTeardownAction deferredDeepLinkOnAccountTeardownAction;
    public final List onAccountTeardownActions;
    public final List onSignOutActions;

    /* renamed from: com.squareup.cash.session.backend.RealOnSessionChangeActionsExecutor$1, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass1 implements OnSignOutAction, FunctionAdapter {
        public final /* synthetic */ SessionManager $tmp0;

        public AnonymousClass1(SessionManager sessionManager) {
            this.$tmp0 = sessionManager;
        }

        @Override // com.squareup.cash.session.backend.OnSignOutAction
        public final Object clearData(SessionManager.DeletionMode deletionMode, RealOnSessionChangeActionsExecutor$executeSignOut$1 realOnSessionChangeActionsExecutor$executeSignOut$1) {
            Object delete = this.$tmp0.delete(deletionMode, realOnSessionChangeActionsExecutor$executeSignOut$1);
            return delete == CoroutineSingletons.COROUTINE_SUSPENDED ? delete : Unit.INSTANCE;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof OnSignOutAction) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function getFunctionDelegate() {
            return new FunctionReferenceImpl(2, 0, SessionManager.class, this.$tmp0, "delete", "delete(Lcom/squareup/cash/session/backend/SessionManager$DeletionMode;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    public final class MetroFactory implements Factory {
        public final RealClipboardManager.MetroFactory activityViewedOnSignOutAction;
        public final Provider analytics;
        public final BorrowUiFactory.MetroFactory boostOnSignOutAction;
        public final BroadwayModule$ProvideBroadwayMetroFactory chatSessionOnSignOutAction;
        public final RealTrifleService.MetroFactory clientSyncOnSignOutAction;
        public final IntentLauncher.MetroFactory contactSyncOnSignOutAction;
        public final RealDrawerOpener$MetroFactory cookieManagerOnAccountTeardownAction;
        public final ArcadeModule$ProvideHapticVibratorMetroFactory deferredDeepLinkOnAccountTeardownAction;
        public final RealDeepLinking.MetroFactory encryptionEngineOnSignOutAction;
        public final IntentLauncher.MetroFactory fileDownloaderOnSignOutAction;
        public final BreadcrumbListener.MetroFactory gcmOnSignoutAction;
        public final RealContactDetailsSyncState.MetroFactory moneyTabStateOnSignOutAction;
        public final IntentLauncher.MetroFactory passcodeSecureStoreOnSignOutAction;
        public final ArcadeModule$ProvideHapticVibratorMetroFactory passwordSecureStoreOnSignOutAction;
        public final RealContactDetailsSyncState.MetroFactory profileQueriesOnSignOutAction;
        public final IntentLauncher.MetroFactory referralManagerOnSignOutAction;
        public final Provider sessionManager;
        public final RealCashVibrator.MetroFactory supportOnSignOutAction;
        public final IntentLauncher.MetroFactory themeSwitcherSignOutAction;
        public final TreehouseStartupSetupTeardown.MetroFactory treehouseAppsOnAccountTeardownAction;
        public final SandboxJanitor.MetroFactory treehouseAppsOnSignOutAction;
        public final RealDrawerOpener$MetroFactory walletLastViewedPageOnSignOutAction;

        public MetroFactory(BorrowUiFactory.MetroFactory metroFactory, RealDeepLinking.MetroFactory metroFactory2, RealCashVibrator.MetroFactory metroFactory3, IntentLauncher.MetroFactory metroFactory4, IntentLauncher.MetroFactory metroFactory5, BroadwayModule$ProvideBroadwayMetroFactory broadwayModule$ProvideBroadwayMetroFactory, IntentLauncher.MetroFactory metroFactory6, ArcadeModule$ProvideHapticVibratorMetroFactory arcadeModule$ProvideHapticVibratorMetroFactory, RealContactDetailsSyncState.MetroFactory metroFactory7, IntentLauncher.MetroFactory metroFactory8, RealClipboardManager.MetroFactory metroFactory9, IntentLauncher.MetroFactory metroFactory10, SandboxJanitor.MetroFactory metroFactory11, RealTrifleService.MetroFactory metroFactory12, RealContactDetailsSyncState.MetroFactory metroFactory13, RealDrawerOpener$MetroFactory realDrawerOpener$MetroFactory, BreadcrumbListener.MetroFactory metroFactory14, ArcadeModule$ProvideHapticVibratorMetroFactory arcadeModule$ProvideHapticVibratorMetroFactory2, RealDrawerOpener$MetroFactory realDrawerOpener$MetroFactory2, TreehouseStartupSetupTeardown.MetroFactory metroFactory15, LambdaProvider lambdaProvider, DoubleCheck doubleCheck) {
            this.boostOnSignOutAction = metroFactory;
            this.encryptionEngineOnSignOutAction = metroFactory2;
            this.supportOnSignOutAction = metroFactory3;
            this.contactSyncOnSignOutAction = metroFactory4;
            this.themeSwitcherSignOutAction = metroFactory5;
            this.chatSessionOnSignOutAction = broadwayModule$ProvideBroadwayMetroFactory;
            this.passcodeSecureStoreOnSignOutAction = metroFactory6;
            this.passwordSecureStoreOnSignOutAction = arcadeModule$ProvideHapticVibratorMetroFactory;
            this.profileQueriesOnSignOutAction = metroFactory7;
            this.fileDownloaderOnSignOutAction = metroFactory8;
            this.activityViewedOnSignOutAction = metroFactory9;
            this.referralManagerOnSignOutAction = metroFactory10;
            this.treehouseAppsOnSignOutAction = metroFactory11;
            this.clientSyncOnSignOutAction = metroFactory12;
            this.moneyTabStateOnSignOutAction = metroFactory13;
            this.walletLastViewedPageOnSignOutAction = realDrawerOpener$MetroFactory;
            this.gcmOnSignoutAction = metroFactory14;
            this.deferredDeepLinkOnAccountTeardownAction = arcadeModule$ProvideHapticVibratorMetroFactory2;
            this.cookieManagerOnAccountTeardownAction = realDrawerOpener$MetroFactory2;
            this.treehouseAppsOnAccountTeardownAction = metroFactory15;
            this.sessionManager = lambdaProvider;
            this.analytics = doubleCheck;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            OnSignOutAction onSignOutAction = (OnSignOutAction) this.boostOnSignOutAction.invoke();
            OnSignOutAction onSignOutAction2 = (OnSignOutAction) this.encryptionEngineOnSignOutAction.invoke();
            OnSignOutAction onSignOutAction3 = (OnSignOutAction) this.supportOnSignOutAction.invoke();
            OnSignOutAction onSignOutAction4 = (OnSignOutAction) this.contactSyncOnSignOutAction.invoke();
            OnSignOutAction onSignOutAction5 = (OnSignOutAction) this.themeSwitcherSignOutAction.invoke();
            OnSignOutAction onSignOutAction6 = (OnSignOutAction) this.chatSessionOnSignOutAction.invoke();
            OnSignOutAction onSignOutAction7 = (OnSignOutAction) this.passcodeSecureStoreOnSignOutAction.invoke();
            OnSignOutAction onSignOutAction8 = (OnSignOutAction) this.passwordSecureStoreOnSignOutAction.invoke();
            OnSignOutAction onSignOutAction9 = (OnSignOutAction) this.profileQueriesOnSignOutAction.invoke();
            OnSignOutAction onSignOutAction10 = (OnSignOutAction) this.fileDownloaderOnSignOutAction.invoke();
            OnSignOutAction onSignOutAction11 = (OnSignOutAction) this.activityViewedOnSignOutAction.invoke();
            OnSignOutAction onSignOutAction12 = (OnSignOutAction) this.referralManagerOnSignOutAction.invoke();
            OnSignOutAction onSignOutAction13 = (OnSignOutAction) this.treehouseAppsOnSignOutAction.invoke();
            OnSignOutAction onSignOutAction14 = (OnSignOutAction) this.clientSyncOnSignOutAction.invoke();
            OnSignOutAction onSignOutAction15 = (OnSignOutAction) this.moneyTabStateOnSignOutAction.invoke();
            OnSignOutAction onSignOutAction16 = (OnSignOutAction) this.walletLastViewedPageOnSignOutAction.invoke();
            OnSignOutAction onSignOutAction17 = (OnSignOutAction) this.gcmOnSignoutAction.invoke();
            OnAccountTeardownAction onAccountTeardownAction = (OnAccountTeardownAction) this.deferredDeepLinkOnAccountTeardownAction.invoke();
            OnAccountTeardownAction onAccountTeardownAction2 = (OnAccountTeardownAction) this.cookieManagerOnAccountTeardownAction.invoke();
            OnAccountTeardownAction onAccountTeardownAction3 = (OnAccountTeardownAction) this.treehouseAppsOnAccountTeardownAction.invoke();
            SessionManager sessionManager = (SessionManager) this.sessionManager.invoke();
            Analytics analytics = (Analytics) this.analytics.invoke();
            sessionManager.getClass();
            analytics.getClass();
            return new RealOnSessionChangeActionsExecutor(onSignOutAction, onSignOutAction2, onSignOutAction3, onSignOutAction4, onSignOutAction5, onSignOutAction6, onSignOutAction7, onSignOutAction8, onSignOutAction9, onSignOutAction10, onSignOutAction11, onSignOutAction12, onSignOutAction13, onSignOutAction14, onSignOutAction15, onSignOutAction16, onSignOutAction17, onAccountTeardownAction, onAccountTeardownAction2, onAccountTeardownAction3, sessionManager, analytics);
        }
    }

    public RealOnSessionChangeActionsExecutor(OnSignOutAction onSignOutAction, OnSignOutAction onSignOutAction2, OnSignOutAction onSignOutAction3, OnSignOutAction onSignOutAction4, OnSignOutAction onSignOutAction5, OnSignOutAction onSignOutAction6, OnSignOutAction onSignOutAction7, OnSignOutAction onSignOutAction8, OnSignOutAction onSignOutAction9, OnSignOutAction onSignOutAction10, OnSignOutAction onSignOutAction11, OnSignOutAction onSignOutAction12, OnSignOutAction onSignOutAction13, OnSignOutAction onSignOutAction14, OnSignOutAction onSignOutAction15, OnSignOutAction onSignOutAction16, OnSignOutAction onSignOutAction17, OnAccountTeardownAction onAccountTeardownAction, OnAccountTeardownAction onAccountTeardownAction2, OnAccountTeardownAction onAccountTeardownAction3, SessionManager sessionManager, Analytics analytics) {
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new OnSignOutAction[]{new AnonymousClass1(sessionManager), onSignOutAction, onSignOutAction2, onSignOutAction3, onSignOutAction4, onSignOutAction5, onSignOutAction6, onSignOutAction7, onSignOutAction8, onSignOutAction9, onSignOutAction10, onSignOutAction12, onSignOutAction11, onSignOutAction13, onSignOutAction14, onSignOutAction15, onSignOutAction16, onSignOutAction17});
        List listOf2 = CollectionsKt__CollectionsKt.listOf((Object[]) new OnAccountTeardownAction[]{onAccountTeardownAction2, onAccountTeardownAction3});
        CdpModule$Companion$$ExternalSyntheticLambda0 cdpModule$Companion$$ExternalSyntheticLambda0 = new CdpModule$Companion$$ExternalSyntheticLambda0(sessionManager, 1);
        listOf.getClass();
        listOf2.getClass();
        this.onSignOutActions = listOf;
        this.onAccountTeardownActions = listOf2;
        this.deferredDeepLinkOnAccountTeardownAction = onAccountTeardownAction;
        this.clearDeferredDeepLinkOnSignOut = cdpModule$Companion$$ExternalSyntheticLambda0;
        this.analytics = analytics;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0050, code lost:
    
        if (r7.deferredDeepLinkOnAccountTeardownAction.clearData(r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object executeAccountSwitch(ContinuationImpl continuationImpl) {
        RealOnSessionChangeActionsExecutor$executeAccountSwitch$1 realOnSessionChangeActionsExecutor$executeAccountSwitch$1;
        int i;
        Iterator it;
        int i2;
        if (continuationImpl instanceof RealOnSessionChangeActionsExecutor$executeAccountSwitch$1) {
            realOnSessionChangeActionsExecutor$executeAccountSwitch$1 = (RealOnSessionChangeActionsExecutor$executeAccountSwitch$1) continuationImpl;
            int i3 = realOnSessionChangeActionsExecutor$executeAccountSwitch$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                realOnSessionChangeActionsExecutor$executeAccountSwitch$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj = realOnSessionChangeActionsExecutor$executeAccountSwitch$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realOnSessionChangeActionsExecutor$executeAccountSwitch$1.label;
                Analytics analytics = this.analytics;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    analytics.track(new AccountCleanupCleanupStarted(CleanupStyle.ACCOUNT_SWITCH), null);
                    realOnSessionChangeActionsExecutor$executeAccountSwitch$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i2 = realOnSessionChangeActionsExecutor$executeAccountSwitch$1.I$0;
                        it = realOnSessionChangeActionsExecutor$executeAccountSwitch$1.L$1;
                        SafeTrace.throwOnFailure(obj);
                        while (it.hasNext()) {
                            OnAccountTeardownAction onAccountTeardownAction = (OnAccountTeardownAction) it.next();
                            realOnSessionChangeActionsExecutor$executeAccountSwitch$1.L$1 = it;
                            realOnSessionChangeActionsExecutor$executeAccountSwitch$1.I$0 = i2;
                            realOnSessionChangeActionsExecutor$executeAccountSwitch$1.label = 2;
                            if (onAccountTeardownAction.clearData(realOnSessionChangeActionsExecutor$executeAccountSwitch$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                        analytics.track(new AccountCleanupCleanupCompleted(CleanupStyle.ACCOUNT_SWITCH), null);
                        return Unit.INSTANCE;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                it = this.onAccountTeardownActions.iterator();
                i2 = 0;
                while (it.hasNext()) {
                }
                analytics.track(new AccountCleanupCleanupCompleted(CleanupStyle.ACCOUNT_SWITCH), null);
                return Unit.INSTANCE;
            }
        }
        realOnSessionChangeActionsExecutor$executeAccountSwitch$1 = new RealOnSessionChangeActionsExecutor$executeAccountSwitch$1(this, continuationImpl);
        Object obj2 = realOnSessionChangeActionsExecutor$executeAccountSwitch$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realOnSessionChangeActionsExecutor$executeAccountSwitch$1.label;
        Analytics analytics2 = this.analytics;
        if (i != 0) {
        }
        it = this.onAccountTeardownActions.iterator();
        i2 = 0;
        while (it.hasNext()) {
        }
        analytics2.track(new AccountCleanupCleanupCompleted(CleanupStyle.ACCOUNT_SWITCH), null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object executeSignOut(SessionManager.DeletionMode deletionMode, ContinuationImpl continuationImpl) {
        RealOnSessionChangeActionsExecutor$executeSignOut$1 realOnSessionChangeActionsExecutor$executeSignOut$1;
        int i;
        SessionManager.DeletionMode deletionMode2;
        boolean z;
        Iterator it;
        RealOnSessionChangeActionsExecutor$executeSignOut$1 realOnSessionChangeActionsExecutor$executeSignOut$12;
        int i2;
        Iterator it2;
        if (continuationImpl instanceof RealOnSessionChangeActionsExecutor$executeSignOut$1) {
            realOnSessionChangeActionsExecutor$executeSignOut$1 = (RealOnSessionChangeActionsExecutor$executeSignOut$1) continuationImpl;
            int i3 = realOnSessionChangeActionsExecutor$executeSignOut$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                realOnSessionChangeActionsExecutor$executeSignOut$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj = realOnSessionChangeActionsExecutor$executeSignOut$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realOnSessionChangeActionsExecutor$executeSignOut$1.label;
                Analytics analytics = this.analytics;
                int i4 = 0;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    boolean booleanValue = ((Boolean) this.clearDeferredDeepLinkOnSignOut.invoke()).booleanValue();
                    analytics.track(new AccountCleanupCleanupStarted(CleanupStyle.FULL), null);
                    deletionMode2 = deletionMode;
                    z = booleanValue;
                    it = this.onSignOutActions.iterator();
                    realOnSessionChangeActionsExecutor$executeSignOut$12 = realOnSessionChangeActionsExecutor$executeSignOut$1;
                    i2 = 0;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            z = realOnSessionChangeActionsExecutor$executeSignOut$1.Z$0;
                            SafeTrace.throwOnFailure(obj);
                            realOnSessionChangeActionsExecutor$executeSignOut$12 = realOnSessionChangeActionsExecutor$executeSignOut$1;
                            realOnSessionChangeActionsExecutor$executeSignOut$1 = realOnSessionChangeActionsExecutor$executeSignOut$12;
                            it2 = this.onAccountTeardownActions.iterator();
                            while (it2.hasNext()) {
                            }
                            analytics.track(new AccountCleanupCleanupCompleted(CleanupStyle.FULL), null);
                            return Unit.INSTANCE;
                        }
                        if (i != 3) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        int i5 = realOnSessionChangeActionsExecutor$executeSignOut$1.I$0;
                        z = realOnSessionChangeActionsExecutor$executeSignOut$1.Z$0;
                        it2 = realOnSessionChangeActionsExecutor$executeSignOut$1.L$2;
                        SafeTrace.throwOnFailure(obj);
                        i4 = i5;
                        while (it2.hasNext()) {
                            OnAccountTeardownAction onAccountTeardownAction = (OnAccountTeardownAction) it2.next();
                            realOnSessionChangeActionsExecutor$executeSignOut$1.L$0 = null;
                            realOnSessionChangeActionsExecutor$executeSignOut$1.L$2 = it2;
                            realOnSessionChangeActionsExecutor$executeSignOut$1.Z$0 = z;
                            realOnSessionChangeActionsExecutor$executeSignOut$1.I$0 = i4;
                            realOnSessionChangeActionsExecutor$executeSignOut$1.label = 3;
                            if (onAccountTeardownAction.clearData(realOnSessionChangeActionsExecutor$executeSignOut$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                        analytics.track(new AccountCleanupCleanupCompleted(CleanupStyle.FULL), null);
                        return Unit.INSTANCE;
                    }
                    int i6 = realOnSessionChangeActionsExecutor$executeSignOut$1.I$0;
                    boolean z2 = realOnSessionChangeActionsExecutor$executeSignOut$1.Z$0;
                    it = realOnSessionChangeActionsExecutor$executeSignOut$1.L$2;
                    SessionManager.DeletionMode deletionMode3 = realOnSessionChangeActionsExecutor$executeSignOut$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    RealOnSessionChangeActionsExecutor$executeSignOut$1 realOnSessionChangeActionsExecutor$executeSignOut$13 = realOnSessionChangeActionsExecutor$executeSignOut$1;
                    i2 = i6;
                    z = z2;
                    realOnSessionChangeActionsExecutor$executeSignOut$12 = realOnSessionChangeActionsExecutor$executeSignOut$13;
                    deletionMode2 = deletionMode3;
                }
                while (true) {
                    if (!it.hasNext()) {
                        OnSignOutAction onSignOutAction = (OnSignOutAction) it.next();
                        realOnSessionChangeActionsExecutor$executeSignOut$12.L$0 = deletionMode2;
                        realOnSessionChangeActionsExecutor$executeSignOut$12.L$2 = it;
                        realOnSessionChangeActionsExecutor$executeSignOut$12.Z$0 = z;
                        realOnSessionChangeActionsExecutor$executeSignOut$12.I$0 = i2;
                        realOnSessionChangeActionsExecutor$executeSignOut$12.label = 1;
                        if (onSignOutAction.clearData(deletionMode2, realOnSessionChangeActionsExecutor$executeSignOut$12) == coroutineSingletons) {
                            break;
                        }
                    } else if (z) {
                        realOnSessionChangeActionsExecutor$executeSignOut$12.L$0 = null;
                        realOnSessionChangeActionsExecutor$executeSignOut$12.L$2 = null;
                        realOnSessionChangeActionsExecutor$executeSignOut$12.Z$0 = z;
                        realOnSessionChangeActionsExecutor$executeSignOut$12.label = 2;
                        if (this.deferredDeepLinkOnAccountTeardownAction.clearData(realOnSessionChangeActionsExecutor$executeSignOut$12) != coroutineSingletons) {
                            realOnSessionChangeActionsExecutor$executeSignOut$1 = realOnSessionChangeActionsExecutor$executeSignOut$12;
                        }
                    }
                }
                return coroutineSingletons;
            }
        }
        realOnSessionChangeActionsExecutor$executeSignOut$1 = new RealOnSessionChangeActionsExecutor$executeSignOut$1(this, continuationImpl);
        Object obj2 = realOnSessionChangeActionsExecutor$executeSignOut$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realOnSessionChangeActionsExecutor$executeSignOut$1.label;
        Analytics analytics2 = this.analytics;
        int i42 = 0;
        if (i != 0) {
        }
        while (true) {
            if (!it.hasNext()) {
            }
        }
        return coroutineSingletons2;
    }
}
