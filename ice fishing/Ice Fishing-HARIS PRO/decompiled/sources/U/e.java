package U;

import O.K;
import R.j;
import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: x, reason: collision with root package name */
    public static final d f1173x = new d(0);

    /* renamed from: a, reason: collision with root package name */
    public int f1174a;

    /* renamed from: b, reason: collision with root package name */
    public int f1175b;

    /* renamed from: d, reason: collision with root package name */
    public float[] f1177d;
    public float[] e;

    /* renamed from: f, reason: collision with root package name */
    public float[] f1178f;

    /* renamed from: g, reason: collision with root package name */
    public float[] f1179g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f1180h;
    public int[] i;
    public int[] j;

    /* renamed from: k, reason: collision with root package name */
    public int f1181k;

    /* renamed from: l, reason: collision with root package name */
    public VelocityTracker f1182l;

    /* renamed from: m, reason: collision with root package name */
    public final float f1183m;

    /* renamed from: n, reason: collision with root package name */
    public float f1184n;

    /* renamed from: o, reason: collision with root package name */
    public int f1185o;

    /* renamed from: p, reason: collision with root package name */
    public final int f1186p;

    /* renamed from: q, reason: collision with root package name */
    public int f1187q;

    /* renamed from: r, reason: collision with root package name */
    public final OverScroller f1188r;

    /* renamed from: s, reason: collision with root package name */
    public final j f1189s;

    /* renamed from: t, reason: collision with root package name */
    public View f1190t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1191u;

    /* renamed from: v, reason: collision with root package name */
    public final ViewGroup f1192v;

    /* renamed from: c, reason: collision with root package name */
    public int f1176c = -1;

    /* renamed from: w, reason: collision with root package name */
    public final B0.j f1193w = new B0.j(2, this);

    public e(Context context, ViewGroup viewGroup, j jVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (jVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f1192v = viewGroup;
        this.f1189s = jVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f1186p = i;
        this.f1185o = i;
        this.f1175b = viewConfiguration.getScaledTouchSlop();
        this.f1183m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f1184n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1188r = new OverScroller(context, f1173x);
    }

    public static boolean l(View view, int i, int i2) {
        return view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom();
    }

    public final void a() {
        b();
        if (this.f1174a == 2) {
            OverScroller overScroller = this.f1188r;
            overScroller.getCurrX();
            overScroller.getCurrY();
            overScroller.abortAnimation();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            this.f1189s.c0(this.f1190t, currX, currY);
        }
        r(0);
    }

    public final void b() {
        this.f1176c = -1;
        float[] fArr = this.f1177d;
        if (fArr != null) {
            Arrays.fill(fArr, RecyclerView.f2111C0);
            Arrays.fill(this.e, RecyclerView.f2111C0);
            Arrays.fill(this.f1178f, RecyclerView.f2111C0);
            Arrays.fill(this.f1179g, RecyclerView.f2111C0);
            Arrays.fill(this.f1180h, 0);
            Arrays.fill(this.i, 0);
            Arrays.fill(this.j, 0);
            this.f1181k = 0;
        }
        VelocityTracker velocityTracker = this.f1182l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f1182l = null;
        }
    }

    public final void c(View view, int i) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.f1192v;
        if (parent != viewGroup) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + viewGroup + ")");
        }
        this.f1190t = view;
        this.f1176c = i;
        this.f1189s.a0(view, i);
        r(1);
    }

    public final boolean d(float f2, float f3, int i, int i2) {
        float abs = Math.abs(f2);
        float abs2 = Math.abs(f3);
        if ((this.f1180h[i] & i2) != i2 || (this.f1187q & i2) == 0 || (this.j[i] & i2) == i2 || (this.i[i] & i2) == i2) {
            return false;
        }
        float f4 = this.f1175b;
        if (abs <= f4 && abs2 <= f4) {
            return false;
        }
        if (abs < abs2 * 0.5f) {
            this.f1189s.getClass();
        }
        return (this.i[i] & i2) == 0 && abs > ((float) this.f1175b);
    }

    public final boolean e(View view, float f2, float f3) {
        if (view == null) {
            return false;
        }
        j jVar = this.f1189s;
        boolean z2 = jVar.J(view) > 0;
        boolean z3 = jVar.K() > 0;
        if (!z2 || !z3) {
            return z2 ? Math.abs(f2) > ((float) this.f1175b) : z3 && Math.abs(f3) > ((float) this.f1175b);
        }
        float f4 = (f3 * f3) + (f2 * f2);
        int i = this.f1175b;
        return f4 > ((float) (i * i));
    }

    public final void f(int i) {
        float[] fArr = this.f1177d;
        if (fArr != null) {
            int i2 = this.f1181k;
            int i3 = 1 << i;
            if ((i2 & i3) != 0) {
                fArr[i] = 0.0f;
                this.e[i] = 0.0f;
                this.f1178f[i] = 0.0f;
                this.f1179g[i] = 0.0f;
                this.f1180h[i] = 0;
                this.i[i] = 0;
                this.j[i] = 0;
                this.f1181k = (~i3) & i2;
            }
        }
    }

    public final int g(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        float width = this.f1192v.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int abs = Math.abs(i2);
        return Math.min(abs > 0 ? Math.round(Math.abs(sin / abs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f), 600);
    }

    public final boolean h() {
        if (this.f1174a == 2) {
            OverScroller overScroller = this.f1188r;
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f1190t.getLeft();
            int top = currY - this.f1190t.getTop();
            if (left != 0) {
                View view = this.f1190t;
                WeakHashMap weakHashMap = K.f747a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f1190t;
                WeakHashMap weakHashMap2 = K.f747a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f1189s.c0(this.f1190t, currX, currY);
            }
            if (computeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.f1192v.post(this.f1193w);
            }
        }
        return this.f1174a == 2;
    }

    public final View i(int i, int i2) {
        ViewGroup viewGroup = this.f1192v;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f1189s.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean j(int i, int i2, int i3, int i4) {
        float f2;
        float f3;
        float f4;
        float f5;
        int left = this.f1190t.getLeft();
        int top = this.f1190t.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        OverScroller overScroller = this.f1188r;
        int i7 = 0;
        if (i5 == 0 && i6 == 0) {
            overScroller.abortAnimation();
            r(0);
            return false;
        }
        View view = this.f1190t;
        int i8 = (int) this.f1184n;
        int i9 = (int) this.f1183m;
        int abs = Math.abs(i3);
        if (abs < i8) {
            i3 = 0;
        } else if (abs > i9) {
            i3 = i3 > 0 ? i9 : -i9;
        }
        int i10 = (int) this.f1184n;
        int abs2 = Math.abs(i4);
        if (abs2 >= i10) {
            if (abs2 > i9) {
                if (i4 > 0) {
                    i4 = i9;
                } else {
                    i7 = -i9;
                }
            }
            int abs3 = Math.abs(i5);
            int abs4 = Math.abs(i6);
            int abs5 = Math.abs(i3);
            int abs6 = Math.abs(i4);
            int i11 = abs5 + abs6;
            int i12 = abs3 + abs4;
            if (i3 == 0) {
                f2 = abs5;
                f3 = i11;
            } else {
                f2 = abs3;
                f3 = i12;
            }
            float f6 = f2 / f3;
            if (i4 == 0) {
                f4 = abs6;
                f5 = i11;
            } else {
                f4 = abs4;
                f5 = i12;
            }
            float f7 = f4 / f5;
            j jVar = this.f1189s;
            overScroller.startScroll(left, top, i5, i6, (int) ((g(i6, i4, jVar.K()) * f7) + (g(i5, i3, jVar.J(view)) * f6)));
            r(2);
            return true;
        }
        i4 = i7;
        int abs32 = Math.abs(i5);
        int abs42 = Math.abs(i6);
        int abs52 = Math.abs(i3);
        int abs62 = Math.abs(i4);
        int i112 = abs52 + abs62;
        int i122 = abs32 + abs42;
        if (i3 == 0) {
        }
        float f62 = f2 / f3;
        if (i4 == 0) {
        }
        float f72 = f4 / f5;
        j jVar2 = this.f1189s;
        overScroller.startScroll(left, top, i5, i6, (int) ((g(i6, i4, jVar2.K()) * f72) + (g(i5, i3, jVar2.J(view)) * f62)));
        r(2);
        return true;
    }

    public final boolean k(int i) {
        if ((this.f1181k & (1 << i)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void m(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            b();
        }
        if (this.f1182l == null) {
            this.f1182l = VelocityTracker.obtain();
        }
        this.f1182l.addMovement(motionEvent);
        int i2 = 0;
        j jVar = this.f1189s;
        if (actionMasked == 0) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View i3 = i((int) x2, (int) y2);
            p(x2, y2, pointerId);
            v(i3, pointerId);
            if ((this.f1180h[pointerId] & this.f1187q) != 0) {
                jVar.V(pointerId);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f1174a == 1) {
                n();
            }
            b();
            return;
        }
        if (actionMasked == 2) {
            if (this.f1174a != 1) {
                int pointerCount = motionEvent.getPointerCount();
                while (i2 < pointerCount) {
                    int pointerId2 = motionEvent.getPointerId(i2);
                    if (k(pointerId2)) {
                        float x3 = motionEvent.getX(i2);
                        float y3 = motionEvent.getY(i2);
                        float f2 = x3 - this.f1177d[pointerId2];
                        float f3 = y3 - this.e[pointerId2];
                        o(f2, f3, pointerId2);
                        if (this.f1174a != 1) {
                            View i4 = i((int) x3, (int) y3);
                            if (e(i4, f2, f3) && v(i4, pointerId2)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    i2++;
                }
                q(motionEvent);
                return;
            }
            if (k(this.f1176c)) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f1176c);
                float x4 = motionEvent.getX(findPointerIndex);
                float y4 = motionEvent.getY(findPointerIndex);
                float[] fArr = this.f1178f;
                int i5 = this.f1176c;
                int i6 = (int) (x4 - fArr[i5]);
                int i7 = (int) (y4 - this.f1179g[i5]);
                int left = this.f1190t.getLeft() + i6;
                int top = this.f1190t.getTop() + i7;
                int left2 = this.f1190t.getLeft();
                int top2 = this.f1190t.getTop();
                if (i6 != 0) {
                    left = jVar.m(this.f1190t, left);
                    WeakHashMap weakHashMap = K.f747a;
                    this.f1190t.offsetLeftAndRight(left - left2);
                }
                if (i7 != 0) {
                    top = jVar.n(this.f1190t, top);
                    WeakHashMap weakHashMap2 = K.f747a;
                    this.f1190t.offsetTopAndBottom(top - top2);
                }
                if (i6 != 0 || i7 != 0) {
                    jVar.c0(this.f1190t, left, top);
                }
                q(motionEvent);
                return;
            }
            return;
        }
        if (actionMasked == 3) {
            if (this.f1174a == 1) {
                this.f1191u = true;
                jVar.d0(this.f1190t, RecyclerView.f2111C0, RecyclerView.f2111C0);
                this.f1191u = false;
                if (this.f1174a == 1) {
                    r(0);
                }
            }
            b();
            return;
        }
        if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x5 = motionEvent.getX(actionIndex);
            float y5 = motionEvent.getY(actionIndex);
            p(x5, y5, pointerId3);
            if (this.f1174a == 0) {
                v(i((int) x5, (int) y5), pointerId3);
                if ((this.f1180h[pointerId3] & this.f1187q) != 0) {
                    jVar.V(pointerId3);
                    return;
                }
                return;
            }
            if (l(this.f1190t, (int) x5, (int) y5)) {
                v(this.f1190t, pointerId3);
                return;
            }
            return;
        }
        if (actionMasked != 6) {
            return;
        }
        int pointerId4 = motionEvent.getPointerId(actionIndex);
        if (this.f1174a == 1 && pointerId4 == this.f1176c) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (true) {
                if (i2 >= pointerCount2) {
                    i = -1;
                    break;
                }
                int pointerId5 = motionEvent.getPointerId(i2);
                if (pointerId5 != this.f1176c) {
                    View i8 = i((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                    View view = this.f1190t;
                    if (i8 == view && v(view, pointerId5)) {
                        i = this.f1176c;
                        break;
                    }
                }
                i2++;
            }
            if (i == -1) {
                n();
            }
        }
        f(pointerId4);
    }

    public final void n() {
        VelocityTracker velocityTracker = this.f1182l;
        float f2 = this.f1183m;
        velocityTracker.computeCurrentVelocity(1000, f2);
        float xVelocity = this.f1182l.getXVelocity(this.f1176c);
        float f3 = this.f1184n;
        float abs = Math.abs(xVelocity);
        float f4 = RecyclerView.f2111C0;
        if (abs < f3) {
            xVelocity = 0.0f;
        } else if (abs > f2) {
            xVelocity = xVelocity > RecyclerView.f2111C0 ? f2 : -f2;
        }
        float yVelocity = this.f1182l.getYVelocity(this.f1176c);
        float f5 = this.f1184n;
        float abs2 = Math.abs(yVelocity);
        if (abs2 >= f5) {
            if (abs2 > f2) {
                if (yVelocity <= RecyclerView.f2111C0) {
                    f2 = -f2;
                }
                f4 = f2;
            } else {
                f4 = yVelocity;
            }
        }
        this.f1191u = true;
        this.f1189s.d0(this.f1190t, xVelocity, f4);
        this.f1191u = false;
        if (this.f1174a == 1) {
            r(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final void o(float f2, float f3, int i) {
        boolean d2 = d(f2, f3, i, 1);
        boolean z2 = d2;
        if (d(f3, f2, i, 4)) {
            z2 = (d2 ? 1 : 0) | 4;
        }
        boolean z3 = z2;
        if (d(f2, f3, i, 2)) {
            z3 = (z2 ? 1 : 0) | 2;
        }
        ?? r02 = z3;
        if (d(f3, f2, i, 8)) {
            r02 = (z3 ? 1 : 0) | 8;
        }
        if (r02 != 0) {
            int[] iArr = this.i;
            iArr[i] = iArr[i] | r02;
            this.f1189s.U(i);
        }
    }

    public final void p(float f2, float f3, int i) {
        float[] fArr = this.f1177d;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f1178f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f1179g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f1180h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f1177d = fArr2;
            this.e = fArr3;
            this.f1178f = fArr4;
            this.f1179g = fArr5;
            this.f1180h = iArr;
            this.i = iArr2;
            this.j = iArr3;
        }
        float[] fArr9 = this.f1177d;
        this.f1178f[i] = f2;
        fArr9[i] = f2;
        float[] fArr10 = this.e;
        this.f1179g[i] = f3;
        fArr10[i] = f3;
        int[] iArr7 = this.f1180h;
        int i3 = (int) f2;
        int i4 = (int) f3;
        ViewGroup viewGroup = this.f1192v;
        int i5 = i3 < viewGroup.getLeft() + this.f1185o ? 1 : 0;
        if (i4 < viewGroup.getTop() + this.f1185o) {
            i5 |= 4;
        }
        if (i3 > viewGroup.getRight() - this.f1185o) {
            i5 |= 2;
        }
        if (i4 > viewGroup.getBottom() - this.f1185o) {
            i5 |= 8;
        }
        iArr7[i] = i5;
        this.f1181k |= 1 << i;
    }

    public final void q(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (k(pointerId)) {
                float x2 = motionEvent.getX(i);
                float y2 = motionEvent.getY(i);
                this.f1178f[pointerId] = x2;
                this.f1179g[pointerId] = y2;
            }
        }
    }

    public final void r(int i) {
        this.f1192v.removeCallbacks(this.f1193w);
        if (this.f1174a != i) {
            this.f1174a = i;
            this.f1189s.b0(i);
            if (this.f1174a == 0) {
                this.f1190t = null;
            }
        }
    }

    public final boolean s(int i, int i2) {
        if (this.f1191u) {
            return j(i, i2, (int) this.f1182l.getXVelocity(this.f1176c), (int) this.f1182l.getYVelocity(this.f1176c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d4, code lost:
    
        if (r13 != r12) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean t(MotionEvent motionEvent) {
        View i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            b();
        }
        if (this.f1182l == null) {
            this.f1182l = VelocityTracker.obtain();
        }
        this.f1182l.addMovement(motionEvent);
        j jVar = this.f1189s;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 5) {
                            int pointerId = motionEvent.getPointerId(actionIndex);
                            float x2 = motionEvent.getX(actionIndex);
                            float y2 = motionEvent.getY(actionIndex);
                            p(x2, y2, pointerId);
                            int i2 = this.f1174a;
                            if (i2 == 0) {
                                if ((this.f1180h[pointerId] & this.f1187q) != 0) {
                                    jVar.V(pointerId);
                                }
                            } else if (i2 == 2 && (i = i((int) x2, (int) y2)) == this.f1190t) {
                                v(i, pointerId);
                            }
                        } else if (actionMasked == 6) {
                            f(motionEvent.getPointerId(actionIndex));
                        }
                    }
                } else if (this.f1177d != null && this.e != null) {
                    int pointerCount = motionEvent.getPointerCount();
                    for (int i3 = 0; i3 < pointerCount; i3++) {
                        int pointerId2 = motionEvent.getPointerId(i3);
                        if (k(pointerId2)) {
                            float x3 = motionEvent.getX(i3);
                            float y3 = motionEvent.getY(i3);
                            float f2 = x3 - this.f1177d[pointerId2];
                            float f3 = y3 - this.e[pointerId2];
                            View i4 = i((int) x3, (int) y3);
                            boolean z2 = i4 != null && e(i4, f2, f3);
                            if (z2) {
                                int left = i4.getLeft();
                                int m2 = jVar.m(i4, ((int) f2) + left);
                                int top = i4.getTop();
                                int n2 = jVar.n(i4, ((int) f3) + top);
                                int J = jVar.J(i4);
                                int K2 = jVar.K();
                                if (J != 0) {
                                    if (J > 0) {
                                    }
                                }
                                if (K2 == 0) {
                                    break;
                                }
                                if (K2 > 0 && n2 == top) {
                                    break;
                                }
                            }
                            o(f2, f3, pointerId2);
                            if (this.f1174a == 1) {
                                break;
                            }
                            if (z2 && v(i4, pointerId2)) {
                                break;
                            }
                        }
                    }
                    q(motionEvent);
                }
            }
            b();
        } else {
            float x4 = motionEvent.getX();
            float y4 = motionEvent.getY();
            int pointerId3 = motionEvent.getPointerId(0);
            p(x4, y4, pointerId3);
            View i5 = i((int) x4, (int) y4);
            if (i5 == this.f1190t && this.f1174a == 2) {
                v(i5, pointerId3);
            }
            if ((this.f1180h[pointerId3] & this.f1187q) != 0) {
                jVar.V(pointerId3);
            }
        }
        return this.f1174a == 1;
    }

    public final boolean u(View view, int i, int i2) {
        this.f1190t = view;
        this.f1176c = -1;
        boolean j = j(i, i2, 0, 0);
        if (!j && this.f1174a == 0 && this.f1190t != null) {
            this.f1190t = null;
        }
        return j;
    }

    public final boolean v(View view, int i) {
        if (view == this.f1190t && this.f1176c == i) {
            return true;
        }
        if (view == null || !this.f1189s.r0(view, i)) {
            return false;
        }
        this.f1176c = i;
        c(view, i);
        return true;
    }
}
