package D0;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class x {
    public static int a(ViewGroup viewGroup, int i) {
        return viewGroup.getChildDrawingOrder(i);
    }

    public static void b(ViewGroup viewGroup, boolean z8) {
        viewGroup.suppressLayout(z8);
    }
}
