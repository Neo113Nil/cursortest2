package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class rm4 {
    public final String a;
    public final String b;
    public final boolean c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ rm4(String str, int i) {
        this(str, str, (i & 4) == 0);
        str = (i & 1) != 0 ? null : str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rm4)) {
            return false;
        }
        rm4 rm4Var = (rm4) obj;
        return jl40.l(this.a, rm4Var.a) && jl40.l(this.b, rm4Var.b) && this.c == rm4Var.c;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return x4e.i(b64.v("BadgeUiState(text=", this.a, ", accessibilityText=", this.b, ", isVisible="), this.c, Extension.C_BRAKE);
    }

    public rm4() {
        this(null, 7);
    }

    public rm4(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }
}
