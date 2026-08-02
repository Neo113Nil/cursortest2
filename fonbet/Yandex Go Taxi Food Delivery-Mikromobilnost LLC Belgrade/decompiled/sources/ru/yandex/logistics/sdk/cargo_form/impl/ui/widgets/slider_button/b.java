package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.slider_button;

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
    public final hwy0 b;
    public final a c;
    public final sae d;
    public final z4s e;
    public final s5s f;

    public b(u3s u3sVar, hwy0 hwy0Var, a aVar, sae saeVar, z4s z4sVar, s5s s5sVar) {
        super(u3sVar);
        this.b = hwy0Var;
        this.c = aVar;
        this.d = saeVar;
        this.e = z4sVar;
        this.f = s5sVar;
    }

    @Override // defpackage.m7
    public final String c() {
        return "slider-button";
    }

    @Override // defpackage.m7
    public final tpr d(String str) {
        return e.m(this.b.b, b(str), e.d(this.e.a), this.f.d, new SliderButtonStateHolder$getWidgets$1(this, null));
    }
}
