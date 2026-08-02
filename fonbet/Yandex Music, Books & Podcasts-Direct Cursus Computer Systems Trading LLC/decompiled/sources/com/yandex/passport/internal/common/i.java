package com.yandex.passport.internal.common;

import com.yandex.passport.internal.ui.sloth.authsdk.h0;
import defpackage.cg6;
import defpackage.qqi;

/* loaded from: classes4.dex */
public final class i extends cg6 {
    public h0 j;
    public qqi k;
    public /* synthetic */ Object l;
    public final /* synthetic */ k m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = kVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.b(null, this);
    }
}
