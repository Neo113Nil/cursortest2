package com.yandex.passport.internal.sloth.credentialmanager;

import defpackage.cg6;
import defpackage.gm5;
import defpackage.nm6;
import defpackage.z7o;

/* loaded from: classes4.dex */
public final class h extends cg6 {
    public e j;
    public gm5 k;
    public boolean l;
    public /* synthetic */ Object m;
    public final /* synthetic */ k n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = kVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        Object g = this.n.g(null, false, null, null, this);
        return g == nm6.a ? g : new z7o(g);
    }
}
