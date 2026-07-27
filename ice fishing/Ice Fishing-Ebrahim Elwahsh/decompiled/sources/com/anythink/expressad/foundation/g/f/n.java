package com.anythink.expressad.foundation.g.f;

import android.content.Context;
import com.anythink.core.common.d.t;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: c, reason: collision with root package name */
    private static n f19559c;

    /* renamed from: a, reason: collision with root package name */
    private k f19560a;

    /* renamed from: b, reason: collision with root package name */
    private com.anythink.expressad.foundation.g.f.d.b f19561b;

    private n() {
    }

    public static void a(Context context) {
        if (f19559c == null) {
            n nVar = new n();
            f19559c = nVar;
            nVar.f19560a = new k(context.getApplicationContext());
            f19559c.f19561b = new com.anythink.expressad.foundation.g.f.d.b(b());
        }
    }

    private static k b() {
        n nVar = f19559c;
        if (nVar != null) {
            k kVar = nVar.f19560a;
            if (kVar != null) {
                return kVar;
            }
            nVar.f19560a = new k(t.b().g());
            return f19559c.f19560a;
        }
        n nVar2 = new n();
        f19559c = nVar2;
        if (nVar2.f19560a == null) {
            nVar2.f19560a = new k(t.b().g());
        }
        return f19559c.f19560a;
    }

    private static void c() {
        com.anythink.expressad.foundation.g.f.d.b bVar;
        n nVar = f19559c;
        if (nVar == null || (bVar = nVar.f19561b) == null) {
            return;
        }
        bVar.a();
        f19559c.f19561b = null;
    }

    public static void a(j jVar) {
        b().a(jVar);
    }

    public static com.anythink.expressad.foundation.g.f.d.b a() {
        n nVar = f19559c;
        if (nVar != null) {
            com.anythink.expressad.foundation.g.f.d.b bVar = nVar.f19561b;
            if (bVar != null) {
                return bVar;
            }
            nVar.f19561b = new com.anythink.expressad.foundation.g.f.d.b(b());
            return f19559c.f19561b;
        }
        n nVar2 = new n();
        f19559c = nVar2;
        if (nVar2.f19561b == null) {
            nVar2.f19561b = new com.anythink.expressad.foundation.g.f.d.b(b());
        }
        return f19559c.f19561b;
    }
}
