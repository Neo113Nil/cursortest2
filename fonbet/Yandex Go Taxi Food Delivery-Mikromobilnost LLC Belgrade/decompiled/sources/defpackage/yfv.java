package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class yfv {
    public final pvi0 a;

    public yfv(pvi0 pvi0Var) {
        this.a = pvi0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yfv) && this.a.equals(((yfv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ImageUiState(remoteImage=" + this.a + Extension.C_BRAKE;
    }
}
