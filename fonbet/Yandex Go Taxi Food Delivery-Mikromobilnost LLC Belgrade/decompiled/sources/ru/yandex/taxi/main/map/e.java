package ru.yandex.taxi.main.map;

import defpackage.ha2;

/* loaded from: classes5.dex */
public final class e {
    public final i a;
    public final ru.yandex.taxi.e b;
    public final ru.yandex.taxi.address.clarification.impl.repo.a c;

    public e(i iVar, ru.yandex.taxi.e eVar, ru.yandex.taxi.address.clarification.impl.repo.a aVar) {
        this.a = iVar;
        this.b = eVar;
        this.c = aVar;
    }

    public final ha2 a() {
        return kotlinx.coroutines.flow.e.n(this.a.a(), this.b.c(), kotlinx.coroutines.flow.e.d(this.c.f), new MainScreenPinInfoRepository$visibilityFlow$1(4, null));
    }
}
