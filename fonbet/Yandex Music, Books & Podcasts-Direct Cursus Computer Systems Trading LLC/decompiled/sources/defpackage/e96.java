package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
public final class e96 {
    public static final SparseIntArray o;
    public boolean a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public int i;
    public float j;
    public float k;
    public float l;
    public boolean m;
    public float n;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        o = sparseIntArray;
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

    public final void a(e96 e96Var) {
        this.a = e96Var.a;
        this.b = e96Var.b;
        this.c = e96Var.c;
        this.d = e96Var.d;
        this.e = e96Var.e;
        this.f = e96Var.f;
        this.g = e96Var.g;
        this.h = e96Var.h;
        this.i = e96Var.i;
        this.j = e96Var.j;
        this.k = e96Var.k;
        this.l = e96Var.l;
        this.m = e96Var.m;
        this.n = e96Var.n;
    }

    public final void b(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cen.v);
        this.a = true;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (o.get(index)) {
                case 1:
                    this.b = obtainStyledAttributes.getFloat(index, this.b);
                    break;
                case 2:
                    this.c = obtainStyledAttributes.getFloat(index, this.c);
                    break;
                case 3:
                    this.d = obtainStyledAttributes.getFloat(index, this.d);
                    break;
                case 4:
                    this.e = obtainStyledAttributes.getFloat(index, this.e);
                    break;
                case 5:
                    this.f = obtainStyledAttributes.getFloat(index, this.f);
                    break;
                case 6:
                    this.g = obtainStyledAttributes.getDimension(index, this.g);
                    break;
                case 7:
                    this.h = obtainStyledAttributes.getDimension(index, this.h);
                    break;
                case 8:
                    this.j = obtainStyledAttributes.getDimension(index, this.j);
                    break;
                case 9:
                    this.k = obtainStyledAttributes.getDimension(index, this.k);
                    break;
                case 10:
                    this.l = obtainStyledAttributes.getDimension(index, this.l);
                    break;
                case 11:
                    this.m = true;
                    this.n = obtainStyledAttributes.getDimension(index, this.n);
                    break;
                case 12:
                    this.i = f96.o(obtainStyledAttributes, index, this.i);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
