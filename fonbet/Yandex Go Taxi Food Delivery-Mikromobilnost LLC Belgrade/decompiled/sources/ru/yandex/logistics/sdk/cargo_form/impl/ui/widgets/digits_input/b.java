package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.digits_input;

import defpackage.m7;
import defpackage.p6s;
import defpackage.sae;
import defpackage.tpr;
import defpackage.u3s;
import defpackage.ujj;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes5.dex */
public final class b extends m7 {
    public final p6s b;
    public final ujj c;
    public final sae d;

    public b(u3s u3sVar, p6s p6sVar, ujj ujjVar, sae saeVar) {
        super(u3sVar);
        this.b = p6sVar;
        this.c = ujjVar;
        this.d = saeVar;
    }

    @Override // defpackage.m7
    public final String c() {
        return "digits-input";
    }

    @Override // defpackage.m7
    public final tpr d(String str) {
        return new m0(b(str), this.b.e(), new DigitsInputStateHolder$getWidgets$1(this, null));
    }
}
