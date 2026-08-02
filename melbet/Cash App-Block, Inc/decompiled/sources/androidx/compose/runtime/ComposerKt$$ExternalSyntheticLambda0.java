package androidx.compose.runtime;

import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.foundation.content.internal.ReceiveContentConfigurationKt;
import androidx.compose.foundation.gestures.ScrollableNode;
import androidx.compose.foundation.gestures.ScrollableNode$setScrollSemanticsActions$1$1;
import androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.collection.ScatterSetWrapper;
import androidx.compose.runtime.internal.RememberEventDispatcher;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.platform.ClipEntry;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import app.cash.badging.backend.RealBadgingStateAccessibilityHelper;
import app.cash.broadway.presenter.Presenter;
import app.cash.broadway.presenter.molecule.MoleculePresenterKt;
import app.cash.molecule.PlatformKt;
import app.cash.versioned.Versioned;
import coil3.ImageLoader$Builder$$ExternalSyntheticLambda1;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.VariantSandboxedComponent;
import com.squareup.cash.account.components.accountswitcher.BadgeTitleKt;
import com.squareup.cash.account.types.SignedInState;
import com.squareup.cash.account.types.SignedInStateManager;
import com.squareup.cash.account.viewmodels.accountswitcher.AccountViewModel;
import com.squareup.cash.app.api.ContextKt$$ExternalSyntheticLambda0;
import com.squareup.cash.appmessages.presenters.RealInAppNotificationPresenter$Factory$Impl;
import com.squareup.cash.appmessages.presenters.RealTooltipAppMessagePresenter$Factory$Impl;
import com.squareup.cash.arcade.components.list.ListOrderedKt;
import com.squareup.cash.cashapplite.CashAppLiteReleaseModule$$ExternalSyntheticLambda0;
import com.squareup.cash.core.presenters.CorePresenterModule$$ExternalSyntheticLambda0;
import com.squareup.cash.core.presenters.MainScreensPresenter;
import com.squareup.cash.data.ClearAppUserDataApplicationWorker;
import com.squareup.cash.db.WireAdapter;
import com.squareup.cash.family.profileselection.real.RealFamilyProfileManager;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealSessionFlags;
import com.squareup.cash.instruments.backend.real.RealBalanceSnapshotManager;
import com.squareup.cash.money.privacy.RealBalancePrivacy;
import com.squareup.cash.moneybot.analytics.RealMoneybotAnalyticsService;
import com.squareup.cash.moneybot.backend.api.MoneybotFlagsHelper;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.session.backend.SessionState;
import com.squareup.cash.tabprovider.real.RealTabPublisher;
import com.squareup.cash.tabs.presenters.TabToolbarPresenter;
import com.squareup.cash.ui.MainActivity$$ExternalSyntheticLambda6;
import com.squareup.cash.ui.MainContainerDelegate;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.preferences.PreferenceFlow$flow$1;
import dev.zacsweers.metro.internal.InstanceFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.ChildHandle;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.internal.SafeCollector;
import kotlinx.coroutines.internal.ScopeCoroutine;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import retrofit2.OkHttpCall;

