package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.divider;

import defpackage.hwy0;
import defpackage.m7;
import defpackage.sae;
import defpackage.tpr;
import defpackage.u3s;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes5.dex */
public final class b extends m7 {
    public final a b;
    public final hwy0 c;
    public final sae d;

    public b(u3s u3sVar, a aVar, hwy0 hwy0Var, sae saeVar) {
        super(u3sVar);
        this.b = aVar;
        this.c = hwy0Var;
        this.d = saeVar;
    }

    @Override // defpackage.m7
    public final String c() {
        return "divider";
    }

    @Override // defpackage.m7
    public final tpr d(String str) {
        return new m0(this.c.b, b(str), new DividerStateHolder$getWidgets$1(this, null));
    }
}
