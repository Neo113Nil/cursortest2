package com.yandex.plus.pay.internal.feature.presale;

import defpackage.cg6;
import java.util.Map;

/* loaded from: classes5.dex */
public final class h extends cg6 {
    public Map j;
    public k k;
    public long l;
    public /* synthetic */ Object m;
    public final /* synthetic */ k n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = kVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.a(null, this);
    }
}
