package com.squareup.cash.bitcoin.presenters;

import androidx.compose.runtime.MutableState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.bitcoin.presenters.BitcoinQrCodeScannerPresenter$State;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.profile.presenters.ProfilePresenter;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.qrcodes.viewmodels.QrAddressScannerViewEvent;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Back;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class BitcoinQrCodeScannerPresenter$models$$inlined$CollectEffect$3 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Flow $flow;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState $state$delegate$inlined;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ ProfilePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BitcoinQrCodeScannerPresenter$models$$inlined$CollectEffect$3(Flow flow, Continuation continuation, ProfilePresenter profilePresenter, MutableState mutableState, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$flow = flow;
        this.this$0 = profilePresenter;
        this.$state$delegate$inlined = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                BitcoinQrCodeScannerPresenter$models$$inlined$CollectEffect$3 bitcoinQrCodeScannerPresenter$models$$inlined$CollectEffect$3 = new BitcoinQrCodeScannerPresenter$models$$inlined$CollectEffect$3(this.$flow, continuation, this.this$0, this.$state$delegate$inlined, 0);
                bitcoinQrCodeScannerPresenter$models$$inlined$CollectEffect$3.L$0 = obj;
                return bitcoinQrCodeScannerPresenter$models$$inlined$CollectEffect$3;
            default:
                BitcoinQrCodeScannerPresenter$models$$inlined$CollectEffect$3 bitcoinQrCodeScannerPresenter$models$$inlined$CollectEffect$32 = new BitcoinQrCodeScannerPresenter$models$$inlined$CollectEffect$3(this.$flow, continuation, this.this$0, this.$state$delegate$inlined, 1);
                bitcoinQrCodeScannerPresenter$models$$inlined$CollectEffect$32.L$0 = obj;
                return bitcoinQrCodeScannerPresenter$models$$inlined$CollectEffect$32;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((BitcoinQrCodeScannerPresenter$models$$inlined$CollectEffect$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$state$delegate$inlined;
        ProfilePresenter profilePresenter = this.this$0;
        Flow flow = this.$flow;
        int i2 = 1;
        switch (i) {
            case 0:
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FlowCollector flowCollector = new FlowCollector(coroutineScope, profilePresenter, mutableState, 0) { // from class: com.squareup.cash.bitcoin.presenters.BitcoinQrCodeScannerPresenter$models$$inlined$CollectEffect$3.1
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ MutableState $state$delegate$inlined;
                        public final /* synthetic */ ProfilePresenter this$0;

                        {
                            this.$r8$classId = r4;
                            this.this$0 = profilePresenter;
                            this.$state$delegate$inlined = mutableState;
                        }

                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final Object emit(Object obj2, Continuation continuation) {
                            BitcoinQrCodeScannerPresenter$State bitcoinQrCodeScannerPresenter$State;
                            int i4 = this.$r8$classId;
                            MutableState mutableState2 = this.$state$delegate$inlined;
                            ProfilePresenter profilePresenter2 = this.this$0;
                            Back back = Back.INSTANCE;
                            switch (i4) {
                                case 0:
                                    BetterNavigator.ScreenNavigator screenNavigator = profilePresenter2.navigator;
                                    screenNavigator.goTo(back);
                                    screenNavigator.goTo(new ProfileScreens.ErrorScreen(((AndroidStringManager) profilePresenter2.stringManager).get(R.string.bitcoin_qr_camera_permission_denied), null, 10));
                                    mutableState2.setValue(BitcoinQrCodeScannerPresenter$State.copy$default((BitcoinQrCodeScannerPresenter$State) mutableState2.getValue(), true, null, null, false, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE));
                                    return Unit.INSTANCE;
                                default:
                                    BetterNavigator.ScreenNavigator screenNavigator2 = profilePresenter2.navigator;
                                    QrAddressScannerViewEvent qrAddressScannerViewEvent = (QrAddressScannerViewEvent) obj2;
                                    if (qrAddressScannerViewEvent instanceof QrAddressScannerViewEvent.ScanComplete) {
                                        bitcoinQrCodeScannerPresenter$State = BitcoinQrCodeScannerPresenter$State.copy$default((BitcoinQrCodeScannerPresenter$State) mutableState2.getValue(), false, null, new BitcoinQrCodeScannerPresenter$State.ProcessingCode(((QrAddressScannerViewEvent.ScanComplete) qrAddressScannerViewEvent).code, BitcoinQrCodeScannerPresenter$State.ProcessingCode.CodeSource.QR_CODE), false, null, 239);
                                    } else if (qrAddressScannerViewEvent instanceof QrAddressScannerViewEvent.ScanError) {
                                        BitcoinQrCodeScannerPresenter$State bitcoinQrCodeScannerPresenter$State2 = (BitcoinQrCodeScannerPresenter$State) mutableState2.getValue();
                                        screenNavigator2.goTo(back);
                                        screenNavigator2.goTo(new ProfileScreens.ErrorScreen(((AndroidStringManager) profilePresenter2.stringManager).get(R.string.bitcoin_camera_error_message), null, 10));
                                        bitcoinQrCodeScannerPresenter$State = BitcoinQrCodeScannerPresenter$State.copy$default(bitcoinQrCodeScannerPresenter$State2, true, null, null, false, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                                    } else if (qrAddressScannerViewEvent instanceof QrAddressScannerViewEvent.PasteAddressPressed) {
                                        bitcoinQrCodeScannerPresenter$State = BitcoinQrCodeScannerPresenter$State.copy$default((BitcoinQrCodeScannerPresenter$State) mutableState2.getValue(), false, null, null, true, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
                                    } else if (qrAddressScannerViewEvent instanceof QrAddressScannerViewEvent.DialogClosed) {
                                        bitcoinQrCodeScannerPresenter$State = BitcoinQrCodeScannerPresenter$State.copy$default((BitcoinQrCodeScannerPresenter$State) mutableState2.getValue(), false, null, null, false, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                                    } else {
                                        if (!(qrAddressScannerViewEvent instanceof QrAddressScannerViewEvent.Exit)) {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            return null;
                                        }
                                        screenNavigator2.goTo(back);
                                        bitcoinQrCodeScannerPresenter$State = (BitcoinQrCodeScannerPresenter$State) mutableState2.getValue();
                                    }
                                    mutableState2.setValue(bitcoinQrCodeScannerPresenter$State);
                                    return Unit.INSTANCE;
                            }
                        }
                    };
                    this.L$0 = null;
                    this.label = 1;
                    if (flow.collect(flowCollector, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FlowCollector flowCollector2 = new FlowCollector(coroutineScope2, profilePresenter, mutableState, i2) { // from class: com.squareup.cash.bitcoin.presenters.BitcoinQrCodeScannerPresenter$models$$inlined$CollectEffect$3.1
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ MutableState $state$delegate$inlined;
                        public final /* synthetic */ ProfilePresenter this$0;

                        {
                            this.$r8$classId = i2;
                            this.this$0 = profilePresenter;
                            this.$state$delegate$inlined = mutableState;
                        }

                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final Object emit(Object obj2, Continuation continuation) {
                            BitcoinQrCodeScannerPresenter$State bitcoinQrCodeScannerPresenter$State;
                            int i42 = this.$r8$classId;
                            MutableState mutableState2 = this.$state$delegate$inlined;
                            ProfilePresenter profilePresenter2 = this.this$0;
                            Back back = Back.INSTANCE;
                            switch (i42) {
                                case 0:
                                    BetterNavigator.ScreenNavigator screenNavigator = profilePresenter2.navigator;
                                    screenNavigator.goTo(back);
                                    screenNavigator.goTo(new ProfileScreens.ErrorScreen(((AndroidStringManager) profilePresenter2.stringManager).get(R.string.bitcoin_qr_camera_permission_denied), null, 10));
                                    mutableState2.setValue(BitcoinQrCodeScannerPresenter$State.copy$default((BitcoinQrCodeScannerPresenter$State) mutableState2.getValue(), true, null, null, false, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE));
                                    return Unit.INSTANCE;
                                default:
                                    BetterNavigator.ScreenNavigator screenNavigator2 = profilePresenter2.navigator;
                                    QrAddressScannerViewEvent qrAddressScannerViewEvent = (QrAddressScannerViewEvent) obj2;
                                    if (qrAddressScannerViewEvent instanceof QrAddressScannerViewEvent.ScanComplete) {
                                        bitcoinQrCodeScannerPresenter$State = BitcoinQrCodeScannerPresenter$State.copy$default((BitcoinQrCodeScannerPresenter$State) mutableState2.getValue(), false, null, new BitcoinQrCodeScannerPresenter$State.ProcessingCode(((QrAddressScannerViewEvent.ScanComplete) qrAddressScannerViewEvent).code, BitcoinQrCodeScannerPresenter$State.ProcessingCode.CodeSource.QR_CODE), false, null, 239);
                                    } else if (qrAddressScannerViewEvent instanceof QrAddressScannerViewEvent.ScanError) {
                                        BitcoinQrCodeScannerPresenter$State bitcoinQrCodeScannerPresenter$State2 = (BitcoinQrCodeScannerPresenter$State) mutableState2.getValue();
                                        screenNavigator2.goTo(back);
                                        screenNavigator2.goTo(new ProfileScreens.ErrorScreen(((AndroidStringManager) profilePresenter2.stringManager).get(R.string.bitcoin_camera_error_message), null, 10));
                                        bitcoinQrCodeScannerPresenter$State = BitcoinQrCodeScannerPresenter$State.copy$default(bitcoinQrCodeScannerPresenter$State2, true, null, null, false, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                                    } else if (qrAddressScannerViewEvent instanceof QrAddressScannerViewEvent.PasteAddressPressed) {
                                        bitcoinQrCodeScannerPresenter$State = BitcoinQrCodeScannerPresenter$State.copy$default((BitcoinQrCodeScannerPresenter$State) mutableState2.getValue(), false, null, null, true, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
                                    } else if (qrAddressScannerViewEvent instanceof QrAddressScannerViewEvent.DialogClosed) {
                                        bitcoinQrCodeScannerPresenter$State = BitcoinQrCodeScannerPresenter$State.copy$default((BitcoinQrCodeScannerPresenter$State) mutableState2.getValue(), false, null, null, false, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                                    } else {
                                        if (!(qrAddressScannerViewEvent instanceof QrAddressScannerViewEvent.Exit)) {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            return null;
                                        }
                                        screenNavigator2.goTo(back);
                                        bitcoinQrCodeScannerPresenter$State = (BitcoinQrCodeScannerPresenter$State) mutableState2.getValue();
                                    }
                                    mutableState2.setValue(bitcoinQrCodeScannerPresenter$State);
                                    return Unit.INSTANCE;
                            }
                        }
                    };
                    this.L$0 = null;
                    this.label = 1;
                    if (flow.collect(flowCollector2, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i4 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
