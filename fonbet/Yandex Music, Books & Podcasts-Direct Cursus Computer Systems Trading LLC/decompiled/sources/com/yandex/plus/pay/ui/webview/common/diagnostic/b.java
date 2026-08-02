package com.yandex.plus.pay.ui.webview.common.diagnostic;

import defpackage.cg6;

/* loaded from: classes5.dex */
public final class b extends cg6 {
    public String j;
    public String k;
    public /* synthetic */ Object l;
    public final /* synthetic */ c m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = cVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.a(null, null, this);
    }
}
