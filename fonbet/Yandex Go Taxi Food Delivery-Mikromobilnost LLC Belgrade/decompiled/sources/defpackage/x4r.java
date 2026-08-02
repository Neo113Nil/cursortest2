package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class x4r implements y4r {
    public final yaf0 a;

    public x4r(yaf0 yaf0Var) {
        this.a = yaf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x4r) && jl40.l(this.a, ((x4r) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ScreenType(screenType=" + this.a + Extension.C_BRAKE;
    }
}
