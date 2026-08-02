package ru.yandex.taxi.ui.orders.card.base;

import android.widget.ImageView;
import defpackage.f2z;
import defpackage.hic;
import defpackage.v501;

/* loaded from: classes14.dex */
public final /* synthetic */ class a implements hic {
    public final /* synthetic */ v501 a;
    public final /* synthetic */ f2z b;

    public /* synthetic */ a(v501 v501Var, f2z f2zVar) {
        this.a = v501Var;
        this.b = f2zVar;
    }

    public final void a(ImageView imageView, int i) {
        this.a.Z(new TrackingCardViewHolder$1$1(this.b, i, imageView, null), "SET_COLORIZED_CAR_ICON", true);
    }
}
