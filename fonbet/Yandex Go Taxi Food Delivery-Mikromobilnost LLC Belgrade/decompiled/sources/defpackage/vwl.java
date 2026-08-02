package defpackage;

import flex.core.model.Document$TransitionSettings$Option$Interpolator;
import flex.core.model.Document$TransitionSettings$Option$Transition;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class vwl {
    public final double a;
    public final Document$TransitionSettings$Option$Interpolator b;
    public final Document$TransitionSettings$Option$Transition c;

    public vwl(double d, Document$TransitionSettings$Option$Interpolator document$TransitionSettings$Option$Interpolator, Document$TransitionSettings$Option$Transition document$TransitionSettings$Option$Transition) {
        this.a = d;
        this.b = document$TransitionSettings$Option$Interpolator;
        this.c = document$TransitionSettings$Option$Transition;
    }

    public final Document$TransitionSettings$Option$Transition a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!vwl.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        vwl vwlVar = (vwl) obj;
        return this.a == vwlVar.a && this.b == vwlVar.b && this.c == vwlVar.c;
    }

    public final int hashCode() {
        int hashCode = Double.hashCode(this.a) * 31;
        Document$TransitionSettings$Option$Interpolator document$TransitionSettings$Option$Interpolator = this.b;
        int hashCode2 = (hashCode + (document$TransitionSettings$Option$Interpolator != null ? document$TransitionSettings$Option$Interpolator.hashCode() : 0)) * 31;
        Document$TransitionSettings$Option$Transition document$TransitionSettings$Option$Transition = this.c;
        return hashCode2 + (document$TransitionSettings$Option$Transition != null ? document$TransitionSettings$Option$Transition.hashCode() : 0);
    }

    public final String toString() {
        return "Option(duration=" + this.a + ", interpolator=" + this.b + ", transition=" + this.c + Extension.C_BRAKE;
    }
}
