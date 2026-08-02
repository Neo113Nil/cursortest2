package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lsmk0;", "Lxn11;", "Companion", "rmk0", "qmk0", "order"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class smk0 implements xn11 {
    public static final rmk0 Companion = new rmk0();
    public static final i3y[] d = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new sjk0(23))};
    public final n7v b;
    public final List c;

    static {
        new smk0(0);
    }

    public /* synthetic */ smk0(int i, n7v n7vVar, List list) {
        this.b = (i & 1) == 0 ? n7v.f : n7vVar;
        if ((i & 2) == 0) {
            this.c = EmptyList.a;
        } else {
            this.c = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof smk0)) {
            return false;
        }
        smk0 smk0Var = (smk0) obj;
        return jl40.l(this.b, smk0Var.b) && jl40.l(this.c, smk0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "RideCardRatingSelectorDecorationsExperiment(backgroundGlowImage=" + this.b + ", ratingItemsDecorationStates=" + this.c + Extension.C_BRAKE;
    }

    public smk0() {
        this(0);
    }

    public smk0(int i) {
        this.b = n7v.f;
        this.c = EmptyList.a;
    }
}
