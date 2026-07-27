package com.anythink.basead.b.b;

import com.anythink.basead.b.b.a;

/* loaded from: classes.dex */
public final class o extends a {
    public o(a.C0005a c0005a) {
        super(c0005a);
    }

    @Override // com.anythink.basead.b.b.a, com.anythink.basead.b.b.m
    public final n a() {
        b bVar = this.f5904f;
        if (bVar != null) {
            bVar.b();
            this.f5904f.a();
        }
        if (!com.anythink.core.basead.a.e.a(this.f5901c, this.f5902d)) {
            return n.a(false, "WXMiniClickAction execute fail");
        }
        k kVar = this.f5903e;
        if (kVar != null) {
            kVar.b();
        }
        b bVar2 = this.f5904f;
        if (bVar2 != null) {
            bVar2.c();
        }
        return n.a(true, "WXMiniClickAction execute success");
    }
}
