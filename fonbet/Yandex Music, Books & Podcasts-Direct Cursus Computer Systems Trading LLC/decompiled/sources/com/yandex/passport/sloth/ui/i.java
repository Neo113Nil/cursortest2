package com.yandex.passport.sloth.ui;

import defpackage.cg6;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class i extends cg6 {
    public String j;
    public /* synthetic */ Object k;
    public final /* synthetic */ SlothJsApi$WebAmJsInterface l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(SlothJsApi$WebAmJsInterface slothJsApi$WebAmJsInterface, Continuation continuation) {
        super(continuation);
        this.l = slothJsApi$WebAmJsInterface;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        Object processRequest;
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        processRequest = this.l.processRequest(null, this);
        return processRequest;
    }
}
