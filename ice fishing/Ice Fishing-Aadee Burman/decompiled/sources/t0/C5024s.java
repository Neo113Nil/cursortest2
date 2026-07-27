package t0;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: t0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5024s {

    /* renamed from: a, reason: collision with root package name */
    public int f40757a = -1;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f40758b;

    /* renamed from: c, reason: collision with root package name */
    public AbstractC4990E f40759c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f40760d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f40761e;

    /* renamed from: f, reason: collision with root package name */
    public View f40762f;

    /* renamed from: g, reason: collision with root package name */
    public final C4998M f40763g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f40764h;
    public final LinearInterpolator i;

    /* renamed from: j, reason: collision with root package name */
    public final DecelerateInterpolator f40765j;

    /* renamed from: k, reason: collision with root package name */
    public PointF f40766k;

    /* renamed from: l, reason: collision with root package name */
    public final DisplayMetrics f40767l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f40768m;

    /* renamed from: n, reason: collision with root package name */
    public float f40769n;

    /* renamed from: o, reason: collision with root package name */
    public int f40770o;

    /* renamed from: p, reason: collision with root package name */
    public int f40771p;

    public C5024s(Context context) {
        C4998M c4998m = new C4998M();
        c4998m.f40565d = -1;
        c4998m.f40567f = false;
        c4998m.f40568g = 0;
        c4998m.f40562a = 0;
        c4998m.f40563b = 0;
        c4998m.f40564c = Integer.MIN_VALUE;
        c4998m.f40566e = null;
        this.f40763g = c4998m;
        this.i = new LinearInterpolator();
        this.f40765j = new DecelerateInterpolator();
        this.f40768m = false;
        this.f40770o = 0;
        this.f40771p = 0;
        this.f40767l = context.getResources().getDisplayMetrics();
    }

    public static int a(int i, int i6, int i9, int i10, int i11) {
        if (i11 == -1) {
            return i9 - i;
        }
        if (i11 != 0) {
            if (i11 == 1) {
                return i10 - i6;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i12 = i9 - i;
        if (i12 > 0) {
            return i12;
        }
        int i13 = i10 - i6;
        if (i13 < 0) {
            return i13;
        }
        return 0;
    }

    public int b(View view, int i) {
        AbstractC4990E abstractC4990E = this.f40759c;
        if (abstractC4990E == null || !abstractC4990E.d()) {
            return 0;
        }
        C4991F c4991f = (C4991F) view.getLayoutParams();
        return a((view.getLeft() - ((C4991F) view.getLayoutParams()).f40552b.left) - ((ViewGroup.MarginLayoutParams) c4991f).leftMargin, view.getRight() + ((C4991F) view.getLayoutParams()).f40552b.right + ((ViewGroup.MarginLayoutParams) c4991f).rightMargin, abstractC4990E.E(), abstractC4990E.f40549n - abstractC4990E.F(), i);
    }

    public int c(View view, int i) {
        AbstractC4990E abstractC4990E = this.f40759c;
        if (abstractC4990E == null || !abstractC4990E.e()) {
            return 0;
        }
        C4991F c4991f = (C4991F) view.getLayoutParams();
        return a((view.getTop() - ((C4991F) view.getLayoutParams()).f40552b.top) - ((ViewGroup.MarginLayoutParams) c4991f).topMargin, view.getBottom() + ((C4991F) view.getLayoutParams()).f40552b.bottom + ((ViewGroup.MarginLayoutParams) c4991f).bottomMargin, abstractC4990E.G(), abstractC4990E.f40550o - abstractC4990E.D(), i);
    }

    public float d(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int e(int i) {
        float abs = Math.abs(i);
        if (!this.f40768m) {
            this.f40769n = d(this.f40767l);
            this.f40768m = true;
        }
        return (int) Math.ceil(abs * this.f40769n);
    }

    public PointF f(int i) {
        Object obj = this.f40759c;
        if (obj instanceof InterfaceC4999N) {
            return ((InterfaceC4999N) obj).a(i);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + InterfaceC4999N.class.getCanonicalName());
        return null;
    }

    public final void g(int i, int i6) {
        PointF f3;
        RecyclerView recyclerView = this.f40758b;
        if (this.f40757a == -1 || recyclerView == null) {
            i();
        }
        if (this.f40760d && this.f40762f == null && this.f40759c != null && (f3 = f(this.f40757a)) != null) {
            float f9 = f3.x;
            if (f9 != 0.0f || f3.y != 0.0f) {
                recyclerView.X((int) Math.signum(f9), (int) Math.signum(f3.y), null);
            }
        }
        this.f40760d = false;
        View view = this.f40762f;
        C4998M c4998m = this.f40763g;
        if (view != null) {
            this.f40758b.getClass();
            AbstractC5003S I8 = RecyclerView.I(view);
            if ((I8 != null ? I8.b() : -1) == this.f40757a) {
                View view2 = this.f40762f;
                C5000O c5000o = recyclerView.f5227I0;
                h(view2, c4998m);
                c4998m.a(recyclerView);
                i();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f40762f = null;
            }
        }
        if (this.f40761e) {
            C5000O c5000o2 = recyclerView.f5227I0;
            if (this.f40758b.f5218E.v() == 0) {
                i();
            } else {
                int i9 = this.f40770o;
                int i10 = i9 - i;
                if (i9 * i10 <= 0) {
                    i10 = 0;
                }
                this.f40770o = i10;
                int i11 = this.f40771p;
                int i12 = i11 - i6;
                if (i11 * i12 <= 0) {
                    i12 = 0;
                }
                this.f40771p = i12;
                if (i10 == 0 && i12 == 0) {
                    PointF f10 = f(this.f40757a);
                    if (f10 != null) {
                        if (f10.x != 0.0f || f10.y != 0.0f) {
                            float f11 = f10.y;
                            float sqrt = (float) Math.sqrt((f11 * f11) + (r10 * r10));
                            float f12 = f10.x / sqrt;
                            f10.x = f12;
                            float f13 = f10.y / sqrt;
                            f10.y = f13;
                            this.f40766k = f10;
                            this.f40770o = (int) (f12 * 10000.0f);
                            this.f40771p = (int) (f13 * 10000.0f);
                            int e9 = e(10000);
                            LinearInterpolator linearInterpolator = this.i;
                            c4998m.f40562a = (int) (this.f40770o * 1.2f);
                            c4998m.f40563b = (int) (this.f40771p * 1.2f);
                            c4998m.f40564c = (int) (e9 * 1.2f);
                            c4998m.f40566e = linearInterpolator;
                            c4998m.f40567f = true;
                        }
                    }
                    c4998m.f40565d = this.f40757a;
                    i();
                }
            }
            boolean z3 = c4998m.f40565d >= 0;
            c4998m.a(recyclerView);
            if (z3 && this.f40761e) {
                this.f40760d = true;
                recyclerView.f5221F0.a();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void h(View view, C4998M c4998m) {
        int i;
        PointF pointF;
        int ceil;
        PointF pointF2 = this.f40766k;
        int i6 = 0;
        if (pointF2 != null) {
            float f3 = pointF2.x;
            if (f3 != 0.0f) {
                i = f3 > 0.0f ? 1 : -1;
                int b9 = b(view, i);
                pointF = this.f40766k;
                if (pointF != null) {
                    float f9 = pointF.y;
                    if (f9 != 0.0f) {
                        i6 = f9 > 0.0f ? 1 : -1;
                    }
                }
                int c9 = c(view, i6);
                ceil = (int) Math.ceil(e((int) Math.sqrt((c9 * c9) + (b9 * b9))) / 0.3356d);
                if (ceil <= 0) {
                    DecelerateInterpolator decelerateInterpolator = this.f40765j;
                    c4998m.f40562a = -b9;
                    c4998m.f40563b = -c9;
                    c4998m.f40564c = ceil;
                    c4998m.f40566e = decelerateInterpolator;
                    c4998m.f40567f = true;
                    return;
                }
                return;
            }
        }
        i = 0;
        int b92 = b(view, i);
        pointF = this.f40766k;
        if (pointF != null) {
        }
        int c92 = c(view, i6);
        ceil = (int) Math.ceil(e((int) Math.sqrt((c92 * c92) + (b92 * b92))) / 0.3356d);
        if (ceil <= 0) {
        }
    }

    public final void i() {
        if (this.f40761e) {
            this.f40761e = false;
            this.f40771p = 0;
            this.f40770o = 0;
            this.f40766k = null;
            this.f40758b.f5227I0.f40569a = -1;
            this.f40762f = null;
            this.f40757a = -1;
            this.f40760d = false;
            AbstractC4990E abstractC4990E = this.f40759c;
            if (abstractC4990E.f40541e == this) {
                abstractC4990E.f40541e = null;
            }
            this.f40759c = null;
            this.f40758b = null;
        }
    }
}
