package com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.ui;

import android.view.ViewGroup;
import defpackage.cg6;

/* loaded from: classes5.dex */
public final class j extends cg6 {
    public ViewGroup j;
    public /* synthetic */ Object k;
    public final /* synthetic */ TarifficatorBduiScenarioActivity l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(TarifficatorBduiScenarioActivity tarifficatorBduiScenarioActivity, cg6 cg6Var) {
        super(cg6Var);
        this.l = tarifficatorBduiScenarioActivity;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return TarifficatorBduiScenarioActivity.k(this.l, null, this);
    }
}
