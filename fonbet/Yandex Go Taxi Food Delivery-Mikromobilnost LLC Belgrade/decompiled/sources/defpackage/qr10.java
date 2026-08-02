package defpackage;

import kotlinx.serialization.json.c;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes9.dex */
public final class qr10 extends kr {
    public static final pr10 Companion = new pr10();
    public final String a;
    public final c b;
    public final String c;

    public /* synthetic */ qr10(int i, String str, String str2, c cVar) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, or10.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = cVar;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qr10.class != obj.getClass()) {
            return false;
        }
        qr10 qr10Var = (qr10) obj;
        return jl40.l(this.a, qr10Var.a) && jl40.l(this.b, qr10Var.b) && jl40.l(this.c, qr10Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        c cVar = this.b;
        int hashCode2 = (hashCode + (cVar != null ? cVar.a.hashCode() : 0)) * 31;
        String str = this.c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MergeSectionAction(sectionId=");
        sb.append(this.a);
        sb.append(", params=");
        sb.append(this.b);
        sb.append(", actionId=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
