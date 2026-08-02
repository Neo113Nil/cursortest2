package com.yandex.plus.pay.graphql.upsale;

import defpackage.cg6;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class b extends cg6 {
    public String j;
    public String k;
    public List l;
    public String m;
    public ArrayList n;
    public /* synthetic */ Object o;
    public final /* synthetic */ c p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, cg6 cg6Var) {
        super(cg6Var);
        this.p = cVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.a(null, null, null, null, null, this);
    }
}
