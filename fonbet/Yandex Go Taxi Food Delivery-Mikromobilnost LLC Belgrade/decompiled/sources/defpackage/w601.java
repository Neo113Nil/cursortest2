package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class w601 {
    public final yaf0 a;
    public final wn70 b;

    public w601(yaf0 yaf0Var, wn70 wn70Var) {
        this.a = yaf0Var;
        this.b = wn70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w601)) {
            return false;
        }
        w601 w601Var = (w601) obj;
        return jl40.l(this.a, w601Var.a) && jl40.l(this.b, w601Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TrackingParams(filter=" + this.a + ", style=" + this.b + Extension.C_BRAKE;
    }
}
