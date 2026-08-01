package com.anythink.basead.f;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.basead.f.c;
import com.anythink.core.common.h.r;
import com.anythink.core.common.h.x;

/* loaded from: classes.dex */
public final class f extends c {
    boolean i;

    public f(Context context, c.b bVar, x xVar, boolean z3) {
        super(context, bVar, xVar);
        this.i = z3;
    }

    public final void a(final com.anythink.basead.g.d dVar) {
        a(new com.anythink.basead.g.c() { // from class: com.anythink.basead.f.f.1
            @Override // com.anythink.basead.g.c
            public final void onAdCacheLoaded() {
                a a9 = f.this.a();
                com.anythink.basead.g.d dVar2 = dVar;
                if (dVar2 != null) {
                    dVar2.onNativeAdLoaded(a9);
                }
            }

            @Override // com.anythink.basead.g.c
            public final void onAdDataLoaded() {
            }

            @Override // com.anythink.basead.g.c
            public final void onAdLoadFailed(com.anythink.basead.d.f fVar) {
                com.anythink.basead.g.d dVar2 = dVar;
                if (dVar2 != null) {
                    dVar2.onNativeAdLoadError(fVar);
                }
            }
        });
    }

    public final a a() {
        if (!TextUtils.isEmpty(((r) this.f8894d).d())) {
            com.anythink.basead.f.b.c cVar = this.f8898h;
            if (cVar != null) {
                return cVar.a(this.f8891a, this.f8894d, this.f8892b, this.i);
            }
            return null;
        }
        if (TextUtils.equals(this.f8894d.aD(), com.anythink.basead.f.d.b.f8942a)) {
            com.anythink.basead.f.b.c cVar2 = this.f8898h;
            if (cVar2 != null) {
                return cVar2.a(this.f8891a, this.f8894d, this.f8892b, this.i);
            }
            return null;
        }
        com.anythink.basead.f.b.c cVar3 = this.f8898h;
        if (cVar3 != null) {
            return cVar3.a(this.f8891a, this.f8894d, this.f8892b, this.i);
        }
        return null;
    }
}
