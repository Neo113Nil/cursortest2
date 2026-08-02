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

/* renamed from: t0.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5022r {

    /* renamed from: a, reason: collision with root package name */
    public int f40807a = -1;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f40808b;

    /* renamed from: c, reason: collision with root package name */
    public AbstractC4987C f40809c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f40810d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f40811e;

    /* renamed from: f, reason: collision with root package name */
    public View f40812f;

    /* renamed from: g, reason: collision with root package name */
    public final C4995K f40813g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f40814h;
    public final LinearInterpolator i;

    /* renamed from: j, reason: collision with root package name */
    public final DecelerateInterpolator f40815j;

    /* renamed from: k, reason: collision with root package name */
    public PointF f40816k;

    /* renamed from: l, reason: collision with root package name */
    public final DisplayMetrics f40817l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f40818m;

    /* renamed from: n, reason: collision with root package name */
    public float f40819n;

    /* renamed from: o, reason: collision with root package name */
    public int f40820o;

    /* renamed from: p, reason: collision with root package name */
    public int f40821p;

    public C5022r(Context context) {
        C4995K c4995k = new C4995K();
        c4995k.f40618d = -1;
        c4995k.f40620f = false;
        c4995k.f40621g = 0;
        c4995k.f40615a = 0;
        c4995k.f40616b = 0;
        c4995k.f40617c = Integer.MIN_VALUE;
        c4995k.f40619e = null;
        this.f40813g = c4995k;
        this.i = new LinearInterpolator();
        this.f40815j = new DecelerateInterpolator();
        this.f40818m = false;
        this.f40820o = 0;
        this.f40821p = 0;
        this.f40817l = context.getResources().getDisplayMetrics();
    }

    public static int a(int i, int i4, int i6, int i9, int i10) {
        if (i10 == -1) {
            return i6 - i;
        }
        if (i10 != 0) {
            if (i10 == 1) {
                return i9 - i4;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i11 = i6 - i;
        if (i11 > 0) {
            return i11;
        }
        int i12 = i9 - i4;
        if (i12 < 0) {
            return i12;
        }
        return 0;
    }

    public int b(View view, int i) {
        AbstractC4987C abstractC4987C = this.f40809c;
        if (abstractC4987C == null || !abstractC4987C.d()) {
            return 0;
        }
        C4988D c4988d = (C4988D) view.getLayoutParams();
        return a((view.getLeft() - ((C4988D) view.getLayoutParams()).f40605b.left) - ((ViewGroup.MarginLayoutParams) c4988d).leftMargin, view.getRight() + ((C4988D) view.getLayoutParams()).f40605b.right + ((ViewGroup.MarginLayoutParams) c4988d).rightMargin, abstractC4987C.E(), abstractC4987C.f40602n - abstractC4987C.F(), i);
    }

    public int c(View view, int i) {
        AbstractC4987C abstractC4987C = this.f40809c;
        if (abstractC4987C == null || !abstractC4987C.e()) {
            return 0;
        }
        C4988D c4988d = (C4988D) view.getLayoutParams();
        return a((view.getTop() - ((C4988D) view.getLayoutParams()).f40605b.top) - ((ViewGroup.MarginLayoutParams) c4988d).topMargin, view.getBottom() + ((C4988D) view.getLayoutParams()).f40605b.bottom + ((ViewGroup.MarginLayoutParams) c4988d).bottomMargin, abstractC4987C.G(), abstractC4987C.f40603o - abstractC4987C.D(), i);
    }

    public float d(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int e(int i) {
        float abs = Math.abs(i);
        if (!this.f40818m) {
            this.f40819n = d(this.f40817l);
            this.f40818m = true;
        }
        return (int) Math.ceil(abs * this.f40819n);
    }

    public PointF f(int i) {
        Object obj = this.f40809c;
        if (obj instanceof InterfaceC4996L) {
            return ((InterfaceC4996L) obj).a(i);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + InterfaceC4996L.class.getCanonicalName());
        return null;
    }

    public final void g(int i, int i4) {
        PointF f2;
        RecyclerView recyclerView = this.f40808b;
        if (this.f40807a == -1 || recyclerView == null) {
            i();
        }
        if (this.f40810d && this.f40812f == null && this.f40809c != null && (f2 = f(this.f40807a)) != null) {
            float f9 = f2.x;
            if (f9 != 0.0f || f2.y != 0.0f) {
                recyclerView.X((int) Math.signum(f9), (int) Math.signum(f2.y), null);
            }
        }
        this.f40810d = false;
        View view = this.f40812f;
        C4995K c4995k = this.f40813g;
        if (view != null) {
            this.f40808b.getClass();
            AbstractC5000P I8 = RecyclerView.I(view);
            if ((I8 != null ? I8.b() : -1) == this.f40807a) {
                View view2 = this.f40812f;
                C4997M c4997m = recyclerView.f5184D0;
                h(view2, c4995k);
                c4995k.a(recyclerView);
                i();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f40812f = null;
            }
        }
        if (this.f40811e) {
            C4997M c4997m2 = recyclerView.f5184D0;
            if (this.f40808b.f5185E.v() == 0) {
                i();
            } else {
                int i6 = this.f40820o;
                int i9 = i6 - i;
                if (i6 * i9 <= 0) {
                    i9 = 0;
                }
                this.f40820o = i9;
                int i10 = this.f40821p;
                int i11 = i10 - i4;
                if (i10 * i11 <= 0) {
                    i11 = 0;
                }
                this.f40821p = i11;
                if (i9 == 0 && i11 == 0) {
                    PointF f10 = f(this.f40807a);
                    if (f10 != null) {
                        if (f10.x != 0.0f || f10.y != 0.0f) {
                            float f11 = f10.y;
                            float sqrt = (float) Math.sqrt((f11 * f11) + (r10 * r10));
                            float f12 = f10.x / sqrt;
                            f10.x = f12;
                            float f13 = f10.y / sqrt;
                            f10.y = f13;
                            this.f40816k = f10;
                            this.f40820o = (int) (f12 * 10000.0f);
                            this.f40821p = (int) (f13 * 10000.0f);
                            int e9 = e(10000);
                            LinearInterpolator linearInterpolator = this.i;
                            c4995k.f40615a = (int) (this.f40820o * 1.2f);
                            c4995k.f40616b = (int) (this.f40821p * 1.2f);
                            c4995k.f40617c = (int) (e9 * 1.2f);
                            c4995k.f40619e = linearInterpolator;
                            c4995k.f40620f = true;
                        }
                    }
                    c4995k.f40618d = this.f40807a;
                    i();
                }
            }
            boolean z6 = c4995k.f40618d >= 0;
            c4995k.a(recyclerView);
            if (z6 && this.f40811e) {
                this.f40810d = true;
                recyclerView.f5179A0.a();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void h(View view, C4995K c4995k) {
        int i;
        PointF pointF;
        int ceil;
        PointF pointF2 = this.f40816k;
        int i4 = 0;
        if (pointF2 != null) {
            float f2 = pointF2.x;
            if (f2 != 0.0f) {
                i = f2 > 0.0f ? 1 : -1;
                int b9 = b(view, i);
                pointF = this.f40816k;
                if (pointF != null) {
                    float f9 = pointF.y;
                    if (f9 != 0.0f) {
                        i4 = f9 > 0.0f ? 1 : -1;
                    }
                }
                int c9 = c(view, i4);
                ceil = (int) Math.ceil(e((int) Math.sqrt((c9 * c9) + (b9 * b9))) / 0.3356d);
                if (ceil <= 0) {
                    DecelerateInterpolator decelerateInterpolator = this.f40815j;
                    c4995k.f40615a = -b9;
                    c4995k.f40616b = -c9;
                    c4995k.f40617c = ceil;
                    c4995k.f40619e = decelerateInterpolator;
                    c4995k.f40620f = true;
                    return;
                }
                return;
            }
        }
        i = 0;
        int b92 = b(view, i);
        pointF = this.f40816k;
        if (pointF != null) {
        }
        int c92 = c(view, i4);
        ceil = (int) Math.ceil(e((int) Math.sqrt((c92 * c92) + (b92 * b92))) / 0.3356d);
        if (ceil <= 0) {
        }
    }

    public final void i() {
        if (this.f40811e) {
            this.f40811e = false;
            this.f40821p = 0;
            this.f40820o = 0;
            this.f40816k = null;
            this.f40808b.f5184D0.f40622a = -1;
            this.f40812f = null;
            this.f40807a = -1;
            this.f40810d = false;
            AbstractC4987C abstractC4987C = this.f40809c;
            if (abstractC4987C.f40594e == this) {
                abstractC4987C.f40594e = null;
            }
            this.f40809c = null;
            this.f40808b = null;
        }
    }
}
