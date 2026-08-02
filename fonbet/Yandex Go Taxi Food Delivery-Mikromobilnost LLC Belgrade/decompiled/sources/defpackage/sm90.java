package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class sm90 implements tm90 {
    public final eal a;

    public sm90(int i) {
        this.a = new eal(rks0.b, false, new aal(new x9l(kp50.r(40))), 2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sm90) && jl40.l(this.a, ((sm90) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Loading(state=" + this.a + Extension.C_BRAKE;
    }

    public sm90() {
        this(0);
    }
}
