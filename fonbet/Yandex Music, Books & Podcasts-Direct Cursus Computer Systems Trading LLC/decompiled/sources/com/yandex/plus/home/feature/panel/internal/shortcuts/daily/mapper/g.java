package com.yandex.plus.home.feature.panel.internal.shortcuts.daily.mapper;

import defpackage.cg6;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class g extends cg6 {
    public com.yandex.plus.core.imageloader.b j;
    public Iterator k;
    public e l;
    public Iterator m;
    public int n;
    public int o;
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ i r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, cg6 cg6Var) {
        super(cg6Var);
        this.r = iVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.c(null, null, this);
    }
}
