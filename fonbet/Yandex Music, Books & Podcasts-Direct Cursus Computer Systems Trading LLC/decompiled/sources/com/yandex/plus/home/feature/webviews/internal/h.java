package com.yandex.plus.home.feature.webviews.internal;

import com.yandex.passport.internal.social.esia.l0;
import defpackage.cg6;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class h extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ l0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(l0 l0Var, Continuation continuation) {
        super(continuation);
        this.k = l0Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.b(null, this);
    }
}
