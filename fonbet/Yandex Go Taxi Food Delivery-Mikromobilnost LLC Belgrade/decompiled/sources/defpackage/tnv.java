package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class tnv implements gov {
    public static final snv Companion = new snv();
    public static final i3y[] e = {null, null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new smv(17))};
    public final String a;
    public final String b;
    public final String c;
    public final List d;

    public /* synthetic */ tnv(String str, int i, String str2, String str3, List list) {
        if (15 != (i & 15)) {
            qje.Z(i, 15, rnv.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tnv)) {
            return false;
        }
        tnv tnvVar = (tnv) obj;
        return jl40.l(this.a, tnvVar.a) && jl40.l(this.b, tnvVar.b) && jl40.l(this.c, tnvVar.c) && jl40.l(this.d, tnvVar.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.d;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TreasuryStateResponse(trackId=");
        sb.append(this.a);
        sb.append(", traceId=");
        sb.append(this.b);
        sb.append(", state=<private>, exceptions=");
        return unr0.t(sb, this.d, ')');
    }

    public tnv(String str, String str2, String str3, List list) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
    }
}
