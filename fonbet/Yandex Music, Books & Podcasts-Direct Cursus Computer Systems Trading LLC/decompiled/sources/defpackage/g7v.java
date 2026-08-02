package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;

/* loaded from: classes4.dex */
public final class g7v {
    public static final float c = RemoteCameraConfig.Mic.BUFFER_SIZE;
    public final float a;
    public final int b;

    public g7v(int i, float f) {
        this.a = f;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g7v)) {
            return false;
        }
        g7v g7vVar = (g7v) obj;
        return cma.a(this.a, g7vVar.a) && this.b == g7vVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "WaveWordsContainerMeasures(availableWidth=" + cma.b(this.a) + ", maxLines=" + this.b + ")";
    }
}
