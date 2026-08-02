package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;

/* loaded from: classes5.dex */
class hc implements fv {
    public static final hc ThreeDS2Service = new hc();

    @Override // com.netcetera.threeds.sdk.infrastructure.fv
    public ac initialize(Context context) {
        return new bc(context);
    }
}
