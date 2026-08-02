package com.yandex.passport.common.mvi;

import defpackage.cg6;
import defpackage.nm6;
import defpackage.r96;

/* loaded from: classes4.dex */
public final class i extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ r96 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(r96 r96Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = r96Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        this.k.a(null, this);
        return nm6.a;
    }
}
