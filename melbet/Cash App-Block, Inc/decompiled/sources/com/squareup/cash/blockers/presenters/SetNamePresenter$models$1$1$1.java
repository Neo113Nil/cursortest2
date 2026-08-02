package com.squareup.cash.blockers.presenters;

import android.net.Uri;
import android.os.Parcelable;
import androidx.compose.material3.DatePickerKt$updateDisplayedMonth$3;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.ui.node.PointerInputModifierNodeKt;
import androidx.core.text.TextUtilsCompat;
import androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1;
import androidx.glance.session.SessionWorker$doWork$2$2;
import androidx.lifecycle.LifecycleOwner;
import androidx.media3.common.util.StuckPlayerDetector;
import androidx.paging.PagingDataPresenter$collectFrom$2;
import app.cash.api.ApiResult;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.presenter.Presenter;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.presenter.molecule.MoleculePresenterKt;
import app.cash.broadway.presenter.molecule.MoleculePresenterKt$asPresenter$1;
import app.cash.broadway.screen.Screen;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.local.presenters.pos.LocalPosCheckInPresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.R;
import com.squareup.cash.amountslider.AmountPickerCondensedView;
import com.squareup.cash.bitcoin.presenters.RealBitcoinAmountPickerPresenter;
import com.squareup.cash.bitcoin.presenters.RealBitcoinAmountPickerPresenter$Factory$Impl;
import com.squareup.cash.bitcoin.presenters.map.BitcoinMapPresenter;
import com.squareup.cash.bitcoin.presenters.paidinbitcoin.PaidInBitcoinLandingPresenter;
import com.squareup.cash.bitcoin.presenters.stablecoin.LegacyStablecoinDepositPresenter$DepositAddress;
import com.squareup.cash.bitcoin.screens.BitcoinAmountPickerScreen;
import com.squareup.cash.bitcoin.viewmodels.BitcoinAmountPickerResult;
import com.squareup.cash.bitcoin.viewmodels.BitcoinAmountViewModel;
import com.squareup.cash.bitcoin.viewmodels.map.BitcoinLocationViewModel;
import com.squareup.cash.bitcoin.views.send.MoveBitcoinViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.presenters.FilesetUploadPresenter;
import com.squareup.cash.blockers.presenters.PasscodeGatedEndpoint;
import com.squareup.cash.blockers.presenters.ReferralCodePresenter;
import com.squareup.cash.blockers.presenters.SetNamePresenter$SubmitNameResult;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.screens.InstrumentSelectionData;
import com.squareup.cash.blockers.viewmodels.Header;
import com.squareup.cash.blockers.viewmodels.Header$Avatar$Placeholder;
import com.squareup.cash.blockers.viewmodels.IdvViewEvent;
import com.squareup.cash.blockers.viewmodels.PasscodeViewEvent;
import com.squareup.cash.blockers.viewmodels.PasscodeViewModel;
import com.squareup.cash.blockers.viewmodels.ReferralCodeViewEvent;
import com.squareup.cash.blockers.viewmodels.SetAddressViewEvent;
import com.squareup.cash.blockers.viewmodels.SetNameViewModel;
import com.squareup.cash.blockers.viewmodels.SetNameViewModel$Event$Done;
import com.squareup.cash.blockers.viewmodels.SetNameViewModel$Event$SubmissionFailed;
import com.squareup.cash.blockers.views.PasscodeViewKt$Passcode$3$1$1$1$2;
import com.squareup.cash.cameralauncher.CameraResult;
import com.squareup.cash.cameralauncher.RealCameraLauncher;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.cdf.account.AccountAuthenticateSubmitCredential;
import com.squareup.cash.cdf.document.Trigger;
import com.squareup.cash.common.messaging.screens.FailureMessageBlockerScreen;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.music.presenters.MusicPresenter;
import com.squareup.cash.music.presenters.MusicPresenter$models$2$1;
import com.squareup.cash.overlays.FakeOverlayLayerKt;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Back;
import com.squareup.cash.screens.Finish;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.util.money.Moneys;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.protos.cash.blockstable.api.v1.BlockStableService;
import com.squareup.protos.cash.blockstable.api.v1.GetDepositAddressRequest;
import com.squareup.protos.cash.blockstable.api.v1.GetDepositAddressResponse;
import com.squareup.protos.cash.janus.api.PasscodeService;
import com.squareup.protos.cash.plasma.flows.Flow$Type;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.ApplyRewardCodeResponse;
import com.squareup.protos.franklin.app.SetAmountRequest;
import com.squareup.protos.franklin.app.SetAmountRequest$Result$AmountResult;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.time.LocalDate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ProducerCoroutine;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;
import okio.ByteString;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes4.dex */
public final class SetNamePresenter$models$1$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object $state$delegate;
    public final /* synthetic */ Object $text;
    public Object L$0;
    public int label;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SetNamePresenter$models$1$1$1(MoleculePresenter moleculePresenter, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = moleculePresenter;
        this.L$0 = mutableState;
        this.$state$delegate = mutableState2;
        this.$text = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.this$0;
        Object obj3 = this.$text;
        switch (i) {
            case 0:
                return new SetNamePresenter$models$1$1$1((CardLockPresenter) obj2, (CharSequence) obj3, (MutableState) this.$state$delegate, continuation);
            case 1:
                SetNamePresenter$models$1$1$1 setNamePresenter$models$1$1$1 = new SetNamePresenter$models$1$1$1((Flow) this.$state$delegate, continuation, (StuckPlayerDetector) obj2, (BetterNavigator.ScreenNavigator) obj3, 1);
                setNamePresenter$models$1$1$1.L$0 = obj;
                return setNamePresenter$models$1$1$1;
            case 2:
                SetNamePresenter$models$1$1$1 setNamePresenter$models$1$1$12 = new SetNamePresenter$models$1$1$1((Flow) this.$state$delegate, continuation, (CardStudioPresenter) obj2, (BitcoinLocationViewModel) obj3, 2);
                setNamePresenter$models$1$1$12.L$0 = obj;
                return setNamePresenter$models$1$1$12;
            case 3:
                MutableState mutableState = (MutableState) this.L$0;
                int i2 = 3;
                SetNamePresenter$models$1$1$1 setNamePresenter$models$1$1$13 = new SetNamePresenter$models$1$1$1(i2, mutableState, (BitcoinMapPresenter) obj3, (Flow) obj2, continuation);
                setNamePresenter$models$1$1$13.$state$delegate = obj;
                return setNamePresenter$models$1$1$13;
            case 4:
                MutableState mutableState2 = (MutableState) this.L$0;
                int i3 = 4;
                SetNamePresenter$models$1$1$1 setNamePresenter$models$1$1$14 = new SetNamePresenter$models$1$1$1(i3, mutableState2, (MusicPresenter) obj3, (Flow) obj2, continuation);
                setNamePresenter$models$1$1$14.$state$delegate = obj;
                return setNamePresenter$models$1$1$14;
            case 5:
                SetNamePresenter$models$1$1$1 setNamePresenter$models$1$1$15 = new SetNamePresenter$models$1$1$1((Flow) this.$state$delegate, continuation, (PaidInBitcoinLandingPresenter) obj2, (State) obj3, 5);
                setNamePresenter$models$1$1$15.L$0 = obj;
                return setNamePresenter$models$1$1$15;
            case 6:
                MutableState mutableState3 = (MutableState) this.L$0;
                int i4 = 6;
                SetNamePresenter$models$1$1$1 setNamePresenter$models$1$1$16 = new SetNamePresenter$models$1$1$1(i4, mutableState3, (DisclosurePresenter) obj3, (Flow) obj2, continuation);
                setNamePresenter$models$1$1$16.$state$delegate = obj;
                return setNamePresenter$models$1$1$16;
            case 7:
                return new SetNamePresenter$models$1$1$1((LocalPosCheckInPresenter) obj2, (MutableState) this.L$0, (MutableState) this.$state$delegate, (MutableState) obj3, continuation, 7);
            case 8:
                MutableState mutableState4 = (MutableState) this.L$0;
                int i5 = 8;
                SetNamePresenter$models$1$1$1 setNamePresenter$models$1$1$17 = new SetNamePresenter$models$1$1$1(i5, mutableState4, (CardStudioPresenter) obj3, (Flow) obj2, continuation);
                setNamePresenter$models$1$1$17.$state$delegate = obj;
                return setNamePresenter$models$1$1$17;
            case 9:
                MutableState mutableState5 = (MutableState) this.L$0;
                int i6 = 9;
                SetNamePresenter$models$1$1$1 setNamePresenter$models$1$1$18 = new SetNamePresenter$models$1$1$1(i6, mutableState5, (LocalEditorialPresenter) obj3, (Flow) obj2, continuation);
                setNamePresenter$models$1$1$18.$state$delegate = obj;
                return setNamePresenter$models$1$1$18;
            case 10:
                MutableState mutableState6 = (MutableState) this.L$0;
                int i7 = 10;
                SetNamePresenter$models$1$1$1 setNamePresenter$models$1$1$19 = new SetNamePresenter$models$1$1$1(i7, mutableState6, (AmountBlockerPresenter) obj3, (Flow) obj2, continuation);
                setNamePresenter$models$1$1$19.$state$delegate = obj;
                return setNamePresenter$models$1$1$19;
            case 11:
                MutableState mutableState7 = (MutableState) this.L$0;
                int i8 = 11;
                SetNamePresenter$models$1$1$1 setNamePresenter$models$1$1$110 = new SetNamePresenter$models$1$1$1(i8, mutableState7, (BankAccountLinkingPresenter) obj3, (Flow) obj2, continuation);
                setNamePresenter$models$1$1$110.$state$delegate = obj;
                return setNamePresenter$models$1$1$110;
            case 12:
                MutableState mutableState8 = (MutableState) this.L$0;
                int i9 = 12;
                SetNamePresenter$models$1$1$1 setNamePresenter$models$1$1$111 = new SetNamePresenter$models$1$1$1(i9, mutableState8, (BirthdayPresenter) obj3, (Flow) obj2, continuation);
                setNamePresenter$models$1$1$111.$state$delegate = obj;
                return setNamePresenter$models$1$1$111;
            case 13:
                SetNamePresenter$models$1$1$1 setNamePresenter$models$1$1$112 = new SetNamePresenter$models$1$1$1((CardLockPresenter) obj2, (LifecycleOwner) obj3, (MutableState) this.L$0, continuation);
                setNamePresenter$models$1$1$112.$state$delegate = obj;
                return setNamePresenter$models$1$1$112;
            case 14:
                return new SetNamePresenter$models$1$1$1((CalendarBlockerPresenter) obj2, (MutableState) this.L$0, (MutableState) this.$state$delegate, (MutableState) obj3, continuation, 14);
            case 15:
                SetNamePresenter$models$1$1$1 setNamePresenter$models$1$1$113 = new SetNamePresenter$models$1$1$1((Flow) this.$state$delegate, continuation, (EarnerUpsellBlockerPresenter) obj2, (String) obj3, 15);
                setNamePresenter$models$1$1$113.L$0 = obj;
                return setNamePresenter$models$1$1$113;
            case 16:
                return new SetNamePresenter$models$1$1$1((FilesetUploadPresenter) obj2, (MutableState) this.L$0, (MutableState) this.$state$delegate, (MutableState) obj3, continuation, 16);
            case 17:
                MutableState mutableState9 = (MutableState) this.L$0;
                int i10 = 17;
                SetNamePresenter$models$1$1$1 setNamePresenter$models$1$1$114 = new SetNamePresenter$models$1$1$1(i10, mutableState9, (GpsLocationConsentBlockerPresenter) obj3, (Flow) obj2, continuation);
                setNamePresenter$models$1$1$114.$state$delegate = obj;
                return setNamePresenter$models$1$1$114;
            case 18:
                return new SetNamePresenter$models$1$1$1((GpsLocationConsentBlockerPresenter) obj2, (MutableState) this.L$0, (MutableState) this.$state$delegate, (MutableState) obj3, continuation, 18);
            case 19:
                MutableState mutableState10 = (MutableState) this.L$0;
                int i11 = 19;
                SetNamePresenter$models$1$1$1 setNamePresenter$models$1$1$115 = new SetNamePresenter$models$1$1$1(i11, mutableState10, (DisclosurePresenter) obj3, (InstrumentSelectionBlockerPresenter$SubmissionData) obj2, continuation);
                setNamePresenter$models$1$1$115.$state$delegate = obj;
                return setNamePresenter$models$1$1$115;
            case 20:
                SetNamePresenter$models$1$1$1 setNamePresenter$models$1$1$116 = new SetNamePresenter$models$1$1$1((ProducerScope) obj2, (PasscodeGenericGatedEndpointTypeTransformer) obj3, continuation);
                setNamePresenter$models$1$1$116.$state$delegate = obj;
                return setNamePresenter$models$1$1$116;
            case 21:
                MutableState mutableState11 = (MutableState) this.L$0;
                int i12 = 21;
                SetNamePresenter$models$1$1$1 setNamePresenter$models$1$1$117 = new SetNamePresenter$models$1$1$1(i12, mutableState11, (PlaidLinkPresenter) obj3, (Flow) obj2, continuation);
                setNamePresenter$models$1$1$117.$state$delegate = obj;
                return setNamePresenter$models$1$1$117;
            case 22:
                MutableState mutableState12 = (MutableState) this.L$0;
                int i13 = 22;
                SetNamePresenter$models$1$1$1 setNamePresenter$models$1$1$118 = new SetNamePresenter$models$1$1$1(i13, mutableState12, (DisclosurePresenter) obj3, (Flow) obj2, continuation);
                setNamePresenter$models$1$1$118.$state$delegate = obj;
                return setNamePresenter$models$1$1$118;
            case 23:
                return new SetNamePresenter$models$1$1$1((ReferralCodePresenter) this.$state$delegate, (MutableSharedFlow) obj2, (ReferralCodeViewEvent) obj3, continuation, 23);
            case 24:
                SetNamePresenter$models$1$1$1 setNamePresenter$models$1$1$119 = new SetNamePresenter$models$1$1$1((MutableSharedFlow) this.$state$delegate, (ReferralCodePresenter) obj2, (ReferralCodeViewEvent) obj3, continuation, 24);
                setNamePresenter$models$1$1$119.L$0 = obj;
                return setNamePresenter$models$1$1$119;
            case 25:
                MutableState mutableState13 = (MutableState) this.L$0;
                int i14 = 25;
                SetNamePresenter$models$1$1$1 setNamePresenter$models$1$1$120 = new SetNamePresenter$models$1$1$1(i14, mutableState13, (RequestPushNotificationsBlockerPresenter) obj3, (Flow) obj2, continuation);
                setNamePresenter$models$1$1$120.$state$delegate = obj;
                return setNamePresenter$models$1$1$120;
            case 26:
                MutableState mutableState14 = (MutableState) this.L$0;
                int i15 = 26;
                SetNamePresenter$models$1$1$1 setNamePresenter$models$1$1$121 = new SetNamePresenter$models$1$1$1(i15, mutableState14, (SavingsTransferOptionSelectionPresenter) obj3, (Flow) obj2, continuation);
                setNamePresenter$models$1$1$121.$state$delegate = obj;
                return setNamePresenter$models$1$1$121;
            case 27:
                SetNamePresenter$models$1$1$1 setNamePresenter$models$1$1$122 = new SetNamePresenter$models$1$1$1((Flow) this.$state$delegate, continuation, (CardLockPresenter) obj2, (Channel) obj3, 27);
                setNamePresenter$models$1$1$122.L$0 = obj;
                return setNamePresenter$models$1$1$122;
            case 28:
                SetNamePresenter$models$1$1$1 setNamePresenter$models$1$1$123 = new SetNamePresenter$models$1$1$1((CardLockPresenter) this.$state$delegate, (Channel) obj2, (SetAddressViewEvent) obj3, continuation, 28);
                setNamePresenter$models$1$1$123.L$0 = obj;
                return setNamePresenter$models$1$1$123;
            default:
                SetNamePresenter$models$1$1$1 setNamePresenter$models$1$1$124 = new SetNamePresenter$models$1$1$1((Flow) obj3, continuation, (CardLockPresenter) obj2, (MutableState) this.L$0);
                setNamePresenter$models$1$1$124.$state$delegate = obj;
                return setNamePresenter$models$1$1$124;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 13:
                ((SetNamePresenter$models$1$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                break;
        }
        return ((SetNamePresenter$models$1$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x02ab, code lost:
    
        if (r1.emit(r0, r25) != r11) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:?, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x029d, code lost:
    
        if (r0 == r11) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x023d, code lost:
    
        if (r0 == r11) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0444, code lost:
    
        if (((kotlinx.coroutines.channels.ProducerCoroutine) r12)._channel.send(r2, r25) != r6) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0404, code lost:
    
        if (com.squareup.cash.blockers.presenters.PasscodeGenericGatedEndpointTypeTransformer.access$handleSuccess(r5, r8, (com.squareup.cash.blockers.presenters.PasscodeGatedEndpoint.Response.Success) r2, r3, r25) == r6) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0408, code lost:
    
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x04a0, code lost:
    
        if (((kotlinx.coroutines.channels.ProducerCoroutine) r12)._channel.send(com.squareup.cash.blockers.viewmodels.PasscodeViewModel.VerifyPasscodeModel.PasscodeVerificationFailed.INSTANCE, r25) == r6) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x03ea, code lost:
    
        if (r2 != r6) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008c, code lost:
    
        if (((kotlinx.coroutines.channels.Channel) r12).send(r2, r25) == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ab, code lost:
    
        if (com.squareup.cash.wallet.presenters.CardLockPresenter.access$setAddress(r2, r0, r3, r25) == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c9, code lost:
    
        if (com.squareup.cash.wallet.presenters.CardLockPresenter.access$createShippingAddress(r2, r0, (com.squareup.cash.blockers.screens.BlockersScreens.StreetAddressScreen.SetStreetAddressType.CreateShippingAddressWithStreetAddress) r3, r25) == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e7, code lost:
    
        if (com.squareup.cash.wallet.presenters.CardLockPresenter.access$setShippingAddress(r2, r0, (com.squareup.cash.blockers.screens.BlockersScreens.StreetAddressScreen.SetStreetAddressType.SetShippingStreetAddress) r3, r25) == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01e8, code lost:
    
        if (r1.join(r25) == r2) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01c4, code lost:
    
        if (r3.join(r25) == r2) goto L88;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:170:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x06b2  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0725  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object access$submitName;
        MutableState mutableState;
        SetNameViewModel copy$default;
        Object depositAddress;
        Boolean bool;
        LocalDate localDate;
        LocalDate localDate2;
        String str;
        Object trackBlockerSubmissionAnalyticsWithNullableResult;
        Object result;
        Object submitOptionV2;
        CoroutineSingletons coroutineSingletons;
        boolean z;
        FakeOverlayLayerKt passcodeGatedEndpoint$Request$Passcode;
        AccountAuthenticateSubmitCredential.CredentialType credentialType;
        Object call;
        PasscodeGatedEndpoint.Response response;
        Object obj2;
        PasscodeGatedEndpoint.Response response2;
        CoroutineSingletons coroutineSingletons2;
        Object trackBlockerSubmissionAnalytics$default;
        MutableSharedFlow mutableSharedFlow;
        Object rewardCodeApplyFailed;
        String str2;
        Object obj3;
        int i = this.$r8$classId;
        int i2 = 7;
        int i3 = 8;
        int i4 = 4;
        int i5 = 2;
        Object obj4 = this.this$0;
        Object obj5 = this.$text;
        String str3 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        switch (i) {
            case 0:
                MutableState mutableState2 = (MutableState) this.$state$delegate;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    String obj6 = ((CharSequence) obj5).toString();
                    this.L$0 = mutableState2;
                    this.label = 1;
                    access$submitName = CardLockPresenter.access$submitName((CardLockPresenter) obj4, obj6, this);
                    if (access$submitName == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                    mutableState = mutableState2;
                } else {
                    if (i6 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mutableState = (MutableState) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    access$submitName = obj;
                }
                SetNamePresenter$SubmitNameResult setNamePresenter$SubmitNameResult = (SetNamePresenter$SubmitNameResult) access$submitName;
                if (setNamePresenter$SubmitNameResult instanceof SetNamePresenter$SubmitNameResult.Successful) {
                    copy$default = SetNameViewModel.copy$default((SetNameViewModel) mutableState2.getValue(), SetNameViewModel$Event$Done.INSTANCE, null, 510);
                } else {
                    if (!(setNamePresenter$SubmitNameResult instanceof SetNamePresenter$SubmitNameResult.NotSuccessful)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    copy$default = SetNameViewModel.copy$default((SetNameViewModel) mutableState2.getValue(), SetNameViewModel$Event$SubmissionFailed.INSTANCE, null, 510);
                }
                mutableState.setValue(copy$default);
                return Unit.INSTANCE;
            case 1:
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                int i8 = 1;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow = (Flow) this.$state$delegate;
                    PasscodeViewKt$Passcode$3$1$1$1$2 passcodeViewKt$Passcode$3$1$1$1$2 = new PasscodeViewKt$Passcode$3$1$1$1$2(coroutineScope, (StuckPlayerDetector) obj4, (BetterNavigator.ScreenNavigator) obj5, i8);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow.collect(passcodeViewKt$Passcode$3$1$1$1$2, this) == coroutineSingletons4) {
                        return coroutineSingletons4;
                    }
                } else {
                    if (i7 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 2:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow2 = (Flow) this.$state$delegate;
                    PasscodeViewKt$Passcode$3$1$1$1$2 passcodeViewKt$Passcode$3$1$1$1$22 = new PasscodeViewKt$Passcode$3$1$1$1$2(coroutineScope2, (CardStudioPresenter) obj4, (BitcoinLocationViewModel) obj5, 3);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow2.collect(passcodeViewKt$Passcode$3$1$1$1$22, this) == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                } else {
                    if (i9 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 3:
                CoroutineScope coroutineScope3 = (CoroutineScope) this.$state$delegate;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                if (i10 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PasscodeViewKt$Passcode$3$1$1$1$2 passcodeViewKt$Passcode$3$1$1$1$23 = new PasscodeViewKt$Passcode$3$1$1$1$2(coroutineScope3, (BitcoinMapPresenter) obj5, (MutableState) this.L$0, 5);
                    this.$state$delegate = null;
                    this.label = 1;
                    if (((Flow) obj4).collect(passcodeViewKt$Passcode$3$1$1$1$23, this) == coroutineSingletons6) {
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
            case 4:
                CoroutineScope coroutineScope4 = (CoroutineScope) this.$state$delegate;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PasscodeViewKt$Passcode$3$1$1$1$2 passcodeViewKt$Passcode$3$1$1$1$24 = new PasscodeViewKt$Passcode$3$1$1$1$2(coroutineScope4, (MusicPresenter) obj5, (MutableState) this.L$0, 6);
                    this.$state$delegate = null;
                    this.label = 1;
                    if (((Flow) obj4).collect(passcodeViewKt$Passcode$3$1$1$1$24, this) == coroutineSingletons7) {
                        return coroutineSingletons7;
                    }
                } else {
                    if (i11 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 5:
                CoroutineScope coroutineScope5 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow3 = (Flow) this.$state$delegate;
                    SsnPresenter$models$$inlined$CollectEffect$1$1 ssnPresenter$models$$inlined$CollectEffect$1$1 = new SsnPresenter$models$$inlined$CollectEffect$1$1(4, coroutineScope5, (PaidInBitcoinLandingPresenter) obj4, (State) obj5);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow3.collect(ssnPresenter$models$$inlined$CollectEffect$1$1, this) == coroutineSingletons8) {
                        return coroutineSingletons8;
                    }
                } else {
                    if (i12 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 6:
                CoroutineScope coroutineScope6 = (CoroutineScope) this.$state$delegate;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                if (i13 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PasscodeViewKt$Passcode$3$1$1$1$2 passcodeViewKt$Passcode$3$1$1$1$25 = new PasscodeViewKt$Passcode$3$1$1$1$2(coroutineScope6, (DisclosurePresenter) obj5, (MutableState) this.L$0, i2);
                    this.$state$delegate = null;
                    this.label = 1;
                    if (((Flow) obj4).collect(passcodeViewKt$Passcode$3$1$1$1$25, this) == coroutineSingletons9) {
                        return coroutineSingletons9;
                    }
                } else {
                    if (i13 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 7:
                LocalPosCheckInPresenter localPosCheckInPresenter = (LocalPosCheckInPresenter) obj4;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    BlockStableService blockStableService = (BlockStableService) localPosCheckInPresenter.launcher;
                    GetDepositAddressRequest getDepositAddressRequest = new GetDepositAddressRequest(ByteString.EMPTY);
                    this.label = 1;
                    depositAddress = blockStableService.getDepositAddress(getDepositAddressRequest, this);
                    if (depositAddress == coroutineSingletons10) {
                        return coroutineSingletons10;
                    }
                } else {
                    if (i14 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    depositAddress = obj;
                }
                ApiResult apiResult = (ApiResult) depositAddress;
                if (apiResult instanceof ApiResult.Failure) {
                    Timber.Forest.d("@Get deposit address failure: " + apiResult, new Object[0]);
                    ((MutableState) this.L$0).setValue(((AndroidStringManager) localPosCheckInPresenter.stringManager).get(R.string.stablecoin_deposit_error));
                } else {
                    if (!(apiResult instanceof ApiResult.Success)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    MutableState mutableState3 = (MutableState) this.$state$delegate;
                    GetDepositAddressResponse getDepositAddressResponse = (GetDepositAddressResponse) ((ApiResult.Success) apiResult).response;
                    mutableState3.setValue(getDepositAddressResponse.qr_code_url);
                    String str4 = getDepositAddressResponse.deposit_address;
                    str4.getClass();
                    String str5 = getDepositAddressResponse.truncated_deposit_address;
                    str5.getClass();
                    ((MutableState) obj5).setValue(new LegacyStablecoinDepositPresenter$DepositAddress(str4, str5));
                }
                return Unit.INSTANCE;
            case 8:
                CoroutineScope coroutineScope7 = (CoroutineScope) this.$state$delegate;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PasscodeViewKt$Passcode$3$1$1$1$2 passcodeViewKt$Passcode$3$1$1$1$26 = new PasscodeViewKt$Passcode$3$1$1$1$2(coroutineScope7, (CardStudioPresenter) obj5, (MutableState) this.L$0, i3);
                    this.$state$delegate = null;
                    this.label = 1;
                    if (((Flow) obj4).collect(passcodeViewKt$Passcode$3$1$1$1$26, this) == coroutineSingletons11) {
                        return coroutineSingletons11;
                    }
                } else {
                    if (i15 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 9:
                CoroutineScope coroutineScope8 = (CoroutineScope) this.$state$delegate;
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.label;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PasscodeViewKt$Passcode$3$1$1$1$2 passcodeViewKt$Passcode$3$1$1$1$27 = new PasscodeViewKt$Passcode$3$1$1$1$2(coroutineScope8, (LocalEditorialPresenter) obj5, (MutableState) this.L$0, 9);
                    this.$state$delegate = null;
                    this.label = 1;
                    if (((Flow) obj4).collect(passcodeViewKt$Passcode$3$1$1$1$27, this) == coroutineSingletons12) {
                        return coroutineSingletons12;
                    }
                } else {
                    if (i16 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 10:
                CoroutineScope coroutineScope9 = (CoroutineScope) this.$state$delegate;
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.label;
                if (i17 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SsnPresenter$models$$inlined$CollectEffect$1$1 ssnPresenter$models$$inlined$CollectEffect$1$12 = new SsnPresenter$models$$inlined$CollectEffect$1$1(6, coroutineScope9, (AmountBlockerPresenter) obj5, (MutableState) this.L$0);
                    this.$state$delegate = null;
                    this.label = 1;
                    if (((Flow) obj4).collect(ssnPresenter$models$$inlined$CollectEffect$1$12, this) == coroutineSingletons13) {
                        return coroutineSingletons13;
                    }
                } else {
                    if (i17 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 11:
                CoroutineScope coroutineScope10 = (CoroutineScope) this.$state$delegate;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.label;
                if (i18 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SsnPresenter$models$$inlined$CollectEffect$1$1 ssnPresenter$models$$inlined$CollectEffect$1$13 = new SsnPresenter$models$$inlined$CollectEffect$1$1(i2, coroutineScope10, (BankAccountLinkingPresenter) obj5, (MutableState) this.L$0);
                    this.$state$delegate = null;
                    this.label = 1;
                    if (((Flow) obj4).collect(ssnPresenter$models$$inlined$CollectEffect$1$13, this) == coroutineSingletons14) {
                        return coroutineSingletons14;
                    }
                } else {
                    if (i18 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 12:
                CoroutineScope coroutineScope11 = (CoroutineScope) this.$state$delegate;
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = this.label;
                if (i19 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SsnPresenter$models$$inlined$CollectEffect$1$1 ssnPresenter$models$$inlined$CollectEffect$1$14 = new SsnPresenter$models$$inlined$CollectEffect$1$1(i3, coroutineScope11, (BirthdayPresenter) obj5, (MutableState) this.L$0);
                    this.$state$delegate = null;
                    this.label = 1;
                    if (((Flow) obj4).collect(ssnPresenter$models$$inlined$CollectEffect$1$14, this) == coroutineSingletons15) {
                        return coroutineSingletons15;
                    }
                } else {
                    if (i19 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 13:
                final MutableState mutableState4 = (MutableState) this.L$0;
                final CardLockPresenter cardLockPresenter = (CardLockPresenter) obj4;
                ContextScope contextScope = (ContextScope) cardLockPresenter.issuedCardManager;
                final CoroutineScope coroutineScope12 = (CoroutineScope) this.$state$delegate;
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = this.label;
                if (i20 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealBitcoinAmountPickerPresenter$Factory$Impl realBitcoinAmountPickerPresenter$Factory$Impl = (RealBitcoinAmountPickerPresenter$Factory$Impl) cardLockPresenter.args;
                    BlockersScreens.BitcoinAmountScreen bitcoinAmountScreen = (BlockersScreens.BitcoinAmountScreen) cardLockPresenter.cashAppTagManager;
                    RealBitcoinAmountPickerPresenter create$1 = realBitcoinAmountPickerPresenter$Factory$Impl.create$1(bitcoinAmountScreen.minimumAmount, bitcoinAmountScreen.maximumAmount, new BitcoinAmountPickerScreen(BitcoinAmountPickerScreen.AmountPickerPurpose.WITHDRAWAL, null, null, null, bitcoinAmountScreen.blockersData.flowType != Flow$Type.AUTO_WITHDRAWAL_BITCOIN, 14), new Navigator() { // from class: com.squareup.cash.blockers.presenters.BitcoinAmountBlockerPresenter$models$1$1$$ExternalSyntheticLambda0
                        @Override // app.cash.broadway.navigation.Navigator
                        public final void goTo(Screen screen) {
                            boolean z2 = screen instanceof Back;
                            CardLockPresenter cardLockPresenter2 = cardLockPresenter;
                            if (z2) {
                                JobKt.launch$default(CoroutineScope.this, null, null, new AmountPickerCondensedView.AnonymousClass14(cardLockPresenter2, null, 25), 3);
                                return;
                            }
                            if (screen instanceof Finish) {
                                Object obj7 = ((Finish) screen).result;
                                obj7.getClass();
                                Money money = ((BitcoinAmountPickerResult) obj7).bitcoinAmount;
                                BlockersScreens.BitcoinAmountScreen bitcoinAmountScreen2 = (BlockersScreens.BitcoinAmountScreen) cardLockPresenter2.cashAppTagManager;
                                if (Moneys.compareTo(bitcoinAmountScreen2.minimumAmount, money) > 0 || Moneys.compareTo(money, bitcoinAmountScreen2.maximumAmount) > 0) {
                                    return;
                                }
                                MutableState mutableState5 = mutableState4;
                                BitcoinAmountBlockerPresenter$State bitcoinAmountBlockerPresenter$State = (BitcoinAmountBlockerPresenter$State) mutableState5.getValue();
                                SetAmountRequest setAmountRequest = new SetAmountRequest(bitcoinAmountScreen2.blockersData.requestContext, new SetAmountRequest$Result$AmountResult(new SetAmountRequest.AmountResult(money)), 4);
                                BitcoinAmountViewModel bitcoinAmountViewModel = bitcoinAmountBlockerPresenter$State.bitcoinAmountModel;
                                bitcoinAmountBlockerPresenter$State.getClass();
                                mutableState5.setValue(new BitcoinAmountBlockerPresenter$State(bitcoinAmountViewModel, setAmountRequest));
                            }
                        }
                    });
                    CoroutineContext coroutineContext = contextScope.coroutineContext;
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = MoleculePresenterKt.LocalPlacement;
                    coroutineContext.getClass();
                    Presenter.Binding start$default = Presenter.start$default(new MoleculePresenterKt$asPresenter$1(create$1, coroutineContext), contextScope, (LifecycleOwner) obj5);
                    cardLockPresenter.flowNavigationHelper = start$default;
                    StateFlow models = start$default.getModels();
                    MusicPresenter$models$2$1.AnonymousClass1 anonymousClass1 = new MusicPresenter$models$2$1.AnonymousClass1(10, mutableState4);
                    this.$state$delegate = null;
                    this.label = 1;
                    if (models.collect(anonymousClass1, this) == coroutineSingletons16) {
                        return coroutineSingletons16;
                    }
                } else {
                    if (i20 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                OptionalProvider$$ExternalSyntheticLambda0.m$1();
                return null;
            case 14:
                MutableState mutableState5 = (MutableState) obj5;
                CalendarBlockerPresenter calendarBlockerPresenter = (CalendarBlockerPresenter) obj4;
                BetterNavigator.ScreenNavigator screenNavigator = calendarBlockerPresenter.navigator;
                BlockersScreens.CalendarBlockerScreen calendarBlockerScreen = calendarBlockerPresenter.args;
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.label;
                Continuation continuation = null;
                if (i21 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    String str6 = calendarBlockerScreen.calendarBlocker.disabling_toggle_label;
                    if (str6 != null) {
                        MutableState mutableState6 = (MutableState) this.L$0;
                        if (str6.length() > 0) {
                            bool = (Boolean) mutableState6.getValue();
                            bool.booleanValue();
                            if (bool != null || bool.equals(Boolean.FALSE)) {
                                localDate = (LocalDate) ((MutableState) this.$state$delegate).getValue();
                                if (localDate != null) {
                                    a$$ExternalSyntheticBUOutline0.m$3("Selected date cannot be null when the action button is clicked.");
                                    return null;
                                }
                                localDate2 = localDate;
                            } else {
                                localDate2 = null;
                            }
                            mutableState5.setValue(Boolean.TRUE);
                            Boolean bool2 = bool;
                            Analytics analytics = calendarBlockerPresenter.analytics;
                            BlockersData blockersData = calendarBlockerScreen.blockersData;
                            AndroidStringManager androidStringManager = calendarBlockerPresenter.stringManager;
                            SessionWorker$doWork$2$2 sessionWorker$doWork$2$2 = new SessionWorker$doWork$2$2(calendarBlockerPresenter, localDate2, bool2, continuation, 7);
                            str = null;
                            this.label = 1;
                            trackBlockerSubmissionAnalyticsWithNullableResult = PointerInputModifierNodeKt.trackBlockerSubmissionAnalyticsWithNullableResult(analytics, blockersData, androidStringManager, new MoveBitcoinViewKt$$ExternalSyntheticLambda3(i3), R.string.blockers_retrofit_error_message, sessionWorker$doWork$2$2, this);
                            if (trackBlockerSubmissionAnalyticsWithNullableResult == coroutineSingletons17) {
                                return coroutineSingletons17;
                            }
                        }
                    }
                    bool = null;
                    if (bool != null) {
                    }
                    localDate = (LocalDate) ((MutableState) this.$state$delegate).getValue();
                    if (localDate != null) {
                    }
                } else {
                    if (i21 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    trackBlockerSubmissionAnalyticsWithNullableResult = obj;
                    str = null;
                }
                ApiResult apiResult2 = (ApiResult) trackBlockerSubmissionAnalyticsWithNullableResult;
                mutableState5.setValue(Boolean.FALSE);
                if (apiResult2 instanceof ApiResult.Success) {
                    BlockersData blockersData2 = calendarBlockerScreen.blockersData;
                    ResponseContext responseContext = (ResponseContext) ((ApiResult.Success) apiResult2).response;
                    Parcelable.Creator<BlockersData> creator = BlockersData.CREATOR;
                    BlockersData updateFromResponseContext = blockersData2.updateFromResponseContext(responseContext, false);
                    String str7 = responseContext.dialog_message;
                    screenNavigator.goTo(str7 != null ? new BlockersScreens.SuccessMessageScreen(calendarBlockerScreen.blockersData, null, str7, responseContext.dialog_title, 2) : calendarBlockerPresenter.blockersDataNavigator.getNext(calendarBlockerScreen, updateFromResponseContext));
                } else {
                    screenNavigator.goTo(new FailureMessageBlockerScreen(calendarBlockerScreen.blockersData, str, str, 6));
                }
                return Unit.INSTANCE;
            case 15:
                CoroutineScope coroutineScope13 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = this.label;
                if (i22 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow4 = (Flow) this.$state$delegate;
                    SsnPresenter$models$$inlined$CollectEffect$1$1 ssnPresenter$models$$inlined$CollectEffect$1$15 = new SsnPresenter$models$$inlined$CollectEffect$1$1(11, coroutineScope13, (EarnerUpsellBlockerPresenter) obj4, (String) obj5);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow4.collect(ssnPresenter$models$$inlined$CollectEffect$1$15, this) == coroutineSingletons18) {
                        return coroutineSingletons18;
                    }
                } else {
                    if (i22 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 16:
                MutableState mutableState7 = (MutableState) this.$state$delegate;
                MutableState mutableState8 = (MutableState) this.L$0;
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i23 = this.label;
                if (i23 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealCameraLauncher realCameraLauncher = ((FilesetUploadPresenter) obj4).cameraCapturer;
                    this.label = 1;
                    result = realCameraLauncher.getResult(this);
                    if (result == coroutineSingletons19) {
                        return coroutineSingletons19;
                    }
                } else {
                    if (i23 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    result = obj;
                }
                CameraResult cameraResult = (CameraResult) result;
                if (!Intrinsics.areEqual(cameraResult, CameraResult.Canceled.INSTANCE)) {
                    if (!Intrinsics.areEqual(cameraResult, CameraResult.Success.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    if (((Uri) mutableState8.getValue()) == null) {
                        return Unit.INSTANCE;
                    }
                    mutableState7.setValue(Integer.valueOf(((Number) mutableState7.getValue()).intValue() + 1));
                    ((MutableState) obj5).setValue(new FilesetUploadPresenter.UriToUpload(String.valueOf((Uri) mutableState8.getValue()), Trigger.CAMERA));
                }
                mutableState8.setValue(null);
                return Unit.INSTANCE;
            case 17:
                CoroutineScope coroutineScope14 = (CoroutineScope) this.$state$delegate;
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i24 = this.label;
                if (i24 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SsnPresenter$models$$inlined$CollectEffect$1$1 ssnPresenter$models$$inlined$CollectEffect$1$16 = new SsnPresenter$models$$inlined$CollectEffect$1$1(12, coroutineScope14, (GpsLocationConsentBlockerPresenter) obj5, (MutableState) this.L$0);
                    this.$state$delegate = null;
                    this.label = 1;
                    if (((Flow) obj4).collect(ssnPresenter$models$$inlined$CollectEffect$1$16, this) == coroutineSingletons20) {
                        return coroutineSingletons20;
                    }
                } else {
                    if (i24 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 18:
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = this.label;
                if (i25 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    GpsLocationConsentBlockerPresenter gpsLocationConsentBlockerPresenter = (GpsLocationConsentBlockerPresenter) obj4;
                    DataStoreImpl$data$1$invokeSuspend$$inlined$map$1 dataStoreImpl$data$1$invokeSuspend$$inlined$map$1 = gpsLocationConsentBlockerPresenter.triggerRefresh;
                    DatePickerKt$updateDisplayedMonth$3 datePickerKt$updateDisplayedMonth$3 = new DatePickerKt$updateDisplayedMonth$3(gpsLocationConsentBlockerPresenter, (MutableState) this.L$0, (MutableState) this.$state$delegate, (MutableState) obj5, 22);
                    this.label = 1;
                    if (dataStoreImpl$data$1$invokeSuspend$$inlined$map$1.collect(datePickerKt$updateDisplayedMonth$3, this) == coroutineSingletons21) {
                        return coroutineSingletons21;
                    }
                } else {
                    if (i25 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 19:
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i26 = this.label;
                if (i26 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    InstrumentSelectionBlockerPresenter$SubmissionData instrumentSelectionBlockerPresenter$SubmissionData = (InstrumentSelectionBlockerPresenter$SubmissionData) obj4;
                    DisclosurePresenter disclosurePresenter = (DisclosurePresenter) obj5;
                    InstrumentSelectionData.SubmissionEndpoint submissionEndpoint = ((BlockersScreens.InstrumentSelectionScreen) disclosurePresenter.appService).data.submissionEndpoint;
                    this.$state$delegate = null;
                    this.label = 1;
                    if (InstrumentSelectionBlockerPresenter$WhenMappings.$EnumSwitchMapping$0[submissionEndpoint.ordinal()] != 1) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    submitOptionV2 = disclosurePresenter.submitOptionV2(instrumentSelectionBlockerPresenter$SubmissionData, this);
                    if (submitOptionV2 == coroutineSingletons22) {
                        return coroutineSingletons22;
                    }
                } else {
                    if (i26 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    submitOptionV2 = obj;
                }
                if (!((Boolean) submitOptionV2).booleanValue()) {
                    ((MutableState) this.L$0).setValue(null);
                }
                return Unit.INSTANCE;
            case 20:
                ProducerScope producerScope = (ProducerScope) obj4;
                PasscodeGenericGatedEndpointTypeTransformer passcodeGenericGatedEndpointTypeTransformer = (PasscodeGenericGatedEndpointTypeTransformer) obj5;
                AndroidClock androidClock = passcodeGenericGatedEndpointTypeTransformer.clock;
                AndroidStringManager androidStringManager2 = passcodeGenericGatedEndpointTypeTransformer.stringManager;
                BlockersScreens.PasscodeScreen passcodeScreen = passcodeGenericGatedEndpointTypeTransformer.args;
                PasscodeViewEvent.VerifyPasscode verifyPasscode = (PasscodeViewEvent.VerifyPasscode) this.$state$delegate;
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                switch (this.label) {
                    case 0:
                        SafeTrace.throwOnFailure(obj);
                        this.$state$delegate = verifyPasscode;
                        this.label = 1;
                        if (((ProducerCoroutine) producerScope)._channel.send(PasscodeViewModel.VerifyPasscodeModel.VerifyingPasscode.INSTANCE, this) == coroutineSingletons23) {
                            coroutineSingletons = coroutineSingletons23;
                            return coroutineSingletons;
                        }
                        RequestContext requestContext = passcodeScreen.blockersData.requestContext;
                        if (verifyPasscode instanceof PasscodeViewEvent.VerifyPasscode.WithFingerprint) {
                            z = true;
                            if (!(verifyPasscode instanceof PasscodeViewEvent.VerifyPasscode.WithoutFingerprint)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            passcodeGatedEndpoint$Request$Passcode = new PasscodeGatedEndpoint$Request$Passcode(((PasscodeViewEvent.VerifyPasscode.WithoutFingerprint) verifyPasscode).passcode, requestContext);
                            credentialType = AccountAuthenticateSubmitCredential.CredentialType.PASSCODE;
                        } else {
                            z = true;
                            passcodeGatedEndpoint$Request$Passcode = new PasscodeGatedEndpoint$Request$Fingerprint(((PasscodeViewEvent.VerifyPasscode.WithFingerprint) verifyPasscode).passcodeToken, requestContext);
                            credentialType = AccountAuthenticateSubmitCredential.CredentialType.TOKEN;
                        }
                        Analytics analytics2 = passcodeGenericGatedEndpointTypeTransformer.analytics;
                        ClientScenario clientScenario = passcodeScreen.blockersData.clientScenario;
                        String name = clientScenario == null ? clientScenario.name() : null;
                        String str8 = passcodeScreen.blockersData.flowToken;
                        Duration duration = passcodeGenericGatedEndpointTypeTransformer.startPasscodeInput;
                        analytics2.track(new AccountAuthenticateSubmitCredential(name, str8, duration == null ? new Integer((int) (androidClock.elapsedRealtime() - Duration.m4167getInWholeMillisecondsimpl(duration.rawValue))) : null, credentialType), null);
                        passcodeGenericGatedEndpointTypeTransformer.attemptCount++;
                        PasscodeGatedEndpoint passcodeGatedEndpoint = passcodeGenericGatedEndpointTypeTransformer.passcodeGatedEndpoint;
                        PasscodeService passcodeService = passcodeGenericGatedEndpointTypeTransformer.appService;
                        AppService appService = passcodeGenericGatedEndpointTypeTransformer.franklinAppService;
                        this.$state$delegate = verifyPasscode;
                        this.label = 2;
                        call = passcodeGatedEndpoint.call(passcodeService, appService, passcodeGatedEndpoint$Request$Passcode, this);
                        coroutineSingletons = coroutineSingletons23;
                        break;
                    case 1:
                        SafeTrace.throwOnFailure(obj);
                        RequestContext requestContext2 = passcodeScreen.blockersData.requestContext;
                        if (verifyPasscode instanceof PasscodeViewEvent.VerifyPasscode.WithFingerprint) {
                        }
                        Analytics analytics22 = passcodeGenericGatedEndpointTypeTransformer.analytics;
                        ClientScenario clientScenario2 = passcodeScreen.blockersData.clientScenario;
                        if (clientScenario2 == null) {
                        }
                        String str82 = passcodeScreen.blockersData.flowToken;
                        Duration duration2 = passcodeGenericGatedEndpointTypeTransformer.startPasscodeInput;
                        analytics22.track(new AccountAuthenticateSubmitCredential(name, str82, duration2 == null ? new Integer((int) (androidClock.elapsedRealtime() - Duration.m4167getInWholeMillisecondsimpl(duration2.rawValue))) : null, credentialType), null);
                        passcodeGenericGatedEndpointTypeTransformer.attemptCount++;
                        PasscodeGatedEndpoint passcodeGatedEndpoint2 = passcodeGenericGatedEndpointTypeTransformer.passcodeGatedEndpoint;
                        PasscodeService passcodeService2 = passcodeGenericGatedEndpointTypeTransformer.appService;
                        AppService appService2 = passcodeGenericGatedEndpointTypeTransformer.franklinAppService;
                        this.$state$delegate = verifyPasscode;
                        this.label = 2;
                        call = passcodeGatedEndpoint2.call(passcodeService2, appService2, passcodeGatedEndpoint$Request$Passcode, this);
                        coroutineSingletons = coroutineSingletons23;
                        break;
                    case 2:
                        SafeTrace.throwOnFailure(obj);
                        call = obj;
                        coroutineSingletons = coroutineSingletons23;
                        z = true;
                        response = (PasscodeGatedEndpoint.Response) call;
                        if (!(response instanceof PasscodeGatedEndpoint.Response.Success)) {
                            if (!(response instanceof PasscodeGatedEndpoint.Response.InvalidPasscodeOrToken)) {
                                if (response instanceof PasscodeGatedEndpoint.Response.TooManyAttempts) {
                                    PasscodeGenericGatedEndpointTypeTransformer.access$handleError(passcodeGenericGatedEndpointTypeTransformer, ((PasscodeGatedEndpoint.Response.TooManyAttempts) response).responseContext, androidStringManager2.get(R.string.profile_error_message_passcode_card_blocked), passcodeGenericGatedEndpointTypeTransformer.attemptCount);
                                } else if (response instanceof PasscodeGatedEndpoint.Response.ServiceLevelError) {
                                    PasscodeGenericGatedEndpointTypeTransformer.access$handleError(passcodeGenericGatedEndpointTypeTransformer, ((PasscodeGatedEndpoint.Response.ServiceLevelError) response).responseContext, androidStringManager2.get(R.string.profile_error_message_passcode_unable_to_toggle_status), passcodeGenericGatedEndpointTypeTransformer.attemptCount);
                                } else {
                                    if (!(response instanceof PasscodeGatedEndpoint.Response.Failure)) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return null;
                                    }
                                    passcodeGenericGatedEndpointTypeTransformer.navigator.goTo(new FailureMessageBlockerScreen(passcodeScreen.blockersData, TextUtilsCompat.errorMessaging(androidStringManager2, ((PasscodeGatedEndpoint.Response.Failure) response).result, null).message, objArr == true ? 1 : 0, 4));
                                    this.$state$delegate = verifyPasscode;
                                    this.L$0 = response;
                                    this.label = 6;
                                    break;
                                }
                                if (!(response instanceof PasscodeGatedEndpoint.Response.Success) || (response instanceof PasscodeGatedEndpoint.Response.TooManyAttempts) || (response instanceof PasscodeGatedEndpoint.Response.ServiceLevelError)) {
                                    passcodeGenericGatedEndpointTypeTransformer.navigatedAway = z;
                                }
                                if (verifyPasscode instanceof PasscodeViewEvent.VerifyPasscode.WithoutFingerprint) {
                                    Duration.Companion companion = Duration.Companion;
                                    passcodeGenericGatedEndpointTypeTransformer.startPasscodeInput = new Duration(DurationKt.toDuration(androidClock.elapsedRealtime(), DurationUnit.MILLISECONDS));
                                }
                                return Unit.INSTANCE;
                            }
                            this.$state$delegate = verifyPasscode;
                            this.L$0 = response;
                            this.label = 4;
                            String str9 = passcodeGenericGatedEndpointTypeTransformer.verificationInstrumentToken;
                            if (str9 != null) {
                                obj2 = passcodeGenericGatedEndpointTypeTransformer.biometricsStore.write(str9, null, this);
                                if (obj2 != coroutineSingletons) {
                                    obj2 = Unit.INSTANCE;
                                }
                            } else {
                                obj2 = Unit.INSTANCE;
                            }
                            if (obj2 != coroutineSingletons) {
                                response2 = response;
                                PasscodeViewModel.VerifyPasscodeModel.InvalidPasscode invalidPasscode = new PasscodeViewModel.VerifyPasscodeModel.InvalidPasscode(verifyPasscode instanceof PasscodeViewEvent.VerifyPasscode.WithFingerprint);
                                this.$state$delegate = verifyPasscode;
                                this.L$0 = response2;
                                this.label = 5;
                                break;
                            }
                            return coroutineSingletons;
                        }
                        int i27 = passcodeGenericGatedEndpointTypeTransformer.attemptCount;
                        this.$state$delegate = verifyPasscode;
                        this.L$0 = response;
                        this.label = 3;
                        break;
                        response = response2;
                        if (!(response instanceof PasscodeGatedEndpoint.Response.Success)) {
                        }
                        passcodeGenericGatedEndpointTypeTransformer.navigatedAway = z;
                        if (verifyPasscode instanceof PasscodeViewEvent.VerifyPasscode.WithoutFingerprint) {
                        }
                        return Unit.INSTANCE;
                    case 3:
                    case 5:
                    case 6:
                        response2 = (PasscodeGatedEndpoint.Response) this.L$0;
                        SafeTrace.throwOnFailure(obj);
                        z = true;
                        response = response2;
                        if (!(response instanceof PasscodeGatedEndpoint.Response.Success)) {
                        }
                        passcodeGenericGatedEndpointTypeTransformer.navigatedAway = z;
                        if (verifyPasscode instanceof PasscodeViewEvent.VerifyPasscode.WithoutFingerprint) {
                        }
                        return Unit.INSTANCE;
                    case 4:
                        response2 = (PasscodeGatedEndpoint.Response) this.L$0;
                        SafeTrace.throwOnFailure(obj);
                        coroutineSingletons = coroutineSingletons23;
                        z = true;
                        PasscodeViewModel.VerifyPasscodeModel.InvalidPasscode invalidPasscode2 = new PasscodeViewModel.VerifyPasscodeModel.InvalidPasscode(verifyPasscode instanceof PasscodeViewEvent.VerifyPasscode.WithFingerprint);
                        this.$state$delegate = verifyPasscode;
                        this.L$0 = response2;
                        this.label = 5;
                        break;
                    default:
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            case 21:
                CoroutineScope coroutineScope15 = (CoroutineScope) this.$state$delegate;
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i28 = this.label;
                if (i28 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SsnPresenter$models$$inlined$CollectEffect$1$1 ssnPresenter$models$$inlined$CollectEffect$1$17 = new SsnPresenter$models$$inlined$CollectEffect$1$1(13, coroutineScope15, (PlaidLinkPresenter) obj5, (MutableState) this.L$0);
                    this.$state$delegate = null;
                    this.label = 1;
                    if (((Flow) obj4).collect(ssnPresenter$models$$inlined$CollectEffect$1$17, this) == coroutineSingletons24) {
                        return coroutineSingletons24;
                    }
                } else {
                    if (i28 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 22:
                CoroutineScope coroutineScope16 = (CoroutineScope) this.$state$delegate;
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i29 = this.label;
                if (i29 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SsnPresenter$models$$inlined$CollectEffect$1$1 ssnPresenter$models$$inlined$CollectEffect$1$18 = new SsnPresenter$models$$inlined$CollectEffect$1$1(14, coroutineScope16, (DisclosurePresenter) obj5, (MutableState) this.L$0);
                    this.$state$delegate = null;
                    this.label = 1;
                    if (((Flow) obj4).collect(ssnPresenter$models$$inlined$CollectEffect$1$18, this) == coroutineSingletons25) {
                        return coroutineSingletons25;
                    }
                } else {
                    if (i29 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 23:
                ReferralCodePresenter referralCodePresenter = (ReferralCodePresenter) this.$state$delegate;
                AndroidStringManager androidStringManager3 = referralCodePresenter.stringManager;
                BlockersScreens.ReferralCodeScreen referralCodeScreen = referralCodePresenter.args;
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i30 = this.label;
                if (i30 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Analytics analytics3 = referralCodePresenter.analytics;
                    BlockersData blockersData3 = referralCodeScreen.blockersData;
                    PagingDataPresenter$collectFrom$2 pagingDataPresenter$collectFrom$2 = new PagingDataPresenter$collectFrom$2(referralCodePresenter, (ReferralCodeViewEvent) obj5, objArr2 == true ? 1 : 0, 23);
                    this.label = 1;
                    coroutineSingletons2 = coroutineSingletons26;
                    trackBlockerSubmissionAnalytics$default = PointerInputModifierNodeKt.trackBlockerSubmissionAnalytics$default(16, blockersData3, analytics3, androidStringManager3, this, ReferralCodePresenter$models$2$2$2$result$1.INSTANCE, pagingDataPresenter$collectFrom$2);
                    break;
                } else if (i30 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    coroutineSingletons2 = coroutineSingletons26;
                    trackBlockerSubmissionAnalytics$default = obj;
                } else if (i30 == 2) {
                    mutableSharedFlow = (MutableSharedFlow) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    coroutineSingletons2 = coroutineSingletons26;
                    rewardCodeApplyFailed = obj;
                    obj3 = (ReferralCodePresenter.InternalUpdate) rewardCodeApplyFailed;
                    this.L$0 = null;
                    this.label = 3;
                    break;
                } else {
                    if (i30 == 3) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ApiResult apiResult3 = (ApiResult) trackBlockerSubmissionAnalytics$default;
                mutableSharedFlow = (MutableSharedFlow) obj4;
                if (apiResult3 instanceof ApiResult.Failure) {
                    Timber.Forest.e("Failed to apply reward code.", new Object[0]);
                    referralCodePresenter.navigator.goTo(new FailureMessageBlockerScreen(referralCodeScreen.blockersData, TextUtilsCompat.errorMessaging(androidStringManager3, (ApiResult.Failure) apiResult3, null).message, str3, i4));
                    obj3 = ReferralCodePresenter.InternalUpdate.RewardCodeApplyErrored.INSTANCE;
                    this.L$0 = null;
                    this.label = 3;
                } else {
                    if (!(apiResult3 instanceof ApiResult.Success)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    ApplyRewardCodeResponse applyRewardCodeResponse = (ApplyRewardCodeResponse) ((ApiResult.Success) apiResult3).response;
                    this.L$0 = mutableSharedFlow;
                    this.label = 2;
                    if (!Intrinsics.areEqual(applyRewardCodeResponse.valid, Boolean.TRUE)) {
                        ResponseContext responseContext2 = applyRewardCodeResponse.response_context;
                        rewardCodeApplyFailed = new ReferralCodePresenter.InternalUpdate.RewardCodeApplyFailed((responseContext2 == null || (str2 = responseContext2.failure_message) == null) ? null : new Header(Header$Avatar$Placeholder.INSTANCE, str2));
                        break;
                    } else {
                        rewardCodeApplyFailed = referralCodePresenter.onAppliedCodeValid(applyRewardCodeResponse, this);
                        break;
                    }
                }
                break;
            case 24:
                MutableSharedFlow mutableSharedFlow2 = (MutableSharedFlow) this.$state$delegate;
                CoroutineScope coroutineScope17 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i31 = this.label;
                Continuation continuation2 = null;
                if (i31 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    StandaloneCoroutine launch$default = JobKt.launch$default(coroutineScope17, null, null, new ReferralCodePresenter$models$2$1$1(mutableSharedFlow2, continuation2, i5), 3);
                    this.L$0 = coroutineScope17;
                    this.label = 1;
                    break;
                } else {
                    if (i31 != 1) {
                        if (i31 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                StandaloneCoroutine launch$default2 = JobKt.launch$default(coroutineScope17, null, null, new SetNamePresenter$models$1$1$1((ReferralCodePresenter) obj4, mutableSharedFlow2, (ReferralCodeViewEvent) obj5, continuation2, 23), 3);
                this.L$0 = null;
                this.label = 2;
                break;
            case 25:
                CoroutineScope coroutineScope18 = (CoroutineScope) this.$state$delegate;
                CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i32 = this.label;
                if (i32 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SsnPresenter$models$$inlined$CollectEffect$1$1 ssnPresenter$models$$inlined$CollectEffect$1$19 = new SsnPresenter$models$$inlined$CollectEffect$1$1(15, coroutineScope18, (RequestPushNotificationsBlockerPresenter) obj5, (MutableState) this.L$0);
                    this.$state$delegate = null;
                    this.label = 1;
                    if (((Flow) obj4).collect(ssnPresenter$models$$inlined$CollectEffect$1$19, this) == coroutineSingletons28) {
                        return coroutineSingletons28;
                    }
                } else {
                    if (i32 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 26:
                CoroutineScope coroutineScope19 = (CoroutineScope) this.$state$delegate;
                CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i33 = this.label;
                if (i33 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SsnPresenter$models$$inlined$CollectEffect$1$1 ssnPresenter$models$$inlined$CollectEffect$1$110 = new SsnPresenter$models$$inlined$CollectEffect$1$1(16, coroutineScope19, (SavingsTransferOptionSelectionPresenter) obj5, (MutableState) this.L$0);
                    this.$state$delegate = null;
                    this.label = 1;
                    if (((Flow) obj4).collect(ssnPresenter$models$$inlined$CollectEffect$1$110, this) == coroutineSingletons29) {
                        return coroutineSingletons29;
                    }
                } else {
                    if (i33 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 27:
                CoroutineScope coroutineScope20 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i34 = this.label;
                if (i34 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow5 = (Flow) this.$state$delegate;
                    SsnPresenter$models$$inlined$CollectEffect$1$1 ssnPresenter$models$$inlined$CollectEffect$1$111 = new SsnPresenter$models$$inlined$CollectEffect$1$1(17, coroutineScope20, (CardLockPresenter) obj4, (Channel) obj5);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow5.collect(ssnPresenter$models$$inlined$CollectEffect$1$111, this) == coroutineSingletons30) {
                        return coroutineSingletons30;
                    }
                } else {
                    if (i34 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 28:
                SetAddressViewEvent setAddressViewEvent = (SetAddressViewEvent) obj5;
                CoroutineScope coroutineScope21 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons31 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i35 = this.label;
                if (i35 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CardLockPresenter cardLockPresenter2 = (CardLockPresenter) this.$state$delegate;
                    if (((DisclosurePresenter) cardLockPresenter2.flowNavigationHelper) != null) {
                        SetAddressViewEvent.Submit submit = (SetAddressViewEvent.Submit) setAddressViewEvent;
                        IdvViewEvent.SubmitAddress submitAddress = new IdvViewEvent.SubmitAddress(submit.address, submit.signalsContext);
                        this.L$0 = coroutineScope21;
                        this.label = 1;
                        break;
                    } else {
                        BlockersScreens.StreetAddressScreen.SetStreetAddressType setStreetAddressType = ((BlockersScreens.StreetAddressScreen) cardLockPresenter2.flowStarter).setStreetAddressType;
                        if (Intrinsics.areEqual(setStreetAddressType, BlockersScreens.StreetAddressScreen.SetStreetAddressType.SetStreetAddressOnly.INSTANCE)) {
                            SetAddressViewEvent.Submit submit2 = (SetAddressViewEvent.Submit) setAddressViewEvent;
                            GlobalAddress globalAddress = submit2.address;
                            boolean z2 = submit2.validated;
                            this.L$0 = null;
                            this.label = 2;
                            break;
                        } else if (setStreetAddressType instanceof BlockersScreens.StreetAddressScreen.SetStreetAddressType.CreateShippingAddressWithStreetAddress) {
                            GlobalAddress globalAddress2 = ((SetAddressViewEvent.Submit) setAddressViewEvent).address;
                            BlockersScreens.StreetAddressScreen.SetStreetAddressType setStreetAddressType2 = ((BlockersScreens.StreetAddressScreen) cardLockPresenter2.flowStarter).setStreetAddressType;
                            setStreetAddressType2.getClass();
                            this.L$0 = null;
                            this.label = 3;
                            break;
                        } else {
                            if (!(setStreetAddressType instanceof BlockersScreens.StreetAddressScreen.SetStreetAddressType.SetShippingStreetAddress)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            GlobalAddress globalAddress3 = ((SetAddressViewEvent.Submit) setAddressViewEvent).address;
                            BlockersScreens.StreetAddressScreen.SetStreetAddressType setStreetAddressType3 = ((BlockersScreens.StreetAddressScreen) cardLockPresenter2.flowStarter).setStreetAddressType;
                            setStreetAddressType3.getClass();
                            this.L$0 = null;
                            this.label = 4;
                            break;
                        }
                    }
                } else {
                    if (i35 != 1 && i35 != 2 && i35 != 3 && i35 != 4) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            default:
                CoroutineScope coroutineScope22 = (CoroutineScope) this.$state$delegate;
                CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i36 = this.label;
                if (i36 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SsnPresenter$models$$inlined$CollectEffect$1$1 ssnPresenter$models$$inlined$CollectEffect$1$112 = new SsnPresenter$models$$inlined$CollectEffect$1$1(18, coroutineScope22, (CardLockPresenter) obj4, (MutableState) this.L$0);
                    this.$state$delegate = null;
                    this.label = 1;
                    if (((Flow) obj5).collect(ssnPresenter$models$$inlined$CollectEffect$1$112, this) == coroutineSingletons32) {
                        return coroutineSingletons32;
                    }
                } else {
                    if (i36 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SetNamePresenter$models$1$1$1(int i, MutableState mutableState, MoleculePresenter moleculePresenter, Object obj, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
        this.$text = moleculePresenter;
        this.L$0 = mutableState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetNamePresenter$models$1$1$1(CardLockPresenter cardLockPresenter, LifecycleOwner lifecycleOwner, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 13;
        this.this$0 = cardLockPresenter;
        this.$text = lifecycleOwner;
        this.L$0 = mutableState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetNamePresenter$models$1$1$1(CardLockPresenter cardLockPresenter, CharSequence charSequence, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 0;
        this.this$0 = cardLockPresenter;
        this.$text = charSequence;
        this.$state$delegate = mutableState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SetNamePresenter$models$1$1$1(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$state$delegate = obj;
        this.this$0 = obj2;
        this.$text = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetNamePresenter$models$1$1$1(ProducerScope producerScope, PasscodeGenericGatedEndpointTypeTransformer passcodeGenericGatedEndpointTypeTransformer, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 20;
        this.this$0 = producerScope;
        this.$text = passcodeGenericGatedEndpointTypeTransformer;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetNamePresenter$models$1$1$1(Flow flow, Continuation continuation, CardLockPresenter cardLockPresenter, MutableState mutableState) {
        super(2, continuation);
        this.$r8$classId = 29;
        this.$text = flow;
        this.this$0 = cardLockPresenter;
        this.L$0 = mutableState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SetNamePresenter$models$1$1$1(Flow flow, Continuation continuation, Object obj, Object obj2, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$state$delegate = flow;
        this.this$0 = obj;
        this.$text = obj2;
    }
}
