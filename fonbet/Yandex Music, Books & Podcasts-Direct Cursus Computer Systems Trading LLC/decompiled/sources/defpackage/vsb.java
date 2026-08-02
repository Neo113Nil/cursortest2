package defpackage;

import android.content.Context;
import java.io.File;

/* loaded from: classes4.dex */
public final class vsb {
    public final b7q a;
    public final jyr b;
    public final jyr c;
    public final jyr d;
    public final jyr e;
    public final z66 f;

    public vsb(b7q b7qVar) {
        this.a = b7qVar;
        this.b = b7qVar.b(hag.I(niq.class), true);
        this.c = b7qVar.b(hag.I(ert.class), true);
        this.d = b7qVar.b(hag.I(xol.class), true);
        this.e = b7qVar.b(hag.I(tar.class), true);
        bdt I = hag.I(z66.class);
        qdc qdcVar = b7qVar.a;
        qdcVar.getClass();
        this.f = (z66) qdcVar.C(I);
    }

    public static wq3 a(va7 va7Var, String str) {
        str.getClass();
        if (str.length() == 32) {
            return new wq3(2, str, va7Var);
        }
        xq0.o("Expected length 32, but got ".concat(str));
        return null;
    }

    public static tw6 b(so3 so3Var, zk7 zk7Var, sco scoVar, kj3 kj3Var) {
        tw6 tw6Var = new tw6();
        tw6Var.a = so3Var;
        tw6Var.d = vp3.R;
        tw6Var.f = zk7Var;
        tw6Var.b = scoVar;
        tw6Var.c = kj3Var;
        tw6Var.e = false;
        return tw6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [bq3] */
    public static ip3 c(vsb vsbVar, liq liqVar, sco scoVar, hl5 hl5Var, int i) {
        va7 va7Var = scoVar;
        if ((i & 2) != 0) {
            vsbVar.getClass();
            va7Var = new l9c();
        }
        if ((i & 4) != 0) {
            bb6 bb6Var = bb6.b;
            vsbVar.getClass();
            hl5Var = new bq3(bb6Var);
        }
        boolean z = (i & 16) == 0;
        vsbVar.getClass();
        ip3 ip3Var = new ip3();
        ip3Var.a = liqVar;
        if (z) {
            ip3Var.i = 1;
        }
        ip3Var.d = b3i.f;
        ip3Var.f = hl5Var;
        ip3Var.b = va7Var;
        ip3Var.c = null;
        ip3Var.e = true;
        return ip3Var;
    }

    public final liq d(thr thrVar) {
        thrVar.getClass();
        niq niqVar = (niq) this.b.getValue();
        niqVar.getClass();
        uhr uhrVar = niqVar.b;
        String b = uhrVar.b();
        File e = uhrVar.e(thrVar, b);
        if (e == null) {
            return null;
        }
        liq liqVar = (liq) niqVar.c.get(e);
        return liqVar == null ? niqVar.a(e, thrVar, b) : liqVar;
    }

    public final poj e(ow6 ow6Var) {
        tar tarVar = (tar) this.e.getValue();
        tarVar.getClass();
        poj pojVar = new poj(tarVar.b);
        pojVar.b = dvt.O((Context) ((ert) this.c.getValue()).a.getValue());
        pojVar.e = ow6Var;
        return new poj(tarVar.a, pojVar, tarVar.g, tarVar.c, tarVar.h);
    }
}
