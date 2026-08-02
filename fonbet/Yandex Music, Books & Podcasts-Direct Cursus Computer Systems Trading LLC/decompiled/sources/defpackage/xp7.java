package defpackage;

import java.util.List;
import java.util.UUID;
import kotlin.Pair;

/* loaded from: classes4.dex */
public final class xp7 implements atj {
    @Override // defpackage.atj
    public final List b(String str) {
        return t75.c(new Pair("X-Request-ID", eta.e()));
    }

    @Override // defpackage.b0j
    public final mif c(e1j e1jVar) {
        e1jVar.getClass();
        q0j method = e1jVar.method();
        String b = e1jVar.b();
        z9h d = e1jVar.d();
        z9h a = e1jVar.a();
        z9h c = e1jVar.c();
        c.getClass();
        String uuid = UUID.randomUUID().toString();
        uuid.getClass();
        c.j("X-Request-ID", uuid);
        return nif.d(new uyo(method, b, d, a, c, e1jVar.encoding()));
    }

    @Override // defpackage.atj
    public final void d() {
    }

    @Override // defpackage.wib
    public final void a(nnd nndVar) {
    }
}
