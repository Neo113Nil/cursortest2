package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ydj0 implements zdj0 {
    public final tdj0 a;

    public ydj0(tdj0 tdj0Var) {
        this.a = tdj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ydj0) && this.a.equals(((ydj0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ImageUiState(imageUiState=" + this.a + Extension.C_BRAKE;
    }
}
