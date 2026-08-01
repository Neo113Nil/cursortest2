package com.anythink.core.common.w.b;

import java.util.List;

/* loaded from: classes.dex */
public final class g implements a {

    /* renamed from: a, reason: collision with root package name */
    private final List<c> f17040a;

    /* renamed from: b, reason: collision with root package name */
    private final h f17041b;

    /* renamed from: c, reason: collision with root package name */
    private final int f17042c;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f17043d;

    public g(List<c> list, h hVar, int i) {
        this.f17040a = list;
        this.f17041b = hVar;
        this.f17042c = i;
    }

    private void b(h hVar) {
        if (this.f17043d || hVar == null || hVar.f17047d == null) {
            return;
        }
        this.f17043d = true;
        hVar.f17047d.a();
    }

    @Override // com.anythink.core.common.w.b.a
    public final h a() {
        return this.f17041b;
    }

    @Override // com.anythink.core.common.w.b.a
    public final void a(h hVar) {
        try {
            List<c> list = this.f17040a;
            if (list == null || this.f17042c < list.size()) {
                this.f17040a.get(this.f17042c).a(new g(this.f17040a, hVar, this.f17042c + 1));
            } else {
                b(hVar);
            }
        } catch (Throwable unused) {
            b(hVar);
        }
    }
}
