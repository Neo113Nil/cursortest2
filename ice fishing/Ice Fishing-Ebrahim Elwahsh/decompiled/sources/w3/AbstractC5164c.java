package w3;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: w3.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5164c {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f41650a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f41651b = new ThreadLocal();

    public static void a(ViewGroup viewGroup, View view, Matrix matrix) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != viewGroup) {
            a(viewGroup, (View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }
}
