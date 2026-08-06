package defpackage;

import android.graphics.Rect;
import android.view.View;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class gt {
    public static final int[] GWasM1elztuh = new int[2];
    public static final Rect Yi7zF1RB1 = new Rect();

    public static final kt0 GWasM1elztuh(View view, c cVar) {
        int[] iArr = GWasM1elztuh;
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        cVar.getLocationInWindow(iArr);
        int i3 = iArr[0];
        float f = i2 - iArr[1];
        view.getFocusedRect(Yi7zF1RB1);
        float f2 = (i - i3) + r1.left;
        return new kt0(f2, r1.top + f, r1.width() + f2, f + r1.top + r1.height());
    }

    public static final dt Yi7zF1RB1(int i) {
        if (i == 1) {
            return new dt(2);
        }
        if (i == 2) {
            return new dt(1);
        }
        if (i == 17) {
            return new dt(3);
        }
        if (i == 33) {
            return new dt(5);
        }
        if (i == 66) {
            return new dt(4);
        }
        if (i != 130) {
            return null;
        }
        return new dt(6);
    }
}
