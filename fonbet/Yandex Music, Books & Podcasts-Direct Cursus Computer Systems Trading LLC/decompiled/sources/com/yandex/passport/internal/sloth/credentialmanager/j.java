package com.yandex.passport.internal.sloth.credentialmanager;

import defpackage.cg6;
import defpackage.gm5;

/* loaded from: classes4.dex */
public final class j extends cg6 {
    public e j;
    public gm5 k;
    public /* synthetic */ Object l;
    public final /* synthetic */ k m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = kVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.h(null, null, null, this);
    }
}
