package ru.yandex.taxi.translations;

import defpackage.hit;
import defpackage.hwx;
import defpackage.owx;
import defpackage.pzt0;
import defpackage.tje;

/* loaded from: classes10.dex */
public final class a implements hwx {
    public final ru.yandex.taxi.translations.interactor.a a;
    public final hit b;
    public pzt0 c;

    public a(ru.yandex.taxi.translations.interactor.a aVar, hit hitVar) {
        this.a = aVar;
        this.b = hitVar;
    }

    @Override // defpackage.j35
    public final String getName() {
        return "TRANSLATIONS";
    }

    @Override // defpackage.hwx
    public final void k(owx owxVar) {
        pzt0 pzt0Var = this.c;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.c = tje.N(this.b.a, null, null, new TranslationsProviderDelegate$process$1(this, null), 3);
    }
}
