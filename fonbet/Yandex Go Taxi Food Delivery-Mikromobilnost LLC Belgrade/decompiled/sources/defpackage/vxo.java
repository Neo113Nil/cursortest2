package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class vxo implements wxo {
    public final nxo a;

    public vxo(nxo nxoVar) {
        this.a = nxoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vxo) && jl40.l(this.a, ((vxo) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ItemClick(item=" + this.a + Extension.C_BRAKE;
    }
}
