package com.netcetera.threeds.sdk.infrastructure;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes5.dex */
class mo implements View.OnApplyWindowInsetsListener {
    private final mq ThreeDS2Service;
    private final mq ThreeDS2ServiceInstance;
    private final mq get;
    private final mq initialize;

    public mo(mq mqVar, mq mqVar2, mq mqVar3, mq mqVar4) {
        this.initialize = mqVar;
        this.ThreeDS2ServiceInstance = mqVar2;
        this.ThreeDS2Service = mqVar3;
        this.get = mqVar4;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        return ml.bF_(this.initialize, this.ThreeDS2ServiceInstance, this.ThreeDS2Service, this.get, view, windowInsets);
    }
}
