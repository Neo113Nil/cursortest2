package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.notification;

import defpackage.hwy0;
import defpackage.m7;
import defpackage.p6s;
import defpackage.sae;
import defpackage.tpr;
import defpackage.u3s;
import kotlinx.coroutines.flow.e;

/* loaded from: classes5.dex */
public final class c extends m7 {
    public final b b;
    public final p6s c;
    public final hwy0 d;
    public final sae e;

    public c(u3s u3sVar, b bVar, p6s p6sVar, hwy0 hwy0Var, sae saeVar) {
        super(u3sVar);
        this.b = bVar;
        this.c = p6sVar;
        this.d = hwy0Var;
        this.e = saeVar;
    }

    @Override // defpackage.m7
    public final String c() {
        return "notification";
    }

    @Override // defpackage.m7
    public final tpr d(String str) {
        return e.n(this.d.b, b(str), this.c.e(), new NotificationWidgetStateHolder$getWidgets$1(this, null));
    }
}
