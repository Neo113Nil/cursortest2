package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class zji implements bki {
    public final doe a;
    public final boolean b;

    public zji(doe doeVar, boolean z) {
        this.a = doeVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zji)) {
            return false;
        }
        zji zjiVar = (zji) obj;
        return this.a.equals(zjiVar.a) && this.b == zjiVar.b;
    }

    @Override // defpackage.bki
    public final doe getCoordinates() {
        return this.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    @Override // defpackage.bki
    public final boolean isActive() {
        return this.b;
    }

    public final String toString() {
        return "AnotherOrderPoint(coordinates=" + this.a + ", isActive=" + this.b + Extension.C_BRAKE;
    }
}
