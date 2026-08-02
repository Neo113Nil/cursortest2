package defpackage;

import android.net.Uri;
import java.util.Collections;

/* loaded from: classes4.dex */
public final class e6b extends p9 {
    public final Object b;

    public /* synthetic */ e6b(liq liqVar) {
        super(liqVar);
        this.b = liqVar;
    }

    public i0e G(Uri uri) {
        uri.getClass();
        jp3 a = ((ip3) this.b).a();
        k0e k0eVar = new k0e();
        nb7 nb7Var = new nb7(uri, 0L, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 1);
        ngr ngrVar = new ngr(a);
        cfg.f.getAndIncrement();
        ngrVar.b = 0L;
        kb7 kb7Var = new kb7(ngrVar, nb7Var);
        try {
            kb7Var.a();
            Uri uri2 = ngrVar.a.getUri();
            uri2.getClass();
            Object o = k0eVar.o(uri2, kb7Var);
            dvt.g(kb7Var);
            o.getClass();
            return (i0e) o;
        } catch (Throwable th) {
            dvt.g(kb7Var);
            throw th;
        }
    }

    public tr3 H(Uri uri) {
        uri.getClass();
        return s(b3i.f.f(new nb7(uri, 0L, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 1)));
    }

    public e6b(liq liqVar, ip3 ip3Var) {
        super(liqVar);
        this.b = ip3Var;
    }
}
