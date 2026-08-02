package com.yandex.plus.home.common.utils;

import defpackage.cg6;
import defpackage.gm5;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class e extends cg6 {
    public gm5 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ f l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, Continuation continuation) {
        super(continuation);
        this.l = fVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.H(this);
    }
}
