package com.yandex.passport.internal.ui.sloth.plusdevices;

import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.sloth.d1;
import defpackage.cg6;

/* loaded from: classes4.dex */
public final class s extends cg6 {
    public com.yandex.passport.sloth.data.c0 j;
    public PassportProcessGlobalComponent k;
    public d1 l;
    public /* synthetic */ Object m;
    public final /* synthetic */ t n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = tVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.a(null, this);
    }
}
