package defpackage;

import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes12.dex */
public final class qee0 {
    public static final pee0 Companion = new pee0();
    public final String a;
    public final c b;
    public final b c;

    public /* synthetic */ qee0(int i, String str, c cVar, b bVar) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, oee0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = cVar;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = bVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qee0)) {
            return false;
        }
        qee0 qee0Var = (qee0) obj;
        return jl40.l(this.a, qee0Var.a) && jl40.l(this.b, qee0Var.b) && jl40.l(this.c, qee0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        c cVar = this.b;
        int hashCode2 = (hashCode + (cVar == null ? 0 : cVar.a.hashCode())) * 31;
        b bVar = this.c;
        return hashCode2 + (bVar != null ? bVar.hashCode() : 0);
    }

    public final String toString() {
        return "PostMessageData(type=" + this.a + ", payload=" + this.b + ", data=" + this.c + Extension.C_BRAKE;
    }
}
