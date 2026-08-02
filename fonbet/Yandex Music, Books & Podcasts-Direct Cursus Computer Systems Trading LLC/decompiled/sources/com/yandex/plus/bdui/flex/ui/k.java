package com.yandex.plus.bdui.flex.ui;

import defpackage.cg6;
import defpackage.rar;

/* loaded from: classes4.dex */
public final class k extends cg6 {
    public rar j;
    public /* synthetic */ Object k;
    public final /* synthetic */ n l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(n nVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = nVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return n.a(this.l, null, null, this);
    }
}
