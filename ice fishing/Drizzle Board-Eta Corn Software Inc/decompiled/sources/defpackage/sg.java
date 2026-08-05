package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class sg extends w10 {
    public final /* synthetic */ ug qoPGr6Ce;

    public sg(ug ugVar) {
        this.qoPGr6Ce = ugVar;
    }

    @Override // defpackage.w10
    public final void qoPGr6Ce(RecyclerView recyclerView) {
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        ug ugVar = this.qoPGr6Ce;
        int i = ugVar.qoPGr6Ce;
        int computeVerticalScrollRange = ugVar.KlHjfFWx.computeVerticalScrollRange();
        int i2 = ugVar.amk52bBQ;
        ugVar.Ey6iv0m0 = computeVerticalScrollRange - i2 > 0 && i2 >= i;
        int computeHorizontalScrollRange = ugVar.KlHjfFWx.computeHorizontalScrollRange();
        int i3 = ugVar.OxcuoDLp;
        boolean z = computeHorizontalScrollRange - i3 > 0 && i3 >= i;
        ugVar.I5GHvsYW = z;
        boolean z2 = ugVar.Ey6iv0m0;
        if (!z2 && !z) {
            if (ugVar.RXQxj5Oe != 0) {
                ugVar.wxUZMvaN(0);
                return;
            }
            return;
        }
        if (z2) {
            float f = i2;
            ugVar.ow5vqvCr = (int) ((((f / 2.0f) + computeVerticalScrollOffset) * f) / computeVerticalScrollRange);
            ugVar.k3x7lurq = Math.min(i2, (i2 * i2) / computeVerticalScrollRange);
        }
        if (ugVar.I5GHvsYW) {
            float f2 = computeHorizontalScrollOffset;
            float f3 = i3;
            ugVar.lDXGDhIF = (int) ((((f3 / 2.0f) + f2) * f3) / computeHorizontalScrollRange);
            ugVar.ygLcUYwZ = Math.min(i3, (i3 * i3) / computeHorizontalScrollRange);
        }
        int i4 = ugVar.RXQxj5Oe;
        if (i4 == 0 || i4 == 1) {
            ugVar.wxUZMvaN(1);
        }
    }
}
