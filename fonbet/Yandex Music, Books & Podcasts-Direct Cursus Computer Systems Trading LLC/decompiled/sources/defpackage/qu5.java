package defpackage;

import android.content.Context;

/* loaded from: classes3.dex */
public final class qu5 {
    public final gvd a;
    public final Context b;
    public final cce c;
    public final hab d;
    public final x6k e;
    public final fk0 f;
    public final vm0 g;

    public qu5(gvd gvdVar, iv5 iv5Var, Context context, mm6 mm6Var, cce cceVar) {
        fkn fknVar;
        gvdVar.getClass();
        context.getClass();
        cceVar.getClass();
        this.a = gvdVar;
        this.b = context;
        this.c = cceVar;
        this.d = new hab(gvdVar);
        this.e = szf.g0(Boolean.TRUE);
        fk0 a = bmq.a(gvdVar.b());
        this.f = a;
        this.g = a.c;
        if (iv5Var == null || (fknVar = iv5Var.b) == null) {
            return;
        }
        ox6.B(fknVar, mm6Var, new i64(16, this));
    }
}
