package z;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: n, reason: collision with root package name */
    public static final SparseIntArray f42189n;

    /* renamed from: a, reason: collision with root package name */
    public float f42190a;

    /* renamed from: b, reason: collision with root package name */
    public float f42191b;

    /* renamed from: c, reason: collision with root package name */
    public float f42192c;

    /* renamed from: d, reason: collision with root package name */
    public float f42193d;

    /* renamed from: e, reason: collision with root package name */
    public float f42194e;

    /* renamed from: f, reason: collision with root package name */
    public float f42195f;

    /* renamed from: g, reason: collision with root package name */
    public float f42196g;

    /* renamed from: h, reason: collision with root package name */
    public int f42197h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f42198j;

    /* renamed from: k, reason: collision with root package name */
    public float f42199k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f42200l;

    /* renamed from: m, reason: collision with root package name */
    public float f42201m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f42189n = sparseIntArray;
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
            switch (f42189n.get(index)) {
                case 1:
                    this.f42190a = obtainStyledAttributes.getFloat(index, this.f42190a);
                    break;
                case 2:
                    this.f42191b = obtainStyledAttributes.getFloat(index, this.f42191b);
                    break;
                case 3:
                    this.f42192c = obtainStyledAttributes.getFloat(index, this.f42192c);
                    break;
                case 4:
                    this.f42193d = obtainStyledAttributes.getFloat(index, this.f42193d);
                    break;
                case 5:
                    this.f42194e = obtainStyledAttributes.getFloat(index, this.f42194e);
                    break;
                case 6:
                    this.f42195f = obtainStyledAttributes.getDimension(index, this.f42195f);
                    break;
                case 7:
                    this.f42196g = obtainStyledAttributes.getDimension(index, this.f42196g);
                    break;
                case 8:
                    this.i = obtainStyledAttributes.getDimension(index, this.i);
                    break;
                case 9:
                    this.f42198j = obtainStyledAttributes.getDimension(index, this.f42198j);
                    break;
                case 10:
                    this.f42199k = obtainStyledAttributes.getDimension(index, this.f42199k);
                    break;
                case 11:
                    this.f42200l = true;
                    this.f42201m = obtainStyledAttributes.getDimension(index, this.f42201m);
                    break;
                case 12:
                    this.f42197h = n.f(obtainStyledAttributes, index, this.f42197h);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
