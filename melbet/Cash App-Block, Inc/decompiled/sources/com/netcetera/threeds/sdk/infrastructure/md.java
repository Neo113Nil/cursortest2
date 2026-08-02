package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.drawable.Drawable;
import com.netcetera.threeds.sdk.infrastructure.jj;

/* loaded from: classes5.dex */
class md implements jj.initialize {
    private final mc getWarnings;

    public md(mc mcVar) {
        this.getWarnings = mcVar;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jj.initialize
    public void bB_(Drawable drawable) {
        mc.ThreeDS2Service(new Object[]{r0, drawable}, 806880061, -806880060, System.identityHashCode(this.getWarnings));
    }
}
