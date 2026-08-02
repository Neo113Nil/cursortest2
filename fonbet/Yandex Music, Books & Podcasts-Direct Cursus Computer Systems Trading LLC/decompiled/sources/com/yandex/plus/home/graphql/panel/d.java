package com.yandex.plus.home.graphql.panel;

import defpackage.cg6;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class d extends cg6 {
    public /* synthetic */ Object j;
    public int k;
    public final /* synthetic */ e l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, Continuation continuation) {
        super(continuation);
        this.l = eVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
