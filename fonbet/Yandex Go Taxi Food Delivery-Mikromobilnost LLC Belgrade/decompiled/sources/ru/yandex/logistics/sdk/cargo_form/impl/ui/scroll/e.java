package ru.yandex.logistics.sdk.cargo_form.impl.ui.scroll;

import defpackage.a2y;
import defpackage.goe;
import defpackage.mth;
import defpackage.q98;
import defpackage.u3s;
import defpackage.xhp0;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes5.dex */
public final class e {
    public final xhp0 a;
    public final goe b;
    public final u3s c;
    public final a2y d;

    public e(xhp0 xhp0Var, goe goeVar, u3s u3sVar, a2y a2yVar) {
        this.a = xhp0Var;
        this.b = goeVar;
        this.c = u3sVar;
        this.d = a2yVar;
    }

    public final kotlinx.coroutines.flow.internal.g a(Anchor anchor) {
        int i = 6;
        return kotlinx.coroutines.flow.e.X(new m0(new q98(new mth(this.c.a(), i), 10), new mth(this.d.e, i), new ScrollTagStateHolder$tagFlow$2(3, null)), new ScrollTagStateHolder$tagFlow$$inlined$flatMapLatest$1(null, this, anchor));
    }
}
