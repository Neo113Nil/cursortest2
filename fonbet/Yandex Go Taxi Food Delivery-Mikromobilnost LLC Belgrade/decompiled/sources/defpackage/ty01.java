package defpackage;

import android.graphics.RectF;
import android.view.View;

/* loaded from: classes3.dex */
public abstract class ty01 {
    public static final RectF a(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new RectF(iArr[0], iArr[1], view.getWidth() + r1, view.getHeight() + r0);
    }
}
