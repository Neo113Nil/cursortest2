package defpackage;

import android.graphics.PointF;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class txu0 extends sxu0 {
    public final String a;
    public final PointF b;

    public txu0(String str, PointF pointF) {
        this.a = str;
        this.b = pointF;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof txu0)) {
            return false;
        }
        txu0 txu0Var = (txu0) obj;
        return jl40.l(this.a, txu0Var.a) && this.b.equals(txu0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ImageIcon(imageUrl=" + this.a + ", anchor=" + this.b + Extension.C_BRAKE;
    }
}
