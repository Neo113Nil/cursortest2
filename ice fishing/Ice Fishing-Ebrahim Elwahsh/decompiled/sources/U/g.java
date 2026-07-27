package U;

import F3.C;
import O.X;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import java.util.WeakHashMap;
import m.C4754p0;

/* loaded from: classes.dex */
public final class g implements View.OnTouchListener {

    /* renamed from: K, reason: collision with root package name */
    public static final int f3188K = ViewConfiguration.getTapTimeout();

    /* renamed from: A, reason: collision with root package name */
    public final int f3189A;

    /* renamed from: B, reason: collision with root package name */
    public final float[] f3190B;

    /* renamed from: C, reason: collision with root package name */
    public final float[] f3191C;

    /* renamed from: D, reason: collision with root package name */
    public final float[] f3192D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f3193E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f3194F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f3195G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f3196H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f3197I;
    public final C4754p0 J;

    /* renamed from: n, reason: collision with root package name */
    public final a f3198n;

    /* renamed from: u, reason: collision with root package name */
    public final AccelerateInterpolator f3199u;

    /* renamed from: v, reason: collision with root package name */
    public final ListView f3200v;

    /* renamed from: w, reason: collision with root package name */
    public C f3201w;

    /* renamed from: x, reason: collision with root package name */
    public final float[] f3202x;

    /* renamed from: y, reason: collision with root package name */
    public final float[] f3203y;

    /* renamed from: z, reason: collision with root package name */
    public final int f3204z;

    public g(C4754p0 c4754p0) {
        a aVar = new a();
        aVar.f3184e = Long.MIN_VALUE;
        aVar.f3186g = -1L;
        aVar.f3185f = 0L;
        this.f3198n = aVar;
        this.f3199u = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f3202x = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f3203y = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f3190B = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f3191C = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f3192D = fArr5;
        this.f3200v = c4754p0;
        float f6 = Resources.getSystem().getDisplayMetrics().density;
        float f9 = ((int) ((1575.0f * f6) + 0.5f)) / 1000.0f;
        fArr5[0] = f9;
        fArr5[1] = f9;
        float f10 = ((int) ((f6 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f10;
        fArr4[1] = f10;
        this.f3204z = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f3189A = f3188K;
        aVar.f3180a = 500;
        aVar.f3181b = 500;
        this.J = c4754p0;
    }

    public static float b(float f6, float f9, float f10) {
        return f6 > f10 ? f10 : f6 < f9 ? f9 : f6;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(int i, float f6, float f9, float f10) {
        float f11;
        float interpolation;
        float b9 = b(this.f3202x[i] * f9, 0.0f, this.f3203y[i]);
        float c4 = c(f9 - f6, b9) - c(f6, b9);
        AccelerateInterpolator accelerateInterpolator = this.f3199u;
        if (c4 < 0.0f) {
            interpolation = -accelerateInterpolator.getInterpolation(-c4);
        } else {
            if (c4 <= 0.0f) {
                f11 = 0.0f;
                if (f11 != 0.0f) {
                    return 0.0f;
                }
                float f12 = this.f3190B[i];
                float f13 = this.f3191C[i];
                float f14 = this.f3192D[i];
                float f15 = f12 * f10;
                return f11 > 0.0f ? b(f11 * f15, f13, f14) : -b((-f11) * f15, f13, f14);
            }
            interpolation = accelerateInterpolator.getInterpolation(c4);
        }
        f11 = b(interpolation, -1.0f, 1.0f);
        if (f11 != 0.0f) {
        }
    }

    public final float c(float f6, float f9) {
        if (f9 != 0.0f) {
            int i = this.f3204z;
            if (i == 0 || i == 1) {
                if (f6 < f9) {
                    if (f6 >= 0.0f) {
                        return 1.0f - (f6 / f9);
                    }
                    if (this.f3196H && i == 1) {
                        return 1.0f;
                    }
                }
            } else if (i == 2 && f6 < 0.0f) {
                return f6 / (-f9);
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i = 0;
        if (this.f3194F) {
            this.f3196H = false;
            return;
        }
        a aVar = this.f3198n;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i4 = (int) (currentAnimationTimeMillis - aVar.f3184e);
        int i9 = aVar.f3181b;
        if (i4 > i9) {
            i = i9;
        } else if (i4 >= 0) {
            i = i4;
        }
        aVar.i = i;
        aVar.f3187h = aVar.a(currentAnimationTimeMillis);
        aVar.f3186g = currentAnimationTimeMillis;
    }

    public final boolean f() {
        C4754p0 c4754p0;
        int count;
        a aVar = this.f3198n;
        float f6 = aVar.f3183d;
        int abs = (int) (f6 / Math.abs(f6));
        Math.abs(aVar.f3182c);
        if (abs != 0 && (count = (c4754p0 = this.J).getCount()) != 0) {
            int childCount = c4754p0.getChildCount();
            int firstVisiblePosition = c4754p0.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (abs <= 0 ? !(abs >= 0 || (firstVisiblePosition <= 0 && c4754p0.getChildAt(0).getTop() >= 0)) : !(i >= count && c4754p0.getChildAt(childCount - 1).getBottom() <= c4754p0.getHeight())) {
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
        if (this.f3197I) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                    }
                }
                d();
                return false;
            }
            this.f3195G = true;
            this.f3193E = false;
            float x3 = motionEvent.getX();
            float width = view.getWidth();
            ListView listView = this.f3200v;
            float a9 = a(0, x3, width, listView.getWidth());
            float a10 = a(1, motionEvent.getY(), view.getHeight(), listView.getHeight());
            a aVar = this.f3198n;
            aVar.f3182c = a9;
            aVar.f3183d = a10;
            if (!this.f3196H && f()) {
                if (this.f3201w == null) {
                    this.f3201w = new C(9, this);
                }
                this.f3196H = true;
                this.f3194F = true;
                if (this.f3193E || (i = this.f3189A) <= 0) {
                    this.f3201w.run();
                } else {
                    C c4 = this.f3201w;
                    long j9 = i;
                    WeakHashMap weakHashMap = X.f2240a;
                    listView.postOnAnimationDelayed(c4, j9);
                }
                this.f3193E = true;
            }
        }
        return false;
    }
}
