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
        w wVar = this.f5744c;
        String as = wVar != null ? wVar.as() : "";
        if (TextUtils.isEmpty(as)) {
            return n.a(false, "FastUrlClickAction execute fail with empty url");
        }
        b bVar = this.f5747f;
        if (bVar != null) {
            bVar.b();
            this.f5747f.a();
        }
        if (!com.anythink.core.basead.a.e.a(this.f5743b, as, this.f5744c, this.f5745d)) {
            com.anythink.core.common.u.e.a(this.f5745d, this.f5744c, as, "0", 3);
            return n.a(false, "FastUrlClickAction execute fail");
        }
        k kVar = this.f5746e;
        if (kVar != null) {
            kVar.b();
        }
        b bVar2 = this.f5747f;
        if (bVar2 != null) {
            bVar2.c();
        }
        com.anythink.core.common.u.e.a(this.f5745d, this.f5744c, as, "1", 3);
        return n.a(true, "FastUrlClickAction execute success");
    }
}
