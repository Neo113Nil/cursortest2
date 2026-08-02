package com.yandex.passport.internal.usecase.vpn;

import com.yandex.passport.internal.entities.a0;
import defpackage.cg6;
import defpackage.oqi;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class b extends cg6 {
    public String j;
    public oqi k;
    public a0 l;
    public int m;
    public int n;
    public /* synthetic */ Object o;
    public final /* synthetic */ e p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, Continuation continuation) {
        super(continuation);
        this.p = eVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.d(null, this);
    }
}
