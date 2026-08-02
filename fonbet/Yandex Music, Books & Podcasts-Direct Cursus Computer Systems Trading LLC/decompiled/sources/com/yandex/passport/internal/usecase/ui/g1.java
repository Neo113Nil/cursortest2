package com.yandex.passport.internal.usecase.ui;

import defpackage.cg6;
import java.io.Closeable;

/* loaded from: classes4.dex */
public final class g1 extends cg6 {
    public i1 j;
    public com.yandex.passport.internal.ui.e k;
    public Closeable l;
    public Object m;
    public int n;
    public int o;
    public /* synthetic */ Object p;
    public final /* synthetic */ i1 q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(i1 i1Var, cg6 cg6Var) {
        super(cg6Var);
        this.q = i1Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.x(null, this);
    }
}
