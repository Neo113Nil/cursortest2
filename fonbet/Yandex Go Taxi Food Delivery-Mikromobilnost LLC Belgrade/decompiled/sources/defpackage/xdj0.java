package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class xdj0 implements zdj0 {
    public final sdj0 a;

    public xdj0(sdj0 sdj0Var) {
        this.a = sdj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xdj0) && this.a.equals(((xdj0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ButtonUiState(buttonUiState=" + this.a + Extension.C_BRAKE;
    }
}
