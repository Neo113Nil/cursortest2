package com.yandex.passport.common.coroutine;

import defpackage.gld;
import defpackage.mm6;
import defpackage.o6c;
import defpackage.r2f;
import defpackage.tf6;
import defpackage.wqr;

/* loaded from: classes4.dex */
public abstract class c {
    public static final d a = new d(0);

    public static final tf6 a(mm6 mm6Var) {
        return gld.e(mm6Var.getCoroutineContext().plus(new wqr((r2f) mm6Var.getCoroutineContext().get(o6c.l))));
    }
}
