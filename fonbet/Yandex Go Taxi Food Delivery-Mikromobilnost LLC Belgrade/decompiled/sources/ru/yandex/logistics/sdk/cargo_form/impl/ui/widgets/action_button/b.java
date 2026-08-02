package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.action_button;

import defpackage.hwy0;
import defpackage.m7;
import defpackage.s5s;
import defpackage.sae;
import defpackage.tpr;
import defpackage.u3s;
import defpackage.z4s;
import kotlinx.coroutines.flow.e;

/* loaded from: classes5.dex */
public final class b extends m7 {
    public final z4s b;
    public final a c;
    public final s5s d;
    public final hwy0 e;
    public final sae f;

    public b(u3s u3sVar, z4s z4sVar, a aVar, s5s s5sVar, hwy0 hwy0Var, sae saeVar) {
        super(u3sVar);
        this.b = z4sVar;
        this.c = aVar;
        this.d = s5sVar;
        this.e = hwy0Var;
        this.f = saeVar;
    }

    @Override // defpackage.m7
    public final String c() {
        return "action-button";
    }

    @Override // defpackage.m7
    public final tpr d(String str) {
        return e.m(this.e.b, b(str), e.d(this.b.a), this.d.d, new ActionButtonStateHolder$getWidgets$1(this, null));
    }
}
