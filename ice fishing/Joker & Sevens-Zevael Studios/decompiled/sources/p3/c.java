package p3;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.OverScroller;
import b4.g;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.Arrays;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: v, reason: collision with root package name */
    public static final a f5428v = new a();

    /* renamed from: a, reason: collision with root package name */
    public int f5429a;

    /* renamed from: b, reason: collision with root package name */
    public int f5430b;

    /* renamed from: d, reason: collision with root package name */
    public float[] f5432d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f5433e;

    /* renamed from: f, reason: collision with root package name */
    public float[] f5434f;

    /* renamed from: g, reason: collision with root package name */
    public float[] f5435g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f5436h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f5437i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f5438j;

    /* renamed from: k, reason: collision with root package name */
    public int f5439k;

    /* renamed from: l, reason: collision with root package name */
    public VelocityTracker f5440l;

    /* renamed from: m, reason: collision with root package name */
    public final float f5441m;

    /* renamed from: n, reason: collision with root package name */
    public final float f5442n;

    /* renamed from: o, reason: collision with root package name */
    public final int f5443o;

    /* renamed from: p, reason: collision with root package name */
    public final OverScroller f5444p;

    /* renamed from: q, reason: collision with root package name */
    public final a.c f5445q;

    /* renamed from: r, reason: collision with root package name */
    public View f5446r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f5447s;

    /* renamed from: t, reason: collision with root package name */
    public final com.onesignal.inAppMessages.internal.display.impl.a f5448t;

    /* renamed from: c, reason: collision with root package name */
    public int f5431c = -1;

    /* renamed from: u, reason: collision with root package name */
    public final g f5449u = new g(13, this);

    public c(Context context, com.onesignal.inAppMessages.internal.display.impl.a aVar, a.c cVar) {
        this.f5448t = aVar;
        this.f5445q = cVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f5443o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f5430b = viewConfiguration.getScaledTouchSlop();
        this.f5441m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f5442n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f5444p = new OverScroller(context, f5428v);
    }

    public final void a() {
        this.f5431c = -1;
        float[] fArr = this.f5432d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f5433e, 0.0f);
            Arrays.fill(this.f5434f, 0.0f);
            Arrays.fill(this.f5435g, 0.0f);
            Arrays.fill(this.f5436h, 0);
            Arrays.fill(this.f5437i, 0);
            Arrays.fill(this.f5438j, 0);
            this.f5439k = 0;
        }
        VelocityTracker velocityTracker = this.f5440l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f5440l = null;
        }
    }

    public final int b(int i10, int i11, int i12) {
        if (i10 == 0) {
            return 0;
        }
        float width = this.f5448t.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i10) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int abs = Math.abs(i11);
        return Math.min(abs > 0 ? Math.round(Math.abs(sin / abs) * 1000.0f) * 4 : (int) (((Math.abs(i10) / i12) + 1.0f) * 256.0f), 600);
    }

    public final View c(int i10, int i11) {
        com.onesignal.inAppMessages.internal.display.impl.a aVar = this.f5448t;
        for (int childCount = aVar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = aVar.getChildAt(this.f5445q.getOrderedChildIndex(childCount));
            if (i10 >= childAt.getLeft() && i10 < childAt.getRight() && i11 >= childAt.getTop() && i11 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean d(int i10, int i11, int i12, int i13) {
        float f10;
        float f11;
        float f12;
        float f13;
        int left = this.f5446r.getLeft();
        int top = this.f5446r.getTop();
        int i14 = i10 - left;
        int i15 = i11 - top;
        OverScroller overScroller = this.f5444p;
        if (i14 == 0 && i15 == 0) {
            overScroller.abortAnimation();
            i(0);
            return false;
        }
        View view = this.f5446r;
        int i16 = (int) this.f5442n;
        int i17 = (int) this.f5441m;
        int abs = Math.abs(i12);
        if (abs < i16) {
            i12 = 0;
        } else if (abs > i17) {
            i12 = i12 > 0 ? i17 : -i17;
        }
        int abs2 = Math.abs(i13);
        if (abs2 < i16) {
            i13 = 0;
        } else if (abs2 > i17) {
            i13 = i13 > 0 ? i17 : -i17;
        }
        int abs3 = Math.abs(i14);
        int abs4 = Math.abs(i15);
        int abs5 = Math.abs(i12);
        int abs6 = Math.abs(i13);
        int i18 = abs5 + abs6;
        int i19 = abs3 + abs4;
        if (i12 != 0) {
            f10 = abs5;
            f11 = i18;
        } else {
            f10 = abs3;
            f11 = i19;
        }
        float f14 = f10 / f11;
        if (i13 != 0) {
            f12 = abs6;
            f13 = i18;
        } else {
            f12 = abs4;
            f13 = i19;
        }
        float f15 = f12 / f13;
        a.c cVar = this.f5445q;
        overScroller.startScroll(left, top, i14, i15, (int) ((b(i15, i13, cVar.getViewVerticalDragRange(view)) * f15) + (b(i14, i12, cVar.getViewHorizontalDragRange(view)) * f14)));
        i(2);
        return true;
    }

    public final boolean e(int i10) {
        if ((this.f5439k & (1 << i10)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i10 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void f() {
        VelocityTracker velocityTracker = this.f5440l;
        float f10 = this.f5441m;
        velocityTracker.computeCurrentVelocity(1000, f10);
        float xVelocity = this.f5440l.getXVelocity(this.f5431c);
        float abs = Math.abs(xVelocity);
        float f11 = this.f5442n;
        if (abs < f11) {
            xVelocity = 0.0f;
        } else if (abs > f10) {
            xVelocity = xVelocity > 0.0f ? f10 : -f10;
        }
        float yVelocity = this.f5440l.getYVelocity(this.f5431c);
        float abs2 = Math.abs(yVelocity);
        if (abs2 < f11) {
            f10 = 0.0f;
        } else if (abs2 <= f10) {
            f10 = yVelocity;
        } else if (yVelocity <= 0.0f) {
            f10 = -f10;
        }
        this.f5447s = true;
        this.f5445q.onViewReleased(this.f5446r, xVelocity, f10);
        this.f5447s = false;
        if (this.f5429a == 1) {
            i(0);
        }
    }

    public final void g(float f10, float f11, int i10) {
        float[] fArr = this.f5432d;
        if (fArr == null || fArr.length <= i10) {
            int i11 = i10 + 1;
            float[] fArr2 = new float[i11];
            float[] fArr3 = new float[i11];
            float[] fArr4 = new float[i11];
            float[] fArr5 = new float[i11];
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            int[] iArr3 = new int[i11];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f5433e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f5434f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f5435g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f5436h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f5437i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f5438j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f5432d = fArr2;
            this.f5433e = fArr3;
            this.f5434f = fArr4;
            this.f5435g = fArr5;
            this.f5436h = iArr;
            this.f5437i = iArr2;
            this.f5438j = iArr3;
        }
        float[] fArr9 = this.f5432d;
        this.f5434f[i10] = f10;
        fArr9[i10] = f10;
        float[] fArr10 = this.f5433e;
        this.f5435g[i10] = f11;
        fArr10[i10] = f11;
        int[] iArr7 = this.f5436h;
        int i12 = (int) f10;
        int i13 = (int) f11;
        com.onesignal.inAppMessages.internal.display.impl.a aVar = this.f5448t;
        int left = aVar.getLeft();
        int i14 = this.f5443o;
        int i15 = i12 < left + i14 ? 1 : 0;
        if (i13 < aVar.getTop() + i14) {
            i15 |= 4;
        }
        if (i12 > aVar.getRight() - i14) {
            i15 |= 2;
        }
        if (i13 > aVar.getBottom() - i14) {
            i15 |= 8;
        }
        iArr7[i10] = i15;
        this.f5439k |= 1 << i10;
    }

    public final void h(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i10 = 0; i10 < pointerCount; i10++) {
            int pointerId = motionEvent.getPointerId(i10);
            if (e(pointerId)) {
                float x10 = motionEvent.getX(i10);
                float y10 = motionEvent.getY(i10);
                this.f5434f[pointerId] = x10;
                this.f5435g[pointerId] = y10;
            }
        }
    }

    public final void i(int i10) {
        this.f5448t.removeCallbacks(this.f5449u);
        if (this.f5429a != i10) {
            this.f5429a = i10;
            this.f5445q.onViewDragStateChanged(i10);
            if (this.f5429a == 0) {
                this.f5446r = null;
            }
        }
    }

    public final boolean j(View view, int i10) {
        if (view == this.f5446r && this.f5431c == i10) {
            return true;
        }
        if (view == null) {
            return false;
        }
        a.c cVar = this.f5445q;
        if (!cVar.tryCaptureView(view, i10)) {
            return false;
        }
        this.f5431c = i10;
        ViewParent parent = view.getParent();
        com.onesignal.inAppMessages.internal.display.impl.a aVar = this.f5448t;
        if (parent != aVar) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + aVar + ")");
        }
        this.f5446r = view;
        this.f5431c = i10;
        cVar.onViewCaptured(view, i10);
        i(1);
        return true;
    }
}
