package androidx.camera.core.imagecapture;

import androidx.camera.core.processing.AutoValue_Packet;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public final class AutoValue_Image2JpegBytes_In {
    public final int jpegQuality;
    public final AutoValue_Packet packet;

    public AutoValue_Image2JpegBytes_In(AutoValue_Packet autoValue_Packet, int i) {
        if (autoValue_Packet == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null packet");
            throw null;
        }
        this.packet = autoValue_Packet;
        this.jpegQuality = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AutoValue_Image2JpegBytes_In) {
            AutoValue_Image2JpegBytes_In autoValue_Image2JpegBytes_In = (AutoValue_Image2JpegBytes_In) obj;
            if (this.packet.equals(autoValue_Image2JpegBytes_In.packet) && this.jpegQuality == autoValue_Image2JpegBytes_In.jpegQuality) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.jpegQuality ^ ((this.packet.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("In{packet=");
        sb.append(this.packet);
        sb.append(", jpegQuality=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.jpegQuality, "}", sb);
    }
}
