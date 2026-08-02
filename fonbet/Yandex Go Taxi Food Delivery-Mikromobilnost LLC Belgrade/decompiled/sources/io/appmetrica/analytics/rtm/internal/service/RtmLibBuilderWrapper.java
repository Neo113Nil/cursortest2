package io.appmetrica.analytics.rtm.internal.service;

import defpackage.caj;
import defpackage.d5i0;
import defpackage.dda1;
import defpackage.e5i0;
import defpackage.g5i0;
import defpackage.j5i0;
import defpackage.k5i0;
import defpackage.tje;
import defpackage.ums;

/* loaded from: classes9.dex */
public class RtmLibBuilderWrapper {
    public void initAppHostStatics(d5i0 d5i0Var) {
        String a = d5i0Var.a();
        if (a == null) {
            a = "https://yandex.ru/clck/click";
        }
        tje.x3 = new g5i0(a, new ums(3));
    }

    public d5i0 newAppHostStaticsBuilder() {
        return new d5i0();
    }

    public e5i0 newBuilder(String str, String str2, k5i0 k5i0Var) {
        return new e5i0(str, str2, k5i0Var);
    }

    public j5i0 uploadEventAndWaitResult(String str) {
        g5i0 g5i0Var = tje.x3;
        try {
            return new caj(g5i0Var.a, str, g5i0Var.b).a();
        } catch (Throwable th) {
            return dda1.j(th);
        }
    }
}
