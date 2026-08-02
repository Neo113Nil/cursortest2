package com.yandex.passport.data.network;

import defpackage.cg6;
import defpackage.d0o;
import defpackage.xqn;
import java.util.List;

/* loaded from: classes4.dex */
public final class w0 extends cg6 {
    public d0o j;
    public List k;
    public xqn l;
    public int m;
    public int n;
    public int o;
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ y0 r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(y0 y0Var, cg6 cg6Var) {
        super(cg6Var);
        this.r = y0Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.v(null, this);
    }
}
