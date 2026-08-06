package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class mp0 implements java.lang.Comparable {
    public final int P05cfTpS5W5L;
    public final boolean QiMR8OkAhezm;
    public final defpackage.np0 WDYagTQQm9ns;
    public final boolean e6mdH7fiFuta;
    public final android.os.Bundle oh71FJcDz6S2;

    public mp0(defpackage.np0 np0Var, android.os.Bundle bundle, boolean z, int i, boolean z2) {
        this.WDYagTQQm9ns = np0Var;
        this.oh71FJcDz6S2 = bundle;
        this.QiMR8OkAhezm = z;
        this.P05cfTpS5W5L = i;
        this.e6mdH7fiFuta = z2;
    }

    @Override // java.lang.Comparable
    /* renamed from: ZpBGe2uQfcn8, reason: merged with bridge method [inline-methods] */
    public final int compareTo(defpackage.mp0 mp0Var) {
        mp0Var.getClass();
        boolean z = mp0Var.e6mdH7fiFuta;
        boolean z2 = mp0Var.QiMR8OkAhezm;
        android.os.Bundle bundle = mp0Var.oh71FJcDz6S2;
        boolean z3 = this.QiMR8OkAhezm;
        if (z3 && !z2) {
            return 1;
        }
        if (!z3 && z2) {
            return -1;
        }
        int i = this.P05cfTpS5W5L - mp0Var.P05cfTpS5W5L;
        if (i > 0) {
            return 1;
        }
        if (i < 0) {
            return -1;
        }
        android.os.Bundle bundle2 = this.oh71FJcDz6S2;
        if (bundle2 != null && bundle == null) {
            return 1;
        }
        if (bundle2 == null && bundle != null) {
            return -1;
        }
        if (bundle2 != null) {
            int size = bundle2.size();
            bundle.getClass();
            int size2 = size - bundle.size();
            if (size2 > 0) {
                return 1;
            }
            if (size2 < 0) {
                return -1;
            }
        }
        boolean z4 = this.e6mdH7fiFuta;
        if (!z4 || z) {
            return (z4 || !z) ? 0 : -1;
        }
        return 1;
    }
}
