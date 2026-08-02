package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui;

import defpackage.uif;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class b extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ TarifficatorScenarioActivity s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(TarifficatorScenarioActivity tarifficatorScenarioActivity, int i) {
        super(0);
        this.r = i;
        this.s = tarifficatorScenarioActivity;
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
