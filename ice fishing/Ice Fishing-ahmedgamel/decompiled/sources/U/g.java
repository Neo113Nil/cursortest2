package U;

import O.X;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import java.util.WeakHashMap;
import m.C4719p0;

/* loaded from: classes.dex */
public final class g implements View.OnTouchListener {

    /* renamed from: K, reason: collision with root package name */
    public static final int f3226K = ViewConfiguration.getTapTimeout();

    /* renamed from: A, reason: collision with root package name */
    public final int f3227A;

    /* renamed from: B, reason: collision with root package name */
    public final float[] f3228B;

    /* renamed from: C, reason: collision with root package name */
    public final float[] f3229C;

    /* renamed from: D, reason: collision with root package name */
    public final float[] f3230D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f3231E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f3232F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f3233G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f3234H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f3235I;
    public final C4719p0 J;

    /* renamed from: n, reason: collision with root package name */
    public final a f3236n;

    /* renamed from: u, reason: collision with root package name */
    public final AccelerateInterpolator f3237u;

    /* renamed from: v, reason: collision with root package name */
    public final ListView f3238v;

    /* renamed from: w, reason: collision with root package name */
    public G0.c f3239w;

    /* renamed from: x, reason: collision with root package name */
    public final float[] f3240x;

    /* renamed from: y, reason: collision with root package name */
    public final float[] f3241y;

    /* renamed from: z, reason: collision with root package name */
    public final int f3242z;

    public g(C4719p0 c4719p0) {
        a aVar = new a();
        aVar.f3222e = Long.MIN_VALUE;
        aVar.f3224g = -1L;
        aVar.f3223f = 0L;
        this.f3236n = aVar;
        this.f3237u = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f3240x = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f3241y = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f3228B = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f3229C = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f3230D = fArr5;
        this.f3238v = c4719p0;
        float f2 = Resources.getSystem().getDisplayMetrics().density;
        float f9 = ((int) ((1575.0f * f2) + 0.5f)) / 1000.0f;
        fArr5[0] = f9;
        fArr5[1] = f9;
        float f10 = ((int) ((f2 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f10;
        fArr4[1] = f10;
        this.f3242z = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f3227A = f3226K;
        aVar.f3218a = 500;
        aVar.f3219b = 500;
        this.J = c4719p0;
    }

    public static float b(float f2, float f9, float f10) {
        return f2 > f10 ? f10 : f2 < f9 ? f9 : f2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(int i, float f2, float f9, float f10) {
        float f11;
        float interpolation;
        float b9 = b(this.f3240x[i] * f9, 0.0f, this.f3241y[i]);
        float c9 = c(f9 - f2, b9) - c(f2, b9);
        AccelerateInterpolator accelerateInterpolator = this.f3237u;
        if (c9 < 0.0f) {
            interpolation = -accelerateInterpolator.getInterpolation(-c9);
        } else {
            if (c9 <= 0.0f) {
                f11 = 0.0f;
                if (f11 != 0.0f) {
                    return 0.0f;
                }
                float f12 = this.f3228B[i];
                float f13 = this.f3229C[i];
                float f14 = this.f3230D[i];
                float f15 = f12 * f10;
                return f11 > 0.0f ? b(f11 * f15, f13, f14) : -b((-f11) * f15, f13, f14);
            }
            interpolation = accelerateInterpolator.getInterpolation(c9);
        }
        f11 = b(interpolation, -1.0f, 1.0f);
        if (f11 != 0.0f) {
        }
    }

    public final float c(float f2, float f9) {
        if (f9 != 0.0f) {
            int i = this.f3242z;
            if (i == 0 || i == 1) {
                if (f2 < f9) {
                    if (f2 >= 0.0f) {
                        return 1.0f - (f2 / f9);
                    }
                    if (this.f3234H && i == 1) {
                        return 1.0f;
                    }
                }
            } else if (i == 2 && f2 < 0.0f) {
                return f2 / (-f9);
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i = 0;
        if (this.f3232F) {
            this.f3234H = false;
            return;
        }
        a aVar = this.f3236n;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i4 = (int) (currentAnimationTimeMillis - aVar.f3222e);
        int i6 = aVar.f3219b;
        if (i4 > i6) {
            i = i6;
        } else if (i4 >= 0) {
            i = i4;
        }
        aVar.i = i;
        aVar.f3225h = aVar.a(currentAnimationTimeMillis);
        aVar.f3224g = currentAnimationTimeMillis;
    }

    public final boolean f() {
        C4719p0 c4719p0;
        int count;
        a aVar = this.f3236n;
        float f2 = aVar.f3221d;
        int abs = (int) (f2 / Math.abs(f2));
        Math.abs(aVar.f3220c);
        if (abs != 0 && (count = (c4719p0 = this.J).getCount()) != 0) {
            int childCount = c4719p0.getChildCount();
            int firstVisiblePosition = c4719p0.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (abs <= 0 ? !(abs >= 0 || (firstVisiblePosition <= 0 && c4719p0.getChildAt(0).getTop() >= 0)) : !(i >= count && c4719p0.getChildAt(childCount - 1).getBottom() <= c4719p0.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0014, code lost:
    
        if (r0 != 3) goto L30;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        if (this.f3235I) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                    }
                }
                d();
                return false;
            }
            this.f3233G = true;
            this.f3231E = false;
            float x9 = motionEvent.getX();
            float width = view.getWidth();
            ListView listView = this.f3238v;
            float a9 = a(0, x9, width, listView.getWidth());
            float a10 = a(1, motionEvent.getY(), view.getHeight(), listView.getHeight());
            a aVar = this.f3236n;
            aVar.f3220c = a9;
            aVar.f3221d = a10;
            if (!this.f3234H && f()) {
                if (this.f3239w == null) {
                    this.f3239w = new G0.c(12, this);
                }
                this.f3234H = true;
                this.f3232F = true;
                if (this.f3231E || (i = this.f3227A) <= 0) {
                    this.f3239w.run();
                } else {
                    G0.c cVar = this.f3239w;
                    long j6 = i;
                    WeakHashMap weakHashMap = X.f2142a;
                    listView.postOnAnimationDelayed(cVar, j6);
                }
                this.f3231E = true;
            }
        }
        return false;
    }
}
