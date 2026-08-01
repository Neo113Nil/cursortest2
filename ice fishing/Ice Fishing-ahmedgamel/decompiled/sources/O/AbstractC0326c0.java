package O;

import android.view.View;
import android.view.ViewParent;

/* renamed from: O.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0326c0 {
    public static boolean a(ViewParent viewParent, View view, float f3, float f9, boolean z3) {
        return viewParent.onNestedFling(view, f3, f9, z3);
    }

    public static boolean b(ViewParent viewParent, View view, float f3, float f9) {
        return viewParent.onNestedPreFling(view, f3, f9);
    }

    public static void c(ViewParent viewParent, View view, int i, int i6, int[] iArr) {
        viewParent.onNestedPreScroll(view, i, i6, iArr);
    }

    public static void d(ViewParent viewParent, View view, int i, int i6, int i9, int i10) {
        viewParent.onNestedScroll(view, i, i6, i9, i10);
    }

    public static void e(ViewParent viewParent, View view, View view2, int i) {
        viewParent.onNestedScrollAccepted(view, view2, i);
    }

    public static boolean f(ViewParent viewParent, View view, View view2, int i) {
        return viewParent.onStartNestedScroll(view, view2, i);
    }

    public static void g(ViewParent viewParent, View view) {
        viewParent.onStopNestedScroll(view);
    }
}
