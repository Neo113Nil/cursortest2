package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class xs9 implements bt9 {
    public final tsa a;

    public xs9(tsa tsaVar) {
        this.a = tsaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xs9) && jl40.l(this.a, ((xs9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ClickStation(station=" + this.a + Extension.C_BRAKE;
    }
}
