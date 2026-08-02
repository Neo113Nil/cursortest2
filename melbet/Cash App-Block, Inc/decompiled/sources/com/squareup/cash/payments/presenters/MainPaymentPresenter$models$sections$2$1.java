package com.squareup.cash.payments.presenters;

import com.squareup.cash.payments.presenters.CryptoPaymentManager;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function5;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class MainPaymentPresenter$models$sections$2$1 extends SuspendLambda implements Function5 {
    public /* synthetic */ String L$0;
    public /* synthetic */ CryptoPaymentManager.SelectedRecipient L$1;
    public /* synthetic */ boolean Z$0;

    @Override // kotlin.jvm.functions.Function5
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Boolean) obj2).getClass();
        boolean booleanValue = ((Boolean) obj4).booleanValue();
        MainPaymentPresenter$models$sections$2$1 mainPaymentPresenter$models$sections$2$1 = new MainPaymentPresenter$models$sections$2$1(5, (Continuation) obj5);
        mainPaymentPresenter$models$sections$2$1.L$0 = (String) obj;
        mainPaymentPresenter$models$sections$2$1.L$1 = (CryptoPaymentManager.SelectedRecipient) obj3;
        mainPaymentPresenter$models$sections$2$1.Z$0 = booleanValue;
        return mainPaymentPresenter$models$sections$2$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str = this.L$0;
        CryptoPaymentManager.SelectedRecipient selectedRecipient = this.L$1;
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        return new Triple(str, selectedRecipient, Boolean.valueOf(z));
    }
}
