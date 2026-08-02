package ru.yandex.taxi.superapp;

import defpackage.gcn;
import defpackage.tdn;
import defpackage.tje;
import defpackage.tse;
import defpackage.x6w0;

/* loaded from: classes5.dex */
public final class i {
    public final ru.yandex.taxi.am.token.a a;
    public final tdn b;
    public final x6w0 c;
    public final tse d;

    public i(ru.yandex.taxi.am.token.a aVar, tdn tdnVar, x6w0 x6w0Var, tse tseVar) {
        this.a = aVar;
        this.b = tdnVar;
        this.c = x6w0Var;
        this.d = tseVar;
    }

    public final void a(gcn gcnVar) {
        tje.N(this.d, null, null, new SuperAppOAuthTokenProviderDelegate$getOAuthToken$1(this, gcnVar, null), 3);
    }
}
