package com.yandex.plus.pay.internal.feature.offers.post;

import defpackage.cg6;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class c extends cg6 {
    public List j;
    public List k;
    public List l;
    public ArrayList m;
    public /* synthetic */ Object n;
    public final /* synthetic */ d o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, cg6 cg6Var) {
        super(cg6Var);
        this.o = dVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.b(null, this);
    }
}
