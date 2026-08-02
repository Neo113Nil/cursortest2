package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lz8r;", "Lb9r;", "Companion", "x8r", "y8r", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class z8r extends b9r {
    public static final y8r Companion = new y8r();
    public static final i3y[] e;
    public final blt a;
    public final List b;
    public final List c;
    public final Boolean d;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new i3y[]{null, a.b(lazyThreadSafetyMode, new n6r(6)), a.b(lazyThreadSafetyMode, new n6r(7)), null};
    }

    public z8r(int i, blt bltVar, List list, List list2, Boolean bool) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = bltVar;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z8r)) {
            return false;
        }
        z8r z8rVar = (z8r) obj;
        return jl40.l(this.a, z8rVar.a) && jl40.l(this.b, z8rVar.b) && jl40.l(this.c, z8rVar.c) && jl40.l(this.d, z8rVar.d);
    }

    public final int hashCode() {
        blt bltVar = this.a;
        int hashCode = (bltVar == null ? 0 : bltVar.hashCode()) * 31;
        List list = this.b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.c;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.d;
        return hashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "FingerprintGnss(clock=" + this.a + ", measurements=" + this.b + ", satellites=" + this.c + ", isSpoofed=" + this.d + Extension.C_BRAKE;
    }

    public z8r() {
        this(null, null, null, null);
    }

    public z8r(blt bltVar, ArrayList arrayList, ArrayList arrayList2, Boolean bool) {
        this.a = bltVar;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = bool;
    }
}
