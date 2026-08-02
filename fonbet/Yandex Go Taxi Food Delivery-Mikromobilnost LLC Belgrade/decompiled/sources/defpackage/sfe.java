package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes8.dex */
public final class sfe {
    public static final rfe Companion = new rfe();
    public static final i3y[] e = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new bgc(20)), null, null};
    public final String a;
    public final List b;
    public final String c;
    public final Boolean d;

    public /* synthetic */ sfe(int i, Boolean bool, String str, String str2, List list) {
        if (15 != (i & 15)) {
            qje.Z(i, 15, qfe.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sfe)) {
            return false;
        }
        sfe sfeVar = (sfe) obj;
        return jl40.l(this.a, sfeVar.a) && jl40.l(this.b, sfeVar.b) && jl40.l(this.c, sfeVar.c) && jl40.l(this.d, sfeVar.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.d;
        return hashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContentDescriptionDto(text=");
        sb.append(this.a);
        sb.append(", templates=");
        sb.append(this.b);
        sb.append(", actionText=");
        sb.append(this.c);
        sb.append(", accessibilityEnabled=");
        return oo31.i(sb, this.d, ')');
    }

    public sfe(Boolean bool, String str, String str2, List list) {
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = bool;
    }
}
