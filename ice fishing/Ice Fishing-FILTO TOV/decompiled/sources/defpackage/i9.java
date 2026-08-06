package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class i9 implements o40, Serializable {
    public final Class AvO7iQsrTN;
    public final Object EljAMC1QTz;
    public final boolean JFJ3QoxA;
    public transient o40 OOA6hdeuvCS;
    public final String encWxUiV2;
    public final String mOu10nynGul;

    public i9(Object obj, Class cls, String str, String str2, boolean z) {
        this.EljAMC1QTz = obj;
        this.AvO7iQsrTN = cls;
        this.encWxUiV2 = str;
        this.mOu10nynGul = str2;
        this.JFJ3QoxA = z;
    }

    public final ua OOA6hdeuvCS() {
        boolean z = this.JFJ3QoxA;
        Class cls = this.AvO7iQsrTN;
        if (!z) {
            return st0.GWasM1elztuh(cls);
        }
        st0.GWasM1elztuh.getClass();
        return new jn0(cls);
    }

    public abstract o40 xqGvceK5x();
}
