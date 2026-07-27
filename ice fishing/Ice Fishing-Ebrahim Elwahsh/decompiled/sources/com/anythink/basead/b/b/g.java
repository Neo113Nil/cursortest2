package com.anythink.basead.b.b;

import android.text.TextUtils;
import com.anythink.basead.b.b.a;
import com.anythink.core.common.h.w;

/* loaded from: classes.dex */
public final class g extends a {
    public g(a.C0005a c0005a) {
        super(c0005a);
    }

    @Override // com.anythink.basead.b.b.a, com.anythink.basead.b.b.m
    public final n a() {
        w wVar = this.f5901c;
        String as = wVar != null ? wVar.as() : "";
        if (TextUtils.isEmpty(as)) {
            return n.a(false, "FastUrlClickAction execute fail with empty url");
        }
        b bVar = this.f5904f;
        if (bVar != null) {
            bVar.b();
            this.f5904f.a();
        }
        if (!com.anythink.core.basead.a.e.a(this.f5900b, as, this.f5901c, this.f5902d)) {
            com.anythink.core.common.u.e.a(this.f5902d, this.f5901c, as, "0", 3);
            return n.a(false, "FastUrlClickAction execute fail");
        }
        k kVar = this.f5903e;
        if (kVar != null) {
            kVar.b();
        }
        b bVar2 = this.f5904f;
        if (bVar2 != null) {
            bVar2.c();
        }
        com.anythink.core.common.u.e.a(this.f5902d, this.f5901c, as, "1", 3);
        return n.a(true, "FastUrlClickAction execute success");
    }
}
