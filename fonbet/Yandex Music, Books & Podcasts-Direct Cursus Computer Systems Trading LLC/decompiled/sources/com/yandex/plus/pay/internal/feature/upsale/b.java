package com.yandex.plus.pay.internal.feature.upsale;

import defpackage.cg6;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class b extends cg6 {
    public String j;
    public String k;
    public ArrayList l;
    public String m;
    public /* synthetic */ Object n;
    public final /* synthetic */ d o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, cg6 cg6Var) {
        super(cg6Var);
        this.o = dVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.a(this, null, null, null, null);
    }
}
