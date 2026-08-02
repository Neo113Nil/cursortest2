package defpackage;

import com.google.android.gms.internal.measurement.a0;
import com.google.android.gms.internal.measurement.d0;
import com.google.android.gms.internal.measurement.g;
import com.google.android.gms.internal.measurement.j;
import com.google.android.gms.internal.measurement.l0;
import com.google.android.gms.internal.measurement.m0;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class zvb1 {
    public final String a;
    public final boolean b;
    public final l0 c;
    public final BitSet d;
    public final BitSet e;
    public final w53 f;
    public final w53 g;
    public final /* synthetic */ r491 h;

    public /* synthetic */ zvb1(r491 r491Var, String str, l0 l0Var, BitSet bitSet, BitSet bitSet2, w53 w53Var, w53 w53Var2) {
        this.h = r491Var;
        this.a = str;
        this.d = bitSet;
        this.e = bitSet2;
        this.f = w53Var;
        this.g = new w53();
        Iterator it = ((s53) w53Var2.keySet()).iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) w53Var2.get(num));
            this.g.put(num, arrayList);
        }
        this.b = false;
        this.c = l0Var;
    }

    public final void a(a491 a491Var) {
        int s;
        switch (a491Var.g) {
            case 0:
                s = ((g) a491Var.i).s();
                break;
            default:
                s = ((j) a491Var.i).s();
                break;
        }
        boolean z = true;
        if (a491Var.c != null) {
            this.e.set(s, true);
        }
        Boolean bool = a491Var.d;
        if (bool != null) {
            this.d.set(s, bool.booleanValue());
        }
        if (a491Var.e != null) {
            Integer valueOf = Integer.valueOf(s);
            w53 w53Var = this.f;
            Long l = (Long) w53Var.get(valueOf);
            long longValue = a491Var.e.longValue() / 1000;
            if (l == null || longValue > l.longValue()) {
                w53Var.put(valueOf, Long.valueOf(longValue));
            }
        }
        if (a491Var.f != null) {
            Integer valueOf2 = Integer.valueOf(s);
            w53 w53Var2 = this.g;
            List list = (List) w53Var2.get(valueOf2);
            if (list == null) {
                list = new ArrayList();
                w53Var2.put(valueOf2, list);
            }
            boolean z2 = false;
            switch (a491Var.g) {
                case 0:
                    z = false;
                    break;
            }
            if (z) {
                list.clear();
            }
            cfb1.a();
            com.google.android.gms.measurement.internal.g gVar = (com.google.android.gms.measurement.internal.g) this.h.b;
            j691 j691Var = gVar.w;
            gw91 gw91Var = nw91.F0;
            String str = this.a;
            if (j691Var.Qg(str, gw91Var)) {
                switch (a491Var.g) {
                    case 0:
                        z2 = ((g) a491Var.i).x();
                        break;
                }
                if (z2) {
                    list.clear();
                }
            }
            cfb1.a();
            boolean Qg = gVar.w.Qg(str, gw91Var);
            Long l2 = a491Var.f;
            if (!Qg) {
                list.add(Long.valueOf(l2.longValue() / 1000));
                return;
            }
            Long valueOf3 = Long.valueOf(l2.longValue() / 1000);
            if (list.contains(valueOf3)) {
                return;
            }
            list.add(valueOf3);
        }
    }

    public final a0 b(int i) {
        ArrayList arrayList;
        List list;
        a5a1 y = a0.y();
        y.d();
        ((a0) y.b).z(i);
        y.d();
        ((a0) y.b).C(this.b);
        l0 l0Var = this.c;
        if (l0Var != null) {
            y.d();
            ((a0) y.b).B(l0Var);
        }
        dca1 z = l0.z();
        z.l(f3a1.oh(this.d));
        z.i(f3a1.oh(this.e));
        w53 w53Var = this.f;
        if (w53Var == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(w53Var.c);
            for (Integer num : w53Var.keySet()) {
                int intValue = num.intValue();
                Long l = (Long) w53Var.get(num);
                if (l != null) {
                    k7a1 v = d0.v();
                    v.d();
                    ((d0) v.b).w(intValue);
                    long longValue = l.longValue();
                    v.d();
                    ((d0) v.b).x(longValue);
                    arrayList2.add((d0) v.f());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            z.o(arrayList);
        }
        w53 w53Var2 = this.g;
        if (w53Var2 == null) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList3 = new ArrayList(w53Var2.c);
            Iterator it = ((s53) w53Var2.keySet()).iterator();
            while (it.hasNext()) {
                Integer num2 = (Integer) it.next();
                pca1 w = m0.w();
                int intValue2 = num2.intValue();
                w.d();
                ((m0) w.b).x(intValue2);
                List list2 = (List) w53Var2.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    w.d();
                    ((m0) w.b).y(list2);
                }
                arrayList3.add((m0) w.f());
            }
            list = arrayList3;
        }
        z.q(list);
        y.d();
        ((a0) y.b).A((l0) z.f());
        return (a0) y.f();
    }

    public final /* synthetic */ BitSet c() {
        return this.d;
    }

    public /* synthetic */ zvb1(r491 r491Var, String str) {
        this.h = r491Var;
        this.a = str;
        this.b = true;
        this.d = new BitSet();
        this.e = new BitSet();
        this.f = new w53();
        this.g = new w53();
    }
}
