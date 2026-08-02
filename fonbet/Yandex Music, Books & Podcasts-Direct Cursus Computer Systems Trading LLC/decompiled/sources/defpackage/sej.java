package defpackage;

import android.net.Uri;
import android.util.Log;
import kotlin.text.Regex;

/* loaded from: classes6.dex */
public final class sej implements db7 {
    public final so3 a;

    public sej(so3 so3Var) {
        this.a = so3Var;
    }

    @Override // defpackage.db7
    public final long a(nb7 nb7Var) {
        nb7Var.getClass();
        Regex regex = zp3.a;
        Log.w("NotCachedDataSource", zp3.d(this.a, nb7Var, false));
        throw new rej(new oo3("Not cached " + nb7Var.h + ",  " + nb7Var.f + ", " + nb7Var.g));
    }

    @Override // defpackage.db7
    public final Uri getUri() {
        return null;
    }

    @Override // defpackage.db7
    public final void q(t6t t6tVar) {
        t6tVar.getClass();
    }

    @Override // defpackage.ma7
    public final int read(byte[] bArr, int i, int i2) {
        bArr.getClass();
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.db7
    public final void close() {
    }
}
