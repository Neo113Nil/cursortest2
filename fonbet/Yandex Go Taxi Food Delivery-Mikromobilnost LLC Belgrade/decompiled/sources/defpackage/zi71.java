package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import yads.cc1;

/* loaded from: classes7.dex */
public final class zi71 implements ri81 {
    public final String a;
    public final cc1 b;
    public final String c;
    public final HashMap w;

    public zi71(String str, cc1 cc1Var, String str2, HashMap hashMap) {
        this.a = str;
        this.b = cc1Var;
        this.c = str2;
        this.w = hashMap;
    }

    @Override // defpackage.ri81
    public final Map a() {
        return Collections.unmodifiableMap(this.w);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zi71)) {
            return false;
        }
        zi71 zi71Var = (zi71) obj;
        return this.a.equals(zi71Var.a) && jl40.l(this.b, zi71Var.b) && jl40.l(this.c, zi71Var.c) && this.w.equals(zi71Var.w);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        cc1 cc1Var = this.b;
        int hashCode2 = (hashCode + (cc1Var == null ? 0 : cc1Var.hashCode())) * 31;
        String str = this.c;
        return this.w.hashCode() + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Verification(vendor=" + this.a + ", javaScriptResource=" + this.b + ", parameters=" + this.c + ", events=" + this.w + Extension.C_BRAKE;
    }
}
