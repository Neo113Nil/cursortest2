package com.anythink.core.common.w.b;

import com.anythink.core.d.l;

/* loaded from: classes.dex */
public final class d implements c {
    @Override // com.anythink.core.common.w.b.c
    public final void a(a aVar) {
        h a9 = aVar.a();
        l lVar = a9.f17833c;
        if (lVar != null) {
            a(aVar, a9, !lVar.aR() && lVar.bl());
        } else {
            a(aVar, a9, true);
        }
    }

    private void a(final a aVar, final h hVar, boolean z6) {
        com.anythink.core.common.g.c.a().a(new com.anythink.core.common.g.d() { // from class: com.anythink.core.common.w.b.d.1
            @Override // com.anythink.core.common.g.d
            public final void a(String str) {
                aVar.a(hVar);
            }
        }, z6);
    }
}
