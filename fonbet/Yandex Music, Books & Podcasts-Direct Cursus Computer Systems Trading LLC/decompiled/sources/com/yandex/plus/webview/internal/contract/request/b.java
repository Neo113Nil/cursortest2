package com.yandex.plus.webview.internal.contract.request;

import com.yandex.plus.home.internal.di.y;
import defpackage.cg6;

/* loaded from: classes5.dex */
public final class b extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ y k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(y yVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = yVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.f(null, this);
    }
}
