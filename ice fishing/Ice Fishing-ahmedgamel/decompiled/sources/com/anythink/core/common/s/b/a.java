package com.anythink.core.common.s.b;

import java.util.Map;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final c f17178a;

    /* renamed from: b, reason: collision with root package name */
    private final f f17179b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f17180c;

    public a(c cVar, f fVar) {
        this.f17178a = cVar;
        this.f17179b = fVar;
    }

    public final void a() {
        if (this.f17180c) {
            return;
        }
        c cVar = this.f17178a;
        if (cVar == null || !cVar.c()) {
            this.f17180c = true;
            f fVar = this.f17179b;
            if (fVar == null || this.f17178a == null) {
                return;
            }
            Map<String, Object> a9 = fVar.a();
            if (a9 == null || a9.isEmpty()) {
                this.f17178a.d();
                return;
            }
            this.f17179b.c();
            for (String str : a9.keySet()) {
                com.anythink.core.common.s.b.a();
                if (!com.anythink.core.common.s.b.a(str) && !this.f17178a.a(str)) {
                    this.f17178a.a(str, a9.get(str));
                }
            }
            this.f17178a.d();
            this.f17179b.b();
        }
    }
}
