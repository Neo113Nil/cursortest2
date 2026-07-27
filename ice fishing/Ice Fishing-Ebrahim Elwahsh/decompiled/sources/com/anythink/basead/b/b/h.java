package com.anythink.basead.b.b;

import android.text.TextUtils;
import com.anythink.basead.b.b.a;

/* loaded from: classes.dex */
public final class h extends a {
    public h(a.C0005a c0005a) {
        super(c0005a);
    }

    @Override // com.anythink.basead.b.b.a, com.anythink.basead.b.b.m
    public final n a() {
        k kVar = this.f5903e;
        if (kVar == null) {
            return n.a(false, "JumpUrlClickAction empty mOfferClickReportNotify");
        }
        com.anythink.basead.d.j a9 = kVar.a();
        if (a9 == null) {
            return n.a(false, "JumpUrlClickAction empty mOfferClickReportNotify");
        }
        a9.f6372k = new com.anythink.basead.d.b();
        com.anythink.basead.d.e b9 = b();
        a9.f6372k.f6288a = b9 != null ? b9.f6300c : "";
        if (!TextUtils.isEmpty(this.f5901c.u())) {
            String u7 = this.f5901c.u();
            String str = this.f5902d.f14315d;
            String replaceAll = u7.replaceAll("\\{req_id\\}", str != null ? str : "");
            if (com.anythink.core.basead.a.e.a(this.f5900b, replaceAll, this.f5901c, this.f5902d)) {
                com.anythink.basead.d.a aVar = a9.i;
                if (aVar != null) {
                    aVar.i = true;
                }
                k kVar2 = this.f5903e;
                if (kVar2 != null) {
                    kVar2.b();
                }
                com.anythink.core.common.u.e.a(this.f5902d, this.f5901c, replaceAll, "1", 1);
                b bVar = this.f5904f;
                if (bVar != null) {
                    bVar.b();
                    this.f5904f.a();
                    this.f5904f.a(true);
                    this.f5904f.c();
                }
                return n.a(true, "JumpUrlClickAction execute success");
            }
            com.anythink.core.common.u.e.a(this.f5902d, this.f5901c, replaceAll, "0", 1);
        }
        return n.a(false, "JumpUrlClickAction execute fail");
    }
}
