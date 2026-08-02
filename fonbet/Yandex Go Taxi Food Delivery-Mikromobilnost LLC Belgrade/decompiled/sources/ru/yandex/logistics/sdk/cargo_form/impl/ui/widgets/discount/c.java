package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.discount;

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
    public final b c;
    public final hwy0 d;
    public final sae e;

    public c(u3s u3sVar, p6s p6sVar, b bVar, hwy0 hwy0Var, sae saeVar) {
        super(u3sVar);
        this.b = p6sVar;
        this.c = bVar;
        this.d = hwy0Var;
        this.e = saeVar;
    }

    @Override // defpackage.m7
    public final String c() {
        return "discount";
    }

    @Override // defpackage.m7
    public final tpr d(String str) {
        return e.n(this.d.b, b(str), this.b.e(), new DiscountStateHolder$getWidgets$1(this, null));
    }
}
