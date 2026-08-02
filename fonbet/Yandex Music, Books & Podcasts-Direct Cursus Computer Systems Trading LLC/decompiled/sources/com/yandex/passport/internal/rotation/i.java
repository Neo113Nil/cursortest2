package com.yandex.passport.internal.rotation;

import defpackage.cg6;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class i extends cg6 {
    public List j;
    public Iterator k;
    public g l;
    public /* synthetic */ Object m;
    public final /* synthetic */ j n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = jVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.u(this);
    }
}
