package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class z301 implements a401 {
    public final l401 a;

    public z301(l401 l401Var) {
        this.a = l401Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z301) && this.a.equals(((z301) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LayeredImage(data=" + this.a + Extension.C_BRAKE;
    }
}
