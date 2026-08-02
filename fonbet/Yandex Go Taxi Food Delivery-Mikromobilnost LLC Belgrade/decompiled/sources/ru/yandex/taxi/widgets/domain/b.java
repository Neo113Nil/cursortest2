package ru.yandex.taxi.widgets.domain;

import defpackage.bm40;
import defpackage.tje;
import defpackage.wl40;
import defpackage.y451;
import java.util.List;
import kotlin.coroutines.EmptyCoroutineContext;

/* loaded from: classes6.dex */
public final class b {
    public final y451 a;

    public b(y451 y451Var) {
        this.a = y451Var;
    }

    public final bm40 a(wl40 wl40Var) {
        return new bm40(wl40Var, (List) tje.Y(EmptyCoroutineContext.a, new ShortTrackingInteractor$getShortTrackingOrderIds$1(this, null)));
    }
}
