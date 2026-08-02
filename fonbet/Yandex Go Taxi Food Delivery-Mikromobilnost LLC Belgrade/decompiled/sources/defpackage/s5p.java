package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0(with = t5p.class)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Ls5p;", "", "Companion", "r5p", "flex-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class s5p {
    public static final r5p Companion = new r5p();
    public final v6p a;
    public final Map b;
    public final List c;
    public final m5p d;

    public s5p(v6p v6pVar, LinkedHashMap linkedHashMap, ArrayList arrayList, m5p m5pVar, int i) {
        v6pVar = (i & 1) != 0 ? null : v6pVar;
        linkedHashMap = (i & 2) != 0 ? null : linkedHashMap;
        arrayList = (i & 4) != 0 ? null : arrayList;
        m5pVar = (i & 8) != 0 ? null : m5pVar;
        this.a = v6pVar;
        this.b = linkedHashMap;
        this.c = arrayList;
        this.d = m5pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s5p)) {
            return false;
        }
        s5p s5pVar = (s5p) obj;
        return jl40.l(this.a, s5pVar.a) && jl40.l(this.b, s5pVar.b) && jl40.l(this.c, s5pVar.c) && jl40.l(this.d, s5pVar.d);
    }

    public final int hashCode() {
        v6p v6pVar = this.a;
        int hashCode = (v6pVar == null ? 0 : v6pVar.hashCode()) * 31;
        Map map = this.b;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        List list = this.c;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        m5p m5pVar = this.d;
        return hashCode3 + (m5pVar != null ? m5pVar.hashCode() : 0);
    }

    public final String toString() {
        return "FTDtoTransportNode(valueTransport=" + this.a + ", map=" + this.b + ", array=" + this.c + ", value=" + this.d + Extension.C_BRAKE;
    }

    public s5p() {
        this(null, null, null, null, 15);
    }
}
