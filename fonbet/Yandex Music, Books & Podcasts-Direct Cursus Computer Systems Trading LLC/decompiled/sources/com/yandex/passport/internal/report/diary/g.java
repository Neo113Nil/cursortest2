package com.yandex.passport.internal.report.diary;

import android.os.Bundle;
import defpackage.cg6;

/* loaded from: classes4.dex */
public final class g extends cg6 {
    public String j;
    public Bundle k;
    public /* synthetic */ Object l;
    public final /* synthetic */ b0 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(b0 b0Var, cg6 cg6Var) {
        super(cg6Var);
        this.m = b0Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.g(null, null, this);
    }
}
