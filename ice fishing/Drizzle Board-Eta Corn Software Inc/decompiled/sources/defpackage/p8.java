package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class p8 {
    public static final SparseIntArray eVhOlqcC;
    public int MdtA4re8;
    public int NCTxEWno;
    public float P7K7Inc8;
    public String Qr9iLBAD;
    public float VgvYg0wo;
    public int b2ZJblxo;
    public int jb9XjC4I;
    public int qoPGr6Ce;
    public float wxUZMvaN;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        eVhOlqcC = sparseIntArray;
        sparseIntArray.append(3, 1);
        sparseIntArray.append(5, 2);
        sparseIntArray.append(9, 3);
        sparseIntArray.append(2, 4);
        sparseIntArray.append(1, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(4, 7);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(7, 9);
        sparseIntArray.append(6, 10);
    }

    public final void qoPGr6Ce(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r00.P7K7Inc8);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (eVhOlqcC.get(index)) {
                case 1:
                    this.VgvYg0wo = obtainStyledAttributes.getFloat(index, this.VgvYg0wo);
                    break;
                case 2:
                    this.MdtA4re8 = obtainStyledAttributes.getInt(index, this.MdtA4re8);
                    break;
                case 3:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        String str = w30.wxUZMvaN[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 4:
                    obtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.qoPGr6Ce = s8.VgvYg0wo(obtainStyledAttributes, index, this.qoPGr6Ce);
                    break;
                case 6:
                    this.NCTxEWno = obtainStyledAttributes.getInteger(index, this.NCTxEWno);
                    break;
                case 7:
                    this.wxUZMvaN = obtainStyledAttributes.getFloat(index, this.wxUZMvaN);
                    break;
                case 8:
                    this.b2ZJblxo = obtainStyledAttributes.getInteger(index, this.b2ZJblxo);
                    break;
                case 9:
                    this.P7K7Inc8 = obtainStyledAttributes.getFloat(index, this.P7K7Inc8);
                    break;
                case 10:
                    int i2 = obtainStyledAttributes.peekValue(index).type;
                    if (i2 == 1) {
                        this.jb9XjC4I = obtainStyledAttributes.getResourceId(index, -1);
                        break;
                    } else if (i2 == 3) {
                        String string = obtainStyledAttributes.getString(index);
                        this.Qr9iLBAD = string;
                        if (string.indexOf("/") > 0) {
                            this.jb9XjC4I = obtainStyledAttributes.getResourceId(index, -1);
                            break;
                        } else {
                            break;
                        }
                    } else {
                        obtainStyledAttributes.getInteger(index, this.jb9XjC4I);
                        break;
                    }
            }
        }
        obtainStyledAttributes.recycle();
    }
}
