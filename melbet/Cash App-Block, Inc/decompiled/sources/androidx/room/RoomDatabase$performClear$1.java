package androidx.room;

import android.util.Log;
import androidx.camera.camera2.impl.CapturePipelineImpl;
import androidx.camera.camera2.impl.DeferredUseCaseCameraRequestControl;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateAppearance$2$$ExternalSyntheticLambda0;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.core.text.TextUtilsCompat;
import androidx.credentials.GetCredentialRequest;
import androidx.credentials.GetPublicKeyCredentialOption;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Transactor;
import app.cash.api.ApiResult;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.local.presenters.pos.LocalPosBrandOnboardingPresenter;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import app.cash.local.screens.app.LocalTabScreen;
import app.cash.molecule.PlatformKt;
import app.cash.passcode.presenters.EndAppLockPresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzahh;
import com.google.android.gms.internal.mlkit_vision_barcode.zzuj;
import com.google.mlkit.vision.face.FaceDetection;
import com.miteksystems.misnap.controller.MiSnapController;
import com.miteksystems.misnap.controller.MiSnapController$analyzeFrame$3;
import com.miteksystems.misnap.core.Frame;
import com.squareup.cash.R;
import com.squareup.cash.account.components.accountswitcher.AnimationPhase;
import com.squareup.cash.account.components.accountswitcher.ManagedAccountSwitchLoadingContentKt;
import com.squareup.cash.account.navigation.RealAccountOutboundNavigator;
import com.squareup.cash.activity.viewmodels.ActivityEmbeddedViewEvent;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.arcade.components.RadioKt$Radio$2$1$1;
import com.squareup.cash.banking.presenters.TransfersPresenter;
import com.squareup.cash.bitcoin.screens.StablecoinOnboardingScreen;
import com.squareup.cash.bitcoin.screens.StablecoinOnboardingType;
import com.squareup.cash.blockers.presenters.PasscodePresenter$models$verifyPasscodeModel$2$1$2$1;
import com.squareup.cash.boost.backend.RealBoostSyncer$refresh$1;
import com.squareup.cash.card.onboarding.CardModelView$getActiveHeat$2$2;
import com.squareup.cash.card.onboarding.graphics.scene.CardGridNuxScene;
import com.squareup.cash.cashcommercebrowser.api.v1.CustomerPreferencesService;
import com.squareup.cash.cashcommercebrowser.api.v1.UpdateCustomerPreferencesRequest;
import com.squareup.cash.cashplato.service.CashPlatoAppService;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.activity.PaymentNavigator;
import com.squareup.cash.data.activity.RealPaymentNavigator;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.datefilterbar.backend.api.DateFilter;
import com.squareup.cash.db2.profile.Profile;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda14;
import com.squareup.cash.earnings.views.home.EarningsHeaderKt;
import com.squareup.cash.earningstracker.backend.api.EarningsTrackerDataResult;
import com.squareup.cash.earningstracker.backend.real.EarningsWithExpiration;
import com.squareup.cash.earningstracker.backend.real.RealEarningsTrackerRepository;
import com.squareup.cash.family.familyhub.views.DisabledClickableNode;
import com.squareup.cash.fidesmo.viewmodels.FidesmoProvisioningViewModel;
import com.squareup.cash.fidesmo.views.FidesmoProvisioningViewKt;
import com.squareup.cash.fidesmo.views.SuccessAnimationTiming;
import com.squareup.cash.fidesmo.views.haptic.ProvisioningHaptics;
import com.squareup.cash.graphics.views.AnimationsKt$takeUntil$1$1;
import com.squareup.cash.growtools.presenters.manager.state.GrowToolsManagerState;
import com.squareup.cash.growtools.screens.GrowToolsManagerScreen;
import com.squareup.cash.instruments.backend.real.RealBalanceSnapshotManager;
import com.squareup.cash.instruments.common.BalanceSnapshot;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.investing.backend.real.RealHistoricalPriceTickRefresher;
import com.squareup.cash.investing.backend.real.RealInvestmentEntitiesKt;
import com.squareup.cash.keystore.RealKeyStoreProvider$setEntry$2;
import com.squareup.cash.localization.RealLocaleManager;
import com.squareup.cash.money.presenters.MoneyTabPresenter;
import com.squareup.cash.money.presenters.MoneyTabPresenter$models$lambda$17$$inlined$map$1;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda5;
import com.squareup.cash.moneybot.presenters.MoneybotChatPresenter;
import com.squareup.cash.moneybot.presenters.MoneybotChatPresenter$models$3$1;
import com.squareup.cash.mri.android.RealMRIFactory$sign$2;
import com.squareup.cash.music.presenters.MusicPresenter$models$2$1;
import com.squareup.cash.music.presenters.MusicPresenter$models$3$1;
import com.squareup.cash.offers.presenters.OffersFilterGroupSheetPresenter$models$sheet$2$1$1;
import com.squareup.cash.onboarding.check.IntegrityCheck;
import com.squareup.cash.onboarding.check.IntegrityChecker$Result;
import com.squareup.cash.passkeys.backend.CredentialManagerBindingContainer$provideCredentialManagerWrapper$1;
import com.squareup.cash.passkeys.backend.CredentialManagerPasskeyCreator;
import com.squareup.cash.payments.backend.real.RealOfflineManager;
import com.squareup.cash.payments.presenters.PaymentConfigurationPresenter;
import com.squareup.cash.payments.viewmodels.PaymentConfigurationViewModel;
import com.squareup.cash.phoneplans.PhonePlansEsimCheckBlockerScreen;
import com.squareup.cash.pools.presenters.PoolsListPresenter;
import com.squareup.cash.pools.viewmodels.ContributionAnimation;
import com.squareup.cash.profile.presenters.ProfilePrivacyPresenter;
import com.squareup.cash.profile.presenters.UnsupportedSettingPresenter$models$$inlined$CollectEffect$1$1;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.shopping.presenters.ShoppingWebPresenter;
import com.squareup.cash.shopping.presenters.ShoppingWebPresenter$models$5$1;
import com.squareup.cash.tax.presenters.TaxReturnsPresenter;
import com.squareup.cash.ui.widget.text.AnimatedAmountTextView;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.wallet.data.TagFormFactor;
import com.squareup.cash.wallet.views.CardNuxState;
import com.squareup.cash.wallet.views.CardRegistry;
import com.squareup.cash.wallet.views.CoreInteractiveCardKt$$ExternalSyntheticLambda4;
import com.squareup.cash.wallet.views.HeroCardViewKt;
import com.squareup.cash.wallet.views.HeroCardViewKt$Render$1$4$1$2$1$3;
import com.squareup.cash.wallet.views.InteractiveCardState;
import com.squareup.cash.wallet.views.InteractiveCardState$shimmerAnimation$2;
import com.squareup.cash.work.applets.presenters.RealShiftsTileDataLoader;
import com.squareup.cash.work.presenters.WorkHomePresenter;
import com.squareup.cash.work.presenters.shift.ShiftNotePresenter$models$1$1;
import com.squareup.cash.work.session.SquareAccountStore$userFlow$$inlined$map$1;
import com.squareup.cash.work.webview.views.WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.cashbusinessaccounts.api.v1.EarningsTrackerDataResponse;
import com.squareup.protos.cash.cashplato.api.v1.PersonalizedAdsError;
import com.squareup.protos.cash.cashplato.api.v1.PersonalizedAdsToggleRequest;
import com.squareup.protos.cash.cashplato.api.v1.PersonalizedAdsToggleResponse;
import com.squareup.protos.cash.cashplato.api.v1.PersonalizedAdsToggleResponse$Response$Error;
import com.squareup.protos.cash.commercebrowser.CommerceBrowserAutofillPreferences;
import com.squareup.protos.cash.investautomator.api.flows.UpdateAutomationForFlowRequest;
import com.squareup.protos.cash.investautomator.model.Automation;
import com.squareup.protos.cash.investautomator.model.api.flows.InvestAutomatorFlowService;
import com.squareup.protos.cash.local.client.v1.ShortlinkAction;
import com.squareup.protos.common.Money;
import com.squareup.protos.consentsys.service.CopyParameters;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.InitiatePaymentRequest;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import com.squareup.workflow1.internal.WorkflowNode$tick$1$1;
import com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupState;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.PlatformRandomKt;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.NotCompleted;
import kotlinx.coroutines.SupervisorJobImpl;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__LimitKt$drop$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$nullArrayFactory$1;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import kotlinx.coroutines.flow.internal.CombineKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import okio.ByteString;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import papa.SafeTrace;
import timber.log.Timber;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class RoomDatabase$performClear$1 extends SuspendLambda implements Function2 {
    public /* synthetic */ boolean $hasForeignKeys;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $tableNames;
    public int label;
    public Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RoomDatabase$performClear$1(Object obj, Object obj2, boolean z, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
        this.$tableNames = obj2;
        this.$hasForeignKeys = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$tableNames;
        switch (i) {
            case 0:
                return new RoomDatabase$performClear$1((RoomDatabase) this.this$0, this.$hasForeignKeys, (String[]) obj2, continuation, 0);
            case 1:
                return new RoomDatabase$performClear$1((List) this.this$0, continuation, this.$hasForeignKeys, (CapturePipelineImpl) obj2, 1);
            case 2:
                return new RoomDatabase$performClear$1((DeferredUseCaseCameraRequestControl) this.this$0, continuation, this.$hasForeignKeys, (LinkedHashSet) obj2, 2);
            case 3:
                return new RoomDatabase$performClear$1((Animatable) this.this$0, this.$hasForeignKeys, (TweenSpec) obj2, continuation, 3);
            case 4:
                return new RoomDatabase$performClear$1(this.$hasForeignKeys, (ShortlinkAction) this.this$0, (LocalPosBrandOnboardingPresenter) obj2, continuation, 4);
            case 5:
                return new RoomDatabase$performClear$1((MiSnapController) this.this$0, (Frame) obj2, this.$hasForeignKeys, continuation, 5);
            case 6:
                return new RoomDatabase$performClear$1(this.$hasForeignKeys, (Animatable) this.this$0, (MutableState) obj2, continuation, 6);
            case 7:
                return new RoomDatabase$performClear$1(this.$hasForeignKeys, (MutableInteractionSourceImpl) this.this$0, (Function0) obj2, continuation, 7);
            case 8:
                return new RoomDatabase$performClear$1((DisabledClickableNode) obj2, this.$hasForeignKeys, continuation, 8);
            case 9:
                return new RoomDatabase$performClear$1(this.$hasForeignKeys, (FidesmoProvisioningViewModel.Success.Provisioned) this.this$0, (MutableState) obj2, continuation, 9);
            case 10:
                RoomDatabase$performClear$1 roomDatabase$performClear$1 = new RoomDatabase$performClear$1((MoneybotChatPresenter) obj2, this.$hasForeignKeys, continuation, 10);
                roomDatabase$performClear$1.this$0 = obj;
                return roomDatabase$performClear$1;
            case 11:
                return new RoomDatabase$performClear$1((CredentialManagerPasskeyCreator) this.this$0, (String) obj2, this.$hasForeignKeys, continuation, 11);
            case 12:
                RoomDatabase$performClear$1 roomDatabase$performClear$12 = new RoomDatabase$performClear$1((RealOfflineManager) obj2, this.$hasForeignKeys, continuation, 12);
                roomDatabase$performClear$12.this$0 = obj;
                return roomDatabase$performClear$12;
            case 13:
                return new RoomDatabase$performClear$1(this.$hasForeignKeys, (PaymentConfigurationViewModel.ReviewPayment) this.this$0, (PaymentConfigurationPresenter) obj2, continuation, 13);
            case 14:
                return new RoomDatabase$performClear$1((WorkHomePresenter) this.this$0, this.$hasForeignKeys, (MutableState) obj2, continuation, 14);
            case 15:
                return new RoomDatabase$performClear$1(this.$hasForeignKeys, (ContributionAnimation) this.this$0, (MutableState) obj2, continuation, 15);
            case 16:
                return new RoomDatabase$performClear$1((ProfilePrivacyPresenter) this.this$0, this.$hasForeignKeys, (CancellableContinuationImpl) obj2, continuation, 16);
            case 17:
                return new RoomDatabase$performClear$1((PoolsListPresenter) this.this$0, this.$hasForeignKeys, (MutableState) obj2, continuation, 17);
            case 18:
                return new RoomDatabase$performClear$1((LocalHomePresenter) this.this$0, this.$hasForeignKeys, (ShiftNotePresenter$models$1$1) obj2, continuation, 18);
            case 19:
                RoomDatabase$performClear$1 roomDatabase$performClear$13 = new RoomDatabase$performClear$1((InteractiveCardState) this.this$0, (MutableState) obj2, continuation, 19);
                roomDatabase$performClear$13.$hasForeignKeys = ((Boolean) obj).booleanValue();
                return roomDatabase$performClear$13;
            case 20:
                RoomDatabase$performClear$1 roomDatabase$performClear$14 = new RoomDatabase$performClear$1((InteractiveCardState) obj2, this.$hasForeignKeys, continuation, 20);
                roomDatabase$performClear$14.this$0 = obj;
                return roomDatabase$performClear$14;
            case 21:
                RoomDatabase$performClear$1 roomDatabase$performClear$15 = new RoomDatabase$performClear$1((CardRegistry.SharedCardTransitionState) this.this$0, (CardNuxState) obj2, continuation, 21);
                roomDatabase$performClear$15.$hasForeignKeys = ((Boolean) obj).booleanValue();
                return roomDatabase$performClear$15;
            case 22:
                return new RoomDatabase$performClear$1(this.$hasForeignKeys, (CardNuxState) this.this$0, (MutableState) obj2, continuation, 22);
            default:
                RoomDatabase$performClear$1 roomDatabase$performClear$16 = new RoomDatabase$performClear$1((Function2) this.this$0, (CoroutineScope) obj2, continuation, 23);
                roomDatabase$performClear$16.$hasForeignKeys = ((Boolean) obj).booleanValue();
                return roomDatabase$performClear$16;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((RoomDatabase$performClear$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 1:
                return ((RoomDatabase$performClear$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 2:
                return ((RoomDatabase$performClear$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 3:
                return ((RoomDatabase$performClear$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 4:
                return ((RoomDatabase$performClear$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 5:
                return ((RoomDatabase$performClear$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 6:
                return ((RoomDatabase$performClear$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 7:
                return ((RoomDatabase$performClear$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 8:
                return ((RoomDatabase$performClear$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 9:
                return ((RoomDatabase$performClear$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 10:
                return ((RoomDatabase$performClear$1) create((ProduceStateScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 11:
                return ((RoomDatabase$performClear$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 12:
                return ((RoomDatabase$performClear$1) create((Pair) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 13:
                return ((RoomDatabase$performClear$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 14:
                return ((RoomDatabase$performClear$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 15:
                return ((RoomDatabase$performClear$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 16:
                return ((RoomDatabase$performClear$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 17:
                return ((RoomDatabase$performClear$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 18:
                return ((RoomDatabase$performClear$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 19:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((RoomDatabase$performClear$1) create(bool, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 20:
                return ((RoomDatabase$performClear$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 21:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((RoomDatabase$performClear$1) create(bool2, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 22:
                return ((RoomDatabase$performClear$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                return ((RoomDatabase$performClear$1) create(bool3, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:188:0x03ae, code lost:
    
        if (com.squareup.cash.work.presenters.WorkHomePresenter.access$selectOption(r0, r1, r20) == r2) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x039c, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(r14, r20) == r2) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x037e, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(r3, r20) == r2) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x051e, code lost:
    
        if (r0 == r3) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x04e2, code lost:
    
        if (r4 == r3) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x05d5, code lost:
    
        if (r3.emit(r2, r20) == r0) goto L292;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x07a0, code lost:
    
        if (androidx.camera.camera2.impl.CapturePipelineImpl.access$unlockAf((androidx.camera.camera2.impl.CapturePipelineImpl) r10, 1000000000, r20) == r0) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x0778, code lost:
    
        if (kotlinx.coroutines.AwaitKt.joinAll(r1, r20) == r0) goto L398;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0576  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01da  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        RoomConnectionManager roomConnectionManager;
        DisabledClickableNode disabledClickableNode;
        long j;
        Object withContext;
        Object obj2;
        Object withContext2;
        Object updateCustomerPreferences;
        Object personalizedAdsToggle;
        PersonalizedAdsError personalizedAdsError;
        PersonalizedAdsError personalizedAdsError2;
        int i = this.$r8$classId;
        int i2 = 13;
        int i3 = 5;
        int i4 = 4;
        int i5 = 14;
        int i6 = 2;
        int i7 = 0;
        r9 = false;
        boolean z = false;
        i7 = 0;
        Object obj3 = this.$tableNames;
        int i8 = 1;
        Continuation continuation = null;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        switch (i) {
            case 0:
                RoomDatabase roomDatabase = (RoomDatabase) this.this$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    roomConnectionManager = roomDatabase.connectionManager;
                    Continuation continuation2 = null;
                    if (roomConnectionManager == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("connectionManager");
                        throw null;
                    }
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(roomDatabase, this.$hasForeignKeys, (String[]) obj3, continuation2, 0);
                    this.label = 1;
                    if (roomConnectionManager.connectionPool.useConnection(false, anonymousClass1, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i9 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                if (i10 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                        Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: Waiting for POST_CAPTURE signal");
                    }
                    List list = (List) this.this$0;
                    this.label = 1;
                    break;
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                            Log.d("CXCP", "CapturePipeline#defaultNoFlashCapture: Unlocking 3A done");
                        }
                        return Unit.INSTANCE;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                    Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: Waiting for POST_CAPTURE signal done");
                }
                if (this.$hasForeignKeys) {
                    if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                        Log.d("CXCP", "CapturePipeline#defaultNoFlashCapture: Unlocking 3A");
                    }
                    this.label = 2;
                    break;
                }
                return Unit.INSTANCE;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 != 0) {
                    if (i11 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                Deferred updateRepeatingRequestAsync = DeferredUseCaseCameraRequestControl.access$getOrCreateImpl((DeferredUseCaseCameraRequestControl) this.this$0).updateRepeatingRequestAsync((LinkedHashSet) obj3, this.$hasForeignKeys);
                this.label = 1;
                Object awaitInternal = ((CompletableDeferredImpl) updateRepeatingRequestAsync).awaitInternal(this);
                return awaitInternal == coroutineSingletons3 ? coroutineSingletons3 : awaitInternal;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Animatable animatable = (Animatable) this.this$0;
                    float f = this.$hasForeignKeys ? 1.0f : 0.8f;
                    this.label = 1;
                    if (Animatable.animateTo$default(animatable, new Float(f), (TweenSpec) obj3, null, null, this, 12) == coroutineSingletons4) {
                        return coroutineSingletons4;
                    }
                } else {
                    if (i12 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                if (i13 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (this.$hasForeignKeys && ((ShortlinkAction) this.this$0) == null) {
                        Duration.Companion companion = Duration.Companion;
                        long duration = DurationKt.toDuration(4, DurationUnit.SECONDS);
                        this.label = 1;
                        if (JobKt.m4182delayVtjQ1oo(duration, this) == coroutineSingletons5) {
                            return coroutineSingletons5;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i13 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                LocalPosBrandOnboardingPresenter localPosBrandOnboardingPresenter = (LocalPosBrandOnboardingPresenter) obj3;
                BetterNavigator.ScreenNavigator screenNavigator = localPosBrandOnboardingPresenter.navigator;
                String str = localPosBrandOnboardingPresenter.onboarding.close_button_client_route;
                if (str != null) {
                    localPosBrandOnboardingPresenter.launcher.openWeb(screenNavigator, str);
                } else {
                    screenNavigator.goTo(LocalTabScreen.INSTANCE);
                }
                return Unit.INSTANCE;
            case 5:
                Object obj4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MiSnapController miSnapController = (MiSnapController) this.this$0;
                    DefaultScheduler defaultScheduler = Dispatchers.Default;
                    DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.INSTANCE;
                    boolean z10 = this.$hasForeignKeys;
                    this.label = 1;
                    Object withContext3 = JobKt.withContext(defaultIoScheduler, new MiSnapController$analyzeFrame$3(miSnapController, (Frame) obj3, z10, null), this);
                    Object obj5 = withContext3;
                    if (withContext3 != obj4) {
                        obj5 = Unit.INSTANCE;
                    }
                    if (obj5 == obj4) {
                        return obj4;
                    }
                } else {
                    if (i14 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 6:
                MutableState mutableState = (MutableState) obj3;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (this.$hasForeignKeys) {
                        return Unit.INSTANCE;
                    }
                    AnimationPhase animationPhase = AnimationPhase.FRAME_SEQUENCE;
                    CubicBezierEasing cubicBezierEasing = ManagedAccountSwitchLoadingContentKt.BounceYEasing;
                    mutableState.setValue(animationPhase);
                    Animatable animatable2 = (Animatable) this.this$0;
                    Float f2 = new Float(1.0f);
                    TweenSpec tween$default = AnimatableKt.tween$default(1830, 0, ManagedAccountSwitchLoadingContentKt.FrameSequenceEasing, 2);
                    this.label = 1;
                    if (Animatable.animateTo$default(animatable2, f2, tween$default, null, null, this, 12) == coroutineSingletons6) {
                        return coroutineSingletons6;
                    }
                } else {
                    if (i15 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                AnimationPhase animationPhase2 = AnimationPhase.IDLE_BOUNCE;
                CubicBezierEasing cubicBezierEasing2 = ManagedAccountSwitchLoadingContentKt.BounceYEasing;
                mutableState.setValue(animationPhase2);
                return Unit.INSTANCE;
            case 7:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.label;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (this.$hasForeignKeys) {
                        SharedFlowImpl sharedFlowImpl = ((MutableInteractionSourceImpl) this.this$0).interactions;
                        RadioKt$Radio$2$1$1 radioKt$Radio$2$1$1 = new RadioKt$Radio$2$1$1(2, (Function0) obj3);
                        this.label = 1;
                        sharedFlowImpl.collect(radioKt$Radio$2$1$1, this);
                        return coroutineSingletons7;
                    }
                } else {
                    if (i16 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 8:
                DisabledClickableNode disabledClickableNode2 = (DisabledClickableNode) obj3;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.label;
                if (i17 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PressInteraction.Press press = disabledClickableNode2.pressInteraction;
                    if (press != null) {
                        boolean z11 = this.$hasForeignKeys;
                        MutableInteractionSourceImpl mutableInteractionSourceImpl = disabledClickableNode2.interactionSource;
                        if (!z11) {
                            PressInteraction.Cancel cancel = new PressInteraction.Cancel(press);
                            this.this$0 = null;
                            this.label = 2;
                            break;
                        } else {
                            PressInteraction.Release release = new PressInteraction.Release(press);
                            this.this$0 = disabledClickableNode2;
                            this.label = 1;
                            if (mutableInteractionSourceImpl.emit(release, this) != coroutineSingletons8) {
                                disabledClickableNode = disabledClickableNode2;
                                disabledClickableNode.onClick.invoke();
                            }
                        }
                        return coroutineSingletons8;
                    }
                } else if (i17 == 1) {
                    disabledClickableNode = (DisabledClickableNode) this.this$0;
                    SafeTrace.throwOnFailure(obj);
                    disabledClickableNode.onClick.invoke();
                } else {
                    if (i17 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                disabledClickableNode2.pressInteraction = null;
                return Unit.INSTANCE;
            case 9:
                boolean z12 = this.$hasForeignKeys;
                MutableState mutableState2 = (MutableState) obj3;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.label;
                if (i18 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    List list2 = FidesmoProvisioningViewKt.SNAKE_PATH;
                    mutableState2.setValue(Boolean.valueOf(!z12));
                    if (z12) {
                        WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0 workWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0 = SuccessAnimationTiming.contentRevealEasing;
                        TagFormFactor tagFormFactor = ((FidesmoProvisioningViewModel.Success.Provisioned) this.this$0).formFactor;
                        tagFormFactor.getClass();
                        int ordinal = tagFormFactor.ordinal();
                        if (ordinal != 0) {
                            if (ordinal != 1 && ordinal != 2) {
                                if (ordinal != 3) {
                                    if (ordinal != 4 && ordinal != 5) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return null;
                                    }
                                }
                            }
                            j = SuccessAnimationTiming.nonWandIntroMillis;
                            this.label = 1;
                            if (JobKt.delay(j, this) == coroutineSingletons9) {
                                return coroutineSingletons9;
                            }
                        }
                        j = SuccessAnimationTiming.wandIntroMillis;
                        this.label = 1;
                        if (JobKt.delay(j, this) == coroutineSingletons9) {
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i18 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                List list3 = FidesmoProvisioningViewKt.SNAKE_PATH;
                mutableState2.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 10:
                boolean z13 = this.$hasForeignKeys;
                MoneybotChatPresenter moneybotChatPresenter = (MoneybotChatPresenter) obj3;
                ProduceStateScope produceStateScope = (ProduceStateScope) this.this$0;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = this.label;
                if (i19 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CoroutineContext coroutineContext = moneybotChatPresenter.ioContext;
                    MoneybotChatPresenter$models$3$1 moneybotChatPresenter$models$3$1 = new MoneybotChatPresenter$models$3$1(moneybotChatPresenter, z2 ? 1 : 0, i6);
                    this.this$0 = produceStateScope;
                    this.label = 1;
                    withContext = JobKt.withContext(coroutineContext, moneybotChatPresenter$models$3$1, this);
                    break;
                } else {
                    if (i19 != 1) {
                        if (i19 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    withContext = obj;
                }
                String str2 = (String) withContext;
                if (str2 != null && z13) {
                    produceStateScope.setValue(moneybotChatPresenter.chatSessionManagerFactory.create$1(str2));
                }
                SafeFlow snapshotFlow = Updater.snapshotFlow(new MoneyTabUIKt$$ExternalSyntheticLambda5(moneybotChatPresenter, 7));
                if (str2 != null && z13) {
                    i7 = 1;
                }
                FlowKt__LimitKt$drop$$inlined$unsafeFlow$1 drop = FlowKt.drop(snapshotFlow, i7);
                OffersFilterGroupSheetPresenter$models$sheet$2$1$1 offersFilterGroupSheetPresenter$models$sheet$2$1$1 = new OffersFilterGroupSheetPresenter$models$sheet$2$1$1(i2, produceStateScope, moneybotChatPresenter);
                this.this$0 = null;
                this.label = 2;
                Object collect = drop.collect(new MoneyTabPresenter$models$lambda$17$$inlined$map$1.AnonymousClass2(offersFilterGroupSheetPresenter$models$sheet$2$1$1, i5), this);
                if (collect != coroutineSingletons10) {
                    collect = Unit.INSTANCE;
                    break;
                }
                break;
            case 11:
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = this.label;
                if (i20 != 0) {
                    if (i20 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                CredentialManagerBindingContainer$provideCredentialManagerWrapper$1 credentialManagerBindingContainer$provideCredentialManagerWrapper$1 = ((CredentialManagerPasskeyCreator) this.this$0).credentialManagerWrapper;
                GetCredentialRequest getCredentialRequest = new GetCredentialRequest(14, CollectionsKt__CollectionsJVMKt.listOf(new GetPublicKeyCredentialOption((String) obj3)), this.$hasForeignKeys);
                this.label = 1;
                DefaultScheduler defaultScheduler2 = Dispatchers.Default;
                Object withContext4 = JobKt.withContext(DefaultIoScheduler.INSTANCE, new RealMRIFactory$sign$2(credentialManagerBindingContainer$provideCredentialManagerWrapper$1.$credentialManager, credentialManagerBindingContainer$provideCredentialManagerWrapper$1.$activity, getCredentialRequest, null, 28), this);
                return withContext4 == coroutineSingletons11 ? coroutineSingletons11 : withContext4;
            case 12:
                Pair pair = (Pair) this.this$0;
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.label;
                if (i21 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ClientScenario clientScenario = (ClientScenario) pair.first;
                    InitiatePaymentRequest initiatePaymentRequest = (InitiatePaymentRequest) pair.second;
                    Timber.Forest.d("Retrying payment(" + clientScenario + "): " + initiatePaymentRequest.external_id, new Object[0]);
                    PaymentNavigator paymentNavigator = (PaymentNavigator) ((RealOfflineManager) obj3).paymentNavigator.getValue();
                    boolean z14 = this.$hasForeignKeys ^ true;
                    this.this$0 = null;
                    this.label = 1;
                    if (((RealPaymentNavigator) paymentNavigator).retryPayment(clientScenario, initiatePaymentRequest, z14, this) == coroutineSingletons12) {
                        return coroutineSingletons12;
                    }
                } else {
                    if (i21 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 13:
                PaymentConfigurationPresenter paymentConfigurationPresenter = (PaymentConfigurationPresenter) obj3;
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = this.label;
                if (i22 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (this.$hasForeignKeys && zzahh.isStablecoinWithdrawalRecipient(((PaymentConfigurationViewModel.ReviewPayment) this.this$0).recipient)) {
                        KeyValue keyValue = paymentConfigurationPresenter.hasSeenStablecoinWithdrawalOnboarding;
                        this.label = 1;
                        obj2 = keyValue.get(this);
                        if (obj2 == coroutineSingletons13) {
                            return coroutineSingletons13;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i22 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                obj2 = obj;
                if (((Boolean) obj2).booleanValue()) {
                    return Unit.INSTANCE;
                }
                paymentConfigurationPresenter.navigator.goTo(new StablecoinOnboardingScreen(StablecoinOnboardingType.WITHDRAWAL, false));
                return Unit.INSTANCE;
            case 14:
                WorkHomePresenter workHomePresenter = (WorkHomePresenter) this.this$0;
                PhonePlansEsimCheckBlockerScreen phonePlansEsimCheckBlockerScreen = (PhonePlansEsimCheckBlockerScreen) workHomePresenter.shiftSection2Presenter;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i23 = this.label;
                if (i23 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Long l = phonePlansEsimCheckBlockerScreen.blocker.loading_duration_ms;
                    long longValue = l != null ? l.longValue() : 800L;
                    this.label = 1;
                    break;
                } else if (i23 == 1) {
                    SafeTrace.throwOnFailure(obj);
                } else if (i23 == 2) {
                    SafeTrace.throwOnFailure(obj);
                    String str3 = phonePlansEsimCheckBlockerScreen.blocker.esim_supported_action;
                    if (str3 == null) {
                        str3 = "supported";
                    }
                    this.label = 3;
                    break;
                } else {
                    if (i23 == 3) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ((MutableState) obj3).setValue(Boolean.FALSE);
                if (this.$hasForeignKeys) {
                    Long l2 = phonePlansEsimCheckBlockerScreen.blocker.confirmed_duration_ms;
                    long longValue2 = l2 != null ? l2.longValue() : 800L;
                    this.label = 2;
                    break;
                }
                return Unit.INSTANCE;
            case 15:
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i24 = this.label;
                if (i24 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!this.$hasForeignKeys) {
                        this.label = 1;
                        if (JobKt.delay(500L, this) == coroutineSingletons15) {
                            return coroutineSingletons15;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i24 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                ((MutableState) obj3).setValue(Boolean.valueOf(((ContributionAnimation) this.this$0) != null));
                return Unit.INSTANCE;
            case 16:
                CancellableContinuationImpl cancellableContinuationImpl = (CancellableContinuationImpl) obj3;
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = this.label;
                if (i25 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealProfileManager realProfileManager = ((ProfilePrivacyPresenter) this.this$0).profileManager;
                    boolean z15 = this.$hasForeignKeys;
                    this.label = 1;
                    withContext2 = JobKt.withContext(realProfileManager.ioDispatcher, new RealBoostSyncer$refresh$1((Object) realProfileManager, z15, (Continuation) (z3 ? 1 : 0), i4), this);
                    if (withContext2 == coroutineSingletons16) {
                        return coroutineSingletons16;
                    }
                } else {
                    if (i25 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    withContext2 = obj;
                }
                ApiResult apiResult = (ApiResult) withContext2;
                if (cancellableContinuationImpl.getState$kotlinx_coroutines_core() instanceof NotCompleted) {
                    Result.Companion companion2 = Result.Companion;
                    cancellableContinuationImpl.resumeWith(apiResult);
                }
                return Unit.INSTANCE;
            case 17:
                boolean z16 = this.$hasForeignKeys;
                PoolsListPresenter poolsListPresenter = (PoolsListPresenter) this.this$0;
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i26 = this.label;
                if (i26 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    updateCustomerPreferences = ((CustomerPreferencesService) poolsListPresenter.analytics).updateCustomerPreferences(new UpdateCustomerPreferencesRequest(new CommerceBrowserAutofillPreferences(Boolean.valueOf(z16))), this);
                    if (updateCustomerPreferences == coroutineSingletons17) {
                        return coroutineSingletons17;
                    }
                } else {
                    if (i26 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    updateCustomerPreferences = obj;
                }
                if (!(((ApiResult) updateCustomerPreferences) instanceof ApiResult.Success)) {
                    ((MutableState) obj3).setValue(Boolean.valueOf(z16));
                    ((BetterNavigator.ScreenNavigator) poolsListPresenter.navigator).goTo(new ProfileScreens.ErrorScreen(((AndroidStringManager) poolsListPresenter.stringManager).get(R.string.auto_fill_preferences_update_error_message), z4 ? 1 : 0, i5));
                }
                return Unit.INSTANCE;
            case 18:
                ShiftNotePresenter$models$1$1 shiftNotePresenter$models$1$1 = (ShiftNotePresenter$models$1$1) obj3;
                boolean z17 = this.$hasForeignKeys;
                LocalHomePresenter localHomePresenter = (LocalHomePresenter) this.this$0;
                BetterNavigator.ScreenNavigator screenNavigator2 = (BetterNavigator.ScreenNavigator) localHomePresenter.navigator;
                AndroidStringManager androidStringManager = (AndroidStringManager) localHomePresenter.featureFlagManager;
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i27 = this.label;
                if (i27 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PersonalizedAdsToggleRequest personalizedAdsToggleRequest = new PersonalizedAdsToggleRequest(new CopyParameters(new Integer(3), ((String) localHomePresenter.tabContentPresenterFactory).equals("production") ? "CG_btcgichZQw3Q85Ms2FIQaD" : "CG_rAlVAhY0P7kWST85uaQQcD", ((Locale) ((RealLocaleManager) localHomePresenter.localHomeGeoPresenterFactory).resolvedLocale.$$delegate_0.getValue()).toLanguageTag()), z17 ? PersonalizedAdsToggleRequest.OptType.OPT_TYPE_OPT_IN : PersonalizedAdsToggleRequest.OptType.OPT_TYPE_OPT_OUT, ByteString.EMPTY);
                    CashPlatoAppService cashPlatoAppService = (CashPlatoAppService) localHomePresenter.clearMarketingBadgesIfNeeded;
                    this.label = 1;
                    personalizedAdsToggle = cashPlatoAppService.personalizedAdsToggle(personalizedAdsToggleRequest, this);
                    if (personalizedAdsToggle == coroutineSingletons18) {
                        return coroutineSingletons18;
                    }
                } else {
                    if (i27 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    personalizedAdsToggle = obj;
                }
                ApiResult apiResult2 = (ApiResult) personalizedAdsToggle;
                if (apiResult2 instanceof ApiResult.Success) {
                    zzuj zzujVar = ((PersonalizedAdsToggleResponse) ((ApiResult.Success) apiResult2).response).response;
                    if (zzujVar != null) {
                        PersonalizedAdsToggleResponse$Response$Error personalizedAdsToggleResponse$Response$Error = zzujVar instanceof PersonalizedAdsToggleResponse$Response$Error ? (PersonalizedAdsToggleResponse$Response$Error) zzujVar : null;
                        if (personalizedAdsToggleResponse$Response$Error != null) {
                            personalizedAdsError = personalizedAdsToggleResponse$Response$Error.value;
                            if (personalizedAdsError == null) {
                                Timber.Forest forest = Timber.Forest;
                                if (zzujVar != null) {
                                    PersonalizedAdsToggleResponse$Response$Error personalizedAdsToggleResponse$Response$Error2 = zzujVar instanceof PersonalizedAdsToggleResponse$Response$Error ? (PersonalizedAdsToggleResponse$Response$Error) zzujVar : null;
                                    if (personalizedAdsToggleResponse$Response$Error2 != null) {
                                        personalizedAdsError2 = personalizedAdsToggleResponse$Response$Error2.value;
                                        forest.e("Personalized ads toggle response contains error: " + personalizedAdsError2, new Object[0]);
                                        screenNavigator2.goTo(new ProfileScreens.ErrorScreen(androidStringManager.get(R.string.profile_error_message_update), z6 ? 1 : 0, i5));
                                        shiftNotePresenter$models$1$1.invoke(Boolean.valueOf(z17 ^ true));
                                    }
                                }
                                personalizedAdsError2 = null;
                                forest.e("Personalized ads toggle response contains error: " + personalizedAdsError2, new Object[0]);
                                screenNavigator2.goTo(new ProfileScreens.ErrorScreen(androidStringManager.get(R.string.profile_error_message_update), z6 ? 1 : 0, i5));
                                shiftNotePresenter$models$1$1.invoke(Boolean.valueOf(z17 ^ true));
                            } else {
                                Timber.Forest.d("Successfully toggled personalized ads to: " + z17, new Object[0]);
                            }
                        }
                    }
                    personalizedAdsError = null;
                    if (personalizedAdsError == null) {
                    }
                } else {
                    if (!(apiResult2 instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    ApiResult.Failure failure = (ApiResult.Failure) apiResult2;
                    Timber.Forest.e("Failed to toggle personalized ads setting: " + TextUtilsCompat.errorMessaging(androidStringManager, failure, null), new Object[0]);
                    screenNavigator2.goTo(new ProfileScreens.ErrorScreen(TextUtilsCompat.errorMessaging(androidStringManager, failure, new Integer(R.string.profile_error_message_update)).message, z5 ? 1 : 0, i5));
                    shiftNotePresenter$models$1$1.invoke(Boolean.valueOf(z17 ^ true));
                }
                return Unit.INSTANCE;
            case 19:
                boolean z18 = this.$hasForeignKeys;
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i28 = this.label;
                if (i28 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    InteractiveCardState interactiveCardState = (InteractiveCardState) this.this$0;
                    if (z18) {
                        int i29 = HeroCardViewKt.$r8$clinit;
                        if (!((Boolean) ((MutableState) obj3).getValue()).booleanValue()) {
                            z = true;
                        }
                    }
                    this.$hasForeignKeys = z18;
                    this.label = 1;
                    if (interactiveCardState.animateCopyAlpha(z, this) == coroutineSingletons19) {
                        return coroutineSingletons19;
                    }
                } else {
                    if (i28 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 20:
                InteractiveCardState interactiveCardState2 = (InteractiveCardState) obj3;
                CoroutineScope coroutineScope = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i30 = this.label;
                if (i30 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Animatable animatable3 = interactiveCardState2.copyAlpha;
                    Float f3 = new Float(1.0f);
                    this.this$0 = coroutineScope;
                    this.label = 1;
                    if (animatable3.snapTo(f3, this) == coroutineSingletons20) {
                        return coroutineSingletons20;
                    }
                } else {
                    if (i30 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                JobKt.launch$default(coroutineScope, null, null, new InteractiveCardState$shimmerAnimation$2(interactiveCardState2, z8 ? 1 : 0, i2), 3);
                return JobKt.launch$default(coroutineScope, null, null, new HeroCardViewKt$Render$1$4$1$2$1$3(interactiveCardState2, this.$hasForeignKeys, z7 ? 1 : 0, i8), 3);
            case 21:
                boolean z19 = this.$hasForeignKeys;
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i31 = this.label;
                if (i31 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!z19) {
                        SafeFlow snapshotFlow2 = Updater.snapshotFlow(new CoreInteractiveCardKt$$ExternalSyntheticLambda4((CardRegistry.SharedCardTransitionState) this.this$0, i3));
                        WorkflowNode$tick$1$1 workflowNode$tick$1$1 = new WorkflowNode$tick$1$1(obj3, (Continuation) (z9 ? 1 : 0), 20);
                        this.$hasForeignKeys = z19;
                        this.label = 1;
                        if (FlowKt.collectLatest(snapshotFlow2, workflowNode$tick$1$1, this) == coroutineSingletons21) {
                            return coroutineSingletons21;
                        }
                    }
                } else {
                    if (i31 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 22:
                CardNuxState cardNuxState = (CardNuxState) this.this$0;
                MutableState mutableState3 = (MutableState) obj3;
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i32 = this.label;
                if (i32 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!this.$hasForeignKeys) {
                        mutableState3.setValue(Boolean.FALSE);
                        return Unit.INSTANCE;
                    }
                    SquareAccountStore$userFlow$$inlined$map$1 squareAccountStore$userFlow$$inlined$map$1 = new SquareAccountStore$userFlow$$inlined$map$1(((CardGridNuxScene) cardNuxState.lazyCardGridNuxScene.getValue()).ready, 9);
                    WorkflowNode$tick$1$1 workflowNode$tick$1$12 = new WorkflowNode$tick$1$1(cardNuxState, mutableState3, continuation, 21);
                    this.label = 1;
                    if (FlowKt.collectLatest(squareAccountStore$userFlow$$inlined$map$1, workflowNode$tick$1$12, this) == coroutineSingletons22) {
                        return coroutineSingletons22;
                    }
                } else {
                    if (i32 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            default:
                boolean z20 = this.$hasForeignKeys;
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i33 = this.label;
                if (i33 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (z20) {
                        this.$hasForeignKeys = z20;
                        this.label = 1;
                        if (((Function2) this.this$0).invoke((CoroutineScope) obj3, this) == coroutineSingletons23) {
                            return coroutineSingletons23;
                        }
                    }
                } else {
                    if (i33 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RoomDatabase$performClear$1(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
        this.$tableNames = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RoomDatabase$performClear$1(Object obj, Continuation continuation, boolean z, Object obj2, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
        this.$hasForeignKeys = z;
        this.$tableNames = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RoomDatabase$performClear$1(Object obj, boolean z, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
        this.$hasForeignKeys = z;
        this.$tableNames = obj2;
    }

    /* renamed from: androidx.room.RoomDatabase$performClear$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements Function2 {
        public /* synthetic */ boolean $hasForeignKeys;
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ Object $tableNames;
        public Object L$0;
        public int label;
        public Object this$0;

        /* renamed from: androidx.room.RoomDatabase$performClear$1$1$1, reason: invalid class name and collision with other inner class name */
        public final class C00021 extends SuspendLambda implements Function2 {
            public final /* synthetic */ boolean $hasForeignKeys;
            public final /* synthetic */ String[] $tableNames;
            public int I$0;
            public int I$1;
            public /* synthetic */ Object L$0;
            public String[] L$1;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00021(boolean z, String[] strArr, Continuation continuation) {
                super(2, continuation);
                this.$hasForeignKeys = z;
                this.$tableNames = strArr;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                C00021 c00021 = new C00021(this.$hasForeignKeys, this.$tableNames, continuation);
                c00021.L$0 = obj;
                return c00021;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ((C00021) create((TransactionScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x0066, code lost:
            
                return r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x003f, code lost:
            
                if (androidx.room.TransactorKt.execSQL(r1, "PRAGMA defer_foreign_keys = TRUE", r9) == r0) goto L19;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x0064, code lost:
            
                if (androidx.room.TransactorKt.execSQL(r6, r10, r9) == r0) goto L19;
             */
            /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x004c  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0064 -> B:6:0x0067). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                TransactionScope transactionScope;
                TransactionScope transactionScope2;
                int length;
                int i;
                String[] strArr;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    transactionScope = (TransactionScope) this.L$0;
                    if (this.$hasForeignKeys) {
                        this.L$0 = transactionScope;
                        this.label = 1;
                    }
                } else if (i2 == 1) {
                    transactionScope = (TransactionScope) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                } else {
                    if (i2 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    length = this.I$1;
                    i = this.I$0;
                    strArr = this.L$1;
                    transactionScope2 = (TransactionScope) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    i++;
                    if (i < length) {
                        return Unit.INSTANCE;
                    }
                    String m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m('`', "DELETE FROM `", strArr[i]);
                    this.L$0 = transactionScope2;
                    this.L$1 = strArr;
                    this.I$0 = i;
                    this.I$1 = length;
                    this.label = 2;
                }
                String[] strArr2 = this.$tableNames;
                transactionScope2 = transactionScope;
                length = strArr2.length;
                i = 0;
                strArr = strArr2;
                if (i < length) {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Deferred deferred, IntegrityCheck integrityCheck, boolean z, SupervisorJobImpl supervisorJobImpl, Continuation continuation) {
            super(2, continuation);
            this.$r8$classId = 14;
            this.L$0 = deferred;
            this.this$0 = integrityCheck;
            this.$hasForeignKeys = z;
            this.$tableNames = supervisorJobImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            int i = this.$r8$classId;
            Object obj2 = this.$tableNames;
            switch (i) {
                case 0:
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1((RoomDatabase) this.this$0, this.$hasForeignKeys, (String[]) obj2, continuation, 0);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                case 1:
                    return new AnonymousClass1(this.$hasForeignKeys, (LazyLayoutItemAnimation) this.L$0, (FiniteAnimationSpec) this.this$0, (GraphicsLayer) obj2, continuation, 1);
                case 2:
                    return new AnonymousClass1((MutableState) this.this$0, this.$hasForeignKeys, (MutableInteractionSourceImpl) obj2, continuation, 2);
                case 3:
                    return new AnonymousClass1((Animatable) this.L$0, this.$hasForeignKeys, (TweenSpec) this.this$0, (Function0) obj2, continuation, 3);
                case 4:
                    return new AnonymousClass1(this.$hasForeignKeys, (Function1) this.L$0, (MutableInteractionSourceImpl) this.this$0, (Function0) obj2, continuation, 4);
                case 5:
                    return new AnonymousClass1(this.$hasForeignKeys, (Function0) this.L$0, (MutableInteractionSourceImpl) this.this$0, (Function0) obj2, continuation, 5);
                case 6:
                    return new AnonymousClass1(this.$hasForeignKeys, (EndAppLockPresenter) this.L$0, (MutableState) this.this$0, (MutableState) obj2, continuation, 6);
                case 7:
                    return new AnonymousClass1(this.$hasForeignKeys, (AnimatedAmountTextView.Amount) this.L$0, (Function0) this.this$0, (MutableState) obj2, continuation, 7);
                case 8:
                    AnonymousClass1 anonymousClass12 = new AnonymousClass1(this.$hasForeignKeys, (RealEarningsTrackerRepository) this.this$0, (DateFilter) obj2, continuation, 8);
                    anonymousClass12.L$0 = obj;
                    return anonymousClass12;
                case 9:
                    return new AnonymousClass1((TransfersPresenter) this.L$0, this.$hasForeignKeys, (MutableState) this.this$0, (MutableState) obj2, continuation, 9);
                case 10:
                    return new AnonymousClass1(this.$hasForeignKeys, (FidesmoProvisioningViewModel.Activating) this.this$0, (ProvisioningHaptics) obj2, continuation, 10);
                case 11:
                    return new AnonymousClass1((Automation) this.L$0, this.$hasForeignKeys, (RealAccountOutboundNavigator) this.this$0, (GrowToolsManagerState) obj2, continuation, 11);
                case 12:
                    AnonymousClass1 anonymousClass13 = new AnonymousClass1((RealHistoricalPriceTickRefresher) this.L$0, (HistoricalRange) this.this$0, (ProducerScope) obj2, continuation);
                    anonymousClass13.$hasForeignKeys = ((Boolean) obj).booleanValue();
                    return anonymousClass13;
                case 13:
                    return new AnonymousClass1(this.$hasForeignKeys, (MoneyTabPresenter) this.L$0, (MutableState) this.this$0, (ArrayList) obj2, continuation, 13);
                case 14:
                    return new AnonymousClass1((Deferred) this.L$0, (IntegrityCheck) this.this$0, this.$hasForeignKeys, (SupervisorJobImpl) obj2, continuation);
                case 15:
                    AnonymousClass1 anonymousClass14 = new AnonymousClass1((List) obj2, this.$hasForeignKeys, continuation);
                    anonymousClass14.L$0 = obj;
                    return anonymousClass14;
                case 16:
                    return new AnonymousClass1(this.$hasForeignKeys, (String) this.L$0, (MutableState) this.this$0, (MutableState) obj2, continuation, 16);
                case 17:
                    AnonymousClass1 anonymousClass15 = new AnonymousClass1((Flow) this.this$0, continuation, (TaxReturnsPresenter) obj2, this.$hasForeignKeys);
                    anonymousClass15.L$0 = obj;
                    return anonymousClass15;
                case 18:
                    return new AnonymousClass1(this.$hasForeignKeys, (ShoppingWebPresenter) this.L$0, (MutableState) this.this$0, (MutableState) obj2, continuation, 18);
                case 19:
                    return new AnonymousClass1(this.$hasForeignKeys, (SnapshotStateList) this.this$0, (MutableState) obj2, continuation, 19);
                case 20:
                    AnonymousClass1 anonymousClass16 = new AnonymousClass1(this.$hasForeignKeys, (RealShiftsTileDataLoader) obj2, continuation);
                    anonymousClass16.L$0 = obj;
                    return anonymousClass16;
                default:
                    return new AnonymousClass1(this.$hasForeignKeys, (ScrollState) this.L$0, (NetworkingLinkSignupState.Payload) this.this$0, (FocusRequester) obj2, continuation, 21);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            switch (this.$r8$classId) {
                case 0:
                    return ((AnonymousClass1) create((Transactor) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 1:
                    return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 2:
                    return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 3:
                    return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 4:
                    return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 5:
                    return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 6:
                    return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 7:
                    return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 8:
                    return ((AnonymousClass1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 9:
                    return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 10:
                    return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 11:
                    return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 12:
                    Boolean bool = (Boolean) obj;
                    bool.getClass();
                    return ((AnonymousClass1) create(bool, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 13:
                    return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 14:
                    return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 15:
                    return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 16:
                    return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 17:
                    return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 18:
                    return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 19:
                    return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 20:
                    return ((AnonymousClass1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                default:
                    return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:101:0x01a4, code lost:
        
            if (kotlinx.coroutines.JobKt.delay(200, r25) == r1) goto L94;
         */
        /* JADX WARN: Code restructure failed: missing block: B:105:0x01ba, code lost:
        
            if (kotlinx.coroutines.JobKt.delay(300, r25) == r1) goto L94;
         */
        /* JADX WARN: Code restructure failed: missing block: B:269:0x0583, code lost:
        
            if (r8.emit(r1, r25) == r12) goto L270;
         */
        /* JADX WARN: Code restructure failed: missing block: B:271:?, code lost:
        
            return r12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:278:0x05a6, code lost:
        
            if (r8.emit(r0, r25) == r12) goto L270;
         */
        /* JADX WARN: Code restructure failed: missing block: B:280:0x05b4, code lost:
        
            if (r8.emit(com.squareup.cash.earningstracker.backend.api.EarningsTrackerDataResult.Failure.INSTANCE, r25) == r12) goto L270;
         */
        /* JADX WARN: Code restructure failed: missing block: B:285:0x054d, code lost:
        
            if (r0 == r12) goto L270;
         */
        /* JADX WARN: Code restructure failed: missing block: B:289:0x0505, code lost:
        
            if (r8.emit(r14, r25) == r12) goto L270;
         */
        /* JADX WARN: Code restructure failed: missing block: B:295:0x0535, code lost:
        
            if (r8.emit(r3, r25) == r12) goto L270;
         */
        /* JADX WARN: Code restructure failed: missing block: B:297:0x0541, code lost:
        
            if (r8.emit(r14, r25) == r12) goto L270;
         */
        /* JADX WARN: Code restructure failed: missing block: B:324:0x0640, code lost:
        
            if (kotlinx.coroutines.JobKt.delay(r2, r25) == r1) goto L300;
         */
        /* JADX WARN: Code restructure failed: missing block: B:326:?, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:332:0x05fc, code lost:
        
            if (androidx.compose.runtime.Updater.getMonotonicFrameClock(getContext()).withFrameNanos(r25, r2) == r1) goto L300;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00b3, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.emitAll(r0, (kotlinx.coroutines.flow.Flow) r3, r25) == r1) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:?, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00a4, code lost:
        
            if (r3 == r1) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:441:0x0821, code lost:
        
            if (r0 == r8) goto L405;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0095, code lost:
        
            if (r0.emit(com.squareup.cash.work.applets.presenters.ShiftsTileState.Loading.INSTANCE, r25) == r1) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:464:0x08e3, code lost:
        
            if (androidx.room.TransactorKt.execSQL(r3, "VACUUM", r25) == r1) goto L441;
         */
        /* JADX WARN: Code restructure failed: missing block: B:466:?, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:471:0x08d5, code lost:
        
            if (androidx.room.TransactorKt.execSQL(r3, "PRAGMA wal_checkpoint(FULL)", r25) == r1) goto L441;
         */
        /* JADX WARN: Code restructure failed: missing block: B:474:0x08bf, code lost:
        
            if (r4 == r1) goto L441;
         */
        /* JADX WARN: Code restructure failed: missing block: B:477:0x08b4, code lost:
        
            if (r3.withTransaction(r4, r7, r25) != r1) goto L431;
         */
        /* JADX WARN: Code restructure failed: missing block: B:482:0x089c, code lost:
        
            if (r4.sync$room_runtime_release(r25) == r1) goto L441;
         */
        /* JADX WARN: Code restructure failed: missing block: B:484:0x0885, code lost:
        
            if (r4 == r1) goto L441;
         */
        /* JADX WARN: Finally extract failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Transactor transactor;
            Object inTransaction;
            Object inTransaction2;
            Object animateTo$default;
            Object first;
            Money money;
            Long l;
            Object access$loadEarningsTrackerDataFromNetwork;
            ProvisioningHaptics provisioningHaptics;
            Object updateAutomationForFlow;
            Object await;
            SupervisorJobImpl supervisorJobImpl;
            Object awaitAll;
            InteractiveCardState interactiveCardState;
            Object access$loadTileStateFlow;
            int i = this.$r8$classId;
            float f = RecyclerView.DECELERATION_RATE;
            int i2 = 10;
            int i3 = 20;
            int i4 = 0;
            Object obj2 = this.$tableNames;
            int i5 = 1;
            Continuation continuation = null;
            switch (i) {
                case 0:
                    RoomDatabase roomDatabase = (RoomDatabase) this.this$0;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    switch (this.label) {
                        case 0:
                            SafeTrace.throwOnFailure(obj);
                            transactor = (Transactor) this.L$0;
                            this.L$0 = transactor;
                            this.label = 1;
                            inTransaction = transactor.inTransaction(this);
                            break;
                        case 1:
                            transactor = (Transactor) this.L$0;
                            SafeTrace.throwOnFailure(obj);
                            inTransaction = obj;
                            if (!((Boolean) inTransaction).booleanValue()) {
                                InvalidationTracker invalidationTracker = roomDatabase.getInvalidationTracker();
                                this.L$0 = transactor;
                                this.label = 2;
                                break;
                            }
                            Transactor.SQLiteTransactionType sQLiteTransactionType = Transactor.SQLiteTransactionType.IMMEDIATE;
                            C00021 c00021 = new C00021(this.$hasForeignKeys, (String[]) obj2, null);
                            this.L$0 = transactor;
                            this.label = 3;
                            break;
                        case 2:
                            transactor = (Transactor) this.L$0;
                            SafeTrace.throwOnFailure(obj);
                            Transactor.SQLiteTransactionType sQLiteTransactionType2 = Transactor.SQLiteTransactionType.IMMEDIATE;
                            C00021 c000212 = new C00021(this.$hasForeignKeys, (String[]) obj2, null);
                            this.L$0 = transactor;
                            this.label = 3;
                            break;
                        case 3:
                            transactor = (Transactor) this.L$0;
                            SafeTrace.throwOnFailure(obj);
                            this.L$0 = transactor;
                            this.label = 4;
                            inTransaction2 = transactor.inTransaction(this);
                            break;
                        case 4:
                            transactor = (Transactor) this.L$0;
                            SafeTrace.throwOnFailure(obj);
                            inTransaction2 = obj;
                            if (!((Boolean) inTransaction2).booleanValue()) {
                                this.L$0 = transactor;
                                this.label = 5;
                                break;
                            }
                            return Unit.INSTANCE;
                        case 5:
                            transactor = (Transactor) this.L$0;
                            SafeTrace.throwOnFailure(obj);
                            this.L$0 = null;
                            this.label = 6;
                            break;
                        case 6:
                            SafeTrace.throwOnFailure(obj);
                            InvalidationTracker invalidationTracker2 = roomDatabase.getInvalidationTracker();
                            invalidationTracker2.implementation.refreshInvalidationAsync$room_runtime_release(invalidationTracker2.onRefreshScheduled, invalidationTracker2.onRefreshCompleted);
                            return Unit.INSTANCE;
                        default:
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                    }
                case 1:
                    LazyLayoutItemAnimation lazyLayoutItemAnimation = (LazyLayoutItemAnimation) this.L$0;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i6 = this.label;
                    try {
                        if (i6 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            if (this.$hasForeignKeys) {
                                Animatable animatable = lazyLayoutItemAnimation.visibilityAnimation;
                                Float f2 = new Float(RecyclerView.DECELERATION_RATE);
                                this.label = 1;
                                if (animatable.snapTo(f2, this) == coroutineSingletons2) {
                                    return coroutineSingletons2;
                                }
                            }
                        } else {
                            if (i6 != 1) {
                                if (i6 != 2) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj);
                                animateTo$default = obj;
                                lazyLayoutItemAnimation.setAppearanceAnimationInProgress(false);
                                return Unit.INSTANCE;
                            }
                            SafeTrace.throwOnFailure(obj);
                        }
                        Animatable animatable2 = lazyLayoutItemAnimation.visibilityAnimation;
                        Float f3 = new Float(1.0f);
                        FiniteAnimationSpec finiteAnimationSpec = (FiniteAnimationSpec) this.this$0;
                        LazyLayoutItemAnimation$animateAppearance$2$$ExternalSyntheticLambda0 lazyLayoutItemAnimation$animateAppearance$2$$ExternalSyntheticLambda0 = new LazyLayoutItemAnimation$animateAppearance$2$$ExternalSyntheticLambda0((GraphicsLayer) obj2, lazyLayoutItemAnimation, 0);
                        this.label = 2;
                        animateTo$default = Animatable.animateTo$default(animatable2, f3, finiteAnimationSpec, null, lazyLayoutItemAnimation$animateAppearance$2$$ExternalSyntheticLambda0, this, 4);
                        break;
                    } catch (Throwable th) {
                        lazyLayoutItemAnimation.setAppearanceAnimationInProgress(false);
                        throw th;
                    }
                case 2:
                    MutableState mutableState = (MutableState) this.this$0;
                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i7 = this.label;
                    if (i7 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        PressInteraction.Press press = (PressInteraction.Press) mutableState.getValue();
                        if (press != null) {
                            MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) obj2;
                            Interaction release = this.$hasForeignKeys ? new PressInteraction.Release(press) : new PressInteraction.Cancel(press);
                            if (mutableInteractionSourceImpl != null) {
                                this.L$0 = mutableState;
                                this.label = 1;
                                if (mutableInteractionSourceImpl.emit(release, this) == coroutineSingletons3) {
                                    return coroutineSingletons3;
                                }
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    if (i7 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mutableState = (MutableState) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    mutableState.setValue(null);
                    return Unit.INSTANCE;
                case 3:
                    CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i8 = this.label;
                    if (i8 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Animatable animatable3 = (Animatable) this.L$0;
                        if (this.$hasForeignKeys) {
                            f = 1.0f;
                        }
                        Float f4 = new Float(f);
                        TweenSpec tweenSpec = (TweenSpec) this.this$0;
                        this.label = 1;
                        if (Animatable.animateTo$default(animatable3, f4, tweenSpec, null, null, this, 12) == coroutineSingletons4) {
                            return coroutineSingletons4;
                        }
                    } else {
                        if (i8 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    ((Function0) obj2).invoke();
                    return Unit.INSTANCE;
                case 4:
                    CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i9 = this.label;
                    if (i9 != 0) {
                        if (i9 == 1) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    if (!this.$hasForeignKeys || ((Function1) this.L$0) == null) {
                        return Unit.INSTANCE;
                    }
                    SharedFlowImpl sharedFlowImpl = ((MutableInteractionSourceImpl) this.this$0).interactions;
                    RadioKt$Radio$2$1$1 radioKt$Radio$2$1$1 = new RadioKt$Radio$2$1$1(1, (Function0) obj2);
                    this.label = 1;
                    sharedFlowImpl.collect(radioKt$Radio$2$1$1, this);
                    return coroutineSingletons5;
                case 5:
                    CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i10 = this.label;
                    if (i10 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        if (this.$hasForeignKeys && ((Function0) this.L$0) != null) {
                            SharedFlowImpl sharedFlowImpl2 = ((MutableInteractionSourceImpl) this.this$0).interactions;
                            RadioKt$Radio$2$1$1 radioKt$Radio$2$1$12 = new RadioKt$Radio$2$1$1(0, (Function0) obj2);
                            this.label = 1;
                            sharedFlowImpl2.collect(radioKt$Radio$2$1$12, this);
                            return coroutineSingletons6;
                        }
                    } else {
                        if (i10 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 6:
                    EndAppLockPresenter endAppLockPresenter = (EndAppLockPresenter) this.L$0;
                    MutableState mutableState2 = (MutableState) this.this$0;
                    CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = this.label;
                    if (i11 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        if (!this.$hasForeignKeys || ((Boolean) mutableState2.getValue()).booleanValue()) {
                            return Unit.INSTANCE;
                        }
                        ChannelFlowTransformLatest select = ((RealBalanceSnapshotManager) endAppLockPresenter.navigatorSwitcher).select();
                        this.label = 1;
                        first = FlowKt.first(select, this);
                        if (first == coroutineSingletons7) {
                            return coroutineSingletons7;
                        }
                    } else {
                        if (i11 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        first = obj;
                    }
                    BalanceSnapshot balanceSnapshot = (BalanceSnapshot) first;
                    if (((balanceSnapshot == null || (money = balanceSnapshot.balance) == null || (l = money.amount) == null) ? 0L : l.longValue()) > 0) {
                        mutableState2.setValue(Boolean.TRUE);
                        ((UiCallbackModel) ((MutableState) obj2).getValue()).onEvent.invoke(ActivityEmbeddedViewEvent.Refresh.INSTANCE);
                    }
                    return Unit.INSTANCE;
                case 7:
                    AnimatedAmountTextView.Amount amount = (AnimatedAmountTextView.Amount) this.L$0;
                    CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i12 = this.label;
                    if (i12 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        if (!this.$hasForeignKeys) {
                            return Unit.INSTANCE;
                        }
                        ComposeDialogKt$$ExternalSyntheticLambda14 composeDialogKt$$ExternalSyntheticLambda14 = new ComposeDialogKt$$ExternalSyntheticLambda14(27);
                        this.label = 1;
                        break;
                    } else {
                        if (i12 != 1) {
                            if (i12 != 2) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                            ((Function0) this.this$0).invoke();
                            return Unit.INSTANCE;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    ArrayList arrayList = EarningsHeaderKt.LOADING_CHART_BARS;
                    ((MutableState) obj2).setValue(amount);
                    String str = amount.text;
                    int i13 = 0;
                    for (int i14 = 0; i14 < str.length(); i14++) {
                        char charAt = str.charAt(i14);
                        if (charAt != ',' && charAt != '.') {
                            i13++;
                        }
                    }
                    if (i13 < 1) {
                        i13 = 1;
                    }
                    AnimatedAmountTextView.AnimationSpeed animationSpeed = EarningsHeaderKt.TOTAL_EARNINGS_ANIMATION_SPEED;
                    long m = SVG$Unit$EnumUnboxingLocalUtility.m(animationSpeed.characterOffset, i13 - 1, animationSpeed.slideDuration, 50L);
                    this.label = 2;
                    break;
                case 8:
                    DateFilter dateFilter = (DateFilter) obj2;
                    RealEarningsTrackerRepository realEarningsTrackerRepository = (RealEarningsTrackerRepository) this.this$0;
                    AndroidClock androidClock = realEarningsTrackerRepository.clock;
                    LinkedHashMap linkedHashMap = realEarningsTrackerRepository.cache;
                    FlowCollector flowCollector = (FlowCollector) this.L$0;
                    CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    switch (this.label) {
                        case 0:
                            SafeTrace.throwOnFailure(obj);
                            boolean z = this.$hasForeignKeys;
                            EarningsTrackerDataResult.Loading loading = EarningsTrackerDataResult.Loading.INSTANCE;
                            if (z) {
                                linkedHashMap.remove(dateFilter);
                                this.L$0 = flowCollector;
                                this.label = 1;
                                break;
                            } else if (!linkedHashMap.containsKey(dateFilter) || ((EarningsWithExpiration) MapsKt__MapsKt.getValue(linkedHashMap, dateFilter)).expirationDate <= androidClock.elapsedRealtime()) {
                                this.L$0 = flowCollector;
                                this.label = 3;
                                break;
                            } else {
                                EarningsTrackerDataResult.Success success = new EarningsTrackerDataResult.Success(((EarningsWithExpiration) MapsKt__MapsKt.getValue(linkedHashMap, dateFilter)).data, false);
                                this.L$0 = flowCollector;
                                this.label = 2;
                                break;
                            }
                            return Unit.INSTANCE;
                        case 1:
                        case 2:
                        case 3:
                            SafeTrace.throwOnFailure(obj);
                            this.L$0 = flowCollector;
                            this.label = 4;
                            access$loadEarningsTrackerDataFromNetwork = RealEarningsTrackerRepository.access$loadEarningsTrackerDataFromNetwork(realEarningsTrackerRepository, dateFilter, this);
                            break;
                        case 4:
                            SafeTrace.throwOnFailure(obj);
                            access$loadEarningsTrackerDataFromNetwork = obj;
                            ApiResult apiResult = (ApiResult) access$loadEarningsTrackerDataFromNetwork;
                            if (!(apiResult instanceof ApiResult.Success)) {
                                if (!(apiResult instanceof ApiResult.Failure)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                if (linkedHashMap.containsKey(dateFilter)) {
                                    EarningsTrackerDataResult.Success success2 = new EarningsTrackerDataResult.Success(((EarningsWithExpiration) MapsKt__MapsKt.getValue(linkedHashMap, dateFilter)).data, true);
                                    this.L$0 = null;
                                    this.label = 6;
                                    break;
                                } else {
                                    this.L$0 = null;
                                    this.label = 7;
                                    break;
                                }
                            } else {
                                long elapsedRealtime = androidClock.elapsedRealtime();
                                EarningsTrackerDataResponse earningsTrackerDataResponse = (EarningsTrackerDataResponse) ((ApiResult.Success) apiResult).response;
                                linkedHashMap.put(dateFilter, new EarningsWithExpiration(earningsTrackerDataResponse, elapsedRealtime + (earningsTrackerDataResponse.ttl_in_ms != null ? r1.intValue() : 0)));
                                EarningsTrackerDataResult.Success success3 = new EarningsTrackerDataResult.Success(earningsTrackerDataResponse, false);
                                this.L$0 = null;
                                this.label = 5;
                                break;
                            }
                        case 5:
                        case 6:
                        case 7:
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        default:
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                    }
                case 9:
                    CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i15 = this.label;
                    if (i15 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        RealEarningsTrackerRepository realEarningsTrackerRepository2 = (RealEarningsTrackerRepository) ((TransfersPresenter) this.L$0).clipboardManager;
                        DateFilter dateFilter2 = (DateFilter) ((MutableState) this.this$0).getValue();
                        boolean z2 = this.$hasForeignKeys;
                        dateFilter2.getClass();
                        Flow distinctUntilChanged = FlowKt.distinctUntilChanged(new SafeFlow(new AnonymousClass1(z2, realEarningsTrackerRepository2, dateFilter2, (Continuation) null, 8)));
                        MusicPresenter$models$2$1.AnonymousClass1 anonymousClass1 = new MusicPresenter$models$2$1.AnonymousClass1(i3, (MutableState) obj2);
                        this.label = 1;
                        if (distinctUntilChanged.collect(anonymousClass1, this) == coroutineSingletons10) {
                            return coroutineSingletons10;
                        }
                    } else {
                        if (i15 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 10:
                    CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i16 = this.label;
                    if (i16 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        if (this.$hasForeignKeys) {
                            return Unit.INSTANCE;
                        }
                        ProvisioningHaptics provisioningHaptics2 = (ProvisioningHaptics) obj2;
                        if (!((FidesmoProvisioningViewModel.Activating) this.this$0).connected) {
                            if (provisioningHaptics2 != null) {
                                provisioningHaptics2.player.cancel();
                            }
                            return Unit.INSTANCE;
                        }
                        if (provisioningHaptics2 != null) {
                            provisioningHaptics2.player.play(provisioningHaptics2.nfcConnectPop);
                            this.L$0 = provisioningHaptics2;
                            this.label = 1;
                            if (JobKt.delay(100L, this) == coroutineSingletons11) {
                                return coroutineSingletons11;
                            }
                            provisioningHaptics = provisioningHaptics2;
                        }
                        return Unit.INSTANCE;
                    }
                    if (i16 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    provisioningHaptics = (ProvisioningHaptics) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    provisioningHaptics.player.play(provisioningHaptics.holdRamp);
                    return Unit.INSTANCE;
                case 11:
                    RealAccountOutboundNavigator realAccountOutboundNavigator = (RealAccountOutboundNavigator) this.this$0;
                    CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i17 = this.label;
                    if (i17 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Automation automation = (Automation) this.L$0;
                        Automation copy$default = automation != null ? Automation.copy$default(automation, this.$hasForeignKeys ? Automation.AutomationStatus.ACTIVE : Automation.AutomationStatus.INACTIVE, null, null, null, null, null, IptcConstants.IMAGE_RESOURCE_BLOCK_BW_TRANSFER_FUNC) : null;
                        InvestAutomatorFlowService investAutomatorFlowService = (InvestAutomatorFlowService) realAccountOutboundNavigator.appConfig;
                        UpdateAutomationForFlowRequest updateAutomationForFlowRequest = new UpdateAutomationForFlowRequest(null, copy$default, ByteString.EMPTY);
                        this.label = 1;
                        updateAutomationForFlow = investAutomatorFlowService.updateAutomationForFlow(updateAutomationForFlowRequest, this);
                        if (updateAutomationForFlow == coroutineSingletons12) {
                            return coroutineSingletons12;
                        }
                    } else {
                        if (i17 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        updateAutomationForFlow = obj;
                    }
                    ApiResult apiResult2 = (ApiResult) updateAutomationForFlow;
                    Analytics analytics = realAccountOutboundNavigator.analytics;
                    GrowToolsManagerScreen.ManageRoundUpsScreen manageRoundUpsScreen = (GrowToolsManagerScreen.ManageRoundUpsScreen) realAccountOutboundNavigator.featureFlagManager;
                    PlatformRandomKt.trackToggleUpdate(analytics, apiResult2, manageRoundUpsScreen.origin, manageRoundUpsScreen.f1144type);
                    if (!(apiResult2 instanceof ApiResult.Success)) {
                        if (!(apiResult2 instanceof ApiResult.Failure)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        ((GrowToolsManagerState) obj2).setShowDialog(new GrowToolsManagerState.ShowDialog(GrowToolsManagerState.ShowDialog.DialogType.ERROR));
                    }
                    return Unit.INSTANCE;
                case 12:
                    boolean z3 = this.$hasForeignKeys;
                    Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i18 = this.label;
                    if (i18 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        if (z3) {
                            RealHistoricalPriceTickRefresher realHistoricalPriceTickRefresher = (RealHistoricalPriceTickRefresher) this.L$0;
                            RealBadger2$setup$lambda$0$$inlined$mapNotNull$1 realBadger2$setup$lambda$0$$inlined$mapNotNull$1 = new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(new SafeFlow(new AnimationsKt$takeUntil$1$1(realHistoricalPriceTickRefresher, (HistoricalRange) this.this$0, continuation, 9)), 24);
                            StateFlowImpl stateFlowImpl = realHistoricalPriceTickRefresher.stocksNetworkStatus;
                            AndroidClock androidClock2 = realHistoricalPriceTickRefresher.clock;
                            CoroutineContext coroutineContext = realHistoricalPriceTickRefresher.computationDispatcher;
                            stateFlowImpl.getClass();
                            ChannelFlowTransformLatest m2065timerForAgeWn2Vu4Y = FaceDetection.m2065timerForAgeWn2Vu4Y(stateFlowImpl, androidClock2, coroutineContext, RealInvestmentEntitiesKt.INVESTING_STALENESS_THRESHOLD);
                            CardModelView$getActiveHeat$2$2 cardModelView$getActiveHeat$2$2 = new CardModelView$getActiveHeat$2$2(realHistoricalPriceTickRefresher, continuation, i2);
                            PasscodePresenter$models$verifyPasscodeModel$2$1$2$1 passcodePresenter$models$verifyPasscodeModel$2$1$2$1 = new PasscodePresenter$models$verifyPasscodeModel$2$1$2$1((ProducerScope) obj2, i5);
                            this.$hasForeignKeys = z3;
                            this.label = 1;
                            Object combineInternal = CombineKt.combineInternal(this, FlowKt__ZipKt$nullArrayFactory$1.INSTANCE, new FlowKt__ZipKt$combine$1$1(cardModelView$getActiveHeat$2$2, continuation, i4), passcodePresenter$models$verifyPasscodeModel$2$1$2$1, new Flow[]{realBadger2$setup$lambda$0$$inlined$mapNotNull$1, m2065timerForAgeWn2Vu4Y});
                            if (combineInternal != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                combineInternal = Unit.INSTANCE;
                            }
                            if (combineInternal == obj3) {
                                return obj3;
                            }
                        }
                    } else {
                        if (i18 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 13:
                    MutableState mutableState3 = (MutableState) this.this$0;
                    CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i19 = this.label;
                    if (i19 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        if (this.$hasForeignKeys && !((Boolean) mutableState3.getValue()).booleanValue()) {
                            MoneyTabPresenter moneyTabPresenter = (MoneyTabPresenter) this.L$0;
                            CoroutineContext coroutineContext2 = moneyTabPresenter.computationDispatcher;
                            RealKeyStoreProvider$setEntry$2 realKeyStoreProvider$setEntry$2 = new RealKeyStoreProvider$setEntry$2(moneyTabPresenter, (ArrayList) obj2, mutableState3, (Continuation) null, 8);
                            this.label = 1;
                            if (JobKt.withContext(coroutineContext2, realKeyStoreProvider$setEntry$2, this) == coroutineSingletons13) {
                                return coroutineSingletons13;
                            }
                        }
                    } else {
                        if (i19 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 14:
                    CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i20 = this.label;
                    try {
                        if (i20 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            Deferred deferred = (Deferred) this.L$0;
                            this.label = 1;
                            await = deferred.await(this);
                            if (await == coroutineSingletons14) {
                                return coroutineSingletons14;
                            }
                        } else {
                            if (i20 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                            await = obj;
                        }
                        SupervisorJobImpl supervisorJobImpl2 = (SupervisorJobImpl) obj2;
                        IntegrityChecker$Result integrityChecker$Result = (IntegrityChecker$Result) await;
                        if (this.$hasForeignKeys && (integrityChecker$Result instanceof IntegrityChecker$Result.Failure)) {
                            supervisorJobImpl2.cancel(null);
                        }
                        return (IntegrityChecker$Result) await;
                    } catch (Exception e) {
                        if (e instanceof CancellationException) {
                            return new IntegrityChecker$Result.Aborted((IntegrityCheck) this.this$0);
                        }
                        throw e;
                    }
                case 15:
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i21 = this.label;
                    if (i21 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        supervisorJobImpl = new SupervisorJobImpl(JobKt.getJob(getContext()));
                        List list = (List) obj2;
                        int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                        if (mapCapacity < 16) {
                            mapCapacity = 16;
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(mapCapacity);
                        for (Object obj4 : list) {
                            linkedHashMap2.put(obj4, JobKt.async(coroutineScope, supervisorJobImpl, CoroutineStart.DEFAULT, new MusicPresenter$models$3$1((IntegrityCheck) obj4, continuation, 11)));
                        }
                        boolean z4 = this.$hasForeignKeys;
                        ArrayList arrayList2 = new ArrayList(linkedHashMap2.size());
                        for (Map.Entry entry : linkedHashMap2.entrySet()) {
                            boolean z5 = z4;
                            arrayList2.add(JobKt.async$default(coroutineScope, null, null, new AnonymousClass1((Deferred) entry.getValue(), (IntegrityCheck) entry.getKey(), z5, supervisorJobImpl, (Continuation) null), 3));
                            z4 = z5;
                        }
                        this.L$0 = null;
                        this.this$0 = supervisorJobImpl;
                        this.label = 1;
                        awaitAll = AwaitKt.awaitAll(arrayList2, this);
                        if (awaitAll == coroutineSingletons15) {
                            return coroutineSingletons15;
                        }
                    } else {
                        if (i21 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SupervisorJobImpl supervisorJobImpl3 = (SupervisorJobImpl) this.this$0;
                        SafeTrace.throwOnFailure(obj);
                        supervisorJobImpl = supervisorJobImpl3;
                        awaitAll = obj;
                    }
                    List list2 = (List) awaitAll;
                    supervisorJobImpl.complete$1();
                    return list2;
                case 16:
                    MutableState mutableState4 = (MutableState) this.this$0;
                    CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i22 = this.label;
                    if (i22 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        if (this.$hasForeignKeys) {
                            this.label = 1;
                            break;
                        } else {
                            mutableState4.setValue(Boolean.FALSE);
                            this.label = 2;
                            break;
                        }
                        return coroutineSingletons16;
                    }
                    if (i22 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        mutableState4.setValue(Boolean.TRUE);
                    } else {
                        if (i22 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        MutableState mutableState5 = (MutableState) obj2;
                        mutableState5.setValue(MapsKt__MapsKt.minus((Map) mutableState5.getValue(), (String) this.L$0));
                    }
                    return Unit.INSTANCE;
                case 17:
                    CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                    CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i23 = this.label;
                    if (i23 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Flow flow = (Flow) this.this$0;
                        UnsupportedSettingPresenter$models$$inlined$CollectEffect$1$1 unsupportedSettingPresenter$models$$inlined$CollectEffect$1$1 = new UnsupportedSettingPresenter$models$$inlined$CollectEffect$1$1(coroutineScope2, (TaxReturnsPresenter) obj2, this.$hasForeignKeys);
                        this.L$0 = null;
                        this.label = 1;
                        if (flow.collect(unsupportedSettingPresenter$models$$inlined$CollectEffect$1$1, this) == coroutineSingletons17) {
                            return coroutineSingletons17;
                        }
                    } else {
                        if (i23 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 18:
                    MutableState mutableState6 = (MutableState) this.this$0;
                    CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i24 = this.label;
                    if (i24 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        if (this.$hasForeignKeys) {
                            Set set = ShoppingWebPresenter.RESTRICTED_KEYWORDS;
                            if (((Profile) mutableState6.getValue()) != null) {
                                ShoppingWebPresenter shoppingWebPresenter = (ShoppingWebPresenter) this.L$0;
                                CoroutineContext coroutineContext3 = shoppingWebPresenter.ioDispatcher;
                                ShoppingWebPresenter$models$5$1 shoppingWebPresenter$models$5$1 = new ShoppingWebPresenter$models$5$1(shoppingWebPresenter, mutableState6, (MutableState) obj2, null, 1);
                                this.label = 1;
                                if (JobKt.withContext(coroutineContext3, shoppingWebPresenter$models$5$1, this) == coroutineSingletons18) {
                                    return coroutineSingletons18;
                                }
                            }
                        }
                    } else {
                        if (i24 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 19:
                    MutableState mutableState7 = (MutableState) obj2;
                    CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i25 = this.label;
                    if (i25 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        int i26 = HeroCardViewKt.$r8$clinit;
                        InteractiveCardState interactiveCardState2 = (InteractiveCardState) mutableState7.getValue();
                        mutableState7.setValue(new InteractiveCardState());
                        boolean z6 = this.$hasForeignKeys;
                        this.L$0 = interactiveCardState2;
                        this.label = 1;
                        interactiveCardState2.getClass();
                        if (JobKt.coroutineScope(new RoomDatabase$performClear$1(interactiveCardState2, z6, continuation, i3), this) == coroutineSingletons19) {
                            return coroutineSingletons19;
                        }
                        interactiveCardState = interactiveCardState2;
                    } else {
                        if (i25 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        interactiveCardState = (InteractiveCardState) this.L$0;
                        SafeTrace.throwOnFailure(obj);
                    }
                    ((SnapshotStateList) this.this$0).remove(interactiveCardState);
                    return Unit.INSTANCE;
                case 20:
                    FlowCollector flowCollector2 = (FlowCollector) this.L$0;
                    CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i27 = this.label;
                    if (i27 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        if (this.$hasForeignKeys) {
                            this.L$0 = flowCollector2;
                            this.label = 1;
                            break;
                        }
                    } else if (i27 == 1) {
                        SafeTrace.throwOnFailure(obj);
                    } else {
                        if (i27 != 2) {
                            if (i27 == 3) {
                                SafeTrace.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            }
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        flowCollector2 = (FlowCollector) this.this$0;
                        SafeTrace.throwOnFailure(obj);
                        access$loadTileStateFlow = obj;
                        this.L$0 = null;
                        this.this$0 = null;
                        this.label = 3;
                        break;
                    }
                    this.L$0 = null;
                    this.this$0 = flowCollector2;
                    this.label = 2;
                    access$loadTileStateFlow = RealShiftsTileDataLoader.access$loadTileStateFlow((RealShiftsTileDataLoader) obj2, this);
                    break;
                default:
                    Object obj5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i28 = this.label;
                    if (i28 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        if (this.$hasForeignKeys) {
                            ScrollState scrollState = (ScrollState) this.L$0;
                            this.label = 1;
                            Object animateScrollBy = PlatformKt.animateScrollBy(scrollState, Float.MAX_VALUE, AnimatableKt.tween$default(0, 0, null, 7), this);
                            if (animateScrollBy != obj5) {
                                animateScrollBy = Unit.INSTANCE;
                            }
                            if (animateScrollBy == obj5) {
                                return obj5;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    if (i28 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    if (StringsKt.isBlank(((NetworkingLinkSignupState.Payload) this.this$0).phoneController.initialPhoneNumber)) {
                        FocusRequester.m605requestFocus3ESFkO8$default((FocusRequester) obj2);
                    }
                    return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(Object obj, boolean z, Object obj2, Object obj3, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.L$0 = obj;
            this.$hasForeignKeys = z;
            this.this$0 = obj2;
            this.$tableNames = obj3;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(Object obj, boolean z, Object obj2, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.this$0 = obj;
            this.$hasForeignKeys = z;
            this.$tableNames = obj2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List list, boolean z, Continuation continuation) {
            super(2, continuation);
            this.$r8$classId = 15;
            this.$tableNames = list;
            this.$hasForeignKeys = z;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RealHistoricalPriceTickRefresher realHistoricalPriceTickRefresher, HistoricalRange historicalRange, ProducerScope producerScope, Continuation continuation) {
            super(2, continuation);
            this.$r8$classId = 12;
            this.L$0 = realHistoricalPriceTickRefresher;
            this.this$0 = historicalRange;
            this.$tableNames = producerScope;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Flow flow, Continuation continuation, TaxReturnsPresenter taxReturnsPresenter, boolean z) {
            super(2, continuation);
            this.$r8$classId = 17;
            this.this$0 = flow;
            this.$tableNames = taxReturnsPresenter;
            this.$hasForeignKeys = z;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, RealShiftsTileDataLoader realShiftsTileDataLoader, Continuation continuation) {
            super(2, continuation);
            this.$r8$classId = 20;
            this.$hasForeignKeys = z;
            this.$tableNames = realShiftsTileDataLoader;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(boolean z, Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.$hasForeignKeys = z;
            this.L$0 = obj;
            this.this$0 = obj2;
            this.$tableNames = obj3;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(boolean z, Object obj, Object obj2, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.$hasForeignKeys = z;
            this.this$0 = obj;
            this.$tableNames = obj2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RoomDatabase$performClear$1(Object obj, boolean z, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$tableNames = obj;
        this.$hasForeignKeys = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RoomDatabase$performClear$1(boolean z, Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$hasForeignKeys = z;
        this.this$0 = obj;
        this.$tableNames = obj2;
    }
}
