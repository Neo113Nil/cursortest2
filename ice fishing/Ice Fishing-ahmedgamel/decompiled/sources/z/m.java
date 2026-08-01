package z;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: n, reason: collision with root package name */
    public static final SparseIntArray f42192n;

    /* renamed from: a, reason: collision with root package name */
    public float f42193a;

    /* renamed from: b, reason: collision with root package name */
    public float f42194b;

    /* renamed from: c, reason: collision with root package name */
    public float f42195c;

    /* renamed from: d, reason: collision with root package name */
    public float f42196d;

    /* renamed from: e, reason: collision with root package name */
    public float f42197e;

    /* renamed from: f, reason: collision with root package name */
    public float f42198f;

    /* renamed from: g, reason: collision with root package name */
    public float f42199g;

    /* renamed from: h, reason: collision with root package name */
    public int f42200h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f42201j;

    /* renamed from: k, reason: collision with root package name */
    public float f42202k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f42203l;

    /* renamed from: m, reason: collision with root package name */
    public float f42204m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f42192n = sparseIntArray;
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
            switch (f42192n.get(index)) {
                case 1:
                    this.f42193a = obtainStyledAttributes.getFloat(index, this.f42193a);
                    break;
                case 2:
                    this.f42194b = obtainStyledAttributes.getFloat(index, this.f42194b);
                    break;
                case 3:
                    this.f42195c = obtainStyledAttributes.getFloat(index, this.f42195c);
                    break;
                case 4:
                    this.f42196d = obtainStyledAttributes.getFloat(index, this.f42196d);
                    break;
                case 5:
                    this.f42197e = obtainStyledAttributes.getFloat(index, this.f42197e);
                    break;
                case 6:
                    this.f42198f = obtainStyledAttributes.getDimension(index, this.f42198f);
                    break;
                case 7:
                    this.f42199g = obtainStyledAttributes.getDimension(index, this.f42199g);
                    break;
                case 8:
                    this.i = obtainStyledAttributes.getDimension(index, this.i);
                    break;
                case 9:
                    this.f42201j = obtainStyledAttributes.getDimension(index, this.f42201j);
                    break;
                case 10:
                    this.f42202k = obtainStyledAttributes.getDimension(index, this.f42202k);
                    break;
                case 11:
                    this.f42203l = true;
                    this.f42204m = obtainStyledAttributes.getDimension(index, this.f42204m);
                    break;
                case 12:
                    this.f42200h = n.f(obtainStyledAttributes, index, this.f42200h);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
