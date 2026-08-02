package defpackage;

import android.util.DisplayMetrics;
import android.view.View;

/* loaded from: classes3.dex */
public final class m39 extends p9 {
    public final /* synthetic */ int b;
    public final Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m39(gp8 gp8Var, Object obj, int i) {
        super(gp8Var);
        this.b = i;
        this.c = obj;
    }

    public static void G(lb9 lb9Var, xzb xzbVar, k39 k39Var) {
        wdp I;
        kje jjeVar;
        szb szbVar = k39Var.s;
        DisplayMetrics displayMetrics = lb9Var.getResources().getDisplayMetrics();
        qh9 qh9Var = k39Var.d;
        qh9 qh9Var2 = k39Var.u;
        qh9 qh9Var3 = k39Var.t;
        float doubleValue = (float) ((Number) k39Var.c.a(xzbVar)).doubleValue();
        float doubleValue2 = (float) ((Number) k39Var.y.a(xzbVar)).doubleValue();
        int i = 1;
        if (qh9Var2 != null) {
            I = I(qh9Var2, displayMetrics, xzbVar, szbVar, 1.0f);
        } else if (qh9Var != null) {
            I = I(qh9Var, displayMetrics, xzbVar, szbVar, 1 / doubleValue);
        } else {
            I = qh9Var3 != null ? I(qh9Var3, displayMetrics, xzbVar, szbVar, doubleValue2) : null;
            if (I == null) {
                kj9 kj9Var = k39Var.E;
                if (kj9Var instanceof jj9) {
                    I = I(((jj9) kj9Var).b, displayMetrics, xzbVar, szbVar, 1.0f);
                } else {
                    if (!(kj9Var instanceof ij9)) {
                        b6e.s();
                        return;
                    }
                    I = new nje(((Number) szbVar.a(xzbVar)).intValue(), new lje(bg3.j0(((ij9) kj9Var).b.b, displayMetrics, xzbVar) * 1.0f));
                }
            }
        }
        wdp wdpVar = I;
        szb szbVar2 = k39Var.b;
        wdp I2 = qh9Var != null ? I(qh9Var, displayMetrics, xzbVar, szbVar2, 1.0f) : H(wdpVar, doubleValue, (Integer) szbVar2.a(xzbVar));
        wdp I3 = qh9Var3 != null ? I(qh9Var3, displayMetrics, xzbVar, szbVar, 1.0f) : H(wdpVar, doubleValue2, null);
        j39 j39Var = (j39) k39Var.h.a(xzbVar);
        if (j39Var == j39.WORM) {
            i = 2;
        } else if (j39Var == j39.SLIDER) {
            i = 3;
        }
        int i2 = i;
        Object obj = k39Var.v;
        if (obj == null) {
            obj = new n39(new iw8(k39Var.F));
        }
        if (obj instanceof n39) {
            jjeVar = new ije(bg3.g0(((n39) obj).b.a, displayMetrics, xzbVar));
        } else {
            if (!(obj instanceof o39)) {
                b6e.s();
                return;
            }
            fn9 fn9Var = ((o39) obj).b;
            float g0 = bg3.g0(fn9Var.a, displayMetrics, xzbVar);
            long longValue = ((Number) fn9Var.b.a(xzbVar)).longValue();
            long j = longValue >> 31;
            jjeVar = new jje((j == 0 || j == -1) ? (int) longValue : longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE, g0);
        }
        lb9Var.setStyle(new pje(i2, I2, wdpVar, I3, jjeVar));
    }

    public static wdp H(wdp wdpVar, float f, Integer num) {
        if (wdpVar instanceof oje) {
            int intValue = num != null ? num.intValue() : ((oje) wdpVar).k;
            oje ojeVar = (oje) wdpVar;
            mje mjeVar = ojeVar.l;
            return bow.p(intValue, mjeVar.i, mjeVar.j, mjeVar.k, f, Float.valueOf(ojeVar.m), Integer.valueOf(ojeVar.n));
        }
        if (wdpVar instanceof nje) {
            return new nje(num != null ? num.intValue() : ((nje) wdpVar).k, new lje(((nje) wdpVar).l.i * f));
        }
        b6e.s();
        return null;
    }

    public static oje I(qh9 qh9Var, DisplayMetrics displayMetrics, xzb xzbVar, szb szbVar, float f) {
        jk9 jk9Var;
        szb szbVar2;
        szb szbVar3;
        szb szbVar4;
        ln9 ln9Var = qh9Var.e;
        if (ln9Var == null || (szbVar4 = ln9Var.c) == null || (jk9Var = (jk9) szbVar4.a(xzbVar)) == null) {
            jk9Var = jk9.DP;
        }
        Integer num = null;
        Integer valueOf = (ln9Var == null || (szbVar3 = ln9Var.d) == null) ? null : Integer.valueOf(eeh.b(bg3.n0(Double.valueOf(((Number) szbVar3.a(xzbVar)).doubleValue()), displayMetrics, jk9Var)));
        szb szbVar5 = qh9Var.a;
        if (szbVar5 != null) {
            szbVar = szbVar5;
        }
        int intValue = ((Number) szbVar.a(xzbVar)).intValue();
        float j0 = bg3.j0(qh9Var.d, displayMetrics, xzbVar);
        float j02 = bg3.j0(qh9Var.c, displayMetrics, xzbVar);
        float j03 = bg3.j0(qh9Var.b, displayMetrics, xzbVar);
        Float valueOf2 = valueOf != null ? Float.valueOf(valueOf.intValue()) : null;
        if (ln9Var != null && (szbVar2 = ln9Var.a) != null) {
            num = (Integer) szbVar2.a(xzbVar);
        }
        return bow.p(intValue, j0, j02, j03, f, valueOf2, num);
    }

