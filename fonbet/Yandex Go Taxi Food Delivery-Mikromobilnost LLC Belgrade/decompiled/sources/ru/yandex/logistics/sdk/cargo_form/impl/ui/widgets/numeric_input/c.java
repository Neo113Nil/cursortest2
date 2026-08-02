package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.numeric_input;

import defpackage.m7;
import defpackage.p6s;
import defpackage.sae;
import defpackage.tpr;
import defpackage.u3s;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes5.dex */
public final class c extends m7 {
    public final p6s b;
    public final b c;
    public final sae d;

    public c(u3s u3sVar, p6s p6sVar, b bVar, sae saeVar) {
        super(u3sVar);
        this.b = p6sVar;
        this.c = bVar;
        this.d = saeVar;
    }

    @Override // defpackage.m7
    public final String c() {
        return "numeric-input";
    }

    @Override // defpackage.m7
    public final tpr d(String str) {
        return new m0(b(str), this.b.e(), new NumericInputStateHolder$getWidgets$1(this, null));
    }
}
