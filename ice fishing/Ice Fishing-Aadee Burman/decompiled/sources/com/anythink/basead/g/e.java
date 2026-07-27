package com.anythink.basead.g;

import com.anythink.core.common.d.t;
import com.anythink.core.common.h.n;
import com.anythink.core.common.h.r;
import com.anythink.core.common.h.w;
import com.anythink.core.common.q;

/* loaded from: classes.dex */
public abstract class e implements a {

    /* renamed from: a, reason: collision with root package name */
    w f8977a;

    /* renamed from: b, reason: collision with root package name */
    n f8978b;

    /* renamed from: e, reason: collision with root package name */
    private int f8981e = 0;

    /* renamed from: c, reason: collision with root package name */
    boolean f8979c = false;

    /* renamed from: d, reason: collision with root package name */
    boolean f8980d = false;

    public e(w wVar, n nVar) {
        this.f8977a = wVar;
        this.f8978b = nVar;
    }

    private void a() {
        w wVar = this.f8977a;
        if (wVar instanceof r) {
            r rVar = (r) wVar;
            if (rVar.f() == 1) {
                com.anythink.core.common.a.d.a().b(rVar);
                if (this.f8978b == null || this.f8979c) {
                    return;
                }
                this.f8979c = true;
                com.anythink.core.common.a.f.a().a(this.f8978b.aI(), rVar);
            }
        }
    }

    private void b() {
        w wVar = this.f8977a;
        if (wVar instanceof r) {
            r rVar = (r) wVar;
            if (rVar.f() != 1 || this.f8978b == null || this.f8980d) {
                return;
            }
            this.f8980d = true;
            com.anythink.core.common.a.f.a().b(this.f8978b.aI(), rVar);
        }
    }

    @Override // com.anythink.basead.g.a
    public void onAdClick(j jVar) {
        this.f8981e++;
        w wVar = this.f8977a;
        if (wVar instanceof r) {
            r rVar = (r) wVar;
            if (rVar.f() == 1 && this.f8978b != null && !this.f8980d) {
                this.f8980d = true;
                com.anythink.core.common.a.f.a().b(this.f8978b.aI(), rVar);
            }
        }
        n nVar = this.f8978b;
        if (nVar != null) {
            nVar.I(jVar.f8982a);
            this.f8978b.J(jVar.f8983b);
            this.f8978b.W(jVar.f8986e);
            if (this.f8977a.r() == null || this.f8981e > this.f8977a.r().bI()) {
                this.f8978b.d(false);
            } else {
                this.f8978b.d(true);
            }
        }
        q.a(t.b().g()).a(this.f8977a, this.f8978b, 6);
    }

    @Override // com.anythink.basead.g.a
    public void onAdShow(j jVar) {
        w wVar = this.f8977a;
        if (wVar instanceof r) {
            r rVar = (r) wVar;
            if (rVar.f() == 1) {
                com.anythink.core.common.a.d.a().b(rVar);
                if (this.f8978b != null && !this.f8979c) {
                    this.f8979c = true;
                    com.anythink.core.common.a.f.a().a(this.f8978b.aI(), rVar);
                }
            }
        }
        n nVar = this.f8978b;
        if (nVar != null) {
            nVar.U(this.f8977a.Q());
            this.f8978b.W(jVar.f8986e);
        }
        q.a(t.b().g()).a(this.f8977a, this.f8978b, 4);
    }

    public void updateTrackingInfo(n nVar) {
        this.f8978b = nVar;
    }
}
