package com.yandex.plus.webview.api.contract.message;

import defpackage.cg6;

/* loaded from: classes5.dex */
public final class c extends cg6 {
    public String j;
    public /* synthetic */ Object k;
    public final /* synthetic */ d l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = dVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return d.b(this.l, null, this);
    }
}
