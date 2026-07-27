package z;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public int f42185a;

    /* renamed from: b, reason: collision with root package name */
    public int f42186b;

    /* renamed from: c, reason: collision with root package name */
    public float f42187c;

    /* renamed from: d, reason: collision with root package name */
    public float f42188d;

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f42215g);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.f42187c = obtainStyledAttributes.getFloat(index, this.f42187c);
            } else if (index == 0) {
                int i6 = obtainStyledAttributes.getInt(index, this.f42185a);
                this.f42185a = i6;
                this.f42185a = n.f42202d[i6];
            } else if (index == 4) {
                this.f42186b = obtainStyledAttributes.getInt(index, this.f42186b);
            } else if (index == 3) {
                this.f42188d = obtainStyledAttributes.getFloat(index, this.f42188d);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
