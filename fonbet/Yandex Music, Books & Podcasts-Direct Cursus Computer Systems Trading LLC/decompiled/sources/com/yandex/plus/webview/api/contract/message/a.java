package com.yandex.plus.webview.api.contract.message;

import com.yandex.passport.internal.core.accounts.h;
import defpackage.cg6;

/* loaded from: classes5.dex */
public final class a extends cg6 {
    public Object j;
    public /* synthetic */ Object k;
    public final /* synthetic */ h l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(h hVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = hVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return h.c(this.l, null, this);
    }
}
