package ru.yandex.taxi.bubbles.interactors;

import defpackage.tpr;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.e;
import ru.yandex.taxi.share_favorites.experiments.c;

/* loaded from: classes5.dex */
public final class a {
    public final e a;
    public final c b;

    public a(e eVar, c cVar) {
        this.a = eVar;
        this.b = cVar;
    }

    public final tpr a() {
        return kotlinx.coroutines.flow.e.t(new m0(this.a.a(), this.b.a(), new BubbleModelRepositoryImpl$activeBubbleModelFlow$1(3, null)));
    }
}
