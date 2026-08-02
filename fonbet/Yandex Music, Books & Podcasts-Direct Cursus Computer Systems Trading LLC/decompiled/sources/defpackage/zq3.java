package defpackage;

import android.net.Uri;
import kotlin.text.Regex;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class zq3 implements db7 {
    public final liq a;
    public final n9c b;

    public zq3(liq liqVar, n9c n9cVar) {
        this.a = liqVar;
        this.b = n9cVar;
    }

    @Override // defpackage.db7
    public final long a(nb7 nb7Var) {
        nb7Var.getClass();
        Timber.Tree tag = Timber.INSTANCE.tag("CACHE_DEBUG");
        Regex regex = zp3.a;
        tag.d(zp3.e(this.a, nb7Var), new Object[0]);
        return this.b.a(nb7Var);
    }

    @Override // defpackage.db7
    public final void close() {
        this.b.close();
    }

    @Override // defpackage.db7
    public final Uri getUri() {
        return this.b.f;
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
