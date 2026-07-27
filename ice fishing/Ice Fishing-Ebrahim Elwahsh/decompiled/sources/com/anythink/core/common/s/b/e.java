package com.anythink.core.common.s.b;

import com.anythink.core.common.d.u;
import com.anythink.core.common.s.c;
import java.util.Map;

/* loaded from: classes.dex */
public class e implements com.anythink.core.common.s.a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f16558a = "e";

    /* renamed from: b, reason: collision with root package name */
    private c f16559b;

    /* renamed from: c, reason: collision with root package name */
    private f f16560c;

    /* renamed from: d, reason: collision with root package name */
    private a f16561d;

    /* renamed from: e, reason: collision with root package name */
    private final com.anythink.core.common.s.c f16562e;

    /* renamed from: f, reason: collision with root package name */
    private String f16563f;

    /* renamed from: g, reason: collision with root package name */
    private int f16564g;

    public e(com.anythink.core.common.s.c cVar) {
        this.f16562e = cVar;
        this.f16563f = cVar.b();
        this.f16564g = cVar.c();
        this.f16559b = d.a(cVar);
        f b9 = d.b(cVar);
        this.f16560c = b9;
        this.f16561d = new a(this.f16559b, b9);
        cVar.d();
    }

    private c d() {
        com.anythink.core.common.s.c cVar = this.f16562e;
        if (cVar != null) {
            return a(cVar.d());
        }
        return null;
    }

    private boolean e(String str) {
        c d2 = d();
        return d2 != null && d2.a(str);
    }

    @Override // com.anythink.core.common.s.a
    public final <V> void a(String str, V v6) {
        com.anythink.core.common.s.c cVar = this.f16562e;
        if (cVar != null) {
            a(str, v6, cVar.d());
        } else {
            a(str, v6, 1);
        }
    }

    @Override // com.anythink.core.common.s.a
    public final <V> V b(String str, V v6) {
        f fVar;
        if (c(str)) {
            c d2 = d();
            return d2 != null ? (V) d2.b(str, v6) : v6;
        }
        if (this.f16564g == 0 && (fVar = this.f16560c) != null) {
            return (V) fVar.b(str, v6);
        }
        c cVar = this.f16559b;
        if (cVar == null) {
            return v6;
        }
        V v9 = (V) cVar.b(str, v6);
        if ((v9 != null && v9 != v6) || this.f16559b.c()) {
            return v9;
        }
        f fVar2 = this.f16560c;
        return (V) (fVar2 != null ? fVar2.b(str, v6) : null);
    }

    public final void c() {
        a aVar = this.f16561d;
        if (aVar == null || this.f16564g != 1) {
            return;
        }
        aVar.a();
    }

    private void d(String str) {
        c d2 = d();
        if (d2 != null) {
            d2.b(str);
        }
    }

    private boolean c(String str) {
        com.anythink.core.common.s.b.a();
        return com.anythink.core.common.s.b.a(str) && u.b.f13004a.equals(this.f16563f);
    }

    @Override // com.anythink.core.common.s.a
    public final <V> void a(String str, V v6, int i) {
        c cVar;
        if (c(str)) {
            b(str, v6, i);
            return;
        }
        if (this.f16564g == 1 && (cVar = this.f16559b) != null) {
            cVar.a(str, v6, i);
            return;
        }
        f fVar = this.f16560c;
        if (fVar != null) {
            fVar.a(str, v6, i);
        }
    }

    private <V> V c(String str, V v6) {
        c d2 = d();
        return d2 != null ? (V) d2.b(str, v6) : v6;
    }

    @Override // com.anythink.core.common.s.a
    public final Map<String, Object> a() {
        c cVar;
        if (this.f16564g == 1 && (cVar = this.f16559b) != null && cVar.c()) {
            return this.f16559b.a();
        }
        f fVar = this.f16560c;
        if (fVar != null) {
            return fVar.a();
        }
        return null;
    }

    @Override // com.anythink.core.common.s.a
    public final void b(String str) {
        c cVar;
        if (c(str)) {
            c d2 = d();
            if (d2 != null) {
                d2.b(str);
                return;
            }
            return;
        }
        if (this.f16564g == 1 && (cVar = this.f16559b) != null && cVar.c()) {
            this.f16559b.b(str);
            return;
        }
        f fVar = this.f16560c;
        if (fVar != null) {
            fVar.b(str);
        }
    }

    @Override // com.anythink.core.common.s.a
    public final boolean a(String str) {
        c cVar;
        if (c(str)) {
            c d2 = d();
            return d2 != null && d2.a(str);
        }
        if (this.f16564g == 1 && (cVar = this.f16559b) != null && cVar.c()) {
            return this.f16559b.a(str);
        }
        f fVar = this.f16560c;
        if (fVar != null) {
            return fVar.a(str);
        }
        return false;
    }

    @Override // com.anythink.core.common.s.a
    public final void b() {
        c cVar;
        if (this.f16564g == 1 && (cVar = this.f16559b) != null && cVar.c()) {
            this.f16559b.b();
            return;
        }
        f fVar = this.f16560c;
        if (fVar != null) {
            fVar.b();
        }
    }

    private void a(com.anythink.core.common.s.c cVar) {
        this.f16563f = cVar.b();
        this.f16564g = cVar.c();
        this.f16559b = d.a(cVar);
        f b9 = d.b(cVar);
        this.f16560c = b9;
        this.f16561d = new a(this.f16559b, b9);
    }

    private <V> void b(String str, V v6, int i) {
        c a9 = a(i);
        if (a9 != null) {
            a9.a(str, v6);
        }
    }

    private c a(int i) {
        if (this.f16562e == null) {
            return null;
        }
        return d.a(new c.a().a(this.f16562e.a()).a(u.b.f13019q).a(this.f16562e.c()).b(i).a());
    }
}
