package com.yandex.plus.home.state;

import defpackage.fs;
import defpackage.msa;
import defpackage.nsa;
import defpackage.oi3;
import defpackage.ssa;
import defpackage.x0q;
import defpackage.xkc;
import defpackage.xq0;
import defpackage.y0q;
import defpackage.y2x;
import defpackage.yd5;

/* loaded from: classes5.dex */
public final class a {
    public final x0q a;
    public final fs b;

    public a() {
        x0q b = y0q.b(0, 1, oi3.b, 1);
        this.a = b;
        msa msaVar = nsa.b;
        long c0 = y2x.c0(yd5.M(1, ssa.SECONDS));
        if (c0 > 0) {
            this.b = new fs(new xkc(c0, b, null));
        } else {
            xq0.x("Sample period should be positive");
            throw null;
        }
    }
}
