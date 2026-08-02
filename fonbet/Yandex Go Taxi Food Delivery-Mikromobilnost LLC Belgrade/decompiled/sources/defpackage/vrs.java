package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class vrs {
    public final wrs a;

    public vrs(wrs wrsVar) {
        this.a = wrsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vrs) && this.a == ((vrs) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ScrollListenerData(scrollListener=" + this.a + Extension.C_BRAKE;
    }
}
