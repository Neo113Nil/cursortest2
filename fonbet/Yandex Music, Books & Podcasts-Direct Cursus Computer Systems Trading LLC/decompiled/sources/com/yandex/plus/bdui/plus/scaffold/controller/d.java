package com.yandex.plus.bdui.plus.scaffold.controller;

import com.yandex.plus.bdui.flex.ui.t;
import defpackage.cg6;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class d extends cg6 {
    public com.yandex.plus.bdui.scaffold.b j;
    public t k;
    public Iterator l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ e o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, cg6 cg6Var) {
        super(cg6Var);
        this.o = eVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.f(null, null, null, this);
    }
}
