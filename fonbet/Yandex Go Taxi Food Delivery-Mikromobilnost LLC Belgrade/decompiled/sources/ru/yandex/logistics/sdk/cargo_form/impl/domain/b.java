package ru.yandex.logistics.sdk.cargo_form.impl.domain;

import defpackage.c9x0;
import defpackage.qoi0;
import defpackage.ryh;
import defpackage.s030;
import defpackage.tje;

/* loaded from: classes5.dex */
public final class b implements s030 {
    public final /* synthetic */ c a;
    public final /* synthetic */ c9x0 b;

    public b(c cVar, c9x0 c9x0Var) {
        this.a = cVar;
        this.b = c9x0Var;
    }

    @Override // defpackage.s030
    public final void onDismiss() {
        ((com.yandex.go.logistics.cargo_flow.a) this.a.b.a.b).e0.b(qoi0.a(ryh.class));
    }

    @Override // defpackage.s030
    public final void q4() {
        c cVar = this.a;
        tje.N(cVar.z, null, null, new TapActionHandler$openOverMapModalView$callback$1$drawRouteOnMap$1(cVar, this.b, null), 3);
    }
}
