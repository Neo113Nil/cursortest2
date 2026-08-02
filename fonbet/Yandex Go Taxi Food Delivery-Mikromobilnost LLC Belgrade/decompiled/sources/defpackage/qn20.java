package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lqn20;", "", "Companion", "on20", "pn20", "core"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class qn20 {
    public static final pn20 Companion = new pn20();
    public final Long a;
    public final Long b;

    public /* synthetic */ qn20(int i, Long l, Long l2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qn20)) {
            return false;
        }
        qn20 qn20Var = (qn20) obj;
        return jl40.l(this.a, qn20Var.a) && jl40.l(this.b, qn20Var.b);
    }

    public final int hashCode() {
        Long l = this.a;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        return hashCode + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        return "MobCronJobState(prevLaunchTimeSeconds=" + this.a + ", nextLaunchTimeSeconds=" + this.b + Extension.C_BRAKE;
    }

    public qn20() {
        this(null, null);
    }

    public qn20(Long l, Long l2) {
        this.a = l;
        this.b = l2;
    }
}
