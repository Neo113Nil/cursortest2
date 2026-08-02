package ru.yandex.taxi.layers.source.factory;

import defpackage.byx;
import defpackage.g92;
import defpackage.jqr;
import defpackage.o5e0;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.zyx;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes9.dex */
public final class e {
    public final zyx a;

    public e(zyx zyxVar) {
        this.a = zyxVar;
    }

    public final tpr a(o5e0 o5e0Var) {
        List list = o5e0Var.f;
        if (list == null) {
            return new g92(2, EmptyList.a);
        }
        rol0 rol0Var = new rol0(new PolylinesFactory$createPolylines$1(list, this, null));
        byx byxVar = o5e0Var.h;
        return new jqr(rol0Var, new PolylinesFactory$measureDuration$1(this, byxVar != null ? byxVar : null, System.currentTimeMillis(), null), 3);
    }
}
