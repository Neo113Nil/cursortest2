package ru.yandex.taxi.ui;

import defpackage.ggj0;
import defpackage.kgj0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sfj0;
import defpackage.tfj0;
import defpackage.tse;
import defpackage.wls;
import defpackage.xfj0;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.collections.a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.requirements.repository.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.ui.RequirementDetailsPresenter$getRequirementDetails$1", f = "RequirementDetailsPresenter.kt", l = {60}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class RequirementDetailsPresenter$getRequirementDetails$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ tfj0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequirementDetailsPresenter$getRequirementDetails$1(tfj0 tfj0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = tfj0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RequirementDetailsPresenter$getRequirementDetails$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RequirementDetailsPresenter$getRequirementDetails$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tfj0 tfj0Var;
        tfj0 tfj0Var2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                b.b(obj);
                tfj0 tfj0Var3 = this.this$0;
                try {
                    e eVar = tfj0Var3.z;
                    String str = tfj0Var3.x;
                    this.L$0 = tfj0Var3;
                    this.L$1 = tfj0Var3;
                    this.label = 1;
                    Object a = eVar.a(str, this);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = a;
                    tfj0Var2 = tfj0Var3;
                } catch (Throwable unused) {
                    tfj0Var = tfj0Var3;
                    tfj0.Kg(tfj0Var);
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                tfj0Var = (tfj0) this.L$1;
                tfj0Var2 = (tfj0) this.L$0;
                try {
                    b.b(obj);
                } catch (Throwable unused2) {
                    tfj0.Kg(tfj0Var);
                    return zy11.a;
                }
            }
            xfj0 xfj0Var = (xfj0) obj;
            ggj0 ggj0Var = tfj0Var2.y;
            ggj0Var.a(xfj0Var);
            if (a.J0(ggj0Var.b()).isEmpty()) {
                tfj0.Kg(tfj0Var2);
            } else {
                ((sfj0) tfj0Var2.Dg()).x4(new kgj0(a.J0(ggj0Var.b()), xfj0Var.d.a));
            }
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
