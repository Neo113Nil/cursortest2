package defpackage;

import android.view.View;

/* loaded from: classes11.dex */
public class ww31 {
    public static final int[] a = new int[2];

    public static View a(int i, View view) {
        View findViewById = view.findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        vg10.s("View with id [", view.getResources().getResourceName(i), "] doesn't exist");
        return null;
    }

    public static boolean b(float f, float f2, View view) {
        int[] iArr = a;
        view.getLocationInWindow(iArr);
        if (f >= iArr[0] && f <= view.getWidth() + r2) {
            if (f2 >= iArr[1] && f2 <= view.getHeight() + r0) {
                return true;
            }
        }
        return false;
    }
}
