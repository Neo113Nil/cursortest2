package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.accent_button;

import defpackage.b801;
import defpackage.hwy0;
import defpackage.nb;
import defpackage.pb;
import defpackage.tpr;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.logistics.sdk.tracking.domain.impl.e;

/* loaded from: classes5.dex */
public final class b implements b801 {
    public final m0 a;
    public final String b = "accent-button-key";

    public b(e eVar, hwy0 hwy0Var, nb nbVar) {
        this.a = new m0(hwy0Var.b, new pb(eVar.e, 0), new AccentButtonStateHolder$widgetModelFlow$1(nbVar, null));
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
