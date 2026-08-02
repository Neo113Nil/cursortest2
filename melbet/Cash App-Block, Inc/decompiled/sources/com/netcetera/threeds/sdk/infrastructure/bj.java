package com.netcetera.threeds.sdk.infrastructure;

import android.widget.CompoundButton;

/* loaded from: classes5.dex */
class bj implements CompoundButton.OnCheckedChangeListener {
    private final setTextIsSelectable get;
    private final bh getWarnings;

    public bj(bh bhVar, setTextIsSelectable settextisselectable) {
        this.getWarnings = bhVar;
        this.get = settextisselectable;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        bh.aO_(this.getWarnings, this.get, compoundButton, z);
    }
}
