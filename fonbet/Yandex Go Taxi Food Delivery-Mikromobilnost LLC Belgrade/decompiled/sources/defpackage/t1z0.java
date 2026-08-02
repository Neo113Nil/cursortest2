package defpackage;

import android.graphics.Rect;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class t1z0 implements v1z0 {
    public final Rect a;
    public final boolean b;

    public t1z0(Rect rect, boolean z) {
        this.a = rect;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1z0)) {
            return false;
        }
        t1z0 t1z0Var = (t1z0) obj;
        return jl40.l(this.a, t1z0Var.a) && this.b == t1z0Var.b;
    }

    public final int hashCode() {
        Rect rect = this.a;
        return Boolean.hashCode(this.b) + ((rect == null ? 0 : rect.hashCode()) * 31);
    }

    public final String toString() {
        return "Scanning(grabbedRect=" + this.a + ", mlDetectionEnabled=" + this.b + Extension.C_BRAKE;
    }

    public /* synthetic */ t1z0(int i) {
        this(null, true);
    }

    public t1z0() {
        this(0);
    }
}
