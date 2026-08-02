package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class u1a extends uif implements Function0 {
    public final /* synthetic */ g23 r;
    public final /* synthetic */ f23 s;
    public final /* synthetic */ View t;
    public final /* synthetic */ List u;
    public final /* synthetic */ List v;
    public final /* synthetic */ w1a w;
    public final /* synthetic */ jc8 x;
    public final /* synthetic */ xzb y;
    public final /* synthetic */ gc8 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1a(g23 g23Var, f23 f23Var, View view, List list, List list2, w1a w1aVar, jc8 jc8Var, xzb xzbVar, gc8 gc8Var) {
        super(0);
        this.r = g23Var;
        this.s = f23Var;
        this.t = view;
        this.u = list;
        this.v = list2;
        this.w = w1aVar;
        this.x = jc8Var;
        this.y = xzbVar;
        this.z = gc8Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0181 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0155 A[SYNTHETIC] */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        xzb xzbVar;
        int i;
        f23 f23Var = this.s;
        w1a w1aVar = this.w;
        View view = this.t;
        this.r.d();
        try {
            int d = w1aVar.a.d(view);
            WeakHashMap weakHashMap = w1aVar.g;
            jc8 jc8Var = this.x;
            if (d > 0) {
                weakHashMap.put(view, jc8Var);
            } else {
                weakHashMap.remove(view);
            }
            if (!w1aVar.l) {
                w1aVar.l = true;
                w1aVar.c.post(w1aVar.m);
            }
            List list = this.u;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = list.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                xzbVar = this.y;
                if (!hasNext) {
                    break;
                }
                Object next = it.next();
                Long valueOf = Long.valueOf(((Number) y2x.x((l1a) next).a(xzbVar)).longValue());
                Object obj = linkedHashMap.get(valueOf);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(valueOf, obj);
                }
                ((List) obj).add(next);
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                long longValue = ((Number) entry.getKey()).longValue();
                List list2 = (List) entry.getValue();
                ArrayList arrayList = new ArrayList(list2.size());
                for (Object obj2 : list2) {
                    if (w1aVar.e(this.z, this.y, this.t, (l1a) obj2, d, w1aVar.d)) {
                        arrayList.add(obj2);
                    }
                }
                if (arrayList.isEmpty()) {
                    i = d;
                } else {
                    i = d;
                    w1a.a(w1aVar, this.z, this.y, this.t, arrayList, longValue, w1aVar.d);
                }
                d = i;
            }
            int i2 = d;
            List list3 = this.v;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj3 : list3) {
                Long valueOf2 = Long.valueOf(((Number) y2x.x((tw8) obj3).a(xzbVar)).longValue());
                Object obj4 = linkedHashMap2.get(valueOf2);
                if (obj4 == null) {
                    obj4 = new ArrayList();
                    linkedHashMap2.put(valueOf2, obj4);
                }
                ((List) obj4).add(obj3);
            }
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                long longValue2 = ((Number) entry2.getKey()).longValue();
                List<tw8> list4 = (List) entry2.getValue();
                boolean z = false;
                for (tw8 tw8Var : list4) {
                    boolean z2 = z;
                    boolean z3 = ((long) i2) > ((Number) tw8Var.k.a(xzbVar)).longValue();
                    if (!z2 && !z3) {
                        z = false;
                        if (z3) {
                            WeakHashMap weakHashMap2 = w1aVar.k;
                            Object obj5 = weakHashMap2.get(view);
                            if (obj5 == null) {
                                obj5 = new LinkedHashSet();
                                weakHashMap2.put(view, obj5);
                            }
                            ((Set) obj5).add(tw8Var);
                        }
                    }
                    z = true;
                    if (z3) {
                    }
                }
                if (z) {
                    w1aVar.j.put(view, jc8Var);
                }
                ArrayList arrayList2 = new ArrayList(list4.size());
                for (Object obj6 : list4) {
                    int i3 = i2;
                    if (w1aVar.e(this.z, this.y, this.t, (tw8) obj6, i3, w1aVar.e)) {
                        arrayList2.add(obj6);
                    }
                    i2 = i3;
                }
                int i4 = i2;
                if (!arrayList2.isEmpty()) {
                    w1a.a(w1aVar, this.z, this.y, this.t, arrayList2, longValue2, w1aVar.e);
                }
                i2 = i4;
            }
            g23.b(f23Var);
            return Unit.a;
        } catch (Throwable th) {
            g23.b(f23Var);
            throw th;
        }
    }
}
