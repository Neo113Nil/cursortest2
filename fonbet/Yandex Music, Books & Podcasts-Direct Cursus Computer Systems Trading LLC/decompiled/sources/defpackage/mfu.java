package defpackage;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes3.dex */
public abstract class mfu extends uk6 {
    private nfu viewOffsetHelper;
    private int tempTopBottomOffset = 0;
    private int tempLeftRightOffset = 0;

    public mfu() {
    }

    public int getLeftAndRightOffset() {
        nfu nfuVar = this.viewOffsetHelper;
        if (nfuVar != null) {
            return nfuVar.e;
        }
        return 0;
    }

    public int getTopAndBottomOffset() {
        nfu nfuVar = this.viewOffsetHelper;
        if (nfuVar != null) {
            return nfuVar.d;
        }
        return 0;
    }

    public boolean isHorizontalOffsetEnabled() {
        nfu nfuVar = this.viewOffsetHelper;
        return nfuVar != null && nfuVar.g;
    }

    public boolean isVerticalOffsetEnabled() {
        nfu nfuVar = this.viewOffsetHelper;
        return nfuVar != null && nfuVar.f;
    }

    public void layoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i) {
        coordinatorLayout.B(i, view);
    }

    @Override // defpackage.uk6
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        layoutChild(coordinatorLayout, view, i);
        if (this.viewOffsetHelper == null) {
            this.viewOffsetHelper = new nfu(view);
        }
        nfu nfuVar = this.viewOffsetHelper;
        View view2 = nfuVar.a;
        nfuVar.b = view2.getTop();
        nfuVar.c = view2.getLeft();
        this.viewOffsetHelper.a();
        int i2 = this.tempTopBottomOffset;
        if (i2 != 0) {
            this.viewOffsetHelper.b(i2);
            this.tempTopBottomOffset = 0;
        }
        int i3 = this.tempLeftRightOffset;
        if (i3 == 0) {
            return true;
        }
        nfu nfuVar2 = this.viewOffsetHelper;
        if (nfuVar2.g && nfuVar2.e != i3) {
            nfuVar2.e = i3;
            nfuVar2.a();
        }
        this.tempLeftRightOffset = 0;
        return true;
    }

    public void setHorizontalOffsetEnabled(boolean z) {
        nfu nfuVar = this.viewOffsetHelper;
        if (nfuVar != null) {
            nfuVar.g = z;
        }
    }

    public boolean setLeftAndRightOffset(int i) {
        nfu nfuVar = this.viewOffsetHelper;
        if (nfuVar == null) {
            this.tempLeftRightOffset = i;
            return false;
        }
        if (!nfuVar.g || nfuVar.e == i) {
            return false;
        }
        nfuVar.e = i;
        nfuVar.a();
        return true;
    }

    public boolean setTopAndBottomOffset(int i) {
        nfu nfuVar = this.viewOffsetHelper;
        if (nfuVar != null) {
            return nfuVar.b(i);
        }
        this.tempTopBottomOffset = i;
        return false;
    }

    public void setVerticalOffsetEnabled(boolean z) {
        nfu nfuVar = this.viewOffsetHelper;
        if (nfuVar != null) {
            nfuVar.f = z;
        }
    }

    public mfu(int i) {
    }
}
