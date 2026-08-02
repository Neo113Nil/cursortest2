package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.panorama.d;

/* loaded from: classes12.dex */
public final class xb90 {
    public final tb90 a;
    public final String b;
    public final String c;
    public final d d;

    public xb90(tb90 tb90Var, String str, String str2, d dVar) {
        this.a = tb90Var;
        this.b = str;
        this.c = str2;
        this.d = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xb90)) {
            return false;
        }
        xb90 xb90Var = (xb90) obj;
        return this.a.equals(xb90Var.a) && this.b.equals(xb90Var.b) && this.c.equals(xb90Var.c) && jl40.l(this.d, xb90Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "PanoramaParams(panoramaData=" + this.a + ", pinType=" + this.b + ", screen=" + this.c + ", experiment=" + this.d + Extension.C_BRAKE;
    }
}
