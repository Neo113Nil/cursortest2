package com.anythink.basead.g;

import com.anythink.core.common.d.t;
import com.anythink.core.common.h.n;
import com.anythink.core.common.h.r;
import com.anythink.core.common.h.w;
import com.anythink.core.common.q;

/* loaded from: classes.dex */
public abstract class e implements a {

    /* renamed from: a, reason: collision with root package name */
    w f9763a;

    /* renamed from: b, reason: collision with root package name */
    n f9764b;

    /* renamed from: e, reason: collision with root package name */
    private int f9767e = 0;

    /* renamed from: c, reason: collision with root package name */
    boolean f9765c = false;

    /* renamed from: d, reason: collision with root package name */
    boolean f9766d = false;

    public e(w wVar, n nVar) {
        this.f9763a = wVar;
        this.f9764b = nVar;
    }

    private void a() {
        w wVar = this.f9763a;
        if (wVar instanceof r) {
            r rVar = (r) wVar;
            if (rVar.f() == 1) {
                com.anythink.core.common.a.d.a().b(rVar);
                if (this.f9764b == null || this.f9765c) {
                    return;
                }
                this.f9765c = true;
                com.anythink.core.common.a.f.a().a(this.f9764b.aI(), rVar);
            }
        }
    }

    private void b() {
        w wVar = this.f9763a;
        if (wVar instanceof r) {
            r rVar = (r) wVar;
            if (rVar.f() != 1 || this.f9764b == null || this.f9766d) {
                return;
            }
            this.f9766d = true;
            com.anythink.core.common.a.f.a().b(this.f9764b.aI(), rVar);
        }
    }

    @Override // com.anythink.basead.g.a
    public void onAdClick(j jVar) {
        this.f9767e++;
        w wVar = this.f9763a;
        if (wVar instanceof r) {
            r rVar = (r) wVar;
            if (rVar.f() == 1 && this.f9764b != null && !this.f9766d) {
                this.f9766d = true;
                com.anythink.core.common.a.f.a().b(this.f9764b.aI(), rVar);
            }
        }
        n nVar = this.f9764b;
        if (nVar != null) {
            nVar.I(jVar.f9768a);
            this.f9764b.J(jVar.f9769b);
            this.f9764b.W(jVar.f9772e);
            if (this.f9763a.r() == null || this.f9767e > this.f9763a.r().bI()) {
                this.f9764b.d(false);
            } else {
                this.f9764b.d(true);
            }
        }
        q.a(t.b().g()).a(this.f9763a, this.f9764b, 6);
    }

    @Override // com.anythink.basead.g.a
    public void onAdShow(j jVar) {
        w wVar = this.f9763a;
        if (wVar instanceof r) {
            r rVar = (r) wVar;
            if (rVar.f() == 1) {
                com.anythink.core.common.a.d.a().b(rVar);
                if (this.f9764b != null && !this.f9765c) {
                    this.f9765c = true;
                    com.anythink.core.common.a.f.a().a(this.f9764b.aI(), rVar);
                }
            }
        }
        n nVar = this.f9764b;
        if (nVar != null) {
            nVar.U(this.f9763a.Q());
            this.f9764b.W(jVar.f9772e);
        }
        q.a(t.b().g()).a(this.f9763a, this.f9764b, 4);
    }

    public void updateTrackingInfo(n nVar) {
        this.f9764b = nVar;
    }
}
