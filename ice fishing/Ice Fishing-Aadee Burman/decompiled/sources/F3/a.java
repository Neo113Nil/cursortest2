package F3;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes2.dex */
public final class a extends O3.b {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f952c;

    /* renamed from: d, reason: collision with root package name */
    public final SideSheetBehavior f953d;

    public /* synthetic */ a(SideSheetBehavior sideSheetBehavior, int i) {
        this.f952c = i;
        this.f953d = sideSheetBehavior;
    }

    @Override // O3.b
    public final boolean A(float f3, float f9) {
        switch (this.f952c) {
            case 0:
                if (Math.abs(f3) > Math.abs(f9)) {
                    float abs = Math.abs(f3);
                    this.f953d.getClass();
                    if (abs > 500) {
                    }
                }
                break;
            default:
                if (Math.abs(f3) > Math.abs(f9)) {
                    float abs2 = Math.abs(f3);
                    this.f953d.getClass();
                    if (abs2 > 500) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // O3.b
    public final boolean D(View view, float f3) {
        switch (this.f952c) {
            case 0:
                float left = view.getLeft();
                SideSheetBehavior sideSheetBehavior = this.f953d;
                float abs = Math.abs((f3 * sideSheetBehavior.f36047k) + left);
                sideSheetBehavior.getClass();
                if (abs > 0.5f) {
                }
                break;
            default:
                float right = view.getRight();
                SideSheetBehavior sideSheetBehavior2 = this.f953d;
                float abs2 = Math.abs((f3 * sideSheetBehavior2.f36047k) + right);
                sideSheetBehavior2.getClass();
                if (abs2 > 0.5f) {
                }
                break;
        }
        return false;
    }

    @Override // O3.b
    public final void F(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i6) {
        switch (this.f952c) {
            case 0:
                if (i <= this.f953d.f36049m) {
                    marginLayoutParams.leftMargin = i6;
                    break;
                }
                break;
            default:
                int i9 = this.f953d.f36049m;
                if (i <= i9) {
                    marginLayoutParams.rightMargin = i9 - i;
                    break;
                }
                break;
        }
    }

    @Override // O3.b
    public final int f(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f952c) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // O3.b
    public final float g(int i) {
        switch (this.f952c) {
            case 0:
                float q8 = q();
                return (i - q8) / (p() - q8);
            default:
                float f3 = this.f953d.f36049m;
                return (f3 - i) / (f3 - p());
        }
    }

    @Override // O3.b
    public final int p() {
        switch (this.f952c) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f953d;
                return Math.max(0, sideSheetBehavior.f36050n + sideSheetBehavior.f36051o);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.f953d;
                return Math.max(0, (sideSheetBehavior2.f36049m - sideSheetBehavior2.f36048l) - sideSheetBehavior2.f36051o);
        }
    }

    @Override // O3.b
    public final int q() {
        switch (this.f952c) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f953d;
                return (-sideSheetBehavior.f36048l) - sideSheetBehavior.f36051o;
            default:
                return this.f953d.f36049m;
        }
    }

    @Override // O3.b
    public final int r() {
        switch (this.f952c) {
            case 0:
                return this.f953d.f36051o;
            default:
                return this.f953d.f36049m;
        }
    }

    @Override // O3.b
    public final int s() {
        switch (this.f952c) {
            case 0:
                return -this.f953d.f36048l;
            default:
                return p();
        }
    }

    @Override // O3.b
    public final int t(View view) {
        switch (this.f952c) {
            case 0:
                return view.getRight() + this.f953d.f36051o;
            default:
                return view.getLeft() - this.f953d.f36051o;
        }
    }

    @Override // O3.b
    public final int u(CoordinatorLayout coordinatorLayout) {
        switch (this.f952c) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // O3.b
    public final int v() {
        switch (this.f952c) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // O3.b
    public final boolean x(float f3) {
        switch (this.f952c) {
            case 0:
                if (f3 > 0.0f) {
                }
                break;
            default:
                if (f3 < 0.0f) {
                }
                break;
        }
        return false;
    }

    @Override // O3.b
    public final boolean z(View view) {
        switch (this.f952c) {
            case 0:
                if (view.getRight() < (p() - q()) / 2) {
                }
                break;
            default:
                if (view.getLeft() > (p() + this.f953d.f36049m) / 2) {
                }
                break;
        }
        return false;
    }
}
