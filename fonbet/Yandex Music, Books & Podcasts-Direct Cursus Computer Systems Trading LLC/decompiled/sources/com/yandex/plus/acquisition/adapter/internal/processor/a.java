package com.yandex.plus.acquisition.adapter.internal.processor;

import defpackage.cg6;
import defpackage.xdr;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class a extends cg6 {
    public String j;
    public String k;
    public com.yandex.plus.acquisition.sdk.pay.common.api.a l;
    public xdr m;
    public boolean n;
    public /* synthetic */ Object o;
    public final /* synthetic */ b p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(continuation);
        this.p = bVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.a(null, null, null, null, false, null, this);
    }
}
