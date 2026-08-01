package T0;

import R.j;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes.dex */
public final class a extends j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1148a;

    /* renamed from: b, reason: collision with root package name */
    public final SideSheetBehavior f1149b;

    public /* synthetic */ a(SideSheetBehavior sideSheetBehavior, int i) {
        this.f1148a = i;
        this.f1149b = sideSheetBehavior;
    }

    @Override // R.j
    public final int A() {
        switch (this.f1148a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f1149b;
                return (-sideSheetBehavior.f2572l) - sideSheetBehavior.f2575o;
            default:
                return this.f1149b.f2573m;
        }
    }

    @Override // R.j
    public final int C() {
        switch (this.f1148a) {
            case 0:
                return this.f1149b.f2575o;
            default:
                return this.f1149b.f2573m;
        }
    }

    @Override // R.j
    public final int D() {
        switch (this.f1148a) {
            case 0:
                return -this.f1149b.f2572l;
            default:
                return y();
        }
    }

    @Override // R.j
    public final int F(View view) {
        switch (this.f1148a) {
            case 0:
                return view.getRight() + this.f1149b.f2575o;
            default:
                return view.getLeft() - this.f1149b.f2575o;
        }
    }

    @Override // R.j
    public final int G(CoordinatorLayout coordinatorLayout) {
        switch (this.f1148a) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // R.j
    public final int H() {
        switch (this.f1148a) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // R.j
    public final boolean N(float f2) {
        switch (this.f1148a) {
            case 0:
                if (f2 > RecyclerView.f2111C0) {
                }
                break;
            default:
                if (f2 < RecyclerView.f2111C0) {
                }
                break;
        }
        return false;
    }

    @Override // R.j
    public final boolean O(View view) {
        switch (this.f1148a) {
            case 0:
                if (view.getRight() < (y() - A()) / 2) {
                }
                break;
            default:
                if (view.getLeft() > (y() + this.f1149b.f2573m) / 2) {
                }
                break;
        }
        return false;
    }

    @Override // R.j
    public final boolean P(float f2, float f3) {
        switch (this.f1148a) {
            case 0:
                if (Math.abs(f2) > Math.abs(f3)) {
                    float abs = Math.abs(f2);
                    this.f1149b.getClass();
                    if (abs > 500) {
                    }
                }
                break;
            default:
                if (Math.abs(f2) > Math.abs(f3)) {
                    float abs2 = Math.abs(f2);
                    this.f1149b.getClass();
                    if (abs2 > 500) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // R.j
    public final int i(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f1148a) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // R.j
    public final float j(int i) {
        switch (this.f1148a) {
            case 0:
                float A2 = A();
                return (i - A2) / (y() - A2);
            default:
                float f2 = this.f1149b.f2573m;
                return (f2 - i) / (f2 - y());
        }
    }

    @Override // R.j
    public final boolean p0(View view, float f2) {
        switch (this.f1148a) {
            case 0:
                float left = view.getLeft();
                SideSheetBehavior sideSheetBehavior = this.f1149b;
                float abs = Math.abs((f2 * sideSheetBehavior.f2571k) + left);
                sideSheetBehavior.getClass();
                if (abs > 0.5f) {
                }
                break;
            default:
                float right = view.getRight();
                SideSheetBehavior sideSheetBehavior2 = this.f1149b;
                float abs2 = Math.abs((f2 * sideSheetBehavior2.f2571k) + right);
                sideSheetBehavior2.getClass();
                if (abs2 > 0.5f) {
                }
                break;
        }
        return false;
    }

    @Override // R.j
    public final void s0(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        switch (this.f1148a) {
            case 0:
                marginLayoutParams.leftMargin = i;
                break;
            default:
                marginLayoutParams.rightMargin = i;
                break;
        }
    }

    @Override // R.j
    public final void t0(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        switch (this.f1148a) {
            case 0:
                if (i <= this.f1149b.f2573m) {
                    marginLayoutParams.leftMargin = i2;
                    break;
                }
                break;
            default:
                int i3 = this.f1149b.f2573m;
                if (i <= i3) {
                    marginLayoutParams.rightMargin = i3 - i;
                    break;
                }
                break;
        }
    }

    @Override // R.j
    public final int u(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f1148a) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // R.j
    public final int y() {
        switch (this.f1148a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f1149b;
                return Math.max(0, sideSheetBehavior.f2574n + sideSheetBehavior.f2575o);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.f1149b;
                return Math.max(0, (sideSheetBehavior2.f2573m - sideSheetBehavior2.f2572l) - sideSheetBehavior2.f2575o);
        }
    }
}
