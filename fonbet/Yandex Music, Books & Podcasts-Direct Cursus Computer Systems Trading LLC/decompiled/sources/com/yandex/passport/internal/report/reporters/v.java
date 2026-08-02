package com.yandex.passport.internal.report.reporters;

import com.yandex.passport.internal.report.ff;
import com.yandex.passport.internal.report.j3;
import com.yandex.passport.internal.report.k3;
import com.yandex.passport.internal.report.n3;
import com.yandex.passport.internal.report.o3;
import com.yandex.passport.internal.report.r3;
import com.yandex.passport.internal.report.s3;
import com.yandex.passport.internal.report.v3;
import com.yandex.passport.internal.report.ve;
import com.yandex.passport.internal.report.w3;
import com.yandex.passport.internal.report.x2;
import defpackage.b6e;

/* loaded from: classes4.dex */
public final class v extends androidx.core.app.n0 {
    public final void A(com.yandex.passport.common.core.f fVar, String str, String str2, String str3) {
        fVar.getClass();
        str.getClass();
        n(x2.d, new com.yandex.passport.internal.report.c(Long.valueOf(fVar.b)), new com.yandex.passport.internal.report.a(str, 8), new ff(str2, 13), new com.yandex.passport.internal.report.a(str3, 27));
    }

    public final void B(com.yandex.passport.common.core.f fVar, String str, String str2, String str3) {
        fVar.getClass();
        str.getClass();
        n(v3.d, new com.yandex.passport.internal.report.c(Long.valueOf(fVar.b)), new com.yandex.passport.internal.report.a(str, 8), new ff(str2, 13), new com.yandex.passport.internal.report.f(str3, 7));
    }

    public final void C(com.yandex.passport.common.core.f fVar, String str, String str2, String str3, String str4, String str5) {
        fVar.getClass();
        str.getClass();
        str3.getClass();
        str4.getClass();
        n(w3.d, new com.yandex.passport.internal.report.c(Long.valueOf(fVar.b)), new com.yandex.passport.internal.report.a(str, 8), new ff(str2, 13), new com.yandex.passport.internal.report.f(str3, 1), new ve(str4, 27), new ff(str5, 11));
    }

    public final void u(com.yandex.passport.common.core.f fVar, String str, String str2, String str3) {
        fVar.getClass();
        str.getClass();
        n(j3.d, new com.yandex.passport.internal.report.c(Long.valueOf(fVar.b)), new com.yandex.passport.internal.report.a(str, 8), new ff(str2, 13), new com.yandex.passport.internal.report.f(str3, 7));
    }

    public final void v(com.yandex.passport.common.core.f fVar, String str, String str2, boolean z, boolean z2) {
        fVar.getClass();
        str.getClass();
        n(k3.d, new com.yandex.passport.internal.report.c(Long.valueOf(fVar.b)), new com.yandex.passport.internal.report.a(str, 8), new ff(str2, 13), new com.yandex.passport.internal.report.f(16, z), new com.yandex.passport.internal.report.f(18, z2));
    }

    public final void w(com.yandex.passport.common.core.f fVar, String str, String str2, String str3) {
        fVar.getClass();
        str.getClass();
        n(n3.d, new com.yandex.passport.internal.report.c(Long.valueOf(fVar.b)), new com.yandex.passport.internal.report.a(str, 8), new ff(str2, 13), new com.yandex.passport.internal.report.a(str3, 21, false));
    }

    public final void x(com.yandex.passport.common.core.f fVar, String str, String str2, String str3) {
        fVar.getClass();
        str.getClass();
        n(o3.d, new com.yandex.passport.internal.report.c(Long.valueOf(fVar.b)), new com.yandex.passport.internal.report.a(str, 8), new ff(str2, 13), new com.yandex.passport.internal.report.a(str3, 21, false));
    }

    public final void y(com.yandex.passport.common.core.f fVar, String str, String str2, com.yandex.passport.common.ebs.q qVar) {
        String str3;
        fVar.getClass();
        str.getClass();
        qVar.getClass();
        r3 r3Var = r3.d;
        com.yandex.passport.internal.report.c cVar = new com.yandex.passport.internal.report.c(Long.valueOf(fVar.b));
        com.yandex.passport.internal.report.a aVar = new com.yandex.passport.internal.report.a(str, 8);
        ff ffVar = new ff(str2, 13);
        if (qVar instanceof com.yandex.passport.common.ebs.o) {
            str3 = "success";
        } else if (qVar.equals(com.yandex.passport.common.ebs.p.a)) {
            str3 = "verified_age_restriction";
        } else if (qVar.equals(com.yandex.passport.common.ebs.m.a)) {
            str3 = "consent_needed";
        } else if (qVar.equals(com.yandex.passport.common.ebs.l.a)) {
            str3 = "bio_incorrect";
        } else {
            if (!qVar.equals(com.yandex.passport.common.ebs.n.a)) {
                b6e.s();
                return;
            }
            str3 = "ebs_registration_pending";
        }
        n(r3Var, cVar, aVar, ffVar, new ff(str3, 5, false));
    }

    public final void z(int i, com.yandex.passport.common.core.f fVar, String str, String str2) {
        fVar.getClass();
        str.getClass();
        n(s3.d, new com.yandex.passport.internal.report.c(Long.valueOf(fVar.b)), new com.yandex.passport.internal.report.a(str, 8), new com.yandex.passport.internal.report.f(str2, 7), new com.yandex.passport.internal.report.a(i, 4));
    }
}
