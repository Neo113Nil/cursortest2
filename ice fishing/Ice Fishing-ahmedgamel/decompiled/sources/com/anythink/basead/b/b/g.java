package com.anythink.basead.b.b;

import android.text.TextUtils;
import com.anythink.basead.b.b.a;
import com.anythink.core.common.h.w;

/* loaded from: classes.dex */
public final class g extends a {
    public g(a.C0006a c0006a) {
        super(c0006a);
    }

    @Override // com.anythink.basead.b.b.a, com.anythink.basead.b.b.m
    public final n a() {
        w wVar = this.f6530c;
        String as = wVar != null ? wVar.as() : "";
        if (TextUtils.isEmpty(as)) {
            return n.a(false, "FastUrlClickAction execute fail with empty url");
        }
        b bVar = this.f6533f;
        if (bVar != null) {
            bVar.b();
            this.f6533f.a();
        }
        if (!com.anythink.core.basead.a.e.a(this.f6529b, as, this.f6530c, this.f6531d)) {
            com.anythink.core.common.u.e.a(this.f6531d, this.f6530c, as, "0", 3);
            return n.a(false, "FastUrlClickAction execute fail");
        }
        k kVar = this.f6532e;
        if (kVar != null) {
            kVar.b();
        }
        b bVar2 = this.f6533f;
        if (bVar2 != null) {
            bVar2.c();
        }
        com.anythink.core.common.u.e.a(this.f6531d, this.f6530c, as, "1", 3);
        return n.a(true, "FastUrlClickAction execute success");
    }
}
