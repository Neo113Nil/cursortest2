package com.yandex.plus.bdui.plus.checkout.content.controller;

import com.yandex.plus.bdui.plus.checkout.content.serializer.b2;
import defpackage.cg6;

/* loaded from: classes4.dex */
public final class j extends cg6 {
    public b2 j;
    public String k;
    public com.yandex.plus.pay.ui.core.mobile.view.payment.methods.a l;
    public String m;
    public CharSequence n;
    public boolean o;
    public boolean p;
    public /* synthetic */ Object q;
    public final /* synthetic */ l r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, cg6 cg6Var) {
        super(cg6Var);
        this.r = lVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.k(null, false, this);
    }
}
