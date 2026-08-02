package com.yandex.plus.home.plusstate;

import defpackage.cg6;

/* loaded from: classes5.dex */
public final class a extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ com.yandex.plus.home.plaque.plugin.internal.proxy.a k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.yandex.plus.home.plaque.plugin.internal.proxy.a aVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = aVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.u(this);
    }
}
