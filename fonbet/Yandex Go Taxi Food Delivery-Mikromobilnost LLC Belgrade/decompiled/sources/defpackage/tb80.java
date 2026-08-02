package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ltb80;", "Lxn11;", "Companion", "sb80", "rb80", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class tb80 implements xn11 {
    public static final sb80 Companion = new sb80();
    public static final tb80 c = new tb80(0);
    public final String b;

    public /* synthetic */ tb80(int i, String str) {
        if ((i & 1) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tb80) && jl40.l(this.b, ((tb80) obj).b);
    }

    public final int hashCode() {
        String str = this.b;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return oyr.p("OrderWithoutBExperiment(suggestPlace=", this.b, Extension.C_BRAKE);
    }

    public tb80(int i) {
        this.b = null;
    }

    public tb80() {
        this(0);
    }
}
