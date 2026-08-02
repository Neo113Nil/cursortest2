package defpackage;

import android.net.Uri;

/* loaded from: classes.dex */
public final class d8k implements jgg {
    public final long a = cfg.f.getAndIncrement();
    public final nb7 b;
    public final int c;
    public final ngr d;
    public final c8k e;
    public volatile Object f;

    public d8k(db7 db7Var, nb7 nb7Var, int i, c8k c8kVar) {
        this.d = new ngr(db7Var);
        this.b = nb7Var;
        this.c = i;
        this.e = c8kVar;
    }

    @Override // defpackage.jgg
    public final void a() {
        this.d.b = 0L;
        kb7 kb7Var = new kb7(this.d, this.b);
        try {
            kb7Var.a();
            Uri uri = this.d.a.getUri();
            uri.getClass();
            this.f = this.e.o(uri, kb7Var);
        } finally {
            dvt.g(kb7Var);
        }
    }

    @Override // defpackage.jgg
    public final void f() {
    }
}
