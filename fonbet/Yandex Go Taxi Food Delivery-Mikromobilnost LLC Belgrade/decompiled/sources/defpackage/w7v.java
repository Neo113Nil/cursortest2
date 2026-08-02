package defpackage;

import android.util.Size;

/* loaded from: classes10.dex */
public final class w7v {
    public static final b8v a;

    static {
        Object size = new Size(640, 480);
        asj0 asj0Var = new asj0();
        asj0Var.a = s83.c;
        asj0Var.b = new csj0(1, vjs0.c);
        bsj0 a2 = asj0Var.a();
        v7v v7vVar = new v7v();
        x34 x34Var = icv.s2;
        yy40 yy40Var = v7vVar.a;
        yy40Var.w(x34Var, size);
        yy40Var.w(xi21.n4, 1);
        yy40Var.w(icv.m2, 0);
        v7vVar.h(a2);
        q8n q8nVar = q8n.d;
        if (!q8nVar.equals(q8nVar)) {
            w511.x("ImageAnalysis currently only supports SDR");
        } else {
            yy40Var.w(eav.l2, q8nVar);
            a = v7vVar.e();
        }
    }
}
