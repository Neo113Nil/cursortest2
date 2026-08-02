package androidx.camera.core.impl;

import androidx.camera.core.DynamicRange;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.nimbusds.jose.JWECryptoParts;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class AutoValue_SessionConfig_OutputConfig {
    public final DynamicRange dynamicRange;
    public final int mirrorMode;
    public final List sharedSurfaces;
    public final DeferrableSurface surface;
    public final int surfaceGroupId;

    public AutoValue_SessionConfig_OutputConfig(DeferrableSurface deferrableSurface, List list, int i, int i2, DynamicRange dynamicRange) {
        this.surface = deferrableSurface;
        this.sharedSurfaces = list;
        this.mirrorMode = i;
        this.surfaceGroupId = i2;
        this.dynamicRange = dynamicRange;
    }

    public static JWECryptoParts builder(DeferrableSurface deferrableSurface) {
        JWECryptoParts jWECryptoParts = new JWECryptoParts();
        if (deferrableSurface == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null surface");
            return null;
        }
        jWECryptoParts.header = deferrableSurface;
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null sharedSurfaces");
            return null;
        }
        jWECryptoParts.encryptedKey = list;
        jWECryptoParts.iv = -1;
        jWECryptoParts.cipherText = -1;
        jWECryptoParts.authenticationTag = DynamicRange.SDR;
        return jWECryptoParts;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AutoValue_SessionConfig_OutputConfig)) {
            return false;
        }
        AutoValue_SessionConfig_OutputConfig autoValue_SessionConfig_OutputConfig = (AutoValue_SessionConfig_OutputConfig) obj;
        return this.surface.equals(autoValue_SessionConfig_OutputConfig.surface) && this.sharedSurfaces.equals(autoValue_SessionConfig_OutputConfig.sharedSurfaces) && this.mirrorMode == autoValue_SessionConfig_OutputConfig.mirrorMode && this.surfaceGroupId == autoValue_SessionConfig_OutputConfig.surfaceGroupId && this.dynamicRange.equals(autoValue_SessionConfig_OutputConfig.dynamicRange);
    }

    public final int hashCode() {
        return this.dynamicRange.hashCode() ^ ((((((((this.surface.hashCode() ^ 1000003) * 1000003) ^ this.sharedSurfaces.hashCode()) * (-721379959)) ^ this.mirrorMode) * 1000003) ^ this.surfaceGroupId) * 1000003);
    }

    public final String toString() {
        return "OutputConfig{surface=" + this.surface + ", sharedSurfaces=" + this.sharedSurfaces + ", physicalCameraId=null, mirrorMode=" + this.mirrorMode + ", surfaceGroupId=" + this.surfaceGroupId + ", dynamicRange=" + this.dynamicRange + "}";
    }
}
