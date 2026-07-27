package com.anythink.basead.b.b;

import android.text.TextUtils;
import com.anythink.basead.b.b.a;

/* loaded from: classes.dex */
public final class h extends a {
    public h(a.C0006a c0006a) {
        super(c0006a);
    }

    @Override // com.anythink.basead.b.b.a, com.anythink.basead.b.b.m
    public final n a() {
        k kVar = this.f5746e;
        if (kVar == null) {
            return n.a(false, "JumpUrlClickAction empty mOfferClickReportNotify");
        }
        com.anythink.basead.d.j a9 = kVar.a();
        if (a9 == null) {
            return n.a(false, "JumpUrlClickAction empty mOfferClickReportNotify");
        }
        a9.f6215k = new com.anythink.basead.d.b();
        com.anythink.basead.d.e b9 = b();
        a9.f6215k.f6131a = b9 != null ? b9.f6143c : "";
        if (!TextUtils.isEmpty(this.f5744c.u())) {
            String u3 = this.f5744c.u();
            String str = this.f5745d.f14158d;
            String replaceAll = u3.replaceAll("\\{req_id\\}", str != null ? str : "");
            if (com.anythink.core.basead.a.e.a(this.f5743b, replaceAll, this.f5744c, this.f5745d)) {
                com.anythink.basead.d.a aVar = a9.i;
                if (aVar != null) {
                    aVar.i = true;
                }
                k kVar2 = this.f5746e;
                if (kVar2 != null) {
                    kVar2.b();
                }
                com.anythink.core.common.u.e.a(this.f5745d, this.f5744c, replaceAll, "1", 1);
                b bVar = this.f5747f;
                if (bVar != null) {
                    bVar.b();
                    this.f5747f.a();
                    this.f5747f.a(true);
                    this.f5747f.c();
                }
                return n.a(true, "JumpUrlClickAction execute success");
            }
            com.anythink.core.common.u.e.a(this.f5745d, this.f5744c, replaceAll, "0", 1);
        }
        return n.a(false, "JumpUrlClickAction execute fail");
    }
}
