package ru.yandex.taxi.main.map;

import defpackage.iv70;
import defpackage.jgt0;
import defpackage.tpr;
import defpackage.wiq0;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes5.dex */
public final class i {
    public final jgt0 a;
    public final wiq0 b;
    public final iv70 c;
    public final ru.yandex.taxi.address.clarification.impl.repo.a d;

    public i(jgt0 jgt0Var, wiq0 wiq0Var, iv70 iv70Var, ru.yandex.taxi.address.clarification.impl.repo.a aVar) {
        this.a = jgt0Var;
        this.b = wiq0Var;
        this.c = iv70Var;
        this.d = aVar;
    }

    public final tpr a() {
        return kotlinx.coroutines.flow.e.t(new m0(this.a.b, kotlinx.coroutines.flow.e.d(this.d.f), new PinInfoRepository$visibilityFlow$1(3, null)));
    }
}
