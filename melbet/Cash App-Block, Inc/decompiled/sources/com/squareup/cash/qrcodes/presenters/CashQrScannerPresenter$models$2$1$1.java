package com.squareup.cash.qrcodes.presenters;

import androidx.compose.runtime.MutableState;
import androidx.core.app.ActivityCompat;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.account.screens.Account;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.permissions.AndroidPermissionManager;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.qrcodes.presenters.CashQrScannerPresenter;
import com.squareup.cash.qrcodes.screens.CashQrCodeScanner;
import com.squareup.cash.qrcodes.screens.QrCodeScreen;
import com.squareup.cash.qrcodes.viewmodels.CashQrScannerViewEvent;
import com.squareup.cash.recipients.data.RealRecipientRepository$suggestions$$inlined$map$1;
import com.squareup.cash.sharesheet.ShareSheetPresenter$models$1$1$5;
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

/* loaded from: classes7.dex */
public final class CashQrScannerPresenter$models$2$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState $state$delegate;
    public int label;
    public final /* synthetic */ CashQrScannerPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CashQrScannerPresenter$models$2$1$1(CashQrScannerPresenter cashQrScannerPresenter, MutableState mutableState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = cashQrScannerPresenter;
        this.$state$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$state$delegate;
        CashQrScannerPresenter cashQrScannerPresenter = this.this$0;
        switch (i) {
            case 0:
                return new CashQrScannerPresenter$models$2$1$1(cashQrScannerPresenter, mutableState, continuation, 0);
            case 1:
                return new CashQrScannerPresenter$models$2$1$1(cashQrScannerPresenter, mutableState, continuation, 1);
            default:
                return new CashQrScannerPresenter$models$2$1$1(cashQrScannerPresenter, mutableState, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((CashQrScannerPresenter$models$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        int i2 = 2;
        MutableState mutableState = this.$state$delegate;
        CashQrScannerPresenter cashQrScannerPresenter = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow = cashQrScannerPresenter.cameraPermissionGrants;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(cashQrScannerPresenter, mutableState, 0);
                    this.label = 1;
                    if (flow.collect(anonymousClass1, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CashQrScannerPresenter$special$$inlined$filter$1 cashQrScannerPresenter$special$$inlined$filter$1 = cashQrScannerPresenter.cameraPermissionDenials;
                    AnonymousClass1 anonymousClass12 = new AnonymousClass1(cashQrScannerPresenter, mutableState, i2);
                    this.label = 1;
                    if (cashQrScannerPresenter$special$$inlined$filter$1.collect(anonymousClass12, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i4 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealRecipientRepository$suggestions$$inlined$map$1 realRecipientRepository$suggestions$$inlined$map$1 = cashQrScannerPresenter.cameraEvents;
                    ShareSheetPresenter$models$1$1$5 shareSheetPresenter$models$1$1$5 = new ShareSheetPresenter$models$1$1$5(cashQrScannerPresenter, mutableState, i2);
                    this.label = 1;
                    if (realRecipientRepository$suggestions$$inlined$map$1.collect(shareSheetPresenter$models$1$1$5, this) == coroutineSingletons3) {
                        break;
                    }
                } else if (i5 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: com.squareup.cash.qrcodes.presenters.CashQrScannerPresenter$models$2$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 implements FlowCollector {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ MutableState $state$delegate;
        public final /* synthetic */ CashQrScannerPresenter this$0;

        public AnonymousClass1(CoroutineScope coroutineScope, CashQrScannerPresenter cashQrScannerPresenter, MutableState mutableState) {
            this.$r8$classId = 1;
            this.this$0 = cashQrScannerPresenter;
            this.$state$delegate = mutableState;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, Continuation continuation) {
            CashQrScannerPresenter.State copy$default;
            int i = this.$r8$classId;
            MutableState mutableState = this.$state$delegate;
            CashQrScannerPresenter cashQrScannerPresenter = this.this$0;
            switch (i) {
                case 0:
                    if (((Boolean) obj).booleanValue()) {
                        copy$default = CashQrScannerPresenter.State.copy$default((CashQrScannerPresenter.State) mutableState.getValue(), true, null, null, 14);
                    } else {
                        ActivityCompat.requestPermissions(cashQrScannerPresenter.permissionManager.activity, AndroidPermissionManager.REQUEST_CAMERA, 2);
                        copy$default = CashQrScannerPresenter.State.copy$default((CashQrScannerPresenter.State) mutableState.getValue(), false, null, null, 14);
                    }
                    mutableState.setValue(copy$default);
                    return Unit.INSTANCE;
                case 1:
                    CashQrCodeScanner cashQrCodeScanner = cashQrScannerPresenter.args;
                    BetterNavigator.ScreenNavigator screenNavigator = cashQrScannerPresenter.navigator;
                    CashQrScannerViewEvent cashQrScannerViewEvent = (CashQrScannerViewEvent) obj;
                    if (cashQrScannerViewEvent instanceof CashQrScannerViewEvent.CodeScanned) {
                        mutableState.setValue(CashQrScannerPresenter.State.copy$default((CashQrScannerPresenter.State) mutableState.getValue(), false, null, ((CashQrScannerViewEvent.CodeScanned) cashQrScannerViewEvent).uri, 11));
                    } else if (cashQrScannerViewEvent instanceof CashQrScannerViewEvent.Exit) {
                        screenNavigator.goTo(cashQrCodeScanner.exitScreen);
                    } else {
                        if (!(cashQrScannerViewEvent instanceof CashQrScannerViewEvent.MyCode)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        if (cashQrScannerPresenter.isQrToProfileEnabled) {
                            screenNavigator.goTo(Account.INSTANCE);
                        } else {
                            screenNavigator.goTo(new QrCodeScreen(cashQrCodeScanner.exitScreen));
                        }
                    }
                    return Unit.INSTANCE;
                default:
                    cashQrScannerPresenter.navigator.goTo(new ProfileScreens.ErrorScreen(cashQrScannerPresenter.stringManager.get(R.string.profile_qr_camera_permission_denied), null, 14));
                    mutableState.setValue(CashQrScannerPresenter.State.copy$default((CashQrScannerPresenter.State) mutableState.getValue(), false, null, null, 14));
                    return Unit.INSTANCE;
            }
        }

        public /* synthetic */ AnonymousClass1(CashQrScannerPresenter cashQrScannerPresenter, MutableState mutableState, int i) {
            this.$r8$classId = i;
            this.this$0 = cashQrScannerPresenter;
            this.$state$delegate = mutableState;
        }
    }
}
