package com.yandex.plus.home.feature.webviews.internal.overlap;

import com.yandex.plus.home.datasource.openapi.models.u6;
import defpackage.msa;
import defpackage.nsa;
import defpackage.ssa;
import defpackage.yd5;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class g {
    public final long a;
    public final float b;
    public final Function0 c;
    public final WeakHashMap d;

    public g() {
        msa msaVar = nsa.b;
        long M = yd5.M(5, ssa.SECONDS);
        u6 u6Var = new u6(16);
        this.a = M;
        this.b = 0.2f;
        this.c = u6Var;
        this.d = new WeakHashMap();
    }
}
