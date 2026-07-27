package com.anythink.basead.b.b;

import com.anythink.basead.b.b.a;

/* loaded from: classes.dex */
public final class o extends a {
    public o(a.C0006a c0006a) {
        super(c0006a);
    }

    @Override // com.anythink.basead.b.b.a, com.anythink.basead.b.b.m
    public final n a() {
        b bVar = this.f5747f;
        if (bVar != null) {
            bVar.b();
            this.f5747f.a();
        }
        if (!com.anythink.core.basead.a.e.a(this.f5744c, this.f5745d)) {
            return n.a(false, "WXMiniClickAction execute fail");
        }
        k kVar = this.f5746e;
        if (kVar != null) {
            kVar.b();
        }
        b bVar2 = this.f5747f;
        if (bVar2 != null) {
            bVar2.c();
        }
        return n.a(true, "WXMiniClickAction execute success");
    }
}
