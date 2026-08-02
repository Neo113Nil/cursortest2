package defpackage;

import android.graphics.Rect;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class ueg0 implements xeg0 {
    public final Rect a;

    public ueg0(Rect rect) {
        this.a = rect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ueg0) && this.a.equals(((ueg0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "QRGrabbed(rect=" + this.a + Extension.C_BRAKE;
    }
}
