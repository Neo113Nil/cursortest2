package com.squareup.cash.moneybot.backend.real.managers;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;

/* loaded from: classes4.dex */
public final class RealMoneybotRenderContextProvider$DisplayDp {
    public final int screenHeightDp;
    public final int screenWidthDp;

    public RealMoneybotRenderContextProvider$DisplayDp(int i, int i2) {
        this.screenWidthDp = i;
        this.screenHeightDp = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RealMoneybotRenderContextProvider$DisplayDp)) {
            return false;
        }
        RealMoneybotRenderContextProvider$DisplayDp realMoneybotRenderContextProvider$DisplayDp = (RealMoneybotRenderContextProvider$DisplayDp) obj;
        return this.screenWidthDp == realMoneybotRenderContextProvider$DisplayDp.screenWidthDp && this.screenHeightDp == realMoneybotRenderContextProvider$DisplayDp.screenHeightDp;
    }

    public final int hashCode() {
        return Integer.hashCode(this.screenHeightDp) + (Integer.hashCode(this.screenWidthDp) * 31);
    }

    public final String toString() {
        return Recorder$$ExternalSyntheticOutline2.m(this.screenWidthDp, this.screenHeightDp, "DisplayDp(screenWidthDp=", ", screenHeightDp=", ")");
    }
}
