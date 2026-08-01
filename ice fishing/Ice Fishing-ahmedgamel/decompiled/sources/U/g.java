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
import m.C4706p0;

/* loaded from: classes.dex */
public final class g implements View.OnTouchListener {

    /* renamed from: K, reason: collision with root package name */
    public static final int f3109K = ViewConfiguration.getTapTimeout();

    /* renamed from: A, reason: collision with root package name */
    public final int f3110A;

    /* renamed from: B, reason: collision with root package name */
    public final float[] f3111B;

    /* renamed from: C, reason: collision with root package name */
    public final float[] f3112C;

    /* renamed from: D, reason: collision with root package name */
    public final float[] f3113D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f3114E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f3115F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f3116G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f3117H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f3118I;
    public final C4706p0 J;

    /* renamed from: n, reason: collision with root package name */
    public final a f3119n;

    /* renamed from: u, reason: collision with root package name */
    public final AccelerateInterpolator f3120u;

    /* renamed from: v, reason: collision with root package name */
    public final ListView f3121v;

    /* renamed from: w, reason: collision with root package name */
    public G0.c f3122w;

    /* renamed from: x, reason: collision with root package name */
    public final float[] f3123x;

    /* renamed from: y, reason: collision with root package name */
    public final float[] f3124y;

    /* renamed from: z, reason: collision with root package name */
    public final int f3125z;

    public g(C4706p0 c4706p0) {
        a aVar = new a();
        aVar.f3105e = Long.MIN_VALUE;
        aVar.f3107g = -1L;
        aVar.f3106f = 0L;
        this.f3119n = aVar;
        this.f3120u = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f3123x = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f3124y = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f3111B = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f3112C = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f3113D = fArr5;
        this.f3121v = c4706p0;
        float f3 = Resources.getSystem().getDisplayMetrics().density;
        float f9 = ((int) ((1575.0f * f3) + 0.5f)) / 1000.0f;
        fArr5[0] = f9;
        fArr5[1] = f9;
        float f10 = ((int) ((f3 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f10;
        fArr4[1] = f10;
        this.f3125z = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f3110A = f3109K;
        aVar.f3101a = 500;
        aVar.f3102b = 500;
        this.J = c4706p0;
    }

    public static float b(float f3, float f9, float f10) {
        return f3 > f10 ? f10 : f3 < f9 ? f9 : f3;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(int i, float f3, float f9, float f10) {
        float f11;
        float interpolation;
        float b9 = b(this.f3123x[i] * f9, 0.0f, this.f3124y[i]);
        float c9 = c(f9 - f3, b9) - c(f3, b9);
        AccelerateInterpolator accelerateInterpolator = this.f3120u;
        if (c9 < 0.0f) {
            interpolation = -accelerateInterpolator.getInterpolation(-c9);
        } else {
            if (c9 <= 0.0f) {
                f11 = 0.0f;
                if (f11 != 0.0f) {
                    return 0.0f;
                }
                float f12 = this.f3111B[i];
                float f13 = this.f3112C[i];
                float f14 = this.f3113D[i];
                float f15 = f12 * f10;
                return f11 > 0.0f ? b(f11 * f15, f13, f14) : -b((-f11) * f15, f13, f14);
            }
            interpolation = accelerateInterpolator.getInterpolation(c9);
        }
        f11 = b(interpolation, -1.0f, 1.0f);
        if (f11 != 0.0f) {
        }
    }

    public final float c(float f3, float f9) {
        if (f9 != 0.0f) {
            int i = this.f3125z;
            if (i == 0 || i == 1) {
                if (f3 < f9) {
                    if (f3 >= 0.0f) {
                        return 1.0f - (f3 / f9);
                    }
                    if (this.f3117H && i == 1) {
                        return 1.0f;
                    }
                }
            } else if (i == 2 && f3 < 0.0f) {
                return f3 / (-f9);
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i = 0;
        if (this.f3115F) {
            this.f3117H = false;
            return;
        }
        a aVar = this.f3119n;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i6 = (int) (currentAnimationTimeMillis - aVar.f3105e);
        int i9 = aVar.f3102b;
        if (i6 > i9) {
            i = i9;
        } else if (i6 >= 0) {
            i = i6;
        }
        aVar.i = i;
        aVar.f3108h = aVar.a(currentAnimationTimeMillis);
        aVar.f3107g = currentAnimationTimeMillis;
    }

    public final boolean f() {
        C4706p0 c4706p0;
        int count;
        a aVar = this.f3119n;
        float f3 = aVar.f3104d;
        int abs = (int) (f3 / Math.abs(f3));
        Math.abs(aVar.f3103c);
        if (abs != 0 && (count = (c4706p0 = this.J).getCount()) != 0) {
            int childCount = c4706p0.getChildCount();
            int firstVisiblePosition = c4706p0.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (abs <= 0 ? !(abs >= 0 || (firstVisiblePosition <= 0 && c4706p0.getChildAt(0).getTop() >= 0)) : !(i >= count && c4706p0.getChildAt(childCount - 1).getBottom() <= c4706p0.getHeight())) {
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
        if (this.f3118I) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                    }
                }
                d();
                return false;
            }
            this.f3116G = true;
            this.f3114E = false;
            float x9 = motionEvent.getX();
            float width = view.getWidth();
            ListView listView = this.f3121v;
            float a9 = a(0, x9, width, listView.getWidth());
            float a10 = a(1, motionEvent.getY(), view.getHeight(), listView.getHeight());
            a aVar = this.f3119n;
            aVar.f3103c = a9;
            aVar.f3104d = a10;
            if (!this.f3117H && f()) {
                if (this.f3122w == null) {
                    this.f3122w = new G0.c(12, this);
                }
                this.f3117H = true;
                this.f3115F = true;
                if (this.f3114E || (i = this.f3110A) <= 0) {
                    this.f3122w.run();
                } else {
                    G0.c cVar = this.f3122w;
                    long j6 = i;
                    WeakHashMap weakHashMap = X.f2054a;
                    listView.postOnAnimationDelayed(cVar, j6);
                }
                this.f3114E = true;
            }
        }
        return false;
    }
}
