package com.anythink.basead.b.b;

import com.anythink.basead.b.b.a;

/* loaded from: classes.dex */
public final class o extends a {
    public o(a.C0006a c0006a) {
        super(c0006a);
    }

    @Override // com.anythink.basead.b.b.a, com.anythink.basead.b.b.m
    public final n a() {
        b bVar = this.f6533f;
        if (bVar != null) {
            bVar.b();
            this.f6533f.a();
        }
        if (!com.anythink.core.basead.a.e.a(this.f6530c, this.f6531d)) {
            return n.a(false, "WXMiniClickAction execute fail");
        }
        k kVar = this.f6532e;
        if (kVar != null) {
            kVar.b();
        }
        b bVar2 = this.f6533f;
        if (bVar2 != null) {
            bVar2.c();
        }
        return n.a(true, "WXMiniClickAction execute success");
    }
}
