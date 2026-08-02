package com.yandex.passport.internal.autologin;

import defpackage.cg6;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class i extends cg6 {
    public e j;
    public List k;
    public Iterator l;
    public com.yandex.passport.internal.l m;
    public /* synthetic */ Object n;
    public final /* synthetic */ k o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, cg6 cg6Var) {
        super(cg6Var);
        this.o = kVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.x(null, this);
    }
}
