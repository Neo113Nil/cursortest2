package defpackage;

import android.net.Uri;

/* loaded from: classes4.dex */
public final class cq3 implements db7 {
    public final bb6 a;

    public cq3(bb6 bb6Var) {
        this.a = bb6Var;
    }

    @Override // defpackage.db7
    public final long a(nb7 nb7Var) {
        nb7Var.getClass();
        String uri = nb7Var.a.toString();
        uri.getClass();
        throw new pte(this.a, uri);
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
