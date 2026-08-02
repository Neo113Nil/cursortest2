package com.squareup.cash.arcade.components;

import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.runtime.MutableState;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import com.squareup.cash.activity.viewmodels.ActivityEmbeddedViewEvent;
import com.squareup.cash.blockers.viewmodels.SetNameViewModel;
import com.squareup.cash.blockers.viewmodels.SetNameViewModel$Event$ShowLoadingScreen;
import com.squareup.cash.card.onboarding.PaymentDeviceCustomizationViewKt;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.moneybot.views.message.ChatMessageUiKt;
import com.squareup.cash.shopping.presenters.ShoppingWebPresenter;
import com.squareup.cash.shopping.viewmodels.FooterButtonStyle;
import com.squareup.cash.shopping.viewmodels.PillStage;
import com.squareup.cash.shopping.viewmodels.WebNavigationFooterViewModel;
import com.squareup.cash.wallet.views.CoreInteractiveCardKt;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class ToastKt$Toast$7$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState $visible$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ToastKt$Toast$7$1(MutableState mutableState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$visible$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$visible$delegate;
        switch (i) {
            case 0:
                return new ToastKt$Toast$7$1(mutableState, continuation, 0);
            case 1:
                return new ToastKt$Toast$7$1(mutableState, continuation, 1);
            case 2:
                return new ToastKt$Toast$7$1(mutableState, continuation, 2);
            case 3:
                return new ToastKt$Toast$7$1(mutableState, continuation, 3);
            case 4:
                return new ToastKt$Toast$7$1(mutableState, continuation, 4);
            case 5:
                return new ToastKt$Toast$7$1(mutableState, continuation, 5);
            case 6:
                return new ToastKt$Toast$7$1(mutableState, continuation, 6);
            case 7:
                return new ToastKt$Toast$7$1(mutableState, continuation, 7);
            case 8:
                return new ToastKt$Toast$7$1(mutableState, continuation, 8);
            case 9:
                return new ToastKt$Toast$7$1(mutableState, continuation, 9);
            case 10:
                return new ToastKt$Toast$7$1(mutableState, continuation, 10);
            case 11:
                return new ToastKt$Toast$7$1(mutableState, continuation, 11);
            case 12:
                return new ToastKt$Toast$7$1(mutableState, continuation, 12);
            case 13:
                return new ToastKt$Toast$7$1(mutableState, continuation, 13);
            case 14:
                return new ToastKt$Toast$7$1(mutableState, continuation, 14);
            case 15:
                return new ToastKt$Toast$7$1(mutableState, continuation, 15);
            case 16:
                return new ToastKt$Toast$7$1(mutableState, continuation, 16);
            case 17:
                return new ToastKt$Toast$7$1(mutableState, continuation, 17);
            default:
                return new ToastKt$Toast$7$1(mutableState, continuation, 18);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 6:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                break;
        }
        return ((ToastKt$Toast$7$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        ActivityEmbeddedViewEvent.Refresh refresh = ActivityEmbeddedViewEvent.Refresh.INSTANCE;
        MutableState mutableState = this.$visible$delegate;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                mutableState.setValue(Boolean.TRUE);
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                mutableState.setValue(null);
                break;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                mutableState.setValue(Boolean.FALSE);
                break;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                mutableState.setValue(EmptySet.INSTANCE);
                break;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                break;
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((UiCallbackModel) mutableState.getValue()).onEvent.invoke(refresh);
                break;
            case 6:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                mutableState.setValue(SetNameViewModel.copy$default((SetNameViewModel) mutableState.getValue(), SetNameViewModel$Event$ShowLoadingScreen.INSTANCE, null, 510));
                break;
            case 7:
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                int i2 = PaymentDeviceCustomizationViewKt.$r8$clinit;
                mutableState.setValue(Boolean.FALSE);
                break;
            case 8:
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                mutableState.setValue(Boolean.FALSE);
                break;
            case 9:
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((UiCallbackModel) mutableState.getValue()).onEvent.invoke(refresh);
                break;
            case 10:
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((UiCallbackModel) mutableState.getValue()).onEvent.invoke(refresh);
                break;
            case 11:
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((UiCallbackModel) mutableState.getValue()).onEvent.invoke(refresh);
                break;
            case 12:
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((UiCallbackModel) mutableState.getValue()).onEvent.invoke(refresh);
                break;
            case 13:
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                mutableState.setValue(Boolean.TRUE);
                break;
            case 14:
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                CubicBezierEasing cubicBezierEasing = ChatMessageUiKt.USER_MESSAGE_ANIMATION_EASING;
                mutableState.setValue(Boolean.TRUE);
                break;
            case 15:
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                mutableState.setValue(Boolean.TRUE);
                break;
            case 16:
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Set set = ShoppingWebPresenter.RESTRICTED_KEYWORDS;
                if (!((ShoppingWebPresenter.State) mutableState.getValue()).onCheckout && ((ShoppingWebPresenter.State) mutableState.getValue()).footerViewModel.buttonStyle.equals(new FooterButtonStyle.FooterButtonStyleV2.SingleUsePaymentButton(PillStage.SUPPillStage.SetUpPlan.INSTANCE))) {
                    mutableState.setValue(ShoppingWebPresenter.State.copy$default((ShoppingWebPresenter.State) mutableState.getValue(), false, null, null, WebNavigationFooterViewModel.copy$default(((ShoppingWebPresenter.State) mutableState.getValue()).footerViewModel, false, false, new FooterButtonStyle.FooterButtonStyleV2.SingleUsePaymentButton(PillStage.Initial.INSTANCE), 11), null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, 536870903));
                }
                break;
            case 17:
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Quat quat = CoreInteractiveCardKt.MESH_EXPIRED_RESTING;
                mutableState.setValue(Boolean.TRUE);
                break;
            default:
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                mutableState.setValue(Boolean.TRUE);
                break;
        }
        return Unit.INSTANCE;
    }
}
