package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class oj extends pu {
    public String Qr9iLBAD;

    @Override // defpackage.pu
    public final void P7K7Inc8(Context context, AttributeSet attributeSet) {
        super.P7K7Inc8(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, w00.NCTxEWno);
        obtainAttributes.getClass();
        String string = obtainAttributes.getString(0);
        if (string != null) {
            this.Qr9iLBAD = string;
        }
        obtainAttributes.recycle();
    }

    @Override // defpackage.pu
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && (obj instanceof oj) && super.equals(obj) && fn.qoPGr6Ce(this.Qr9iLBAD, ((oj) obj).Qr9iLBAD);
    }

    @Override // defpackage.pu
    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.Qr9iLBAD;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // defpackage.pu
    public final String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(" class=");
        String str = this.Qr9iLBAD;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        return sb.toString();
    }
}
