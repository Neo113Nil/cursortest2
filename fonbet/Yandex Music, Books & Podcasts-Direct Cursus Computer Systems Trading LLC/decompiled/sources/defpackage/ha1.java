package defpackage;

import android.content.Context;

/* loaded from: classes3.dex */
public final class ha1 {
    public final gvd a;
    public final Context b;
    public final cce c;
    public final hab d;
    public final x6k e;
    public final x6k f;
    public final fk0 g;
    public final vm0 h;

    public ha1(gvd gvdVar, q0d q0dVar, Context context, mm6 mm6Var, cce cceVar, boolean z) {
        vdr state;
        gvdVar.getClass();
        context.getClass();
        cceVar.getClass();
        this.a = gvdVar;
        this.b = context;
        this.c = cceVar;
        this.d = new hab(gvdVar);
        this.e = szf.g0(Boolean.TRUE);
        this.f = szf.g0(Boolean.valueOf(z));
        fk0 a = bmq.a(gvdVar.b());
        this.g = a;
        this.h = a.c;
        if (q0dVar == null || (state = q0dVar.getState()) == null) {
            return;
        }
        ox6.B(state, mm6Var, new ri(11, this));
    }
}
