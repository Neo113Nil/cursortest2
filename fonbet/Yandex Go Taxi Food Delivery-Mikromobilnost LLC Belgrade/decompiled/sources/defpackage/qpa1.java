package defpackage;

import androidx.compose.runtime.f;
import com.yandex.go.urbanads.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.builders.ListBuilder;

/* loaded from: classes11.dex */
public abstract class qpa1 {
    public static final void a(xc1 xc1Var, b bVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-849956056);
        int i2 = (btsVar.k(xc1Var) ? 4 : 2) | i | (btsVar.e(bVar) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            wc1 wc1Var = xc1Var.e;
            btsVar.e0(-763977187);
            b(xc1Var.e, bVar, btsVar, i2 & 112);
            btsVar.t(false);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new q0v(xc1Var, bVar, i, 6);
        }
    }

    public static final void b(wc1 wc1Var, b bVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1320804102);
        int i2 = 4;
        int i3 = (btsVar.k(wc1Var) ? 4 : 2) | i | (btsVar.e(bVar) ? 32 : 16);
        int i4 = 1;
        int i5 = 7;
        if (btsVar.V(i3 & 1, (i3 & 19) != 18)) {
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = f.j(null);
                btsVar.o0(Q);
            }
            oz40 oz40Var = (oz40) Q;
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                Q2 = f.j(new wu60(0L));
                btsVar.o0(Q2);
            }
            oz40 oz40Var2 = (oz40) Q2;
            f530 u = ljs0.u(ljs0.c(c530.a, 1.0f), null, 3);
            Object Q3 = btsVar.Q();
            if (Q3 == o430Var) {
                Q3 = new hc1(oz40Var2, oz40Var, i4);
                btsVar.o0(Q3);
            }
            f530 y = eja1.y(u, (tls) Q3);
            boolean e = btsVar.e(bVar) | ((i3 & 14) == 4);
            Object Q4 = btsVar.Q();
            if (e || Q4 == o430Var) {
                Q4 = new q(i5, bVar, wc1Var, oz40Var);
                btsVar.o0(Q4);
            }
            tls tlsVar = (tls) Q4;
            Object Q5 = btsVar.Q();
            if (Q5 == o430Var) {
                Q5 = new w5(i2, oz40Var);
                btsVar.o0(Q5);
            }
            androidx.compose.ui.viewinterop.b.b(tlsVar, y, null, (tls) Q5, null, btsVar, 3120, 20);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new q0v(wc1Var, bVar, i, i5);
        }
    }

    public static final akk0 c(xss0 xss0Var, String str, List list) {
        nqs0 nqs0Var;
        ibk0 a = ijk0.a(xss0Var.d);
        tss0 tss0Var = xss0Var.c;
        ibk0 ibk0Var = null;
        mss0 mss0Var = tss0Var instanceof mss0 ? (mss0) tss0Var : null;
        if (mss0Var != null && (nqs0Var = mss0Var.c) != null) {
            ibk0Var = ijk0.a(nqs0Var);
        }
        ibk0[] ibk0VarArr = (ibk0[]) j73.A(new ibk0[]{a, ibk0Var}).toArray(new ibk0[0]);
        return e(str, list, (nqs0[]) Arrays.copyOf(ibk0VarArr, ibk0VarArr.length));
    }

    public static final boolean d(double d) {
        return Math.abs(d) < 1.0E-6d;
    }

    public static final akk0 e(String str, List list, nqs0... nqs0VarArr) {
        akk0 akk0Var = new akk0(0);
        LinkedHashMap linkedHashMap = akk0Var.c;
        linkedHashMap.put("analytics_id", str);
        linkedHashMap.put("slot_item_actions", Arrays.asList(nqs0VarArr));
        linkedHashMap.put("elements", f(list));
        return akk0Var;
    }

    public static final ListBuilder f(Collection collection) {
        ListBuilder a = rcc.a();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zjk0 zjk0Var = (zjk0) it.next();
            a.add(zjk0Var);
            if (zjk0Var instanceof kjk0) {
                a.addAll(f(((kjk0) zjk0Var).getChildren()));
            }
        }
        return a.j();
    }

    public static r691 g(w491 w491Var, cr71 cr71Var, ArrayList arrayList, boolean z) {
        r691 r691Var;
        cwa1.f(1, "reduce", arrayList);
        cwa1.g(2, "reduce", arrayList);
        r691 b = ((p791) cr71Var.c).b(cr71Var, (r691) arrayList.get(0));
        if (!(b instanceof s591)) {
            ny61.g("Callback should be a method");
            return null;
        }
        if (arrayList.size() == 2) {
            r691Var = ((p791) cr71Var.c).b(cr71Var, (r691) arrayList.get(1));
            if (r691Var instanceof g591) {
                ny61.g("Failed to parse initial value");
                return null;
            }
        } else {
            if (w491Var.j() == 0) {
                ny61.r("Empty array with no initial value error");
                return null;
            }
            r691Var = null;
        }
        s591 s591Var = (s591) b;
        int j = w491Var.j();
        int i = z ? 0 : j - 1;
        int i2 = z ? j - 1 : 0;
        int i3 = true == z ? 1 : -1;
        if (r691Var == null) {
            r691Var = w491Var.k(i);
            i += i3;
        }
        while ((i2 - i) * i3 >= 0) {
            if (w491Var.m(i)) {
                r691Var = s591Var.c(cr71Var, Arrays.asList(r691Var, w491Var.k(i), new n591(Double.valueOf(i)), w491Var));
                if (r691Var instanceof g591) {
                    ny61.r("Reduce operation failed");
                    return null;
                }
                i += i3;
            } else {
                i += i3;
            }
        }
        return r691Var;
    }

    public static w491 h(w491 w491Var, cr71 cr71Var, o691 o691Var, Boolean bool, Boolean bool2) {
        w491 w491Var2 = new w491();
        Iterator i = w491Var.i();
        while (i.hasNext()) {
            int intValue = ((Integer) i.next()).intValue();
            if (w491Var.m(intValue)) {
                r691 c = o691Var.c(cr71Var, Arrays.asList(w491Var.k(intValue), new n591(Double.valueOf(intValue)), w491Var));
                if (c.zze().equals(bool)) {
                    break;
                }
                if (bool2 == null || c.zze().equals(bool2)) {
                    w491Var2.l(intValue, c);
                }
            }
        }
        return w491Var2;
    }
}
