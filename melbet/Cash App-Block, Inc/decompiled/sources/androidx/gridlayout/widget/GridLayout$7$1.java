package androidx.gridlayout.widget;

import android.view.View;
import androidx.gridlayout.widget.GridLayout;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class GridLayout$7$1 extends GridLayout.Bounds {
    public int size;

    @Override // androidx.gridlayout.widget.GridLayout.Bounds
    public final int getOffset(GridLayout gridLayout, View view, GridLayout.Alignment alignment, int i, boolean z) {
        return Math.max(0, super.getOffset(gridLayout, view, alignment, i, z));
    }

    @Override // androidx.gridlayout.widget.GridLayout.Bounds
    public final void include(int i, int i2) {
        super.include(i, i2);
        this.size = Math.max(this.size, i + i2);
    }

    @Override // androidx.gridlayout.widget.GridLayout.Bounds
    public final void reset() {
        super.reset();
        this.size = PKIFailureInfo.systemUnavail;
    }

    @Override // androidx.gridlayout.widget.GridLayout.Bounds
    public final int size(boolean z) {
        return Math.max(super.size(z), this.size);
    }
}
