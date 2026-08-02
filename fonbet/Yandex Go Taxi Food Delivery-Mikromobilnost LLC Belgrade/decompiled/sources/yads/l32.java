package yads;

import defpackage.cl61;
import defpackage.d171;
import defpackage.dvw;
import defpackage.f771;
import defpackage.ho61;
import defpackage.i581;
import defpackage.il81;
import defpackage.j18;
import defpackage.ny61;
import defpackage.of71;
import defpackage.rr41;
import defpackage.rx71;
import defpackage.se71;
import defpackage.tg81;
import defpackage.vi71;
import defpackage.wls;
import defpackage.ycc;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes7.dex */
public final class l32 extends SuspendLambda implements wls {
    public int b;
    public final /* synthetic */ rx71 c;
    public final /* synthetic */ tg81 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l32(rx71 rx71Var, tg81 tg81Var, Continuation continuation) {
        super(2, continuation);
        this.c = rx71Var;
        this.d = tg81Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new l32(this.c, this.d, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return new l32(this.c, this.d, (Continuation) obj2).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        if (i == 0) {
            b.b(obj);
            rr41 rr41Var = this.c.c;
            tg81 tg81Var = this.d;
            this.b = 1;
            rr41Var.getClass();
            j18 j18Var = new j18(1, dvw.b(this));
            j18Var.u();
            if (((vi71) rr41Var.b) != null) {
                ((cl61) rr41Var.c).getClass();
                List list = tg81Var.a.a;
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ycc.r(f771.a((se71) it.next()), arrayList);
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    il81 il81Var = ((d171) it2.next()).b;
                    List list2 = il81Var != null ? il81Var.a : null;
                    if (list2 == null) {
                        list2 = EmptyList.a;
                    }
                    ycc.r(list2, arrayList2);
                }
                if (!arrayList2.isEmpty()) {
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        if (!((i581) it3.next()).b.G.isEmpty()) {
                            vi71 vi71Var = (vi71) rr41Var.b;
                            ho61 ho61Var = new ho61(j18Var);
                            synchronized (vi71Var.c) {
                                ((ArrayList) vi71Var.w).add(ho61Var);
                                ((of71) vi71Var.b).a(ho61Var);
                                break;
                            }
                        }
                    }
                }
            }
            j18Var.resumeWith(zy11.a);
            Object s = j18Var.s();
            if (s != CoroutineSingletons.COROUTINE_SUSPENDED) {
                s = zy11.a;
            }
            if (s == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
