package com.yandex.plus.bdui.plus.checkout.content.controller;

import defpackage.cg6;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class k0 extends cg6 {
    public com.yandex.plus.bdui.content.d j;
    public com.yandex.plus.pay.ui.core.internal.tarifficator.ui.upsale.c k;
    public String l;
    public String m;
    public String n;
    public String o;
    public ArrayList p;
    public String q;
    public /* synthetic */ Object r;
    public final /* synthetic */ l0 s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(l0 l0Var, Continuation continuation) {
        super(continuation);
        this.s = l0Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.c(null, null, this);
    }
}
