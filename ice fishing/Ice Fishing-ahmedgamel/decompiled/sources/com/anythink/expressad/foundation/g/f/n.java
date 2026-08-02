package com.anythink.expressad.foundation.g.f;

import android.content.Context;
import com.anythink.core.common.d.t;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: c, reason: collision with root package name */
    private static n f20188c;

    /* renamed from: a, reason: collision with root package name */
    private k f20189a;

    /* renamed from: b, reason: collision with root package name */
    private com.anythink.expressad.foundation.g.f.d.b f20190b;

    private n() {
    }

    public static void a(Context context) {
        if (f20188c == null) {
            n nVar = new n();
            f20188c = nVar;
            nVar.f20189a = new k(context.getApplicationContext());
            f20188c.f20190b = new com.anythink.expressad.foundation.g.f.d.b(b());
        }
    }

    private static k b() {
        n nVar = f20188c;
        if (nVar != null) {
            k kVar = nVar.f20189a;
            if (kVar != null) {
                return kVar;
            }
            nVar.f20189a = new k(t.b().g());
            return f20188c.f20189a;
        }
        n nVar2 = new n();
        f20188c = nVar2;
        if (nVar2.f20189a == null) {
            nVar2.f20189a = new k(t.b().g());
        }
        return f20188c.f20189a;
    }

    private static void c() {
        com.anythink.expressad.foundation.g.f.d.b bVar;
        n nVar = f20188c;
        if (nVar == null || (bVar = nVar.f20190b) == null) {
            return;
        }
        bVar.a();
        f20188c.f20190b = null;
    }

    public static void a(j jVar) {
        b().a(jVar);
    }

    public static com.anythink.expressad.foundation.g.f.d.b a() {
        n nVar = f20188c;
        if (nVar != null) {
            com.anythink.expressad.foundation.g.f.d.b bVar = nVar.f20190b;
            if (bVar != null) {
                return bVar;
            }
            nVar.f20190b = new com.anythink.expressad.foundation.g.f.d.b(b());
            return f20188c.f20190b;
        }
        n nVar2 = new n();
        f20188c = nVar2;
        if (nVar2.f20190b == null) {
            nVar2.f20190b = new com.anythink.expressad.foundation.g.f.d.b(b());
        }
        return f20188c.f20190b;
    }
}
