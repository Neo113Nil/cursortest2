package com.netcetera.threeds.sdk.infrastructure;

import android.widget.CompoundButton;

/* loaded from: classes5.dex */
class containsKey implements CompoundButton.OnCheckedChangeListener {
    private final setProperty ThreeDS2ServiceInstance;

    public containsKey(setProperty setproperty) {
        this.ThreeDS2ServiceInstance = setproperty;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        setProperty.get(new Object[]{r0, compoundButton, Boolean.valueOf(z)}, 1455538559, -1455538559, System.identityHashCode(this.ThreeDS2ServiceInstance));
    }
}
