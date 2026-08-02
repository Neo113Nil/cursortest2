package defpackage;

import androidx.compose.ui.layout.a;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public abstract class c5n {
    public static final float a = 40;
    public static final float b = 150;

    public static final void a(yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1007785308);
        if ((((oq5Var.f(yciVar) ? 4 : 2) | i) & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            yg0 x = ghh.x(2131232586, oq5Var);
            yg0 x2 = ghh.x(2131232587, oq5Var);
            yciVar.getClass();
            yci b2 = a.b(yciVar, new ep5(22));
            boolean h = oq5Var.h(x2) | oq5Var.h(x);
            Object K = oq5Var.K();
            if (h || K == gq5.a) {
                K = new xum(3, x2, x);
                oq5Var.k0(K);
            }
            ksw.j(0, oq5Var, b2, (Function1) K);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new cxd(yciVar, i, 9);
        }
    }

    public static final void b(jpa jpaVar, yg0 yg0Var, float f) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int width = yg0Var.a.getWidth();
        int height = yg0Var.a.getHeight();
        int b2 = eeh.b(width * f);
        int min = Math.min(eeh.b(b2 * (nmq.b(jpaVar.e()) / height)), eeh.b(nmq.d(jpaVar.e()) / 2));
        int b3 = eeh.b(nmq.d(jpaVar.e()));
        int b4 = eeh.b(nmq.b(jpaVar.e()));
        jpa.j0(jpaVar, yg0Var, 0L, nt0.p(b2, height), 0L, nt0.p(min, b4), 0.0f, null, 0, 992);
        int i6 = width - (b2 * 2);
        int i7 = b3 - (min * 2);
        if (i7 <= 0 || i6 <= 0) {
            i = min;
            i2 = height;
            i3 = b4;
            i4 = b2;
            i5 = 0;
        } else {
            i3 = b4;
            i = min;
            i2 = height;
            i4 = b2;
            i5 = 0;
            jpa.j0(jpaVar, yg0Var, xv.t(b2, 0), nt0.p(i6, height), xv.t(min, 0), nt0.p(i7, b4), 0.0f, null, 0, 992);
        }
        jpa.j0(jpaVar, yg0Var, xv.t(width - i4, i5), nt0.p(i4, i2), xv.t(b3 - i, i5), nt0.p(i, i3), 0.0f, null, 0, 992);
    }
}
