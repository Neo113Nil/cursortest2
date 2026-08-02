package defpackage;

import com.yandex.passport.sloth.ui.dependencies.m;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class pq5 {
    public static final csj a = new csj("provider");
    public static final csj b = new csj("provider");
    public static final csj c = new csj("compositionLocalMap");
    public static final csj d = new csj("providers");
    public static final csj e = new csj("reference");
    public static final mj f = new mj(5);

    public static final void a(int i, int i2, List list) {
        int g = g(list, i);
        if (g < 0) {
            g = -(g + 1);
        }
        while (g < list.size() && ((fye) list.get(g)).b < i2) {
            list.remove(g);
        }
    }

    public static final void b(exq exqVar, ArrayList arrayList, int i) {
        boolean j = exqVar.j(i);
        int[] iArr = exqVar.b;
        if (j) {
            arrayList.add(exqVar.l(i));
            return;
        }
        int i2 = iArr[(i * 5) + 3] + i;
        for (int i3 = i + 1; i3 < i2; i3 += iArr[(i3 * 5) + 3]) {
            b(exqVar, arrayList, i3);
        }
    }

    public static final void c(@NotNull String str) {
        throw new pp5(hrg.q("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    @NotNull
    public static final Void d(@NotNull String str) {
        throw new pp5(hrg.q("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final void e(oxq oxqVar, m mVar) {
        int i;
        int[] iArr = oxqVar.b;
        int i2 = oxqVar.t;
        int f2 = oxqVar.f(iArr, oxqVar.q(oxqVar.s(i2) + i2));
        for (int f3 = oxqVar.f(oxqVar.b, oxqVar.q(oxqVar.t)); f3 < f2; f3++) {
            Object obj = oxqVar.c[oxqVar.g(f3)];
            int i3 = -1;
            if (obj instanceof op5) {
                mVar.D(oxqVar.o() - f3, -1, (op5) obj, -1);
            } else if (obj instanceof fun) {
                fun funVar = (fun) obj;
                if (!(funVar.a instanceof lq5)) {
                    j(oxqVar, f3, obj);
                    int o = oxqVar.o() - f3;
                    w80 w80Var = funVar.b;
                    if (w80Var == null || !w80Var.a()) {
                        i = -1;
                    } else {
                        i3 = oxqVar.c(w80Var);
                        i = oxqVar.o() - oxqVar.O(i3);
                    }
                    mVar.D(o, i3, funVar, i);
                }
            } else if (obj instanceof xmn) {
                j(oxqVar, f3, obj);
                ((xmn) obj).c();
            }
        }
    }

    public static final lfi f(wr5 wr5Var, mfi mfiVar, oxq oxqVar, nw0 nw0Var) {
        kjn kjnVar = gq5.a;
        fxq fxqVar = new fxq();
        if (oxqVar.e != null) {
            fxqVar.g();
        }
        if (oxqVar.f != null) {
            fxqVar.k = new soi();
        }
        int i = oxqVar.t;
        if (nw0Var != null && oxqVar.D(i) > 0) {
            int i2 = oxqVar.v;
            while (i2 > 0 && !oxqVar.w(i2)) {
                i2 = oxqVar.E(oxqVar.b, i2);
            }
            if (i2 >= 0 && oxqVar.w(i2)) {
                Object C = oxqVar.C(i2);
                int i3 = i2 + 1;
                int s = oxqVar.s(i2) + i2;
                int i4 = 0;
                while (i3 < s) {
                    int s2 = oxqVar.s(i3) + i3;
                    if (s2 > i) {
                        break;
                    }
                    i4 += oxqVar.w(i3) ? 1 : oxqVar.D(i3);
                    i3 = s2;
                }
                int D = oxqVar.w(i) ? 1 : oxqVar.D(i);
                nw0Var.i(C);
                nw0Var.d(i4, D);
                nw0Var.l();
            }
        }
        oxq o = fxqVar.o();
        try {
            o.d();
            o.Q(mfiVar.a, kjnVar, false, 126665345);
            oxq.x(o);
            o.S(mfiVar.b);
            List B = oxqVar.B(mfiVar.e, o);
            o.K();
            o.i();
            o.j();
            o.e(true);
            lfi lfiVar = new lfi(fxqVar);
            List list = B;
            if (!list.isEmpty()) {
                int size = list.size();
                for (int i5 = 0; i5 < size; i5++) {
                    w80 w80Var = (w80) B.get(i5);
                    if (fxqVar.q(w80Var)) {
                        int a2 = fxqVar.a(w80Var);
                        int b2 = hxq.b(fxqVar.a, a2);
                        int i6 = a2 + 1;
                        if (((i6 < fxqVar.b ? fxqVar.a[(i6 * 5) + 4] : fxqVar.c.length) - b2 > 0 ? fxqVar.c[b2] : kjnVar) instanceof xmn) {
                            yfx yfxVar = new yfx(13, wr5Var, mfiVar);
                            o = fxqVar.o();
                            try {
                                ivf.w(o, B, yfxVar);
                                o.e(true);
                                return lfiVar;
                            } finally {
                            }
                        }
                    }
                }
            }
            return lfiVar;
        } finally {
        }
    }

    public static final int g(List list, int i) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int e2 = Intrinsics.e(((fye) list.get(i3)).b, i);
            if (e2 < 0) {
                i2 = i3 + 1;
            } else {
                if (e2 <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final Object h(Object obj, Object obj2, Integer num) {
        n3f n3fVar = obj instanceof n3f ? (n3f) obj : null;
        if (n3fVar == null) {
            return null;
        }
        Object obj3 = n3fVar.b;
        Object obj4 = n3fVar.a;
        if (Intrinsics.d(obj4, obj2) && Intrinsics.d(obj3, num)) {
            return obj;
        }
        Object h = h(obj4, obj2, num);
        return h == null ? h(obj3, obj2, num) : h;
    }

    public static final void i(oxq oxqVar, m mVar) {
        int i;
        int[] iArr = oxqVar.b;
        int i2 = oxqVar.t;
        int f2 = oxqVar.f(iArr, oxqVar.q(oxqVar.s(i2) + i2));
        for (int f3 = oxqVar.f(oxqVar.b, oxqVar.q(oxqVar.t)); f3 < f2; f3++) {
            Object obj = oxqVar.c[oxqVar.g(f3)];
            int i3 = -1;
            if (obj instanceof op5) {
                int o = oxqVar.o() - f3;
                Object obj2 = (op5) obj;
                upi upiVar = (upi) mVar.g;
                if (upiVar == null) {
                    int i4 = xso.a;
                    upiVar = new upi();
                    mVar.g = upiVar;
                }
                upiVar.l(obj2);
                mVar.D(o, -1, obj2, -1);
            }
            if (obj instanceof fun) {
                int o2 = oxqVar.o() - f3;
                fun funVar = (fun) obj;
                w80 w80Var = funVar.b;
                if (w80Var == null || !w80Var.a()) {
                    i = -1;
                } else {
                    i3 = oxqVar.c(w80Var);
                    i = oxqVar.o() - oxqVar.O(i3);
                }
                mVar.D(o2, i3, funVar, i);
            }
            if (obj instanceof xmn) {
                ((xmn) obj).c();
            }
        }
        oxqVar.H();
    }

    public static final void j(oxq oxqVar, int i, Object obj) {
        int g = oxqVar.g(i);
        Object[] objArr = oxqVar.c;
        Object obj2 = objArr[g];
        objArr[g] = gq5.a;
        if (obj == obj2) {
            return;
        }
        c("Slot table is out of sync (expected " + obj + ", got " + obj2 + ')');
    }
}
