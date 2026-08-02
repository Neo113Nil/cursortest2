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
        n nVar = this.f9764b;
        if (nVar == null || jVar == null) {
            return;
        }
        String aK = nVar.aK();
        aK.getClass();
        if (aK.equals("1")) {
            this.f9764b.t(jVar.f9770c);
            this.f9764b.aa(jVar.f9774g);
            return;
        }
        if (aK.equals("3")) {
            this.f9764b.e(jVar.f9771d);
            this.f9764b.aa(jVar.f9774g);
            if (jVar.f9773f) {
                if (jVar.f9771d == 1) {
                    this.f9764b.Z(3);
                    return;
                } else {
                    this.f9764b.Z(1);
                    return;
                }
            }
            if (jVar.f9771d == 1) {
                this.f9764b.Z(4);
            } else {
                this.f9764b.Z(2);
            }
        }
    }
}
