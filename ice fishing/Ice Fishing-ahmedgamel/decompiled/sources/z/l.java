package z;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public int f42159a;

    /* renamed from: b, reason: collision with root package name */
    public int f42160b;

    /* renamed from: c, reason: collision with root package name */
    public float f42161c;

    /* renamed from: d, reason: collision with root package name */
    public float f42162d;

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f42189g);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.f42161c = obtainStyledAttributes.getFloat(index, this.f42161c);
            } else if (index == 0) {
                int i4 = obtainStyledAttributes.getInt(index, this.f42159a);
                this.f42159a = i4;
                this.f42159a = n.f42176d[i4];
            } else if (index == 4) {
                this.f42160b = obtainStyledAttributes.getInt(index, this.f42160b);
            } else if (index == 3) {
                this.f42162d = obtainStyledAttributes.getFloat(index, this.f42162d);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
