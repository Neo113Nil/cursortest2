package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ltlw;", "Lxn11;", "Companion", "rlw", "slw", "go-client-android.features.requirements:models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class tlw implements xn11 {
    public static final slw Companion = new slw();
    public static final i3y[] c = {a.b(LazyThreadSafetyMode.PUBLICATION, new i2v(16))};
    public final Map b;

    public /* synthetic */ tlw(int i, Map map) {
        if ((i & 1) == 0) {
            this.b = b.f();
        } else {
            this.b = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tlw) && jl40.l(this.b, ((tlw) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return nnm.j("IntercityDefaultRequirementValuesExperiment(defaultRequirementValues=", Extension.C_BRAKE, this.b);
    }

    public tlw() {
        this(0);
    }

    public tlw(int i) {
        this.b = b.f();
    }
}
