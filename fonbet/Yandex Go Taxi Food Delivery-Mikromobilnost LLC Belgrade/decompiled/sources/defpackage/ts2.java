package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class ts2 {
    public static final ts2 b = new ts2(0);
    public final String a;

    public ts2(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ts2) && jl40.l(this.a, ((ts2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("AppCredentialsConfig(staticMapKey=", this.a, Extension.C_BRAKE);
    }

    public ts2() {
        this(0);
    }

    public /* synthetic */ ts2(int i) {
        this("");
    }
}
