package com.netcetera.threeds.sdk.infrastructure;

import android.widget.CompoundButton;

/* loaded from: classes5.dex */
class bk implements CompoundButton.OnCheckedChangeListener {
    private final String[] ThreeDS2Service;
    private final String[] ThreeDS2ServiceInstance;
    private final bb get;
    private final int getWarnings;

    public bk(bb bbVar, String[] strArr, int i, String[] strArr2) {
        this.get = bbVar;
        this.ThreeDS2ServiceInstance = strArr;
        this.getWarnings = i;
        this.ThreeDS2Service = strArr2;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        bb.aJ_(this.get, this.ThreeDS2ServiceInstance, this.getWarnings, this.ThreeDS2Service, compoundButton, z);
    }
}
