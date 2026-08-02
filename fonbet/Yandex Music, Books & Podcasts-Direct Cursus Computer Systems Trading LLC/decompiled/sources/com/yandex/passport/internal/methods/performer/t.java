package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.api.z1;
import com.yandex.passport.internal.methods.r3;
import com.yandex.passport.internal.methods.v5;
import com.yandex.passport.internal.report.b5;
import defpackage.inr;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.z7o;
import kotlin.coroutines.Continuation;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class t implements z0 {
    public final com.yandex.passport.internal.database.auth_cookie.b a;
    public final com.yandex.passport.data.network.token.i b;
    public final com.yandex.passport.internal.report.reporters.p c;

    public t(com.yandex.passport.internal.database.auth_cookie.b bVar, com.yandex.passport.data.network.token.i iVar, com.yandex.passport.internal.report.reporters.p pVar) {
        bVar.getClass();
        pVar.getClass();
        this.a = bVar;
        this.b = iVar;
        this.c = pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0070 A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:6:0x0021, B:8:0x0025, B:11:0x0037, B:16:0x004c, B:19:0x005b, B:23:0x006a, B:25:0x0070, B:26:0x0074, B:27:0x00b1, B:30:0x0055, B:32:0x0030), top: B:5:0x0021 }] */
    @Override // com.yandex.passport.internal.methods.performer.z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object u(v5 v5Var) {
        String str;
        r3 r3Var = (r3) v5Var;
        com.yandex.passport.common.core.f L = com.yandex.plus.pay.ui.core.b.L((z1) r3Var.c.c);
        Object z = com.yandex.passport.internal.ui.a.z(new inr((Object) r3Var, (Object) this, (Object) L, (Continuation) (0 == true ? 1 : 0), 18));
        Throwable a = z7o.a(z);
        if (a == null) {
            return z;
        }
        try {
            String message = !(a instanceof com.yandex.passport.api.exception.q) ? a instanceof com.yandex.passport.api.exception.r ? "PassportNoCookieForUidException" : a.getMessage() : "PassportInvalidHostException";
            com.yandex.passport.internal.report.reporters.p pVar = this.c;
            String str2 = (String) r3Var.d.c;
            str2.getClass();
            if (StringsKt.U(str2)) {
                str2 = null;
            }
            if (str2 != null) {
                if (!StringsKt.M(str2, "://", false)) {
                    str2 = "https://".concat(str2);
                }
                com.yandex.passport.common.url.b bVar = new com.yandex.passport.common.url.b(str2);
                if (!com.yandex.passport.common.url.b.n(str2)) {
                    bVar = null;
                }
                if (bVar != null) {
                    str = bVar.a;
                    String d = str != null ? com.yandex.passport.common.url.b.d(str) : null;
                    pVar.getClass();
                    pVar.n(b5.d, new com.yandex.passport.internal.report.c(Long.valueOf(L.b)), new com.yandex.passport.internal.report.f(d, 12), new com.yandex.passport.internal.report.a(String.valueOf(message), 28));
                    throw com.yandex.passport.data.network.token.i.j(this.b, a, null, null, null, null, null, 62);
                }
            }
            str = null;
            if (str != null) {
            }
            pVar.getClass();
            pVar.n(b5.d, new com.yandex.passport.internal.report.c(Long.valueOf(L.b)), new com.yandex.passport.internal.report.f(d, 12), new com.yandex.passport.internal.report.a(String.valueOf(message), 28));
            throw com.yandex.passport.data.network.token.i.j(this.b, a, null, null, null, null, null, 62);
        } catch (Throwable th) {
            r7o r7oVar = z7o.b;
            return new t7o(th);
        }
    }
}
