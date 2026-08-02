package z;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import v.AbstractC5094a;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: j, reason: collision with root package name */
    public static final SparseIntArray f42150j;

    /* renamed from: a, reason: collision with root package name */
    public int f42151a;

    /* renamed from: b, reason: collision with root package name */
    public int f42152b;

    /* renamed from: c, reason: collision with root package name */
    public int f42153c;

    /* renamed from: d, reason: collision with root package name */
    public float f42154d;

    /* renamed from: e, reason: collision with root package name */
    public float f42155e;

    /* renamed from: f, reason: collision with root package name */
    public float f42156f;

    /* renamed from: g, reason: collision with root package name */
    public int f42157g;

    /* renamed from: h, reason: collision with root package name */
    public String f42158h;
    public int i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f42150j = sparseIntArray;
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
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f42188f);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (f42150j.get(index)) {
                case 1:
                    this.f42155e = obtainStyledAttributes.getFloat(index, this.f42155e);
                    break;
                case 2:
                    this.f42153c = obtainStyledAttributes.getInt(index, this.f42153c);
                    break;
                case 3:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        String str = AbstractC5094a.f41077a[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 4:
                    obtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f42151a = n.f(obtainStyledAttributes, index, this.f42151a);
                    break;
                case 6:
                    this.f42152b = obtainStyledAttributes.getInteger(index, this.f42152b);
                    break;
                case 7:
                    this.f42154d = obtainStyledAttributes.getFloat(index, this.f42154d);
                    break;
                case 8:
                    this.f42157g = obtainStyledAttributes.getInteger(index, this.f42157g);
                    break;
                case 9:
                    this.f42156f = obtainStyledAttributes.getFloat(index, this.f42156f);
                    break;
                case 10:
                    int i4 = obtainStyledAttributes.peekValue(index).type;
                    if (i4 == 1) {
                        this.i = obtainStyledAttributes.getResourceId(index, -1);
                        break;
                    } else if (i4 == 3) {
                        String string = obtainStyledAttributes.getString(index);
                        this.f42158h = string;
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
