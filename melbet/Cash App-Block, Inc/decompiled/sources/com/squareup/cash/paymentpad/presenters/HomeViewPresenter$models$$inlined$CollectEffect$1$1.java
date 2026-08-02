package com.squareup.cash.paymentpad.presenters;

import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import com.squareup.cash.activity.screens.ActivityScreen;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.payments.screens.PaymentScreens$HomeScreens$PaymentPad;
import com.squareup.cash.ui.overlays.viewmodels.AlertBannerViewEvent$BannerClicked;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes6.dex */
public final class HomeViewPresenter$models$$inlined$CollectEffect$1$1 implements FlowCollector {
    public final /* synthetic */ UiCallbackModel $alertBannerCallbackModel$inlined;
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ HomeViewPresenter$models$$inlined$CollectEffect$1$1(CoroutineScope coroutineScope, UiCallbackModel uiCallbackModel, int i) {
        this.$r8$classId = i;
        this.$alertBannerCallbackModel$inlined = uiCallbackModel;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        UiCallbackModel uiCallbackModel = this.$alertBannerCallbackModel$inlined;
        switch (i) {
            case 0:
                if (uiCallbackModel != null) {
                    Function1 function1 = uiCallbackModel.onEvent;
                    PaymentScreens$HomeScreens$PaymentPad paymentScreens$HomeScreens$PaymentPad = PaymentScreens$HomeScreens$PaymentPad.INSTANCE;
                    function1.invoke(new AlertBannerViewEvent$BannerClicked(new RoutingParams(paymentScreens$HomeScreens$PaymentPad, null, paymentScreens$HomeScreens$PaymentPad, null, null, null, HttpStatusCode.BAD_GATEWAY_502)));
                }
                break;
            case 1:
                uiCallbackModel.onEvent.invoke(obj);
                break;
            default:
                Function1 function12 = uiCallbackModel.onEvent;
                ActivityScreen activityScreen = ActivityScreen.INSTANCE;
                function12.invoke(new AlertBannerViewEvent$BannerClicked(new RoutingParams(activityScreen, null, activityScreen, null, null, null, HttpStatusCode.BAD_GATEWAY_502)));
                break;
        }
        return Unit.INSTANCE;
    }
}
