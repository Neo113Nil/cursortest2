package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.editable_route_widget;

import defpackage.hwy0;
import defpackage.m7;
import defpackage.p6s;
import defpackage.sae;
import defpackage.tpr;
import defpackage.u3s;
import defpackage.z4s;
import kotlinx.coroutines.flow.e;

/* loaded from: classes5.dex */
public final class b extends m7 {
    public final p6s b;
    public final hwy0 c;
    public final a d;
    public final z4s e;
    public final sae f;

    public b(u3s u3sVar, p6s p6sVar, hwy0 hwy0Var, a aVar, z4s z4sVar, sae saeVar) {
        super(u3sVar);
        this.b = p6sVar;
        this.c = hwy0Var;
        this.d = aVar;
        this.e = z4sVar;
        this.f = saeVar;
    }

    @Override // defpackage.m7
    public final String c() {
        return "editable-route-widgets";
    }

    @Override // defpackage.m7
    public final tpr d(String str) {
        return e.m(this.c.b, b(str), this.b.e(), e.d(this.e.a), new EditableRouteStateHolder$getWidgets$1(this, null));
    }
}
