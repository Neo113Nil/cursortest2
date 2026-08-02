package ru.yandex.taxi.superapp;

import defpackage.gcn;
import defpackage.po21;
import defpackage.tje;
import defpackage.tse;

/* loaded from: classes6.dex */
public final class h {
    public final po21 a;
    public final tse b;

    public h(po21 po21Var, tse tseVar) {
        this.a = po21Var;
        this.b = tseVar;
    }

    public final void a(gcn gcnVar) {
        tje.N(this.b, null, null, new SuperAppLocationProviderDelegate$requestCurrentLocation$1(this, gcnVar, null), 3);
    }
}
