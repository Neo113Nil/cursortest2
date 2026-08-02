package defpackage;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes.dex */
public final class o8s implements db7 {
    public final db7 a;
    public final ta7 b;
    public boolean c;
    public long d;

    public o8s(db7 db7Var, ta7 ta7Var) {
        this.a = db7Var;
        ta7Var.getClass();
        this.b = ta7Var;
    }

    @Override // defpackage.db7
    public final long a(nb7 nb7Var) {
        long a = this.a.a(nb7Var);
        this.d = a;
        if (a == 0) {
            return 0L;
        }
        if (nb7Var.g == -1 && a != -1) {
            nb7Var = nb7Var.e(0L, a);
        }
        this.c = true;
        this.b.a(nb7Var);
        return this.d;
    }

    @Override // defpackage.db7
    public final Map b() {
        return this.a.b();
    }

    @Override // defpackage.db7
    public final void close() {
        ta7 ta7Var = this.b;
        try {
            this.a.close();
        } finally {
            if (this.c) {
                this.c = false;
                ta7Var.close();
            }
        }
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
        if (this.d == 0) {
            return -1;
        }
        int read = this.a.read(bArr, i, i2);
        if (read > 0) {
            this.b.write(bArr, i, read);
            long j = this.d;
            if (j != -1) {
                this.d = j - read;
            }
        }
        return read;
    }
}
