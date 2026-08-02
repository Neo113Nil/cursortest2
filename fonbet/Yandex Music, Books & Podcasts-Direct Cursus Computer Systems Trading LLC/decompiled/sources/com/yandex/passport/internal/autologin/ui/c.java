package com.yandex.passport.internal.autologin.ui;

import android.content.Context;
import defpackage.cg6;

/* loaded from: classes4.dex */
public final class c extends cg6 {
    public Context j;
    public /* synthetic */ Object k;
    public final /* synthetic */ k l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(k kVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = kVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.b(null, this);
    }
}
