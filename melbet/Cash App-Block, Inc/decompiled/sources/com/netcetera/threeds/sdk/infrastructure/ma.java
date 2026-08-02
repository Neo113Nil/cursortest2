package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.drawable.Drawable;

/* loaded from: classes5.dex */
class ma implements Runnable {
    private final mc get;
    private final Drawable getWarnings;

    public ma(mc mcVar, Drawable drawable) {
        this.get = mcVar;
        this.getWarnings = drawable;
    }

    @Override // java.lang.Runnable
    public void run() {
        mc.ThreeDS2Service(new Object[]{r0, this.getWarnings}, -761429237, 761429237, System.identityHashCode(this.get));
    }
}
