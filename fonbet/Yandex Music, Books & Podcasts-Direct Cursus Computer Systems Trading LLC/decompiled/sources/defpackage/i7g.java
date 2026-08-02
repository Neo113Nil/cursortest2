package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class i7g {
    public int a = -1;
    public RecyclerView b;
    public yon c;
    public boolean d;
    public boolean e;
    public View f;
    public final us2 g;
    public boolean h;
    public final LinearInterpolator i;
    public final DecelerateInterpolator j;
    public PointF k;
    public final DisplayMetrics l;
    public boolean m;
    public float n;
    public int o;
    public int p;

    public i7g(Context context) {
        us2 us2Var = new us2(1);
        us2Var.e = -1;
        us2Var.f = false;
        us2Var.g = 0;
        us2Var.b = 0;
        us2Var.c = 0;
        us2Var.d = Integer.MIN_VALUE;
        us2Var.h = null;
        this.g = us2Var;
        this.i = new LinearInterpolator();
        this.j = new DecelerateInterpolator();
        this.m = false;
        this.o = 0;
        this.p = 0;
        this.l = context.getResources().getDisplayMetrics();
    }

    public int a(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 != 0) {
            if (i5 == 1) {
                return i4 - i2;
            }
            xq0.x("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            return 0;
        }
        int i6 = i3 - i;
        if (i6 > 0) {
            return i6;
        }
        int i7 = i4 - i2;
        if (i7 < 0) {
            return i7;
        }
        return 0;
    }

    public int b(View view, int i) {
        yon yonVar = this.c;
        if (yonVar == null || !yonVar.x()) {
            return 0;
        }
        zon zonVar = (zon) view.getLayoutParams();
        return a(yon.V(view) - ((ViewGroup.MarginLayoutParams) zonVar).leftMargin, yon.Y(view) + ((ViewGroup.MarginLayoutParams) zonVar).rightMargin, yonVar.c0(), yonVar.n - yonVar.d0(), i);
    }

    public int c(View view, int i) {
        yon yonVar = this.c;
        if (yonVar == null || !yonVar.y()) {
            return 0;
        }
        zon zonVar = (zon) view.getLayoutParams();
        return a(yon.Z(view) - ((ViewGroup.MarginLayoutParams) zonVar).topMargin, yon.T(view) + ((ViewGroup.MarginLayoutParams) zonVar).bottomMargin, yonVar.e0(), yonVar.o - yonVar.b0(), i);
    }

    public float d(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int e(int i) {
        float abs = Math.abs(i);
        if (!this.m) {
            this.n = d(this.l);
            this.m = true;
        }
        return (int) Math.ceil(abs * this.n);
    }

    public PointF f(int i) {
        Object obj = this.c;
        if (obj instanceof jpn) {
            return ((jpn) obj).c(i);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + jpn.class.getCanonicalName());
        return null;
    }

    public int g() {
        PointF pointF = this.k;
        if (pointF == null) {
            return 0;
        }
        float f = pointF.x;
        if (f == 0.0f) {
            return 0;
        }
        return f > 0.0f ? 1 : -1;
    }

    public int h() {
        PointF pointF = this.k;
        if (pointF == null) {
            return 0;
        }
        float f = pointF.y;
        if (f == 0.0f) {
            return 0;
        }
        return f > 0.0f ? 1 : -1;
    }

    public final void i(int i, int i2) {
        PointF f;
        RecyclerView recyclerView = this.b;
        if (this.a == -1 || recyclerView == null) {
            k();
        }
        if (this.d && this.f == null && this.c != null && (f = f(this.a)) != null) {
            float f2 = f.x;
            if (f2 != 0.0f || f.y != 0.0f) {
                recyclerView.y0((int) Math.signum(f2), (int) Math.signum(f.y), null);
            }
        }
        this.d = false;
        View view = this.f;
        us2 us2Var = this.g;
        if (view != null) {
            this.b.getClass();
            if (RecyclerView.Z(view) == this.a) {
                View view2 = this.f;
                kpn kpnVar = recyclerView.N0;
                j(view2, us2Var);
                us2Var.a(recyclerView);
                k();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f = null;
            }
        }
        if (this.e) {
            kpn kpnVar2 = recyclerView.N0;
            if (this.b.n.Q() == 0) {
                k();
            } else {
                int i3 = this.o;
                int i4 = i3 - i;
                if (i3 * i4 <= 0) {
                    i4 = 0;
                }
                this.o = i4;
                int i5 = this.p;
                int i6 = i5 - i2;
                if (i5 * i6 <= 0) {
                    i6 = 0;
                }
                this.p = i6;
                if (i4 == 0 && i6 == 0) {
                    PointF f3 = f(this.a);
                    if (f3 != null) {
                        if (f3.x != 0.0f || f3.y != 0.0f) {
                            float f4 = f3.y;
                            float sqrt = (float) Math.sqrt((f4 * f4) + (r9 * r9));
                            float f5 = f3.x / sqrt;
                            f3.x = f5;
                            float f6 = f3.y / sqrt;
                            f3.y = f6;
                            this.k = f3;
                            this.o = (int) (f5 * 10000.0f);
                            this.p = (int) (f6 * 10000.0f);
                            int e = e(10000);
                            us2Var.b = (int) (this.o * 1.2f);
                            us2Var.c = (int) (this.p * 1.2f);
                            us2Var.d = (int) (e * 1.2f);
                            us2Var.h = this.i;
                            us2Var.f = true;
                        }
                    }
                    us2Var.e = this.a;
                    k();
                }
            }
            boolean z = us2Var.e >= 0;
            us2Var.a(recyclerView);
            if (z && this.e) {
                this.d = true;
                recyclerView.K0.b();
            }
        }
    }

    public void j(View view, us2 us2Var) {
        int b = b(view, g());
        int c = c(view, h());
        int ceil = (int) Math.ceil(e((int) Math.sqrt((c * c) + (b * b))) / 0.3356d);
        if (ceil > 0) {
            us2Var.b = -b;
            us2Var.c = -c;
            us2Var.d = ceil;
            us2Var.h = this.j;
            us2Var.f = true;
        }
    }

    public final void k() {
        if (this.e) {
            this.e = false;
            this.p = 0;
            this.o = 0;
            this.k = null;
            this.b.N0.a = -1;
            this.f = null;
            this.a = -1;
            this.d = false;
            yon yonVar = this.c;
            if (yonVar.e == this) {
                yonVar.e = null;
            }
            this.c = null;
            this.b = null;
        }
    }
}
