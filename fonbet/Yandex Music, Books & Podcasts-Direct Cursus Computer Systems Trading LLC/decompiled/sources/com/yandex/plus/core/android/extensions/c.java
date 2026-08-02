package com.yandex.plus.core.android.extensions;

import defpackage.msa;
import defpackage.nsa;
import defpackage.ssa;
import defpackage.yd5;

/* loaded from: classes4.dex */
public interface c {
    public static final b a = b.a;

    default long a() {
        msa msaVar = nsa.b;
        return yd5.N(get(), ssa.MILLISECONDS);
    }

    long get();
}
