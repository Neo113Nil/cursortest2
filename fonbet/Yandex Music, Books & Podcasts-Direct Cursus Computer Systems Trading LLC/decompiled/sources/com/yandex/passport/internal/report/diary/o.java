package com.yandex.passport.internal.report.diary;

import com.yandex.passport.internal.methods.v5;
import defpackage.cg6;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class o extends cg6 {
    public v5 j;
    public Iterator k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ b0 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(b0 b0Var, cg6 cg6Var) {
        super(cg6Var);
        this.n = b0Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.o(null, this);
    }
}
