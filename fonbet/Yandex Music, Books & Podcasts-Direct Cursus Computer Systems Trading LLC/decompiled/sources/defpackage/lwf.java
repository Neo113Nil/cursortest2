package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes3.dex */
public final class lwf extends ccq {
    public final /* synthetic */ int a;
    public final SideSheetBehavior b;

    public /* synthetic */ lwf(SideSheetBehavior sideSheetBehavior, int i) {
        this.a = i;
        this.b = sideSheetBehavior;
    }

    @Override // defpackage.ccq
    public final int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.a) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // defpackage.ccq
    public final float b(int i) {
        switch (this.a) {
            case 0:
                float e = e();
                return (i - e) / (d() - e);
            default:
                float parentWidth = this.b.getParentWidth();
                return (parentWidth - i) / (parentWidth - d());
        }
    }

    @Override // defpackage.ccq
    public final int c(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.a) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // defpackage.ccq
    public final int d() {
        switch (this.a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.b;
                return Math.max(0, sideSheetBehavior.getInnerMargin() + sideSheetBehavior.getParentInnerEdge());
            default:
                SideSheetBehavior sideSheetBehavior2 = this.b;
                return Math.max(0, (sideSheetBehavior2.getParentWidth() - sideSheetBehavior2.getChildWidth()) - sideSheetBehavior2.getInnerMargin());
        }
    }

    @Override // defpackage.ccq
    public final int e() {
        switch (this.a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.b;
                return (-sideSheetBehavior.getChildWidth()) - sideSheetBehavior.getInnerMargin();
            default:
                return this.b.getParentWidth();
        }
    }

    @Override // defpackage.ccq
    public final int f() {
        switch (this.a) {
            case 0:
                return this.b.getInnerMargin();
            default:
                return this.b.getParentWidth();
        }
    }

    @Override // defpackage.ccq
    public final int g() {
        switch (this.a) {
            case 0:
                return -this.b.getChildWidth();
            default:
                return d();
        }
    }

    @Override // defpackage.ccq
    public final int h(View view) {
        switch (this.a) {
            case 0:
                return this.b.getInnerMargin() + view.getRight();
            default:
                return view.getLeft() - this.b.getInnerMargin();
        }
    }

    @Override // defpackage.ccq
    public final int i(CoordinatorLayout coordinatorLayout) {
        switch (this.a) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // defpackage.ccq
    public final int j() {
        switch (this.a) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // defpackage.ccq
    public final boolean k(float f) {
        switch (this.a) {
            case 0:
                if (f > 0.0f) {
                }
                break;
            default:
                if (f < 0.0f) {
                }
                break;
        }
        return false;
    }

    @Override // defpackage.ccq
    public final boolean l(View view) {
        switch (this.a) {
            case 0:
                if (view.getRight() < (d() - e()) / 2) {
                }
                break;
            default:
                if (view.getLeft() > (d() + this.b.getParentWidth()) / 2) {
                }
                break;
        }
        return false;
    }

    @Override // defpackage.ccq
    public final boolean m(float f, float f2) {
        switch (this.a) {
            case 0:
                if (Math.abs(f) <= Math.abs(f2) || Math.abs(f) <= this.b.getSignificantVelocityThreshold()) {
                }
                break;
            default:
                if (Math.abs(f) <= Math.abs(f2) || Math.abs(f) <= this.b.getSignificantVelocityThreshold()) {
                }
                break;
        }
        return false;
    }

    @Override // defpackage.ccq
    public final boolean n(View view, float f) {
        switch (this.a) {
            case 0:
                float left = view.getLeft();
                SideSheetBehavior sideSheetBehavior = this.b;
                if (Math.abs((sideSheetBehavior.getHideFriction() * f) + left) > sideSheetBehavior.getHideThreshold()) {
                }
                break;
            default:
                float right = view.getRight();
                SideSheetBehavior sideSheetBehavior2 = this.b;
                if (Math.abs((sideSheetBehavior2.getHideFriction() * f) + right) > sideSheetBehavior2.getHideThreshold()) {
                }
                break;
        }
        return false;
    }

    @Override // defpackage.ccq
    public final void o(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        switch (this.a) {
            case 0:
                marginLayoutParams.leftMargin = i;
                break;
            default:
                marginLayoutParams.rightMargin = i;
                break;
        }
    }

    @Override // defpackage.ccq
    public final void p(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        switch (this.a) {
            case 0:
                if (i <= this.b.getParentWidth()) {
                    marginLayoutParams.leftMargin = i2;
                    break;
                }
                break;
            default:
                int parentWidth = this.b.getParentWidth();
                if (i <= parentWidth) {
                    marginLayoutParams.rightMargin = parentWidth - i;
                    break;
                }
                break;
        }
    }
}
