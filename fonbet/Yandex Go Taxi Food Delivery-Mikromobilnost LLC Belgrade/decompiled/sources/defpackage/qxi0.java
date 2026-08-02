package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class qxi0 implements sxi0 {
    public final lm00 a;

    public qxi0(lm00 lm00Var) {
        this.a = lm00Var;
    }

    public final lm00 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qxi0) && jl40.l(this.a, ((qxi0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "UpdateMapObject(mapObject=" + this.a + Extension.C_BRAKE;
    }
}
