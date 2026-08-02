package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.minimap;

import defpackage.e100;
import defpackage.gci0;
import defpackage.hs0;
import defpackage.hwy0;
import defpackage.is0;
import defpackage.m7;
import defpackage.p3s;
import defpackage.p6s;
import defpackage.sae;
import defpackage.tpr;
import defpackage.u3s;
import kotlinx.coroutines.flow.e;

/* loaded from: classes5.dex */
public final class a extends m7 {
    public final hwy0 b;
    public final e100 c;
    public final is0 d;
    public final ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.minimap.domain.a e;
    public final sae f;
    public final p6s g;

    public a(u3s u3sVar, hwy0 hwy0Var, e100 e100Var, is0 is0Var, ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.minimap.domain.a aVar, sae saeVar, p6s p6sVar) {
        super(u3sVar);
        this.b = hwy0Var;
        this.c = e100Var;
        this.d = is0Var;
        this.e = aVar;
        this.f = saeVar;
        this.g = p6sVar;
    }

    @Override // defpackage.m7
    public final String c() {
        return "mini-map";
    }

    @Override // defpackage.m7
    public final tpr d(String str) {
        tpr t = e.t(b(str));
        gci0 gci0Var = this.b.b;
        is0 is0Var = this.d;
        return e.X(e.m(t, gci0Var, new hs0(((p3s) is0Var.a).b("delivery_order_form_address_details"), is0Var, 1), this.g.e(), new MiniMapStateHolder$getWidgets$1(this, null)), new MiniMapStateHolder$getWidgets$2(this, null));
    }
}
