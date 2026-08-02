package ru.yandex.logistics.sdk.cargo_form.impl.ui;

import defpackage.cu8;
import defpackage.m0i;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o3s;
import defpackage.p3s;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.impl.ui.CargoFormViewModel$1", f = "CargoFormViewModel.kt", l = {HProv.PP_LICENSE}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class CargoFormViewModel$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CargoFormViewModel$1(h hVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CargoFormViewModel$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CargoFormViewModel$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        o3s o3sVar = this.this$0.c;
        this.label = 1;
        p3s p3sVar = (p3s) o3sVar;
        Object b = ((ru.yandex.taxi.logistics.sdk.delivery_launch.domain.a) p3sVar.a).b(new m0i((String) ((cu8) p3sVar.b.b).a.a.getValue()), this);
        if (b != coroutineSingletons) {
            b = zy11Var;
        }
        return b == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
