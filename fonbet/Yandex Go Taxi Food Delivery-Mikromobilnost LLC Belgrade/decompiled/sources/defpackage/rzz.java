package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class rzz implements szz {
    public final vzz a;

    public rzz(vzz vzzVar) {
        this.a = vzzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rzz) && jl40.l(this.a, ((rzz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Toggle(uiState=" + this.a + Extension.C_BRAKE;
    }
}
