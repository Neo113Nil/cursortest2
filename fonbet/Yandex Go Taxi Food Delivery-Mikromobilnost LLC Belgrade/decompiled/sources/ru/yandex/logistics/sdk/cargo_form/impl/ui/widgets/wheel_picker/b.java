package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.wheel_picker;

import defpackage.hwy0;
import defpackage.m7;
import defpackage.p6s;
import defpackage.sae;
import defpackage.tpr;
import defpackage.u0z;
import defpackage.u3s;
import kotlinx.coroutines.flow.e;

/* loaded from: classes5.dex */
public final class b extends m7 {
    public final hwy0 b;
    public final u0z c;
    public final p6s d;
    public final sae e;

    public b(u3s u3sVar, hwy0 hwy0Var, u0z u0zVar, p6s p6sVar, sae saeVar) {
        super(u3sVar);
        this.b = hwy0Var;
        this.c = u0zVar;
        this.d = p6sVar;
        this.e = saeVar;
    }

    @Override // defpackage.m7
    public final String c() {
        return "picker";
    }

    @Override // defpackage.m7
    public final tpr d(String str) {
        return e.n(this.b.b, b(str), this.d.e(), new WheelPickerStateHolder$getWidgets$1(this, null));
    }
}
