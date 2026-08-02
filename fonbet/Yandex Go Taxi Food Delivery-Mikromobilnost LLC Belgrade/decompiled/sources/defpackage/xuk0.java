package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class xuk0 {
    public final wuk0 a;

    public xuk0(wuk0 wuk0Var) {
        this.a = wuk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xuk0) && this.a.equals(((xuk0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RoadsToolbarUiState(startButtonUiState=" + this.a + Extension.C_BRAKE;
    }
}
