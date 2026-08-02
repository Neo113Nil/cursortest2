package com.yandex.plus.bdui.flex.utils;

import defpackage.cg6;
import defpackage.nm6;
import defpackage.z7o;

/* loaded from: classes4.dex */
public final class e extends cg6 {
    public d j;
    public g k;
    public int l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ g o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, cg6 cg6Var) {
        super(cg6Var);
        this.o = gVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        Object b = this.o.b(null, this);
        return b == nm6.a ? b : new z7o(b);
    }
}
