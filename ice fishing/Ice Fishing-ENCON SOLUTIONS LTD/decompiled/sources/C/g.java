package C;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import h.AbstractC0229z;
import java.lang.reflect.Field;
import y.x;

/* loaded from: classes.dex */
public final class g implements View.OnTouchListener {

    /* renamed from: r, reason: collision with root package name */
    public static final int f105r = ViewConfiguration.getTapTimeout();

    /* renamed from: a, reason: collision with root package name */
    public final a f106a;

    /* renamed from: b, reason: collision with root package name */
    public final AccelerateInterpolator f107b;

    /* renamed from: c, reason: collision with root package name */
    public final ListView f108c;

    /* renamed from: d, reason: collision with root package name */
    public b f109d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f110e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f111f;

    /* renamed from: g, reason: collision with root package name */
    public final int f112g;

    /* renamed from: h, reason: collision with root package name */
    public final int f113h;

    /* renamed from: i, reason: collision with root package name */
    public final float[] f114i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f115j;

    /* renamed from: k, reason: collision with root package name */
    public final float[] f116k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f117l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f118m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f119n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f120o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f121p;

    /* renamed from: q, reason: collision with root package name */
    public final AbstractC0229z f122q;

    public g(AbstractC0229z abstractC0229z) {
        a aVar = new a();
        aVar.f97e = Long.MIN_VALUE;
        aVar.f99g = -1L;
        aVar.f98f = 0L;
        this.f106a = aVar;
        this.f107b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f110e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f111f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f114i = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f115j = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f116k = fArr5;
        this.f108c = abstractC0229z;
        float f2 = Resources.getSystem().getDisplayMetrics().density;
        float f3 = ((int) ((1575.0f * f2) + 0.5f)) / 1000.0f;
        fArr5[0] = f3;
        fArr5[1] = f3;
        float f4 = ((int) ((f2 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f4;
        fArr4[1] = f4;
        this.f112g = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f113h = f105r;
        aVar.f93a = 500;
        aVar.f94b = 500;
        this.f122q = abstractC0229z;
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
        float b2 = b(this.f110e[i2] * f3, 0.0f, this.f111f[i2]);
        float c2 = c(f3 - f2, b2) - c(f2, b2);
        AccelerateInterpolator accelerateInterpolator = this.f107b;
        if (c2 < 0.0f) {
            interpolation = -accelerateInterpolator.getInterpolation(-c2);
        } else {
            if (c2 <= 0.0f) {
                f5 = 0.0f;
                if (f5 != 0.0f) {
                    return 0.0f;
                }
                float f6 = this.f114i[i2];
                float f7 = this.f115j[i2];
                float f8 = this.f116k[i2];
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
        int i2 = this.f112g;
        if (i2 == 0 || i2 == 1) {
            if (f2 < f3) {
                if (f2 >= 0.0f) {
                    return 1.0f - (f2 / f3);
                }
                if (this.f120o && i2 == 1) {
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
        if (this.f118m) {
            this.f120o = false;
            return;
        }
        a aVar = this.f106a;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i3 = (int) (currentAnimationTimeMillis - aVar.f97e);
        int i4 = aVar.f94b;
        if (i3 > i4) {
            i2 = i4;
        } else if (i3 >= 0) {
            i2 = i3;
        }
        aVar.f101i = i2;
        aVar.f100h = aVar.a(currentAnimationTimeMillis);
        aVar.f99g = currentAnimationTimeMillis;
    }

    public final boolean e() {
        AbstractC0229z abstractC0229z;
        int count;
        a aVar = this.f106a;
        float f2 = aVar.f96d;
        int abs = (int) (f2 / Math.abs(f2));
        Math.abs(aVar.f95c);
        if (abs == 0 || (count = (abstractC0229z = this.f122q).getCount()) == 0) {
            return false;
        }
        int childCount = abstractC0229z.getChildCount();
        int firstVisiblePosition = abstractC0229z.getFirstVisiblePosition();
        int i2 = firstVisiblePosition + childCount;
        if (abs > 0) {
            if (i2 >= count && abstractC0229z.getChildAt(childCount - 1).getBottom() <= abstractC0229z.getHeight()) {
                return false;
            }
        } else {
            if (abs >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && abstractC0229z.getChildAt(0).getTop() >= 0) {
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
        if (!this.f121p) {
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
        this.f119n = true;
        this.f117l = false;
        float x2 = motionEvent.getX();
        float width = view.getWidth();
        ListView listView = this.f108c;
        float a2 = a(0, x2, width, listView.getWidth());
        float a3 = a(1, motionEvent.getY(), view.getHeight(), listView.getHeight());
        a aVar = this.f106a;
        aVar.f95c = a2;
        aVar.f96d = a3;
        if (!this.f120o && e()) {
            if (this.f109d == null) {
                this.f109d = new b(i3, this);
            }
            this.f120o = true;
            this.f118m = true;
            if (this.f117l || (i2 = this.f113h) <= 0) {
                this.f109d.run();
            } else {
                b bVar = this.f109d;
                long j2 = i2;
                Field field = x.f8596a;
                listView.postOnAnimationDelayed(bVar, j2);
            }
            this.f117l = true;
        }
        return false;
    }
}
