package ru.yandex.taxi.settings.main;

import defpackage.f600;
import defpackage.jj10;
import defpackage.tls;
import defpackage.zy11;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final /* synthetic */ class e implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        f fVar = (f) obj;
        jj10 jj10Var = fVar.x;
        jj10Var.getClass();
        jj10Var.a.a("Menu.PhonishUpgrade.Tapped", new HashMap(), 1, new HashMap());
        ((f600) fVar.F.get()).f();
        com.yandex.go.coroutines.b.g(fVar.Jg(), null, null, new NativeMenuPresenter$onPhonishUpgradeSelected$1((ru.yandex.taxi.am.j) fVar.R.get(), null), 3);
        return zy11.a;
    }
}
