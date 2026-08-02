package com.yandex.plus.core.network.okhttp.client;

import defpackage.cg6;

/* loaded from: classes4.dex */
public final class g extends cg6 {
    public com.yandex.plus.core.network.context.a j;
    public /* synthetic */ Object k;
    public final /* synthetic */ com.yandex.plus.core.network.retrofit.client.a l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.yandex.plus.core.network.retrofit.client.a aVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = aVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return com.yandex.plus.core.network.retrofit.client.a.a(this.l, null, null, null, this);
    }
}
