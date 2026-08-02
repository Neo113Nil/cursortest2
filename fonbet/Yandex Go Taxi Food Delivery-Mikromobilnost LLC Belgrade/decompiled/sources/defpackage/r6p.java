package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0(with = s6p.class)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lr6p;", "", "Companion", "q6p", "flex-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class r6p {
    public static final q6p Companion = new q6p();
    public final v6p a;
    public final m5p b;

    public r6p(v6p v6pVar, m5p m5pVar, int i) {
        v6pVar = (i & 1) != 0 ? null : v6pVar;
        m5pVar = (i & 2) != 0 ? null : m5pVar;
        this.a = v6pVar;
        this.b = m5pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r6p)) {
            return false;
        }
        r6p r6pVar = (r6p) obj;
        return jl40.l(this.a, r6pVar.a) && jl40.l(this.b, r6pVar.b);
    }

    public final int hashCode() {
        v6p v6pVar = this.a;
        int hashCode = (v6pVar == null ? 0 : v6pVar.hashCode()) * 31;
        m5p m5pVar = this.b;
        return hashCode + (m5pVar != null ? m5pVar.hashCode() : 0);
    }

    public final String toString() {
        return "FTSingleValueTransportNode(transport=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
    }

    public r6p() {
        this(null, null, 3);
    }
}
