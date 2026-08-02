package defpackage;

import kotlinx.serialization.json.c;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes9.dex */
public final class x721 extends kr {
    public static final w721 Companion = new w721();
    public final String a;
    public final c b;

    public /* synthetic */ x721(int i, String str, c cVar) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, v721.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x721.class != obj.getClass()) {
            return false;
        }
        x721 x721Var = (x721) obj;
        return jl40.l(this.a, x721Var.a) && jl40.l(this.b, x721Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        c cVar = this.b;
        return hashCode + (cVar != null ? cVar.a.hashCode() : 0);
    }

    public final String toString() {
        return "UpdateSectionAction(sectionId=" + this.a + ", params=" + this.b + Extension.C_BRAKE;
    }
}
