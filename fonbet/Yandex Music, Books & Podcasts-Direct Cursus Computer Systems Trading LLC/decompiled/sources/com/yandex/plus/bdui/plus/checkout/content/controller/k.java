package com.yandex.plus.bdui.plus.checkout.content.controller;

import com.yandex.plus.bdui.plus.checkout.content.serializer.a2;
import defpackage.cg6;

/* loaded from: classes4.dex */
public final class k extends cg6 {
    public a2 j;
    public String k;
    public CharSequence l;
    public /* synthetic */ Object m;
    public final /* synthetic */ l n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = lVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.j(null, this);
    }
}
