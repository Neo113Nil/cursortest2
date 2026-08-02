package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes3.dex */
public class w0s extends View {
    public final CharSequence a;
    public final Drawable b;
    public final int c;

    public w0s(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        lum V = lum.V(context, attributeSet, vdn.T);
        TypedArray typedArray = (TypedArray) V.b;
        this.a = typedArray.getText(2);
        this.b = V.M(0);
        this.c = typedArray.getResourceId(1, 0);
        V.f0();
    }

    public w0s(Context context) {
        this(context, null);
    }
}
