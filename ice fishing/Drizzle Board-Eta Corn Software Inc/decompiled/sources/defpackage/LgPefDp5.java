package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class LgPefDp5 implements i9 {
    public final float NCTxEWno;
    public final i9 qoPGr6Ce;

    public LgPefDp5(float f, i9 i9Var) {
        while (i9Var instanceof LgPefDp5) {
            i9Var = ((LgPefDp5) i9Var).qoPGr6Ce;
            f += ((LgPefDp5) i9Var).NCTxEWno;
        }
        this.qoPGr6Ce = i9Var;
        this.NCTxEWno = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LgPefDp5)) {
            return false;
        }
        LgPefDp5 lgPefDp5 = (LgPefDp5) obj;
        return this.qoPGr6Ce.equals(lgPefDp5.qoPGr6Ce) && this.NCTxEWno == lgPefDp5.NCTxEWno;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.qoPGr6Ce, Float.valueOf(this.NCTxEWno)});
    }

    @Override // defpackage.i9
    public final float qoPGr6Ce(RectF rectF) {
        return Math.max(0.0f, this.qoPGr6Ce.qoPGr6Ce(rectF) + this.NCTxEWno);
    }
}
