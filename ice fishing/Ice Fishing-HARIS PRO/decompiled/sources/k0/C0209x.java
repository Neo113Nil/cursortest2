package k0;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: k0.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0209x {

    /* renamed from: a, reason: collision with root package name */
    public int f3614a = -1;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f3615b;

    /* renamed from: c, reason: collision with root package name */
    public K f3616c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3617d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public View f3618f;

    /* renamed from: g, reason: collision with root package name */
    public final V f3619g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3620h;
    public final LinearInterpolator i;
    public final DecelerateInterpolator j;

    /* renamed from: k, reason: collision with root package name */
    public PointF f3621k;

    /* renamed from: l, reason: collision with root package name */
    public final DisplayMetrics f3622l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3623m;

    /* renamed from: n, reason: collision with root package name */
    public float f3624n;

    /* renamed from: o, reason: collision with root package name */
    public int f3625o;

    /* renamed from: p, reason: collision with root package name */
    public int f3626p;

    public C0209x(Context context) {
        V v2 = new V();
        v2.f3419d = -1;
        v2.f3420f = false;
        v2.f3421g = 0;
        v2.f3416a = 0;
        v2.f3417b = 0;
        v2.f3418c = Integer.MIN_VALUE;
        v2.e = null;
        this.f3619g = v2;
        this.i = new LinearInterpolator();
        this.j = new DecelerateInterpolator();
        this.f3623m = false;
        this.f3625o = 0;
        this.f3626p = 0;
        this.f3622l = context.getResources().getDisplayMetrics();
    }

    public static int a(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 != 0) {
            if (i5 == 1) {
                return i4 - i2;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
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
        K k2 = this.f3616c;
        if (k2 == null || !k2.d()) {
            return 0;
        }
        L l2 = (L) view.getLayoutParams();
        return a((view.getLeft() - ((L) view.getLayoutParams()).f3397b.left) - ((ViewGroup.MarginLayoutParams) l2).leftMargin, view.getRight() + ((L) view.getLayoutParams()).f3397b.right + ((ViewGroup.MarginLayoutParams) l2).rightMargin, k2.E(), k2.f3394n - k2.F(), i);
    }

    public int c(View view, int i) {
        K k2 = this.f3616c;
        if (k2 == null || !k2.e()) {
            return 0;
        }
        L l2 = (L) view.getLayoutParams();
        return a((view.getTop() - ((L) view.getLayoutParams()).f3397b.top) - ((ViewGroup.MarginLayoutParams) l2).topMargin, view.getBottom() + ((L) view.getLayoutParams()).f3397b.bottom + ((ViewGroup.MarginLayoutParams) l2).bottomMargin, k2.G(), k2.f3395o - k2.D(), i);
    }

    public float d(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int e(int i) {
        float abs = Math.abs(i);
        if (!this.f3623m) {
            this.f3624n = d(this.f3622l);
            this.f3623m = true;
        }
        return (int) Math.ceil(abs * this.f3624n);
    }

    public PointF f(int i) {
        Object obj = this.f3616c;
        if (obj instanceof W) {
            return ((W) obj).a(i);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + W.class.getCanonicalName());
        return null;
    }

    public final void g(int i, int i2) {
        PointF f2;
        RecyclerView recyclerView = this.f3615b;
        if (this.f3614a == -1 || recyclerView == null) {
            i();
        }
        if (this.f3617d && this.f3618f == null && this.f3616c != null && (f2 = f(this.f3614a)) != null) {
            float f3 = f2.x;
            if (f3 != RecyclerView.f2111C0 || f2.y != RecyclerView.f2111C0) {
                recyclerView.e0((int) Math.signum(f3), (int) Math.signum(f2.y), null);
            }
        }
        this.f3617d = false;
        View view = this.f3618f;
        V v2 = this.f3619g;
        if (view != null) {
            this.f3615b.getClass();
            b0 L2 = RecyclerView.L(view);
            if ((L2 != null ? L2.c() : -1) == this.f3614a) {
                View view2 = this.f3618f;
                X x2 = recyclerView.f2151g0;
                h(view2, v2);
                v2.a(recyclerView);
                i();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f3618f = null;
            }
        }
        if (this.e) {
            X x3 = recyclerView.f2151g0;
            if (this.f3615b.f2162n.v() == 0) {
                i();
            } else {
                int i3 = this.f3625o;
                int i4 = i3 - i;
                if (i3 * i4 <= 0) {
                    i4 = 0;
                }
                this.f3625o = i4;
                int i5 = this.f3626p;
                int i6 = i5 - i2;
                if (i5 * i6 <= 0) {
                    i6 = 0;
                }
                this.f3626p = i6;
                if (i4 == 0 && i6 == 0) {
                    PointF f4 = f(this.f3614a);
                    if (f4 != null) {
                        if (f4.x != RecyclerView.f2111C0 || f4.y != RecyclerView.f2111C0) {
                            float f5 = f4.y;
                            float sqrt = (float) Math.sqrt((f5 * f5) + (r10 * r10));
                            float f6 = f4.x / sqrt;
                            f4.x = f6;
                            float f7 = f4.y / sqrt;
                            f4.y = f7;
                            this.f3621k = f4;
                            this.f3625o = (int) (f6 * 10000.0f);
                            this.f3626p = (int) (f7 * 10000.0f);
                            int e = e(10000);
                            LinearInterpolator linearInterpolator = this.i;
                            v2.f3416a = (int) (this.f3625o * 1.2f);
                            v2.f3417b = (int) (this.f3626p * 1.2f);
                            v2.f3418c = (int) (e * 1.2f);
                            v2.e = linearInterpolator;
                            v2.f3420f = true;
                        }
                    }
                    v2.f3419d = this.f3614a;
                    i();
                }
            }
            boolean z2 = v2.f3419d >= 0;
            v2.a(recyclerView);
            if (z2 && this.e) {
                this.f3617d = true;
                recyclerView.f2146d0.b();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void h(View view, V v2) {
        int i;
        PointF pointF;
        int ceil;
        PointF pointF2 = this.f3621k;
        int i2 = 0;
        if (pointF2 != null) {
            float f2 = pointF2.x;
            if (f2 != RecyclerView.f2111C0) {
                i = f2 > RecyclerView.f2111C0 ? 1 : -1;
                int b2 = b(view, i);
                pointF = this.f3621k;
                if (pointF != null) {
                    float f3 = pointF.y;
                    if (f3 != RecyclerView.f2111C0) {
                        i2 = f3 > RecyclerView.f2111C0 ? 1 : -1;
                    }
                }
                int c2 = c(view, i2);
                ceil = (int) Math.ceil(e((int) Math.sqrt((c2 * c2) + (b2 * b2))) / 0.3356d);
                if (ceil <= 0) {
                    DecelerateInterpolator decelerateInterpolator = this.j;
                    v2.f3416a = -b2;
                    v2.f3417b = -c2;
                    v2.f3418c = ceil;
                    v2.e = decelerateInterpolator;
                    v2.f3420f = true;
                    return;
                }
                return;
            }
        }
        i = 0;
        int b22 = b(view, i);
        pointF = this.f3621k;
        if (pointF != null) {
        }
        int c22 = c(view, i2);
        ceil = (int) Math.ceil(e((int) Math.sqrt((c22 * c22) + (b22 * b22))) / 0.3356d);
        if (ceil <= 0) {
        }
    }

    public final void i() {
        if (this.e) {
            this.e = false;
            this.f3626p = 0;
            this.f3625o = 0;
            this.f3621k = null;
            this.f3615b.f2151g0.f3422a = -1;
            this.f3618f = null;
            this.f3614a = -1;
            this.f3617d = false;
            K k2 = this.f3616c;
            if (k2.e == this) {
                k2.e = null;
            }
            this.f3616c = null;
            this.f3615b = null;
        }
    }
}
