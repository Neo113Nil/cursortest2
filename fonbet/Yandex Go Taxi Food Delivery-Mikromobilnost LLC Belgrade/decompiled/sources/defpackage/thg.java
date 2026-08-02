package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class thg extends vhg {
    public final hz91 a;
    public final String b;
    public final boolean c;

    public thg(hz91 hz91Var, String str, boolean z) {
        this.a = hz91Var;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof thg)) {
            return false;
        }
        thg thgVar = (thg) obj;
        return jl40.l(this.a, thgVar.a) && jl40.l(this.b, thgVar.b) && this.c == thgVar.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Card(cardState=");
        sb.append(this.a);
        sb.append(", action=");
        sb.append(this.b);
        sb.append(", isNeedPolling=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }

    public /* synthetic */ thg(hz91 hz91Var, String str, int i) {
        this(hz91Var, (i & 2) != 0 ? null : str, false);
    }
}
