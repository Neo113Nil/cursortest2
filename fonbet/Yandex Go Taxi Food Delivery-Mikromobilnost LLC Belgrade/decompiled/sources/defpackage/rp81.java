package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import yads.yl3;

/* loaded from: classes7.dex */
public final class rp81 {
    public final yl3 a;

    public rp81() {
        this.a = yl3.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rp81) && this.a == ((rp81) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "WebViewAdSettings(cacheMode=" + this.a + Extension.C_BRAKE;
    }

    public rp81(yl3 yl3Var) {
        this.a = yl3Var;
    }
}
