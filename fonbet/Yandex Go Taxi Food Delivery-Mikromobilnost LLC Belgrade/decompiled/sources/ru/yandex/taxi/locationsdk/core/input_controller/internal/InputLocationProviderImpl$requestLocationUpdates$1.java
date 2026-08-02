package ru.yandex.taxi.locationsdk.core.input_controller.internal;

import defpackage.eci0;
import defpackage.gph;
import defpackage.ha2;
import defpackage.jdt0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tpr;
import defpackage.wls;
import defpackage.wsr0;
import defpackage.xsr0;
import defpackage.y6f0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.internal.h;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly6f0;", "Lk7z;", "Lzy11;", "<anonymous>", "(Ly6f0;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "ru.yandex.taxi.locationsdk.core.input_controller.internal.InputLocationProviderImpl$requestLocationUpdates$1", f = "InputLocationProvider.kt", l = {59}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class InputLocationProviderImpl$requestLocationUpdates$1 extends SuspendLambda implements wls {
    final /* synthetic */ tpr $priorities;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputLocationProviderImpl$requestLocationUpdates$1(tpr tprVar, d dVar, Continuation continuation) {
        super(2, continuation);
        this.$priorities = tprVar;
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        InputLocationProviderImpl$requestLocationUpdates$1 inputLocationProviderImpl$requestLocationUpdates$1 = new InputLocationProviderImpl$requestLocationUpdates$1(this.$priorities, this.this$0, continuation);
        inputLocationProviderImpl$requestLocationUpdates$1.L$0 = obj;
        return inputLocationProviderImpl$requestLocationUpdates$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((InputLocationProviderImpl$requestLocationUpdates$1) create((y6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        y6f0 y6f0Var = (y6f0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr tprVar = this.$priorities;
            xsr0.a.getClass();
            eci0 O = kotlinx.coroutines.flow.e.O(tprVar, y6f0Var, wsr0.c, 1);
            d dVar = this.this$0;
            List<jdt0> list = dVar.a;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            for (jdt0 jdt0Var : list) {
                tpr t = kotlinx.coroutines.flow.e.t(new ha2(5, O, jdt0Var));
                ru.yandex.taxi.locationsdk.core.source_location_provider.internal.b bVar = (ru.yandex.taxi.locationsdk.core.source_location_provider.internal.b) jdt0Var;
                arrayList.add(ru.yandex.taxi.locationsdk.core.utils.a.b(bVar.b(t), dVar.c, new Pair("sources", bVar.d.toString())));
            }
            h J = kotlinx.coroutines.flow.e.J(arrayList);
            gph gphVar = new gph(y6f0Var, 1);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (J.collect(gphVar, this) == coroutineSingletons) {
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
