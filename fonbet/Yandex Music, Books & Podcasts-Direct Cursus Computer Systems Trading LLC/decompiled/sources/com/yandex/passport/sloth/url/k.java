package com.yandex.passport.sloth.url;

import com.yandex.passport.sloth.data.i0;
import defpackage.cg6;

/* loaded from: classes4.dex */
public final class k extends cg6 {
    public i0 j;
    public com.yandex.passport.common.core.b k;
    public Object l;
    public com.yandex.passport.sloth.data.a m;
    public String n;
    public int o;
    public /* synthetic */ Object p;
    public final /* synthetic */ v q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(v vVar, cg6 cg6Var) {
        super(cg6Var);
        this.q = vVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.p(null, this);
    }
}
