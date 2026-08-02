package com.alexvasilkov.gestures.animation;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.view.View;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class ViewPosition {
    public static final int[] tmpLocation;
    public static final Matrix tmpMatrix;
    public static final Rect tmpViewRect;
    public final Rect view = new Rect();
    public final Rect viewport = new Rect();
    public final Rect visible = new Rect();
    public final Rect image = new Rect();

    static {
        Pattern.compile("#");
        tmpLocation = new int[2];
        tmpMatrix = new Matrix();
        tmpViewRect = new Rect();
    }

    public static float getTotalScaleX(Object obj) {
        if (!(obj instanceof View)) {
            return 1.0f;
        }
        View view = (View) obj;
        return getTotalScaleX(view.getParent()) * view.getScaleX();
    }

    public static float getTotalScaleY(Object obj) {
        if (!(obj instanceof View)) {
            return 1.0f;
        }
        View view = (View) obj;
        return getTotalScaleY(view.getParent()) * view.getScaleY();
    }
}
