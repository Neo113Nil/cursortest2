package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.selector;

import defpackage.hwy0;
import defpackage.m7;
import defpackage.p6s;
import defpackage.sae;
import defpackage.tpr;
import defpackage.u3s;
import kotlinx.coroutines.flow.e;

/* loaded from: classes5.dex */
public final class c extends m7 {
    public final p6s b;
    public final hwy0 c;
    public final b d;
    public final sae e;

    public c(u3s u3sVar, p6s p6sVar, hwy0 hwy0Var, b bVar, sae saeVar) {
        super(u3sVar);
        this.b = p6sVar;
        this.c = hwy0Var;
        this.d = bVar;
        this.e = saeVar;
    }

    @Override // defpackage.m7
    public final String c() {
        return "selector";
    }

    @Override // defpackage.m7
    public final tpr d(String str) {
        return e.n(this.c.b, b(str), this.b.e(), new SelectorStateHolder$getWidgets$1(this, null));
    }
}
