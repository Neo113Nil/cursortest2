package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.tag_line;

import defpackage.hwy0;
import defpackage.m7;
import defpackage.sae;
import defpackage.tpr;
import defpackage.u0z;
import defpackage.u3s;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes5.dex */
public final class a extends m7 {
    public final u0z b;
    public final hwy0 c;
    public final sae d;

    public a(u3s u3sVar, u0z u0zVar, hwy0 hwy0Var, sae saeVar) {
        super(u3sVar);
        this.b = u0zVar;
        this.c = hwy0Var;
        this.d = saeVar;
    }

    @Override // defpackage.m7
    public final String c() {
        return "tag-line";
    }

    @Override // defpackage.m7
    public final tpr d(String str) {
        return new m0(this.c.b, b(str), new TagLineStateHolder$getWidgets$1(this, null));
    }
}
