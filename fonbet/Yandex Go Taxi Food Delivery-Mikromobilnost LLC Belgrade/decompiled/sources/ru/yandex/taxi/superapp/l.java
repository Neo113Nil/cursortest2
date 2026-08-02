package ru.yandex.taxi.superapp;

import defpackage.tje;
import defpackage.tse;
import defpackage.vdn;
import defpackage.wdn;

/* loaded from: classes5.dex */
public final class l {
    public final ru.yandex.taxi.am.g a;
    public final ru.yandex.taxi.am.j b;
    public final tse c;

    public l(ru.yandex.taxi.am.g gVar, ru.yandex.taxi.am.j jVar, tse tseVar) {
        this.a = gVar;
        this.b = jVar;
        this.c = tseVar;
    }

    public final void a(wdn wdnVar, vdn vdnVar) {
        tje.N(this.c, null, null, new SuperAppPhonishAccountDelegate$upgradePhonish$1(this, wdnVar, vdnVar, null), 3);
    }
}
