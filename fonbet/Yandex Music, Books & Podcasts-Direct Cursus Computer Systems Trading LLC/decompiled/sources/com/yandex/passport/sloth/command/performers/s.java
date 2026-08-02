package com.yandex.passport.sloth.command.performers;

import defpackage.cg6;

/* loaded from: classes4.dex */
public final class s extends cg6 {
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ t l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = tVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.n(null, this);
    }
}
