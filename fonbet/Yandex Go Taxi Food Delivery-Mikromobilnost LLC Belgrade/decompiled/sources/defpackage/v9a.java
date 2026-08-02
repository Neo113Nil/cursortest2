package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class v9a implements jaa {
    public final km9 a;
    public final String b;

    public v9a(km9 km9Var, String str) {
        this.a = km9Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v9a)) {
            return false;
        }
        v9a v9aVar = (v9a) obj;
        return jl40.l(this.a, v9aVar.a) && jl40.l(this.b, v9aVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "OnAttentionAction(action=" + this.a + ", offerId=" + this.b + Extension.C_BRAKE;
    }
}
