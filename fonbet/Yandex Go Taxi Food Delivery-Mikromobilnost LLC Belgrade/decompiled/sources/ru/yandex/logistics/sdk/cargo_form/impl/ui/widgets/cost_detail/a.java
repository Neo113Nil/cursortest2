package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.cost_detail;

import defpackage.hwy0;
import defpackage.m7;
import defpackage.sae;
import defpackage.tpr;
import defpackage.u3s;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes5.dex */
public final class a extends m7 {
    public final hwy0 b;
    public final b c;
    public final sae d;

    public a(u3s u3sVar, hwy0 hwy0Var, b bVar, sae saeVar) {
        super(u3sVar);
        this.b = hwy0Var;
        this.c = bVar;
        this.d = saeVar;
    }

    @Override // defpackage.m7
    public final String c() {
        return "cost-detail";
    }

    @Override // defpackage.m7
    public final tpr d(String str) {
        return new m0(this.b.b, b(str), new CostDetailStateHolder$getWidgets$1(this, null));
    }
}
