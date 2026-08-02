package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.circle_input;

import defpackage.hwy0;
import defpackage.m7;
import defpackage.p6s;
import defpackage.sae;
import defpackage.tpr;
import defpackage.u3s;
import defpackage.z4s;
import kotlinx.coroutines.flow.e;

/* loaded from: classes5.dex */
public final class c extends m7 {
    public final b b;
    public final hwy0 c;
    public final z4s d;
    public final p6s e;
    public final sae f;

    public c(u3s u3sVar, b bVar, hwy0 hwy0Var, z4s z4sVar, p6s p6sVar, sae saeVar) {
        super(u3sVar);
        this.b = bVar;
        this.c = hwy0Var;
        this.d = z4sVar;
        this.e = p6sVar;
        this.f = saeVar;
    }

    @Override // defpackage.m7
    public final String c() {
        return "circle-input";
    }

    @Override // defpackage.m7
    public final tpr d(String str) {
        return e.m(this.c.b, b(str), e.d(this.d.a), this.e.e(), new CircleInputStateHolder$getWidgets$1(this, null));
    }
}
