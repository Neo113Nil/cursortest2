package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lqm21;", "Lvn11;", "Companion", "pm21", "om21", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class qm21 implements vn11 {
    public static final pm21 Companion = new pm21();
    public static final qm21 d = new qm21(0);
    public final boolean b;
    public final boolean c;

    public /* synthetic */ qm21(int i, boolean z, boolean z2) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 2) == 0) {
            this.c = false;
        } else {
            this.c = z2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qm21)) {
            return false;
        }
        qm21 qm21Var = (qm21) obj;
        return this.b == qm21Var.b && this.c == qm21Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (Boolean.hashCode(this.b) * 31);
    }

    public final String toString() {
        return ly3.o("UserFingerprintExperiment(enabled=", ", trackActivity=", Extension.C_BRAKE, this.b, this.c);
    }

    public qm21(int i) {
        this.b = false;
        this.c = false;
    }

    public qm21() {
        this(0);
    }
}
