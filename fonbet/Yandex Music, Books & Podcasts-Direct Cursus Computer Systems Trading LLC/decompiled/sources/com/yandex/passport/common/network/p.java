package com.yandex.passport.common.network;

import com.connectsdk.service.command.ServiceCommand;
import defpackage.b0o;
import defpackage.d0o;
import defpackage.h0o;
import defpackage.s7e;
import defpackage.u7e;
import defpackage.xiu;
import defpackage.zrc;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes4.dex */
public class p extends n {
    public final xiu d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(String str) {
        super(str, 0);
        str.getClass();
        this.d = new xiu(27);
    }

    public void S(String str, String str2) {
        str.getClass();
        if (str2 != null) {
            this.d.f(str, str2);
        }
    }

    public final void T(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            S((String) entry.getKey(), (String) entry.getValue());
        }
    }

    public h0o U() {
        xiu xiuVar = this.d;
        xiuVar.getClass();
        return new zrc((ArrayList) xiuVar.b, (ArrayList) xiuVar.c);
    }

    @Override // com.yandex.passport.common.network.n
    public final d0o z() {
        b0o b0oVar = (b0o) this.b;
        u7e e = ((s7e) this.c).e();
        b0oVar.getClass();
        b0oVar.a = e;
        b0oVar.e(ServiceCommand.TYPE_POST, U());
        return b0oVar.b();
    }
}
