package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class z1v0 {
    public final List a;
    public final fwn b;
    public final String c;

    public z1v0(List list, fwn fwnVar, String str) {
        this.a = list;
        this.b = fwnVar;
        this.c = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    public static z1v0 a(z1v0 z1v0Var, ArrayList arrayList, String str, int i) {
        ArrayList arrayList2 = arrayList;
        if ((i & 1) != 0) {
            arrayList2 = z1v0Var.a;
        }
        fwn fwnVar = z1v0Var.b;
        if ((i & 4) != 0) {
            str = z1v0Var.c;
        }
        return new z1v0(arrayList2, fwnVar, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z1v0)) {
            return false;
        }
        z1v0 z1v0Var = (z1v0) obj;
        return this.a.equals(z1v0Var.a) && this.b.equals(z1v0Var.b) && jl40.l(this.c, z1v0Var.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WithProducts(agreements=");
        sb.append(this.a);
        sb.append(", emptyListInfoEntity=");
        sb.append(this.b);
        sb.append(", selectedAgreementId=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
