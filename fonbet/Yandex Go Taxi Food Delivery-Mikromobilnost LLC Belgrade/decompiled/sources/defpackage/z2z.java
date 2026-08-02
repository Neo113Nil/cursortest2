package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class z2z {
    public final y0h a;
    public final boolean b;

    public z2z(y0h y0hVar, boolean z) {
        this.a = y0hVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z2z)) {
            return false;
        }
        z2z z2zVar = (z2z) obj;
        return this.a.equals(z2zVar.a) && this.b == z2zVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LocalDeeplinkHandleResult(globalHandleResult=" + this.a + ", isHandledByLocalDelegate=" + this.b + Extension.C_BRAKE;
    }
}
