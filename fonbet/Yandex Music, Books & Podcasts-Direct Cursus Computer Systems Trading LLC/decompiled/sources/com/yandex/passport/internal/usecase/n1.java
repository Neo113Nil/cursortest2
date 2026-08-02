package com.yandex.passport.internal.usecase;

import defpackage.cg6;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class n1 extends cg6 {
    public com.yandex.passport.internal.d j;
    public ArrayList k;
    public Iterator l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ o1 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(o1 o1Var, cg6 cg6Var) {
        super(cg6Var);
        this.o = o1Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.a(this);
    }
}
