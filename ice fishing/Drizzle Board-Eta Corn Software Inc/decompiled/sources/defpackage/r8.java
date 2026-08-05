package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class r8 {
    public static final SparseIntArray ygLcUYwZ;
    public float MdtA4re8;
    public float NCTxEWno;
    public float OnDfzHZD;
    public float P7K7Inc8;
    public int Qr9iLBAD;
    public float VgvYg0wo;
    public float b2ZJblxo;
    public float eVhOlqcC;
    public float jb9XjC4I;
    public float k3x7lurq;
    public boolean ow5vqvCr;
    public float qoPGr6Ce;
    public float wxUZMvaN;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        ygLcUYwZ = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
        sparseIntArray.append(11, 12);
    }

    public final void qoPGr6Ce(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r00.jb9XjC4I);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (ygLcUYwZ.get(index)) {
                case 1:
                    this.qoPGr6Ce = obtainStyledAttributes.getFloat(index, this.qoPGr6Ce);
                    break;
                case 2:
                    this.NCTxEWno = obtainStyledAttributes.getFloat(index, this.NCTxEWno);
                    break;
                case 3:
                    this.MdtA4re8 = obtainStyledAttributes.getFloat(index, this.MdtA4re8);
                    break;
                case 4:
                    this.wxUZMvaN = obtainStyledAttributes.getFloat(index, this.wxUZMvaN);
                    break;
                case 5:
                    this.VgvYg0wo = obtainStyledAttributes.getFloat(index, this.VgvYg0wo);
                    break;
                case 6:
                    this.P7K7Inc8 = obtainStyledAttributes.getDimension(index, this.P7K7Inc8);
                    break;
                case 7:
                    this.b2ZJblxo = obtainStyledAttributes.getDimension(index, this.b2ZJblxo);
                    break;
                case 8:
                    this.jb9XjC4I = obtainStyledAttributes.getDimension(index, this.jb9XjC4I);
                    break;
                case 9:
                    this.eVhOlqcC = obtainStyledAttributes.getDimension(index, this.eVhOlqcC);
                    break;
                case 10:
                    this.k3x7lurq = obtainStyledAttributes.getDimension(index, this.k3x7lurq);
                    break;
                case 11:
                    this.ow5vqvCr = true;
                    this.OnDfzHZD = obtainStyledAttributes.getDimension(index, this.OnDfzHZD);
                    break;
                case 12:
                    this.Qr9iLBAD = s8.VgvYg0wo(obtainStyledAttributes, index, this.Qr9iLBAD);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
