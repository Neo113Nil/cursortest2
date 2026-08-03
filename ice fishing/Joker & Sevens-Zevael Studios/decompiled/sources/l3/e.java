package l3;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import com.onesignal.core.activities.PermissionsActivity;
import h3.w;
import java.lang.reflect.Field;
import m.e0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e implements View.OnTouchListener {

    /* renamed from: x, reason: collision with root package name */
    public static final int f4132x = ViewConfiguration.getTapTimeout();

    /* renamed from: g, reason: collision with root package name */
    public final a f4133g;

    /* renamed from: h, reason: collision with root package name */
    public final AccelerateInterpolator f4134h;

    /* renamed from: i, reason: collision with root package name */
    public final e0 f4135i;

    /* renamed from: j, reason: collision with root package name */
    public b4.g f4136j;

    /* renamed from: k, reason: collision with root package name */
    public final float[] f4137k;

    /* renamed from: l, reason: collision with root package name */
    public final float[] f4138l;

    /* renamed from: m, reason: collision with root package name */
    public final int f4139m;

    /* renamed from: n, reason: collision with root package name */
    public final int f4140n;

    /* renamed from: o, reason: collision with root package name */
    public final float[] f4141o;

    /* renamed from: p, reason: collision with root package name */
    public final float[] f4142p;

    /* renamed from: q, reason: collision with root package name */
    public final float[] f4143q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f4144r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f4145s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f4146t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f4147u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f4148v;

    /* renamed from: w, reason: collision with root package name */
    public final e0 f4149w;

    public e(e0 e0Var) {
        a aVar = new a();
        aVar.f4126e = Long.MIN_VALUE;
        aVar.f4128g = -1L;
        aVar.f4127f = 0L;
        this.f4133g = aVar;
        this.f4134h = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f4137k = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f4138l = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f4141o = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f4142p = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f4143q = fArr5;
        this.f4135i = e0Var;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float f11 = ((int) ((1575.0f * f10) + 0.5f)) / 1000.0f;
        fArr5[0] = f11;
        fArr5[1] = f11;
        float f12 = ((int) ((f10 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f12;
        fArr4[1] = f12;
        this.f4139m = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f4140n = f4132x;
        aVar.f4122a = PermissionsActivity.DELAY_TIME_CALLBACK_CALL;
        aVar.f4123b = PermissionsActivity.DELAY_TIME_CALLBACK_CALL;
        this.f4149w = e0Var;
    }

    public static float b(float f10, float f11, float f12) {
        return f10 > f12 ? f12 : f10 < f11 ? f11 : f10;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(int i10, float f10, float f11, float f12) {
        float f13;
        float interpolation;
        float b2 = b(this.f4137k[i10] * f11, 0.0f, this.f4138l[i10]);
        float c3 = c(f11 - f10, b2) - c(f10, b2);
        AccelerateInterpolator accelerateInterpolator = this.f4134h;
        if (c3 < 0.0f) {
            interpolation = -accelerateInterpolator.getInterpolation(-c3);
        } else {
            if (c3 <= 0.0f) {
                f13 = 0.0f;
                if (f13 != 0.0f) {
                    return 0.0f;
                }
                float f14 = this.f4141o[i10];
                float f15 = this.f4142p[i10];
                float f16 = this.f4143q[i10];
                float f17 = f14 * f12;
                return f13 > 0.0f ? b(f13 * f17, f15, f16) : -b((-f13) * f17, f15, f16);
            }
            interpolation = accelerateInterpolator.getInterpolation(c3);
        }
        f13 = b(interpolation, -1.0f, 1.0f);
        if (f13 != 0.0f) {
        }
    }

    public final float c(float f10, float f11) {
        if (f11 != 0.0f) {
            int i10 = this.f4139m;
            if (i10 == 0 || i10 == 1) {
                if (f10 < f11) {
                    if (f10 >= 0.0f) {
                        return 1.0f - (f10 / f11);
                    }
                    if (this.f4147u && i10 == 1) {
                        return 1.0f;
                    }
                }
            } else if (i10 == 2 && f10 < 0.0f) {
                return f10 / (-f11);
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i10 = 0;
        if (this.f4145s) {
            this.f4147u = false;
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        a aVar = this.f4133g;
        int i11 = (int) (currentAnimationTimeMillis - aVar.f4126e);
        int i12 = aVar.f4123b;
        if (i11 > i12) {
            i10 = i12;
        } else if (i11 >= 0) {
            i10 = i11;
        }
        aVar.f4130i = i10;
        aVar.f4129h = aVar.a(currentAnimationTimeMillis);
        aVar.f4128g = currentAnimationTimeMillis;
    }

    public final boolean e() {
        e0 e0Var;
        int count;
        a aVar = this.f4133g;
        float f10 = aVar.f4125d;
        int abs = (int) (f10 / Math.abs(f10));
        Math.abs(aVar.f4124c);
        if (abs != 0 && (count = (e0Var = this.f4149w).getCount()) != 0) {
            int childCount = e0Var.getChildCount();
            int firstVisiblePosition = e0Var.getFirstVisiblePosition();
            int i10 = firstVisiblePosition + childCount;
            if (abs <= 0 ? !(abs >= 0 || (firstVisiblePosition <= 0 && e0Var.getChildAt(0).getTop() >= 0)) : !(i10 >= count && e0Var.getChildAt(childCount - 1).getBottom() <= e0Var.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0014, code lost:
    
        if (r0 != 3) goto L29;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10;
        if (this.f4148v) {
            int actionMasked = motionEvent.getActionMasked();
            int i11 = 3;
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                    }
                }
                d();
                return false;
            }
            this.f4146t = true;
            this.f4144r = false;
            float x10 = motionEvent.getX();
            float width = view.getWidth();
            e0 e0Var = this.f4135i;
            float a6 = a(0, x10, width, e0Var.getWidth());
            float a8 = a(1, motionEvent.getY(), view.getHeight(), e0Var.getHeight());
            a aVar = this.f4133g;
            aVar.f4124c = a6;
            aVar.f4125d = a8;
            if (!this.f4147u && e()) {
                if (this.f4136j == null) {
                    this.f4136j = new b4.g(i11, this);
                }
                this.f4147u = true;
                this.f4145s = true;
                if (this.f4144r || (i10 = this.f4140n) <= 0) {
                    this.f4136j.run();
                } else {
                    b4.g gVar = this.f4136j;
                    long j3 = i10;
                    Field field = w.f2829a;
                    e0Var.postOnAnimationDelayed(gVar, j3);
                }
                this.f4144r = true;
            }
        }
        return false;
    }
}
