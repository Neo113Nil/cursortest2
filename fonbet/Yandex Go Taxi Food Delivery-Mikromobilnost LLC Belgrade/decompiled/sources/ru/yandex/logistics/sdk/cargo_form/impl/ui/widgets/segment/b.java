package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.segment;

import defpackage.fhu;
import defpackage.hwy0;
import defpackage.m7;
import defpackage.p6s;
import defpackage.sae;
import defpackage.tpr;
import defpackage.u3s;
import kotlinx.coroutines.flow.e;

/* loaded from: classes5.dex */
public final class b extends m7 {
    public final p6s b;
    public final a c;
    public final hwy0 d;
    public final fhu e;
    public final sae f;

    public b(u3s u3sVar, p6s p6sVar, a aVar, hwy0 hwy0Var, fhu fhuVar, sae saeVar) {
        super(u3sVar);
        this.b = p6sVar;
        this.c = aVar;
        this.d = hwy0Var;
        this.e = fhuVar;
        this.f = saeVar;
    }

    @Override // defpackage.m7
    public final String c() {
        return "segment";
    }

    @Override // defpackage.m7
    public final tpr d(String str) {
        return e.m(this.d.b, b(str), this.b.e(), this.e.b, new SegmentStateHolder$getWidgets$1(this, null));
    }
}
