package defpackage;

import com.google.android.gms.common.Feature;

/* loaded from: classes.dex */
public abstract class zsx0 {
    public final Feature[] a;
    public final boolean b;
    public final int c;

    public zsx0(Feature[] featureArr, boolean z, int i) {
        this.a = featureArr;
        boolean z2 = false;
        if (featureArr != null && z) {
            z2 = true;
        }
        this.b = z2;
        this.c = i;
    }

    public static ysx0 a() {
        ysx0 ysx0Var = new ysx0();
        ysx0Var.b = true;
        ysx0Var.d = 0;
        return ysx0Var;
    }

    public abstract void b(om2 om2Var, atx0 atx0Var);

    @Deprecated
    public zsx0() {
        this.a = null;
        this.b = false;
        this.c = 0;
    }
}