    @Override // defpackage.p9
    public void j(View view, e23 e23Var, dp8 dp8Var, dp8 dp8Var2) {
        switch (this.b) {
            case 0:
                lb9 lb9Var = (lb9) view;
                k39 k39Var = (k39) dp8Var;
                xzb xzbVar = e23Var.b;
                G(lb9Var, xzbVar, k39Var);
                lj0 lj0Var = new lj0(this, lb9Var, xzbVar, k39Var, 20);
                lb9Var.i(k39Var.h.c(xzbVar, lj0Var));
                lb9Var.i(k39Var.b.c(xzbVar, lj0Var));
                lb9Var.i(k39Var.c.c(xzbVar, lj0Var));
                lb9Var.i(k39Var.s.c(xzbVar, lj0Var));
                lb9Var.i(k39Var.y.c(xzbVar, lj0Var));
                sk3.P(lb9Var, k39Var.E, xzbVar, lj0Var);
                sk3.O(lb9Var, k39Var.d, xzbVar, lj0Var);
                sk3.O(lb9Var, k39Var.u, xzbVar, lj0Var);
                sk3.O(lb9Var, k39Var.t, xzbVar, lj0Var);
                Object obj = k39Var.v;
                if (obj == null) {
                    obj = new n39(new iw8(k39Var.F));
                }
                if (obj instanceof n39) {
                    jz8 jz8Var = ((n39) obj).b.a;
                    lb9Var.i(jz8Var.b.c(xzbVar, lj0Var));
                    lb9Var.i(jz8Var.a.c(xzbVar, lj0Var));
                } else if (obj instanceof o39) {
                    fn9 fn9Var = ((o39) obj).b;
                    jz8 jz8Var2 = fn9Var.a;
                    lb9Var.i(jz8Var2.b.c(xzbVar, lj0Var));
                    lb9Var.i(jz8Var2.a.c(xzbVar, lj0Var));
                    lb9Var.i(fn9Var.b.c(xzbVar, lj0Var));
                }
                Object c = k39Var.S.c();
                if (c instanceof jz8) {
                    sk3.L(lb9Var, (jz8) c, xzbVar, lj0Var);
                }
                Object c2 = k39Var.q.c();
                if (c2 instanceof jz8) {
                    sk3.L(lb9Var, (jz8) c2, xzbVar, lj0Var);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.p9
    public void k(View view, e23 e23Var, dp8 dp8Var, dp8 dp8Var2, pm9 pm9Var) {
        m39 m39Var;
        switch (this.b) {
            case 1:
                qo9 qo9Var = (qo9) view;
                jo9 jo9Var = (jo9) dp8Var;
                szb szbVar = jo9Var.s;
                jo9 jo9Var2 = (jo9) dp8Var2;
                xzb xzbVar = e23Var.b;
                szb szbVar2 = jo9Var.o;
                if (!xp3.B(szbVar2, jo9Var2 != null ? jo9Var2.o : null)) {
                    qo9Var.setEnabled(((Boolean) szbVar2.a(xzbVar)).booleanValue());
                    if (!(szbVar2 instanceof ozb)) {
                        qo9Var.i(szbVar2.c(xzbVar, new ko9(this, qo9Var, jo9Var, xzbVar, 0)));
                    }
                }
                xzb xzbVar2 = e23Var.b;
                if (!xp3.B(szbVar, jo9Var2 != null ? jo9Var2.s : null)) {
                    qo9Var.setColorOn(szbVar != null ? (Integer) szbVar.a(xzbVar2) : null);
                    if (!xp3.V(szbVar)) {
                        m39Var = this;
                        qo9Var.i(szbVar != null ? szbVar.c(xzbVar2, new ko9(m39Var, qo9Var, jo9Var, xzbVar2, 1)) : null);
                        qo9Var.i(((nct) m39Var.c).l(e23Var, jo9Var.p, new ix6(26, qo9Var)));
                        break;
                    }
                }
                m39Var = this;
                qo9Var.i(((nct) m39Var.c).l(e23Var, jo9Var.p, new ix6(26, qo9Var)));
            default:
                super.k(view, e23Var, dp8Var, dp8Var2, pm9Var);
                break;
        }
    }
}
