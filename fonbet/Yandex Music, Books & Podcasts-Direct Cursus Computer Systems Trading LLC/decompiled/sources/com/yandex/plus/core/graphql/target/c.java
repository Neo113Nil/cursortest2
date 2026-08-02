package com.yandex.plus.core.graphql.target;

import com.yandex.plus.core.graphql.type.h;
import defpackage.cg6;

/* loaded from: classes4.dex */
public final class c extends cg6 {
    public String j;
    public h k;
    public String l;
    public /* synthetic */ Object m;
    public final /* synthetic */ d n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = dVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.a(null, null, null, this);
    }
}
