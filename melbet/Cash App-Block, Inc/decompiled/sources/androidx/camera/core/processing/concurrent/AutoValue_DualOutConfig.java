package androidx.camera.core.processing.concurrent;

import androidx.camera.core.processing.util.AutoValue_OutConfig;

/* loaded from: classes3.dex */
public final class AutoValue_DualOutConfig {
    public final AutoValue_OutConfig primaryOutConfig;
    public final AutoValue_OutConfig secondaryOutConfig;

    public AutoValue_DualOutConfig(AutoValue_OutConfig autoValue_OutConfig, AutoValue_OutConfig autoValue_OutConfig2) {
        this.primaryOutConfig = autoValue_OutConfig;
        this.secondaryOutConfig = autoValue_OutConfig2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AutoValue_DualOutConfig)) {
            return false;
        }
        AutoValue_DualOutConfig autoValue_DualOutConfig = (AutoValue_DualOutConfig) obj;
        return this.primaryOutConfig.equals(autoValue_DualOutConfig.primaryOutConfig) && this.secondaryOutConfig.equals(autoValue_DualOutConfig.secondaryOutConfig);
    }

    public final int hashCode() {
        return this.secondaryOutConfig.hashCode() ^ ((this.primaryOutConfig.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "DualOutConfig{primaryOutConfig=" + this.primaryOutConfig + ", secondaryOutConfig=" + this.secondaryOutConfig + "}";
    }
}
