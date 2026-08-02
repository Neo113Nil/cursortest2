package com.squareup.cash.boost.backend;

import android.os.Parcelable;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.node.PointerInputModifierNodeKt;
import androidx.core.text.TextUtilsCompat;
import androidx.room.util.DBUtil;
import app.cash.api.ApiResult;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.screen.Screen;
import app.cash.local.presenters.RealBrandFollowPresenter$models$2$1$1;
import app.cash.local.presenters.pos.LocalPosCheckInPresenter;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import app.cash.passcode.presenters.EndAppLockPresenter;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.memory.RealStrongMemoryCache;
import com.google.zxing.Result;
import com.squareup.cash.R;
import com.squareup.cash.badging.db.BadgeQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.biometrics.BiometricsStore$read$1;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.flowlistener.BlockerFlowListener;
import com.squareup.cash.blockers.presenters.ErrorPresenter;
import com.squareup.cash.blockers.presenters.RealIdvPresenter$models$1$1;
import com.squareup.cash.blockers.presenters.SetPinPresenter;
import com.squareup.cash.blockers.presenters.SsnPresenter;
import com.squareup.cash.blockers.presenters.SsnPresenter$models$$inlined$CollectEffect$1$1;
import com.squareup.cash.blockers.presenters.StatusResultPresenter;
import com.squareup.cash.blockers.presenters.VerifyAliasPresenter;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.viewmodels.VerifyInstrumentModel;
import com.squareup.cash.blockers.views.PasscodeViewKt$Passcode$3$1$1$1$2;
import com.squareup.cash.blockers.views.PlaidLinkView;
import com.squareup.cash.blockers.web.presenters.WebViewBlockerPresenter;
import com.squareup.cash.blockers.web.viewmodels.WebViewBlockerViewEvent;
import com.squareup.cash.blockers.web.viewmodels.WebViewBlockerViewModel;
import com.squareup.cash.boost.db.RewardQueries;
import com.squareup.cash.boost.db.RewardQueries$$ExternalSyntheticLambda4;
import com.squareup.cash.borrow.presenters.BorrowHomePresenter;
import com.squareup.cash.borrow.presenters.LoanAmountPickerPresenter;
import com.squareup.cash.borrow.screens.BorrowHome;
import com.squareup.cash.borrow.screens.BorrowHomeOverlay;
import com.squareup.cash.bugreporting.viewmodels.Screenshot;
import com.squareup.cash.buynowpaylater.presenters.AfterPayOrderDetailsPresenter$State;
import com.squareup.cash.buynowpaylater.viewmodels.AfterPayOrderDetailsViewModel;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import com.squareup.cash.card.onboarding.CardStudioPresenterV2$initialModel$2;
import com.squareup.cash.card.onboarding.CardStudioViewModelV2;
import com.squareup.cash.card.onboarding.CardStylePickerPresenter;
import com.squareup.cash.card.onboarding.CardStylePickerPresenter$models$1$2;
import com.squareup.cash.card.onboarding.CardStylePickerPresenter$models$2$1;
import com.squareup.cash.card.onboarding.CardStylePickerViewKt$CardStylePicker$1$1$1$3$1$3;
import com.squareup.cash.card.onboarding.CustomizationDetails;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.card.onboarding.ListIndices;
import com.squareup.cash.card.onboarding.PaymentDeviceCustomizationPresenter;
import com.squareup.cash.card.onboarding.StampSheetViewModel;
import com.squareup.cash.card.onboarding.StyledCardViewModelKt;
import com.squareup.cash.card.onboarding.TagOrderConfirmationPresenter;
import com.squareup.cash.card.onboarding.screens.CardStudioScreen;
import com.squareup.cash.cdf.instrument.InstrumentVerifyComplete;
import com.squareup.cash.cdf.instrument.InstrumentVerifyReceiveError;
import com.squareup.cash.checks.CaptureCheckFacePresenter$models$2$1$1;
import com.squareup.cash.common.composeui.DrawerViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.common.messaging.screens.FailureMessageBlockerScreen;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.RealBlockersHelper$collectBlockersActions$2;
import com.squareup.cash.data.contacts.RealContactRepository$contacts$$inlined$map$1;
import com.squareup.cash.db.SessionQueries;
import com.squareup.cash.device.DeviceOrientation;
import com.squareup.cash.filepicker.FilePickerResult;
import com.squareup.cash.fileupload.api.FileMetadata;
import com.squareup.cash.fileupload.api.FileValidator$Result;
import com.squareup.cash.instruments.backend.api.InstrumentVerifier$Args;
import com.squareup.cash.instruments.backend.api.InstrumentVerifier$Result;
import com.squareup.cash.instruments.backend.real.RealInstrumentVerifier;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.music.presenters.MusicPresenter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Redacted;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.SubmitFormResponse;
import com.squareup.protos.franklin.cards.TouchData;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.lending.sync_values.BorrowAppletLoanHistoryTile;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes4.dex */
public final class RealBoostSelector$removeBoost$1 extends SuspendLambda implements Function2 {
    public Object $offerToken;
    public final /* synthetic */ Object $onUpdateOfferInflight;
    public final /* synthetic */ Object $plasmaFlowToken;
    public final /* synthetic */ int $r8$classId;
    public int label;
    public Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealBoostSelector$removeBoost$1(LocalHomePresenter localHomePresenter, String str, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 8;
        this.$plasmaFlowToken = localHomePresenter;
        this.$offerToken = str;
        this.$onUpdateOfferInflight = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$onUpdateOfferInflight;
        Object obj3 = this.$plasmaFlowToken;
        switch (i) {
            case 0:
                return new RealBoostSelector$removeBoost$1((RealBoostSelector) this.this$0, (String) this.$offerToken, (String) obj3, (Function1) obj2, continuation, 0);
            case 1:
                RealBoostSelector$removeBoost$1 realBoostSelector$removeBoost$1 = new RealBoostSelector$removeBoost$1((Integer) this.$offerToken, continuation, (SetPinPresenter) obj3, (MutableState) obj2, 1);
                realBoostSelector$removeBoost$1.this$0 = obj;
                return realBoostSelector$removeBoost$1;
            case 2:
                RealBoostSelector$removeBoost$1 realBoostSelector$removeBoost$12 = new RealBoostSelector$removeBoost$1((Flow) this.$offerToken, continuation, (LocalHomePresenter) obj3, (MutableState) obj2, 2);
                realBoostSelector$removeBoost$12.this$0 = obj;
                return realBoostSelector$removeBoost$12;
            case 3:
                RealBoostSelector$removeBoost$1 realBoostSelector$removeBoost$13 = new RealBoostSelector$removeBoost$1((Flow) this.$offerToken, continuation, (SsnPresenter) obj3, (Channel) obj2, 3);
                realBoostSelector$removeBoost$13.this$0 = obj;
                return realBoostSelector$removeBoost$13;
            case 4:
                RealBoostSelector$removeBoost$1 realBoostSelector$removeBoost$14 = new RealBoostSelector$removeBoost$1((Flow) this.$offerToken, continuation, (StatusResultPresenter) obj3, (MutableState) obj2, 4);
                realBoostSelector$removeBoost$14.this$0 = obj;
                return realBoostSelector$removeBoost$14;
            case 5:
                RealBoostSelector$removeBoost$1 realBoostSelector$removeBoost$15 = new RealBoostSelector$removeBoost$1((Flow) this.$offerToken, continuation, (DisclosurePresenter) obj3, (MutableState) obj2, 5);
                realBoostSelector$removeBoost$15.this$0 = obj;
                return realBoostSelector$removeBoost$15;
            case 6:
                RealBoostSelector$removeBoost$1 realBoostSelector$removeBoost$16 = new RealBoostSelector$removeBoost$1((Flow) this.$offerToken, continuation, (VerifyAliasPresenter) obj3, (MutableState) obj2, 6);
                realBoostSelector$removeBoost$16.this$0 = obj;
                return realBoostSelector$removeBoost$16;
            case 7:
                RealBoostSelector$removeBoost$1 realBoostSelector$removeBoost$17 = new RealBoostSelector$removeBoost$1((Flow) this.$offerToken, continuation, (LocalHomePresenter) obj3, (MutableState) obj2, 7);
                realBoostSelector$removeBoost$17.this$0 = obj;
                return realBoostSelector$removeBoost$17;
            case 8:
                return new RealBoostSelector$removeBoost$1((LocalHomePresenter) obj3, (String) this.$offerToken, (MutableState) obj2, continuation);
            case 9:
                RealBoostSelector$removeBoost$1 realBoostSelector$removeBoost$18 = new RealBoostSelector$removeBoost$1((Flow) this.$offerToken, continuation, (BlockersScreens.WebViewBlockerScreen) obj3, (WebViewBlockerPresenter) obj2, 9);
                realBoostSelector$removeBoost$18.this$0 = obj;
                return realBoostSelector$removeBoost$18;
            case 10:
                return new RealBoostSelector$removeBoost$1((WebViewBlockerViewEvent) this.this$0, (WebViewBlockerPresenter) this.$offerToken, (BlockersScreens.WebViewBlockerScreen) obj3, (MutableState) obj2, continuation, 10);
            case 11:
                RealBoostSelector$removeBoost$1 realBoostSelector$removeBoost$19 = new RealBoostSelector$removeBoost$1((Flow) this.$offerToken, continuation, (LocalPosCheckInPresenter) obj3, (MutableState) obj2, 11);
                realBoostSelector$removeBoost$19.this$0 = obj;
                return realBoostSelector$removeBoost$19;
            case 12:
                RealBoostSelector$removeBoost$1 realBoostSelector$removeBoost$110 = new RealBoostSelector$removeBoost$1((Flow) this.$offerToken, continuation, (DisclosurePresenter) obj3, (MutableState) obj2, 12);
                realBoostSelector$removeBoost$110.this$0 = obj;
                return realBoostSelector$removeBoost$110;
            case 13:
                return new RealBoostSelector$removeBoost$1((BorrowHomePresenter) this.this$0, (BorrowHome.InitialState) this.$offerToken, (MutableState) obj3, (MutableState) obj2, continuation, 13);
            case 14:
                RealBoostSelector$removeBoost$1 realBoostSelector$removeBoost$111 = new RealBoostSelector$removeBoost$1((Flow) this.$offerToken, continuation, (LoanAmountPickerPresenter) obj3, (MutableState) obj2, 14);
                realBoostSelector$removeBoost$111.this$0 = obj;
                return realBoostSelector$removeBoost$111;
            case 15:
                RealBoostSelector$removeBoost$1 realBoostSelector$removeBoost$112 = new RealBoostSelector$removeBoost$1((Flow) this.$offerToken, continuation, (EndAppLockPresenter) obj3, (ParcelableSnapshotMutableIntState) obj2, 15);
                realBoostSelector$removeBoost$112.this$0 = obj;
                return realBoostSelector$removeBoost$112;
            case 16:
                return new RealBoostSelector$removeBoost$1((LocalHomePresenter) this.this$0, (FilePickerResult) this.$offerToken, (MutableState) obj3, (MutableState) obj2, continuation, 16);
            case 17:
                RealBoostSelector$removeBoost$1 realBoostSelector$removeBoost$113 = new RealBoostSelector$removeBoost$1((Flow) this.$offerToken, continuation, (CardStudioPresenter) obj3, (MutableState) obj2, 17);
                realBoostSelector$removeBoost$113.this$0 = obj;
                return realBoostSelector$removeBoost$113;
            case 18:
                return new RealBoostSelector$removeBoost$1((CardStudioPresenter) obj3, (MutableState) obj2, continuation);
            case 19:
                RealBoostSelector$removeBoost$1 realBoostSelector$removeBoost$114 = new RealBoostSelector$removeBoost$1((Flow) this.$offerToken, continuation, (LocalPosCheckInPresenter) obj3, (MutableState) obj2, 19);
                realBoostSelector$removeBoost$114.this$0 = obj;
                return realBoostSelector$removeBoost$114;
            case 20:
                RealBoostSelector$removeBoost$1 realBoostSelector$removeBoost$115 = new RealBoostSelector$removeBoost$1((Flow) this.$offerToken, continuation, (ErrorPresenter) obj3, (MutableState) obj2, 20);
                realBoostSelector$removeBoost$115.this$0 = obj;
                return realBoostSelector$removeBoost$115;
            case 21:
                RealBoostSelector$removeBoost$1 realBoostSelector$removeBoost$116 = new RealBoostSelector$removeBoost$1((Flow) this.$offerToken, continuation, (CardStudioPresenter) obj3, (MutableState) obj2, 21);
                realBoostSelector$removeBoost$116.this$0 = obj;
                return realBoostSelector$removeBoost$116;
            case 22:
                return new RealBoostSelector$removeBoost$1(22, (MutableState) obj2, (State) obj3, (CardStudioPresenter) this.$offerToken, continuation);
            case 23:
                return new RealBoostSelector$removeBoost$1(23, (MutableState) obj2, (MutableState) obj3, (CardStylePickerPresenter) this.$offerToken, continuation);
            case 24:
                return new RealBoostSelector$removeBoost$1((MutableState) this.this$0, (ListIndices) this.$offerToken, (LazyListState) obj3, (MutableState) obj2, continuation, 24);
            case 25:
                RealBoostSelector$removeBoost$1 realBoostSelector$removeBoost$117 = new RealBoostSelector$removeBoost$1((Flow) this.$offerToken, continuation, (DisclosurePresenter) obj3, (MutableState) obj2, 25);
                realBoostSelector$removeBoost$117.this$0 = obj;
                return realBoostSelector$removeBoost$117;
            case 26:
                return new RealBoostSelector$removeBoost$1((PaymentDeviceCustomizationPresenter) this.this$0, (Map) this.$offerToken, (MutableState) obj3, (MutableState) obj2, continuation, 26);
            case 27:
                return new RealBoostSelector$removeBoost$1(27, (MutableState) obj2, (MutableState) obj3, (MusicPresenter) this.$offerToken, continuation);
            case 28:
                return new RealBoostSelector$removeBoost$1(28, (MutableState) obj2, (MutableState) obj3, (MusicPresenter) this.$offerToken, continuation);
            default:
                RealBoostSelector$removeBoost$1 realBoostSelector$removeBoost$118 = new RealBoostSelector$removeBoost$1((Flow) this.$offerToken, continuation, (TagOrderConfirmationPresenter) obj3, (MutableState) obj2, 29);
                realBoostSelector$removeBoost$118.this$0 = obj;
                return realBoostSelector$removeBoost$118;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((RealBoostSelector$removeBoost$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x01d6, code lost:
    
        if (r3 == r2) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01c8, code lost:
    
        if (kotlinx.coroutines.JobKt.withContext(r1, r3, r26) == r2) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x0699, code lost:
    
        if (r4 == r8) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x0a42, code lost:
    
        if (r1.updateBoostMultiSelectInternal(com.squareup.cash.screens.Back.INSTANCE, null, (java.lang.String) r2, (java.lang.String) r13, com.squareup.cash.cdf.offers.OfferUpdateType.REMOVE, r0, (kotlin.jvm.functions.Function1) r12, null, r26) == r11) goto L443;
     */
    /* JADX WARN: Code restructure failed: missing block: B:501:0x0a25, code lost:
    
        if (r2 == r11) goto L443;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e8, code lost:
    
        if (r0 == r2) goto L86;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:325:0x06e1  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x06f3  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object firstOrNull;
        Object verify;
        InstrumentVerifier$Result instrumentVerifier$Result;
        BlockersDataNavigator blockersDataNavigator;
        Analytics analytics;
        BetterNavigator.ScreenNavigator screenNavigator;
        BlockersScreens.VerifyCardScreen verifyCardScreen;
        InstrumentVerifier$Result instrumentVerifier$Result2;
        BlockersData.AnalyticsData.Source source;
        String str;
        BlockersData.AnalyticsData.Source source2;
        String str2;
        BlockersData.AnalyticsData.Source source3;
        Object withContext;
        Object access$initialLoanDetailsSheet;
        Object m1457validate8YU3vEA;
        MutableState mutableState;
        Object access$loadOrderDetails;
        AfterPayOrderDetailsPresenter$State afterPayOrderDetailsPresenter$State;
        Object withContext2;
        MutableState mutableState2;
        Object withContext3;
        CardStylePickerPresenter.CardCustomization cardCustomization;
        Object withContext4;
        Object withContext5;
        MutableState mutableState3;
        Object withContext6;
        MutableState mutableState4;
        int i = this.$r8$classId;
        int i2 = 26;
        int i3 = 4;
        int i4 = 29;
        int i5 = 6;
        int i6 = 21;
        int i7 = 22;
        int i8 = 3;
        int i9 = 2;
        Object obj2 = this.$onUpdateOfferInflight;
        Object obj3 = this.$plasmaFlowToken;
        int i10 = 1;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        switch (i) {
            case 0:
                String str3 = (String) this.$offerToken;
                RealBoostSelector realBoostSelector = (RealBoostSelector) this.this$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealBoostProvider realBoostProvider = realBoostSelector.boostProvider;
                    SessionQueries sessionQueries = realBoostProvider.selectedRewardQueries;
                    sessionQueries.getClass();
                    RealContactRepository$contacts$$inlined$map$1 realContactRepository$contacts$$inlined$map$1 = new RealContactRepository$contacts$$inlined$map$1(DBUtil.mapToList(DBUtil.toFlow(new RewardQueries.ForIdsQuery(sessionQueries, str3, new RewardQueries$$ExternalSyntheticLambda4(i7), 11)), realBoostProvider.ioDispatcher), i8);
                    this.label = 1;
                    firstOrNull = FlowKt.firstOrNull(realContactRepository$contacts$$inlined$map$1, this);
                    break;
                } else if (i11 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    firstOrNull = obj;
                } else if (i11 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                this.label = 2;
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealBrandFollowPresenter$models$2$1$1 realBrandFollowPresenter$models$2$1$1 = new RealBrandFollowPresenter$models$2$1$1(15, (MutableState) obj2);
                    this.this$0 = null;
                    this.label = 1;
                    if (SetPinPresenter.access$forgotPasscode((SetPinPresenter) obj3, realBrandFollowPresenter$models$2$1$1, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i12 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 2:
                CoroutineScope coroutineScope = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                if (i13 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow = (Flow) this.$offerToken;
                    SsnPresenter$models$$inlined$CollectEffect$1$1 ssnPresenter$models$$inlined$CollectEffect$1$1 = new SsnPresenter$models$$inlined$CollectEffect$1$1(20, coroutineScope, (LocalHomePresenter) obj3, (MutableState) obj2);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow.collect(ssnPresenter$models$$inlined$CollectEffect$1$1, this) == coroutineSingletons3) {
                        break;
                    }
                } else if (i13 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 3:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow2 = (Flow) this.$offerToken;
                    SsnPresenter$models$$inlined$CollectEffect$1$1 ssnPresenter$models$$inlined$CollectEffect$1$12 = new SsnPresenter$models$$inlined$CollectEffect$1$1(0, coroutineScope2, (SsnPresenter) obj3, (Channel) obj2);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow2.collect(ssnPresenter$models$$inlined$CollectEffect$1$12, this) == coroutineSingletons4) {
                        break;
                    }
                } else if (i14 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 4:
                CoroutineScope coroutineScope3 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow3 = (Flow) this.$offerToken;
                    SsnPresenter$models$$inlined$CollectEffect$1$1 ssnPresenter$models$$inlined$CollectEffect$1$13 = new SsnPresenter$models$$inlined$CollectEffect$1$1(21, coroutineScope3, (StatusResultPresenter) obj3, (MutableState) obj2);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow3.collect(ssnPresenter$models$$inlined$CollectEffect$1$13, this) == coroutineSingletons5) {
                        break;
                    }
                } else if (i15 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 5:
                CoroutineScope coroutineScope4 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.label;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow4 = (Flow) this.$offerToken;
                    SsnPresenter$models$$inlined$CollectEffect$1$1 ssnPresenter$models$$inlined$CollectEffect$1$14 = new SsnPresenter$models$$inlined$CollectEffect$1$1(i7, coroutineScope4, (DisclosurePresenter) obj3, (MutableState) obj2);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow4.collect(ssnPresenter$models$$inlined$CollectEffect$1$14, this) == coroutineSingletons6) {
                        break;
                    }
                } else if (i16 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 6:
                CoroutineScope coroutineScope5 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.label;
                if (i17 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow5 = (Flow) this.$offerToken;
                    SsnPresenter$models$$inlined$CollectEffect$1$1 ssnPresenter$models$$inlined$CollectEffect$1$15 = new SsnPresenter$models$$inlined$CollectEffect$1$1(23, coroutineScope5, (VerifyAliasPresenter) obj3, (MutableState) obj2);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow5.collect(ssnPresenter$models$$inlined$CollectEffect$1$15, this) == coroutineSingletons7) {
                        break;
                    }
                } else if (i17 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 7:
                CoroutineScope coroutineScope6 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.label;
                if (i18 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow6 = (Flow) this.$offerToken;
                    SsnPresenter$models$$inlined$CollectEffect$1$1 ssnPresenter$models$$inlined$CollectEffect$1$16 = new SsnPresenter$models$$inlined$CollectEffect$1$1(24, coroutineScope6, (LocalHomePresenter) obj3, (MutableState) obj2);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow6.collect(ssnPresenter$models$$inlined$CollectEffect$1$16, this) == coroutineSingletons8) {
                        break;
                    }
                } else if (i18 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 8:
                MutableState mutableState5 = (MutableState) obj2;
                LocalHomePresenter localHomePresenter = (LocalHomePresenter) obj3;
                VerifyInstrumentModel verifyInstrumentModel = (VerifyInstrumentModel) localHomePresenter.embeddedMapEnabled$delegate;
                BlockersDataNavigator blockersDataNavigator2 = (BlockersDataNavigator) localHomePresenter.featureFlagManager;
                AndroidStringManager androidStringManager = (AndroidStringManager) localHomePresenter.syncer;
                Analytics analytics2 = (Analytics) localHomePresenter.store;
                BetterNavigator.ScreenNavigator screenNavigator2 = (BetterNavigator.ScreenNavigator) localHomePresenter.navigator;
                BlockersScreens.VerifyCardScreen verifyCardScreen2 = (BlockersScreens.VerifyCardScreen) localHomePresenter.tabContentPresenterFactory;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = this.label;
                if (i19 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    mutableState5.setValue(VerifyInstrumentModel.copy$default((VerifyInstrumentModel) mutableState5.getValue(), null, true, 11));
                    RealInstrumentVerifier realInstrumentVerifier = (RealInstrumentVerifier) localHomePresenter.localHomeGeoPresenterFactory;
                    BlockersData blockersData = verifyCardScreen2.blockersData;
                    InstrumentVerifier$Args instrumentVerifier$Args = new InstrumentVerifier$Args((String) this.$offerToken, null, null, blockersData.clientScenario, blockersData.flowToken, 6);
                    this.label = 1;
                    verify = realInstrumentVerifier.verify(instrumentVerifier$Args, this);
                    break;
                } else if (i19 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    verify = obj;
                } else if (i19 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    instrumentVerifier$Result2 = (InstrumentVerifier$Result) this.this$0;
                    SafeTrace.throwOnFailure(obj);
                    blockersDataNavigator = blockersDataNavigator2;
                    analytics = analytics2;
                    screenNavigator = screenNavigator2;
                    verifyCardScreen = verifyCardScreen2;
                    instrumentVerifier$Result = instrumentVerifier$Result2;
                    if (!(instrumentVerifier$Result instanceof InstrumentVerifier$Result.Loading)) {
                        if (!(instrumentVerifier$Result instanceof InstrumentVerifier$Result.Successful)) {
                            if (!(instrumentVerifier$Result instanceof InstrumentVerifier$Result.NotSuccessful)) {
                                if (!(instrumentVerifier$Result instanceof InstrumentVerifier$Result.NetworkFailure)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    break;
                                } else {
                                    ApiResult.Failure failure = ((InstrumentVerifier$Result.NetworkFailure) instrumentVerifier$Result).failure;
                                    String str4 = TextUtilsCompat.errorMessaging(androidStringManager, failure, null).message;
                                    ClientScenario clientScenario = verifyCardScreen.blockersData.clientScenario;
                                    String name = clientScenario != null ? clientScenario.name() : null;
                                    BlockersData blockersData2 = verifyCardScreen.blockersData;
                                    String str5 = blockersData2.flowToken;
                                    String name2 = blockersData2.ratePlan.name();
                                    BlockersData.AnalyticsData analyticsData = verifyCardScreen.blockersData.analyticsData;
                                    analytics.track(new InstrumentVerifyReceiveError(name, str5, str4, Boolean.valueOf(failure instanceof ApiResult.Failure.NetworkFailure), name2, (analyticsData == null || (source = analyticsData.source) == null) ? null : source.getAnalyticsName(), 32), null);
                                    mutableState5.setValue(verifyInstrumentModel);
                                    screenNavigator.goTo(new FailureMessageBlockerScreen(verifyCardScreen.blockersData, str4, null, 4));
                                }
                            } else {
                                BlockersData blockersData3 = verifyCardScreen.blockersData;
                                InstrumentVerifier$Result.NotSuccessful notSuccessful = (InstrumentVerifier$Result.NotSuccessful) instrumentVerifier$Result;
                                String str6 = notSuccessful.failureMessage;
                                ResponseContext responseContext = notSuccessful.responseContext;
                                Parcelable.Creator<BlockersData> creator = BlockersData.CREATOR;
                                BlockersData updateFromResponseContext = blockersData3.updateFromResponseContext(responseContext, false);
                                int ordinal = notSuccessful.status.ordinal();
                                if (ordinal != 0) {
                                    if (ordinal == 1) {
                                        Screen next = blockersDataNavigator.getNext(verifyCardScreen, updateFromResponseContext);
                                        if (str6 == null || StringsKt.isBlank(str6)) {
                                            screenNavigator.goTo(next);
                                        } else {
                                            screenNavigator.goTo(new BlockersScreens.SuccessMessageScreen(updateFromResponseContext, next, str6, null, 8));
                                        }
                                        str2 = "Blocker Verify Card Too Many";
                                    } else if (ordinal != 2) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        break;
                                    } else {
                                        ((BlockerFlowListener) localHomePresenter.clearMarketingBadgesIfNeeded).onFlowCancelled(verifyCardScreen.blockersData);
                                        screenNavigator.goTo(verifyCardScreen.blockersData.exitScreen);
                                        str2 = "Blocker Verify Card Concurrent Mod";
                                    }
                                    str = str2;
                                } else {
                                    Timber.Forest.e("Failed to verify Card.", new Object[0]);
                                    str6.getClass();
                                    mutableState5.setValue(VerifyInstrumentModel.copy$default(verifyInstrumentModel, str6, false, 14));
                                    str = null;
                                }
                                ClientScenario clientScenario2 = verifyCardScreen.blockersData.clientScenario;
                                String name3 = clientScenario2 != null ? clientScenario2.name() : null;
                                BlockersData blockersData4 = verifyCardScreen.blockersData;
                                String str7 = blockersData4.flowToken;
                                String name4 = blockersData4.ratePlan.name();
                                BlockersData.AnalyticsData analyticsData2 = verifyCardScreen.blockersData.analyticsData;
                                analytics.track(new InstrumentVerifyReceiveError(name3, str7, str, null, name4, (analyticsData2 == null || (source2 = analyticsData2.source) == null) ? null : source2.getAnalyticsName(), 40), null);
                            }
                        } else {
                            BlockersData blockersData5 = verifyCardScreen.blockersData;
                            ResponseContext responseContext2 = ((InstrumentVerifier$Result.Successful) instrumentVerifier$Result).responseContext;
                            Parcelable.Creator<BlockersData> creator2 = BlockersData.CREATOR;
                            BlockersData updateFromResponseContext2 = blockersData5.updateFromResponseContext(responseContext2, false);
                            Timber.Forest.d("Card verified successfully.", new Object[0]);
                            ClientScenario clientScenario3 = verifyCardScreen.blockersData.clientScenario;
                            String name5 = clientScenario3 != null ? clientScenario3.name() : null;
                            BlockersData blockersData6 = verifyCardScreen.blockersData;
                            String str8 = blockersData6.flowToken;
                            String name6 = blockersData6.ratePlan.name();
                            BlockersData.AnalyticsData analyticsData3 = verifyCardScreen.blockersData.analyticsData;
                            analytics.track(new InstrumentVerifyComplete(name5, str8, name6, (analyticsData3 == null || (source3 = analyticsData3.source) == null) ? null : source3.getAnalyticsName()), null);
                            screenNavigator.goTo(blockersDataNavigator.getNext(verifyCardScreen, updateFromResponseContext2));
                        }
                    } else {
                        mutableState5.setValue(VerifyInstrumentModel.copy$default((VerifyInstrumentModel) mutableState5.getValue(), null, true, 11));
                    }
                    break;
                }
                instrumentVerifier$Result = (InstrumentVerifier$Result) verify;
                if (!Intrinsics.areEqual(instrumentVerifier$Result, InstrumentVerifier$Result.Loading.INSTANCE)) {
                    BlockersData blockersData7 = verifyCardScreen2.blockersData;
                    this.this$0 = instrumentVerifier$Result;
                    this.label = 2;
                    blockersDataNavigator = blockersDataNavigator2;
                    verifyCardScreen = verifyCardScreen2;
                    screenNavigator = screenNavigator2;
                    analytics = analytics2;
                    Object trackBlockerSubmissionAnalyticsInternal2 = PointerInputModifierNodeKt.trackBlockerSubmissionAnalyticsInternal2(analytics, androidStringManager, blockersData7, R.string.blockers_retrofit_error_message, new BadgeQueries$$ExternalSyntheticLambda0(21, instrumentVerifier$Result, androidStringManager), new BiometricsStore$read$1(1, null, 2), this);
                    if (trackBlockerSubmissionAnalyticsInternal2 != coroutineSingletons9) {
                        trackBlockerSubmissionAnalyticsInternal2 = Unit.INSTANCE;
                    }
                    if (trackBlockerSubmissionAnalyticsInternal2 != coroutineSingletons9) {
                        instrumentVerifier$Result2 = instrumentVerifier$Result;
                        instrumentVerifier$Result = instrumentVerifier$Result2;
                        if (!(instrumentVerifier$Result instanceof InstrumentVerifier$Result.Loading)) {
                        }
                    }
                    break;
                } else {
                    blockersDataNavigator = blockersDataNavigator2;
                    analytics = analytics2;
                    screenNavigator = screenNavigator2;
                    verifyCardScreen = verifyCardScreen2;
                    if (!(instrumentVerifier$Result instanceof InstrumentVerifier$Result.Loading)) {
                    }
                }
                break;
            case 9:
                CoroutineScope coroutineScope7 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = this.label;
                if (i20 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow7 = (Flow) this.$offerToken;
                    PasscodeViewKt$Passcode$3$1$1$1$2 passcodeViewKt$Passcode$3$1$1$1$2 = new PasscodeViewKt$Passcode$3$1$1$1$2(coroutineScope7, (BlockersScreens.WebViewBlockerScreen) obj3, (WebViewBlockerPresenter) obj2, i2);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow7.collect(passcodeViewKt$Passcode$3$1$1$1$2, this) == coroutineSingletons10) {
                        break;
                    }
                } else if (i20 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 10:
                MutableState mutableState6 = (MutableState) obj2;
                WebViewBlockerViewEvent webViewBlockerViewEvent = (WebViewBlockerViewEvent) this.this$0;
                BlockersScreens.WebViewBlockerScreen webViewBlockerScreen = (BlockersScreens.WebViewBlockerScreen) obj3;
                BlockersData blockersData8 = webViewBlockerScreen.blockersData;
                WebViewBlockerPresenter webViewBlockerPresenter = (WebViewBlockerPresenter) this.$offerToken;
                BetterNavigator.ScreenNavigator screenNavigator3 = webViewBlockerPresenter.navigator;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.label;
                if (i21 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    WebViewBlockerViewEvent.FooterButtonClick footerButtonClick = (WebViewBlockerViewEvent.FooterButtonClick) webViewBlockerViewEvent;
                    if (!footerButtonClick.shouldEndFlow) {
                        mutableState6.setValue(WebViewBlockerPresenter.access$updateLoadingState(webViewBlockerPresenter, (WebViewBlockerViewModel) mutableState6.getValue(), true));
                        Result result = webViewBlockerPresenter.webViewBlockerRepo;
                        ClientScenario clientScenario4 = blockersData8.clientScenario;
                        clientScenario4.getClass();
                        String str9 = blockersData8.flowToken;
                        RequestContext requestContext = blockersData8.requestContext;
                        String str10 = footerButtonClick.actionId;
                        String str11 = webViewBlockerScreen.url;
                        this.label = 1;
                        withContext = JobKt.withContext((CoroutineContext) result.resultMetadata, new RealIdvPresenter$models$1$1(str11, requestContext, str10, result, clientScenario4, str9, (Continuation) null), this);
                        if (withContext == coroutineSingletons11) {
                            break;
                        }
                    } else {
                        screenNavigator3.goTo(blockersData8.exitScreen);
                        break;
                    }
                } else if (i21 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    withContext = obj;
                }
                ApiResult apiResult = (ApiResult) withContext;
                if (apiResult instanceof ApiResult.Success) {
                    ResponseContext responseContext3 = ((SubmitFormResponse) ((ApiResult.Success) apiResult).response).response_context;
                    if (responseContext3 != null) {
                        Parcelable.Creator<BlockersData> creator3 = BlockersData.CREATOR;
                        blockersData8 = blockersData8.updateFromResponseContext(responseContext3, false);
                    }
                    screenNavigator3.goTo(webViewBlockerPresenter.blockersDataNavigator.getNext(webViewBlockerScreen, blockersData8));
                } else {
                    mutableState6.setValue(WebViewBlockerPresenter.access$updateLoadingState(webViewBlockerPresenter, (WebViewBlockerViewModel) mutableState6.getValue(), false));
                    screenNavigator3.goTo(new FailureMessageBlockerScreen(blockersData8, objArr2 == true ? 1 : 0, objArr == true ? 1 : 0, 6));
                }
            case 11:
                CoroutineScope coroutineScope8 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = this.label;
                if (i22 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow8 = (Flow) this.$offerToken;
                    SsnPresenter$models$$inlined$CollectEffect$1$1 ssnPresenter$models$$inlined$CollectEffect$1$17 = new SsnPresenter$models$$inlined$CollectEffect$1$1(25, coroutineScope8, (LocalPosCheckInPresenter) obj3, (MutableState) obj2);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow8.collect(ssnPresenter$models$$inlined$CollectEffect$1$17, this) == coroutineSingletons12) {
                        break;
                    }
                } else if (i22 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 12:
                CoroutineScope coroutineScope9 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i23 = this.label;
                if (i23 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow9 = (Flow) this.$offerToken;
                    PasscodeViewKt$Passcode$3$1$1$1$2 passcodeViewKt$Passcode$3$1$1$1$22 = new PasscodeViewKt$Passcode$3$1$1$1$2(coroutineScope9, (DisclosurePresenter) obj3, (MutableState) obj2, i4);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow9.collect(passcodeViewKt$Passcode$3$1$1$1$22, this) == coroutineSingletons13) {
                        break;
                    }
                } else if (i23 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 13:
                BorrowHome.InitialState initialState = (BorrowHome.InitialState) this.$offerToken;
                BorrowHomePresenter borrowHomePresenter = (BorrowHomePresenter) this.this$0;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i24 = this.label;
                if (i24 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    List list = (List) ((MutableState) obj3).getValue();
                    String str12 = ((BorrowHome.InitialState.DisplayingLoanDetails) initialState).token;
                    this.label = 1;
                    access$initialLoanDetailsSheet = BorrowHomePresenter.access$initialLoanDetailsSheet(borrowHomePresenter, list, str12, this);
                    if (access$initialLoanDetailsSheet == coroutineSingletons14) {
                        break;
                    }
                } else if (i24 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    access$initialLoanDetailsSheet = obj;
                }
                BorrowAppletLoanHistoryTile.Data.Loan.Details details = (BorrowAppletLoanHistoryTile.Data.Loan.Details) access$initialLoanDetailsSheet;
                if (details != null) {
                    borrowHomePresenter.navigator.goTo(new BorrowHomeOverlay.LoanDetails(details, ((BorrowHome.InitialState.DisplayingLoanDetails) initialState).token, borrowHomePresenter.argsAsOrigin));
                }
                ((MutableState) obj2).setValue(Boolean.TRUE);
                break;
            case 14:
                CoroutineScope coroutineScope10 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = this.label;
                if (i25 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow10 = (Flow) this.$offerToken;
                    SsnPresenter$models$$inlined$CollectEffect$1$1 ssnPresenter$models$$inlined$CollectEffect$1$18 = new SsnPresenter$models$$inlined$CollectEffect$1$1(i2, coroutineScope10, (LoanAmountPickerPresenter) obj3, (MutableState) obj2);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow10.collect(ssnPresenter$models$$inlined$CollectEffect$1$18, this) == coroutineSingletons15) {
                        break;
                    }
                } else if (i25 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 15:
                CoroutineScope coroutineScope11 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i26 = this.label;
                if (i26 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow11 = (Flow) this.$offerToken;
                    SsnPresenter$models$$inlined$CollectEffect$1$1 ssnPresenter$models$$inlined$CollectEffect$1$19 = new SsnPresenter$models$$inlined$CollectEffect$1$1(27, coroutineScope11, (EndAppLockPresenter) obj3, (ParcelableSnapshotMutableIntState) obj2);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow11.collect(ssnPresenter$models$$inlined$CollectEffect$1$19, this) == coroutineSingletons16) {
                        break;
                    }
                } else if (i26 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 16:
                FilePickerResult filePickerResult = (FilePickerResult) this.$offerToken;
                MutableState mutableState7 = (MutableState) obj3;
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i27 = this.label;
                if (i27 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealStrongMemoryCache realStrongMemoryCache = (RealStrongMemoryCache) ((LocalHomePresenter) this.this$0).embeddedMapEnabled$delegate;
                    String str13 = ((FilePickerResult.Success) filePickerResult).uri;
                    this.label = 1;
                    m1457validate8YU3vEA = realStrongMemoryCache.m1457validate8YU3vEA(str13, this);
                    if (m1457validate8YU3vEA == coroutineSingletons17) {
                        break;
                    }
                } else if (i27 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    m1457validate8YU3vEA = obj;
                }
                FileValidator$Result fileValidator$Result = (FileValidator$Result) m1457validate8YU3vEA;
                String str14 = "File too large. Maximum size is 10MB.";
                if (!(fileValidator$Result instanceof FileValidator$Result.Success)) {
                    if (!(fileValidator$Result instanceof FileValidator$Result.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        int ordinal2 = ((FileValidator$Result.Failure) fileValidator$Result).error.ordinal();
                        if (ordinal2 == 0) {
                            str14 = "Invalid file. Please select a valid image or video.";
                        } else if (ordinal2 != 1) {
                            if (ordinal2 != 2) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                break;
                            } else {
                                str14 = "Unsupported file type. Please select an image or video.";
                            }
                        }
                        mutableState7.setValue(str14);
                    }
                } else {
                    FileMetadata fileMetadata = ((FileValidator$Result.Success) fileValidator$Result).metadata;
                    Long l = fileMetadata.byteCount;
                    if (l == null) {
                        mutableState7.setValue("Unable to determine file size. Please try a different file.");
                    } else if (l.longValue() > 10485760) {
                        mutableState7.setValue("File too large. Maximum size is 10MB.");
                    } else {
                        MutableState mutableState8 = (MutableState) obj2;
                        mutableState8.setValue(CollectionsKt.plus((Collection) mutableState8.getValue(), (Object) new Screenshot(((FilePickerResult.Success) filePickerResult).uri, fileMetadata.displayName, StringsKt__StringsJVMKt.startsWith(fileMetadata.mimeType, "video/", false))));
                    }
                }
                break;
            case 17:
                CoroutineScope coroutineScope12 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i28 = this.label;
                if (i28 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow12 = (Flow) this.$offerToken;
                    CaptureCheckFacePresenter$models$2$1$1.AnonymousClass1 anonymousClass1 = new CaptureCheckFacePresenter$models$2$1$1.AnonymousClass1(coroutineScope12, (CardStudioPresenter) obj3, (MutableState) obj2, i9);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow12.collect(anonymousClass1, this) == coroutineSingletons18) {
                        break;
                    }
                } else if (i28 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 18:
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i29 = this.label;
                if (i29 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    mutableState = (MutableState) obj2;
                    AfterPayOrderDetailsPresenter$State afterPayOrderDetailsPresenter$State2 = (AfterPayOrderDetailsPresenter$State) mutableState.getValue();
                    this.this$0 = mutableState;
                    this.$offerToken = afterPayOrderDetailsPresenter$State2;
                    this.label = 1;
                    access$loadOrderDetails = CardStudioPresenter.access$loadOrderDetails((CardStudioPresenter) obj3, this);
                    if (access$loadOrderDetails == coroutineSingletons19) {
                        break;
                    } else {
                        afterPayOrderDetailsPresenter$State = afterPayOrderDetailsPresenter$State2;
                    }
                } else if (i29 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    afterPayOrderDetailsPresenter$State = (AfterPayOrderDetailsPresenter$State) this.$offerToken;
                    mutableState = (MutableState) this.this$0;
                    SafeTrace.throwOnFailure(obj);
                    access$loadOrderDetails = obj;
                }
                AfterPayOrderDetailsViewModel afterPayOrderDetailsViewModel = (AfterPayOrderDetailsViewModel) access$loadOrderDetails;
                afterPayOrderDetailsPresenter$State.getClass();
                afterPayOrderDetailsViewModel.getClass();
                mutableState.setValue(new AfterPayOrderDetailsPresenter$State(afterPayOrderDetailsViewModel));
                break;
            case 19:
                CoroutineScope coroutineScope13 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i30 = this.label;
                if (i30 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow13 = (Flow) this.$offerToken;
                    CaptureCheckFacePresenter$models$2$1$1.AnonymousClass1 anonymousClass12 = new CaptureCheckFacePresenter$models$2$1$1.AnonymousClass1(coroutineScope13, (LocalPosCheckInPresenter) obj3, (MutableState) obj2, i8);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow13.collect(anonymousClass12, this) == coroutineSingletons20) {
                        break;
                    }
                } else if (i30 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 20:
                CoroutineScope coroutineScope14 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i31 = this.label;
                if (i31 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow14 = (Flow) this.$offerToken;
                    CaptureCheckFacePresenter$models$2$1$1.AnonymousClass1 anonymousClass13 = new CaptureCheckFacePresenter$models$2$1$1.AnonymousClass1(coroutineScope14, (ErrorPresenter) obj3, (MutableState) obj2, i3);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow14.collect(anonymousClass13, this) == coroutineSingletons21) {
                        break;
                    }
                } else if (i31 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 21:
                CoroutineScope coroutineScope15 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i32 = this.label;
                if (i32 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow15 = (Flow) this.$offerToken;
                    SsnPresenter$models$$inlined$CollectEffect$1$1 ssnPresenter$models$$inlined$CollectEffect$1$110 = new SsnPresenter$models$$inlined$CollectEffect$1$1(28, coroutineScope15, (CardStudioPresenter) obj3, (MutableState) obj2);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow15.collect(ssnPresenter$models$$inlined$CollectEffect$1$110, this) == coroutineSingletons22) {
                        break;
                    }
                } else if (i32 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 22:
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i33 = this.label;
                if (i33 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MutableState mutableState9 = (MutableState) obj2;
                    CardStudioPresenter cardStudioPresenter = (CardStudioPresenter) this.$offerToken;
                    Redacted redacted = ((CardStudioScreen) cardStudioPresenter.args).cashtag;
                    String str15 = redacted != null ? (String) redacted.getValue() : null;
                    if (str15 == null) {
                        str15 = "";
                    }
                    DeviceOrientation deviceOrientation = (DeviceOrientation) ((State) obj3).getValue();
                    this.this$0 = mutableState9;
                    this.label = 1;
                    withContext2 = JobKt.withContext((CoroutineContext) cardStudioPresenter.ioContext, new CardStudioPresenterV2$initialModel$2(cardStudioPresenter, str15, deviceOrientation, null), this);
                    if (withContext2 == coroutineSingletons23) {
                        break;
                    } else {
                        mutableState2 = mutableState9;
                    }
                } else if (i33 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mutableState2 = (MutableState) this.this$0;
                    SafeTrace.throwOnFailure(obj);
                    withContext2 = obj;
                }
                mutableState2.setValue((CardStudioViewModelV2) withContext2);
                break;
            case 23:
                CardStylePickerPresenter cardStylePickerPresenter = (CardStylePickerPresenter) this.$offerToken;
                CoroutineContext coroutineContext = cardStylePickerPresenter.ioDispatcher;
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i34 = this.label;
                if (i34 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CardStylePickerPresenter$models$2$1 cardStylePickerPresenter$models$2$1 = new CardStylePickerPresenter$models$2$1(cardStylePickerPresenter, objArr3 == true ? 1 : 0, i9);
                    this.label = 1;
                    break;
                } else if (i34 == 1) {
                    SafeTrace.throwOnFailure(obj);
                } else if (i34 == 2) {
                    SafeTrace.throwOnFailure(obj);
                    withContext3 = obj;
                    cardCustomization = (CardStylePickerPresenter.CardCustomization) withContext3;
                    this.this$0 = cardCustomization;
                    this.label = 3;
                    withContext4 = JobKt.withContext(coroutineContext, new CardStylePickerPresenter$models$1$2(cardStylePickerPresenter, objArr5 == true ? 1 : 0, i8), this);
                    break;
                } else if (i34 != 3) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    CardStylePickerPresenter.CardCustomization cardCustomization2 = (CardStylePickerPresenter.CardCustomization) this.this$0;
                    SafeTrace.throwOnFailure(obj);
                    cardCustomization = cardCustomization2;
                    withContext4 = obj;
                    Map map = (Map) withContext4;
                    TouchData touchData = cardCustomization.touchData;
                    CustomizationDetails customizationDetails = touchData != null ? StyledCardViewModelKt.toCustomizationDetails(touchData, map) : null;
                    ((MutableState) obj3).setValue(Boolean.valueOf(cardCustomization.cashtagEnabled));
                    if (customizationDetails != null) {
                        ((MutableState) obj2).setValue(customizationDetails);
                    }
                    break;
                }
                this.label = 2;
                withContext3 = JobKt.withContext(coroutineContext, new CardStylePickerPresenter$models$1$2(cardStylePickerPresenter, objArr4 == true ? 1 : 0, i10), this);
                break;
            case 24:
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i35 = this.label;
                if (i35 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow distinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.drop(Updater.snapshotFlow(new DrawerViewKt$$ExternalSyntheticLambda2(i9, (MutableState) this.this$0)), 1));
                    ListIndices listIndices = (ListIndices) this.$offerToken;
                    LazyListState lazyListState = (LazyListState) obj3;
                    CardStylePickerViewKt$CardStylePicker$1$1$1$3$1$3 cardStylePickerViewKt$CardStylePicker$1$1$1$3$1$3 = new CardStylePickerViewKt$CardStylePicker$1$1$1$3$1$3(listIndices, lazyListState, (MutableState) obj2);
                    this.label = 1;
                    Object collect = distinctUntilChanged.collect(new SsnPresenter$models$$inlined$CollectEffect$1$1(i4, cardStylePickerViewKt$CardStylePicker$1$1$1$3$1$3, listIndices, lazyListState), this);
                    if (collect != coroutineSingletons25) {
                        collect = Unit.INSTANCE;
                    }
                    if (collect == coroutineSingletons25) {
                        break;
                    }
                } else if (i35 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 25:
                CoroutineScope coroutineScope16 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i36 = this.label;
                if (i36 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow16 = (Flow) this.$offerToken;
                    RealBlockersHelper$collectBlockersActions$2 realBlockersHelper$collectBlockersActions$2 = new RealBlockersHelper$collectBlockersActions$2(i10, coroutineScope16, (DisclosurePresenter) obj3, (MutableState) obj2);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow16.collect(realBlockersHelper$collectBlockersActions$2, this) == coroutineSingletons26) {
                        break;
                    }
                } else if (i36 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 26:
                PaymentDeviceCustomizationPresenter paymentDeviceCustomizationPresenter = (PaymentDeviceCustomizationPresenter) this.this$0;
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i37 = this.label;
                if (i37 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FlowQuery$mapToList$$inlined$map$1 mapToOneOrNull = DBUtil.mapToOneOrNull(DBUtil.toFlow(paymentDeviceCustomizationPresenter.cardStudioQueries.select$2()), paymentDeviceCustomizationPresenter.ioDispatcher);
                    RealBlockersHelper$collectBlockersActions$2 realBlockersHelper$collectBlockersActions$22 = new RealBlockersHelper$collectBlockersActions$2(i9, (Map) this.$offerToken, (MutableState) obj3, (MutableState) obj2);
                    this.label = 1;
                    if (mapToOneOrNull.collect(realBlockersHelper$collectBlockersActions$22, this) == coroutineSingletons27) {
                        break;
                    }
                } else if (i37 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 27:
                CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i38 = this.label;
                if (i38 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MutableState mutableState10 = (MutableState) obj2;
                    MusicPresenter musicPresenter = (MusicPresenter) this.$offerToken;
                    CoroutineContext coroutineContext2 = (CoroutineContext) musicPresenter.args;
                    PlaidLinkView.AnonymousClass2 anonymousClass2 = new PlaidLinkView.AnonymousClass2((Object) musicPresenter, obj3, (Continuation) (objArr6 == true ? 1 : 0), i6);
                    this.this$0 = mutableState10;
                    this.label = 1;
                    withContext5 = JobKt.withContext(coroutineContext2, anonymousClass2, this);
                    if (withContext5 == coroutineSingletons28) {
                        break;
                    } else {
                        mutableState3 = mutableState10;
                    }
                } else if (i38 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mutableState3 = (MutableState) this.this$0;
                    SafeTrace.throwOnFailure(obj);
                    withContext5 = obj;
                }
                mutableState3.setValue((StampSheetViewModel) withContext5);
                break;
            case 28:
                CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i39 = this.label;
                if (i39 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MutableState mutableState11 = (MutableState) obj2;
                    MusicPresenter musicPresenter2 = (MusicPresenter) this.$offerToken;
                    CoroutineContext coroutineContext3 = (CoroutineContext) musicPresenter2.args;
                    PlaidLinkView.AnonymousClass2 anonymousClass22 = new PlaidLinkView.AnonymousClass2((Object) musicPresenter2, obj3, (Continuation) (objArr7 == true ? 1 : 0), i7);
                    this.this$0 = mutableState11;
                    this.label = 1;
                    withContext6 = JobKt.withContext(coroutineContext3, anonymousClass22, this);
                    if (withContext6 == coroutineSingletons29) {
                        break;
                    } else {
                        mutableState4 = mutableState11;
                    }
                } else if (i39 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mutableState4 = (MutableState) this.this$0;
                    SafeTrace.throwOnFailure(obj);
                    withContext6 = obj;
                }
                mutableState4.setValue((StampSheetViewModel) withContext6);
                break;
            default:
                CoroutineScope coroutineScope17 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i40 = this.label;
                if (i40 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow17 = (Flow) this.$offerToken;
                    RealBlockersHelper$collectBlockersActions$2 realBlockersHelper$collectBlockersActions$23 = new RealBlockersHelper$collectBlockersActions$2(i5, coroutineScope17, (TagOrderConfirmationPresenter) obj3, (MutableState) obj2);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow17.collect(realBlockersHelper$collectBlockersActions$23, this) == coroutineSingletons30) {
                        break;
                    }
                } else if (i40 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealBoostSelector$removeBoost$1(int i, MutableState mutableState, State state, MoleculePresenter moleculePresenter, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$offerToken = moleculePresenter;
        this.$plasmaFlowToken = state;
        this.$onUpdateOfferInflight = mutableState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealBoostSelector$removeBoost$1(CardStudioPresenter cardStudioPresenter, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 18;
        this.$plasmaFlowToken = cardStudioPresenter;
        this.$onUpdateOfferInflight = mutableState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealBoostSelector$removeBoost$1(Object obj, Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
        this.$offerToken = obj2;
        this.$plasmaFlowToken = obj3;
        this.$onUpdateOfferInflight = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealBoostSelector$removeBoost$1(Object obj, Continuation continuation, Object obj2, Object obj3, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$offerToken = obj;
        this.$plasmaFlowToken = obj2;
        this.$onUpdateOfferInflight = obj3;
    }
}
