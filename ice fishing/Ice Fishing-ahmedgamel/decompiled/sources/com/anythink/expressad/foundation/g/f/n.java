package com.anythink.expressad.foundation.g.f;

import android.content.Context;
import com.anythink.core.common.d.t;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: c, reason: collision with root package name */
    private static n f19401c;

    /* renamed from: a, reason: collision with root package name */
    private k f19402a;

    /* renamed from: b, reason: collision with root package name */
    private com.anythink.expressad.foundation.g.f.d.b f19403b;

    private n() {
    }

    public static void a(Context context) {
        if (f19401c == null) {
            n nVar = new n();
            f19401c = nVar;
            nVar.f19402a = new k(context.getApplicationContext());
            f19401c.f19403b = new com.anythink.expressad.foundation.g.f.d.b(b());
        }
    }

    private static k b() {
        n nVar = f19401c;
        if (nVar != null) {
            k kVar = nVar.f19402a;
            if (kVar != null) {
                return kVar;
            }
            nVar.f19402a = new k(t.b().g());
            return f19401c.f19402a;
        }
        n nVar2 = new n();
        f19401c = nVar2;
        if (nVar2.f19402a == null) {
            nVar2.f19402a = new k(t.b().g());
        }
        return f19401c.f19402a;
    }

    private static void c() {
        com.anythink.expressad.foundation.g.f.d.b bVar;
        n nVar = f19401c;
        if (nVar == null || (bVar = nVar.f19403b) == null) {
            return;
        }
        bVar.a();
        f19401c.f19403b = null;
    }

    public static void a(j jVar) {
        b().a(jVar);
    }

    public static com.anythink.expressad.foundation.g.f.d.b a() {
        n nVar = f19401c;
        if (nVar != null) {
            com.anythink.expressad.foundation.g.f.d.b bVar = nVar.f19403b;
            if (bVar != null) {
                return bVar;
            }
            nVar.f19403b = new com.anythink.expressad.foundation.g.f.d.b(b());
            return f19401c.f19403b;
        }
        n nVar2 = new n();
        f19401c = nVar2;
        if (nVar2.f19403b == null) {
            nVar2.f19403b = new com.anythink.expressad.foundation.g.f.d.b(b());
        }
        return f19401c.f19403b;
    }
}
