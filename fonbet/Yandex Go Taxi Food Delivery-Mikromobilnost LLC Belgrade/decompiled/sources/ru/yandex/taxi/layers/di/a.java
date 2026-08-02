package ru.yandex.taxi.layers.di;

import defpackage.ayx;
import defpackage.lx4;
import defpackage.m2g;
import defpackage.v7p;
import defpackage.xyx;
import defpackage.yyx;

/* loaded from: classes9.dex */
public final class a implements v7p {
    public final m2g a;
    public final ayx b;

    public a(m2g m2gVar, ayx ayxVar) {
        this.a = m2gVar;
        this.b = ayxVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        lx4 lx4Var = (lx4) this.a.get();
        xyx xyxVar = (xyx) this.b.get();
        return new yyx(new LayersModule$Companion$layersPerformanceAnalytics$1(0, xyxVar, xyx.class, "isLayersPerfCollectingEnabled", "isLayersPerfCollectingEnabled()Z", 0), new ru.yandex.taxi.layers.analytics.a(lx4Var));
    }
}
