package ru.yandex.taxi.orderforanother.interactor;

import defpackage.avj0;
import defpackage.byi;
import defpackage.g92;
import defpackage.ha2;
import defpackage.i0h0;
import defpackage.itz0;
import defpackage.kj;
import defpackage.kyh0;
import defpackage.pl90;
import defpackage.tpr;
import defpackage.yt11;
import defpackage.zuj0;
import ru.yandex.taxi.am.f0;

/* loaded from: classes6.dex */
public final class f implements yt11 {
    public final f0 a;
    public final zuj0 b;
    public final ha2 c;

    public f(com.yandex.go.repositories.e eVar, f0 f0Var, zuj0 zuj0Var) {
        this.a = f0Var;
        this.b = zuj0Var;
        avj0 avj0Var = (avj0) zuj0Var;
        int i = 2;
        this.c = kotlinx.coroutines.flow.e.m(new g92(i, new itz0(avj0Var.h(kyh0.order_for_other_dialog_title))), new g92(i, new byi(avj0Var.h(kyh0.order_for_other_dialog_description))), new e(kotlinx.coroutines.flow.e.t(com.yandex.go.coroutines.b.d(new c(eVar.f, this), new WhoRidePaneV2UiStateInteractor$avatarUrlFlow$$inlined$start$1(null, this))), this), new g92(i, new pl90(i0h0.ic_passenger_add, avj0Var.h(kyh0.order_for_other_dialog_choose_another))), new WhoRidePaneV2UiStateInteractor$uiStateFlow$1(5, null));
    }

    @Override // defpackage.yt11
    public final tpr a() {
        return this.c;
    }

    public final String b() {
        kj Ig = this.a.a.Ig();
        String str = Ig != null ? Ig.h : null;
        return str == null ? "" : str;
    }
}
