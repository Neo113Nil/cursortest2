package com.anythink.basead.g;

import com.anythink.core.common.h.n;
import com.anythink.core.common.h.w;

/* loaded from: classes.dex */
public abstract class g extends e implements k {
    public g(w wVar, n nVar) {
        super(wVar, nVar);
    }

    @Override // com.anythink.basead.g.e, com.anythink.basead.g.a
    public void onAdShow(j jVar) {
        super.onAdShow(jVar);
        n nVar = this.f8978b;
        if (nVar == null || jVar == null) {
            return;
        }
        String aK = nVar.aK();
        aK.getClass();
        if (aK.equals("1")) {
            this.f8978b.t(jVar.f8984c);
            this.f8978b.aa(jVar.f8988g);
            return;
        }
        if (aK.equals("3")) {
            this.f8978b.e(jVar.f8985d);
            this.f8978b.aa(jVar.f8988g);
            if (jVar.f8987f) {
                if (jVar.f8985d == 1) {
                    this.f8978b.Z(3);
                    return;
                } else {
                    this.f8978b.Z(1);
                    return;
                }
            }
            if (jVar.f8985d == 1) {
                this.f8978b.Z(4);
            } else {
                this.f8978b.Z(2);
            }
        }
    }
}
