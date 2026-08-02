package com.yandex.plus.bdui.plus.scaffold.controller;

import com.yandex.plus.bdui.flex.ui.t;
import defpackage.cg6;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class c extends cg6 {
    public com.yandex.plus.bdui.scaffold.b j;
    public t k;
    public ArrayList l;
    public List m;
    public int n;
    public /* synthetic */ Object o;
    public final /* synthetic */ e p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, Continuation continuation) {
        super(continuation);
        this.p = eVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.e(null, null, this);
    }
}
