package defpackage;

import android.os.Build;

/* loaded from: classes.dex */
public final class p0j extends jq2 {
    public static final String c = jsg.n("NetworkMeteredCtrlr");
    public final int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0j(r96 r96Var) {
        super(r96Var);
        r96Var.getClass();
        this.b = 7;
    }

    @Override // defpackage.q86
    public final boolean c(t4w t4wVar) {
        t4wVar.getClass();
        return t4wVar.j.a == g2j.e;
    }

    @Override // defpackage.jq2
    public final int d() {
        return this.b;
    }

    @Override // defpackage.jq2
    public final boolean e(Object obj) {
        q1j q1jVar = (q1j) obj;
        q1jVar.getClass();
        boolean z = q1jVar.a;
        if (Build.VERSION.SDK_INT >= 26) {
            return (z && q1jVar.c) ? false : true;
        }
        jsg.j().e(c, "Metered network constraint is not supported before API 26, only checking for connected state.");
        return !z;
    }
}
