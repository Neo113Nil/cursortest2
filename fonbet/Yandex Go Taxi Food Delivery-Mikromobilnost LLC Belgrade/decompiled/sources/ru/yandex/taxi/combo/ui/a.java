package ru.yandex.taxi.combo.ui;

import defpackage.ad5;
import defpackage.tje;
import defpackage.yc11;
import ru.yandex.taxi.combo.interactor.f;

/* loaded from: classes5.dex */
public final class a extends ad5 {
    public final f x;

    public a(f fVar) {
        super(yc11.class);
        this.x = fVar;
    }

    public final void Kg(yc11 yc11Var) {
        Bg(yc11Var);
        tje.N(Jg(), null, null, new TravelCompanionDetailPresenter$attachView$1(this, yc11Var, null), 3);
    }
}
