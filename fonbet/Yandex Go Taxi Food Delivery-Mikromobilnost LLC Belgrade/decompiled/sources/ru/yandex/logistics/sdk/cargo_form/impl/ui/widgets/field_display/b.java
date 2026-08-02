package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.field_display;

import defpackage.hwy0;
import defpackage.m7;
import defpackage.p6s;
import defpackage.sae;
import defpackage.tpr;
import defpackage.u3s;
import kotlinx.coroutines.flow.e;

/* loaded from: classes5.dex */
public final class b extends m7 {
    public final a b;
    public final p6s c;
    public final hwy0 d;
    public final sae e;

    public b(u3s u3sVar, a aVar, p6s p6sVar, hwy0 hwy0Var, sae saeVar) {
        super(u3sVar);
        this.b = aVar;
        this.c = p6sVar;
        this.d = hwy0Var;
        this.e = saeVar;
    }

    @Override // defpackage.m7
    public final String c() {
        return "field-display";
    }

    @Override // defpackage.m7
    public final tpr d(String str) {
        return e.n(this.d.b, b(str), this.c.e(), new FieldDisplayStateHolder$getWidgets$1(this, null));
    }
}
