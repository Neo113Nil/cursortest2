package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class q9c0 extends z9c0 {
    public final String b;

    public q9c0(String str) {
        super(str);
        this.b = str;
    }

    @Override // defpackage.z9c0
    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q9c0) && jl40.l(this.b, ((q9c0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return oyr.p("Custom(id=", this.b, Extension.C_BRAKE);
    }
}
