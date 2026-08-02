package com.yandex.plus.home.common.utils.flow;

import com.yandex.plus.core.data.pay.f;
import defpackage.clc;
import defpackage.d4t;
import defpackage.nm6;
import defpackage.pjc;
import defpackage.rjc;
import defpackage.x0q;
import defpackage.y0q;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class b implements pjc {
    public final x0q a;
    public final f b;

    public b() {
        x0q b = y0q.b(Integer.MAX_VALUE, 0, null, 6);
        this.a = b;
        this.b = new f(new clc(b, new d4t(2, 14, null), 4), 1);
    }

    @Override // defpackage.pjc
    public final Object collect(rjc rjcVar, Continuation continuation) {
        Object collect = this.b.collect(rjcVar, continuation);
        return collect == nm6.a ? collect : Unit.a;
    }
}
