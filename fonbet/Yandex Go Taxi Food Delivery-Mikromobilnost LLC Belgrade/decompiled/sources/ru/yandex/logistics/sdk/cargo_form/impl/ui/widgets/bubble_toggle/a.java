package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.bubble_toggle;

import defpackage.do6;
import defpackage.hwy0;
import defpackage.m7;
import defpackage.p6s;
import defpackage.sae;
import defpackage.tpr;
import defpackage.u3s;
import kotlinx.coroutines.flow.e;

/* loaded from: classes5.dex */
public final class a extends m7 {
    public final hwy0 b;
    public final do6 c;
    public final p6s d;
    public final sae e;

    public a(u3s u3sVar, hwy0 hwy0Var, do6 do6Var, p6s p6sVar, sae saeVar) {
        super(u3sVar);
        this.b = hwy0Var;
        this.c = do6Var;
        this.d = p6sVar;
        this.e = saeVar;
    }

    @Override // defpackage.m7
    public final String c() {
        return "bubble-toggles";
    }

    @Override // defpackage.m7
    public final tpr d(String str) {
        return e.n(this.b.b, b(str), this.d.e(), new BubbleToggleStateHolder$getWidgets$1(this, null));
    }
}
