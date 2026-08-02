package com.yandex.passport.common.network;

import defpackage.bhi;
import defpackage.cvt;
import defpackage.h0o;
import defpackage.ime;
import defpackage.pn3;
import defpackage.twh;
import defpackage.w1g;
import defpackage.xq0;
import defpackage.ybl;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class o extends p {
    public final ime e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(String str) {
        super(str);
        str.getClass();
        ime imeVar = new ime(13);
        imeVar.Y(bhi.f);
        this.e = imeVar;
    }

    @Override // com.yandex.passport.common.network.p
    public final void S(String str, String str2) {
        str.getClass();
        if (str2 != null) {
            ime imeVar = this.e;
            imeVar.getClass();
            ((ArrayList) imeVar.d).add(w1g.u(str, null, ybl.b(str2, null)));
        }
    }

    @Override // com.yandex.passport.common.network.p
    public final h0o U() {
        ime imeVar = this.e;
        ArrayList arrayList = (ArrayList) imeVar.d;
        if (!arrayList.isEmpty()) {
            return new bhi((pn3) imeVar.b, (twh) imeVar.c, cvt.x(arrayList));
        }
        xq0.q("Multipart body must have at least one part.");
        return null;
    }
}
