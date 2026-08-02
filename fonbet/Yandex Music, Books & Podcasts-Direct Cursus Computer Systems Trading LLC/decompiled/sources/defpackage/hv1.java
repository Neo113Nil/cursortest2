package defpackage;

import android.media.AudioAttributes;
import android.os.Build;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
public final class hv1 {
    public static final /* synthetic */ int b = 0;
    public final ev1 a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public hv1(ev1 ev1Var) {
        this.a = ev1Var;
    }

    public static hv1 a(AudioAttributes audioAttributes) {
        return Build.VERSION.SDK_INT >= 26 ? new hv1(new gv1(audioAttributes, 0)) : new hv1(new ev1(audioAttributes, 0));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hv1)) {
            return false;
        }
        ev1 ev1Var = ((hv1) obj).a;
        ev1 ev1Var2 = this.a;
        return ev1Var2 == null ? ev1Var == null : ev1Var2.equals(ev1Var);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
