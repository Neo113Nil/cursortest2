package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.shortcut_widget;

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
    public final hwy0 c;
    public final p6s d;
    public final sae e;

    public b(a aVar, hwy0 hwy0Var, p6s p6sVar, sae saeVar, u3s u3sVar) {
        super(u3sVar);
        this.b = aVar;
        this.c = hwy0Var;
        this.d = p6sVar;
        this.e = saeVar;
    }

    @Override // defpackage.m7
    public final String c() {
        return "shortcut";
    }

    @Override // defpackage.m7
    public final tpr d(String str) {
        return e.n(this.c.b, this.d.e(), b(str), new ShortcutStateHolder$getWidgets$1(this, null));
    }
}
