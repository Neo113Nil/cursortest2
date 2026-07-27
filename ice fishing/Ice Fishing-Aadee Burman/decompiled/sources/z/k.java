package z;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import v.AbstractC5102a;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: j, reason: collision with root package name */
    public static final SparseIntArray f42176j;

    /* renamed from: a, reason: collision with root package name */
    public int f42177a;

    /* renamed from: b, reason: collision with root package name */
    public int f42178b;

    /* renamed from: c, reason: collision with root package name */
    public int f42179c;

    /* renamed from: d, reason: collision with root package name */
    public float f42180d;

    /* renamed from: e, reason: collision with root package name */
    public float f42181e;

    /* renamed from: f, reason: collision with root package name */
    public float f42182f;

    /* renamed from: g, reason: collision with root package name */
    public int f42183g;

    /* renamed from: h, reason: collision with root package name */
    public String f42184h;
    public int i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f42176j = sparseIntArray;
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

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f42214f);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (f42176j.get(index)) {
                case 1:
                    this.f42181e = obtainStyledAttributes.getFloat(index, this.f42181e);
                    break;
                case 2:
                    this.f42179c = obtainStyledAttributes.getInt(index, this.f42179c);
                    break;
                case 3:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        String str = AbstractC5102a.f41354a[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 4:
                    obtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f42177a = n.f(obtainStyledAttributes, index, this.f42177a);
                    break;
                case 6:
                    this.f42178b = obtainStyledAttributes.getInteger(index, this.f42178b);
                    break;
                case 7:
                    this.f42180d = obtainStyledAttributes.getFloat(index, this.f42180d);
                    break;
                case 8:
                    this.f42183g = obtainStyledAttributes.getInteger(index, this.f42183g);
                    break;
                case 9:
                    this.f42182f = obtainStyledAttributes.getFloat(index, this.f42182f);
                    break;
                case 10:
                    int i6 = obtainStyledAttributes.peekValue(index).type;
                    if (i6 == 1) {
                        this.i = obtainStyledAttributes.getResourceId(index, -1);
                        break;
                    } else if (i6 == 3) {
                        String string = obtainStyledAttributes.getString(index);
                        this.f42184h = string;
                        if (string.indexOf("/") > 0) {
                            this.i = obtainStyledAttributes.getResourceId(index, -1);
                            break;
                        } else {
                            break;
                        }
                    } else {
                        obtainStyledAttributes.getInteger(index, this.i);
                        break;
                    }
            }
        }
        obtainStyledAttributes.recycle();
    }
}
