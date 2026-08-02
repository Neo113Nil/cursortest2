package com.squareup.cash.qrcodes.presenters;

import androidx.compose.runtime.MutableState;
import androidx.core.app.ActivityCompat;
import app.cash.local.presenters.LocalEditorialPresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.permissions.AndroidPermissionManager;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.recipients.data.RealRecipientRepository$suggestions$$inlined$map$1;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.sharesheet.ShareSheetPresenter$models$1$1$5;
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
public final class CashtagQrScanPresenter$models$1$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState $state$delegate;
    public int label;
    public final /* synthetic */ LocalEditorialPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CashtagQrScanPresenter$models$1$1$1(LocalEditorialPresenter localEditorialPresenter, MutableState mutableState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = localEditorialPresenter;
        this.$state$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$state$delegate;
        LocalEditorialPresenter localEditorialPresenter = this.this$0;
        switch (i) {
            case 0:
                return new CashtagQrScanPresenter$models$1$1$1(localEditorialPresenter, mutableState, continuation, 0);
            case 1:
                return new CashtagQrScanPresenter$models$1$1$1(localEditorialPresenter, mutableState, continuation, 1);
            default:
                return new CashtagQrScanPresenter$models$1$1$1(localEditorialPresenter, mutableState, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((CashtagQrScanPresenter$models$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        final MutableState mutableState = this.$state$delegate;
        final LocalEditorialPresenter localEditorialPresenter = this.this$0;
        final int i2 = 1;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow = (Flow) localEditorialPresenter.clock;
                    final int i4 = 0;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.squareup.cash.qrcodes.presenters.CashtagQrScanPresenter$models$1$1$1.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final Object emit(Object obj2, Continuation continuation) {
                            CashtagQrScanPresenter$State copy$default;
                            int i5 = i4;
                            MutableState mutableState2 = mutableState;
                            LocalEditorialPresenter localEditorialPresenter2 = localEditorialPresenter;
                            switch (i5) {
                                case 0:
                                    if (((Boolean) obj2).booleanValue()) {
                                        copy$default = CashtagQrScanPresenter$State.copy$default((CashtagQrScanPresenter$State) mutableState2.getValue(), true, null, 2);
                                    } else {
                                        ActivityCompat.requestPermissions(((AndroidPermissionManager) localEditorialPresenter2.launcher).activity, AndroidPermissionManager.REQUEST_CAMERA, 2);
                                        copy$default = CashtagQrScanPresenter$State.copy$default((CashtagQrScanPresenter$State) mutableState2.getValue(), false, null, 2);
                                    }
                                    mutableState2.setValue(copy$default);
                                    break;
                                default:
                                    ((BetterNavigator.ScreenNavigator) localEditorialPresenter2.navigator).goTo(new ProfileScreens.ErrorScreen(((AndroidStringManager) localEditorialPresenter2.stringManager).get(R.string.profile_qr_camera_permission_denied), null, 14));
                                    mutableState2.setValue(CashtagQrScanPresenter$State.copy$default((CashtagQrScanPresenter$State) mutableState2.getValue(), false, null, 2));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
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
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealRecipientRepository$suggestions$$inlined$map$1 realRecipientRepository$suggestions$$inlined$map$1 = (RealRecipientRepository$suggestions$$inlined$map$1) localEditorialPresenter.screen;
                    FlowCollector flowCollector2 = new FlowCollector() { // from class: com.squareup.cash.qrcodes.presenters.CashtagQrScanPresenter$models$1$1$1.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final Object emit(Object obj2, Continuation continuation) {
                            CashtagQrScanPresenter$State copy$default;
                            int i52 = i2;
                            MutableState mutableState2 = mutableState;
                            LocalEditorialPresenter localEditorialPresenter2 = localEditorialPresenter;
                            switch (i52) {
                                case 0:
                                    if (((Boolean) obj2).booleanValue()) {
                                        copy$default = CashtagQrScanPresenter$State.copy$default((CashtagQrScanPresenter$State) mutableState2.getValue(), true, null, 2);
                                    } else {
                                        ActivityCompat.requestPermissions(((AndroidPermissionManager) localEditorialPresenter2.launcher).activity, AndroidPermissionManager.REQUEST_CAMERA, 2);
                                        copy$default = CashtagQrScanPresenter$State.copy$default((CashtagQrScanPresenter$State) mutableState2.getValue(), false, null, 2);
                                    }
                                    mutableState2.setValue(copy$default);
                                    break;
                                default:
                                    ((BetterNavigator.ScreenNavigator) localEditorialPresenter2.navigator).goTo(new ProfileScreens.ErrorScreen(((AndroidStringManager) localEditorialPresenter2.stringManager).get(R.string.profile_qr_camera_permission_denied), null, 14));
                                    mutableState2.setValue(CashtagQrScanPresenter$State.copy$default((CashtagQrScanPresenter$State) mutableState2.getValue(), false, null, 2));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (realRecipientRepository$suggestions$$inlined$map$1.collect(flowCollector2, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i5 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealRecipientRepository$suggestions$$inlined$map$1 realRecipientRepository$suggestions$$inlined$map$12 = (RealRecipientRepository$suggestions$$inlined$map$1) localEditorialPresenter.responseContextHandler;
                    ShareSheetPresenter$models$1$1$5 shareSheetPresenter$models$1$1$5 = new ShareSheetPresenter$models$1$1$5(localEditorialPresenter, mutableState, 3);
                    this.label = 1;
                    if (realRecipientRepository$suggestions$$inlined$map$12.collect(shareSheetPresenter$models$1$1$5, this) == coroutineSingletons3) {
                        break;
                    }
                } else if (i6 != 1) {
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
