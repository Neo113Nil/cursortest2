package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lxqt0;", "Ldrt0;", "Companion", "vqt0", "wqt0", "multiorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class xqt0 extends drt0 {
    public static final wqt0 Companion = new wqt0();
    public final dvr0 a;

    public xqt0(int i, dvr0 dvr0Var) {
        if ((i & 1) != 0) {
            this.a = dvr0Var;
        } else {
            dvr0.Companion.getClass();
            this.a = dvr0.c;
        }
    }

    /* renamed from: a, reason: from getter */
    public final dvr0 getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xqt0) && jl40.l(this.a, ((xqt0) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "Shimmering(context=" + this.a + Extension.C_BRAKE;
    }

    public xqt0() {
        dvr0.Companion.getClass();
        this.a = dvr0.c;
    }
}
