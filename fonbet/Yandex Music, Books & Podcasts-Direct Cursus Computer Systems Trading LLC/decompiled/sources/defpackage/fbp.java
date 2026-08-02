package defpackage;

import android.net.Uri;

/* loaded from: classes.dex */
public final class fbp extends ljo {
    public final /* synthetic */ jp3 h;
    public final /* synthetic */ nb7 i;
    public final /* synthetic */ jbp j;

    public fbp(jbp jbpVar, jp3 jp3Var, nb7 nb7Var) {
        this.j = jbpVar;
        this.h = jp3Var;
        this.i = nb7Var;
    }

    @Override // defpackage.ljo
    public final Object e() {
        c8k c8kVar = this.j.b;
        ngr ngrVar = new ngr(this.h);
        cfg.f.getAndIncrement();
        ngrVar.b = 0L;
        kb7 kb7Var = new kb7(ngrVar, this.i);
        try {
            kb7Var.a();
            Uri uri = ngrVar.a.getUri();
            uri.getClass();
            Object o = c8kVar.o(uri, kb7Var);
            dvt.g(kb7Var);
            o.getClass();
            return (icc) o;
        } catch (Throwable th) {
            dvt.g(kb7Var);
            throw th;
        }
    }
}
