package ru.yandex.taxi.superapp;

import defpackage.h1p;
import defpackage.hst;
import defpackage.jst;
import defpackage.kdn;
import defpackage.s2p;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.w6a0;
import defpackage.zzs;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class k {
    public final tse a;
    public final h1p b;
    public final ru.yandex.taxi.superapp.payment.a c;
    public final s2p d;
    public final kdn e = new kdn();

    public k(tse tseVar, h1p h1pVar, ru.yandex.taxi.superapp.payment.a aVar, s2p s2pVar) {
        this.a = tseVar;
        this.b = h1pVar;
        this.c = aVar;
        this.d = s2pVar;
    }

    public final void a(w6a0 w6a0Var, tls tlsVar) {
        hst hstVar = jst.e;
        String.format("SuperApp: %s request payment methods", Arrays.copyOf(new Object[]{this.b.getValue()}, 1));
        hstVar.getClass();
        tje.N(this.a, null, null, new SuperAppPaymentsDelegate$requestPaymentMethods$1(tlsVar, this, new zzs(w6a0Var.a, w6a0Var.b, 0, null, null, 28), null), 3);
    }
}
