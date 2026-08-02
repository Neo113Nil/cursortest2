package ru.yandex.taxi.logistics.sdk.confirmation_modal_view.ui;

import defpackage.bvf0;
import defpackage.ds31;
import defpackage.gci0;
import defpackage.hwy0;
import defpackage.tje;
import defpackage.v3e;
import defpackage.y3e;
import defpackage.yr31;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes5.dex */
public final class e extends yr31 {
    public final v3e b;
    public final y3e c;
    public final hwy0 w;
    public final c x;
    public final r0 y;
    public final gci0 z;

    public e(v3e v3eVar, y3e y3eVar, hwy0 hwy0Var, c cVar) {
        this.b = v3eVar;
        this.c = y3eVar;
        this.w = hwy0Var;
        this.x = cVar;
        r0 c = bvf0.c(null);
        this.y = c;
        this.z = kotlinx.coroutines.flow.e.d(c);
        tje.N(ds31.a(this), null, null, new ConfirmationViewModel$1(this, null), 3);
    }
}
