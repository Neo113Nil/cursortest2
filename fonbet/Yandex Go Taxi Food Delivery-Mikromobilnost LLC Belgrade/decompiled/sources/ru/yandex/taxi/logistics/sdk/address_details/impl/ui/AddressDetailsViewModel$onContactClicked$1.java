package ru.yandex.taxi.logistics.sdk.address_details.impl.ui;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.ot0;
import defpackage.tpr;
import defpackage.tse;
import defpackage.vu0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.address_details.impl.ui.AddressDetailsViewModel$onContactClicked$1", f = "AddressDetailsViewModel.kt", l = {156}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class AddressDetailsViewModel$onContactClicked$1 extends SuspendLambda implements wls {
    final /* synthetic */ int $addressIndex;
    final /* synthetic */ String $editFieldName;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressDetailsViewModel$onContactClicked$1(e eVar, int i, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$addressIndex = i;
        this.$editFieldName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddressDetailsViewModel$onContactClicked$1(this.this$0, this.$addressIndex, this.$editFieldName, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AddressDetailsViewModel$onContactClicked$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr tprVar = this.this$0.A;
            this.label = 1;
            obj = kotlinx.coroutines.flow.e.A(tprVar, this);
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
        ot0 ot0Var = (ot0) obj;
        vu0 vu0Var = ot0Var != null ? ot0Var.f : null;
        this.this$0.b.c.invoke(Integer.valueOf(this.$addressIndex), vu0Var, this.$editFieldName);
        return zy11.a;
    }
}
