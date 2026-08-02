package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.dynamic_content;

import defpackage.b801;
import defpackage.hwy0;
import defpackage.syc;
import defpackage.tpr;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes5.dex */
public final class f implements b801 {
    public final m0 a;
    public final String b = "dynamic-content-key";

    public f(d dVar, ru.yandex.taxi.logistics.sdk.tracking.domain.impl.e eVar, hwy0 hwy0Var) {
        this.a = new m0(hwy0Var.b, new syc(eVar.e, 9), new DynamicContentStateHolder$widgetModelFlow$1(dVar, null));
    }

    @Override // defpackage.b801
    public final tpr a() {
        return this.a;
    }

    @Override // defpackage.b801
    public final String getKey() {
        return this.b;
    }
}
