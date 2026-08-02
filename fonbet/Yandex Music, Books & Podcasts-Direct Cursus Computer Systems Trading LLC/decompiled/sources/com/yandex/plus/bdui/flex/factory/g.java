package com.yandex.plus.bdui.flex.factory;

import defpackage.cg6;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public final class g extends cg6 {
    public Map j;
    public Iterator k;
    public Map l;
    public Map m;
    public com.yandex.passport.internal.core.accounts.h n;
    public /* synthetic */ Object o;
    public final /* synthetic */ com.yandex.passport.internal.core.accounts.h p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.yandex.passport.internal.core.accounts.h hVar, cg6 cg6Var) {
        super(cg6Var);
        this.p = hVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.w(this);
    }
}
