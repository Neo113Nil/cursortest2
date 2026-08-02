package com.yandex.passport.internal.autologin.ui;

import defpackage.cg6;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class g extends cg6 {
    public /* synthetic */ Object j;
    public int k;
    public final /* synthetic */ h l;
    public com.yandex.passport.internal.sloth.credentialmanager.a m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, Continuation continuation) {
        super(continuation);
        this.l = hVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
