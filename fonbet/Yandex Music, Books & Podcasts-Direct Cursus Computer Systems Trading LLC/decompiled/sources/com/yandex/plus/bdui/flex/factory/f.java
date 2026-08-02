package com.yandex.plus.bdui.flex.factory;

import defpackage.cg6;
import defpackage.lah;
import defpackage.oah;

/* loaded from: classes4.dex */
public final class f extends cg6 {
    public lah j;
    public oah k;
    public com.yandex.passport.sloth.ui.dependencies.m l;
    public Object m;
    public /* synthetic */ Object n;
    public final /* synthetic */ com.yandex.passport.internal.core.accounts.h o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.yandex.passport.internal.core.accounts.h hVar, cg6 cg6Var) {
        super(cg6Var);
        this.o = hVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.n(null, null, this);
    }
}
