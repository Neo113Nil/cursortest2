package com.squareup.cash.payments.backend.real;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.data.js.ZiplineHistoryDataJavaScripter;
import com.squareup.protos.cash.activity.api.v1.PaymentHistoryInputsRow;
import com.squareup.protos.franklin.ui.UiCustomer;
import com.squareup.protos.franklin.ui.UiPayment;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class RealPersonalizationRepository$loadPersonalizationFromMosaic$1$2$paymentHistoryData$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ ZiplineHistoryDataJavaScripter $javaScripter;
    public final /* synthetic */ PaymentHistoryInputsRow $paymentHistoryInputsRow;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String $token;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealPersonalizationRepository$loadPersonalizationFromMosaic$1$2$paymentHistoryData$1(ZiplineHistoryDataJavaScripter ziplineHistoryDataJavaScripter, PaymentHistoryInputsRow paymentHistoryInputsRow, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$javaScripter = ziplineHistoryDataJavaScripter;
        this.$paymentHistoryInputsRow = paymentHistoryInputsRow;
        this.$token = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new RealPersonalizationRepository$loadPersonalizationFromMosaic$1$2$paymentHistoryData$1(this.$javaScripter, this.$paymentHistoryInputsRow, this.$token, continuation, 0);
            default:
                return new RealPersonalizationRepository$loadPersonalizationFromMosaic$1$2$paymentHistoryData$1(this.$javaScripter, this.$paymentHistoryInputsRow, this.$token, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((RealPersonalizationRepository$loadPersonalizationFromMosaic$1$2$paymentHistoryData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        UiCustomer uiCustomer;
        UiCustomer uiCustomer2;
        UiPayment uiPayment;
        int i = this.$r8$classId;
        PaymentHistoryInputsRow paymentHistoryInputsRow = this.$paymentHistoryInputsRow;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 != 0) {
                    if (i2 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                String str = (paymentHistoryInputsRow == null || (uiPayment = paymentHistoryInputsRow.payment) == null) ? null : uiPayment.render_data;
                String str2 = (paymentHistoryInputsRow == null || (uiCustomer2 = paymentHistoryInputsRow.sender) == null) ? null : uiCustomer2.render_data;
                if (paymentHistoryInputsRow != null && (uiCustomer = paymentHistoryInputsRow.recipient) != null) {
                    r4 = uiCustomer.render_data;
                }
                this.label = 1;
                Object paymentHistoryData = this.$javaScripter.paymentHistoryData(str, str2, r4, null, this);
                return paymentHistoryData == coroutineSingletons ? coroutineSingletons : paymentHistoryData;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 != 0) {
                    if (i3 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                UiPayment uiPayment2 = paymentHistoryInputsRow.payment;
                String str3 = uiPayment2 != null ? uiPayment2.render_data : null;
                UiCustomer uiCustomer3 = paymentHistoryInputsRow.sender;
                String str4 = uiCustomer3 != null ? uiCustomer3.render_data : null;
                UiCustomer uiCustomer4 = paymentHistoryInputsRow.recipient;
                r4 = uiCustomer4 != null ? uiCustomer4.render_data : null;
                this.label = 1;
                Object paymentHistoryData2 = this.$javaScripter.paymentHistoryData(str3, str4, r4, null, this);
                return paymentHistoryData2 == coroutineSingletons2 ? coroutineSingletons2 : paymentHistoryData2;
        }
    }
}
