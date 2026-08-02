package com.netcetera.threeds.sdk.infrastructure;

import android.view.View;

/* loaded from: classes5.dex */
class save implements View.OnClickListener {
    private final contains ThreeDS2Service;

    public save(contains containsVar) {
        this.ThreeDS2Service = containsVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        contains.initialize(this.ThreeDS2Service, view);
    }
}
