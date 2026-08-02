package com.yandex.plus.home.graphql.panel;

import com.yandex.plus.home.repository.api.model.panel.i;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.z7o;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class a extends cg6 {
    public i j;
    public ArrayList k;
    public /* synthetic */ Object l;
    public final /* synthetic */ g m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(g gVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = gVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        Object a = g.a(this.m, null, null, null, this);
        return a == nm6.a ? a : new z7o(a);
    }
}
