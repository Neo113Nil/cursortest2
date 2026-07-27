package com.anythink.basead.f;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.basead.f.c;
import com.anythink.core.common.h.r;
import com.anythink.core.common.h.x;

/* loaded from: classes.dex */
public final class f extends c {
    boolean i;

    public f(Context context, c.b bVar, x xVar, boolean z8) {
        super(context, bVar, xVar);
        this.i = z8;
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
        if (!TextUtils.isEmpty(((r) this.f9051d).d())) {
            com.anythink.basead.f.b.c cVar = this.f9055h;
            if (cVar != null) {
                return cVar.a(this.f9048a, this.f9051d, this.f9049b, this.i);
            }
            return null;
        }
        if (TextUtils.equals(this.f9051d.aD(), com.anythink.basead.f.d.b.f9099a)) {
            com.anythink.basead.f.b.c cVar2 = this.f9055h;
            if (cVar2 != null) {
                return cVar2.a(this.f9048a, this.f9051d, this.f9049b, this.i);
            }
            return null;
        }
        com.anythink.basead.f.b.c cVar3 = this.f9055h;
        if (cVar3 != null) {
            return cVar3.a(this.f9048a, this.f9051d, this.f9049b, this.i);
        }
        return null;
    }
}
