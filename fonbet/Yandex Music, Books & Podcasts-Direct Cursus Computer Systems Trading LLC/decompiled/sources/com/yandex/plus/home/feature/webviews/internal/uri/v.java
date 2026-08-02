package com.yandex.plus.home.feature.webviews.internal.uri;

import defpackage.cg6;

/* loaded from: classes5.dex */
public final class v extends cg6 {
    public String j;
    public /* synthetic */ Object k;
    public final /* synthetic */ w l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = wVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(null, null, this);
    }
}
