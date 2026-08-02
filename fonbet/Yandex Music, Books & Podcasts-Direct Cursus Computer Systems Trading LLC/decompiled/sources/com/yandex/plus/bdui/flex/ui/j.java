package com.yandex.plus.bdui.flex.ui;

import defpackage.cg6;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class j extends cg6 {
    public Iterator j;
    public p k;
    public com.yandex.plus.bdui.shared.b l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ n o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(n nVar, cg6 cg6Var) {
        super(cg6Var);
        this.o = nVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.c(null, this);
    }
}
