package ru.yandex.taxi.di;

import com.yandex.go.coroutines.h;
import defpackage.alf0;
import defpackage.v7p;
import defpackage.xvf0;

/* loaded from: classes9.dex */
public final class a implements v7p {
    public final xvf0 a;

    public a(xvf0 xvf0Var) {
        this.a = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        return new ru.yandex.taxi.map_common.map.utils.a(new h(new MapCommonAppModule$Companion$provideProjection$1((alf0) this.a.get(), null)));
    }
}
