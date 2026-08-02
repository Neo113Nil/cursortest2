package com.anythink.basead.b.b;

import com.anythink.core.common.h.bj;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.h.y;

/* loaded from: classes.dex */
public class k {

    /* renamed from: b, reason: collision with root package name */
    private w f6630b;

    /* renamed from: c, reason: collision with root package name */
    private x f6631c;

    /* renamed from: d, reason: collision with root package name */
    private com.anythink.basead.d.j f6632d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f6633e;

    /* renamed from: a, reason: collision with root package name */
    private final String f6629a = "k";

    /* renamed from: f, reason: collision with root package name */
    private boolean f6634f = false;

    public k(w wVar, x xVar) {
        y yVar;
        this.f6630b = wVar;
        this.f6631c = xVar;
        this.f6633e = false;
        if (xVar == null || (yVar = xVar.f14954o) == null) {
            return;
        }
        this.f6633e = yVar.aa() != 2;
    }

    public final void a(com.anythink.basead.d.j jVar) {
        this.f6632d = jVar;
    }

    public final void b() {
        if (this.f6632d == null) {
            return;
        }
        if (this.f6633e || !this.f6634f) {
            this.f6634f = true;
            w wVar = this.f6630b;
            if (wVar == null || !(wVar instanceof bj) || !((bj) wVar).ay() || this.f6630b.r() == null || this.f6630b.r().bN() == 2) {
                com.anythink.basead.b.b.a(9, this.f6630b, this.f6632d);
            }
        }
    }

    public final com.anythink.basead.d.j a() {
        return this.f6632d;
    }
}
