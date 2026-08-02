package com.yandex.passport.sloth.ui;

import defpackage.cg6;
import defpackage.nm6;
import defpackage.z7o;
import java.io.Serializable;

/* loaded from: classes4.dex */
public final class x extends cg6 {
    public com.yandex.passport.sloth.p j;
    public com.yandex.passport.sloth.p k;
    public com.yandex.passport.common.core.f l;
    public /* synthetic */ Object m;
    public final /* synthetic */ b0 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(b0 b0Var, cg6 cg6Var) {
        super(cg6Var);
        this.n = b0Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        Serializable t = this.n.t(null, null, this);
        return t == nm6.a ? t : new z7o(t);
    }
}
