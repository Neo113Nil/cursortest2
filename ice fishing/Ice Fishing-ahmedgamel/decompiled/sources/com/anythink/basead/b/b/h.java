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
        k kVar = this.f6532e;
        if (kVar == null) {
            return n.a(false, "JumpUrlClickAction empty mOfferClickReportNotify");
        }
        com.anythink.basead.d.j a9 = kVar.a();
        if (a9 == null) {
            return n.a(false, "JumpUrlClickAction empty mOfferClickReportNotify");
        }
        a9.f7001k = new com.anythink.basead.d.b();
        com.anythink.basead.d.e b9 = b();
        a9.f7001k.f6917a = b9 != null ? b9.f6929c : "";
        if (!TextUtils.isEmpty(this.f6530c.u())) {
            String u6 = this.f6530c.u();
            String str = this.f6531d.f14944d;
            String replaceAll = u6.replaceAll("\\{req_id\\}", str != null ? str : "");
            if (com.anythink.core.basead.a.e.a(this.f6529b, replaceAll, this.f6530c, this.f6531d)) {
                com.anythink.basead.d.a aVar = a9.i;
                if (aVar != null) {
                    aVar.i = true;
                }
                k kVar2 = this.f6532e;
                if (kVar2 != null) {
                    kVar2.b();
                }
                com.anythink.core.common.u.e.a(this.f6531d, this.f6530c, replaceAll, "1", 1);
                b bVar = this.f6533f;
                if (bVar != null) {
                    bVar.b();
                    this.f6533f.a();
                    this.f6533f.a(true);
                    this.f6533f.c();
                }
                return n.a(true, "JumpUrlClickAction execute success");
            }
            com.anythink.core.common.u.e.a(this.f6531d, this.f6530c, replaceAll, "0", 1);
        }
        return n.a(false, "JumpUrlClickAction execute fail");
    }
}
