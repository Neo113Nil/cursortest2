package z;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import v.AbstractC0359a;

/* renamed from: z.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0389k {
    public static final SparseIntArray j;

    /* renamed from: a, reason: collision with root package name */
    public int f4937a;

    /* renamed from: b, reason: collision with root package name */
    public int f4938b;

    /* renamed from: c, reason: collision with root package name */
    public int f4939c;

    /* renamed from: d, reason: collision with root package name */
    public float f4940d;
    public float e;

    /* renamed from: f, reason: collision with root package name */
    public float f4941f;

    /* renamed from: g, reason: collision with root package name */
    public int f4942g;

    /* renamed from: h, reason: collision with root package name */
    public String f4943h;
    public int i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        j = sparseIntArray;
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
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0396r.f4969f);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (j.get(index)) {
                case 1:
                    this.e = obtainStyledAttributes.getFloat(index, this.e);
                    break;
                case 2:
                    this.f4939c = obtainStyledAttributes.getInt(index, this.f4939c);
                    break;
                case 3:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        String str = AbstractC0359a.f4479a[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 4:
                    obtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f4937a = C0392n.f(obtainStyledAttributes, index, this.f4937a);
                    break;
                case 6:
                    this.f4938b = obtainStyledAttributes.getInteger(index, this.f4938b);
                    break;
                case 7:
                    this.f4940d = obtainStyledAttributes.getFloat(index, this.f4940d);
                    break;
                case 8:
                    this.f4942g = obtainStyledAttributes.getInteger(index, this.f4942g);
                    break;
                case 9:
                    this.f4941f = obtainStyledAttributes.getFloat(index, this.f4941f);
                    break;
                case 10:
                    int i2 = obtainStyledAttributes.peekValue(index).type;
                    if (i2 == 1) {
                        this.i = obtainStyledAttributes.getResourceId(index, -1);
                        break;
                    } else if (i2 == 3) {
                        String string = obtainStyledAttributes.getString(index);
                        this.f4943h = string;
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
