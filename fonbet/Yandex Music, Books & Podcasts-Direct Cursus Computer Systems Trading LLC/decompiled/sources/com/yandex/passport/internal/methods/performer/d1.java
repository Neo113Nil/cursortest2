package com.yandex.passport.internal.methods.performer;

import android.os.Bundle;
import com.yandex.passport.internal.methods.v5;
import com.yandex.passport.internal.methods.z4;
import com.yandex.passport.internal.report.ff;
import com.yandex.passport.internal.report.pa;
import com.yandex.passport.internal.report.ve;
import defpackage.f84;
import defpackage.z7o;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class d1 implements z0 {
    public final com.yandex.passport.internal.push.m a;
    public final com.yandex.passport.internal.report.reporters.w0 b;

    public d1(com.yandex.passport.internal.push.m mVar, com.yandex.passport.internal.report.reporters.w0 w0Var) {
        mVar.getClass();
        w0Var.getClass();
        this.a = mVar;
        this.b = w0Var;
    }

    @Override // com.yandex.passport.internal.methods.performer.z0
    public final Object u(v5 v5Var) {
        String str;
        String str2;
        String str3;
        String str4;
        z4 z4Var = (z4) v5Var;
        com.yandex.passport.internal.methods.b bVar = z4Var.c;
        Object z = com.yandex.passport.internal.ui.a.z(new f84(this, z4Var, (Continuation) null));
        Throwable a = z7o.a(z);
        if (a != null) {
            try {
                str = ((Bundle) bVar.c).getString("push_id");
            } catch (Exception unused) {
                str = null;
            }
            try {
                str2 = ((Bundle) bVar.c).getString("event_name");
            } catch (Exception unused2) {
                str2 = null;
            }
            try {
                str3 = ((Bundle) bVar.c).getString("push_service");
            } catch (Exception unused3) {
                str3 = null;
            }
            try {
                str4 = ((Bundle) bVar.c).getString("is_silent");
            } catch (Exception unused4) {
                str4 = null;
            }
            Boolean valueOf = str4 != null ? Boolean.valueOf(Boolean.parseBoolean(str4)) : null;
            com.yandex.passport.internal.report.reporters.w0 w0Var = this.b;
            w0Var.getClass();
            w0Var.n(pa.d, new ff(a), new ve(str, 11), new ve(str3, 14), new com.yandex.passport.internal.report.f(str2, 3), new com.yandex.passport.internal.report.f(valueOf));
        }
        return z;
    }
}