/* loaded from: classes.dex */
public final /* synthetic */ class ComposerKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ ComposerKt$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x004b, code lost:
    
        if (r3 == null) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0052  */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.lang.Object[], java.util.Set[]] */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.util.Collection] */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        ArrayList arrayList;
        char c = 7;
        int i = 14;
        boolean z = true;
        CancellableContinuation cancellableContinuation = null;
        Job job = null;
        r15 = null;
        r15 = null;
        r15 = null;
        SendChannel sendChannel = null;
        switch (this.$r8$classId) {
            case 0:
                RememberEventDispatcher rememberEventDispatcher = (RememberEventDispatcher) this.f$0;
                ((Integer) obj).getClass();
                if (obj2 instanceof ComposeNodeLifecycleCallback) {
                    ComposeNodeLifecycleCallback composeNodeLifecycleCallback = (ComposeNodeLifecycleCallback) obj2;
                    MutableScatterSet mutableScatterSet = (MutableScatterSet) rememberEventDispatcher.releasing;
                    if (mutableScatterSet == null) {
                        MutableScatterSet mutableScatterSet2 = ScatterSetKt.EmptyScatterSet;
                        mutableScatterSet = new MutableScatterSet();
                        rememberEventDispatcher.releasing = mutableScatterSet;
                    }
                    mutableScatterSet.plusAssign(composeNodeLifecycleCallback);
                    ((MutableVector) rememberEventDispatcher.leaving).add(composeNodeLifecycleCallback);
                }
                if (obj2 instanceof RememberObserverHolder) {
                    rememberEventDispatcher.forgetting((RememberObserverHolder) obj2);
                }
                if (obj2 instanceof RecomposeScopeImpl) {
                    ((RecomposeScopeImpl) obj2).release();
                }
                return Unit.INSTANCE;
            case 1:
                ScrollableNode scrollableNode = (ScrollableNode) this.f$0;
                JobKt.launch$default(scrollableNode.getCoroutineScope(), null, null, new ScrollableNode$setScrollSemanticsActions$1$1(scrollableNode, ((Float) obj).floatValue(), ((Float) obj2).floatValue(), null), 3);
                return Boolean.TRUE;
            case 2:
                return new IntOffset(((Alignment.Horizontal) this.f$0).align(0, (int) (((IntSize) obj).packedValue >> 32), (LayoutDirection) obj2) << 32);
            case 3:
                return new IntOffset(((BiasAlignment.Vertical) this.f$0).align(0, (int) (((IntSize) obj).packedValue & BodyPartID.bodyIdMax)) & BodyPartID.bodyIdMax);
            case 4:
                return new IntOffset(((Alignment) this.f$0).mo584alignKFBX0sM(0L, ((IntSize) obj).packedValue, (LayoutDirection) obj2));
            case 5:
                TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = (TextFieldDecoratorModifierNode) this.f$0;
                textFieldDecoratorModifierNode.emitDragExitEvent();
                textFieldDecoratorModifierNode.textFieldSelectionState.clearHandleDragging();
                String readPlainText = ListOrderedKt.readPlainText((ClipEntry) obj);
                ReceiveContentConfigurationKt.getReceiveContentConfiguration(textFieldDecoratorModifierNode);
                if (readPlainText != null) {
                    TransformedTextFieldState.replaceSelectedText$default(textFieldDecoratorModifierNode.textFieldState, readPlainText, false, 14);
                }
                return Boolean.TRUE;
            case 6:
                Recomposer recomposer = (Recomposer) this.f$0;
                Set set = (Set) obj;
                synchronized (recomposer.stateLock) {
                    try {
                        if (((Recomposer.State) recomposer._state.getValue()).compareTo(Recomposer.State.Idle) >= 0) {
                            MutableScatterSet mutableScatterSet3 = recomposer.snapshotInvalidations;
                            if (set instanceof ScatterSetWrapper) {
                                MutableScatterSet mutableScatterSet4 = ((ScatterSetWrapper) set).set;
                                Object[] objArr = mutableScatterSet4.elements;
                                long[] jArr = mutableScatterSet4.metadata;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i2 = 0;
                                    while (true) {
                                        long j = jArr[i2];
                                        if ((((~j) << c) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                                            for (int i4 = 0; i4 < i3; i4++) {
                                                if ((j & 255) < 128) {
                                                    Object obj3 = objArr[(i2 << 3) + i4];
                                                    if (!(obj3 instanceof StateObjectImpl) || ((StateObjectImpl) obj3).m582isReadInh_f27i8$runtime(1)) {
                                                        mutableScatterSet3.add(obj3);
                                                    }
                                                }
                                                j >>= 8;
                                            }
                                            if (i3 != 8) {
                                            }
                                        }
                                        if (i2 != length) {
                                            i2++;
                                            c = 7;
                                        }
                                    }
                                }
                            } else {
                                for (Object obj4 : set) {
                                    if (!(obj4 instanceof StateObjectImpl) || ((StateObjectImpl) obj4).m582isReadInh_f27i8$runtime(1)) {
                                        mutableScatterSet3.add(obj4);
                                    }
                                }
                            }
                            cancellableContinuation = recomposer.deriveStateLocked();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (cancellableContinuation != null) {
                    Result.Companion companion = Result.Companion;
                    ((CancellableContinuationImpl) cancellableContinuation).resumeWith(Unit.INSTANCE);
                }
                return Unit.INSTANCE;
            case 7:
                SingleSubscriptionSnapshotFlowManager singleSubscriptionSnapshotFlowManager = (SingleSubscriptionSnapshotFlowManager) this.f$0;
                Set set2 = (Set) obj;
                synchronized (singleSubscriptionSnapshotFlowManager.$$delegate_0) {
                    try {
                        MutableScatterSet mutableScatterSet5 = singleSubscriptionSnapshotFlowManager.watchSet;
                        if (mutableScatterSet5 != null) {
                            Object[] objArr2 = mutableScatterSet5.elements;
                            long[] jArr2 = mutableScatterSet5.metadata;
                            int length2 = jArr2.length - 2;
                            if (length2 >= 0) {
                                int i5 = 0;
                                while (true) {
                                    long j2 = jArr2[i5];
                                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i6 = 8 - ((~(i5 - length2)) >>> 31);
                                        int i7 = 0;
                                        while (true) {
                                            if (i7 < i6) {
                                                if ((j2 & 255) >= 128 || !set2.contains(objArr2[(i5 << 3) + i7])) {
                                                    j2 >>= 8;
                                                    i7++;
                                                } else {
                                                    sendChannel = singleSubscriptionSnapshotFlowManager.subscribedChannel;
                                                }
                                            } else if (i6 != 8) {
                                            }
                                        }
                                    }
                                    if (i5 != length2) {
                                        i5++;
                                    }
                                }
                            }
                        } else if (CollectionsKt.contains(set2, singleSubscriptionSnapshotFlowManager.soleWatchedObject)) {
                            sendChannel = singleSubscriptionSnapshotFlowManager.subscribedChannel;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (sendChannel != null) {
                    sendChannel.mo1159trySendJP2dKIU(Unit.INSTANCE);
                }
                return Unit.INSTANCE;
            case 8:
                SnapshotStateObserver snapshotStateObserver = (SnapshotStateObserver) this.f$0;
                Set set3 = (Set) obj;
                AtomicReference atomicReference = snapshotStateObserver.pendingChanges;
                while (true) {
                    Object obj5 = atomicReference.get();
                    if (obj5 == null) {
                        arrayList = set3;
                    } else if (obj5 instanceof Set) {
                        arrayList = CollectionsKt__CollectionsKt.listOf((Object[]) new Set[]{obj5, set3});
                    } else {
                        if (!(obj5 instanceof List)) {
                            ComposerKt.composeRuntimeError("Unexpected notification");
                            OptionalProvider$$ExternalSyntheticLambda0.m$1();
                            return null;
                        }
                        arrayList = CollectionsKt.plus((Iterable) CollectionsKt__CollectionsJVMKt.listOf(set3), (Collection) obj5);
                    }
                    while (!atomicReference.compareAndSet(obj5, arrayList)) {
                        if (atomicReference.get() != obj5) {
                            break;
                        }
                    }
                    if (snapshotStateObserver.drainChanges()) {
                        snapshotStateObserver.onChangedExecutor.invoke(new ImageLoader$Builder$$ExternalSyntheticLambda1(snapshotStateObserver, i));
                    }
                    return Unit.INSTANCE;
                    break;
                }
            case 9:
                AccountViewModel accountViewModel = (AccountViewModel) this.f$0;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    BadgeTitleKt.SwitchFullAccountLoadingContent(accountViewModel, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                SessionManager sessionManager = (SessionManager) this.f$0;
                Versioned versioned = (Versioned) obj;
                Versioned versioned2 = (Versioned) obj2;
                versioned.getClass();
                versioned2.getClass();
                Object obj6 = versioned.value;
                SignedInState signedInState = SignedInState.SIGNED_OUT;
                if (obj6 != signedInState || versioned2.value != signedInState) {
                    z = versioned.equals(versioned2);
                } else if ((PlatformKt.getCurrentSessionState(sessionManager) instanceof SessionState.Initiated) && !(PlatformKt.getCurrentSessionState(sessionManager) instanceof SessionState.Authenticated)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 11:
                MainContainerDelegate mainContainerDelegate = (MainContainerDelegate) this.f$0;
                CoroutineScope coroutineScope = (CoroutineScope) obj;
                CorePresenterModule$$ExternalSyntheticLambda0 corePresenterModule$$ExternalSyntheticLambda0 = (CorePresenterModule$$ExternalSyntheticLambda0) obj2;
                coroutineScope.getClass();
                if (corePresenterModule$$ExternalSyntheticLambda0 == null) {
                    return null;
                }
                MainActivity$$ExternalSyntheticLambda6 mainActivity$$ExternalSyntheticLambda6 = mainContainerDelegate.navigator;
                WireAdapter wireAdapter = corePresenterModule$$ExternalSyntheticLambda0.f$0;
                mainActivity$$ExternalSyntheticLambda6.getClass();
                TabToolbarPresenter.MetroFactory metroFactory = (TabToolbarPresenter.MetroFactory) wireAdapter.adapter;
                RealBadgingStateAccessibilityHelper realBadgingStateAccessibilityHelper = (RealBadgingStateAccessibilityHelper) metroFactory.sessionManager.invoke();
                RealBalanceSnapshotManager realBalanceSnapshotManager = (RealBalanceSnapshotManager) metroFactory.profileManager.invoke();
                RealInAppNotificationPresenter$Factory$Impl realInAppNotificationPresenter$Factory$Impl = (RealInAppNotificationPresenter$Factory$Impl) ((InstanceFactory) metroFactory.tabToolbarOutboundNavigatorFactory).value;
                RealTooltipAppMessagePresenter$Factory$Impl realTooltipAppMessagePresenter$Factory$Impl = (RealTooltipAppMessagePresenter$Factory$Impl) ((InstanceFactory) metroFactory.balanceSnapshotManager).value;
                FeatureFlagManager featureFlagManager = (FeatureFlagManager) metroFactory.badges.invoke();
                RealMoneybotAnalyticsService realMoneybotAnalyticsService = (RealMoneybotAnalyticsService) metroFactory.badger2.invoke();
                MoneybotFlagsHelper moneybotFlagsHelper = (MoneybotFlagsHelper) metroFactory.featureFlagManager.invoke();
                LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) metroFactory.bitcoinCapabilityProvider.invoke();
                SignedInStateManager signedInStateManager = (SignedInStateManager) metroFactory.badgingStateAccessibilityHelper.invoke();
                AndroidStringManager androidStringManager = (AndroidStringManager) metroFactory.moneybotFlagsHelper.invoke();
                Flow flow = (Flow) metroFactory.moneybotAnalyticsService.invoke();
                RealSessionFlags realSessionFlags = (RealSessionFlags) metroFactory.sessionFlags.invoke();
                OkHttpCall.AnonymousClass1 anonymousClass1 = (OkHttpCall.AnonymousClass1) ((RealCashVibrator.MetroFactory) metroFactory.moneyFormatterFactory).invoke();
                RealTabPublisher realTabPublisher = (RealTabPublisher) metroFactory.syncValueReader.invoke();
                RealBalancePrivacy realBalancePrivacy = (RealBalancePrivacy) metroFactory.p2pSettingsManager.invoke();
                CashAppLiteReleaseModule$$ExternalSyntheticLambda0 cashAppLiteReleaseModule$$ExternalSyntheticLambda0 = (CashAppLiteReleaseModule$$ExternalSyntheticLambda0) metroFactory.familyNavigatorFactory.invoke();
                RealFamilyProfileManager realFamilyProfileManager = (RealFamilyProfileManager) metroFactory.familyProfileManager.invoke();
                realBadgingStateAccessibilityHelper.getClass();
                realBalanceSnapshotManager.getClass();
                realInAppNotificationPresenter$Factory$Impl.getClass();
                realTooltipAppMessagePresenter$Factory$Impl.getClass();
                featureFlagManager.getClass();
                realMoneybotAnalyticsService.getClass();
                moneybotFlagsHelper.getClass();
                factory.getClass();
                signedInStateManager.getClass();
                androidStringManager.getClass();
                flow.getClass();
                realSessionFlags.getClass();
                realTabPublisher.getClass();
                realBalancePrivacy.getClass();
                cashAppLiteReleaseModule$$ExternalSyntheticLambda0.getClass();
                realFamilyProfileManager.getClass();
                return Presenter.start$default(MoleculePresenterKt.asPresenter$default(new MainScreensPresenter(realBadgingStateAccessibilityHelper, realBalanceSnapshotManager, realInAppNotificationPresenter$Factory$Impl, realTooltipAppMessagePresenter$Factory$Impl, featureFlagManager, realMoneybotAnalyticsService, moneybotFlagsHelper, factory, signedInStateManager, androidStringManager, flow, realSessionFlags, anonymousClass1, realTabPublisher, realBalancePrivacy, cashAppLiteReleaseModule$$ExternalSyntheticLambda0, realFamilyProfileManager, mainActivity$$ExternalSyntheticLambda6)), coroutineScope, mainContainerDelegate.activityLifecycleOwner);
            case 12:
                JobKt.launch$default((CoroutineScope) obj, null, null, new PreferenceFlow$flow$1((VariantSandboxedComponent) obj2, (ClearAppUserDataApplicationWorker) this.f$0, cancellableContinuation, 12), 3);
                return Unit.INSTANCE;
            case 13:
                ContextKt$$ExternalSyntheticLambda0 contextKt$$ExternalSyntheticLambda0 = (ContextKt$$ExternalSyntheticLambda0) this.f$0;
                CoroutineScope coroutineScope2 = (CoroutineScope) obj;
                coroutineScope2.getClass();
                contextKt$$ExternalSyntheticLambda0.invoke(coroutineScope2, obj2);
                return Unit.INSTANCE;
            default:
                SafeCollector safeCollector = (SafeCollector) this.f$0;
                int intValue2 = ((Integer) obj).intValue();
                CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                CoroutineContext.Key key = element.getKey();
                CoroutineContext.Element element2 = safeCollector.collectContext.get(key);
                if (key != Job.Key.$$INSTANCE) {
                    if (element != element2) {
                        intValue2 = PKIFailureInfo.systemUnavail;
                    }
                    intValue2++;
                } else {
                    Job job2 = (Job) element2;
                    Job job3 = (Job) element;
                    while (job3 != null) {
                        if (job3 != job2 && (job3 instanceof ScopeCoroutine)) {
                            ChildHandle parentHandle$kotlinx_coroutines_core = ((ScopeCoroutine) job3).getParentHandle$kotlinx_coroutines_core();
                            job3 = parentHandle$kotlinx_coroutines_core != null ? parentHandle$kotlinx_coroutines_core.getParent() : null;
                        } else {
                            job = job3;
                            if (job == job2) {
                                throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + job + ", expected child of " + job2 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                            }
                        }
                    }
                    if (job == job2) {
                    }
                }
                return Integer.valueOf(intValue2);
        }
    }
}
