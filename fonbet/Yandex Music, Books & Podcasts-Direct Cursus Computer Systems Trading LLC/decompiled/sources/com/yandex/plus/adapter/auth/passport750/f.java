package com.yandex.plus.adapter.auth.passport750;

import defpackage.cg6;
import defpackage.nm6;
import defpackage.z7o;
import java.io.Serializable;

/* loaded from: classes4.dex */
public final class f extends cg6 {
    public Serializable j;
    public /* synthetic */ Object k;
    public final /* synthetic */ i l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = iVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        Object f = this.l.f(null, this);
        return f == nm6.a ? f : new z7o(f);
    }
}
