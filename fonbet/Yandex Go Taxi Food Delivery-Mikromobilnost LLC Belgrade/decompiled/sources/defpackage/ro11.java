package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lro11;", "", "Companion", "qo11", "po11", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ro11 {
    public static final qo11 Companion = new qo11();
    public static final i3y[] c;
    public static final ro11 d;
    public final List a;
    public final List b;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        c = new i3y[]{a.b(lazyThreadSafetyMode, new gn11(4)), a.b(lazyThreadSafetyMode, new gn11(5))};
        d = new ro11(0);
    }

    public /* synthetic */ ro11(List list, List list2, int i) {
        this.a = (i & 1) == 0 ? EmptyList.a : list;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ro11)) {
            return false;
        }
        ro11 ro11Var = (ro11) obj;
        return jl40.l(this.a, ro11Var.a) && jl40.l(this.b, ro11Var.b);
    }

    public final int hashCode() {
        List list = this.a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return xvz.l("TypedScreens(screens=", this.a, ", savedScreensToRemove=", this.b, Extension.C_BRAKE);
    }

    public ro11(int i) {
        this.a = EmptyList.a;
        this.b = null;
    }

    public ro11() {
        this(0);
    }
}
