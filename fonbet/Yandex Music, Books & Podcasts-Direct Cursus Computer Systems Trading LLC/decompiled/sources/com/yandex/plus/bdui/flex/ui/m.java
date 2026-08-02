package com.yandex.plus.bdui.flex.ui;

import defpackage.cg6;

/* loaded from: classes4.dex */
public final class m extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ n k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = nVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.h(null, this);
    }
}
