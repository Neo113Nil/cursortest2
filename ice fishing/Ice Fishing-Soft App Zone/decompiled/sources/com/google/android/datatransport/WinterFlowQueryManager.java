package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowQueryManager extends WinterFlowInvokerComponent {
    public final int WinterFlowBackendCacheManager;
    public final float WinterFlowConsumerUserManager;
    public final int WinterFlowEventEmitterController;
    public final float WinterFlowResolverController;

    public WinterFlowQueryManager(float f, float f2, int i, int i2, int i3) {
        f2 = (i3 & 2) != 0 ? 4.0f : f2;
        i = (i3 & 4) != 0 ? 0 : i;
        i2 = (i3 & 8) != 0 ? 0 : i2;
        this.WinterFlowResolverController = f;
        this.WinterFlowConsumerUserManager = f2;
        this.WinterFlowBackendCacheManager = i;
        this.WinterFlowEventEmitterController = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowQueryManager)) {
            return false;
        }
        WinterFlowQueryManager winterFlowQueryManager = (WinterFlowQueryManager) obj;
        return this.WinterFlowResolverController == winterFlowQueryManager.WinterFlowResolverController && this.WinterFlowConsumerUserManager == winterFlowQueryManager.WinterFlowConsumerUserManager && this.WinterFlowBackendCacheManager == winterFlowQueryManager.WinterFlowBackendCacheManager && this.WinterFlowEventEmitterController == winterFlowQueryManager.WinterFlowEventEmitterController;
    }

    public final int hashCode() {
        return WinterFlowResolverBackend.WinterFlowArrayNetwork(this.WinterFlowEventEmitterController, WinterFlowResolverBackend.WinterFlowArrayNetwork(this.WinterFlowBackendCacheManager, WinterFlowResolverBackend.WinterFlowCacheManagerAgent(this.WinterFlowConsumerUserManager, Float.hashCode(this.WinterFlowResolverController) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Stroke(width=");
        sb.append(this.WinterFlowResolverController);
        sb.append(", miter=");
        sb.append(this.WinterFlowConsumerUserManager);
        sb.append(", cap=");
        String str = "Unknown";
        int i = this.WinterFlowBackendCacheManager;
        sb.append((Object) (i == 0 ? "Butt" : i == 1 ? "Round" : i == 2 ? "Square" : "Unknown"));
        sb.append(", join=");
        int i2 = this.WinterFlowEventEmitterController;
        if (i2 == 0) {
            str = "Miter";
        } else if (i2 == 1) {
            str = "Round";
        } else if (i2 == 2) {
            str = "Bevel";
        }
        sb.append((Object) str);
        sb.append(", pathEffect=null)");
        return sb.toString();
    }
}
