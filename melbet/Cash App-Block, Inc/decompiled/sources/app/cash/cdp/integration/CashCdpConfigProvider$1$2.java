package app.cash.cdp.integration;

import android.app.ActivityManager;
import android.content.Context;
import androidx.camera.camera2.impl.FlashControl$applyScreenFlash$3;
import androidx.camera.core.CameraX$$ExternalSyntheticLambda0;
import androidx.camera.core.impl.CameraCaptureCallbacks;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.Transition$animateTo$1$1$1;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2;
import androidx.compose.foundation.interaction.DragInteraction$Cancel;
import androidx.compose.foundation.interaction.DragInteraction$Start;
import androidx.compose.foundation.interaction.DragInteraction$Stop;
import androidx.compose.foundation.interaction.FocusInteraction$Focus;
import androidx.compose.foundation.interaction.FocusInteraction$Unfocus;
import androidx.compose.foundation.interaction.HoverInteraction$Enter;
import androidx.compose.foundation.interaction.HoverInteraction$Exit;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28;
import androidx.compose.material.ripple.AndroidRippleNode;
import androidx.compose.material.ripple.RippleAlpha;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.lifecycle.Lifecycle;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.paging.PageFetcher$flow$1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.Constraints;
import androidx.work.ExistingWorkPolicy;
import androidx.work.NetworkType;
import androidx.work.impl.constraints.ConstraintsState;
import androidx.work.impl.constraints.OnConstraintsStateChangedListener;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.NetworkRequestCompat;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.broadway.ui.LifecyclesKt;
import app.cash.cdp.api.FlushStrategy;
import app.cash.cdp.api.FlushTrigger;
import app.cash.cdp.backend.android.BatchUploadWorker;
import app.cash.cdp.backend.jvm.FlushStrategyCoordinator;
import app.cash.molecule.PlatformKt;
import app.cash.passcode.backend.AppLockMonitor;
import app.cash.passcode.backend.AppLockMonitor$appLockLoop$2$emit$1;
import app.cash.passcode.backend.AppLockMonitor$setup$lambda$0$$inlined$mapNotNull$1$2$1;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import app.cash.passcode.backend.RealAppLockState;
import app.cash.zipline.loader.ZiplineLoader$ModuleJob$run$3;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.memory.MemoryCacheService;
import coil3.size.DimensionKt;
import coil3.size.SizeKt;
import coil3.util.AndroidSystemCallbacks;
import com.google.android.filament.Filament;
import com.google.android.gms.internal.mlkit_vision_common.zzjm;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.R;
import com.squareup.cash.account.types.SignedInState;
import com.squareup.cash.account.types.SignedInStateManager;
import com.squareup.cash.aiedge.MLKitTitleGenerator$prepareModel$1;
import com.squareup.cash.appforeground.AppForegroundState;
import com.squareup.cash.appmessages.AppMessageImage;
import com.squareup.cash.appmessages.AppMessageImage$Animated$Asset$Url;
import com.squareup.cash.appmessages.AppMessageSyncer;
import com.squareup.cash.appmessages.AppMessageSyncer$setup$lambda$0$$inlined$filter$2$2$1;
import com.squareup.cash.appmessages.AppMessageViewEvent;
import com.squareup.cash.appmessages.InAppNotificationModel;
import com.squareup.cash.appmessages.TooltipAppMessageViewEvent;
import com.squareup.cash.appmessages.badging.AppMessageBadgeCounter$collect$suspendImpl$$inlined$map$3$2$1;
import com.squareup.cash.appmessages.badging.CardTabBadgeCounter;
import com.squareup.cash.appmessages.db.InAppNotificationMessage;
import com.squareup.cash.appmessages.db.SheetMessage;
import com.squareup.cash.appmessages.presenters.RealInAppNotificationPresenter;
import com.squareup.cash.appmessages.presenters.RealInAppNotificationPresenter$generateModel$$inlined$map$1$2$1;
import com.squareup.cash.appmessages.presenters.RealTooltipAppMessagePresenter;
import com.squareup.cash.appmessages.presenters.RealTooltipAppMessagePresenter$models$2$1;
import com.squareup.cash.arcade.treehouse.SearchBarBinding$Content$1$1;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.cdf.app.AppLifecycleBackground;
import com.squareup.cash.cdf.app.AppLifecycleForeground;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.clientsync.errors.RealClientSyncErrorReporter;
import com.squareup.cash.clientsync.errors.SyncValuesWithoutType;
import com.squareup.cash.clientsync.models.SyncEntity;
import com.squareup.cash.clientsync.models.SyncValueType;
import com.squareup.cash.clientsync.readers.RealSyncValueReader;
import com.squareup.cash.clientsync.readers.RealSyncValueReader$special$$inlined$map$1$2$1;
import com.squareup.cash.core.navigationcontainer.PaymentActionResult;
import com.squareup.cash.core.navigationcontainer.models.NavigationModel;
import com.squareup.cash.db2.profile.SingleAccountHolderEligibility;
import com.squareup.cash.eligibility.backend.api.AccountSettingType$IdvSettings;
import com.squareup.cash.eligibility.backend.api.EligibleFeature;
import com.squareup.cash.eligibility.backend.api.SettingsEligibilityManager$AccountSettingsResult;
import com.squareup.cash.eligibility.backend.real.RealFeatureEligibilityRepository;
import com.squareup.cash.eligibility.backend.real.RealFeatureEligibilityRepository$currentEligibleFeatures$$inlined$map$1$2$1;
import com.squareup.cash.eligibility.backend.real.RealFeatureEligibilityRepository$isEligible$$inlined$map$1$2$1;
import com.squareup.cash.eligibility.backend.real.RealSettingsEligibilityManager;
import com.squareup.cash.featureflags.FeatureFlag$StringFeatureFlag$Value;
import com.squareup.cash.filament.RealFilamentSupportProvider;
import com.squareup.cash.filament.RealFilamentSupportProvider$special$$inlined$map$1$2$1;
import com.squareup.cash.formview.components.FormCashtag$8$invokeSuspend$$inlined$map$1;
import com.squareup.cash.history.navigation.PaymentActionHandler;
import com.squareup.cash.history.navigation.PaymentActionHandler$transform$$inlined$filter$1;
import com.squareup.cash.history.navigation.PaymentActionHandler$transform$$inlined$flatMapLatest$2;
import com.squareup.cash.history.navigation.PaymentActionNavigator;
import com.squareup.cash.history.navigation.PaymentActionNavigator$setup$lambda$0$$inlined$transform$1$1$1;
import com.squareup.cash.identityverification.backend.api.IdentityVerificationStatus;
import com.squareup.cash.identityverification.backend.real.RealIdentityVerificationBadger;
import com.squareup.cash.identityverification.backend.real.RealIdentityVerificationBadger$shouldShowBadge$$inlined$map$1$2$1;
import com.squareup.cash.identityverification.backend.real.RealIdentityVerificationRepo;
import com.squareup.cash.identityverification.backend.real.RealIdentityVerificationRepo$status$$inlined$map$1$2$1;
import com.squareup.cash.initialscreenloader.screens.InitialScreenPlaceholder;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.limits.backend.api.LimitsPageletStore$VersionedLimitsPagelet;
import com.squareup.cash.limits.backend.real.LimitsPageletBadger$collect$$inlined$map$1$2$1;
import com.squareup.cash.localization.RealLocaleManager;
import com.squareup.cash.localization.RealLocaleManager$special$$inlined$map$1$2$1;
import com.squareup.cash.payments.backend.api.PaymentAction;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.session.backend.SessionState;
import com.squareup.cash.session.backend.SignedInStateSetupTeardown;
import com.squareup.cash.ui.MainActivity;
import com.squareup.cash.ui.MainContainerDelegate;
import com.squareup.cash.ui.MainContainerDelegate$6$invokeSuspend$$inlined$filter$1$2$1;
import com.squareup.cash.userjourneys.tracker.JourneysToUpload;
import com.squareup.cash.userjourneys.tracker.RealUserJourneyReporter;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.wallet.presenters.CardDetailsModel;
import com.squareup.cash.wallet.presenters.CardDetailsModel$CardPillModel$Installed$NullState;
import com.squareup.cash.wallet.presenters.RealCardAppletTileRepository;
import com.squareup.cash.wallet.presenters.RealCardAppletTileRepository$special$$inlined$map$2$2$1;
import com.squareup.preferences.LongPreference;
import com.squareup.preferences.PreferenceFlow$flow$1;
import com.squareup.protos.cash.messagingplatformcommon.app.Animation;
import com.squareup.protos.cash.messagingplatformcommon.app.Animation$Message$Inset;
import com.squareup.protos.cash.messagingplatformcommon.app.AnimationInset;
import com.squareup.protos.cash.messagingplatformcommon.app.AppMessageAction;
import com.squareup.protos.cash.postcard.CardScheme;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.cards.CardTheme;
import com.squareup.util.android.Intents;
import com.squareup.util.android.SecurePixelCopy;
import com.squareup.util.cash.ImagesKt;
import com.squareup.util.workmanager.AndroidWorkManager;
import com.squareup.wire.GrpcMethod;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1;
import kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2$1;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class CashCdpConfigProvider$1$2 implements FlowCollector {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $sessionManager;
    public final /* synthetic */ Object this$0;

    public /* synthetic */ CashCdpConfigProvider$1$2(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.this$0 = obj;
        this.$sessionManager = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0092, code lost:
    
        if (r9.emit(r2, r0) != r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object emit$com$squareup$cash$wallet$presenters$RealCardAppletTileRepository$special$$inlined$map$2$2(Object obj, Continuation continuation) {
        RealCardAppletTileRepository$special$$inlined$map$2$2$1 realCardAppletTileRepository$special$$inlined$map$2$2$1;
        int i;
        FlowCollector flowCollector;
        int i2;
        List list;
        ArrayList arrayList;
        if (continuation instanceof RealCardAppletTileRepository$special$$inlined$map$2$2$1) {
            realCardAppletTileRepository$special$$inlined$map$2$2$1 = (RealCardAppletTileRepository$special$$inlined$map$2$2$1) continuation;
            int i3 = realCardAppletTileRepository$special$$inlined$map$2$2$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                realCardAppletTileRepository$special$$inlined$map$2$2$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj2 = realCardAppletTileRepository$special$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realCardAppletTileRepository$special$$inlined$map$2$2$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    FlowCollector flowCollector2 = (FlowCollector) this.this$0;
                    RealCardAppletTileRepository realCardAppletTileRepository = (RealCardAppletTileRepository) this.$sessionManager;
                    realCardAppletTileRepository$special$$inlined$map$2$2$1.L$4 = flowCollector2;
                    realCardAppletTileRepository$special$$inlined$map$2$2$1.I$0 = 0;
                    realCardAppletTileRepository$special$$inlined$map$2$2$1.label = 1;
                    Object access$cardNuxThemes = RealCardAppletTileRepository.access$cardNuxThemes(realCardAppletTileRepository, (CardScheme) obj, realCardAppletTileRepository$special$$inlined$map$2$2$1);
                    if (access$cardNuxThemes != coroutineSingletons) {
                        flowCollector = flowCollector2;
                        obj2 = access$cardNuxThemes;
                        i2 = 0;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i == 2) {
                        SafeTrace.throwOnFailure(obj2);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i2 = realCardAppletTileRepository$special$$inlined$map$2$2$1.I$0;
                flowCollector = realCardAppletTileRepository$special$$inlined$map$2$2$1.L$4;
                SafeTrace.throwOnFailure(obj2);
                list = (List) obj2;
                if (list == null) {
                    List list2 = list;
                    arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new CardDetailsModel(LifecyclesKt.toDefaultCardDetails((CardTheme) it.next()), CardDetailsModel$CardPillModel$Installed$NullState.INSTANCE));
                    }
                } else {
                    arrayList = null;
                }
                realCardAppletTileRepository$special$$inlined$map$2$2$1.L$4 = null;
                realCardAppletTileRepository$special$$inlined$map$2$2$1.I$0 = i2;
                realCardAppletTileRepository$special$$inlined$map$2$2$1.label = 2;
            }
        }
        realCardAppletTileRepository$special$$inlined$map$2$2$1 = new RealCardAppletTileRepository$special$$inlined$map$2$2$1(this, continuation);
        Object obj22 = realCardAppletTileRepository$special$$inlined$map$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realCardAppletTileRepository$special$$inlined$map$2$2$1.label;
        if (i != 0) {
        }
        list = (List) obj22;
        if (list == null) {
        }
        realCardAppletTileRepository$special$$inlined$map$2$2$1.L$4 = null;
        realCardAppletTileRepository$special$$inlined$map$2$2$1.I$0 = i2;
        realCardAppletTileRepository$special$$inlined$map$2$2$1.label = 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, kotlin.Unit] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object emit$kotlinx$coroutines$flow$FlowKt__ErrorsKt$catchImpl$2(Object obj, Continuation continuation) {
        FlowKt__ErrorsKt$catchImpl$2$emit$1 flowKt__ErrorsKt$catchImpl$2$emit$1;
        int i;
        try {
            if (continuation instanceof FlowKt__ErrorsKt$catchImpl$2$emit$1) {
                flowKt__ErrorsKt$catchImpl$2$emit$1 = (FlowKt__ErrorsKt$catchImpl$2$emit$1) continuation;
                int i2 = flowKt__ErrorsKt$catchImpl$2$emit$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    flowKt__ErrorsKt$catchImpl$2$emit$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj2 = flowKt__ErrorsKt$catchImpl$2$emit$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = flowKt__ErrorsKt$catchImpl$2$emit$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj2);
                        FlowCollector flowCollector = (FlowCollector) this.this$0;
                        flowKt__ErrorsKt$catchImpl$2$emit$1.label = 1;
                        if (flowCollector.emit(obj, flowKt__ErrorsKt$catchImpl$2$emit$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj2);
                    }
                    this = Unit.INSTANCE;
                    return this;
                }
            }
            if (i != 0) {
            }
            this = Unit.INSTANCE;
            return this;
        } catch (Throwable th) {
            ((Ref$ObjectRef) this.$sessionManager).element = th;
            throw th;
        }
        flowKt__ErrorsKt$catchImpl$2$emit$1 = new FlowKt__ErrorsKt$catchImpl$2$emit$1(this, continuation);
        Object obj22 = flowKt__ErrorsKt$catchImpl$2$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = flowKt__ErrorsKt$catchImpl$2$emit$1.label;
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x024b, code lost:
    
        if (r0.emit(r4, r3) == r2) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0341, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.emitAll(r1, (kotlinx.coroutines.flow.Flow) r0, r3) != r2) goto L177;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x066e  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x067a  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0689  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x06a9  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x068c  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0686  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x067f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0673  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0700  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x070a  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x0772  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x077c  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x07d9  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x07e3  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x0849  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x0853  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x018d  */
    /* JADX WARN: Type inference failed for: r13v4, types: [app.cash.passcode.backend.RealAppLockState$AppLockEvent$AppStateChanged] */
    /* JADX WARN: Type inference failed for: r13v7, types: [app.cash.passcode.backend.RealAppLockState$AppLockEvent$AppStateChanged] */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        CashCdpConfigProvider$1$invokeSuspend$$inlined$map$1$2$1 cashCdpConfigProvider$1$invokeSuspend$$inlined$map$1$2$1;
        int i;
        AppLockMonitor$setup$lambda$0$$inlined$mapNotNull$1$2$1 appLockMonitor$setup$lambda$0$$inlined$mapNotNull$1$2$1;
        int i2;
        AppMessageSyncer$setup$lambda$0$$inlined$filter$2$2$1 appMessageSyncer$setup$lambda$0$$inlined$filter$2$2$1;
        int i3;
        AppMessageBadgeCounter$collect$suspendImpl$$inlined$map$3$2$1 appMessageBadgeCounter$collect$suspendImpl$$inlined$map$3$2$1;
        int i4;
        RealInAppNotificationPresenter$generateModel$$inlined$map$1$2$1 realInAppNotificationPresenter$generateModel$$inlined$map$1$2$1;
        int i5;
        AppMessageImage appMessageImage;
        AppMessageImage inset;
        Object ready;
        AnimationInset value;
        RealSyncValueReader$special$$inlined$map$1$2$1 realSyncValueReader$special$$inlined$map$1$2$1;
        int i6;
        RealFeatureEligibilityRepository$currentEligibleFeatures$$inlined$map$1$2$1 realFeatureEligibilityRepository$currentEligibleFeatures$$inlined$map$1$2$1;
        int i7;
        RealFeatureEligibilityRepository$isEligible$$inlined$map$1$2$1 realFeatureEligibilityRepository$isEligible$$inlined$map$1$2$1;
        int i8;
        RealFilamentSupportProvider$special$$inlined$map$1$2$1 realFilamentSupportProvider$special$$inlined$map$1$2$1;
        int i9;
        Boolean bool;
        PaymentActionNavigator$setup$lambda$0$$inlined$transform$1$1$1 paymentActionNavigator$setup$lambda$0$$inlined$transform$1$1$1;
        int i10;
        FlowCollector flowCollector;
        RealIdentityVerificationBadger$shouldShowBadge$$inlined$map$1$2$1 realIdentityVerificationBadger$shouldShowBadge$$inlined$map$1$2$1;
        int i11;
        RealIdentityVerificationRepo$status$$inlined$map$1$2$1 realIdentityVerificationRepo$status$$inlined$map$1$2$1;
        int i12;
        FlowCollector flowCollector2;
        int i13;
        FlowCollector flowCollector3;
        SettingsEligibilityManager$AccountSettingsResult settingsEligibilityManager$AccountSettingsResult;
        LimitsPageletBadger$collect$$inlined$map$1$2$1 limitsPageletBadger$collect$$inlined$map$1$2$1;
        int i14;
        RealLocaleManager$special$$inlined$map$1$2$1 realLocaleManager$special$$inlined$map$1$2$1;
        int i15;
        MainContainerDelegate$6$invokeSuspend$$inlined$filter$1$2$1 mainContainerDelegate$6$invokeSuspend$$inlined$filter$1$2$1;
        int i16;
        FlowKt__ReduceKt$first$$inlined$collectWhile$2$1 flowKt__ReduceKt$first$$inlined$collectWhile$2$1;
        Object obj2;
        int i17;
        Object obj3 = obj;
        int i18 = this.$r8$classId;
        int i19 = 4;
        int i20 = 2;
        r7 = false;
        boolean z = false;
        int i21 = 0;
        boolean z2 = false;
        r7 = false;
        r7 = false;
        boolean z3 = false;
        int i22 = 0;
        boolean z4 = false;
        int i23 = 1;
        Object obj4 = this.$sessionManager;
        Object obj5 = this.this$0;
        Continuation continuation2 = null;
        Object obj6 = null;
        switch (i18) {
            case 0:
                ((CashCdpConfigProvider) obj5).readyForBatchUploading.set(PlatformKt.appTokenOrNull((SessionManager) obj4) != null);
                return Unit.INSTANCE;
            case 1:
                long j = ((Offset) obj3).packedValue;
                TextFieldMagnifierNodeImpl28 textFieldMagnifierNodeImpl28 = (TextFieldMagnifierNodeImpl28) obj5;
                Animatable animatable = textFieldMagnifierNodeImpl28.animatable;
                if ((((Offset) animatable.getValue()).packedValue & 9223372034707292159L) == 9205357640488583168L || (j & 9223372034707292159L) == 9205357640488583168L || Float.intBitsToFloat((int) (((Offset) animatable.getValue()).packedValue & BodyPartID.bodyIdMax)) == Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax))) {
                    Object snapTo = animatable.snapTo(new Offset(j), continuation);
                    return snapTo == CoroutineSingletons.COROUTINE_SUSPENDED ? snapTo : Unit.INSTANCE;
                }
                JobKt.launch$default((CoroutineScope) obj4, null, null, new FlashControl$applyScreenFlash$3(textFieldMagnifierNodeImpl28, j, (Continuation) null, 2), 3);
                return Unit.INSTANCE;
            case 2:
                Interaction interaction = (Interaction) obj3;
                AndroidRippleNode androidRippleNode = (AndroidRippleNode) obj5;
                if (!(interaction instanceof PressInteraction)) {
                    CoroutineScope coroutineScope = (CoroutineScope) obj4;
                    AndroidSystemCallbacks androidSystemCallbacks = androidRippleNode.stateLayer;
                    float f = RecyclerView.DECELERATION_RATE;
                    if (androidSystemCallbacks == null) {
                        boolean z5 = androidRippleNode.bounded;
                        Function0 function0 = androidRippleNode.rippleAlpha;
                        androidSystemCallbacks = new AndroidSystemCallbacks();
                        androidSystemCallbacks.shutdown = z5;
                        androidSystemCallbacks.imageLoader = function0;
                        androidSystemCallbacks.activityCallbacks = AnimatableKt.Animatable(RecyclerView.DECELERATION_RATE, 0.01f);
                        androidSystemCallbacks.componentCallbacks = new ArrayList();
                        DepthSortedSetKt.invalidateDraw(androidRippleNode);
                        androidRippleNode.stateLayer = androidSystemCallbacks;
                    }
                    ArrayList arrayList = (ArrayList) androidSystemCallbacks.componentCallbacks;
                    if (interaction instanceof HoverInteraction$Enter) {
                        arrayList.add(interaction);
                    } else if (interaction instanceof HoverInteraction$Exit) {
                        arrayList.remove(((HoverInteraction$Exit) interaction).enter);
                    } else if (interaction instanceof FocusInteraction$Focus) {
                        arrayList.add(interaction);
                    } else if (interaction instanceof FocusInteraction$Unfocus) {
                        arrayList.remove(((FocusInteraction$Unfocus) interaction).getFocus());
                    } else if (interaction instanceof DragInteraction$Start) {
                        arrayList.add(interaction);
                    } else if (interaction instanceof DragInteraction$Stop) {
                        arrayList.remove(((DragInteraction$Stop) interaction).getStart());
                    } else if (interaction instanceof DragInteraction$Cancel) {
                        arrayList.remove(((DragInteraction$Cancel) interaction).getStart());
                    }
                    Interaction interaction2 = (Interaction) CollectionsKt.lastOrNull((List) arrayList);
                    if (!Intrinsics.areEqual((Interaction) androidSystemCallbacks.application, interaction2)) {
                        if (interaction2 != null) {
                            RippleAlpha rippleAlpha = (RippleAlpha) ((Function0) androidSystemCallbacks.imageLoader).invoke();
                            boolean z6 = interaction2 instanceof HoverInteraction$Enter;
                            if (z6) {
                                f = rippleAlpha.hoveredAlpha;
                            } else if (interaction2 instanceof FocusInteraction$Focus) {
                                f = rippleAlpha.focusedAlpha;
                            } else if (interaction2 instanceof DragInteraction$Start) {
                                f = rippleAlpha.draggedAlpha;
                            }
                            TweenSpec tweenSpec = RippleKt.DefaultTweenSpec;
                            if (!z6) {
                                if (interaction2 instanceof FocusInteraction$Focus) {
                                    tweenSpec = new TweenSpec(45, EasingKt.LinearEasing, 2);
                                } else if (interaction2 instanceof DragInteraction$Start) {
                                    tweenSpec = new TweenSpec(45, EasingKt.LinearEasing, 2);
                                }
                            }
                            JobKt.launch$default(coroutineScope, null, null, new Transition$animateTo$1$1$1(androidSystemCallbacks, f, tweenSpec, null), 3);
                        } else {
                            Interaction interaction3 = (Interaction) androidSystemCallbacks.application;
                            TweenSpec tweenSpec2 = RippleKt.DefaultTweenSpec;
                            if (!(interaction3 instanceof HoverInteraction$Enter) && !(interaction3 instanceof FocusInteraction$Focus) && (interaction3 instanceof DragInteraction$Start)) {
                                tweenSpec2 = new TweenSpec(150, EasingKt.LinearEasing, 2);
                            }
                            JobKt.launch$default(coroutineScope, null, null, new PageFetcher$flow$1(androidSystemCallbacks, tweenSpec2, continuation2, i19), 3);
                        }
                        androidSystemCallbacks.application = interaction2;
                    }
                } else if (androidRippleNode.hasValidSize) {
                    androidRippleNode.handlePressInteraction((PressInteraction) interaction);
                } else {
                    androidRippleNode.pendingInteractions.add(interaction);
                }
                return Unit.INSTANCE;
            case 3:
                ((OnConstraintsStateChangedListener) obj5).onConstraintsStateChanged((WorkSpec) obj4, (ConstraintsState) obj3);
                return Unit.INSTANCE;
            case 4:
                FlushTrigger flushTrigger = (FlushTrigger) obj3;
                Timber.Forest forest = Timber.Forest;
                forest.i("CDP Flush event triggered: " + ((FlushStrategy) obj5), new Object[0]);
                FlushStrategyCoordinator flushStrategyCoordinator = (FlushStrategyCoordinator) obj4;
                MemoryCacheService memoryCacheService = flushStrategyCoordinator.eventFlusher;
                long j2 = flushTrigger.delayMillis;
                forest.i(Boxes$$ExternalSyntheticOutline1.m(j2, "CDP Flush requested with ", "ms delay"), new Object[0]);
                NetworkType networkType = NetworkType.NOT_REQUIRED;
                Constraints constraints = new Constraints(new NetworkRequestCompat(null), NetworkType.CONNECTED, false, false, false, false, -1L, -1L, CollectionsKt.toSet(new LinkedHashSet()));
                GrpcMethod OneTimeWorkRequestBuilder = SizeKt.OneTimeWorkRequestBuilder(BatchUploadWorker.class, (Pair[]) Arrays.copyOf(new Pair[0], 0));
                ((WorkSpec) OneTimeWorkRequestBuilder.requestAdapter).constraints = constraints;
                OneTimeWorkRequestBuilder.setInitialDelay(j2, TimeUnit.MILLISECONDS);
                ((AndroidWorkManager) memoryCacheService.imageLoader).enqueueUniqueWork("BatchUploadWorker", ExistingWorkPolicy.REPLACE, OneTimeWorkRequestBuilder.build());
                Iterator it = flushStrategyCoordinator.flushStrategies.iterator();
                while (it.hasNext()) {
                    ((FlushStrategy) it.next()).reset();
                }
                return Unit.INSTANCE;
            case 5:
                AppForegroundState appForegroundState = (AppForegroundState) obj3;
                Analytics analytics = ((AppLifecycleEventEmitter) obj5).analytics;
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) obj4;
                if (appForegroundState == AppForegroundState.FOREGROUND) {
                    analytics.track(new AppLifecycleForeground(), null);
                    ref$BooleanRef.element = true;
                } else if (appForegroundState == AppForegroundState.BACKGROUND && ref$BooleanRef.element) {
                    analytics.track(new AppLifecycleBackground(), null);
                    ref$BooleanRef.element = false;
                }
                return Unit.INSTANCE;
            case 6:
                if (continuation instanceof CashCdpConfigProvider$1$invokeSuspend$$inlined$map$1$2$1) {
                    cashCdpConfigProvider$1$invokeSuspend$$inlined$map$1$2$1 = (CashCdpConfigProvider$1$invokeSuspend$$inlined$map$1$2$1) continuation;
                    int i24 = cashCdpConfigProvider$1$invokeSuspend$$inlined$map$1$2$1.label;
                    if ((i24 & PKIFailureInfo.systemUnavail) != 0) {
                        cashCdpConfigProvider$1$invokeSuspend$$inlined$map$1$2$1.label = i24 - PKIFailureInfo.systemUnavail;
                        Object obj7 = cashCdpConfigProvider$1$invokeSuspend$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = cashCdpConfigProvider$1$invokeSuspend$$inlined$map$1$2$1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj7);
                            String appTokenOrNull = PlatformKt.appTokenOrNull((SessionManager) obj4);
                            cashCdpConfigProvider$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                            if (((FlowCollector) obj5).emit(appTokenOrNull, cashCdpConfigProvider$1$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            if (i != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj7);
                        }
                        return Unit.INSTANCE;
                    }
                }
                cashCdpConfigProvider$1$invokeSuspend$$inlined$map$1$2$1 = new CashCdpConfigProvider$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                Object obj72 = cashCdpConfigProvider$1$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cashCdpConfigProvider$1$invokeSuspend$$inlined$map$1$2$1.label;
                if (i != 0) {
                }
                return Unit.INSTANCE;
            case 7:
                return emit((RealAppLockState.InternalState) obj3, continuation);
            case 8:
                AndroidClock androidClock = ((AppLockMonitor) obj4).clock;
                if (continuation instanceof AppLockMonitor$setup$lambda$0$$inlined$mapNotNull$1$2$1) {
                    appLockMonitor$setup$lambda$0$$inlined$mapNotNull$1$2$1 = (AppLockMonitor$setup$lambda$0$$inlined$mapNotNull$1$2$1) continuation;
                    int i25 = appLockMonitor$setup$lambda$0$$inlined$mapNotNull$1$2$1.label;
                    if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                        appLockMonitor$setup$lambda$0$$inlined$mapNotNull$1$2$1.label = i25 - PKIFailureInfo.systemUnavail;
                        Object obj8 = appLockMonitor$setup$lambda$0$$inlined$mapNotNull$1$2$1.result;
                        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i2 = appLockMonitor$setup$lambda$0$$inlined$mapNotNull$1$2$1.label;
                        if (i2 != 0) {
                            SafeTrace.throwOnFailure(obj8);
                            FlowCollector flowCollector4 = (FlowCollector) obj5;
                            int i26 = AppLockMonitor.WhenMappings.$EnumSwitchMapping$0[((Lifecycle.Event) obj3).ordinal()];
                            if (i26 == 1) {
                                continuation2 = new RealAppLockState.AppLockEvent.AppStateChanged(new RealAppLockState.AppState.Foreground(DimensionKt.elapsedRealtimeDuration(androidClock)));
                            } else if (i26 == 2) {
                                continuation2 = new RealAppLockState.AppLockEvent.AppStateChanged(new RealAppLockState.AppState.Background(DimensionKt.elapsedRealtimeDuration(androidClock)));
                            }
                            if (continuation2 != null) {
                                appLockMonitor$setup$lambda$0$$inlined$mapNotNull$1$2$1.label = 1;
                                if (flowCollector4.emit(continuation2, appLockMonitor$setup$lambda$0$$inlined$mapNotNull$1$2$1) == coroutineSingletons3) {
                                    return coroutineSingletons3;
                                }
                            }
                        } else {
                            if (i2 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj8);
                        }
                        return Unit.INSTANCE;
                    }
                }
                appLockMonitor$setup$lambda$0$$inlined$mapNotNull$1$2$1 = new AppLockMonitor$setup$lambda$0$$inlined$mapNotNull$1$2$1(this, continuation);
                Object obj82 = appLockMonitor$setup$lambda$0$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = appLockMonitor$setup$lambda$0$$inlined$mapNotNull$1$2$1.label;
                if (i2 != 0) {
                }
                return Unit.INSTANCE;
            case 9:
                if (continuation instanceof AppMessageSyncer$setup$lambda$0$$inlined$filter$2$2$1) {
                    appMessageSyncer$setup$lambda$0$$inlined$filter$2$2$1 = (AppMessageSyncer$setup$lambda$0$$inlined$filter$2$2$1) continuation;
                    int i27 = appMessageSyncer$setup$lambda$0$$inlined$filter$2$2$1.label;
                    if ((i27 & PKIFailureInfo.systemUnavail) != 0) {
                        appMessageSyncer$setup$lambda$0$$inlined$filter$2$2$1.label = i27 - PKIFailureInfo.systemUnavail;
                        Object obj9 = appMessageSyncer$setup$lambda$0$$inlined$filter$2$2$1.result;
                        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i3 = appMessageSyncer$setup$lambda$0$$inlined$filter$2$2$1.label;
                        if (i3 != 0) {
                            SafeTrace.throwOnFailure(obj9);
                            FlowCollector flowCollector5 = (FlowCollector) obj5;
                            boolean z7 = PlatformKt.getCurrentSessionState(((AppMessageSyncer) obj4).sessionManager) instanceof SessionState.Authenticated;
                            Timber.Forest.d("[Growth Diagnosis] app message syncing with trigger [" + obj3 + "], isAuthenticated=" + z7, new Object[0]);
                            if (z7) {
                                appMessageSyncer$setup$lambda$0$$inlined$filter$2$2$1.label = 1;
                                if (flowCollector5.emit(obj3, appMessageSyncer$setup$lambda$0$$inlined$filter$2$2$1) == coroutineSingletons4) {
                                    return coroutineSingletons4;
                                }
                            }
                        } else {
                            if (i3 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj9);
                        }
                        return Unit.INSTANCE;
                    }
                }
                appMessageSyncer$setup$lambda$0$$inlined$filter$2$2$1 = new AppMessageSyncer$setup$lambda$0$$inlined$filter$2$2$1(this, continuation);
                Object obj92 = appMessageSyncer$setup$lambda$0$$inlined$filter$2$2$1.result;
                CoroutineSingletons coroutineSingletons42 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = appMessageSyncer$setup$lambda$0$$inlined$filter$2$2$1.label;
                if (i3 != 0) {
                }
                return Unit.INSTANCE;
            case 10:
                if (continuation instanceof AppMessageBadgeCounter$collect$suspendImpl$$inlined$map$3$2$1) {
                    appMessageBadgeCounter$collect$suspendImpl$$inlined$map$3$2$1 = (AppMessageBadgeCounter$collect$suspendImpl$$inlined$map$3$2$1) continuation;
                    int i28 = appMessageBadgeCounter$collect$suspendImpl$$inlined$map$3$2$1.label;
                    if ((i28 & PKIFailureInfo.systemUnavail) != 0) {
                        appMessageBadgeCounter$collect$suspendImpl$$inlined$map$3$2$1.label = i28 - PKIFailureInfo.systemUnavail;
                        Object obj10 = appMessageBadgeCounter$collect$suspendImpl$$inlined$map$3$2$1.result;
                        CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i4 = appMessageBadgeCounter$collect$suspendImpl$$inlined$map$3$2$1.label;
                        if (i4 != 0) {
                            SafeTrace.throwOnFailure(obj10);
                            FlowCollector flowCollector6 = (FlowCollector) obj5;
                            List list = (List) obj3;
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj11 : list) {
                                SheetMessage sheetMessage = (SheetMessage) obj11;
                                if (sheetMessage.is_badged && sheetMessage.message_format.placement == ((CardTabBadgeCounter) obj4).sheetMessagePlacement) {
                                    arrayList2.add(obj11);
                                }
                            }
                            Long l = new Long(arrayList2.size());
                            appMessageBadgeCounter$collect$suspendImpl$$inlined$map$3$2$1.label = 1;
                            if (flowCollector6.emit(l, appMessageBadgeCounter$collect$suspendImpl$$inlined$map$3$2$1) == coroutineSingletons5) {
                                return coroutineSingletons5;
                            }
                        } else {
                            if (i4 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj10);
                        }
                        return Unit.INSTANCE;
                    }
                }
                appMessageBadgeCounter$collect$suspendImpl$$inlined$map$3$2$1 = new AppMessageBadgeCounter$collect$suspendImpl$$inlined$map$3$2$1(this, continuation);
                Object obj102 = appMessageBadgeCounter$collect$suspendImpl$$inlined$map$3$2$1.result;
                CoroutineSingletons coroutineSingletons52 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i4 = appMessageBadgeCounter$collect$suspendImpl$$inlined$map$3$2$1.label;
                if (i4 != 0) {
                }
                return Unit.INSTANCE;
            case 11:
                RealInAppNotificationPresenter realInAppNotificationPresenter = (RealInAppNotificationPresenter) obj4;
                if (continuation instanceof RealInAppNotificationPresenter$generateModel$$inlined$map$1$2$1) {
                    realInAppNotificationPresenter$generateModel$$inlined$map$1$2$1 = (RealInAppNotificationPresenter$generateModel$$inlined$map$1$2$1) continuation;
                    int i29 = realInAppNotificationPresenter$generateModel$$inlined$map$1$2$1.label;
                    if ((i29 & PKIFailureInfo.systemUnavail) != 0) {
                        realInAppNotificationPresenter$generateModel$$inlined$map$1$2$1.label = i29 - PKIFailureInfo.systemUnavail;
                        Object obj12 = realInAppNotificationPresenter$generateModel$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i5 = realInAppNotificationPresenter$generateModel$$inlined$map$1$2$1.label;
                        if (i5 != 0) {
                            SafeTrace.throwOnFailure(obj12);
                            FlowCollector flowCollector7 = (FlowCollector) obj5;
                            InAppNotificationMessage inAppNotificationMessage = (InAppNotificationMessage) obj3;
                            if (inAppNotificationMessage == null) {
                                ready = InAppNotificationModel.NotAvailable.INSTANCE;
                            } else {
                                AppMessageAction appMessageAction = inAppNotificationMessage.action;
                                Long l2 = realInAppNotificationPresenter.accessibilityManager.isSpokenServiceEnabled() ? null : inAppNotificationMessage.duration;
                                String str = inAppNotificationMessage.messageToken;
                                Animation animation = inAppNotificationMessage.animation;
                                zzjm zzjmVar = animation != null ? animation.message : null;
                                Animation$Message$Inset animation$Message$Inset = zzjmVar instanceof Animation$Message$Inset ? (Animation$Message$Inset) zzjmVar : null;
                                Image image = (animation$Message$Inset == null || (value = animation$Message$Inset.getValue()) == null) ? null : value.lottie_asset;
                                if (image != null) {
                                    inset = new AppMessageImage.Animated.Inset(new AppMessageImage$Animated$Asset$Url(image));
                                } else {
                                    com.squareup.protos.cash.messagingplatformcommon.app.Image image2 = inAppNotificationMessage.avatar;
                                    if (image2 != null) {
                                        inset = CameraCaptureCallbacks.asAppMessageImage(image2, true);
                                    } else {
                                        com.squareup.protos.cash.messagingplatformcommon.app.Image image3 = inAppNotificationMessage.image;
                                        if (image3 != null) {
                                            inset = CameraCaptureCallbacks.asAppMessageImage(image3, false);
                                        } else {
                                            String str2 = inAppNotificationMessage.assetUrl;
                                            if (str2 != null) {
                                                inset = new AppMessageImage.Static.Inset(ImagesKt.toImage(str2), false);
                                            } else {
                                                appMessageImage = null;
                                                String str3 = appMessageAction == null ? appMessageAction.text : null;
                                                str3.getClass();
                                                ready = new InAppNotificationModel.Ready(str, appMessageImage, str3, appMessageAction == null ? appMessageAction.text_color : null, (appMessageAction == null ? appMessageAction.url_to_open : null) == null, ((l2 != null && l2.longValue() == 0) || l2 == null) ? null : l2, new AppMessageViewEvent.AppMessageActionTaken(inAppNotificationMessage.messageToken, appMessageAction != null ? appMessageAction.url_to_open : null, false, null, 12), new AppMessageViewEvent.AppMessageActionTaken(inAppNotificationMessage.messageToken, null, false, null, 12), new AppMessageViewEvent.AppMessageViewed(inAppNotificationMessage.messageToken));
                                            }
                                        }
                                    }
                                }
                                appMessageImage = inset;
                                if (appMessageAction == null) {
                                }
                                str3.getClass();
                                if (l2 != null) {
                                    ready = new InAppNotificationModel.Ready(str, appMessageImage, str3, appMessageAction == null ? appMessageAction.text_color : null, (appMessageAction == null ? appMessageAction.url_to_open : null) == null, ((l2 != null && l2.longValue() == 0) || l2 == null) ? null : l2, new AppMessageViewEvent.AppMessageActionTaken(inAppNotificationMessage.messageToken, appMessageAction != null ? appMessageAction.url_to_open : null, false, null, 12), new AppMessageViewEvent.AppMessageActionTaken(inAppNotificationMessage.messageToken, null, false, null, 12), new AppMessageViewEvent.AppMessageViewed(inAppNotificationMessage.messageToken));
                                }
                                ready = new InAppNotificationModel.Ready(str, appMessageImage, str3, appMessageAction == null ? appMessageAction.text_color : null, (appMessageAction == null ? appMessageAction.url_to_open : null) == null, ((l2 != null && l2.longValue() == 0) || l2 == null) ? null : l2, new AppMessageViewEvent.AppMessageActionTaken(inAppNotificationMessage.messageToken, appMessageAction != null ? appMessageAction.url_to_open : null, false, null, 12), new AppMessageViewEvent.AppMessageActionTaken(inAppNotificationMessage.messageToken, null, false, null, 12), new AppMessageViewEvent.AppMessageViewed(inAppNotificationMessage.messageToken));
                            }
                            realInAppNotificationPresenter$generateModel$$inlined$map$1$2$1.label = 1;
                            if (flowCollector7.emit(ready, realInAppNotificationPresenter$generateModel$$inlined$map$1$2$1) == coroutineSingletons6) {
                                return coroutineSingletons6;
                            }
                        } else {
                            if (i5 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj12);
                        }
                        return Unit.INSTANCE;
                    }
                }
                realInAppNotificationPresenter$generateModel$$inlined$map$1$2$1 = new RealInAppNotificationPresenter$generateModel$$inlined$map$1$2$1(this, continuation);
                Object obj122 = realInAppNotificationPresenter$generateModel$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons62 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i5 = realInAppNotificationPresenter$generateModel$$inlined$map$1$2$1.label;
                if (i5 != 0) {
                }
                return Unit.INSTANCE;
            case 12:
                RealInAppNotificationPresenter realInAppNotificationPresenter2 = (RealInAppNotificationPresenter) obj4;
                CoroutineScope coroutineScope2 = (CoroutineScope) obj5;
                AppMessageViewEvent appMessageViewEvent = (AppMessageViewEvent) obj3;
                if (appMessageViewEvent instanceof AppMessageViewEvent.AppMessageActionTaken) {
                    JobKt.launch$default(coroutineScope2, realInAppNotificationPresenter2.ioDispatcher, null, new SearchBarBinding$Content$1$1(realInAppNotificationPresenter2, appMessageViewEvent, continuation2, 24), 2);
                } else if (appMessageViewEvent instanceof AppMessageViewEvent.AppMessageViewed) {
                    JobKt.launch$default(coroutineScope2, null, null, new MLKitTitleGenerator$prepareModel$1(realInAppNotificationPresenter2, appMessageViewEvent, continuation2, 11), 3);
                }
                return Unit.INSTANCE;
            case 13:
                RealTooltipAppMessagePresenter realTooltipAppMessagePresenter = (RealTooltipAppMessagePresenter) obj4;
                CoroutineContext coroutineContext = realTooltipAppMessagePresenter.ioDispatcher;
                CoroutineScope coroutineScope3 = (CoroutineScope) obj5;
                TooltipAppMessageViewEvent tooltipAppMessageViewEvent = (TooltipAppMessageViewEvent) obj3;
                if (tooltipAppMessageViewEvent instanceof TooltipAppMessageViewEvent.TargetClicked) {
                    JobKt.launch$default(coroutineScope3, coroutineContext, null, new RealTooltipAppMessagePresenter$models$2$1(realTooltipAppMessagePresenter, tooltipAppMessageViewEvent, continuation2, r7 ? 1 : 0), 2);
                } else if (tooltipAppMessageViewEvent instanceof TooltipAppMessageViewEvent.TooltipClicked) {
                    JobKt.launch$default(coroutineScope3, coroutineContext, null, new RealTooltipAppMessagePresenter$models$2$1(realTooltipAppMessagePresenter, tooltipAppMessageViewEvent, continuation2, i23), 2);
                } else if (tooltipAppMessageViewEvent instanceof TooltipAppMessageViewEvent.TooltipDismissed) {
                    JobKt.launch$default(coroutineScope3, coroutineContext, null, new RealTooltipAppMessagePresenter$models$2$1(realTooltipAppMessagePresenter, tooltipAppMessageViewEvent, continuation2, i20), 2);
                } else {
                    if (!(tooltipAppMessageViewEvent instanceof TooltipAppMessageViewEvent.TooltipViewed)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    JobKt.launch$default(coroutineScope3, null, null, new MLKitTitleGenerator$prepareModel$1(tooltipAppMessageViewEvent, realTooltipAppMessagePresenter, continuation2, 13), 3);
                }
                return Unit.INSTANCE;
            case 14:
                if (continuation instanceof RealSyncValueReader$special$$inlined$map$1$2$1) {
                    realSyncValueReader$special$$inlined$map$1$2$1 = (RealSyncValueReader$special$$inlined$map$1$2$1) continuation;
                    int i30 = realSyncValueReader$special$$inlined$map$1$2$1.label;
                    if ((i30 & PKIFailureInfo.systemUnavail) != 0) {
                        realSyncValueReader$special$$inlined$map$1$2$1.label = i30 - PKIFailureInfo.systemUnavail;
                        Object obj13 = realSyncValueReader$special$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i6 = realSyncValueReader$special$$inlined$map$1$2$1.label;
                        if (i6 != 0) {
                            SafeTrace.throwOnFailure(obj13);
                            FlowCollector flowCollector8 = (FlowCollector) obj5;
                            List list2 = (List) obj3;
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            for (Object obj14 : list2) {
                                SyncValueType valueType = ((SyncEntity) obj14).getValueType();
                                Object obj15 = linkedHashMap.get(valueType);
                                if (obj15 == null) {
                                    obj15 = new ArrayList();
                                    linkedHashMap.put(valueType, obj15);
                                }
                                ((List) obj15).add(obj14);
                            }
                            RealSyncValueReader realSyncValueReader = (RealSyncValueReader) obj4;
                            List list3 = (List) linkedHashMap.get(null);
                            if (list3 == null) {
                                list3 = EmptyList.INSTANCE;
                            }
                            if (!list3.isEmpty() && !realSyncValueReader.hasReportedSyncValuesWithoutType) {
                                RealClientSyncErrorReporter realClientSyncErrorReporter = realSyncValueReader.errorReporter;
                                int i31 = SyncValuesWithoutType.$r8$clinit;
                                realClientSyncErrorReporter.reportNonFatal(SecurePixelCopy.create(list3));
                                realSyncValueReader.hasReportedSyncValuesWithoutType = true;
                            }
                            realSyncValueReader$special$$inlined$map$1$2$1.label = 1;
                            if (flowCollector8.emit(linkedHashMap, realSyncValueReader$special$$inlined$map$1$2$1) == coroutineSingletons7) {
                                return coroutineSingletons7;
                            }
                        } else {
                            if (i6 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj13);
                        }
                        return Unit.INSTANCE;
                    }
                }
                realSyncValueReader$special$$inlined$map$1$2$1 = new RealSyncValueReader$special$$inlined$map$1$2$1(this, continuation);
                Object obj132 = realSyncValueReader$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons72 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i6 = realSyncValueReader$special$$inlined$map$1$2$1.label;
                if (i6 != 0) {
                }
                return Unit.INSTANCE;
            case 15:
                if (continuation instanceof RealFeatureEligibilityRepository$currentEligibleFeatures$$inlined$map$1$2$1) {
                    realFeatureEligibilityRepository$currentEligibleFeatures$$inlined$map$1$2$1 = (RealFeatureEligibilityRepository$currentEligibleFeatures$$inlined$map$1$2$1) continuation;
                    int i32 = realFeatureEligibilityRepository$currentEligibleFeatures$$inlined$map$1$2$1.label;
                    if ((i32 & PKIFailureInfo.systemUnavail) != 0) {
                        realFeatureEligibilityRepository$currentEligibleFeatures$$inlined$map$1$2$1.label = i32 - PKIFailureInfo.systemUnavail;
                        Object obj16 = realFeatureEligibilityRepository$currentEligibleFeatures$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i7 = realFeatureEligibilityRepository$currentEligibleFeatures$$inlined$map$1$2$1.label;
                        if (i7 != 0) {
                            SafeTrace.throwOnFailure(obj16);
                            EnumSet access$toEligibleFeatureSet = RealFeatureEligibilityRepository.access$toEligibleFeatureSet((RealFeatureEligibilityRepository) obj4, (SingleAccountHolderEligibility) obj3);
                            realFeatureEligibilityRepository$currentEligibleFeatures$$inlined$map$1$2$1.label = 1;
                            if (((FlowCollector) obj5).emit(access$toEligibleFeatureSet, realFeatureEligibilityRepository$currentEligibleFeatures$$inlined$map$1$2$1) == coroutineSingletons8) {
                                return coroutineSingletons8;
                            }
                        } else {
                            if (i7 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj16);
                        }
                        return Unit.INSTANCE;
                    }
                }
                realFeatureEligibilityRepository$currentEligibleFeatures$$inlined$map$1$2$1 = new RealFeatureEligibilityRepository$currentEligibleFeatures$$inlined$map$1$2$1(this, continuation);
                Object obj162 = realFeatureEligibilityRepository$currentEligibleFeatures$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons82 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i7 = realFeatureEligibilityRepository$currentEligibleFeatures$$inlined$map$1$2$1.label;
                if (i7 != 0) {
                }
                return Unit.INSTANCE;
            case 16:
                if (continuation instanceof RealFeatureEligibilityRepository$isEligible$$inlined$map$1$2$1) {
                    realFeatureEligibilityRepository$isEligible$$inlined$map$1$2$1 = (RealFeatureEligibilityRepository$isEligible$$inlined$map$1$2$1) continuation;
                    int i33 = realFeatureEligibilityRepository$isEligible$$inlined$map$1$2$1.label;
                    if ((i33 & PKIFailureInfo.systemUnavail) != 0) {
                        realFeatureEligibilityRepository$isEligible$$inlined$map$1$2$1.label = i33 - PKIFailureInfo.systemUnavail;
                        Object obj17 = realFeatureEligibilityRepository$isEligible$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i8 = realFeatureEligibilityRepository$isEligible$$inlined$map$1$2$1.label;
                        if (i8 != 0) {
                            SafeTrace.throwOnFailure(obj17);
                            Boolean valueOf = Boolean.valueOf(((Set) obj3).containsAll(ArraysKt___ArraysKt.toSet((EligibleFeature[]) obj4)));
                            realFeatureEligibilityRepository$isEligible$$inlined$map$1$2$1.label = 1;
                            if (((FlowCollector) obj5).emit(valueOf, realFeatureEligibilityRepository$isEligible$$inlined$map$1$2$1) == coroutineSingletons9) {
                                return coroutineSingletons9;
                            }
                        } else {
                            if (i8 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj17);
                        }
                        return Unit.INSTANCE;
                    }
                }
                realFeatureEligibilityRepository$isEligible$$inlined$map$1$2$1 = new RealFeatureEligibilityRepository$isEligible$$inlined$map$1$2$1(this, continuation);
                Object obj172 = realFeatureEligibilityRepository$isEligible$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons92 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i8 = realFeatureEligibilityRepository$isEligible$$inlined$map$1$2$1.label;
                if (i8 != 0) {
                }
                return Unit.INSTANCE;
            case 17:
                RealFilamentSupportProvider realFilamentSupportProvider = (RealFilamentSupportProvider) obj4;
                if (continuation instanceof RealFilamentSupportProvider$special$$inlined$map$1$2$1) {
                    realFilamentSupportProvider$special$$inlined$map$1$2$1 = (RealFilamentSupportProvider$special$$inlined$map$1$2$1) continuation;
                    int i34 = realFilamentSupportProvider$special$$inlined$map$1$2$1.label;
                    if ((i34 & PKIFailureInfo.systemUnavail) != 0) {
                        realFilamentSupportProvider$special$$inlined$map$1$2$1.label = i34 - PKIFailureInfo.systemUnavail;
                        Object obj18 = realFilamentSupportProvider$special$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i9 = realFilamentSupportProvider$special$$inlined$map$1$2$1.label;
                        if (i9 != 0) {
                            SafeTrace.throwOnFailure(obj18);
                            FlowCollector flowCollector9 = (FlowCollector) obj5;
                            FeatureFlag$StringFeatureFlag$Value featureFlag$StringFeatureFlag$Value = (FeatureFlag$StringFeatureFlag$Value) obj3;
                            Object systemService = realFilamentSupportProvider.context.getSystemService("activity");
                            systemService.getClass();
                            String glEsVersion = ((ActivityManager) systemService).getDeviceConfigurationInfo().getGlEsVersion();
                            glEsVersion.getClass();
                            if (Double.parseDouble(glEsVersion) < 3.0d) {
                                bool = Boolean.FALSE;
                            } else {
                                List list4 = RealFilamentSupportProvider.DEFAULT_BLACKLISTED_GPUS;
                                if (!StringsKt.isBlank(featureFlag$StringFeatureFlag$Value.value)) {
                                    list4 = StringsKt__StringsKt.split$default(featureFlag$StringFeatureFlag$Value.value, new String[]{","}, false, 0, 6, null);
                                }
                                String str4 = (String) realFilamentSupportProvider.renderer$delegate.getValue();
                                if (str4 != null) {
                                    Iterator it2 = list4.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            Object next = it2.next();
                                            if (StringsKt.contains((CharSequence) str4, (CharSequence) next, true)) {
                                                obj6 = next;
                                            }
                                        }
                                    }
                                    if (obj6 == null) {
                                        try {
                                            int i35 = Filament.$r8$clinit;
                                            z4 = true;
                                        } catch (UnsatisfiedLinkError unused) {
                                        }
                                        bool = Boolean.valueOf(z4);
                                    }
                                }
                                bool = Boolean.FALSE;
                            }
                            realFilamentSupportProvider$special$$inlined$map$1$2$1.label = 1;
                            if (flowCollector9.emit(bool, realFilamentSupportProvider$special$$inlined$map$1$2$1) == coroutineSingletons10) {
                                return coroutineSingletons10;
                            }
                        } else {
                            if (i9 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj18);
                        }
                        return Unit.INSTANCE;
                    }
                }
                realFilamentSupportProvider$special$$inlined$map$1$2$1 = new RealFilamentSupportProvider$special$$inlined$map$1$2$1(this, continuation);
                Object obj182 = realFilamentSupportProvider$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons102 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i9 = realFilamentSupportProvider$special$$inlined$map$1$2$1.label;
                if (i9 != 0) {
                }
                return Unit.INSTANCE;
            case 18:
                PaymentActionResult paymentActionResult = (PaymentActionResult) obj3;
                PaymentActionNavigator paymentActionNavigator = (PaymentActionNavigator) obj5;
                if (paymentActionResult instanceof PaymentActionResult.IntentResult) {
                    Intents.maybeStartActivity(r1, ((PaymentActionResult.IntentResult) paymentActionResult).getIntent(), new CameraX$$ExternalSyntheticLambda0(paymentActionNavigator.context, 12));
                } else if (paymentActionResult instanceof PaymentActionResult.GoToScreen) {
                    paymentActionNavigator.navigator.goTo(((PaymentActionResult.GoToScreen) paymentActionResult).getScreen());
                } else {
                    if (!(paymentActionResult instanceof PaymentActionResult.Route)) {
                        OptionalProvider$$ExternalSyntheticLambda0.m((Object) paymentActionResult, "Not supported result ");
                        return null;
                    }
                    PaymentActionResult.Route route = (PaymentActionResult.Route) paymentActionResult;
                    ((RealRouter) obj4).route(RoutingParams.copy$default(route.getRoutingParams(), BlockersData.AnalyticsData.Source.HISTORY_PAYMENT_ACTION.getAnalyticsName(), null, null, 509), route.getRoute());
                }
                return Unit.INSTANCE;
            case 19:
                if (continuation instanceof PaymentActionNavigator$setup$lambda$0$$inlined$transform$1$1$1) {
                    paymentActionNavigator$setup$lambda$0$$inlined$transform$1$1$1 = (PaymentActionNavigator$setup$lambda$0$$inlined$transform$1$1$1) continuation;
                    int i36 = paymentActionNavigator$setup$lambda$0$$inlined$transform$1$1$1.label;
                    if ((i36 & PKIFailureInfo.systemUnavail) != 0) {
                        paymentActionNavigator$setup$lambda$0$$inlined$transform$1$1$1.label = i36 - PKIFailureInfo.systemUnavail;
                        Object obj19 = paymentActionNavigator$setup$lambda$0$$inlined$transform$1$1$1.result;
                        CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i10 = paymentActionNavigator$setup$lambda$0$$inlined$transform$1$1$1.label;
                        if (i10 != 0) {
                            SafeTrace.throwOnFailure(obj19);
                            FlowCollector flowCollector10 = (FlowCollector) obj5;
                            PaymentActionHandler paymentActionHandler = ((PaymentActionNavigator) obj4).paymentActionHandler;
                            paymentActionNavigator$setup$lambda$0$$inlined$transform$1$1$1.L$4 = flowCollector10;
                            paymentActionNavigator$setup$lambda$0$$inlined$transform$1$1$1.I$0 = 0;
                            paymentActionNavigator$setup$lambda$0$$inlined$transform$1$1$1.label = 1;
                            paymentActionHandler.getClass();
                            AppLockMonitor$special$$inlined$map$2 appLockMonitor$special$$inlined$map$2 = new AppLockMonitor$special$$inlined$map$2((PaymentAction) obj3, 19);
                            ChannelFlowTransformLatest transformLatest = FlowKt.transformLatest(FlowKt.merge(new PaymentActionHandler$transform$$inlined$filter$1(appLockMonitor$special$$inlined$map$2, r7 ? 1 : 0), FlowKt.transformLatest(new FormCashtag$8$invokeSuspend$$inlined$map$1(new PaymentActionHandler$transform$$inlined$filter$1(appLockMonitor$special$$inlined$map$2, i19), 10), new AnchoredDraggableNode$drag$2(continuation2, paymentActionHandler, 21))), new PaymentActionHandler$transform$$inlined$flatMapLatest$2(null, paymentActionHandler));
                            if (transformLatest != coroutineSingletons11) {
                                flowCollector = flowCollector10;
                                obj19 = transformLatest;
                            }
                            return coroutineSingletons11;
                        }
                        if (i10 != 1) {
                            if (i10 == 2) {
                                SafeTrace.throwOnFailure(obj19);
                                return Unit.INSTANCE;
                            }
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i22 = paymentActionNavigator$setup$lambda$0$$inlined$transform$1$1$1.I$0;
                        flowCollector = paymentActionNavigator$setup$lambda$0$$inlined$transform$1$1$1.L$4;
                        SafeTrace.throwOnFailure(obj19);
                        paymentActionNavigator$setup$lambda$0$$inlined$transform$1$1$1.L$4 = null;
                        paymentActionNavigator$setup$lambda$0$$inlined$transform$1$1$1.I$0 = i22;
                        paymentActionNavigator$setup$lambda$0$$inlined$transform$1$1$1.label = 2;
                        break;
                    }
                }
                paymentActionNavigator$setup$lambda$0$$inlined$transform$1$1$1 = new PaymentActionNavigator$setup$lambda$0$$inlined$transform$1$1$1(this, continuation);
                Object obj192 = paymentActionNavigator$setup$lambda$0$$inlined$transform$1$1$1.result;
                CoroutineSingletons coroutineSingletons112 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i10 = paymentActionNavigator$setup$lambda$0$$inlined$transform$1$1$1.label;
                if (i10 != 0) {
                }
                paymentActionNavigator$setup$lambda$0$$inlined$transform$1$1$1.L$4 = null;
                paymentActionNavigator$setup$lambda$0$$inlined$transform$1$1$1.I$0 = i22;
                paymentActionNavigator$setup$lambda$0$$inlined$transform$1$1$1.label = 2;
            case 20:
                if (continuation instanceof RealIdentityVerificationBadger$shouldShowBadge$$inlined$map$1$2$1) {
                    realIdentityVerificationBadger$shouldShowBadge$$inlined$map$1$2$1 = (RealIdentityVerificationBadger$shouldShowBadge$$inlined$map$1$2$1) continuation;
                    int i37 = realIdentityVerificationBadger$shouldShowBadge$$inlined$map$1$2$1.label;
                    if ((i37 & PKIFailureInfo.systemUnavail) != 0) {
                        realIdentityVerificationBadger$shouldShowBadge$$inlined$map$1$2$1.label = i37 - PKIFailureInfo.systemUnavail;
                        Object obj20 = realIdentityVerificationBadger$shouldShowBadge$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i11 = realIdentityVerificationBadger$shouldShowBadge$$inlined$map$1$2$1.label;
                        if (i11 != 0) {
                            SafeTrace.throwOnFailure(obj20);
                            FlowCollector flowCollector11 = (FlowCollector) obj5;
                            IdentityVerificationStatus identityVerificationStatus = (IdentityVerificationStatus) obj3;
                            if (identityVerificationStatus != null && identityVerificationStatus.shouldShowBadge) {
                                long j3 = identityVerificationStatus.version;
                                LongPreference longPreference = ((RealIdentityVerificationBadger) obj4).lastSeenIdentityVerificationVersion;
                                if (j3 != longPreference.preferences.getLong(longPreference.key, longPreference.defaultValue)) {
                                    z3 = true;
                                }
                            }
                            Boolean valueOf2 = Boolean.valueOf(z3);
                            realIdentityVerificationBadger$shouldShowBadge$$inlined$map$1$2$1.label = 1;
                            if (flowCollector11.emit(valueOf2, realIdentityVerificationBadger$shouldShowBadge$$inlined$map$1$2$1) == coroutineSingletons12) {
                                return coroutineSingletons12;
                            }
                        } else {
                            if (i11 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj20);
                        }
                        return Unit.INSTANCE;
                    }
                }
                realIdentityVerificationBadger$shouldShowBadge$$inlined$map$1$2$1 = new RealIdentityVerificationBadger$shouldShowBadge$$inlined$map$1$2$1(this, continuation);
                Object obj202 = realIdentityVerificationBadger$shouldShowBadge$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons122 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i11 = realIdentityVerificationBadger$shouldShowBadge$$inlined$map$1$2$1.label;
                if (i11 != 0) {
                }
                return Unit.INSTANCE;
            case 21:
                if (continuation instanceof RealIdentityVerificationRepo$status$$inlined$map$1$2$1) {
                    realIdentityVerificationRepo$status$$inlined$map$1$2$1 = (RealIdentityVerificationRepo$status$$inlined$map$1$2$1) continuation;
                    int i38 = realIdentityVerificationRepo$status$$inlined$map$1$2$1.label;
                    if ((i38 & PKIFailureInfo.systemUnavail) != 0) {
                        realIdentityVerificationRepo$status$$inlined$map$1$2$1.label = i38 - PKIFailureInfo.systemUnavail;
                        Object obj21 = realIdentityVerificationRepo$status$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i12 = realIdentityVerificationRepo$status$$inlined$map$1$2$1.label;
                        if (i12 != 0) {
                            SafeTrace.throwOnFailure(obj21);
                            flowCollector2 = (FlowCollector) obj5;
                            if (((SessionState) obj3) instanceof SessionState.Authenticated) {
                                RealSettingsEligibilityManager realSettingsEligibilityManager = ((RealIdentityVerificationRepo) obj4).settingsEligibilityManager;
                                realIdentityVerificationRepo$status$$inlined$map$1$2$1.L$4 = flowCollector2;
                                realIdentityVerificationRepo$status$$inlined$map$1$2$1.I$0 = 0;
                                realIdentityVerificationRepo$status$$inlined$map$1$2$1.label = 1;
                                Object obj22 = realSettingsEligibilityManager.settings(realIdentityVerificationRepo$status$$inlined$map$1$2$1);
                                if (obj22 != coroutineSingletons13) {
                                    flowCollector3 = flowCollector2;
                                    obj21 = obj22;
                                }
                                return coroutineSingletons13;
                            }
                            i13 = 0;
                            Boolean valueOf3 = Boolean.valueOf(z2);
                            realIdentityVerificationRepo$status$$inlined$map$1$2$1.L$4 = null;
                            realIdentityVerificationRepo$status$$inlined$map$1$2$1.I$0 = i13;
                            realIdentityVerificationRepo$status$$inlined$map$1$2$1.label = 2;
                            break;
                        } else {
                            if (i12 != 1) {
                                if (i12 == 2) {
                                    SafeTrace.throwOnFailure(obj21);
                                    return Unit.INSTANCE;
                                }
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            i21 = realIdentityVerificationRepo$status$$inlined$map$1$2$1.I$0;
                            flowCollector3 = realIdentityVerificationRepo$status$$inlined$map$1$2$1.L$4;
                            SafeTrace.throwOnFailure(obj21);
                        }
                        settingsEligibilityManager$AccountSettingsResult = (SettingsEligibilityManager$AccountSettingsResult) obj21;
                        if (!(settingsEligibilityManager$AccountSettingsResult instanceof SettingsEligibilityManager$AccountSettingsResult.SettingsError)) {
                            flowCollector2 = flowCollector3;
                            i13 = i21;
                            z2 = true;
                        } else {
                            if (!(settingsEligibilityManager$AccountSettingsResult instanceof SettingsEligibilityManager$AccountSettingsResult.SettingsLoaded)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            int i39 = i21;
                            z2 = ((SettingsEligibilityManager$AccountSettingsResult.SettingsLoaded) settingsEligibilityManager$AccountSettingsResult).cache.idv.cache.containsKey(AccountSettingType$IdvSettings.IdvSubSetting.IDENTITIY_VERIFICATION_IDV);
                            flowCollector2 = flowCollector3;
                            i13 = i39;
                        }
                        Boolean valueOf32 = Boolean.valueOf(z2);
                        realIdentityVerificationRepo$status$$inlined$map$1$2$1.L$4 = null;
                        realIdentityVerificationRepo$status$$inlined$map$1$2$1.I$0 = i13;
                        realIdentityVerificationRepo$status$$inlined$map$1$2$1.label = 2;
                    }
                }
                realIdentityVerificationRepo$status$$inlined$map$1$2$1 = new RealIdentityVerificationRepo$status$$inlined$map$1$2$1(this, continuation);
                Object obj212 = realIdentityVerificationRepo$status$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons132 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i12 = realIdentityVerificationRepo$status$$inlined$map$1$2$1.label;
                if (i12 != 0) {
                }
                settingsEligibilityManager$AccountSettingsResult = (SettingsEligibilityManager$AccountSettingsResult) obj212;
                if (!(settingsEligibilityManager$AccountSettingsResult instanceof SettingsEligibilityManager$AccountSettingsResult.SettingsError)) {
                }
                Boolean valueOf322 = Boolean.valueOf(z2);
                realIdentityVerificationRepo$status$$inlined$map$1$2$1.L$4 = null;
                realIdentityVerificationRepo$status$$inlined$map$1$2$1.I$0 = i13;
                realIdentityVerificationRepo$status$$inlined$map$1$2$1.label = 2;
            case 22:
                if (continuation instanceof LimitsPageletBadger$collect$$inlined$map$1$2$1) {
                    limitsPageletBadger$collect$$inlined$map$1$2$1 = (LimitsPageletBadger$collect$$inlined$map$1$2$1) continuation;
                    int i40 = limitsPageletBadger$collect$$inlined$map$1$2$1.label;
                    if ((i40 & PKIFailureInfo.systemUnavail) != 0) {
                        limitsPageletBadger$collect$$inlined$map$1$2$1.label = i40 - PKIFailureInfo.systemUnavail;
                        Object obj23 = limitsPageletBadger$collect$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i14 = limitsPageletBadger$collect$$inlined$map$1$2$1.label;
                        if (i14 != 0) {
                            SafeTrace.throwOnFailure(obj23);
                            FlowCollector flowCollector12 = (FlowCollector) obj5;
                            LimitsPageletStore$VersionedLimitsPagelet limitsPageletStore$VersionedLimitsPagelet = (LimitsPageletStore$VersionedLimitsPagelet) obj3;
                            if (limitsPageletStore$VersionedLimitsPagelet != null) {
                                long j4 = limitsPageletStore$VersionedLimitsPagelet.version;
                                LongPreference longPreference2 = (LongPreference) ((FinishSetupTileBadgeCounter) obj4).featureFlagManager;
                                if (j4 != longPreference2.preferences.getLong(longPreference2.key, longPreference2.defaultValue)) {
                                    z = true;
                                }
                            }
                            Boolean valueOf4 = Boolean.valueOf(z);
                            limitsPageletBadger$collect$$inlined$map$1$2$1.label = 1;
                            if (flowCollector12.emit(valueOf4, limitsPageletBadger$collect$$inlined$map$1$2$1) == coroutineSingletons14) {
                                return coroutineSingletons14;
                            }
                        } else {
                            if (i14 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj23);
                        }
                        return Unit.INSTANCE;
                    }
                }
                limitsPageletBadger$collect$$inlined$map$1$2$1 = new LimitsPageletBadger$collect$$inlined$map$1$2$1(this, continuation);
                Object obj232 = limitsPageletBadger$collect$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons142 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i14 = limitsPageletBadger$collect$$inlined$map$1$2$1.label;
                if (i14 != 0) {
                }
                return Unit.INSTANCE;
            case 23:
                if (continuation instanceof RealLocaleManager$special$$inlined$map$1$2$1) {
                    realLocaleManager$special$$inlined$map$1$2$1 = (RealLocaleManager$special$$inlined$map$1$2$1) continuation;
                    int i41 = realLocaleManager$special$$inlined$map$1$2$1.label;
                    if ((i41 & PKIFailureInfo.systemUnavail) != 0) {
                        realLocaleManager$special$$inlined$map$1$2$1.label = i41 - PKIFailureInfo.systemUnavail;
                        Object obj24 = realLocaleManager$special$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i15 = realLocaleManager$special$$inlined$map$1$2$1.label;
                        if (i15 != 0) {
                            SafeTrace.throwOnFailure(obj24);
                            Locale forLanguageTag = Locale.forLanguageTag(((Context) ((RealLocaleManager) obj4).context$delegate.getValue()).getString(R.string.resolved_locale));
                            forLanguageTag.getClass();
                            realLocaleManager$special$$inlined$map$1$2$1.label = 1;
                            if (((FlowCollector) obj5).emit(forLanguageTag, realLocaleManager$special$$inlined$map$1$2$1) == coroutineSingletons15) {
                                return coroutineSingletons15;
                            }
                        } else {
                            if (i15 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj24);
                        }
                        return Unit.INSTANCE;
                    }
                }
                realLocaleManager$special$$inlined$map$1$2$1 = new RealLocaleManager$special$$inlined$map$1$2$1(this, continuation);
                Object obj242 = realLocaleManager$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons152 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i15 = realLocaleManager$special$$inlined$map$1$2$1.label;
                if (i15 != 0) {
                }
                return Unit.INSTANCE;
            case 24:
                SessionState sessionState = (SessionState) obj3;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj5;
                if (!(ref$ObjectRef.element instanceof SessionState.Authenticated) && (sessionState instanceof SessionState.Authenticated)) {
                    SignedInStateManager signedInStateManager = (SignedInStateManager) ((Provider) ((SignedInStateSetupTeardown) obj4).signedInStateManager).invoke();
                    Object invoke = ((Function0) signedInStateManager.state.getValue).invoke();
                    SignedInState signedInState = SignedInState.SIGNED_IN;
                    if (invoke != signedInState) {
                        signedInStateManager.update(signedInState);
                    }
                }
                ref$ObjectRef.element = sessionState;
                return Unit.INSTANCE;
            case 25:
                if (continuation instanceof MainContainerDelegate$6$invokeSuspend$$inlined$filter$1$2$1) {
                    mainContainerDelegate$6$invokeSuspend$$inlined$filter$1$2$1 = (MainContainerDelegate$6$invokeSuspend$$inlined$filter$1$2$1) continuation;
                    int i42 = mainContainerDelegate$6$invokeSuspend$$inlined$filter$1$2$1.label;
                    if ((i42 & PKIFailureInfo.systemUnavail) != 0) {
                        mainContainerDelegate$6$invokeSuspend$$inlined$filter$1$2$1.label = i42 - PKIFailureInfo.systemUnavail;
                        Object obj25 = mainContainerDelegate$6$invokeSuspend$$inlined$filter$1$2$1.result;
                        CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i16 = mainContainerDelegate$6$invokeSuspend$$inlined$filter$1$2$1.label;
                        if (i16 != 0) {
                            SafeTrace.throwOnFailure(obj25);
                            FlowCollector flowCollector13 = (FlowCollector) obj5;
                            NavigationModel.Ready ready2 = (NavigationModel.Ready) obj3;
                            MainActivity mainActivity = (MainActivity) ((MainContainerDelegate) obj4).mainActivityDelegate;
                            if (!mainActivity.isContentReady && !mainActivity.restoringState && (!(ready2.fullScreen.screen instanceof InitialScreenPlaceholder) || ready2.overlay != null)) {
                                mainContainerDelegate$6$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                                if (flowCollector13.emit(obj3, mainContainerDelegate$6$invokeSuspend$$inlined$filter$1$2$1) == coroutineSingletons16) {
                                    return coroutineSingletons16;
                                }
                            }
                        } else {
                            if (i16 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj25);
                        }
                        return Unit.INSTANCE;
                    }
                }
                mainContainerDelegate$6$invokeSuspend$$inlined$filter$1$2$1 = new MainContainerDelegate$6$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                Object obj252 = mainContainerDelegate$6$invokeSuspend$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons162 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i16 = mainContainerDelegate$6$invokeSuspend$$inlined$filter$1$2$1.label;
                if (i16 != 0) {
                }
                return Unit.INSTANCE;
            case 26:
                JobKt.launch$default((CoroutineScope) obj5, null, null, new PreferenceFlow$flow$1((RealUserJourneyReporter) obj4, (JourneysToUpload) obj3, continuation2, 14), 3);
                return Unit.INSTANCE;
            case 27:
                return emit$com$squareup$cash$wallet$presenters$RealCardAppletTileRepository$special$$inlined$map$2$2(obj, continuation);
            case 28:
                return emit$kotlinx$coroutines$flow$FlowKt__ErrorsKt$catchImpl$2(obj, continuation);
            default:
                if (continuation instanceof FlowKt__ReduceKt$first$$inlined$collectWhile$2$1) {
                    flowKt__ReduceKt$first$$inlined$collectWhile$2$1 = (FlowKt__ReduceKt$first$$inlined$collectWhile$2$1) continuation;
                    int i43 = flowKt__ReduceKt$first$$inlined$collectWhile$2$1.label;
                    if ((i43 & PKIFailureInfo.systemUnavail) != 0) {
                        flowKt__ReduceKt$first$$inlined$collectWhile$2$1.label = i43 - PKIFailureInfo.systemUnavail;
                        obj2 = flowKt__ReduceKt$first$$inlined$collectWhile$2$1.result;
                        CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i17 = flowKt__ReduceKt$first$$inlined$collectWhile$2$1.label;
                        if (i17 != 0) {
                            SafeTrace.throwOnFailure(obj2);
                            flowKt__ReduceKt$first$$inlined$collectWhile$2$1.L$2 = obj3;
                            flowKt__ReduceKt$first$$inlined$collectWhile$2$1.label = 1;
                            obj2 = ((Function2) obj5).invoke(obj3, flowKt__ReduceKt$first$$inlined$collectWhile$2$1);
                            if (obj2 == coroutineSingletons17) {
                                return coroutineSingletons17;
                            }
                        } else {
                            if (i17 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            obj3 = flowKt__ReduceKt$first$$inlined$collectWhile$2$1.L$2;
                            SafeTrace.throwOnFailure(obj2);
                        }
                        if (((Boolean) obj2).booleanValue()) {
                            return Unit.INSTANCE;
                        }
                        ((Ref$ObjectRef) obj4).element = obj3;
                        throw new AbortFlowException(this);
                    }
                }
                flowKt__ReduceKt$first$$inlined$collectWhile$2$1 = new FlowKt__ReduceKt$first$$inlined$collectWhile$2$1(this, continuation);
                obj2 = flowKt__ReduceKt$first$$inlined$collectWhile$2$1.result;
                CoroutineSingletons coroutineSingletons172 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i17 = flowKt__ReduceKt$first$$inlined$collectWhile$2$1.label;
                if (i17 != 0) {
                }
                if (((Boolean) obj2).booleanValue()) {
                }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object emit(RealAppLockState.InternalState internalState, Continuation continuation) {
        AppLockMonitor$appLockLoop$2$emit$1 appLockMonitor$appLockLoop$2$emit$1;
        int i;
        Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) this.this$0;
        if (continuation instanceof AppLockMonitor$appLockLoop$2$emit$1) {
            appLockMonitor$appLockLoop$2$emit$1 = (AppLockMonitor$appLockLoop$2$emit$1) continuation;
            int i2 = appLockMonitor$appLockLoop$2$emit$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                appLockMonitor$appLockLoop$2$emit$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = appLockMonitor$appLockLoop$2$emit$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = appLockMonitor$appLockLoop$2$emit$1.label;
                Continuation continuation2 = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if ((internalState.lockState instanceof RealAppLockState.LockState.Locked) && !ref$BooleanRef.element) {
                        AppLockMonitor appLockMonitor = (AppLockMonitor) this.$sessionManager;
                        appLockMonitor$appLockLoop$2$emit$1.L$0 = internalState;
                        appLockMonitor$appLockLoop$2$emit$1.label = 1;
                        Object withContext = JobKt.withContext(appLockMonitor.mainDispatcher, new ZiplineLoader$ModuleJob$run$3(appLockMonitor, continuation2, 23), appLockMonitor$appLockLoop$2$emit$1);
                        if (withContext != obj2) {
                            withContext = Unit.INSTANCE;
                        }
                        if (withContext == obj2) {
                            return obj2;
                        }
                    }
                    if (!(internalState.lockState instanceof RealAppLockState.LockState.Locked)) {
                        ref$BooleanRef.element = false;
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                internalState = appLockMonitor$appLockLoop$2$emit$1.L$0;
                SafeTrace.throwOnFailure(obj);
                ref$BooleanRef.element = true;
                if (!(internalState.lockState instanceof RealAppLockState.LockState.Locked)) {
                }
                return Unit.INSTANCE;
            }
        }
        appLockMonitor$appLockLoop$2$emit$1 = new AppLockMonitor$appLockLoop$2$emit$1(this, continuation);
        Object obj3 = appLockMonitor$appLockLoop$2$emit$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = appLockMonitor$appLockLoop$2$emit$1.label;
        Continuation continuation22 = null;
        if (i != 0) {
        }
        ref$BooleanRef.element = true;
        if (!(internalState.lockState instanceof RealAppLockState.LockState.Locked)) {
        }
        return Unit.INSTANCE;
    }
}
