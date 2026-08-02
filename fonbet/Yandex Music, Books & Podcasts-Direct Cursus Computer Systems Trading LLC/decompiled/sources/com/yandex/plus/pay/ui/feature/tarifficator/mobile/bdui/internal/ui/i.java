package com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.ui;

import defpackage.uif;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class i extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ TarifficatorBduiScenarioActivity s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(TarifficatorBduiScenarioActivity tarifficatorBduiScenarioActivity, int i) {
        super(0);
        this.r = i;
        this.s = tarifficatorBduiScenarioActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                return this.s.getViewModelStore();
            default:
                return this.s.getDefaultViewModelCreationExtras();
        }
    }
}
