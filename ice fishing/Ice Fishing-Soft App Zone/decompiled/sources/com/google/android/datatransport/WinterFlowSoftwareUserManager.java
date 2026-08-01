package com.google.android.datatransport;

import android.graphics.Bitmap;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowSoftwareUserManager {
    public final Bitmap WinterFlowRouterStructure;

    public WinterFlowSoftwareUserManager(Bitmap bitmap) {
        this.WinterFlowRouterStructure = bitmap;
    }

    public final int WinterFlowRouterStructure() {
        Bitmap.Config config = this.WinterFlowRouterStructure.getConfig();
        config.getClass();
        if (config == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config == Bitmap.Config.RGB_565) {
            return 2;
        }
        if (config == Bitmap.Config.ARGB_4444) {
            return 0;
        }
        if (config == Bitmap.Config.RGBA_F16) {
            return 3;
        }
        return config == Bitmap.Config.HARDWARE ? 4 : 0;
    }
}
