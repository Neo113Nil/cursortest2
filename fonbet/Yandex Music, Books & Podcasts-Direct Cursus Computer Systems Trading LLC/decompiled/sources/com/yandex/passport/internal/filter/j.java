package com.yandex.passport.internal.filter;

import defpackage.cg6;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class j extends cg6 {
    public Map j;
    public LinkedHashMap k;
    public /* synthetic */ Object l;
    public final /* synthetic */ l m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = lVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.d(null, null, this);
    }
}
