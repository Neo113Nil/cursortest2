package ru.yandex.taxi.altpins.router;

import defpackage.d4;
import defpackage.i130;
import defpackage.m230;
import defpackage.m950;
import defpackage.rw1;
import defpackage.u45;
import defpackage.vr;
import defpackage.w030;
import ru.yandex.taxi.altpins.order_for_another.modal.AlternativeDestinationForAnotherModalView;

/* loaded from: classes5.dex */
public final class a extends m230 implements m950 {
    public final vr E;
    public final w030 F;

    public a(vr vrVar, i130 i130Var) {
        super(null);
        this.E = vrVar;
        this.F = i130Var.a();
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.F;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return false;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        d4 d4Var = new d4(29, this);
        AltpinOrderForAnotherRouterImpl$provideModalView$2 altpinOrderForAnotherRouterImpl$provideModalView$2 = new AltpinOrderForAnotherRouterImpl$provideModalView$2(0, this, a.class, "goBack", "goBack(Lkotlin/jvm/functions/Function1;)V", 0);
        vr vrVar = this.E;
        vrVar.getClass();
        return new AlternativeDestinationForAnotherModalView(vrVar.a, new rw1(d4Var, altpinOrderForAnotherRouterImpl$provideModalView$2));
    }
}
