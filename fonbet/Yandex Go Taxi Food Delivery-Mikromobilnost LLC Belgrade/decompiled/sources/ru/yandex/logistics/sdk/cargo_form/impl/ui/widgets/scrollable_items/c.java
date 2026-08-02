package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.scrollable_items;

import defpackage.hwy0;
import defpackage.m7;
import defpackage.sae;
import defpackage.tpr;
import defpackage.u3s;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes5.dex */
public final class c extends m7 {
    public final b b;
    public final hwy0 c;
    public final sae d;

    public c(u3s u3sVar, b bVar, hwy0 hwy0Var, sae saeVar) {
        super(u3sVar);
        this.b = bVar;
        this.c = hwy0Var;
        this.d = saeVar;
    }

    @Override // defpackage.m7
    public final String c() {
        return "scrollable-items";
    }

    @Override // defpackage.m7
    public final tpr d(String str) {
        return new m0(this.c.b, b(str), new ScrollableItemsStateHolder$getWidgets$1(this, null));
    }
}
