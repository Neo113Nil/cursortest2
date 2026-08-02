package com.yandex.passport.sloth.url;

import com.yandex.passport.sloth.data.o0;
import defpackage.cg6;

/* loaded from: classes4.dex */
public final class j extends cg6 {
    public o0 j;
    public Object k;
    public v l;
    public /* synthetic */ Object m;
    public final /* synthetic */ v n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(v vVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = vVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.m(null, this);
    }
}
