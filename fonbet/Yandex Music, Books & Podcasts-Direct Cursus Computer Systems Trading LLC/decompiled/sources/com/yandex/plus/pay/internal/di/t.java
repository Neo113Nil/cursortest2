package com.yandex.plus.pay.internal.di;

import defpackage.jyr;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final /* synthetic */ class t implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ u b;

    public /* synthetic */ t(u uVar, int i) {
        this.a = i;
        this.b = uVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return ((com.yandex.plus.pay.internal.analytics.evgen.c) this.b.b.g.getValue()).a().a;
            case 1:
                return ((p) ((jyr) this.b.c.e).getValue()).a().a;
            default:
                return ((q) ((jyr) this.b.c.f).getValue()).a().b;
        }
    }
}
