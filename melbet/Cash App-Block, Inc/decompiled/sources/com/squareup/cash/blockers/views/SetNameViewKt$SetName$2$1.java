package com.squareup.cash.blockers.views;

import android.content.Context;
import android.net.Uri;
import androidx.camera.core.impl.QuirkSettingsLoader;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.pager.DefaultPagerState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.glance.session.SessionWorker$doWork$2$2;
import app.cash.api.ApiResult;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.local.db.LocalTabContentQueries;
import app.cash.local.presenters.LocalCashBalancePresenter;
import app.cash.local.views.cart.CartBannerViewKt$$ExternalSyntheticLambda2;
import app.cash.sqldelight.db.QueryResult;
import bo.app.n3$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzagj;
import com.google.android.gms.internal.mlkit_vision_common.zzjr;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.zxing.Result;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.activity.backend.FormattedPaymentHistoryActivityItem;
import com.squareup.cash.activity.backend.loader.Activities;
import com.squareup.cash.activity.backend.loader.FormattedPaymentHistoryActivityData;
import com.squareup.cash.activity.backend.loader.LoadingState;
import com.squareup.cash.activity.presenters.ActivityTabPresenter;
import com.squareup.cash.activity.viewmodels.ActivityTabViewModel;
import com.squareup.cash.activity.views.ActivityTabViewKt$$ExternalSyntheticLambda17;
import com.squareup.cash.activity.views.SectionHeaderScope$$ExternalSyntheticLambda1;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayAppletMerchantSheetRepository;
import com.squareup.cash.afterpayapplet.presenters.AfterpayAppletHomePresenter;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeViewModel;
import com.squareup.cash.appmessages.AppMessageViewEvent;
import com.squareup.cash.appmessages.SheetAppMessage;
import com.squareup.cash.appmessages.db.SheetMessage;
import com.squareup.cash.appmessages.presenters.CardAppMessagePresenterHelper$models$1$1;
import com.squareup.cash.appmessages.presenters.InlineAppMessagePresenterHelper$models$1$1;
import com.squareup.cash.appmessages.presenters.InlineAppMessageV2PresenterHelper$models$1$1;
import com.squareup.cash.appmessages.sheet.SheetAppMessageEvent;
import com.squareup.cash.arcade.Haptics;
import com.squareup.cash.arcade.components.haptic.RealHapticVibrator;
import com.squareup.cash.arcade.components.internal.InputState;
import com.squareup.cash.bitcoin.presenters.RealBitcoinAmountPickerPresenter;
import com.squareup.cash.bitcoin.presenters.applet.BitcoinHomePresenter;
import com.squareup.cash.bitcoin.screens.BitcoinOverlay;
import com.squareup.cash.bitcoin.views.send.MoveBitcoinViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.data.BlockersDataKt;
import com.squareup.cash.blockers.flow.RealMultiBlockerFacilitator;
import com.squareup.cash.blockers.presenters.BirthdayPresenter;
import com.squareup.cash.blockers.presenters.EarnerEnrollmentBlockerPresenter;
import com.squareup.cash.blockers.presenters.EarnerOnboardingAnalytics;
import com.squareup.cash.blockers.presenters.PromotionPanePresenter;
import com.squareup.cash.blockers.presenters.SsnPresenter;
import com.squareup.cash.blockers.presenters.VerifyAliasPresenter;
import com.squareup.cash.blockers.presenters.VerifyAliasPresenter$models$3$4;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.viewmodels.BankAccountLinkingViewModel;
import com.squareup.cash.blockers.viewmodels.BirthdayEvent$Submit;
import com.squareup.cash.blockers.viewmodels.BirthdayViewModel;
import com.squareup.cash.blockers.viewmodels.IdvViewEvent;
import com.squareup.cash.blockers.viewmodels.SetNameViewModel;
import com.squareup.cash.blockers.viewmodels.SetNameViewModel$Event$Done;
import com.squareup.cash.blockers.viewmodels.SetNameViewModel$Event$InputValidationFailed;
import com.squareup.cash.blockers.viewmodels.SetNameViewModel$Event$None;
import com.squareup.cash.blockers.viewmodels.SetNameViewModel$Event$ShowLoadingScreen;
import com.squareup.cash.blockers.viewmodels.SetNameViewModel$Event$SubmissionFailed;
import com.squareup.cash.blockers.viewmodels.SetNameViewModel$Event$Submitted;
import com.squareup.cash.blockers.viewmodels.SsnViewEvent;
import com.squareup.cash.blockers.viewmodels.StatusResultViewModel;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import com.squareup.cash.card.onboarding.CardStudioViewModelV2;
import com.squareup.cash.card.onboarding.CardsKt;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.card.onboarding.ZoomLevel;
import com.squareup.cash.card.onboarding.core.instancing.CardDesignLibraryScene;
import com.squareup.cash.card.onboarding.core.instancing.CardDesignLibraryState;
import com.squareup.cash.cdf.AppMessageFormat;
import com.squareup.cash.cdf.alias.AliasVerifyStart;
import com.squareup.cash.cdf.appmessage.AppMessageInteractClick;
import com.squareup.cash.cdf.detailspage.DetailsPageInteractTapButton;
import com.squareup.cash.cdf.earnings.EarningsOnboardingViewCategorySelection;
import com.squareup.cash.clientsync.models.ResetTrigger;
import com.squareup.cash.clientsync.pipeline.RealClientSyncStorageOperationBatchExecutor;
import com.squareup.cash.clientsync.syncer.ClientSyncer$Result;
import com.squareup.cash.clientsync.syncer.RealClientSyncer;
import com.squareup.cash.common.composeui.animations.Shaker;
import com.squareup.cash.common.messaging.screens.FailureMessageBlockerScreen;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersHelper;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealBlockersHelper;
import com.squareup.cash.data.blockers.RealFlowStarter;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.data.profile.observability.ScenarioPlanFoundAction;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.profile.ScenarioPlan;
import com.squareup.cash.deposits.physical.presenter.atm.AtmWithdrawalMapPresenter;
import com.squareup.cash.deposits.physical.screens.AtmExplainerScreen;
import com.squareup.cash.deposits.physical.screens.AtmLocationDetailsScreen;
import com.squareup.cash.deposits.physical.screens.AtmPmdExplainerScreen;
import com.squareup.cash.deposits.physical.screens.AtmRetailerMapScreen;
import com.squareup.cash.deposits.physical.screens.AtmWithdrawalExplainerScreen;
import com.squareup.cash.deposits.physical.viewmodels.map.AtmMarkerLocation;
import com.squareup.cash.device.DeviceOrientation;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.lifecycle.ActivityEvent;
import com.squareup.cash.maps.viewmodels.LocationSelection;
import com.squareup.cash.marketing.components.TooltipState;
import com.squareup.cash.marketing.components.TooltipState$hide$1;
import com.squareup.cash.money.loadable.LoadableStateKt;
import com.squareup.cash.overlays.OverlayKt;
import com.squareup.cash.payments.screens.PaymentScreens$HomeScreens$Home;
import com.squareup.cash.screens.Finish;
import com.squareup.cash.screens.RedactedString;
import com.squareup.cash.securitysignals.backend.RealSecuritySignalsAggregator;
import com.squareup.cash.storage.AndroidFileProvider;
import com.squareup.cash.storage.FileDownloader$Category;
import com.squareup.cash.storage.FileDownloader$DownloadStatus;
import com.squareup.cash.storage.RealFileDownloader;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.lending.sync_values.ToggleEntryPointData;
import com.squareup.protos.cash.cashsuggest.api.AfterpayMerchantSheetResponse;
import com.squareup.protos.cash.discover.api.app.v1.model.DetailsPage;
import com.squareup.protos.cash.messagingplatformcommon.app.HalfSheetMessage;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.RetailerMapBlocker;
import com.squareup.protos.franklin.app.SubmitBlockerRequest;
import com.squareup.protos.franklin.common.InitiatePasscodeResetResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.util.cash.ProtoDefaults;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.wire.GrpcMethod;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.ConvertFromJavaKt$$Lambda$4;
import kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlowImpl;
import okhttp3.internal.Tags;
import org.commonmark.node.Node;
import papa.SafeTrace;
import squareup.cash.bankingbenefits.ui.BenefitExplainerScreen;
import squareup.cash.earnings.EarnerCategory;
import timber.log.Timber;

