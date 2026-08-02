package com.yandex.plus.home.feature.webviews.internal.treasury;

import defpackage.cg6;
import defpackage.oqi;
import defpackage.rjc;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class b extends cg6 {
    public /* synthetic */ Object j;
    public int k;
    public final /* synthetic */ com.yandex.passport.common.mvi.c l;
    public rjc m;
    public oqi n;
    public int o;
    public int p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.yandex.passport.common.mvi.c cVar, Continuation continuation) {
        super(continuation);
        this.l = cVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
