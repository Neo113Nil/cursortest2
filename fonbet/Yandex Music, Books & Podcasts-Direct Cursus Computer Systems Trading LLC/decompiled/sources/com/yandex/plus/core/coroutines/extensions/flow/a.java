package com.yandex.plus.core.coroutines.extensions.flow;

import com.yandex.passport.common.mvi.c;
import defpackage.cg6;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class a extends cg6 {
    public Object j;
    public /* synthetic */ Object k;
    public final /* synthetic */ c l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, Continuation continuation) {
        super(continuation);
        this.l = cVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
