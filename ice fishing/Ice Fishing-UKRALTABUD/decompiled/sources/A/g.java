package A;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import h.AbstractC0150A;
import java.lang.reflect.Field;
import w.x;

/* loaded from: classes.dex */
public final class g implements View.OnTouchListener {
    public static final int r = ViewConfiguration.getTapTimeout();

    /* renamed from: a, reason: collision with root package name */
    public final a f12a;

    /* renamed from: b, reason: collision with root package name */
    public final AccelerateInterpolator f13b;

    /* renamed from: c, reason: collision with root package name */
    public final ListView f14c;

    /* renamed from: d, reason: collision with root package name */
    public b f15d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f16e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f17f;

    /* renamed from: g, reason: collision with root package name */
    public final int f18g;

    /* renamed from: h, reason: collision with root package name */
    public final int f19h;

    /* renamed from: i, reason: collision with root package name */
    public final float[] f20i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f21j;

    /* renamed from: k, reason: collision with root package name */
    public final float[] f22k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f23l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f24m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f25n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f26o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f27p;

    /* renamed from: q, reason: collision with root package name */
    public final AbstractC0150A f28q;

    public g(AbstractC0150A abstractC0150A) {
        a aVar = new a();
        aVar.f4e = Long.MIN_VALUE;
        aVar.f6g = -1L;
        aVar.f5f = 0L;
        this.f12a = aVar;
        this.f13b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f16e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f17f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f20i = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f21j = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f22k = fArr5;
        this.f14c = abstractC0150A;
        float f2 = Resources.getSystem().getDisplayMetrics().density;
        float f3 = ((int) ((1575.0f * f2) + 0.5f)) / 1000.0f;
        fArr5[0] = f3;
        fArr5[1] = f3;
        float f4 = ((int) ((f2 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f4;
        fArr4[1] = f4;
        this.f18g = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f19h = r;
        aVar.f0a = 500;
        aVar.f1b = 500;
        this.f28q = abstractC0150A;
    }

    public static float b(float f2, float f3, float f4) {
        return f2 > f4 ? f4 : f2 < f3 ? f3 : f2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(int i2, float f2, float f3, float f4) {
        float f5;
        float interpolation;
        float b2 = b(this.f16e[i2] * f3, 0.0f, this.f17f[i2]);
        float c2 = c(f3 - f2, b2) - c(f2, b2);
        AccelerateInterpolator accelerateInterpolator = this.f13b;
        if (c2 < 0.0f) {
            interpolation = -accelerateInterpolator.getInterpolation(-c2);
        } else {
            if (c2 <= 0.0f) {
                f5 = 0.0f;
                if (f5 != 0.0f) {
                    return 0.0f;
                }
                float f6 = this.f20i[i2];
                float f7 = this.f21j[i2];
                float f8 = this.f22k[i2];
                float f9 = f6 * f4;
                return f5 > 0.0f ? b(f5 * f9, f7, f8) : -b((-f5) * f9, f7, f8);
            }
            interpolation = accelerateInterpolator.getInterpolation(c2);
        }
        f5 = b(interpolation, -1.0f, 1.0f);
        if (f5 != 0.0f) {
        }
    }

    public final float c(float f2, float f3) {
        if (f3 == 0.0f) {
            return 0.0f;
        }
        int i2 = this.f18g;
        if (i2 == 0 || i2 == 1) {
            if (f2 < f3) {
                if (f2 >= 0.0f) {
                    return 1.0f - (f2 / f3);
                }
                if (this.f26o && i2 == 1) {
                    return 1.0f;
                }
            }
        } else if (i2 == 2 && f2 < 0.0f) {
            return f2 / (-f3);
        }
        return 0.0f;
    }

    public final void d() {
        int i2 = 0;
        if (this.f24m) {
            this.f26o = false;
            return;
        }
        a aVar = this.f12a;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i3 = (int) (currentAnimationTimeMillis - aVar.f4e);
        int i4 = aVar.f1b;
        if (i3 > i4) {
            i2 = i4;
        } else if (i3 >= 0) {
            i2 = i3;
        }
        aVar.f8i = i2;
        aVar.f7h = aVar.a(currentAnimationTimeMillis);
        aVar.f6g = currentAnimationTimeMillis;
    }

    public final boolean e() {
        AbstractC0150A abstractC0150A;
        int count;
        a aVar = this.f12a;
        float f2 = aVar.f3d;
        int abs = (int) (f2 / Math.abs(f2));
        Math.abs(aVar.f2c);
        if (abs == 0 || (count = (abstractC0150A = this.f28q).getCount()) == 0) {
            return false;
        }
        int childCount = abstractC0150A.getChildCount();
        int firstVisiblePosition = abstractC0150A.getFirstVisiblePosition();
        int i2 = firstVisiblePosition + childCount;
        if (abs > 0) {
            if (i2 >= count && abstractC0150A.getChildAt(childCount - 1).getBottom() <= abstractC0150A.getHeight()) {
                return false;
            }
        } else {
            if (abs >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && abstractC0150A.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
    
        if (r0 != 3) goto L29;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i2;
        int i3 = 0;
        if (!this.f27p) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                }
            }
            d();
            return false;
        }
        this.f25n = true;
        this.f23l = false;
        float x2 = motionEvent.getX();
        float width = view.getWidth();
        ListView listView = this.f14c;
        float a2 = a(0, x2, width, listView.getWidth());
        float a3 = a(1, motionEvent.getY(), view.getHeight(), listView.getHeight());
        a aVar = this.f12a;
        aVar.f2c = a2;
        aVar.f3d = a3;
        if (!this.f26o && e()) {
            if (this.f15d == null) {
                this.f15d = new b(i3, this);
            }
            this.f26o = true;
            this.f24m = true;
            if (this.f23l || (i2 = this.f19h) <= 0) {
                this.f15d.run();
            } else {
                b bVar = this.f15d;
                long j2 = i2;
                Field field = x.f3069a;
                listView.postOnAnimationDelayed(bVar, j2);
            }
            this.f23l = true;
        }
        return false;
    }
}
