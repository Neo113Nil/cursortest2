package com.yandex.passport.internal.provider.communication;

import android.os.Message;
import defpackage.cg6;
import defpackage.j5;

/* loaded from: classes4.dex */
public final class b extends cg6 {
    public j5 j;
    public Message k;
    public /* synthetic */ Object l;
    public final /* synthetic */ j5 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(j5 j5Var, cg6 cg6Var) {
        super(cg6Var);
        this.m = j5Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return j5.u(this.m, null, this);
    }
}
