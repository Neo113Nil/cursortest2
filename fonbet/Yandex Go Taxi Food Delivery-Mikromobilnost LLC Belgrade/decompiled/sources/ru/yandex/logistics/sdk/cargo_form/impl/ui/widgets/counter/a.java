package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.counter;

import defpackage.do6;
import defpackage.m7;
import defpackage.p6s;
import defpackage.sae;
import defpackage.tpr;
import defpackage.u3s;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes5.dex */
public final class a extends m7 {
    public final p6s b;
    public final do6 c;
    public final sae d;

    public a(u3s u3sVar, p6s p6sVar, do6 do6Var, sae saeVar) {
        super(u3sVar);
        this.b = p6sVar;
        this.c = do6Var;
        this.d = saeVar;
    }

    @Override // defpackage.m7
    public final String c() {
        return "counter";
    }

    @Override // defpackage.m7
    public final tpr d(String str) {
        return new m0(b(str), this.b.e(), new CounterStateHolder$getWidgets$1(this, null));
    }
}
