package com.netcetera.threeds.sdk.infrastructure;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes5.dex */
class mm implements View.OnApplyWindowInsetsListener {
    private final mq ThreeDS2Service;
    private final mq ThreeDS2ServiceInstance;
    private final mq getWarnings;
    private final mq initialize;

    public mm(mq mqVar, mq mqVar2, mq mqVar3, mq mqVar4) {
        this.ThreeDS2ServiceInstance = mqVar;
        this.getWarnings = mqVar2;
        this.ThreeDS2Service = mqVar3;
        this.initialize = mqVar4;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        return mn.bI_(this.ThreeDS2ServiceInstance, this.getWarnings, this.ThreeDS2Service, this.initialize, view, windowInsets);
    }
}
