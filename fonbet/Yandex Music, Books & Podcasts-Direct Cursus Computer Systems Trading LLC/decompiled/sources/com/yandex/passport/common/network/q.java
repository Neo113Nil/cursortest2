package com.yandex.passport.common.network;

import com.connectsdk.service.command.ServiceCommand;
import com.yandex.passport.data.network.m3;
import defpackage.b0o;
import defpackage.d0o;
import defpackage.q5g;
import defpackage.s7e;
import defpackage.twh;
import defpackage.u7e;
import defpackage.ybl;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public final class q extends n {
    public final m3 d;
    public final String e;
    public final twh f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(String str, m3 m3Var) {
        super(str, 0);
        twh twhVar;
        str.getClass();
        this.d = m3Var;
        this.e = "application/json; charset=utf-8";
        Pattern pattern = twh.e;
        try {
            twhVar = q5g.C("application/json; charset=utf-8");
        } catch (IllegalArgumentException unused) {
            twhVar = null;
        }
        this.f = twhVar;
    }

    @Override // com.yandex.passport.common.network.n
    public final d0o z() {
        b0o b0oVar = (b0o) this.b;
        u7e e = ((s7e) this.c).e();
        b0oVar.getClass();
        b0oVar.a = e;
        b0oVar.e(ServiceCommand.TYPE_POST, ybl.b((String) this.d.invoke(), this.f));
        b0oVar.a("content-type", this.e);
        return b0oVar.b();
    }
}
