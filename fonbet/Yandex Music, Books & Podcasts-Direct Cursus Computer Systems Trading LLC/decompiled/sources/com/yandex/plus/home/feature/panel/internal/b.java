package com.yandex.plus.home.feature.panel.internal;

import com.yandex.plus.home.repository.api.model.panel.d0;
import defpackage.cg6;

/* loaded from: classes5.dex */
public final class b extends cg6 {
    public d0 j;
    public f k;
    public int l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ f o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f fVar, cg6 cg6Var) {
        super(cg6Var);
        this.o = fVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return f.a(this.o, null, this);
    }
}
