package com.yandex.passport.internal.ui.domik.common;

import com.yandex.passport.internal.analytics.l0;
import com.yandex.passport.internal.analytics.m0;
import com.yandex.passport.internal.analytics.n0;
import defpackage.ca8;
import defpackage.cq4;
import defpackage.dq7;
import defpackage.e5b;
import defpackage.mn7;
import defpackage.ot0;
import defpackage.x97;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class d implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;

    public /* synthetic */ d(e eVar, int i) {
        this.a = i;
        this.b = eVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Continuation continuation = null;
        e eVar = this.b;
        switch (i) {
            case 0:
                n0 n0Var = eVar.q;
                n0Var.getClass();
                m0 m0Var = m0.SMS_CODE_ENTRY;
                l0 l0Var = l0.RESEND_SMS;
                e5b e5bVar = e5b.a;
                e5bVar.getClass();
                n0Var.c(m0Var, l0Var, e5bVar);
                g gVar = (g) ((com.yandex.passport.internal.ui.domik.base.b) eVar.g);
                com.yandex.passport.internal.ui.domik.e eVar2 = eVar.o;
                gVar.getClass();
                eVar2.getClass();
                cq4 F = ot0.F(gVar);
                dq7 dq7Var = ca8.a;
                x97.y(F, mn7.d, null, new com.yandex.passport.internal.provider.communication.c(gVar, eVar2, continuation, 22), 2);
                break;
            default:
                eVar.L();
                break;
        }
        return null;
    }
}
