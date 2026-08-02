package defpackage;

import kotlin.collections.EmptyList;
import kotlinx.coroutines.channels.a;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import yads.ca1;
import yads.da1;
import yads.ea1;
import yads.fa1;

/* loaded from: classes7.dex */
public final class q971 {
    public final ike a;
    public final sg81 b;
    public final lz61 c;
    public final vd81 d;
    public final s681 e;
    public final h081 f;
    public final jn81 g;
    public final y781 h;
    public final wi71 i;
    public final r971 j;
    public final b071 k;
    public final qm81 l;
    public final r0 m;
    public final gci0 n;
    public final a o;
    public final di9 p;

    public q971(sg81 sg81Var, lz61 lz61Var, vd81 vd81Var, s681 s681Var, h081 h081Var, jn81 jn81Var, y781 y781Var, wi71 wi71Var, r971 r971Var, b071 b071Var, qm81 qm81Var) {
        hu71 hu71Var = new hu71();
        qhw0 a = jl40.a();
        sjh sjhVar = uyj.a;
        this.a = bvf0.a(cvw.U(a, o400.a.x).plus(hu71Var));
        this.b = sg81Var;
        this.c = lz61Var;
        this.d = vd81Var;
        this.e = s681Var;
        this.f = h081Var;
        this.g = jn81Var;
        this.h = y781Var;
        this.i = wi71Var;
        this.j = r971Var;
        this.k = b071Var;
        this.l = qm81Var;
        r0 c = bvf0.c(new e881(null, yl71.b, false, EmptyList.a));
        this.m = c;
        this.n = e.d(c);
        a a2 = sb2.a(0, null, null, 7);
        this.o = a2;
        this.p = new di9(a2);
    }

    public final void a(qf71 qf71Var) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        if (qf71Var instanceof bh61) {
            tje.N(this.a, null, null, new fa1(this, null), 3);
            return;
        }
        if (qf71Var instanceof m971) {
            tje.N(this.a, null, null, new da1(this, null), 3);
            return;
        }
        if (qf71Var instanceof e371) {
            lz61 lz61Var = this.c;
            boolean z = !lz61Var.a.a.a().e.a;
            a081 a081Var = lz61Var.a.a.e.a;
            a081Var.getClass();
            synchronized (a081.f) {
                a081Var.c = z;
                a081Var.d = z;
                a081Var.e = z;
            }
            tje.N(this.a, null, null, new fa1(this, null), 3);
            return;
        }
        if (qf71Var instanceof wz61) {
            e881 e881Var = ((e881) this.m.getValue()).a;
            if (e881Var == null) {
                tje.N(this.a, null, null, new ca1(this, oi71.a, null), 3);
                return;
            }
            e881 a = e881.a(e881Var, null, null, false, null, 11);
            r0 r0Var = this.m;
            do {
                value4 = r0Var.getValue();
            } while (!r0Var.k(value4, a));
            return;
        }
        if (qf71Var instanceof to61) {
            ki71 ki71Var = ki71.b;
            e881 e881Var2 = (e881) this.m.getValue();
            e881 a2 = e881.a(e881Var2, e881Var2, ki71Var, false, null, 12);
            r0 r0Var2 = this.m;
            do {
                value3 = r0Var2.getValue();
            } while (!r0Var2.k(value3, a2));
            tje.N(this.a, null, null, new fa1(this, null), 3);
            return;
        }
        if (qf71Var instanceof ol61) {
            ic71 ic71Var = new ic71(((ol61) qf71Var).a);
            e881 e881Var3 = (e881) this.m.getValue();
            e881 a3 = e881.a(e881Var3, e881Var3, ic71Var, false, null, 12);
            r0 r0Var3 = this.m;
            do {
                value2 = r0Var3.getValue();
            } while (!r0Var3.k(value2, a3));
            tje.N(this.a, null, null, new fa1(this, null), 3);
            return;
        }
        if (!(qf71Var instanceof f671)) {
            if (qf71Var instanceof mc71) {
                tje.N(this.a, null, null, new ea1(this, ((mc71) qf71Var).a, null), 3);
                return;
            }
            return;
        }
        sr71 sr71Var = ((e881) this.m.getValue()).b;
        fh61 fh61Var = ((f671) qf71Var).a;
        sr71 lf71Var = sr71Var instanceof ic71 ? new lf71(fh61Var) : new so71(fh61Var.a);
        e881 e881Var4 = (e881) this.m.getValue();
        e881 a4 = e881.a(e881Var4, e881Var4, lf71Var, false, null, 12);
        r0 r0Var4 = this.m;
        do {
            value = r0Var4.getValue();
        } while (!r0Var4.k(value, a4));
        tje.N(this.a, null, null, new fa1(this, null), 3);
    }
}
