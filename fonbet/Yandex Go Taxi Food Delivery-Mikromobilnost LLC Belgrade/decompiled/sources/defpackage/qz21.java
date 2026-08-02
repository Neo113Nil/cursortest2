package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class qz21 {
    public final ArrayList a;
    public final Object b;
    public final String c;
    public final String d;

    public qz21(ArrayList arrayList, Object obj, String str, String str2) {
        this.a = arrayList;
        this.b = obj;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qz21)) {
            return false;
        }
        qz21 qz21Var = (qz21) obj;
        return this.a.equals(qz21Var.a) && jl40.l(this.b, qz21Var.b) && jl40.l(this.c, qz21Var.c) && jl40.l(this.d, qz21Var.d);
    }

    public final int hashCode() {
        int b = unr0.b(smw0.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ValidationRequest(offers=");
        sb.append(this.a);
        sb.append(", formState=");
        sb.append(this.b);
        sb.append(", mode=");
        return g8e.r(sb, this.c, ", scenario=", this.d, Extension.C_BRAKE);
    }
}
