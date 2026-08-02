package org.webrtc;

import com.google.ar.core.ImageMetadata;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

/* loaded from: classes4.dex */
public class Size {
    public int height;
    public int width;

    public Size(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Size)) {
            return false;
        }
        Size size = (Size) obj;
        return this.width == size.width && this.height == size.height;
    }

    public int hashCode() {
        return (this.width * ImageMetadata.CONTROL_AE_EXPOSURE_COMPENSATION) + 1 + this.height;
    }

    public String toString() {
        return this.width + RemoteBioParameters.X + this.height;
    }
}
