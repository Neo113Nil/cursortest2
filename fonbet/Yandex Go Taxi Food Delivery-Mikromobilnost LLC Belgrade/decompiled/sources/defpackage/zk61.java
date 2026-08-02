package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.b;
import kotlin.collections.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import yads.f5;
import yads.x22;
import yads.y22;

/* loaded from: classes7.dex */
public final class zk61 {
    public final ike a;
    public final e971 b;
    public final og71 c;
    public final kz61 d;
    public final vb71 e;
    public final ql71 f;
    public final x22 g;

    public zk61(Context context, ike ikeVar, e971 e971Var) {
        og71 og71Var = new og71();
        kz61 kz61Var = new kz61();
        vb71 vb71Var = new vb71(context);
        ql71 ql71Var = new ql71();
        x22 x22Var = x22.w;
        this.a = ikeVar;
        this.b = e971Var;
        this.c = og71Var;
        this.d = kz61Var;
        this.e = vb71Var;
        this.f = ql71Var;
        this.g = x22Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(HashSet hashSet, v881 v881Var, tg81 tg81Var, ContinuationImpl continuationImpl) {
        y22 y22Var;
        int i;
        f5 f5Var;
        v881 v881Var2;
        e971 e971Var;
        ff71 ff71Var;
        d171 d171Var;
        List list;
        List list2;
        if (continuationImpl instanceof y22) {
            y22Var = (y22) continuationImpl;
            int i2 = y22Var.h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                y22Var.h = i2 - Integer.MIN_VALUE;
                Object obj = y22Var.f;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = y22Var.h;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    b.b(obj);
                    if (hashSet.isEmpty()) {
                        return zy11Var;
                    }
                    f5 f5Var2 = f5.p;
                    e971 e971Var2 = this.b;
                    e971Var2.b(f5Var2, null);
                    y22Var.b = v881Var;
                    y22Var.c = tg81Var;
                    y22Var.d = e971Var2;
                    y22Var.e = f5Var2;
                    y22Var.h = 1;
                    vb71 vb71Var = this.e;
                    vb71Var.getClass();
                    j18 j18Var = new j18(1, dvw.b(y22Var));
                    j18Var.u();
                    vb71Var.a(hashSet, new kde(j18Var, 10));
                    Object s = j18Var.s();
                    if (s == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = s;
                    f5Var = f5Var2;
                    v881Var2 = v881Var;
                    e971Var = e971Var2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    f5Var = y22Var.e;
                    e971Var = y22Var.d;
                    tg81Var = y22Var.c;
                    v881Var2 = y22Var.b;
                    b.b(obj);
                }
                ff71Var = (ff71) obj;
                if (ff71Var != null) {
                    Map map = ff71Var.a;
                    d881 d881Var = tg81Var.b;
                    qb71 qb71Var = tg81Var.a;
                    if (!jl40.l(d881Var.t, "loading_on_show") && !jl40.l(d881Var.t, "loading_on_back")) {
                        this.d.getClass();
                        Iterator it = qb71Var.a.iterator();
                        while (it.hasNext()) {
                            List<uy71> list3 = ((se71) it.next()).b;
                            if (!list3.isEmpty()) {
                                for (uy71 uy71Var : list3) {
                                    Object obj2 = uy71Var.c;
                                    if (uy71Var.b.equals("media") && (obj2 instanceof d171) && (list2 = ((d171) obj2).c) != null) {
                                        ArrayList arrayList = new ArrayList();
                                        for (Object obj3 : list2) {
                                            if (og61.a((cu81) obj3, map)) {
                                                arrayList.add(obj3);
                                            }
                                        }
                                        list2.retainAll(arrayList);
                                    }
                                }
                            }
                        }
                        this.c.getClass();
                        for (se71 se71Var : qb71Var.a) {
                            List<uy71> list4 = se71Var.b;
                            if (!list4.isEmpty()) {
                                ArrayList arrayList2 = new ArrayList();
                                for (uy71 uy71Var2 : list4) {
                                    Object obj4 = uy71Var2.c;
                                    String str = uy71Var2.b;
                                    if ("image".equals(str) && (obj4 instanceof cu81)) {
                                        if (og61.a((cu81) obj4, map)) {
                                            arrayList2.add(uy71Var2);
                                        }
                                    } else if ("media".equals(str) && (obj4 instanceof d171) && (list = (d171Var = (d171) obj4).c) != null) {
                                        cu81 cu81Var = (cu81) a.R(list);
                                        il81 il81Var = d171Var.b;
                                        lg71 lg71Var = d171Var.a;
                                        if (il81Var != null || lg71Var != null || (cu81Var != null && og61.a(cu81Var, map))) {
                                            arrayList2.add(uy71Var2);
                                        }
                                    } else {
                                        arrayList2.add(uy71Var2);
                                    }
                                }
                                se71Var.b = arrayList2;
                            }
                        }
                    }
                    v881Var2.b.putAll(map);
                }
                e971Var.a(f5Var);
                return zy11Var;
            }
        }
        y22Var = new y22(this, continuationImpl);
        Object obj5 = y22Var.f;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = y22Var.h;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        ff71Var = (ff71) obj5;
        if (ff71Var != null) {
        }
        e971Var.a(f5Var);
        return zy11Var2;
    }
}
