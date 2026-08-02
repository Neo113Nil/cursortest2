package ru.yandex.taxi.communications;

import defpackage.jtq0;
import defpackage.lwj0;
import defpackage.tse;

/* loaded from: classes9.dex */
public final class i {
    public final tse a;
    public final ru.yandex.taxi.banners.model.g b;
    public final jtq0 c;

    public i(tse tseVar, ru.yandex.taxi.banners.model.g gVar, jtq0 jtq0Var) {
        this.a = tseVar;
        this.b = gVar;
        this.c = jtq0Var;
    }

    public final void a(lwj0 lwj0Var) {
        com.yandex.go.coroutines.b.g(this.a, null, null, new SuggestBannersInteractorImpl$processSuggestResponse$1(lwj0Var, this, null), 3);
    }
}
