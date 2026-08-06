package defpackage;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class rg1 extends qg1 {
    public rg1(wg1 wg1Var, WindowInsets windowInsets) {
        super(wg1Var, windowInsets);
    }

    @Override // defpackage.kg1, defpackage.sg1
    public List<Rect> EljAMC1QTz(int i) {
        List<Rect> boundingRectsIgnoringVisibility;
        boundingRectsIgnoringVisibility = this.X1lG3V04pd.getBoundingRectsIgnoringVisibility(vg1.GWasM1elztuh(i));
        return boundingRectsIgnoringVisibility;
    }

    @Override // defpackage.kg1, defpackage.sg1
    public List<Rect> OOA6hdeuvCS(int i) {
        List<Rect> boundingRects;
        boundingRects = this.X1lG3V04pd.getBoundingRects(vg1.GWasM1elztuh(i));
        return boundingRects;
    }

    @Override // defpackage.kg1, defpackage.sg1
    public void WIEu4Ya2g8() {
    }
}
