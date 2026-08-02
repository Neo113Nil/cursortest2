package com.anythink.basead.b.b;

import android.text.TextUtils;
import com.anythink.basead.b.b.a;
import com.anythink.core.common.h.w;

/* loaded from: classes.dex */
public final class i extends a {
    public i(a.C0006a c0006a) {
        super(c0006a);
    }

    @Override // com.anythink.basead.b.b.a, com.anythink.basead.b.b.m
    public final n a() {
        w wVar = this.f6530c;
        String ar = wVar != null ? wVar.ar() : "";
        if (TextUtils.isEmpty(ar)) {
            return n.a(false, "MarketUrlClickAction execute fail with empty url");
        }
        b bVar = this.f6533f;
        if (bVar != null) {
            bVar.b();
            this.f6533f.a();
        }
        com.anythink.core.basead.a.d b9 = com.anythink.core.basead.a.e.b(this.f6529b, ar, this.f6530c, this.f6531d);
        if (b9.a() != 0) {
            com.anythink.core.common.u.e.a(this.f6531d, this.f6530c, ar, "0", 2, 0, b9.b());
            return n.a(false, "MarketUrlClickAction execute fail");
        }
        k kVar = this.f6532e;
        if (kVar != null) {
            kVar.b();
        }
        b bVar2 = this.f6533f;
        if (bVar2 != null) {
            bVar2.c();
        }
        com.anythink.core.common.u.e.a(this.f6531d, this.f6530c, ar, "1", 2, 0, b9.b());
        return n.a(true, "MarketUrlClickAction execute success");
    }
}
