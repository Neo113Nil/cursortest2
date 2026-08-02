package ru.yandex.taxi.map_common.style;

import defpackage.ah00;
import defpackage.czo0;
import defpackage.hbp0;
import defpackage.tje;
import defpackage.vs00;
import ru.yandex.taxi.map_common.style.source.e;

/* loaded from: classes9.dex */
public final class a {
    public final ru.yandex.taxi.map_common.style.domain.a a;
    public final vs00 b;
    public final hbp0 c;

    public a(ru.yandex.taxi.map_common.style.domain.a aVar, vs00 vs00Var) {
        this.a = aVar;
        this.b = vs00Var;
        String str = (2 & 1) != 0 ? null : "MapStylesPresenter";
        this.c = new hbp0(new czo0(14), str == null ? "" : str, null);
    }

    public final void a(ah00 ah00Var) {
        hbp0 hbp0Var = this.c;
        hbp0Var.a();
        tje.N(hbp0Var.c(), null, null, new MapStylesPresenter$attach$1(this, ah00Var, null), 3);
        ru.yandex.taxi.map_common.style.domain.a aVar = this.a;
        tje.N(hbp0Var, null, null, new MapStylesPresenter$listenToMainStyle$$inlined$safeCollectIn$1(aVar.a(), null, ah00Var, this), 3);
        tje.N(hbp0Var, null, null, new MapStylesPresenter$listenToAdditionalStyle$$inlined$safeCollectIn$1(((e) aVar.a).i, null, ah00Var), 3);
    }
}
