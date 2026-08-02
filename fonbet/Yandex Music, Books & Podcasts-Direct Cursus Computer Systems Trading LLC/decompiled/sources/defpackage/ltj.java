package defpackage;

import com.yandex.passport.sloth.ui.dependencies.m;

/* loaded from: classes.dex */
public final class ltj extends s17 {
    public static final ltj d = new ltj(0, 2, 1);

    @Override // defpackage.s17
    public final void a(n8n n8nVar, nw0 nw0Var, oxq oxqVar, m mVar) {
        int i;
        bqe bqeVar = (bqe) n8nVar.j(0);
        int c = oxqVar.c((w80) n8nVar.j(1));
        if (oxqVar.t >= c) {
            pq5.c("Check failed");
        }
        o5g.M(oxqVar, nw0Var, c);
        int i2 = oxqVar.t;
        int i3 = oxqVar.v;
        while (i3 >= 0 && !oxqVar.w(i3)) {
            i3 = oxqVar.E(oxqVar.b, i3);
        }
        int i4 = i3 + 1;
        int i5 = 0;
        while (i4 < i2) {
            if (oxqVar.t(i2, i4)) {
                if (oxqVar.w(i4)) {
                    i5 = 0;
                }
                i4++;
            } else {
                i5 += oxqVar.w(i4) ? 1 : oxqVar.D(i4);
                i4 += oxqVar.s(i4);
            }
        }
        while (true) {
            i = oxqVar.t;
            if (i >= c) {
                break;
            }
            if (oxqVar.t(c, i)) {
                int i6 = oxqVar.t;
                if (i6 < oxqVar.u && (oxqVar.b[(oxqVar.q(i6) * 5) + 1] & 1073741824) != 0) {
                    nw0Var.i(oxqVar.C(oxqVar.t));
                    i5 = 0;
                }
                oxqVar.P();
            } else {
                i5 += oxqVar.K();
            }
        }
        if (i != c) {
            pq5.c("Check failed");
        }
        bqeVar.a = i5;
    }
}
