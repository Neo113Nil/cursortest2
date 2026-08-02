package defpackage;

import android.content.Context;
import ru.yandex.taxi.appdelegates.SummaryUiDelegate$TariffCardStyle;
import ru.yandex.taxi.preorder.summary.selector.model.vertical.a;

/* loaded from: classes6.dex */
public final class znx0 {
    public final z6t0 a;
    public final ynx0 b;
    public final bbx0 c;
    public final i3y d;

    public znx0(Context context, isx0 isx0Var, a aVar, ru.yandex.taxi.preorder.summary.selector.appearance.a aVar2, bmq0 bmq0Var, wiq0 wiq0Var, c4r0 c4r0Var, b8r b8rVar, qr31 qr31Var) {
        this.a = new z6t0(1, wiq0Var);
        this.b = new ynx0(b8rVar, c4r0Var);
        bbx0 b = aVar2.b();
        this.c = new bbx0(SummaryUiDelegate$TariffCardStyle.HIGH, b.b, b.c, b.d, b.e, b.f, b.g, b.h, b.i, b.j, b.k, b.l);
        this.d = kotlin.a.a(new zoi(this, isx0Var, context, aVar, qr31Var, bmq0Var, 8));
    }
}
