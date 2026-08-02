package com.yandex.passport.internal.autologin.ui;

import android.content.Context;
import defpackage.cg6;
import defpackage.gm5;
import defpackage.xpi;
import defpackage.zh;

/* loaded from: classes4.dex */
public final class i extends cg6 {
    public Context j;
    public xpi k;
    public com.yandex.passport.internal.properties.g l;
    public zh m;
    public gm5 n;
    public /* synthetic */ Object o;
    public final /* synthetic */ k p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, cg6 cg6Var) {
        super(cg6Var);
        this.p = kVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.f(null, null, null, null, this);
    }
}
