package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class t040 implements v040 {
    public final ne61 a;

    public t040(ne61 ne61Var) {
        this.a = ne61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t040) && jl40.l(this.a, ((t040) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnZoomButtonsAction(zoomButtonsAction=" + this.a + Extension.C_BRAKE;
    }
}
