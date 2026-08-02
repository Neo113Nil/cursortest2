package defpackage;

import android.graphics.Rect;
import android.net.Uri;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class zdg0 implements ceg0 {
    public final Uri a;
    public final Rect b;

    public zdg0(Uri uri, Rect rect) {
        this.a = uri;
        this.b = rect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zdg0)) {
            return false;
        }
        zdg0 zdg0Var = (zdg0) obj;
        return this.a.equals(zdg0Var.a) && this.b.equals(zdg0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "QrDetected(uri=" + this.a + ", rect=" + this.b + Extension.C_BRAKE;
    }
}
