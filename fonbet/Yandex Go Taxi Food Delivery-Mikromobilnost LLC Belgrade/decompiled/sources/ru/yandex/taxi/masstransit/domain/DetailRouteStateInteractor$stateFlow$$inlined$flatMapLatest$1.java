package ru.yandex.taxi.masstransit.domain;

import defpackage.b3v0;
import defpackage.fj40;
import defpackage.ha2;
import defpackage.hnm0;
import defpackage.jm30;
import defpackage.l540;
import defpackage.lj40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o1j;
import defpackage.r440;
import defpackage.s6b1;
import defpackage.su30;
import defpackage.tcc;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.w1u;
import defpackage.w511;
import defpackage.ycc;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.domain.DetailRouteStateInteractor$stateFlow$$inlined$flatMapLatest$1", f = "DetailRouteStateInteractor.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class DetailRouteStateInteractor$stateFlow$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailRouteStateInteractor$stateFlow$$inlined$flatMapLatest$1(Continuation continuation, c cVar) {
        super(3, continuation);
        this.this$0 = cVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        DetailRouteStateInteractor$stateFlow$$inlined$flatMapLatest$1 detailRouteStateInteractor$stateFlow$$inlined$flatMapLatest$1 = new DetailRouteStateInteractor$stateFlow$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0);
        detailRouteStateInteractor$stateFlow$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        detailRouteStateInteractor$stateFlow$$inlined$flatMapLatest$1.L$1 = obj2;
        return detailRouteStateInteractor$stateFlow$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v7, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Continuation continuation;
        long j;
        ?? r5;
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Continuation continuation2 = null;
        if (i == 0) {
            kotlin.b.b(obj);
            o1j o1jVar = (o1j) obj2;
            c cVar = this.this$0;
            tpr a = cVar.c.a();
            su30 su30Var = o1jVar.a;
            Long l = o1jVar.b.d;
            long longValue = l != null ? l.longValue() : cVar.g;
            List list = su30Var.a;
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : list) {
                if (obj3 instanceof fj40) {
                    arrayList.add(obj3);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                fj40 fj40Var = (fj40) it.next();
                if (fj40Var instanceof jm30) {
                    List<w1u> list2 = ((jm30) fj40Var).a;
                    r5 = new ArrayList(tcc.n(list2, 10));
                    for (w1u w1uVar : list2) {
                        Continuation continuation3 = continuation2;
                        long j2 = longValue;
                        String str = w1uVar.e;
                        if (str == null && (str = s6b1.d(fj40Var)) == null) {
                            str = "";
                        }
                        r5.add(new hnm0(str, w1uVar.f));
                        continuation2 = continuation3;
                        longValue = j2;
                    }
                    continuation = continuation2;
                    j = longValue;
                } else {
                    continuation = continuation2;
                    j = longValue;
                    if (fj40Var instanceof r440) {
                        List<b3v0> list3 = ((r440) fj40Var).a;
                        ArrayList arrayList3 = new ArrayList(tcc.n(list3, 10));
                        for (b3v0 b3v0Var : list3) {
                            String str2 = b3v0Var.c;
                            if (str2 == null && (str2 = s6b1.d(fj40Var)) == null) {
                                str2 = "";
                            }
                            arrayList3.add(new hnm0(str2, b3v0Var.d));
                        }
                        r5 = arrayList3;
                    } else if (fj40Var instanceof lj40) {
                        String d = s6b1.d(fj40Var);
                        r5 = Collections.singletonList(new hnm0(d != null ? d : "", ((lj40) fj40Var).e));
                    } else {
                        if (!(fj40Var instanceof l540)) {
                            w511.b();
                            return continuation;
                        }
                        r5 = EmptyList.a;
                    }
                }
                ycc.r((Iterable) r5, arrayList2);
                continuation2 = continuation;
                longValue = j;
            }
            Continuation continuation4 = continuation2;
            ha2 n = kotlinx.coroutines.flow.e.n(a, kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.I(com.yandex.go.coroutines.b.l(longValue), new DetailRouteStateInteractor$scheduleFlow$1(cVar, arrayList2, continuation4))), cVar.b.c(o1jVar.a), new DetailRouteStateInteractor$localStateFlow$1(o1jVar, continuation4));
            this.L$0 = continuation4;
            this.L$1 = continuation4;
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(n, vprVar, this) == coroutineSingletons) {
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
