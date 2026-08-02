package com.yandex.passport.internal.push;

import com.yandex.passport.api.v2;
import defpackage.cg6;

/* loaded from: classes4.dex */
public final class b extends cg6 {
    public v2 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ g l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(g gVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = gVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.c(null, this);
    }
}
