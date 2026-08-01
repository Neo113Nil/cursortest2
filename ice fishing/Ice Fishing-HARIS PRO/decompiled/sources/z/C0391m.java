package z;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* renamed from: z.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0391m {

    /* renamed from: n, reason: collision with root package name */
    public static final SparseIntArray f4948n;

    /* renamed from: a, reason: collision with root package name */
    public float f4949a;

    /* renamed from: b, reason: collision with root package name */
    public float f4950b;

    /* renamed from: c, reason: collision with root package name */
    public float f4951c;

    /* renamed from: d, reason: collision with root package name */
    public float f4952d;
    public float e;

    /* renamed from: f, reason: collision with root package name */
    public float f4953f;

    /* renamed from: g, reason: collision with root package name */
    public float f4954g;

    /* renamed from: h, reason: collision with root package name */
    public int f4955h;
    public float i;
    public float j;

    /* renamed from: k, reason: collision with root package name */
    public float f4956k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f4957l;

    /* renamed from: m, reason: collision with root package name */
    public float f4958m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4948n = sparseIntArray;
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
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0396r.i);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (f4948n.get(index)) {
                case 1:
                    this.f4949a = obtainStyledAttributes.getFloat(index, this.f4949a);
                    break;
                case 2:
                    this.f4950b = obtainStyledAttributes.getFloat(index, this.f4950b);
                    break;
                case 3:
                    this.f4951c = obtainStyledAttributes.getFloat(index, this.f4951c);
                    break;
                case 4:
                    this.f4952d = obtainStyledAttributes.getFloat(index, this.f4952d);
                    break;
                case 5:
                    this.e = obtainStyledAttributes.getFloat(index, this.e);
                    break;
                case 6:
                    this.f4953f = obtainStyledAttributes.getDimension(index, this.f4953f);
                    break;
                case 7:
                    this.f4954g = obtainStyledAttributes.getDimension(index, this.f4954g);
                    break;
                case 8:
                    this.i = obtainStyledAttributes.getDimension(index, this.i);
                    break;
                case 9:
                    this.j = obtainStyledAttributes.getDimension(index, this.j);
                    break;
                case 10:
                    this.f4956k = obtainStyledAttributes.getDimension(index, this.f4956k);
                    break;
                case 11:
                    this.f4957l = true;
                    this.f4958m = obtainStyledAttributes.getDimension(index, this.f4958m);
                    break;
                case 12:
                    this.f4955h = C0392n.f(obtainStyledAttributes, index, this.f4955h);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
