package defpackage;

import android.net.Uri;
import kotlin.text.Regex;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class al7 implements db7 {
    public final so3 a;
    public final db7 b;

    public al7(so3 so3Var, db7 db7Var) {
        so3Var.getClass();
        db7Var.getClass();
        this.a = so3Var;
        this.b = db7Var;
    }

    @Override // defpackage.db7
    public final long a(nb7 nb7Var) {
        nb7Var.getClass();
        Timber.Tree tag = Timber.INSTANCE.tag("CACHE_DEBUG");
        Regex regex = zp3.a;
        tag.w(zp3.d(this.a, nb7Var, true), new Object[0]);
        return this.b.a(nb7Var);
    }

    @Override // defpackage.db7
    public final void close() {
        this.b.close();
    }

    @Override // defpackage.db7
    public final Uri getUri() {
        return this.b.getUri();
    }

    @Override // defpackage.db7
    public final void q(t6t t6tVar) {
        t6tVar.getClass();
        this.b.q(t6tVar);
    }

    @Override // defpackage.ma7
    public final int read(byte[] bArr, int i, int i2) {
        bArr.getClass();
        return this.b.read(bArr, i, i2);
    }
}
