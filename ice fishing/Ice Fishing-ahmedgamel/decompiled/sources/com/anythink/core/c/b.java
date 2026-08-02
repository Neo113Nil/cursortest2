package com.anythink.core.c;

import com.anythink.core.c.a.d;
import com.anythink.core.c.b.c;
import com.anythink.core.common.h.ar;
import com.anythink.core.common.h.bu;
import com.anythink.core.common.h.bv;
import com.anythink.core.d.f;
import com.anythink.core.d.l;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static volatile b f12818a;

    /* renamed from: b, reason: collision with root package name */
    private final c f12819b = new c();

    private b() {
    }

    public static b a() {
        if (f12818a == null) {
            synchronized (b.class) {
                try {
                    if (f12818a == null) {
                        f12818a = new b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f12818a;
    }

    public final void b(String str) {
        this.f12819b.b(str);
    }

    public final void a(String str, String str2, int i, ar arVar, bv bvVar) {
        this.f12819b.a(str, str2, i, arVar != null ? arVar.b() : null, bvVar);
    }

    public final void a(bu buVar, bv bvVar) {
        this.f12819b.a(buVar, bvVar);
    }

    public final JSONObject a(String str) {
        return this.f12819b.a(str, 0);
    }

    public final JSONObject a(String str, int i) {
        return this.f12819b.a(str, 4, i);
    }

    public final d a(String str, l lVar, f fVar) {
        return this.f12819b.a(str, lVar.ay(), fVar);
    }
}
