package defpackage;

import android.R;
import android.content.res.TypedArray;
import com.ybsdk.core.design.spoiler.Spoiler;

/* loaded from: classes3.dex */
public final class qdm0 {
    public final int a;
    public final int b;
    public final Spoiler.a c;
    public final int d;

    public qdm0(rdm0 rdm0Var, int i, int i2, Spoiler.a aVar) {
        this.a = i;
        this.b = i2;
        this.c = aVar;
        TypedArray obtainStyledAttributes = rdm0Var.a.c.getContext().obtainStyledAttributes(i2, new int[]{R.attr.textSize});
        try {
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
            this.d = dimensionPixelSize;
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
