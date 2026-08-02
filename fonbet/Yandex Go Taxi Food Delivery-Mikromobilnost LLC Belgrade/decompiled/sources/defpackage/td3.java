package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class td3 {
    public final wp2 a;
    public final Float b;

    public td3(wp2 wp2Var, Float f) {
        this.a = wp2Var;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof td3)) {
            return false;
        }
        td3 td3Var = (td3) obj;
        return jl40.l(this.a, td3Var.a) && jl40.l(this.b, td3Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Float f = this.b;
        return hashCode + (f == null ? 0 : f.hashCode());
    }

    public final String toString() {
        return "AuctionBackgroundUiState(appColor=" + this.a + ", endGradientAlpha=" + this.b + Extension.C_BRAKE;
    }
}
