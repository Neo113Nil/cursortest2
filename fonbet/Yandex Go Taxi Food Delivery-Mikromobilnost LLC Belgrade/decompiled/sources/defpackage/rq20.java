package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lrq20;", "", "Companion", "pq20", "qq20", "core"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class rq20 {
    public static final qq20 Companion = new qq20();
    public static final i3y[] b = {a.b(LazyThreadSafetyMode.PUBLICATION, new um20(6))};
    public final List a;

    public /* synthetic */ rq20(int i, List list) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rq20) && jl40.l(this.a, ((rq20) obj).a);
    }

    public final int hashCode() {
        List list = this.a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return tse0.k("MobRecentNotifications(entries=", Extension.C_BRAKE, this.a);
    }

    public rq20() {
        this.a = null;
    }
}
