package defpackage;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes.dex */
public final class osm implements db7 {
    public final db7 a;
    public final ssm b;
    public final int c;

    public osm(db7 db7Var, ssm ssmVar, int i) {
        db7Var.getClass();
        this.a = db7Var;
        ssmVar.getClass();
        this.b = ssmVar;
        this.c = i;
    }

    @Override // defpackage.db7
    public final long a(nb7 nb7Var) {
        this.b.c(this.c);
        return this.a.a(nb7Var);
    }

    @Override // defpackage.db7
    public final Map b() {
        return this.a.b();
    }

    @Override // defpackage.db7
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.db7
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // defpackage.db7
    public final void q(t6t t6tVar) {
        t6tVar.getClass();
        this.a.q(t6tVar);
    }

    @Override // defpackage.ma7
    public final int read(byte[] bArr, int i, int i2) {
        this.b.c(this.c);
        return this.a.read(bArr, i, i2);
    }
}
