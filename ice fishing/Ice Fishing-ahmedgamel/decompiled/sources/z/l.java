package z;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public int f42188a;

    /* renamed from: b, reason: collision with root package name */
    public int f42189b;

    /* renamed from: c, reason: collision with root package name */
    public float f42190c;

    /* renamed from: d, reason: collision with root package name */
    public float f42191d;

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f42218g);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.f42190c = obtainStyledAttributes.getFloat(index, this.f42190c);
            } else if (index == 0) {
                int i6 = obtainStyledAttributes.getInt(index, this.f42188a);
                this.f42188a = i6;
                this.f42188a = n.f42205d[i6];
            } else if (index == 4) {
                this.f42189b = obtainStyledAttributes.getInt(index, this.f42189b);
            } else if (index == 3) {
                this.f42191d = obtainStyledAttributes.getFloat(index, this.f42191d);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