/* loaded from: classes5.dex */
public final class SetNameViewKt$SetName$2$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object $inputValue$delegate;
    public /* synthetic */ Object $model;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $shaker;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetNameViewKt$SetName$2$1(MutableState mutableState, AtmWithdrawalMapPresenter atmWithdrawalMapPresenter, MutableState mutableState2, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 29;
        this.$inputValue$delegate = mutableState;
        this.$model = atmWithdrawalMapPresenter;
        this.$shaker = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$shaker;
        Object obj3 = this.$inputValue$delegate;
        switch (i) {
            case 0:
                return new SetNameViewKt$SetName$2$1((SetNameViewModel) this.$model, (Shaker) obj2, (MutableState) obj3, continuation, 0);
            case 1:
                SetNameViewKt$SetName$2$1 setNameViewKt$SetName$2$1 = new SetNameViewKt$SetName$2$1((ActivityTabPresenter) obj2, (MutableState) obj3, continuation, 1);
                setNameViewKt$SetName$2$1.$model = obj;
                return setNameViewKt$SetName$2$1;
            case 2:
                return new SetNameViewKt$SetName$2$1((MutableTransitionState) this.$model, (ActivityTabViewModel) obj2, (TooltipState) obj3, continuation, 2);
            case 3:
                return new SetNameViewKt$SetName$2$1((RealAfterpayAppletMerchantSheetRepository) this.$model, (String) obj2, (AfterpayMerchantSheetResponse) obj3, continuation, 3);
            case 4:
                return new SetNameViewKt$SetName$2$1((MoleculePresenter) this.$model, (MutableState) obj3, (MutableState) obj2, continuation, 4);
            case 5:
                return new SetNameViewKt$SetName$2$1((AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.CalendarDate) this.$model, (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar) obj2, (Function1) obj3, continuation, 5);
            case 6:
                SetNameViewKt$SetName$2$1 setNameViewKt$SetName$2$12 = new SetNameViewKt$SetName$2$1((CardStudioPresenter) obj2, (Flow) obj3, continuation, 6);
                setNameViewKt$SetName$2$12.$model = obj;
                return setNameViewKt$SetName$2$12;
            case 7:
                SetNameViewKt$SetName$2$1 setNameViewKt$SetName$2$13 = new SetNameViewKt$SetName$2$1((DisclosurePresenter) obj2, (Flow) obj3, continuation, 7);
                setNameViewKt$SetName$2$13.$model = obj;
                return setNameViewKt$SetName$2$13;
            case 8:
                SetNameViewKt$SetName$2$1 setNameViewKt$SetName$2$14 = new SetNameViewKt$SetName$2$1((DisclosurePresenter) obj2, (Flow) obj3, continuation, 8);
                setNameViewKt$SetName$2$14.$model = obj;
                return setNameViewKt$SetName$2$14;
            case 9:
                return new SetNameViewKt$SetName$2$1((LocalCashBalancePresenter) this.$model, (SheetAppMessageEvent) obj2, (MutableState) obj3, continuation, 9);
            case 10:
                SetNameViewKt$SetName$2$1 setNameViewKt$SetName$2$15 = new SetNameViewKt$SetName$2$1((ActivityEvent) obj2, continuation, (RealBitcoinAmountPickerPresenter) obj3, 10);
                setNameViewKt$SetName$2$15.$model = obj;
                return setNameViewKt$SetName$2$15;
            case 11:
                SetNameViewKt$SetName$2$1 setNameViewKt$SetName$2$16 = new SetNameViewKt$SetName$2$1(obj2, continuation, (BitcoinHomePresenter) obj3, 11);
                setNameViewKt$SetName$2$16.$model = obj;
                return setNameViewKt$SetName$2$16;
            case 12:
                return new SetNameViewKt$SetName$2$1((RealMultiBlockerFacilitator) this.$model, (Node) obj2, (Function1) obj3, continuation, 12);
            case 13:
                return new SetNameViewKt$SetName$2$1((BirthdayPresenter) this.$model, (BirthdayEvent$Submit) obj2, (MutableState) obj3, continuation, 13);
            case 14:
                return new SetNameViewKt$SetName$2$1((EarnerEnrollmentBlockerPresenter) this.$model, (String) obj2, (MutableState) obj3, continuation, 14);
            case 15:
                return new SetNameViewKt$SetName$2$1((ApiResult) this.$model, (PromotionPanePresenter) obj2, (String) obj3, continuation, 15);
            case 16:
                return new SetNameViewKt$SetName$2$1((Channel) this.$model, (SsnViewEvent) obj2, (SsnPresenter) obj3, continuation, 16);
            case 17:
                SetNameViewKt$SetName$2$1 setNameViewKt$SetName$2$17 = new SetNameViewKt$SetName$2$1((VerifyAliasPresenter) obj2, (MutableState) obj3, continuation, 17);
                setNameViewKt$SetName$2$17.$model = obj;
                return setNameViewKt$SetName$2$17;
            case 18:
                return new SetNameViewKt$SetName$2$1((BankAccountLinkingViewModel) this.$model, (Shaker) obj2, (RealCashVibrator) obj3, continuation, 18);
            case 19:
                return new SetNameViewKt$SetName$2$1((BirthdayViewModel) this.$model, (Shaker) obj2, (MutableState) obj3, continuation, 19);
            case 20:
                return new SetNameViewKt$SetName$2$1((StatusResultViewModel.Ready.HapticEffect) this.$model, (RealHapticVibrator) obj2, (Haptics) obj3, continuation, 20);
            case 21:
                return new SetNameViewKt$SetName$2$1((DefaultPagerState) this.$model, (List) obj2, (Function1) obj3, continuation, 21);
            case 22:
                return new SetNameViewKt$SetName$2$1((CardModelView) this.$model, (CardModelView.CardFront) obj2, (CardModelView.CardBack) obj3, continuation, 22);
            case 23:
                return new SetNameViewKt$SetName$2$1((MoleculePresenter) this.$model, (MutableState) obj3, (MutableState) obj2, continuation, 23);
            case 24:
                return new SetNameViewKt$SetName$2$1((CardDesignLibraryState) this.$model, (CardDesignLibraryScene) obj2, (List) obj3, continuation, 24);
            case 25:
                return new SetNameViewKt$SetName$2$1((RealClientSyncer) this.$model, (ResetTrigger) obj2, (CompletableDeferredImpl) obj3, continuation, 25);
            case 26:
                return new SetNameViewKt$SetName$2$1((RealBlockersHelper) this.$model, (String) obj2, (String) obj3, continuation, 26);
            case 27:
                SetNameViewKt$SetName$2$1 setNameViewKt$SetName$2$18 = new SetNameViewKt$SetName$2$1((RealBlockersHelper) obj2, (BlockersData) obj3, continuation, 27);
                setNameViewKt$SetName$2$18.$model = obj;
                return setNameViewKt$SetName$2$18;
            case 28:
                SetNameViewKt$SetName$2$1 setNameViewKt$SetName$2$19 = new SetNameViewKt$SetName$2$1((RealProfileManager) obj2, (ClientScenario) obj3, continuation, 28);
                setNameViewKt$SetName$2$19.$model = obj;
                return setNameViewKt$SetName$2$19;
            default:
                return new SetNameViewKt$SetName$2$1((MutableState) obj3, (AtmWithdrawalMapPresenter) this.$model, (MutableState) obj2, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((SetNameViewKt$SetName$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 1:
                return ((SetNameViewKt$SetName$2$1) create((ProduceStateScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 2:
                return ((SetNameViewKt$SetName$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 3:
                return ((SetNameViewKt$SetName$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 4:
                return ((SetNameViewKt$SetName$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 5:
                return ((SetNameViewKt$SetName$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 6:
                return ((SetNameViewKt$SetName$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 7:
                return ((SetNameViewKt$SetName$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 8:
                return ((SetNameViewKt$SetName$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 9:
                return ((SetNameViewKt$SetName$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 10:
                return ((SetNameViewKt$SetName$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 11:
                return ((SetNameViewKt$SetName$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 12:
                return ((SetNameViewKt$SetName$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 13:
                return ((SetNameViewKt$SetName$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 14:
                return ((SetNameViewKt$SetName$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 15:
                return ((SetNameViewKt$SetName$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 16:
                return ((SetNameViewKt$SetName$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 17:
                return ((SetNameViewKt$SetName$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 18:
                return ((SetNameViewKt$SetName$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 19:
                return ((SetNameViewKt$SetName$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 20:
                return ((SetNameViewKt$SetName$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 21:
                return ((SetNameViewKt$SetName$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 22:
                return ((SetNameViewKt$SetName$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 23:
                return ((SetNameViewKt$SetName$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 24:
                return ((SetNameViewKt$SetName$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 25:
                return ((SetNameViewKt$SetName$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 26:
                return ((SetNameViewKt$SetName$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 27:
                return ((SetNameViewKt$SetName$2$1) create((BlockersHelper.BlockersAction.ShowError) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 28:
                return ((SetNameViewKt$SetName$2$1) create((ScenarioPlan) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((SetNameViewKt$SetName$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX WARN: Type inference failed for: r10v34 */
    /* JADX WARN: Type inference failed for: r10v35 */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r12v15, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r12v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v57, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.List, kotlin.collections.builders.ListBuilder] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Iterable iterable;
        AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.PrepurchaseToggleSection.ToggleState toggleState;
        ToggleEntryPointData.ToggleState toggleState2;
        HalfSheetMessage halfSheetMessage;
        zzjr zzjrVar;
        DetailsPage access$getDetailsPage;
        BirthdayPresenter.InternalResult internalResult;
        BirthdayViewModel copy$default;
        Haptics.VibrationEffectFactory vibrationEffectFactory;
        int intValue;
        AtmExplainerScreen atmWithdrawalExplainerScreen;
        int i = this.$r8$classId;
        int i2 = 4;
        int i3 = 10;
        int i4 = 6;
        int i5 = 3;
        int i6 = 0;
        int i7 = 2;
        int i8 = 1;
        AtmMarkerLocation atmMarkerLocation = null;
        Object obj2 = this.$shaker;
        Object obj3 = this.$inputValue$delegate;
        switch (i) {
            case 0:
                Shaker shaker = (Shaker) obj2;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                zzagj zzagjVar = ((SetNameViewModel) this.$model).lastEvent;
                if (zzagjVar instanceof SetNameViewModel$Event$InputValidationFailed) {
                    MutableState mutableState = (MutableState) obj3;
                    mutableState.setValue(TextFieldValue.m1002copy3r_uNRQ$default((TextFieldValue) mutableState.getValue(), "", 0L, 6));
                    shaker.shake();
                } else if (zzagjVar instanceof SetNameViewModel$Event$SubmissionFailed) {
                    shaker.shake();
                } else if (!(zzagjVar instanceof SetNameViewModel$Event$Submitted) && !(zzagjVar instanceof SetNameViewModel$Event$ShowLoadingScreen) && !(zzagjVar instanceof SetNameViewModel$Event$Done) && !(zzagjVar instanceof SetNameViewModel$Event$None)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                return Unit.INSTANCE;
            case 1:
                ProduceStateScope produceStateScope = (ProduceStateScope) this.$model;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                MutableState mutableState2 = (MutableState) obj3;
                LoadingState loadingState = ((Activities) mutableState2.getValue()).loadingState;
                boolean z = ((Activities) mutableState2.getValue()).hasMore;
                ActivityTabPresenter activityTabPresenter = (ActivityTabPresenter) obj2;
                Activities activities = (Activities) mutableState2.getValue();
                LoadingState loadingState2 = ((Activities) mutableState2.getValue()).loadingState;
                ?? createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                List list = activities.recentActivities;
                if (list != null) {
                    iterable = new ArrayList();
                    for (Object obj4 : list) {
                        if (obj4 instanceof FormattedPaymentHistoryActivityData) {
                            iterable.add(obj4);
                        }
                    }
                } else {
                    iterable = EmptyList.INSTANCE;
                }
                Iterable iterable2 = iterable;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable2, 10));
                for (Object obj5 : iterable2) {
                    int i9 = i6 + 1;
                    if (i6 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw null;
                    }
                    arrayList.add(new SectionHeaderScope$$ExternalSyntheticLambda1(activityTabPresenter, (FormattedPaymentHistoryActivityItem) obj5, i6, i4));
                    i6 = i9;
                }
                createListBuilder.addAll(arrayList);
                if (iterable.isEmpty() && loadingState2 != LoadingState.LOADING) {
                    createListBuilder.add(new CartBannerViewKt$$ExternalSyntheticLambda2(activityTabPresenter, 22));
                }
                produceStateScope.setValue(new ActivityTabPresenter.IntermediateFeedState(loadingState, z, CollectionsKt__CollectionsJVMKt.build(createListBuilder)));
                return Unit.INSTANCE;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (((Boolean) ((MutableTransitionState) this.$model).currentState$delegate.getValue()).booleanValue() && ((ActivityTabViewModel) obj2).showInlineMessageTooltip) {
                    TooltipState tooltipState = (TooltipState) obj3;
                    JobKt.launch$default(tooltipState.scope, null, null, new TooltipState$hide$1(tooltipState, 0 == true ? 1 : 0, i8), 3);
                }
                return Unit.INSTANCE;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                RealAfterpayAppletMerchantSheetRepository realAfterpayAppletMerchantSheetRepository = (RealAfterpayAppletMerchantSheetRepository) this.$model;
                LocalTabContentQueries localTabContentQueries = realAfterpayAppletMerchantSheetRepository.cashDatabase.afterpayAppletMerchantSheetQueries;
                String str = (String) obj2;
                Long l = new Long(realAfterpayAppletMerchantSheetRepository.clock.millis());
                AfterpayMerchantSheetResponse afterpayMerchantSheetResponse = (AfterpayMerchantSheetResponse) obj3;
                localTabContentQueries.getClass();
                str.getClass();
                afterpayMerchantSheetResponse.getClass();
                QueryResult execute = localTabContentQueries.driver.execute(-1049008897, "INSERT OR REPLACE INTO afterpayAppletMerchantSheet (token, last_updated_at_ms, sheet_response)\nVALUES (?, ?, ?)", new n3$$ExternalSyntheticLambda0(str, l, localTabContentQueries, afterpayMerchantSheetResponse, 19));
                localTabContentQueries.notifyQueries(-1049008897, new ActivityTabViewKt$$ExternalSyntheticLambda17(16));
                return execute;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                AfterpayAppletHomePresenter afterpayAppletHomePresenter = (AfterpayAppletHomePresenter) this.$model;
                Map map = AfterpayAppletHomePresenter.refreshAttributeHome;
                AfterpayAppletHomeViewModel homeState = afterpayAppletHomePresenter.getHomeState();
                ToggleEntryPointData toggleEntryPointData = (ToggleEntryPointData) ((MutableState) obj3).getValue();
                boolean booleanValue = ((Boolean) ((MutableState) obj2).getValue()).booleanValue();
                if (homeState instanceof AfterpayAppletHomeContentViewModel) {
                    if (toggleEntryPointData == null || (toggleState2 = toggleEntryPointData.toggle_state) == null) {
                        toggleState = null;
                    } else {
                        int ordinal = toggleState2.ordinal();
                        toggleState = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.PrepurchaseToggleSection.ToggleState.TURNED_OFF : AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.PrepurchaseToggleSection.ToggleState.DISABLED : AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.PrepurchaseToggleSection.ToggleState.TURNED_ON : AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.PrepurchaseToggleSection.ToggleState.TURNED_OFF;
                    }
                    AfterpayAppletHomeContentViewModel afterpayAppletHomeContentViewModel = (AfterpayAppletHomeContentViewModel) homeState;
                    AbstractPersistentList abstractPersistentList = afterpayAppletHomeContentViewModel.homeSections;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(abstractPersistentList, 10));
                    ListIterator listIterator = abstractPersistentList.listIterator(0);
                    while (listIterator.hasNext()) {
                        AfterpayAppletHomeContentViewModel.HomeSection homeSection = (AfterpayAppletHomeContentViewModel.HomeSection) listIterator.next();
                        AfterpayAppletHomeContentViewModel.HomeSection.SectionContent sectionContent = homeSection.content;
                        if (sectionContent instanceof AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.PrepurchaseToggleSection) {
                            homeSection = AfterpayAppletHomeContentViewModel.HomeSection.copy$default(homeSection, AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.PrepurchaseToggleSection.copy$default((AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.PrepurchaseToggleSection) sectionContent, null, toggleState, booleanValue, 7));
                        }
                        arrayList2.add(homeSection);
                    }
                    homeState = AfterpayAppletHomeContentViewModel.copy$default(afterpayAppletHomeContentViewModel, false, Tags.toPersistentList(arrayList2), null, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE);
                }
                afterpayAppletHomePresenter.setHomeState(homeState);
                return Unit.INSTANCE;
            case 5:
                AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar paymentCalendar = (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar) obj2;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (((AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.CalendarDate) this.$model) == null && !paymentCalendar.dates.isEmpty()) {
                    ((Function1) obj3).invoke(LoadableStateKt.firstSelectableOrNull(paymentCalendar.dates));
                }
                return Unit.INSTANCE;
            case 6:
                CoroutineScope coroutineScope = (CoroutineScope) this.$model;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                CardStudioPresenter cardStudioPresenter = (CardStudioPresenter) obj2;
                CoroutineContext coroutineContext = (CoroutineContext) cardStudioPresenter.ioContext;
                Flow flow = (Flow) obj3;
                JobKt.launch$default(coroutineScope, coroutineContext, null, new CardAppMessagePresenterHelper$models$1$1(flow, cardStudioPresenter, 0 == true ? 1 : 0, i8), 2);
                return JobKt.launch$default(coroutineScope, coroutineContext, null, new CardAppMessagePresenterHelper$models$1$1(flow, cardStudioPresenter, 0 == true ? 1 : 0, i7), 2);
            case 7:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.$model;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                DisclosurePresenter disclosurePresenter = (DisclosurePresenter) obj2;
                CoroutineContext coroutineContext2 = (CoroutineContext) disclosurePresenter.blockersNavigator;
                Flow flow2 = (Flow) obj3;
                JobKt.launch$default(coroutineScope2, coroutineContext2, null, new InlineAppMessagePresenterHelper$models$1$1(flow2, disclosurePresenter, 0 == true ? 1 : 0, i8), 2);
                return JobKt.launch$default(coroutineScope2, coroutineContext2, null, new InlineAppMessagePresenterHelper$models$1$1(flow2, disclosurePresenter, 0 == true ? 1 : 0, i7), 2);
            case 8:
                CoroutineScope coroutineScope3 = (CoroutineScope) this.$model;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                DisclosurePresenter disclosurePresenter2 = (DisclosurePresenter) obj2;
                CoroutineContext coroutineContext3 = (CoroutineContext) disclosurePresenter2.appService;
                Flow flow3 = (Flow) obj3;
                JobKt.launch$default(coroutineScope3, coroutineContext3, null, new InlineAppMessageV2PresenterHelper$models$1$1(flow3, disclosurePresenter2, 0 == true ? 1 : 0, i8), 2);
                JobKt.launch$default(coroutineScope3, coroutineContext3, null, new InlineAppMessageV2PresenterHelper$models$1$1(flow3, disclosurePresenter2, 0 == true ? 1 : 0, i7), 2);
                JobKt.launch$default(coroutineScope3, coroutineContext3, null, new InlineAppMessageV2PresenterHelper$models$1$1(flow3, disclosurePresenter2, 0 == true ? 1 : 0, i5), 2);
                return JobKt.launch$default(coroutineScope3, coroutineContext3, null, new InlineAppMessageV2PresenterHelper$models$1$1(flow3, disclosurePresenter2, 0 == true ? 1 : 0, i2), 2);
            case 9:
                SheetAppMessageEvent sheetAppMessageEvent = (SheetAppMessageEvent) obj2;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                LocalCashBalancePresenter localCashBalancePresenter = (LocalCashBalancePresenter) this.$model;
                Analytics analytics = (Analytics) localCashBalancePresenter.analytics;
                SheetAppMessage sheetAppMessage = (SheetAppMessage) localCashBalancePresenter.syncer;
                String str2 = sheetAppMessage.messageToken;
                MutableState mutableState3 = (MutableState) obj3;
                SheetMessage sheetMessage = (SheetMessage) mutableState3.getValue();
                String str3 = (sheetMessage == null || (halfSheetMessage = sheetMessage.message_format) == null || (zzjrVar = halfSheetMessage.secondaryNavigationAction) == null || (access$getDetailsPage = QuirkSettingsLoader.access$getDetailsPage(zzjrVar)) == null) ? null : access$getDetailsPage.token;
                Long l2 = new Long(((AndroidClock) localCashBalancePresenter.clock).millis());
                String str4 = (String) localCashBalancePresenter.screen;
                SheetAppMessageEvent.CtaButtonClicked ctaButtonClicked = (SheetAppMessageEvent.CtaButtonClicked) sheetAppMessageEvent;
                String str5 = ctaButtonClicked.urlToOpen;
                String str6 = ctaButtonClicked.buttonText;
                boolean z2 = ctaButtonClicked.isHeroContent;
                SheetMessage sheetMessage2 = (SheetMessage) mutableState3.getValue();
                analytics.track(str3 != null ? new DetailsPageInteractTapButton(null, null, str3, str4, null, str6, z2 ? DetailsPageInteractTapButton.DetailsPageButtonLocation.HERO_CONTENT : DetailsPageInteractTapButton.DetailsPageButtonLocation.TREEHOUSE_CONTENT, 19) : new AppMessageInteractClick(l2, sheetMessage2 != null ? sheetMessage2.metadata_id : null, AppMessageFormat.HALF_SHEET, str2, str5, 2), null);
                ((GrpcMethod) localCashBalancePresenter.timestampFormatter).perform(new AppMessageViewEvent.AppMessageActionTaken(sheetAppMessage.messageToken, ctaButtonClicked.urlToOpen, false, sheetAppMessage.parentScreen, 4));
                ((CashAccountDatabaseImpl) localCashBalancePresenter.sessionManager).sheetMessageQueries.deleteByMessageToken(sheetAppMessage.messageToken);
                return Unit.INSTANCE;
            case 10:
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ActivityEvent activityEvent = (ActivityEvent) obj2;
                RealBitcoinAmountPickerPresenter realBitcoinAmountPickerPresenter = (RealBitcoinAmountPickerPresenter) obj3;
                Result result = (Result) realBitcoinAmountPickerPresenter.appBackgroundedListener;
                ConvertFromJavaKt$$Lambda$4 convertFromJavaKt$$Lambda$4 = new ConvertFromJavaKt$$Lambda$4(realBitcoinAmountPickerPresenter, i7);
                AndroidClock androidClock = (AndroidClock) result.text;
                activityEvent.getClass();
                int ordinal2 = activityEvent.ordinal();
                if (ordinal2 == 1) {
                    Long l3 = (Long) result.resultMetadata;
                    if (l3 != null) {
                        if (androidClock.millis() - l3.longValue() >= 300000) {
                            convertFromJavaKt$$Lambda$4.invoke();
                        }
                        result.resultMetadata = null;
                    }
                } else if (ordinal2 == 4) {
                    result.resultMetadata = Long.valueOf(androidClock.millis());
                }
                return Unit.INSTANCE;
            case 11:
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((BitcoinHomePresenter) obj3).navigator.goTo((BitcoinOverlay) obj2);
                return Unit.INSTANCE;
            case 12:
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                LocalTabContentQueries localTabContentQueries2 = ((RealMultiBlockerFacilitator) this.$model).queries;
                Node node = (Node) obj2;
                String str7 = (String) node.prev;
                String str8 = (String) node.lastChild;
                SubmitBlockerRequest.Request.Builder builder = new SubmitBlockerRequest.Request.Builder();
                builder.blocker_descriptor_id = str8;
                SubmitBlockerRequest.Request build = ((SubmitBlockerRequest.Request.Builder) ((Function1) obj3).invoke(builder)).build();
                localTabContentQueries2.getClass();
                str7.getClass();
                str8.getClass();
                QueryResult execute2 = localTabContentQueries2.driver.execute(-1785148824, "INSERT OR REPLACE INTO multiBlockerRequests\nVALUES (?, ?, ?)", new n3$$ExternalSyntheticLambda0(str7, str8, localTabContentQueries2, build, 26));
                localTabContentQueries2.notifyQueries(-1785148824, new MoveBitcoinViewKt$$ExternalSyntheticLambda3(i3));
                return execute2;
            case 13:
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                MutableState mutableState4 = (MutableState) obj3;
                BirthdayPresenter birthdayPresenter = (BirthdayPresenter) this.$model;
                BirthdayEvent$Submit birthdayEvent$Submit = (BirthdayEvent$Submit) obj2;
                BlockersScreens.BirthdayScreen birthdayScreen = birthdayPresenter.args;
                try {
                    LocalDate from = LocalDate.from(birthdayPresenter.dateFormatIn.formatter.parse(birthdayEvent$Submit.birthdate));
                    if (from.isBefore(birthdayPresenter.earliestBirthday)) {
                        internalResult = BirthdayPresenter.InternalResult.INVALID_SUBMISSION;
                    } else {
                        birthdayPresenter.navigator.goTo(birthdayPresenter.blockersNavigator.getNext(birthdayScreen, BlockersData.copy$default(birthdayScreen.blockersData, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, null, null, new RedactedString(BirthdayPresenter.DATE_FORMAT_OUT.format(from)), null, null, BlockersDataKt.plus(birthdayScreen.blockersData.idvSignalsContext, ((RealSecuritySignalsAggregator) birthdayPresenter.securitySignalsAggregator).buildSignalsContext(birthdayEvent$Submit.signalsContext)), null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, -75497473, 65535)));
                        internalResult = BirthdayPresenter.InternalResult.DONE;
                    }
                } catch (DateTimeException unused) {
                    Timber.Forest.e("Invalid birthday.", new Object[0]);
                    internalResult = BirthdayPresenter.InternalResult.INVALID_SUBMISSION;
                }
                int ordinal3 = internalResult.ordinal();
                if (ordinal3 == 0) {
                    copy$default = BirthdayViewModel.copy$default((BirthdayViewModel) mutableState4.getValue(), true);
                } else {
                    if (ordinal3 != 1) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    copy$default = BirthdayViewModel.copy$default((BirthdayViewModel) mutableState4.getValue(), false);
                }
                mutableState4.setValue(copy$default);
                return Unit.INSTANCE;
            case 14:
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                EarnerOnboardingAnalytics earnerOnboardingAnalytics = ((EarnerEnrollmentBlockerPresenter) this.$model).earnerOnboardingAnalytics;
                String str9 = (String) obj2;
                EarnerCategory earnerCategory = (EarnerCategory) ((MutableState) obj3).getValue();
                str9.getClass();
                earnerOnboardingAnalytics.analytics.track(new EarningsOnboardingViewCategorySelection(str9, earnerCategory != null ? earnerCategory.name() : null), null);
                return Unit.INSTANCE;
            case 15:
                PromotionPanePresenter promotionPanePresenter = (PromotionPanePresenter) obj2;
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ApiResult apiResult = (ApiResult) this.$model;
                if (apiResult instanceof ApiResult.Success) {
                    Object obj6 = ((ApiResult.Success) apiResult).response;
                    InitiatePasscodeResetResponse.Status status = ((InitiatePasscodeResetResponse) obj6).status;
                    if (status == null) {
                        status = ProtoDefaults.INITIATE_PASSCODE_RESET_STATUS;
                    }
                    int ordinal4 = status.ordinal();
                    if (ordinal4 == 1) {
                        BetterNavigator.ScreenNavigator screenNavigator = promotionPanePresenter.navigator;
                        FlowStarter flowStarter = (FlowStarter) promotionPanePresenter.flowStarter.getValue();
                        ResponseContext responseContext = ((InitiatePasscodeResetResponse) obj6).response_context;
                        responseContext.getClass();
                        screenNavigator.goTo(((RealFlowStarter) flowStarter).startProfileBlockersFlow(ClientScenario.RESET_PASSCODE, (String) obj3, responseContext.scenario_plan, new Finish(null)));
                    } else {
                        if (ordinal4 != 2) {
                            OptionalProvider$$ExternalSyntheticLambda0.m((Object) status, "Unknown status: ");
                            return null;
                        }
                        promotionPanePresenter.navigator.goTo(PaymentScreens$HomeScreens$Home.INSTANCE);
                    }
                } else {
                    if (!(apiResult instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    promotionPanePresenter.navigator.goTo(new FailureMessageBlockerScreen(BlockersData.DUMMY, 0 == true ? 1 : 0, 0 == true ? 1 : 0, i4));
                }
                return Unit.INSTANCE;
            case 16:
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                SsnViewEvent.Next next = (SsnViewEvent.Next) ((SsnViewEvent) obj2);
                StateFlowKt.sendOrThrow$default((Channel) this.$model, new IdvViewEvent.SubmitSsn(next.ssn, !((BlockersScreens.SsnScreen) ((SsnPresenter) obj3).args).fullSsn, next.signalsContext));
                return Unit.INSTANCE;
            case 17:
                CoroutineScope coroutineScope4 = (CoroutineScope) this.$model;
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                VerifyAliasPresenter verifyAliasPresenter = (VerifyAliasPresenter) obj2;
                Analytics analytics2 = verifyAliasPresenter.analytics;
                BlockersScreens.VerifyAliasScreen verifyAliasScreen = verifyAliasPresenter.args;
                analytics2.track(new AliasVerifyStart(OverlayKt.access$toCdfAliasType(verifyAliasScreen.aliasType), verifyAliasScreen.blockersData.flowToken), null);
                JobKt.launch$default(coroutineScope4, null, null, new VerifyAliasPresenter$models$3$4(verifyAliasPresenter, (MutableState) obj3, 0 == true ? 1 : 0, i8), 3);
                return Unit.INSTANCE;
            case 18:
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                BankAccountLinkingViewModel bankAccountLinkingViewModel = (BankAccountLinkingViewModel) this.$model;
                if (bankAccountLinkingViewModel.errorMessage.value != null || !((Boolean) bankAccountLinkingViewModel.valid.value).booleanValue()) {
                    ((Shaker) obj2).shake();
                    RealCashVibrator realCashVibrator = (RealCashVibrator) obj3;
                    if (realCashVibrator != null) {
                        realCashVibrator.error();
                    }
                }
                return Unit.INSTANCE;
            case 19:
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (((BirthdayViewModel) this.$model).lastSubmissionWasInvalid) {
                    ((Shaker) obj2).shake();
                    ((MutableState) obj3).setValue(InputState.ERROR);
                } else {
                    InputState inputState = InputState.DEFAULT;
                }
                return Unit.INSTANCE;
            case 20:
                Haptics haptics = (Haptics) obj3;
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                StatusResultViewModel.Ready.HapticEffect hapticEffect = (StatusResultViewModel.Ready.HapticEffect) this.$model;
                if (hapticEffect != null) {
                    RealHapticVibrator realHapticVibrator = (RealHapticVibrator) obj2;
                    int ordinal5 = hapticEffect.ordinal();
                    if (ordinal5 == 0) {
                        vibrationEffectFactory = haptics.success;
                    } else {
                        if (ordinal5 != 1) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        vibrationEffectFactory = haptics.failure;
                    }
                    realHapticVibrator.vibrate(vibrationEffectFactory);
                }
                return Unit.INSTANCE;
            case 21:
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                int intValue2 = ((ParcelableSnapshotMutableIntState) ((DefaultPagerState) this.$model).scrollPosition.elementTypes).getIntValue();
                List list2 = (List) obj2;
                if (intValue2 >= list2.size() - 2) {
                    ((Function1) obj3).invoke(new Integer(intValue2 * 7));
                }
                return Unit.INSTANCE;
            case 22:
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Context context = ((CardModelView) this.$model).getContext();
                context.getClass();
                return CardsKt.createInkMetal$default(context, (CardModelView.CardFront) obj2, (CardModelView.CardBack) obj3);
            case 23:
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                MutableState mutableState5 = (MutableState) obj3;
                if (((CardStudioViewModelV2) mutableState5.getValue()) instanceof CardStudioViewModelV2.Content) {
                    CardStudioViewModelV2 cardStudioViewModelV2 = (CardStudioViewModelV2) mutableState5.getValue();
                    cardStudioViewModelV2.getClass();
                    mutableState5.setValue(CardStudioViewModelV2.Content.copy$default((CardStudioViewModelV2.Content) cardStudioViewModelV2, false, null, null, CardStudioPresenter.toCardStudioOrientation((DeviceOrientation) ((MutableState) obj2).getValue()), null, null, false, 1919));
                }
                return Unit.INSTANCE;
            case 24:
                List list3 = (List) obj3;
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                CardDesignLibraryState cardDesignLibraryState = (CardDesignLibraryState) this.$model;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = cardDesignLibraryState.pendingFocusIndex$delegate;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = cardDesignLibraryState.pendingFocusZoom$delegate;
                Integer num = (Integer) parcelableSnapshotMutableState.getValue();
                Integer num2 = (num == null || (intValue = num.intValue()) < 0 || intValue >= list3.size()) ? null : num;
                ZoomLevel zoomLevel = (ZoomLevel) parcelableSnapshotMutableState2.getValue();
                cardDesignLibraryState.pendingFocusIndex$delegate.setValue(null);
                parcelableSnapshotMutableState2.setValue(ZoomLevel.NEAR);
                if (num != null && num2 == null) {
                    cardDesignLibraryState.zoomLevel$delegate.setValue(ZoomLevel.FAR);
                    cardDesignLibraryState.focusedCardIndex$delegate.setIntValue(0);
                }
                CardDesignLibraryScene cardDesignLibraryScene = (CardDesignLibraryScene) obj2;
                cardDesignLibraryScene.getClass();
                list3.getClass();
                zoomLevel.getClass();
                if (!list3.isEmpty()) {
                    StateFlowImpl stateFlowImpl = cardDesignLibraryScene._contentReady;
                    Boolean bool = Boolean.FALSE;
                    stateFlowImpl.getClass();
                    stateFlowImpl.updateState(null, bool);
                    if (num2 != null) {
                        cardDesignLibraryScene.pendingSnapIndex = num2;
                        cardDesignLibraryScene.pendingSnapZoom = zoomLevel;
                    }
                    Job job = cardDesignLibraryScene.batchJob;
                    if (job != null) {
                        job.cancel(null);
                    }
                    cardDesignLibraryScene.batchJob = cardDesignLibraryScene.glLauncher.launch(new SessionWorker$doWork$2$2(list3, cardDesignLibraryScene, (Continuation) (0 == true ? 1 : 0), 13));
                }
                return Unit.INSTANCE;
            case 25:
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                RealClientSyncer realClientSyncer = (RealClientSyncer) this.$model;
                RealClientSyncStorageOperationBatchExecutor realClientSyncStorageOperationBatchExecutor = realClientSyncer.storageOperationBatchExecutor;
                ResetTrigger resetTrigger = (ResetTrigger) obj2;
                ((CompletableDeferredImpl) obj3).makeCompleting$kotlinx_coroutines_core(ClientSyncer$Result.Success);
                return Unit.INSTANCE;
            case 26:
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                RealBlockersHelper realBlockersHelper = (RealBlockersHelper) this.$model;
                AndroidFileProvider androidFileProvider = realBlockersHelper.fileProvider;
                RealFileDownloader realFileDownloader = realBlockersHelper.fileDownloader;
                FileDownloader$Category fileDownloader$Category = FileDownloader$Category.DDA_FORM;
                String str10 = (String) obj2;
                if (realFileDownloader.ready(fileDownloader$Category, str10)) {
                    Uri localUri = realFileDownloader.localUri(fileDownloader$Category, str10);
                    localUri.getClass();
                    return androidFileProvider.contentUriForFileUri(localUri);
                }
                if (realFileDownloader.download(fileDownloader$Category, str10, (String) obj3, false) != FileDownloader$DownloadStatus.SUCCESS) {
                    return null;
                }
                Uri localUri2 = realFileDownloader.localUri(fileDownloader$Category, str10);
                localUri2.getClass();
                return androidFileProvider.contentUriForFileUri(localUri2);
            case 27:
                BlockersHelper.BlockersAction.ShowError showError = (BlockersHelper.BlockersAction.ShowError) this.$model;
                CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((RealBlockersHelper) obj2).navigator.goTo(new BlockersScreens.Error((BlockersData) obj3, showError.message, null));
                return Unit.INSTANCE;
            case 28:
                ScenarioPlan scenarioPlan = (ScenarioPlan) this.$model;
                CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (scenarioPlan != null) {
                    ((RealProfileManager) obj2).observabilityManager.addAction(new ScenarioPlanFoundAction((ClientScenario) obj3));
                }
                return Unit.INSTANCE;
            default:
                CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                LocationSelection locationSelection = (LocationSelection) ((MutableState) obj3).getValue();
                if (locationSelection != null) {
                    AtmWithdrawalMapPresenter atmWithdrawalMapPresenter = (AtmWithdrawalMapPresenter) this.$model;
                    Iterator it = ((List) ((MutableState) obj2).getValue()).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            ?? next2 = it.next();
                            if (Intrinsics.areEqual(((AtmMarkerLocation) next2).retailerLocation.retailer_location_token, locationSelection.locationToken)) {
                                atmMarkerLocation = next2;
                            }
                        }
                    }
                    AtmMarkerLocation atmMarkerLocation2 = atmMarkerLocation;
                    if (atmMarkerLocation2 != null) {
                        AtmRetailerMapScreen atmRetailerMapScreen = atmWithdrawalMapPresenter.args;
                        RetailerMapBlocker retailerMapBlocker = atmRetailerMapScreen.atmWithdrawalBlocker;
                        BlockersData blockersData = atmRetailerMapScreen.blockersData;
                        BenefitExplainerScreen benefitExplainerScreen = retailerMapBlocker.benefit_explainer_screen;
                        if (benefitExplainerScreen != null) {
                            atmWithdrawalExplainerScreen = new AtmPmdExplainerScreen(AtmPmdExplainerScreen.AtmPmdExplainerOrigin.ATM, benefitExplainerScreen.elements, benefitExplainerScreen.footer_elements, blockersData);
                        } else {
                            RetailerMapBlocker.ExplainerScreen explainerScreen = retailerMapBlocker.explainer_screen;
                            explainerScreen.getClass();
                            atmWithdrawalExplainerScreen = new AtmWithdrawalExplainerScreen(explainerScreen, blockersData);
                        }
                        atmWithdrawalMapPresenter.navigator.goTo(new AtmLocationDetailsScreen(atmMarkerLocation2.retailerLocation, atmWithdrawalExplainerScreen));
                    }
                }
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SetNameViewKt$SetName$2$1(MoleculePresenter moleculePresenter, MutableState mutableState, MutableState mutableState2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$model = moleculePresenter;
        this.$inputValue$delegate = mutableState;
        this.$shaker = mutableState2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SetNameViewKt$SetName$2$1(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$model = obj;
        this.$shaker = obj2;
        this.$inputValue$delegate = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SetNameViewKt$SetName$2$1(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$shaker = obj;
        this.$inputValue$delegate = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SetNameViewKt$SetName$2$1(Object obj, Continuation continuation, MoleculePresenter moleculePresenter, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$shaker = obj;
        this.$inputValue$delegate = moleculePresenter;
    }
}
