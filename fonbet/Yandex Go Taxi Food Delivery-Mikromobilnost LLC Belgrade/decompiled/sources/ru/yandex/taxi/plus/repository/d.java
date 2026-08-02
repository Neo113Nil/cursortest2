package ru.yandex.taxi.plus.repository;

import defpackage.aqp0;
import defpackage.tpr;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.cashback.sdk.c0;

/* loaded from: classes6.dex */
public final class d {
    public final c0 a;
    public final aqp0 b;

    public d(c0 c0Var, aqp0 aqp0Var) {
        this.a = c0Var;
        this.b = aqp0Var;
    }

    public final tpr a() {
        return kotlinx.coroutines.flow.e.t(new m0(this.a.b(), this.b.f, new PlusTemplatesInteractor$templates$1(3, null)));
    }
}
