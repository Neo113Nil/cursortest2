package H3;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bumptech.glide.g;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes2.dex */
public final class a extends g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1237a;

    /* renamed from: b, reason: collision with root package name */
    public final SideSheetBehavior f1238b;

    public /* synthetic */ a(SideSheetBehavior sideSheetBehavior, int i) {
        this.f1237a = i;
        this.f1238b = sideSheetBehavior;
    }

    @Override // com.bumptech.glide.g
    public final boolean A(View view, float f2) {
        switch (this.f1237a) {
            case 0:
                float left = view.getLeft();
                SideSheetBehavior sideSheetBehavior = this.f1238b;
                float abs = Math.abs((f2 * sideSheetBehavior.f36815k) + left);
                sideSheetBehavior.getClass();
                if (abs > 0.5f) {
                }
                break;
            default:
                float right = view.getRight();
                SideSheetBehavior sideSheetBehavior2 = this.f1238b;
                float abs2 = Math.abs((f2 * sideSheetBehavior2.f36815k) + right);
                sideSheetBehavior2.getClass();
                if (abs2 > 0.5f) {
                }
                break;
        }
        return false;
    }

    @Override // com.bumptech.glide.g
    public final void B(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i4) {
        switch (this.f1237a) {
            case 0:
                if (i <= this.f1238b.f36817m) {
                    marginLayoutParams.leftMargin = i4;
                    break;
                }
                break;
            default:
                int i6 = this.f1238b.f36817m;
                if (i <= i6) {
                    marginLayoutParams.rightMargin = i6 - i;
                    break;
                }
                break;
        }
    }

    @Override // com.bumptech.glide.g
    public final int e(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f1237a) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // com.bumptech.glide.g
    public final float f(int i) {
        switch (this.f1237a) {
            case 0:
                float k9 = k();
                return (i - k9) / (i() - k9);
            default:
                float f2 = this.f1238b.f36817m;
                return (f2 - i) / (f2 - i());
        }
    }

    @Override // com.bumptech.glide.g
    public final int i() {
        switch (this.f1237a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f1238b;
                return Math.max(0, sideSheetBehavior.f36818n + sideSheetBehavior.f36819o);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.f1238b;
                return Math.max(0, (sideSheetBehavior2.f36817m - sideSheetBehavior2.f36816l) - sideSheetBehavior2.f36819o);
        }
    }

    @Override // com.bumptech.glide.g
    public final int k() {
        switch (this.f1237a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f1238b;
                return (-sideSheetBehavior.f36816l) - sideSheetBehavior.f36819o;
            default:
                return this.f1238b.f36817m;
        }
    }

    @Override // com.bumptech.glide.g
    public final int l() {
        switch (this.f1237a) {
            case 0:
                return this.f1238b.f36819o;
            default:
                return this.f1238b.f36817m;
        }
    }

    @Override // com.bumptech.glide.g
    public final int m() {
        switch (this.f1237a) {
            case 0:
                return -this.f1238b.f36816l;
            default:
                return i();
        }
    }

    @Override // com.bumptech.glide.g
    public final int n(View view) {
        switch (this.f1237a) {
            case 0:
                return view.getRight() + this.f1238b.f36819o;
            default:
                return view.getLeft() - this.f1238b.f36819o;
        }
    }

    @Override // com.bumptech.glide.g
    public final int p(CoordinatorLayout coordinatorLayout) {
        switch (this.f1237a) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // com.bumptech.glide.g
    public final int q() {
        switch (this.f1237a) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // com.bumptech.glide.g
    public final boolean s(float f2) {
        switch (this.f1237a) {
            case 0:
                if (f2 > 0.0f) {
                }
                break;
            default:
                if (f2 < 0.0f) {
                }
                break;
        }
        return false;
    }

    @Override // com.bumptech.glide.g
    public final boolean t(View view) {
        switch (this.f1237a) {
            case 0:
                if (view.getRight() < (i() - k()) / 2) {
                }
                break;
            default:
                if (view.getLeft() > (i() + this.f1238b.f36817m) / 2) {
                }
                break;
        }
        return false;
    }

    @Override // com.bumptech.glide.g
    public final boolean u(float f2, float f9) {
        switch (this.f1237a) {
            case 0:
                if (Math.abs(f2) > Math.abs(f9)) {
                    float abs = Math.abs(f2);
                    this.f1238b.getClass();
                    if (abs > 500) {
                    }
                }
                break;
            default:
                if (Math.abs(f2) > Math.abs(f9)) {
                    float abs2 = Math.abs(f2);
                    this.f1238b.getClass();
                    if (abs2 > 500) {
                    }
                }
                break;
        }
        return false;
    }
}
