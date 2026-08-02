package z;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: n, reason: collision with root package name */
    public static final SparseIntArray f42163n;

    /* renamed from: a, reason: collision with root package name */
    public float f42164a;

    /* renamed from: b, reason: collision with root package name */
    public float f42165b;

    /* renamed from: c, reason: collision with root package name */
    public float f42166c;

    /* renamed from: d, reason: collision with root package name */
    public float f42167d;

    /* renamed from: e, reason: collision with root package name */
    public float f42168e;

    /* renamed from: f, reason: collision with root package name */
    public float f42169f;

    /* renamed from: g, reason: collision with root package name */
    public float f42170g;

    /* renamed from: h, reason: collision with root package name */
    public int f42171h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f42172j;

    /* renamed from: k, reason: collision with root package name */
    public float f42173k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f42174l;

    /* renamed from: m, reason: collision with root package name */
    public float f42175m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f42163n = sparseIntArray;
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

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.i);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (f42163n.get(index)) {
                case 1:
                    this.f42164a = obtainStyledAttributes.getFloat(index, this.f42164a);
                    break;
                case 2:
                    this.f42165b = obtainStyledAttributes.getFloat(index, this.f42165b);
                    break;
                case 3:
                    this.f42166c = obtainStyledAttributes.getFloat(index, this.f42166c);
                    break;
                case 4:
                    this.f42167d = obtainStyledAttributes.getFloat(index, this.f42167d);
                    break;
                case 5:
                    this.f42168e = obtainStyledAttributes.getFloat(index, this.f42168e);
                    break;
                case 6:
                    this.f42169f = obtainStyledAttributes.getDimension(index, this.f42169f);
                    break;
                case 7:
                    this.f42170g = obtainStyledAttributes.getDimension(index, this.f42170g);
                    break;
                case 8:
                    this.i = obtainStyledAttributes.getDimension(index, this.i);
                    break;
                case 9:
                    this.f42172j = obtainStyledAttributes.getDimension(index, this.f42172j);
                    break;
                case 10:
                    this.f42173k = obtainStyledAttributes.getDimension(index, this.f42173k);
                    break;
                case 11:
                    this.f42174l = true;
                    this.f42175m = obtainStyledAttributes.getDimension(index, this.f42175m);
                    break;
                case 12:
                    this.f42171h = n.f(obtainStyledAttributes, index, this.f42171h);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
