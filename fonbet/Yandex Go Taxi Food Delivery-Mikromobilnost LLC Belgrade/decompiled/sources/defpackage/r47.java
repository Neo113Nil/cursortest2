package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.Orientation;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lr47;", "", "Companion", "o47", "p47", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class r47 {
    public static final p47 Companion = new p47();
    public static final i3y[] c;
    public final Orientation a;
    public final List b;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        c = new i3y[]{a.b(lazyThreadSafetyMode, new rm6(20)), a.b(lazyThreadSafetyMode, new rm6(22))};
    }

    public /* synthetic */ r47(int i, Orientation orientation, List list) {
        this.a = (i & 1) == 0 ? Orientation.VERTICAL : orientation;
        if ((i & 2) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r47)) {
            return false;
        }
        r47 r47Var = (r47) obj;
        return this.a == r47Var.a && jl40.l(this.b, r47Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Buttons(orientation=" + this.a + ", items=" + this.b + Extension.C_BRAKE;
    }

    public r47() {
        this(0);
    }

    public r47(int i) {
        this.a = Orientation.VERTICAL;
        this.b = EmptyList.a;
    }
}
