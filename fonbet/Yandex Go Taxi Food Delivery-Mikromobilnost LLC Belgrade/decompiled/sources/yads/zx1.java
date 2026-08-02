package yads;

import defpackage.ak61;
import defpackage.be90;
import defpackage.d171;
import defpackage.gwk0;
import defpackage.i581;
import defpackage.il81;
import defpackage.ny61;
import defpackage.se71;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.uy71;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.b;
import kotlin.collections.a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes7.dex */
public final class zx1 extends SuspendLambda implements wls {
    public ak61 b;
    public Collection c;
    public Iterator d;
    public se71 e;
    public Collection f;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ List i;
    public final /* synthetic */ ak61 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zx1(List list, ak61 ak61Var, Continuation continuation) {
        super(2, continuation);
        this.i = list;
        this.j = ak61Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        zx1 zx1Var = new zx1(this.i, this.j, continuation);
        zx1Var.h = obj;
        return zx1Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((zx1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00ea A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00eb  */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [fse, kotlin.coroutines.Continuation, kotlinx.coroutines.CoroutineStart] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00d2 -> B:5:0x00d7). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        tse tseVar;
        ak61 ak61Var;
        Collection arrayList;
        Iterator it;
        be90 a;
        d171 d171Var;
        il81 il81Var;
        zx1 zx1Var = this;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = zx1Var.g;
        int i2 = 10;
        int i3 = 1;
        ?? r5 = 0;
        Object obj2 = null;
        if (i == 0) {
            b.b(obj);
            tse tseVar2 = (tse) zx1Var.h;
            List list = zx1Var.i;
            tseVar = tseVar2;
            ak61Var = zx1Var.j;
            arrayList = new ArrayList(tcc.n(list, 10));
            it = list.iterator();
            if (it.hasNext()) {
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList = zx1Var.f;
            se71 se71Var = zx1Var.e;
            Iterator it2 = zx1Var.d;
            Collection collection = zx1Var.c;
            ak61 ak61Var2 = zx1Var.b;
            tse tseVar3 = (tse) zx1Var.h;
            b.b(obj);
            tse tseVar4 = tseVar3;
            ak61 ak61Var3 = ak61Var2;
            Iterator it3 = it2;
            se71 se71Var2 = se71Var;
            Collection collection2 = collection;
            Object b = obj;
            List list2 = (List) b;
            List M = a.M(list2);
            if (list2.size() == ((ArrayList) M).size()) {
                return obj2;
            }
            arrayList.add(new se71(se71Var2.a, M, se71Var2.c, se71Var2.d, se71Var2.e, se71Var2.f, se71Var2.g, se71Var2.h, se71Var2.i, se71Var2.j, se71Var2.k));
            i2 = 10;
            i3 = 1;
            zx1Var = this;
            arrayList = collection2;
            it = it3;
            ak61Var = ak61Var3;
            tseVar = tseVar4;
            r5 = 0;
            if (it.hasNext()) {
                return (List) arrayList;
            }
            se71 se71Var3 = (se71) it.next();
            List<uy71> list3 = se71Var3.b;
            ArrayList arrayList2 = new ArrayList(tcc.n(list3, i2));
            for (uy71 uy71Var : list3) {
                ak61Var.c.getClass();
                uy71 uy71Var2 = uy71Var.c instanceof d171 ? uy71Var : r5;
                if (uy71Var2 != null && (d171Var = (d171) uy71Var2.c) != null && (il81Var = d171Var.b) != null) {
                    List list4 = il81Var.a;
                    if (!list4.isEmpty()) {
                        Iterator it4 = list4.iterator();
                        while (it4.hasNext()) {
                            if (((i581) it4.next()).b.a) {
                                a = tje.h(tseVar, r5, r5, new yx1(ak61Var, uy71Var, r5), 3);
                                break;
                            }
                        }
                    }
                }
                a = gwk0.a(uy71Var);
                arrayList2.add(a);
            }
            zx1Var.h = tseVar;
            zx1Var.b = ak61Var;
            zx1Var.c = arrayList;
            zx1Var.d = it;
            zx1Var.e = se71Var3;
            zx1Var.f = arrayList;
            zx1Var.g = i3;
            b = kotlinx.coroutines.a.b(arrayList2, zx1Var);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
            tseVar4 = tseVar;
            ak61Var3 = ak61Var;
            it3 = it;
            se71Var2 = se71Var3;
            collection2 = arrayList;
            obj2 = r5;
            List list22 = (List) b;
            List M2 = a.M(list22);
            if (list22.size() == ((ArrayList) M2).size()) {
            }
        }
    }
}
