package ru.yandex.taxi.logistics.sdk.address_details.impl.ui;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.ps0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.address_details.impl.ui.AddressDetailsViewModel$sendAnalyticsOnShown$1", f = "AddressDetailsViewModel.kt", l = {217}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class AddressDetailsViewModel$sendAnalyticsOnShown$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressDetailsViewModel$sendAnalyticsOnShown$1(e eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddressDetailsViewModel$sendAnalyticsOnShown$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AddressDetailsViewModel$sendAnalyticsOnShown$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            AddressDetailsViewModel$sendAnalyticsOnShown$1$state$1 addressDetailsViewModel$sendAnalyticsOnShown$1$state$1 = new AddressDetailsViewModel$sendAnalyticsOnShown$1$state$1(this.this$0, null);
            this.label = 1;
            obj = kotlinx.coroutines.a.w(10000L, addressDetailsViewModel$sendAnalyticsOnShown$1$state$1, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        ps0 ps0Var = (ps0) obj;
        this.this$0.w.c("Shown", ps0Var != null ? ps0Var.g : null, ps0Var != null ? ps0Var.h : null);
        return zy11.a;
    }
}
