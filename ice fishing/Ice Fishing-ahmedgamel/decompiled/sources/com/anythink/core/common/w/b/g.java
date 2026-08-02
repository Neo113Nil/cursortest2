package com.anythink.core.common.w.b;

import java.util.List;

/* loaded from: classes.dex */
public final class g implements a {

    /* renamed from: a, reason: collision with root package name */
    private final List<c> f17827a;

    /* renamed from: b, reason: collision with root package name */
    private final h f17828b;

    /* renamed from: c, reason: collision with root package name */
    private final int f17829c;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f17830d;

    public g(List<c> list, h hVar, int i) {
        this.f17827a = list;
        this.f17828b = hVar;
        this.f17829c = i;
    }

    private void b(h hVar) {
        if (this.f17830d || hVar == null || hVar.f17834d == null) {
            return;
        }
        this.f17830d = true;
        hVar.f17834d.a();
    }

    @Override // com.anythink.core.common.w.b.a
    public final h a() {
        return this.f17828b;
    }

    @Override // com.anythink.core.common.w.b.a
    public final void a(h hVar) {
        try {
            List<c> list = this.f17827a;
            if (list == null || this.f17829c < list.size()) {
                this.f17827a.get(this.f17829c).a(new g(this.f17827a, hVar, this.f17829c + 1));
            } else {
                b(hVar);
            }
        } catch (Throwable unused) {
            b(hVar);
        }
    }
}
