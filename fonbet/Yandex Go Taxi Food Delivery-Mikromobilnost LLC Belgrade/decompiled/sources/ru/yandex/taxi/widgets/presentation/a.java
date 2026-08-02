package ru.yandex.taxi.widgets.presentation;

import com.yandex.go.superapp.orders.card.experiments.y;
import defpackage.pu6;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.u501;
import defpackage.w201;
import ru.yandex.taxi.widget.c;

/* loaded from: classes14.dex */
public final class a implements u501 {
    public final c a;
    public final y b;

    public a(c cVar, y yVar) {
        this.a = cVar;
        this.b = yVar;
    }

    @Override // defpackage.u501
    public final tpr a(w201 w201Var) {
        return new rol0(new BundleTrackingCardUiStateInteractor$uiStateFlow$1((pu6) w201Var, this, null));
    }
}
