package z;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* renamed from: z.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0390l {

    /* renamed from: a, reason: collision with root package name */
    public int f4944a;

    /* renamed from: b, reason: collision with root package name */
    public int f4945b;

    /* renamed from: c, reason: collision with root package name */
    public float f4946c;

    /* renamed from: d, reason: collision with root package name */
    public float f4947d;

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0396r.f4970g);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.f4946c = obtainStyledAttributes.getFloat(index, this.f4946c);
            } else if (index == 0) {
                int i2 = obtainStyledAttributes.getInt(index, this.f4944a);
                this.f4944a = i2;
                this.f4944a = C0392n.f4959d[i2];
            } else if (index == 4) {
                this.f4945b = obtainStyledAttributes.getInt(index, this.f4945b);
            } else if (index == 3) {
                this.f4947d = obtainStyledAttributes.getFloat(index, this.f4947d);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
