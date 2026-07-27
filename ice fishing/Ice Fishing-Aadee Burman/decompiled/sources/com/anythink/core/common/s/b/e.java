package com.anythink.core.common.s.b;

import com.anythink.core.common.d.u;
import com.anythink.core.common.s.c;
import java.util.Map;

/* loaded from: classes.dex */
public class e implements com.anythink.core.common.s.a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f16400a = "e";

    /* renamed from: b, reason: collision with root package name */
    private c f16401b;

    /* renamed from: c, reason: collision with root package name */
    private f f16402c;

    /* renamed from: d, reason: collision with root package name */
    private a f16403d;

    /* renamed from: e, reason: collision with root package name */
    private final com.anythink.core.common.s.c f16404e;

    /* renamed from: f, reason: collision with root package name */
    private String f16405f;

    /* renamed from: g, reason: collision with root package name */
    private int f16406g;

    public e(com.anythink.core.common.s.c cVar) {
        this.f16404e = cVar;
        this.f16405f = cVar.b();
        this.f16406g = cVar.c();
        this.f16401b = d.a(cVar);
        f b9 = d.b(cVar);
        this.f16402c = b9;
        this.f16403d = new a(this.f16401b, b9);
        cVar.d();
    }

    private c d() {
        com.anythink.core.common.s.c cVar = this.f16404e;
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
    public final <V> void a(String str, V v9) {
        com.anythink.core.common.s.c cVar = this.f16404e;
        if (cVar != null) {
            a(str, v9, cVar.d());
        } else {
            a(str, v9, 1);
        }
    }

    @Override // com.anythink.core.common.s.a
    public final <V> V b(String str, V v9) {
        f fVar;
        if (c(str)) {
            c d2 = d();
            return d2 != null ? (V) d2.b(str, v9) : v9;
        }
        if (this.f16406g == 0 && (fVar = this.f16402c) != null) {
            return (V) fVar.b(str, v9);
        }
        c cVar = this.f16401b;
        if (cVar == null) {
            return v9;
        }
        V v10 = (V) cVar.b(str, v9);
        if ((v10 != null && v10 != v9) || this.f16401b.c()) {
            return v10;
        }
        f fVar2 = this.f16402c;
        return (V) (fVar2 != null ? fVar2.b(str, v9) : null);
    }

    public final void c() {
        a aVar = this.f16403d;
        if (aVar == null || this.f16406g != 1) {
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
        return com.anythink.core.common.s.b.a(str) && u.b.f12847a.equals(this.f16405f);
    }

    @Override // com.anythink.core.common.s.a
    public final <V> void a(String str, V v9, int i) {
        c cVar;
        if (c(str)) {
            b(str, v9, i);
            return;
        }
        if (this.f16406g == 1 && (cVar = this.f16401b) != null) {
            cVar.a(str, v9, i);
            return;
        }
        f fVar = this.f16402c;
        if (fVar != null) {
            fVar.a(str, v9, i);
        }
    }

    private <V> V c(String str, V v9) {
        c d2 = d();
        return d2 != null ? (V) d2.b(str, v9) : v9;
    }

    @Override // com.anythink.core.common.s.a
    public final Map<String, Object> a() {
        c cVar;
        if (this.f16406g == 1 && (cVar = this.f16401b) != null && cVar.c()) {
            return this.f16401b.a();
        }
        f fVar = this.f16402c;
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
        if (this.f16406g == 1 && (cVar = this.f16401b) != null && cVar.c()) {
            this.f16401b.b(str);
            return;
        }
        f fVar = this.f16402c;
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
        if (this.f16406g == 1 && (cVar = this.f16401b) != null && cVar.c()) {
            return this.f16401b.a(str);
        }
        f fVar = this.f16402c;
        if (fVar != null) {
            return fVar.a(str);
        }
        return false;
    }

    @Override // com.anythink.core.common.s.a
    public final void b() {
        c cVar;
        if (this.f16406g == 1 && (cVar = this.f16401b) != null && cVar.c()) {
            this.f16401b.b();
            return;
        }
        f fVar = this.f16402c;
        if (fVar != null) {
            fVar.b();
        }
    }

    private void a(com.anythink.core.common.s.c cVar) {
        this.f16405f = cVar.b();
        this.f16406g = cVar.c();
        this.f16401b = d.a(cVar);
        f b9 = d.b(cVar);
        this.f16402c = b9;
        this.f16403d = new a(this.f16401b, b9);
    }

    private <V> void b(String str, V v9, int i) {
        c a9 = a(i);
        if (a9 != null) {
            a9.a(str, v9);
        }
    }

    private c a(int i) {
        if (this.f16404e == null) {
            return null;
        }
        return d.a(new c.a().a(this.f16404e.a()).a(u.b.f12862q).a(this.f16404e.c()).b(i).a());
    }
}
