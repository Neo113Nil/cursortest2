package com.squareup.cash.payments.backend.api;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.data.js.ZiplineHistoryDataJavaScripter;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.Role;
import com.squareup.protos.franklin.common.Orientation;
import com.squareup.protos.franklin.ui.PaymentHistoryData;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function14;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RenderedPayment$Companion$mapper$1 extends SuspendLambda implements Function14 {
    public final /* synthetic */ ZiplineHistoryDataJavaScripter $javaScripter;
    public /* synthetic */ String L$0;
    public /* synthetic */ Long L$1;
    public /* synthetic */ Money L$11;
    public /* synthetic */ String L$12;
    public String L$13;
    public Money L$14;
    public String L$15;
    public Role L$16;
    public Orientation L$17;
    public /* synthetic */ CurrencyCode L$2;
    public /* synthetic */ String L$3;
    public /* synthetic */ Role L$4;
    public /* synthetic */ Orientation L$5;
    public /* synthetic */ String L$6;
    public /* synthetic */ String L$7;
    public /* synthetic */ String L$8;
    public /* synthetic */ String L$9;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RenderedPayment$Companion$mapper$1(ZiplineHistoryDataJavaScripter ziplineHistoryDataJavaScripter, Continuation continuation) {
        super(14, continuation);
        this.$javaScripter = ziplineHistoryDataJavaScripter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object paymentHistoryData;
        Money money;
        Role role;
        Orientation orientation;
        String str;
        String str2 = this.L$0;
        Long l = this.L$1;
        CurrencyCode currencyCode = this.L$2;
        String str3 = this.L$3;
        Role role2 = this.L$4;
        Orientation orientation2 = this.L$5;
        String str4 = this.L$6;
        String str5 = this.L$7;
        String str6 = this.L$8;
        String str7 = this.L$9;
        Money money2 = this.L$11;
        String str8 = this.L$12;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Money money3 = new Money(new Long(l != null ? l.longValue() : 0L), currencyCode == null ? CurrencyCode.USD : currencyCode, 4);
            role2.getClass();
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.L$6 = null;
            this.L$7 = null;
            this.L$8 = null;
            this.L$9 = null;
            this.L$11 = money2;
            this.L$12 = str8;
            this.L$13 = str2;
            this.L$14 = money3;
            this.L$15 = str3;
            this.L$16 = role2;
            this.L$17 = orientation2;
            this.label = 1;
            paymentHistoryData = this.$javaScripter.paymentHistoryData(str4, str5, str6, str7, this);
            if (paymentHistoryData == coroutineSingletons) {
                return coroutineSingletons;
            }
            money = money3;
            role = role2;
            orientation = orientation2;
            str = str3;
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Orientation orientation3 = this.L$17;
            Role role3 = this.L$16;
            String str9 = this.L$15;
            Money money4 = this.L$14;
            str2 = this.L$13;
            SafeTrace.throwOnFailure(obj);
            money = money4;
            paymentHistoryData = obj;
            str = str9;
            role = role3;
            orientation = orientation3;
        }
        return new RenderedPayment(str2, money, str, role, orientation, (PaymentHistoryData) paymentHistoryData, money2, str8);
    }
}
