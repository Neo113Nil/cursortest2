package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class zh {
    public final Boolean a;
    public final String b;
    public final String c;

    public zh(String str, String str2, Boolean bool) {
        this.a = bool;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zh)) {
            return false;
        }
        zh zhVar = (zh) obj;
        return jl40.l(this.a, zhVar.a) && jl40.l(this.b, zhVar.b) && this.c.equals(zhVar.c);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityUiState(isSelected=");
        sb.append(this.a);
        sb.append(", clickActionLabel=");
        sb.append(this.b);
        sb.append(", contentDescription=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
