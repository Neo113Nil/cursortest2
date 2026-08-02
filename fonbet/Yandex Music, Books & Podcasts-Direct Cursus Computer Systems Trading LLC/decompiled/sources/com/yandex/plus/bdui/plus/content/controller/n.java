package com.yandex.plus.bdui.plus.content.controller;

import defpackage.cg6;

/* loaded from: classes4.dex */
public final class n extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ q k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(q qVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = qVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.d(null, null, null, this);
    }
}
