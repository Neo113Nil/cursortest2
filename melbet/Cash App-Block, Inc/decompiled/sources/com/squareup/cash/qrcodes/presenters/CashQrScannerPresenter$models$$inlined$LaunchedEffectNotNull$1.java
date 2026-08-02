package com.squareup.cash.qrcodes.presenters;

import androidx.compose.runtime.MutableState;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.screen.Screen;
import app.cash.passcode.flows.RealPasscodeFlowStarter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.banking.presenters.TransfersPresenter;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.db2.profile.Profile;
import com.squareup.cash.instruments.common.Instrument;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.profile.presenters.RealProfilePasscodePresenter$PasscodeToggleData;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.qrcodes.presenters.CashQrScannerPresenter;
import com.squareup.cash.screens.Back;
import com.squareup.protos.franklin.api.ClientScenario;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.internal.publicsuffix.AssetPublicSuffixList;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class CashQrScannerPresenter$models$$inlined$LaunchedEffectNotNull$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $state$delegate$inlined;
    public final /* synthetic */ Object $t1;
    public int I$0;
    public /* synthetic */ Object L$0;
    public Object L$2;
    public boolean Z$0;
    public int label;
    public final /* synthetic */ MoleculePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CashQrScannerPresenter$models$$inlined$LaunchedEffectNotNull$1(Object obj, Continuation continuation, MoleculePresenter moleculePresenter, Object obj2, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$t1 = obj;
        this.this$0 = moleculePresenter;
        this.$state$delegate$inlined = obj2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$state$delegate$inlined;
        MoleculePresenter moleculePresenter = this.this$0;
        switch (i) {
            case 0:
                CashQrScannerPresenter$models$$inlined$LaunchedEffectNotNull$1 cashQrScannerPresenter$models$$inlined$LaunchedEffectNotNull$1 = new CashQrScannerPresenter$models$$inlined$LaunchedEffectNotNull$1(this.$t1, continuation, (CashQrScannerPresenter) moleculePresenter, (MutableState) obj2, 0);
                cashQrScannerPresenter$models$$inlined$LaunchedEffectNotNull$1.L$0 = obj;
                return cashQrScannerPresenter$models$$inlined$LaunchedEffectNotNull$1;
            default:
                CashQrScannerPresenter$models$$inlined$LaunchedEffectNotNull$1 cashQrScannerPresenter$models$$inlined$LaunchedEffectNotNull$12 = new CashQrScannerPresenter$models$$inlined$LaunchedEffectNotNull$1((Boolean) this.$t1, continuation, (TransfersPresenter) moleculePresenter, (Profile) obj2, 1);
                cashQrScannerPresenter$models$$inlined$LaunchedEffectNotNull$12.L$0 = obj;
                return cashQrScannerPresenter$models$$inlined$LaunchedEffectNotNull$12;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((CashQrScannerPresenter$models$$inlined$LaunchedEffectNotNull$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0142  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        int i;
        boolean z;
        boolean z2;
        String str2;
        BetterNavigator.ScreenNavigator screenNavigator;
        BetterNavigator.ScreenNavigator screenNavigator2;
        int i2 = this.$r8$classId;
        Object obj2 = this.$state$delegate$inlined;
        int i3 = 0;
        Object obj3 = this.$t1;
        MoleculePresenter moleculePresenter = this.this$0;
        switch (i2) {
            case 0:
                CashQrScannerPresenter cashQrScannerPresenter = (CashQrScannerPresenter) moleculePresenter;
                BetterNavigator.ScreenNavigator screenNavigator3 = cashQrScannerPresenter.navigator;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    str = (String) obj3;
                    AssetPublicSuffixList assetPublicSuffixList = cashQrScannerPresenter.qrCodesHandler;
                    this.L$0 = null;
                    this.L$2 = str;
                    this.I$0 = 0;
                    this.label = 1;
                    obj = assetPublicSuffixList.handle(screenNavigator3, str, this);
                    if (obj != coroutineSingletons) {
                        i = 0;
                    }
                    break;
                } else if (i4 == 1) {
                    i = this.I$0;
                    str = (String) this.L$2;
                    SafeTrace.throwOnFailure(obj);
                } else if (i4 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    z = this.Z$0;
                    SafeTrace.throwOnFailure(obj);
                    if (!z) {
                        screenNavigator3.goTo(Back.INSTANCE);
                        screenNavigator3.goTo(new ProfileScreens.ErrorScreen(cashQrScannerPresenter.stringManager.get(R.string.profile_qr_invalid_code), null, 14));
                    }
                    MutableState mutableState = (MutableState) obj2;
                    mutableState.setValue(CashQrScannerPresenter.State.copy$default((CashQrScannerPresenter.State) mutableState.getValue(), false, null, null, 11));
                    break;
                }
                boolean booleanValue = ((Boolean) obj).booleanValue();
                Analytics analytics = cashQrScannerPresenter.analytics;
                this.L$0 = null;
                this.L$2 = null;
                this.I$0 = i;
                this.Z$0 = booleanValue;
                this.label = 2;
                if (CashQrScannerPresenter.access$trackScanMainQrCode(cashQrScannerPresenter, analytics, str, booleanValue, this) != coroutineSingletons) {
                    z = booleanValue;
                    if (!z) {
                    }
                    MutableState mutableState2 = (MutableState) obj2;
                    mutableState2.setValue(CashQrScannerPresenter.State.copy$default((CashQrScannerPresenter.State) mutableState2.getValue(), false, null, null, 11));
                }
            default:
                TransfersPresenter transfersPresenter = (TransfersPresenter) moleculePresenter;
                RealPasscodeFlowStarter realPasscodeFlowStarter = (RealPasscodeFlowStarter) transfersPresenter.router;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    boolean booleanValue2 = ((Boolean) obj3).booleanValue();
                    this.L$0 = null;
                    this.Z$0 = booleanValue2;
                    this.I$0 = 0;
                    this.label = 1;
                    Object access$passcodeToggleData = TransfersPresenter.access$passcodeToggleData(transfersPresenter, (Profile) obj2, this);
                    if (access$passcodeToggleData != coroutineSingletons2) {
                        z2 = booleanValue2;
                        obj = access$passcodeToggleData;
                    }
                    break;
                } else if (i5 == 1) {
                    i3 = this.I$0;
                    z2 = this.Z$0;
                    SafeTrace.throwOnFailure(obj);
                } else if (i5 == 2) {
                    screenNavigator2 = (BetterNavigator.ScreenNavigator) this.L$2;
                    SafeTrace.throwOnFailure(obj);
                    screenNavigator2.goTo((Screen) obj);
                } else if (i5 != 3) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    screenNavigator = (BetterNavigator.ScreenNavigator) this.L$2;
                    SafeTrace.throwOnFailure(obj);
                    screenNavigator.goTo((Screen) obj);
                    break;
                }
                RealProfilePasscodePresenter$PasscodeToggleData realProfilePasscodePresenter$PasscodeToggleData = (RealProfilePasscodePresenter$PasscodeToggleData) obj;
                ClientScenario clientScenario = z2 ? ClientScenario.ENABLE_APP_LOCK : ClientScenario.DISABLE_APP_LOCK;
                ProfileScreens profileScreens = (ProfileScreens) transfersPresenter.clipboardManager;
                String str3 = realProfilePasscodePresenter$PasscodeToggleData.customerPasscodeToken;
                RealProfilePasscodePresenter$PasscodeToggleData.VerificationInstrument verificationInstrument = realProfilePasscodePresenter$PasscodeToggleData.verificationInstrument;
                BetterNavigator.ScreenNavigator screenNavigator4 = (BetterNavigator.ScreenNavigator) transfersPresenter.navigator;
                if (str3 != null) {
                    this.L$0 = null;
                    this.L$2 = screenNavigator4;
                    this.Z$0 = z2;
                    this.I$0 = i3;
                    this.label = 2;
                    obj = realPasscodeFlowStarter.startLocalClientScenarioHackFlow(profileScreens, clientScenario, str3, null);
                    if (obj != coroutineSingletons2) {
                        screenNavigator2 = screenNavigator4;
                        screenNavigator2.goTo((Screen) obj);
                    }
                } else {
                    if (verificationInstrument == null) {
                        str2 = null;
                    } else if (!(verificationInstrument instanceof RealProfilePasscodePresenter$PasscodeToggleData.VerificationInstrument.BalanceVerificationInstrument)) {
                        if (!(verificationInstrument instanceof RealProfilePasscodePresenter$PasscodeToggleData.VerificationInstrument.BitcoinVerificationInstrument)) {
                            if (!(verificationInstrument instanceof RealProfilePasscodePresenter$PasscodeToggleData.VerificationInstrument.ExternalVerificationInstrument)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                break;
                            } else {
                                str2 = ((RealProfilePasscodePresenter$PasscodeToggleData.VerificationInstrument.ExternalVerificationInstrument) verificationInstrument).instrument.token;
                            }
                        } else {
                            str2 = ((RealProfilePasscodePresenter$PasscodeToggleData.VerificationInstrument.BitcoinVerificationInstrument) verificationInstrument).balance.instrumentToken;
                        }
                    } else {
                        str2 = ((RealProfilePasscodePresenter$PasscodeToggleData.VerificationInstrument.BalanceVerificationInstrument) verificationInstrument).balance.token;
                    }
                    RealProfilePasscodePresenter$PasscodeToggleData.VerificationInstrument.ExternalVerificationInstrument externalVerificationInstrument = verificationInstrument instanceof RealProfilePasscodePresenter$PasscodeToggleData.VerificationInstrument.ExternalVerificationInstrument ? (RealProfilePasscodePresenter$PasscodeToggleData.VerificationInstrument.ExternalVerificationInstrument) verificationInstrument : null;
                    Instrument instrument = externalVerificationInstrument != null ? externalVerificationInstrument.instrument : null;
                    this.L$0 = null;
                    this.L$2 = screenNavigator4;
                    this.Z$0 = z2;
                    this.I$0 = i3;
                    this.label = 3;
                    obj = realPasscodeFlowStarter.startLocalClientScenarioHackFlow(profileScreens, clientScenario, str2, instrument);
                    if (obj != coroutineSingletons2) {
                        screenNavigator = screenNavigator4;
                        screenNavigator.goTo((Screen) obj);
                    }
                }
        }
        return Unit.INSTANCE;
    }
}
