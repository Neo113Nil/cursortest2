package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class ngr implements db7 {
    public final db7 a;
    public long b;
    public Uri c;
    public Map d;

    public ngr(db7 db7Var) {
        db7Var.getClass();
        this.a = db7Var;
        this.c = Uri.EMPTY;
        this.d = Collections.EMPTY_MAP;
    }

    @Override // defpackage.db7
    public final long a(nb7 nb7Var) {
        db7 db7Var = this.a;
        this.c = nb7Var.a;
        this.d = Collections.EMPTY_MAP;
        try {
            return db7Var.a(nb7Var);
        } finally {
            Uri uri = db7Var.getUri();
            if (uri != null) {
                this.c = uri;
            }
            this.d = db7Var.b();
        }
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
        int read = this.a.read(bArr, i, i2);
        if (read != -1) {
            this.b += read;
        }
        return read;
    }
}
