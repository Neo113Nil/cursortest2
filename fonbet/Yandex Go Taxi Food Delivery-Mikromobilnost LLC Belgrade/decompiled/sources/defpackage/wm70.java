package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class wm70 implements xm70 {
    public final String a;

    public /* synthetic */ wm70(String str) {
        this.a = str;
    }

    public static final /* synthetic */ wm70 a(String str) {
        return new wm70(str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wm70) {
            return jl40.l(this.a, ((wm70) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("Url(value=", this.a, Extension.C_BRAKE);
    }
}
