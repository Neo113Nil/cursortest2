package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lst50;", "", "Companion", "qt50", "rt50", "plus-home-data-openapi-model_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class st50 {
    public static final rt50 Companion = new rt50();
    public static final i3y[] d;
    public final List a;
    public final List b;
    public final Map c;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        d = new i3y[]{a.b(lazyThreadSafetyMode, new ic50(18)), a.b(lazyThreadSafetyMode, new ic50(19)), a.b(lazyThreadSafetyMode, new ic50(20))};
    }

    public /* synthetic */ st50(int i, List list, List list2, Map map) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof st50)) {
            return false;
        }
        st50 st50Var = (st50) obj;
        return jl40.l(this.a, st50Var.a) && jl40.l(this.b, st50Var.b) && jl40.l(this.c, st50Var.c);
    }

    public final int hashCode() {
        List list = this.a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Map map = this.c;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkExperimentsRequestModel(testIds=");
        sb.append(this.a);
        sb.append(", excludeTestIds=");
        sb.append(this.b);
        sb.append(", params=");
        return smw0.n(sb, this.c, ')');
    }

    public st50() {
        this(null);
    }

    public st50(Map map) {
        this.a = null;
        this.b = null;
        this.c = map;
    }
}
