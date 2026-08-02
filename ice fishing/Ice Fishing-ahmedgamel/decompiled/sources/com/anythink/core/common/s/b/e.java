package com.anythink.core.common.s.b;

import com.anythink.core.common.d.u;
import com.anythink.core.common.s.c;
import java.util.Map;

/* loaded from: classes.dex */
public class e implements com.anythink.core.common.s.a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f17187a = "e";

    /* renamed from: b, reason: collision with root package name */
    private c f17188b;

    /* renamed from: c, reason: collision with root package name */
    private f f17189c;

    /* renamed from: d, reason: collision with root package name */
    private a f17190d;

    /* renamed from: e, reason: collision with root package name */
    private final com.anythink.core.common.s.c f17191e;

    /* renamed from: f, reason: collision with root package name */
    private String f17192f;

    /* renamed from: g, reason: collision with root package name */
    private int f17193g;

    public e(com.anythink.core.common.s.c cVar) {
        this.f17191e = cVar;
        this.f17192f = cVar.b();
        this.f17193g = cVar.c();
        this.f17188b = d.a(cVar);
        f b9 = d.b(cVar);
        this.f17189c = b9;
        this.f17190d = new a(this.f17188b, b9);
        cVar.d();
    }

    private c d() {
        com.anythink.core.common.s.c cVar = this.f17191e;
        if (cVar != null) {
            return a(cVar.d());
        }
        return null;
    }

    private boolean e(String str) {
        c d9 = d();
        return d9 != null && d9.a(str);
    }

    @Override // com.anythink.core.common.s.a
    public final <V> void a(String str, V v9) {
        com.anythink.core.common.s.c cVar = this.f17191e;
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
            c d9 = d();
            return d9 != null ? (V) d9.b(str, v9) : v9;
        }
        if (this.f17193g == 0 && (fVar = this.f17189c) != null) {
            return (V) fVar.b(str, v9);
        }
        c cVar = this.f17188b;
        if (cVar == null) {
            return v9;
        }
        V v10 = (V) cVar.b(str, v9);
        if ((v10 != null && v10 != v9) || this.f17188b.c()) {
            return v10;
        }
        f fVar2 = this.f17189c;
        return (V) (fVar2 != null ? fVar2.b(str, v9) : null);
    }

    public final void c() {
        a aVar = this.f17190d;
        if (aVar == null || this.f17193g != 1) {
            return;
        }
        aVar.a();
    }

    private void d(String str) {
        c d9 = d();
        if (d9 != null) {
            d9.b(str);
        }
    }

    private boolean c(String str) {
        com.anythink.core.common.s.b.a();
        return com.anythink.core.common.s.b.a(str) && u.b.f13633a.equals(this.f17192f);
    }

    @Override // com.anythink.core.common.s.a
    public final <V> void a(String str, V v9, int i) {
        c cVar;
        if (c(str)) {
            b(str, v9, i);
            return;
        }
        if (this.f17193g == 1 && (cVar = this.f17188b) != null) {
            cVar.a(str, v9, i);
            return;
        }
        f fVar = this.f17189c;
        if (fVar != null) {
            fVar.a(str, v9, i);
        }
    }

    private <V> V c(String str, V v9) {
        c d9 = d();
        return d9 != null ? (V) d9.b(str, v9) : v9;
    }

    @Override // com.anythink.core.common.s.a
    public final Map<String, Object> a() {
        c cVar;
        if (this.f17193g == 1 && (cVar = this.f17188b) != null && cVar.c()) {
            return this.f17188b.a();
        }
        f fVar = this.f17189c;
        if (fVar != null) {
            return fVar.a();
        }
        return null;
    }

    @Override // com.anythink.core.common.s.a
    public final void b(String str) {
        c cVar;
        if (c(str)) {
            c d9 = d();
            if (d9 != null) {
                d9.b(str);
                return;
            }
            return;
        }
        if (this.f17193g == 1 && (cVar = this.f17188b) != null && cVar.c()) {
            this.f17188b.b(str);
            return;
        }
        f fVar = this.f17189c;
        if (fVar != null) {
            fVar.b(str);
        }
    }

    @Override // com.anythink.core.common.s.a
    public final boolean a(String str) {
        c cVar;
        if (c(str)) {
            c d9 = d();
            return d9 != null && d9.a(str);
        }
        if (this.f17193g == 1 && (cVar = this.f17188b) != null && cVar.c()) {
            return this.f17188b.a(str);
        }
        f fVar = this.f17189c;
        if (fVar != null) {
            return fVar.a(str);
        }
        return false;
    }

    @Override // com.anythink.core.common.s.a
    public final void b() {
        c cVar;
        if (this.f17193g == 1 && (cVar = this.f17188b) != null && cVar.c()) {
            this.f17188b.b();
            return;
        }
        f fVar = this.f17189c;
        if (fVar != null) {
            fVar.b();
        }
    }

    private void a(com.anythink.core.common.s.c cVar) {
        this.f17192f = cVar.b();
        this.f17193g = cVar.c();
        this.f17188b = d.a(cVar);
        f b9 = d.b(cVar);
        this.f17189c = b9;
        this.f17190d = new a(this.f17188b, b9);
    }

    private <V> void b(String str, V v9, int i) {
        c a9 = a(i);
        if (a9 != null) {
            a9.a(str, v9);
        }
    }

    private c a(int i) {
        if (this.f17191e == null) {
            return null;
        }
        return d.a(new c.a().a(this.f17191e.a()).a(u.b.f13648q).a(this.f17191e.c()).b(i).a());
    }
}
