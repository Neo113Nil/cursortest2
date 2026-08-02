package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.neuro_postcard;

import defpackage.acu;
import defpackage.b801;
import defpackage.ha2;
import defpackage.hwy0;
import defpackage.k360;
import defpackage.tpr;

/* loaded from: classes5.dex */
public final class d implements b801 {
    public final String a;
    public final b b;
    public final ha2 c;
    public final String d = "neuro-postcard";

    public d(ru.yandex.taxi.logistics.sdk.tracking.domain.impl.e eVar, k360 k360Var, hwy0 hwy0Var, String str, b bVar) {
        this.a = str;
        this.b = bVar;
        this.c = kotlinx.coroutines.flow.e.n(new acu(eVar.e, 6), k360Var.b, hwy0Var.b, new NeuroPostcardStateHolder$widgetModelFlow$1(this, null));
    }

    @Override // defpackage.b801
    public final tpr a() {
        return this.c;
    }

    @Override // defpackage.b801
    public final String getKey() {
        return this.d;
    }
}
