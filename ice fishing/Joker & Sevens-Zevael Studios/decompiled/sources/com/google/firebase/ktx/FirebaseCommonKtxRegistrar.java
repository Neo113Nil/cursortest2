package com.google.firebase.ktx;

import ac.a;
import bc.n;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;
import k7.c;
import k7.d;
import l7.b;
import l7.j;
import l7.r;
import yc.u;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
@a
/* loaded from: classes.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<b> getComponents() {
        l7.a a6 = b.a(new r(k7.a.class, u.class));
        a6.a(new j(new r(k7.a.class, Executor.class), 1, 0));
        a6.f4212g = c8.a.f1288h;
        b c3 = a6.c();
        l7.a a8 = b.a(new r(c.class, u.class));
        a8.a(new j(new r(c.class, Executor.class), 1, 0));
        a8.f4212g = c8.a.f1289i;
        b c7 = a8.c();
        l7.a a10 = b.a(new r(k7.b.class, u.class));
        a10.a(new j(new r(k7.b.class, Executor.class), 1, 0));
        a10.f4212g = c8.a.f1290j;
        b c10 = a10.c();
        l7.a a11 = b.a(new r(d.class, u.class));
        a11.a(new j(new r(d.class, Executor.class), 1, 0));
        a11.f4212g = c8.a.f1291k;
        return n.L(c3, c7, c10, a11.c());
    }
}
