package androidx.datastore.preferences.protobuf;

import defpackage.wzh;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
final class k implements d1 {
    public final j a;

    public k(j jVar) {
        Charset charset = u.a;
        this.a = jVar;
        jVar.a = this;
    }

    public final void a(int i, g gVar) {
        this.a.o(i, gVar);
    }

    public final void b(int i, Object obj, r0 r0Var) {
        j jVar = this.a;
        jVar.A(i, 3);
        r0Var.h((wzh) obj, jVar.a);
        jVar.A(i, 4);
    }
}
