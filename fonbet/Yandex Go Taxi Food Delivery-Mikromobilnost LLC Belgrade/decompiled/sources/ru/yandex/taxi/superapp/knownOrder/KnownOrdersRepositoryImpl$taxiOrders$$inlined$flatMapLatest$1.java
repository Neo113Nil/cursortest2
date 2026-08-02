package ru.yandex.taxi.superapp.knownOrder;

import defpackage.g92;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.tcc;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.object.DriveState;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.superapp.knownOrder.KnownOrdersRepositoryImpl$taxiOrders$$inlined$flatMapLatest$1", f = "KnownOrdersRepositoryImpl.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes10.dex */
public final class KnownOrdersRepositoryImpl$taxiOrders$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ boolean $includePending$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ u this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KnownOrdersRepositoryImpl$taxiOrders$$inlined$flatMapLatest$1(Continuation continuation, u uVar, boolean z) {
        super(3, continuation);
        this.this$0 = uVar;
        this.$includePending$inlined = z;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        KnownOrdersRepositoryImpl$taxiOrders$$inlined$flatMapLatest$1 knownOrdersRepositoryImpl$taxiOrders$$inlined$flatMapLatest$1 = new KnownOrdersRepositoryImpl$taxiOrders$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0, this.$includePending$inlined);
        knownOrdersRepositoryImpl$taxiOrders$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        knownOrdersRepositoryImpl$taxiOrders$$inlined$flatMapLatest$1.L$1 = obj2;
        return knownOrdersRepositoryImpl$taxiOrders$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tpr nVar;
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            List list = (List) obj2;
            u uVar = this.this$0;
            boolean z = this.$includePending$inlined;
            uVar.getClass();
            if (list.isEmpty()) {
                nVar = new g92(2, EmptyList.a);
            } else {
                List<o2y0> list2 = list;
                ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                for (o2y0 o2y0Var : list2) {
                    arrayList.add((o2y0Var.c() == DriveState.PREORDER || !o2y0Var.b().C()) ? new m(new kotlinx.coroutines.flow.n(o2y0Var.a(), new KnownOrdersRepositoryImpl$observeOrderWithVersion$1(o2y0Var, null)), z) : new g92(2, o2y0Var.b()));
                }
                nVar = new n((tpr[]) kotlin.collections.a.J0(arrayList).toArray(new tpr[0]), z);
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(nVar, vprVar, this) == coroutineSingletons) {
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
