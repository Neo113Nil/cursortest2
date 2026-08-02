package com.yandex.passport.internal.ui.sloth.ebs;

import defpackage.cg6;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class f1 extends cg6 {
    public /* synthetic */ Object j;
    public int k;
    public final /* synthetic */ com.yandex.passport.internal.social.esia.l0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(com.yandex.passport.internal.social.esia.l0 l0Var, Continuation continuation) {
        super(continuation);
        this.l = l0Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
