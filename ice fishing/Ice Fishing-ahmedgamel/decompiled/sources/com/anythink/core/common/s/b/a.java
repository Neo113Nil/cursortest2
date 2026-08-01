package com.anythink.core.common.s.b;

import java.util.Map;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final c f16391a;

    /* renamed from: b, reason: collision with root package name */
    private final f f16392b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f16393c;

    public a(c cVar, f fVar) {
        this.f16391a = cVar;
        this.f16392b = fVar;
    }

    public final void a() {
        if (this.f16393c) {
            return;
        }
        c cVar = this.f16391a;
        if (cVar == null || !cVar.c()) {
            this.f16393c = true;
            f fVar = this.f16392b;
            if (fVar == null || this.f16391a == null) {
                return;
            }
            Map<String, Object> a9 = fVar.a();
            if (a9 == null || a9.isEmpty()) {
                this.f16391a.d();
                return;
            }
            this.f16392b.c();
            for (String str : a9.keySet()) {
                com.anythink.core.common.s.b.a();
                if (!com.anythink.core.common.s.b.a(str) && !this.f16391a.a(str)) {
                    this.f16391a.a(str, a9.get(str));
                }
            }
            this.f16391a.d();
            this.f16392b.b();
        }
    }
}
