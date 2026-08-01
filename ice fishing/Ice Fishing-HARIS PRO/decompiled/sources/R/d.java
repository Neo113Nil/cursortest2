package R;

import O.K;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import m.C0276r0;

/* loaded from: classes.dex */
public final class d implements View.OnTouchListener {

    /* renamed from: r, reason: collision with root package name */
    public static final int f988r = ViewConfiguration.getTapTimeout();

    /* renamed from: a, reason: collision with root package name */
    public final a f989a;

    /* renamed from: b, reason: collision with root package name */
    public final AccelerateInterpolator f990b;

    /* renamed from: c, reason: collision with root package name */
    public final ListView f991c;

    /* renamed from: d, reason: collision with root package name */
    public B0.j f992d;
    public final float[] e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f993f;

    /* renamed from: g, reason: collision with root package name */
    public final int f994g;

    /* renamed from: h, reason: collision with root package name */
    public final int f995h;
    public final float[] i;
    public final float[] j;

    /* renamed from: k, reason: collision with root package name */
    public final float[] f996k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f997l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f998m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f999n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1000o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1001p;

    /* renamed from: q, reason: collision with root package name */
    public final C0276r0 f1002q;

    public d(C0276r0 c0276r0) {
        a aVar = new a();
        aVar.e = Long.MIN_VALUE;
        aVar.f986g = -1L;
        aVar.f985f = 0L;
        this.f989a = aVar;
        this.f990b = new AccelerateInterpolator();
        float[] fArr = {RecyclerView.f2111C0, RecyclerView.f2111C0};
        this.e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f993f = fArr2;
        float[] fArr3 = {RecyclerView.f2111C0, RecyclerView.f2111C0};
        this.i = fArr3;
        float[] fArr4 = {RecyclerView.f2111C0, RecyclerView.f2111C0};
        this.j = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f996k = fArr5;
        this.f991c = c0276r0;
        float f2 = Resources.getSystem().getDisplayMetrics().density;
        float f3 = ((int) ((1575.0f * f2) + 0.5f)) / 1000.0f;
        fArr5[0] = f3;
        fArr5[1] = f3;
        float f4 = ((int) ((f2 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f4;
        fArr4[1] = f4;
        this.f994g = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f995h = f988r;
        aVar.f981a = 500;
        aVar.f982b = 500;
        this.f1002q = c0276r0;
    }

    public static float b(float f2, float f3, float f4) {
        return f2 > f4 ? f4 : f2 < f3 ? f3 : f2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(float f2, float f3, float f4, int i) {
        float f5;
        float interpolation;
        float b2 = b(this.e[i] * f3, RecyclerView.f2111C0, this.f993f[i]);
        float c2 = c(f3 - f2, b2) - c(f2, b2);
        AccelerateInterpolator accelerateInterpolator = this.f990b;
        if (c2 < RecyclerView.f2111C0) {
            interpolation = -accelerateInterpolator.getInterpolation(-c2);
        } else {
            if (c2 <= RecyclerView.f2111C0) {
                f5 = 0.0f;
                if (f5 != RecyclerView.f2111C0) {
                    return RecyclerView.f2111C0;
                }
                float f6 = this.i[i];
                float f7 = this.j[i];
                float f8 = this.f996k[i];
                float f9 = f6 * f4;
                return f5 > RecyclerView.f2111C0 ? b(f5 * f9, f7, f8) : -b((-f5) * f9, f7, f8);
            }
            interpolation = accelerateInterpolator.getInterpolation(c2);
        }
        f5 = b(interpolation, -1.0f, 1.0f);
        if (f5 != RecyclerView.f2111C0) {
        }
    }

    public final float c(float f2, float f3) {
        if (f3 == RecyclerView.f2111C0) {
            return RecyclerView.f2111C0;
        }
        int i = this.f994g;
        if (i == 0 || i == 1) {
            if (f2 < f3) {
                if (f2 >= RecyclerView.f2111C0) {
                    return 1.0f - (f2 / f3);
                }
                if (this.f1000o && i == 1) {
                    return 1.0f;
                }
            }
        } else if (i == 2 && f2 < RecyclerView.f2111C0) {
            return f2 / (-f3);
        }
        return RecyclerView.f2111C0;
    }

    public final void d() {
        int i = 0;
        if (this.f998m) {
            this.f1000o = false;
            return;
        }
        a aVar = this.f989a;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i2 = (int) (currentAnimationTimeMillis - aVar.e);
        int i3 = aVar.f982b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        aVar.i = i;
        aVar.f987h = aVar.a(currentAnimationTimeMillis);
        aVar.f986g = currentAnimationTimeMillis;
    }

    public final boolean e() {
        C0276r0 c0276r0;
        int count;
        a aVar = this.f989a;
        float f2 = aVar.f984d;
        int abs = (int) (f2 / Math.abs(f2));
        Math.abs(aVar.f983c);
        if (abs == 0 || (count = (c0276r0 = this.f1002q).getCount()) == 0) {
            return false;
        }
        int childCount = c0276r0.getChildCount();
        int firstVisiblePosition = c0276r0.getFirstVisiblePosition();
        int i = firstVisiblePosition + childCount;
        if (abs > 0) {
            if (i >= count && c0276r0.getChildAt(childCount - 1).getBottom() <= c0276r0.getHeight()) {
                return false;
            }
        } else {
            if (abs >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && c0276r0.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
    
        if (r1 != 3) goto L29;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        int i2 = 1;
        if (!this.f1001p) {
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
        this.f999n = true;
        this.f997l = false;
        float x2 = motionEvent.getX();
        float width = view.getWidth();
        ListView listView = this.f991c;
        float a2 = a(x2, width, listView.getWidth(), 0);
        float a3 = a(motionEvent.getY(), view.getHeight(), listView.getHeight(), 1);
        a aVar = this.f989a;
        aVar.f983c = a2;
        aVar.f984d = a3;
        if (!this.f1000o && e()) {
            if (this.f992d == null) {
                this.f992d = new B0.j(i2, this);
            }
            this.f1000o = true;
            this.f998m = true;
            if (this.f997l || (i = this.f995h) <= 0) {
                this.f992d.run();
            } else {
                B0.j jVar = this.f992d;
                long j = i;
                WeakHashMap weakHashMap = K.f747a;
                listView.postOnAnimationDelayed(jVar, j);
            }
            this.f997l = true;
        }
        return false;
    }
}
