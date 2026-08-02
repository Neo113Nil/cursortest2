package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class vpi extends qa91 {
    public final nr b;

    public vpi(nr nrVar) {
        this.b = nrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vpi) && this.b.equals(((vpi) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "OrderState(action=" + this.b + Extension.C_BRAKE;
    }
}
