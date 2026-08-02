package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.scalable_selector;

import defpackage.hwy0;
import defpackage.m7;
import defpackage.p6s;
import defpackage.sae;
import defpackage.tpr;
import defpackage.u3s;
import kotlinx.coroutines.flow.e;

/* loaded from: classes5.dex */
public final class c extends m7 {
    public final b b;
    public final hwy0 c;
    public final p6s d;
    public final sae e;

    public c(u3s u3sVar, b bVar, hwy0 hwy0Var, p6s p6sVar, sae saeVar) {
        super(u3sVar);
        this.b = bVar;
        this.c = hwy0Var;
        this.d = p6sVar;
        this.e = saeVar;
    }

    @Override // defpackage.m7
    public final String c() {
        return "scalable-selector";
    }

    @Override // defpackage.m7
    public final tpr d(String str) {
        return e.n(this.c.b, b(str), this.d.e(), new ScalableSelectorStateHolder$getWidgets$1(this, null));
    }
}
