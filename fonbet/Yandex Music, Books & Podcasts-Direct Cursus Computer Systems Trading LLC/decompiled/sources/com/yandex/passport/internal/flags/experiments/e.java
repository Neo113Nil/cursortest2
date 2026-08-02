package com.yandex.passport.internal.flags.experiments;

import defpackage.cg6;
import defpackage.z7o;

/* loaded from: classes4.dex */
public final class e extends cg6 {
    public z7o j;
    public /* synthetic */ Object k;
    public final /* synthetic */ f l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = fVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(null, this);
    }
}
