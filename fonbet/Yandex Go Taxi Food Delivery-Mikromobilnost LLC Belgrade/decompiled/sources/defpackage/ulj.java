package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class ulj {
    public final String a;
    public final CharSequence b;

    public ulj(CharSequence charSequence, String str) {
        this.a = str;
        this.b = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ulj)) {
            return false;
        }
        ulj uljVar = (ulj) obj;
        return jl40.l(this.a, uljVar.a) && jl40.l(this.b, uljVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DirectionSelectorItemUiState(id=" + this.a + ", title=" + ((Object) this.b) + Extension.C_BRAKE;
    }

    public ulj() {
        this("", "");
    }
}
