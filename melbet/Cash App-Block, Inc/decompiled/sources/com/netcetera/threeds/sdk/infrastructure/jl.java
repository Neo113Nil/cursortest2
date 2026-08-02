package com.netcetera.threeds.sdk.infrastructure;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes5.dex */
public class jl extends ms implements com.netcetera.threeds.sdk.api.ui.ProgressView {
    private static int ThreeDS2ServiceInstance = 0;
    private static int cleanup = 1;
    private jj get;
    private ju getWarnings;
    private final no initialize = (no) nu.initialize(new Object[]{jl.class}, -1889553984, 1889553984, (int) System.currentTimeMillis());

    public void ThreeDS2ServiceInstance(jj jjVar) {
        int i = cleanup;
        this.get = jjVar;
        int i2 = i + 17;
        ThreeDS2ServiceInstance = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 42 / 0;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.ms, com.netcetera.threeds.sdk.infrastructure.mu
    public final View bQ_(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, boolean z) {
        cleanup = (ThreeDS2ServiceInstance + 101) % 128;
        if (z) {
            return super.bQ_(layoutInflater, viewGroup, bundle, true);
        }
        mc ThreeDS2ServiceInstance2 = new mc(layoutInflater.getContext()).initialize(this.get).ThreeDS2ServiceInstance(this.getWarnings.getWarnings().getWarnings());
        ThreeDS2ServiceInstance = (cleanup + 109) % 128;
        return ThreeDS2ServiceInstance2;
    }

    public void get() {
        int i = cleanup + 43;
        ThreeDS2ServiceInstance = i % 128;
        TextUtils.indexOf("", i % 2 != 0 ? '\b' : '0', 0);
        MotionEvent.axisFromString("");
        TextUtils.getOffsetBefore("", 0);
        ThreeDS2Service().get();
    }

    @Override // com.netcetera.threeds.sdk.api.ui.ProgressView
    public void hideProgress() {
        cleanup = (ThreeDS2ServiceInstance + 37) % 128;
        ThreeDS2Service().ThreeDS2ServiceInstance();
        int i = ThreeDS2ServiceInstance + 55;
        cleanup = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // com.netcetera.threeds.sdk.api.ui.ProgressView
    public boolean isProgressShown() {
        int i = cleanup + 87;
        ThreeDS2ServiceInstance = i % 128;
        int i2 = i % 2;
        boolean initialize = ThreeDS2Service().initialize();
        if (i2 != 0) {
            int i3 = 87 / 0;
        }
        return initialize;
    }

    @Override // com.netcetera.threeds.sdk.api.ui.ProgressView
    public void showProgress() {
        int i = ThreeDS2ServiceInstance + 119;
        cleanup = i % 128;
        if (i % 2 != 0) {
            ThreeDS2Service().ThreeDS2Service();
        } else {
            ThreeDS2Service().ThreeDS2Service();
            int i2 = 28 / 0;
        }
    }

    public void get(ju juVar) {
        int i = cleanup + 113;
        ThreeDS2ServiceInstance = i % 128;
        if (i % 2 != 0) {
            this.getWarnings = juVar;
            int i2 = 82 / 0;
        } else {
            this.getWarnings = juVar;
        }
    }
}
