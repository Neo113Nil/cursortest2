package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public final class d96 {
    public boolean a;
    public int b;
    public int c;
    public float d;
    public float e;

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cen.s);
        this.a = true;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.d = obtainStyledAttributes.getFloat(index, this.d);
            } else if (index == 0) {
                int i2 = obtainStyledAttributes.getInt(index, this.b);
                this.b = i2;
                this.b = f96.h[i2];
            } else if (index == 4) {
                this.c = obtainStyledAttributes.getInt(index, this.c);
            } else if (index == 3) {
                this.e = obtainStyledAttributes.getFloat(index, this.e);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
