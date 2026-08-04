package com.gamericefishpro.space.m1;

import com.gamericefishpro.space.ei.a0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends com.gamericefishpro.space.ei.l implements Function1 {
    public final /* synthetic */ a0 d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(a0 a0Var, int i) {
        super(1);
        this.d = a0Var;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Boolean boolValueOf = Boolean.valueOf(((u) obj).H0(this.e));
        this.d.d = boolValueOf;
        return boolValueOf;
    }
}
