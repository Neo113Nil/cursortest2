package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ly93;", "Lmw5;", "Companion", "w93", "x93", "flex-divkit-extension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class y93 extends mw5 {
    public static final x93 Companion = new x93();
    public final int a;

    public y93(int i, int i2) {
        if ((i & 1) == 0) {
            this.a = 0;
        } else {
            this.a = i2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return y93.class.equals(obj != null ? obj.getClass() : null) && this.a == ((y93) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return oyr.j(this.a, "AsyncBindingMethod(snippetEstimatedHeightDp=", Extension.C_BRAKE);
    }

    public y93() {
        this.a = 0;
    }
}
