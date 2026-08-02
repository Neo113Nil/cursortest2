package com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.ui;

import android.os.Bundle;
import defpackage.cg6;

/* loaded from: classes5.dex */
public final class t extends cg6 {
    public TarifficatorBduiScenarioActivity j;
    public Bundle k;
    public com.yandex.plus.bdui.plus.scenario.m l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ u o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, cg6 cg6Var) {
        super(cg6Var);
        this.o = uVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.a(null, 0, null, null, this);
    }
}
