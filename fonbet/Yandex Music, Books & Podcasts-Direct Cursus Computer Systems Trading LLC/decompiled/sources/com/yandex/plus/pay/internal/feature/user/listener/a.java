package com.yandex.plus.pay.internal.feature.user.listener;

import defpackage.cg6;
import defpackage.mm6;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class a extends cg6 {
    public mm6 j;
    public com.yandex.plus.domain.auth.api.e k;
    public Object[] l;
    public int m;
    public int n;
    public int o;
    public /* synthetic */ Object p;
    public final /* synthetic */ b q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(continuation);
        this.q = bVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(null, null, this);
    }
}
