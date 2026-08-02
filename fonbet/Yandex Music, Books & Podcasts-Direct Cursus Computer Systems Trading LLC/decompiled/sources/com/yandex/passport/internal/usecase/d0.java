package com.yandex.passport.internal.usecase;

import defpackage.cg6;
import java.io.Closeable;

/* loaded from: classes4.dex */
public final class d0 extends cg6 {
    public c0 j;
    public e0 k;
    public com.yandex.passport.internal.ui.domik.o l;
    public Closeable m;
    public Object n;
    public int o;
    public int p;
    public long q;
    public /* synthetic */ Object r;
    public final /* synthetic */ e0 s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(e0 e0Var, cg6 cg6Var) {
        super(cg6Var);
        this.s = e0Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.x(null, this);
    }
}
