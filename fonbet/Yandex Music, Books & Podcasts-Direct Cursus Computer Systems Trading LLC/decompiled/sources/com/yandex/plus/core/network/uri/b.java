package com.yandex.plus.core.network.uri;

import com.yandex.plus.core.network.interceptor.e;
import com.yandex.plus.core.network.okhttp.call.h;
import defpackage.cg6;

/* loaded from: classes4.dex */
public final class b extends cg6 {
    public e j;
    public com.yandex.plus.core.network.request.b k;
    public /* synthetic */ Object l;
    public final /* synthetic */ h m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(h hVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = hVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.a(null, this);
    }
}
