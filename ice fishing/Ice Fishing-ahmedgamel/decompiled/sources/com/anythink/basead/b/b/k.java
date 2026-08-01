package com.anythink.basead.b.b;

import com.anythink.core.common.h.bj;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.h.y;

/* loaded from: classes.dex */
public class k {

    /* renamed from: b, reason: collision with root package name */
    private w f5844b;

    /* renamed from: c, reason: collision with root package name */
    private x f5845c;

    /* renamed from: d, reason: collision with root package name */
    private com.anythink.basead.d.j f5846d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f5847e;

    /* renamed from: a, reason: collision with root package name */
    private final String f5843a = "k";

    /* renamed from: f, reason: collision with root package name */
    private boolean f5848f = false;

    public k(w wVar, x xVar) {
        y yVar;
        this.f5844b = wVar;
        this.f5845c = xVar;
        this.f5847e = false;
        if (xVar == null || (yVar = xVar.f14168o) == null) {
            return;
        }
        this.f5847e = yVar.aa() != 2;
    }

    public final void a(com.anythink.basead.d.j jVar) {
        this.f5846d = jVar;
    }

    public final void b() {
        if (this.f5846d == null) {
            return;
        }
        if (this.f5847e || !this.f5848f) {
            this.f5848f = true;
            w wVar = this.f5844b;
            if (wVar == null || !(wVar instanceof bj) || !((bj) wVar).ay() || this.f5844b.r() == null || this.f5844b.r().bN() == 2) {
                com.anythink.basead.b.b.a(9, this.f5844b, this.f5846d);
            }
        }
    }

    public final com.anythink.basead.d.j a() {
        return this.f5846d;
    }
}
