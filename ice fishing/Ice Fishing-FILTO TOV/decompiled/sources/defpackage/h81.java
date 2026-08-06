package defpackage;

import android.graphics.Matrix;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import java.util.ArrayList;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class h81 {
    public final View GWasM1elztuh;

    public h81(View view, c cVar) {
        new j6IIN2O8eOU(view);
        Choreographer.getInstance();
        this.GWasM1elztuh = view;
        long j = r81.Yi7zF1RB1;
        int length = new u3("").EljAMC1QTz.length();
        int i = r81.X1lG3V04pd;
        int i2 = (int) (j >> 32);
        int i3 = i2 < 0 ? 0 : i2;
        i3 = i3 > length ? length : i3;
        int i4 = (int) (j & 4294967295L);
        int i5 = i4 >= 0 ? i4 : 0;
        length = i5 <= length ? i5 : length;
        if (i3 != i2 || length != i4) {
            d70.EljAMC1QTz(i3, length);
        }
        int i6 = l00.OOA6hdeuvCS;
        new ArrayList();
        d70.arNh8D4Z5gB(a90.OOA6hdeuvCS, new d3(11, this));
        new CursorAnchorInfo.Builder();
        new Matrix();
    }
}
