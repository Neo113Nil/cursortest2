package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class q8 {
    public float MdtA4re8;
    public int NCTxEWno;
    public int qoPGr6Ce;
    public float wxUZMvaN;

    public final void qoPGr6Ce(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r00.b2ZJblxo);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.MdtA4re8 = obtainStyledAttributes.getFloat(index, this.MdtA4re8);
            } else if (index == 0) {
                int i2 = obtainStyledAttributes.getInt(index, this.qoPGr6Ce);
                this.qoPGr6Ce = i2;
                this.qoPGr6Ce = s8.MdtA4re8[i2];
            } else if (index == 4) {
                this.NCTxEWno = obtainStyledAttributes.getInt(index, this.NCTxEWno);
            } else if (index == 3) {
                this.wxUZMvaN = obtainStyledAttributes.getFloat(index, this.wxUZMvaN);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
