package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class vq extends lr {
    public final bpi a;

    public vq(bpi bpiVar) {
        this.a = bpiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vq) && this.a.equals(((vq) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SelectorClicked(payload=" + this.a + Extension.C_BRAKE;
    }
}
