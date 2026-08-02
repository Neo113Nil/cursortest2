package ru.yandex.taxi.costcenters.fields;

import defpackage.lwe;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lvpr;", "", "Ljwe;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.costcenters.fields.CostCenterFieldsInteractor$getCostCenterFieldsFlow$2", f = "CostCenterFieldsInteractor.kt", l = {34}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class CostCenterFieldsInteractor$getCostCenterFieldsFlow$2 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $validateFields;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ lwe this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CostCenterFieldsInteractor$getCostCenterFieldsFlow$2(lwe lweVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = lweVar;
        this.$validateFields = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CostCenterFieldsInteractor$getCostCenterFieldsFlow$2 costCenterFieldsInteractor$getCostCenterFieldsFlow$2 = new CostCenterFieldsInteractor$getCostCenterFieldsFlow$2(this.this$0, this.$validateFields, continuation);
        costCenterFieldsInteractor$getCostCenterFieldsFlow$2.L$0 = obj;
        return costCenterFieldsInteractor$getCostCenterFieldsFlow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CostCenterFieldsInteractor$getCostCenterFieldsFlow$2) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ArrayList a = this.this$0.a(this.$validateFields);
            this.L$0 = null;
            this.label = 1;
            if (vprVar.emit(a, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
