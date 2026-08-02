package com.yandex.passport.internal.links;

import com.yandex.passport.internal.l;
import defpackage.cg6;

/* loaded from: classes4.dex */
public final class f extends cg6 {
    public l j;
    public com.yandex.passport.internal.properties.l k;
    public /* synthetic */ Object l;
    public final /* synthetic */ g m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = gVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return g.M(this.m, null, null, this);
    }
}
