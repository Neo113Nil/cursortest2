package ru.yandex.taxi.interactor;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.ck31;
import defpackage.lcj0;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes6.dex */
public final class a {
    public final ru.yandex.taxi.ui.form.constructor.a a;
    public final ck31 b;
    public final lcj0 c;

    public a(ru.yandex.taxi.ui.form.constructor.a aVar, ck31 ck31Var, lcj0 lcj0Var) {
        this.a = aVar;
        this.b = ck31Var;
        this.c = lcj0Var;
    }

    public final m0 a() {
        return new m0(((k) this.b).e(), this.a.a(), new RequirementAddressFormStateInteractor$stateFlow$1(this, null));
    }
}
