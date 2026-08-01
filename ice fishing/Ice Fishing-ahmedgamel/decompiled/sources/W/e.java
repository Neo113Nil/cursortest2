package W;

import O.X;
import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.OverScroller;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: x, reason: collision with root package name */
    public static final G0.b f3378x = new G0.b(1);

    /* renamed from: a, reason: collision with root package name */
    public int f3379a;

    /* renamed from: b, reason: collision with root package name */
    public int f3380b;

    /* renamed from: d, reason: collision with root package name */
    public float[] f3382d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f3383e;

    /* renamed from: f, reason: collision with root package name */
    public float[] f3384f;

    /* renamed from: g, reason: collision with root package name */
    public float[] f3385g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f3386h;
    public int[] i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f3387j;

    /* renamed from: k, reason: collision with root package name */
    public int f3388k;

    /* renamed from: l, reason: collision with root package name */
    public VelocityTracker f3389l;

    /* renamed from: m, reason: collision with root package name */
    public final float f3390m;

    /* renamed from: n, reason: collision with root package name */
    public float f3391n;

    /* renamed from: o, reason: collision with root package name */
    public int f3392o;

    /* renamed from: p, reason: collision with root package name */
    public final int f3393p;

    /* renamed from: q, reason: collision with root package name */
    public int f3394q;

    /* renamed from: r, reason: collision with root package name */
    public final OverScroller f3395r;

    /* renamed from: s, reason: collision with root package name */
    public final d f3396s;

    /* renamed from: t, reason: collision with root package name */
    public View f3397t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f3398u;

    /* renamed from: v, reason: collision with root package name */
    public final ViewGroup f3399v;

    /* renamed from: c, reason: collision with root package name */
    public int f3381c = -1;

    /* renamed from: w, reason: collision with root package name */
    public final G0.c f3400w = new G0.c(13, this);

    public e(Context context, ViewGroup viewGroup, d dVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (dVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f3399v = viewGroup;
        this.f3396s = dVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f3393p = i;
        this.f3392o = i;
        this.f3380b = viewConfiguration.getScaledTouchSlop();
        this.f3390m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f3391n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f3395r = new OverScroller(context, f3378x);
    }

    public final void a() {
        this.f3381c = -1;
        float[] fArr = this.f3382d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f3383e, 0.0f);
            Arrays.fill(this.f3384f, 0.0f);
            Arrays.fill(this.f3385g, 0.0f);
            Arrays.fill(this.f3386h, 0);
            Arrays.fill(this.i, 0);
            Arrays.fill(this.f3387j, 0);
            this.f3388k = 0;
        }
        VelocityTracker velocityTracker = this.f3389l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f3389l = null;
        }
    }

    public final void b(int i, View view) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.f3399v;
        if (parent != viewGroup) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + viewGroup + ")");
        }
        this.f3397t = view;
        this.f3381c = i;
        this.f3396s.onViewCaptured(view, i);
        p(1);
    }

    public final boolean c(float f3, float f9, int i, int i6) {
        float abs = Math.abs(f3);
        float abs2 = Math.abs(f9);
        if ((this.f3386h[i] & i6) == i6 && (this.f3394q & i6) != 0 && (this.f3387j[i] & i6) != i6 && (this.i[i] & i6) != i6) {
            float f10 = this.f3380b;
            if (abs > f10 || abs2 > f10) {
                if (abs < abs2 * 0.5f && this.f3396s.onEdgeLock(i6)) {
                    int[] iArr = this.f3387j;
                    iArr[i] = iArr[i] | i6;
                    return false;
                }
                if ((this.i[i] & i6) == 0 && abs > this.f3380b) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(View view, float f3, float f9) {
        if (view != null) {
            d dVar = this.f3396s;
            boolean z3 = dVar.getViewHorizontalDragRange(view) > 0;
            boolean z6 = dVar.getViewVerticalDragRange(view) > 0;
            if (z3 && z6) {
                float f10 = (f9 * f9) + (f3 * f3);
                int i = this.f3380b;
                if (f10 > i * i) {
                }
            } else if (!z3 ? !(!z6 || Math.abs(f9) <= this.f3380b) : Math.abs(f3) > this.f3380b) {
                return true;
            }
        }
        return false;
    }

    public final void e(int i) {
        float[] fArr = this.f3382d;
        if (fArr != null) {
            int i6 = this.f3388k;
            int i9 = 1 << i;
            if ((i6 & i9) != 0) {
                fArr[i] = 0.0f;
                this.f3383e[i] = 0.0f;
                this.f3384f[i] = 0.0f;
                this.f3385g[i] = 0.0f;
                this.f3386h[i] = 0;
                this.i[i] = 0;
                this.f3387j[i] = 0;
                this.f3388k = (~i9) & i6;
            }
        }
    }

    public final int f(int i, int i6, int i9) {
        if (i == 0) {
            return 0;
        }
        float width = this.f3399v.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int abs = Math.abs(i6);
        return Math.min(abs > 0 ? Math.round(Math.abs(sin / abs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i9) + 1.0f) * 256.0f), 600);
    }

    public final boolean g() {
        if (this.f3379a == 2) {
            OverScroller overScroller = this.f3395r;
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f3397t.getLeft();
            int top = currY - this.f3397t.getTop();
            if (left != 0) {
                View view = this.f3397t;
                WeakHashMap weakHashMap = X.f2054a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f3397t;
                WeakHashMap weakHashMap2 = X.f2054a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f3396s.onViewPositionChanged(this.f3397t, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.f3399v.post(this.f3400w);
            }
        }
        return this.f3379a == 2;
    }

    public final View h(int i, int i6) {
        ViewGroup viewGroup = this.f3399v;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(this.f3396s.getOrderedChildIndex(childCount));
            if (i >= childAt.getLeft() && i < childAt.getRight() && i6 >= childAt.getTop() && i6 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean i(int i, int i6, int i9, int i10) {
        float f3;
        float f9;
        float f10;
        float f11;
        int left = this.f3397t.getLeft();
        int top = this.f3397t.getTop();
        int i11 = i - left;
        int i12 = i6 - top;
        OverScroller overScroller = this.f3395r;
        if (i11 == 0 && i12 == 0) {
            overScroller.abortAnimation();
            p(0);
            return false;
        }
        View view = this.f3397t;
        int i13 = (int) this.f3391n;
        int i14 = (int) this.f3390m;
        int abs = Math.abs(i9);
        if (abs < i13) {
            i9 = 0;
        } else if (abs > i14) {
            i9 = i9 > 0 ? i14 : -i14;
        }
        int i15 = (int) this.f3391n;
        int abs2 = Math.abs(i10);
        if (abs2 < i15) {
            i10 = 0;
        } else if (abs2 > i14) {
            i10 = i10 > 0 ? i14 : -i14;
        }
        int abs3 = Math.abs(i11);
        int abs4 = Math.abs(i12);
        int abs5 = Math.abs(i9);
        int abs6 = Math.abs(i10);
        int i16 = abs5 + abs6;
        int i17 = abs3 + abs4;
        if (i9 != 0) {
            f3 = abs5;
            f9 = i16;
        } else {
            f3 = abs3;
            f9 = i17;
        }
        float f12 = f3 / f9;
        if (i10 != 0) {
            f10 = abs6;
            f11 = i16;
        } else {
            f10 = abs4;
            f11 = i17;
        }
        float f13 = f10 / f11;
        d dVar = this.f3396s;
        overScroller.startScroll(left, top, i11, i12, (int) ((f(i12, i10, dVar.getViewVerticalDragRange(view)) * f13) + (f(i11, i9, dVar.getViewHorizontalDragRange(view)) * f12)));
        p(2);
        return true;
    }

    public final boolean j(int i) {
        if ((this.f3388k & (1 << i)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void k(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f3389l == null) {
            this.f3389l = VelocityTracker.obtain();
        }
        this.f3389l.addMovement(motionEvent);
        int i6 = 0;
        d dVar = this.f3396s;
        if (actionMasked == 0) {
            float x9 = motionEvent.getX();
            float y7 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View h9 = h((int) x9, (int) y7);
            n(pointerId, x9, y7);
            t(pointerId, h9);
            int i9 = this.f3386h[pointerId] & this.f3394q;
            if (i9 != 0) {
                dVar.onEdgeTouched(i9, pointerId);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f3379a == 1) {
                l();
            }
            a();
            return;
        }
        if (actionMasked == 2) {
            if (this.f3379a != 1) {
                int pointerCount = motionEvent.getPointerCount();
                while (i6 < pointerCount) {
                    int pointerId2 = motionEvent.getPointerId(i6);
                    if (j(pointerId2)) {
                        float x10 = motionEvent.getX(i6);
                        float y9 = motionEvent.getY(i6);
                        float f3 = x10 - this.f3382d[pointerId2];
                        float f9 = y9 - this.f3383e[pointerId2];
                        m(pointerId2, f3, f9);
                        if (this.f3379a != 1) {
                            View h10 = h((int) x10, (int) y9);
                            if (d(h10, f3, f9) && t(pointerId2, h10)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    i6++;
                }
                o(motionEvent);
                return;
            }
            if (j(this.f3381c)) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f3381c);
                float x11 = motionEvent.getX(findPointerIndex);
                float y10 = motionEvent.getY(findPointerIndex);
                float[] fArr = this.f3384f;
                int i10 = this.f3381c;
                int i11 = (int) (x11 - fArr[i10]);
                int i12 = (int) (y10 - this.f3385g[i10]);
                int left = this.f3397t.getLeft() + i11;
                int top = this.f3397t.getTop() + i12;
                int left2 = this.f3397t.getLeft();
                int top2 = this.f3397t.getTop();
                if (i11 != 0) {
                    left = dVar.clampViewPositionHorizontal(this.f3397t, left, i11);
                    WeakHashMap weakHashMap = X.f2054a;
                    this.f3397t.offsetLeftAndRight(left - left2);
                }
                int i13 = left;
                if (i12 != 0) {
                    top = dVar.clampViewPositionVertical(this.f3397t, top, i12);
                    WeakHashMap weakHashMap2 = X.f2054a;
                    this.f3397t.offsetTopAndBottom(top - top2);
                }
                int i14 = top;
                if (i11 != 0 || i12 != 0) {
                    this.f3396s.onViewPositionChanged(this.f3397t, i13, i14, i13 - left2, i14 - top2);
                }
                o(motionEvent);
                return;
            }
            return;
        }
        if (actionMasked == 3) {
            if (this.f3379a == 1) {
                this.f3398u = true;
                dVar.onViewReleased(this.f3397t, 0.0f, 0.0f);
                this.f3398u = false;
                if (this.f3379a == 1) {
                    p(0);
                }
            }
            a();
            return;
        }
        if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x12 = motionEvent.getX(actionIndex);
            float y11 = motionEvent.getY(actionIndex);
            n(pointerId3, x12, y11);
            if (this.f3379a == 0) {
                t(pointerId3, h((int) x12, (int) y11));
                int i15 = this.f3386h[pointerId3] & this.f3394q;
                if (i15 != 0) {
                    dVar.onEdgeTouched(i15, pointerId3);
                    return;
                }
                return;
            }
            int i16 = (int) x12;
            int i17 = (int) y11;
            View view = this.f3397t;
            if (view != null && i16 >= view.getLeft() && i16 < view.getRight() && i17 >= view.getTop() && i17 < view.getBottom()) {
                t(pointerId3, this.f3397t);
                return;
            }
            return;
        }
        if (actionMasked != 6) {
            return;
        }
        int pointerId4 = motionEvent.getPointerId(actionIndex);
        if (this.f3379a == 1 && pointerId4 == this.f3381c) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (true) {
                if (i6 >= pointerCount2) {
                    i = -1;
                    break;
                }
                int pointerId5 = motionEvent.getPointerId(i6);
                if (pointerId5 != this.f3381c) {
                    View h11 = h((int) motionEvent.getX(i6), (int) motionEvent.getY(i6));
                    View view2 = this.f3397t;
                    if (h11 == view2 && t(pointerId5, view2)) {
                        i = this.f3381c;
                        break;
                    }
                }
                i6++;
            }
            if (i == -1) {
                l();
            }
        }
        e(pointerId4);
    }

    public final void l() {
        VelocityTracker velocityTracker = this.f3389l;
        float f3 = this.f3390m;
        velocityTracker.computeCurrentVelocity(1000, f3);
        float xVelocity = this.f3389l.getXVelocity(this.f3381c);
        float f9 = this.f3391n;
        float abs = Math.abs(xVelocity);
        if (abs < f9) {
            xVelocity = 0.0f;
        } else if (abs > f3) {
            xVelocity = xVelocity > 0.0f ? f3 : -f3;
        }
        float yVelocity = this.f3389l.getYVelocity(this.f3381c);
        float f10 = this.f3391n;
        float abs2 = Math.abs(yVelocity);
        if (abs2 < f10) {
            f3 = 0.0f;
        } else if (abs2 <= f3) {
            f3 = yVelocity;
        } else if (yVelocity <= 0.0f) {
            f3 = -f3;
        }
        this.f3398u = true;
        this.f3396s.onViewReleased(this.f3397t, xVelocity, f3);
        this.f3398u = false;
        if (this.f3379a == 1) {
            p(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r4v3, types: [W.d] */
    public final void m(int i, float f3, float f9) {
        boolean c9 = c(f3, f9, i, 1);
        boolean z3 = c9;
        if (c(f9, f3, i, 4)) {
            z3 = (c9 ? 1 : 0) | 4;
        }
        boolean z6 = z3;
        if (c(f3, f9, i, 2)) {
            z6 = (z3 ? 1 : 0) | 2;
        }
        ?? r02 = z6;
        if (c(f9, f3, i, 8)) {
            r02 = (z6 ? 1 : 0) | 8;
        }
        if (r02 != 0) {
            int[] iArr = this.i;
            iArr[i] = iArr[i] | r02;
            this.f3396s.onEdgeDragStarted(r02, i);
        }
    }

    public final void n(int i, float f3, float f9) {
        float[] fArr = this.f3382d;
        if (fArr == null || fArr.length <= i) {
            int i6 = i + 1;
            float[] fArr2 = new float[i6];
            float[] fArr3 = new float[i6];
            float[] fArr4 = new float[i6];
            float[] fArr5 = new float[i6];
            int[] iArr = new int[i6];
            int[] iArr2 = new int[i6];
            int[] iArr3 = new int[i6];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f3383e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f3384f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f3385g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f3386h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f3387j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f3382d = fArr2;
            this.f3383e = fArr3;
            this.f3384f = fArr4;
            this.f3385g = fArr5;
            this.f3386h = iArr;
            this.i = iArr2;
            this.f3387j = iArr3;
        }
        float[] fArr9 = this.f3382d;
        this.f3384f[i] = f3;
        fArr9[i] = f3;
        float[] fArr10 = this.f3383e;
        this.f3385g[i] = f9;
        fArr10[i] = f9;
        int[] iArr7 = this.f3386h;
        int i9 = (int) f3;
        int i10 = (int) f9;
        ViewGroup viewGroup = this.f3399v;
        int i11 = i9 < viewGroup.getLeft() + this.f3392o ? 1 : 0;
        if (i10 < viewGroup.getTop() + this.f3392o) {
            i11 |= 4;
        }
        if (i9 > viewGroup.getRight() - this.f3392o) {
            i11 |= 2;
        }
        if (i10 > viewGroup.getBottom() - this.f3392o) {
            i11 |= 8;
        }
        iArr7[i] = i11;
        this.f3388k = (1 << i) | this.f3388k;
    }

    public final void o(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (j(pointerId)) {
                float x9 = motionEvent.getX(i);
                float y7 = motionEvent.getY(i);
                this.f3384f[pointerId] = x9;
                this.f3385g[pointerId] = y7;
            }
        }
    }

    public final void p(int i) {
        this.f3399v.removeCallbacks(this.f3400w);
        if (this.f3379a != i) {
            this.f3379a = i;
            this.f3396s.onViewDragStateChanged(i);
            if (this.f3379a == 0) {
                this.f3397t = null;
            }
        }
    }

    public final boolean q(int i, int i6) {
        if (this.f3398u) {
            return i(i, i6, (int) this.f3389l.getXVelocity(this.f3381c), (int) this.f3389l.getYVelocity(this.f3381c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d5, code lost:
    
        if (r13 != r12) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean r(MotionEvent motionEvent) {
        View h9;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f3389l == null) {
            this.f3389l = VelocityTracker.obtain();
        }
        this.f3389l.addMovement(motionEvent);
        d dVar = this.f3396s;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 5) {
                            int pointerId = motionEvent.getPointerId(actionIndex);
                            float x9 = motionEvent.getX(actionIndex);
                            float y7 = motionEvent.getY(actionIndex);
                            n(pointerId, x9, y7);
                            int i = this.f3379a;
                            if (i == 0) {
                                int i6 = this.f3386h[pointerId] & this.f3394q;
                                if (i6 != 0) {
                                    dVar.onEdgeTouched(i6, pointerId);
                                }
                            } else if (i == 2 && (h9 = h((int) x9, (int) y7)) == this.f3397t) {
                                t(pointerId, h9);
                            }
                        } else if (actionMasked == 6) {
                            e(motionEvent.getPointerId(actionIndex));
                        }
                    }
                } else if (this.f3382d != null && this.f3383e != null) {
                    int pointerCount = motionEvent.getPointerCount();
                    for (int i9 = 0; i9 < pointerCount; i9++) {
                        int pointerId2 = motionEvent.getPointerId(i9);
                        if (j(pointerId2)) {
                            float x10 = motionEvent.getX(i9);
                            float y9 = motionEvent.getY(i9);
                            float f3 = x10 - this.f3382d[pointerId2];
                            float f9 = y9 - this.f3383e[pointerId2];
                            View h10 = h((int) x10, (int) y9);
                            boolean z3 = h10 != null && d(h10, f3, f9);
                            if (z3) {
                                int left = h10.getLeft();
                                int i10 = (int) f3;
                                int clampViewPositionHorizontal = dVar.clampViewPositionHorizontal(h10, left + i10, i10);
                                int top = h10.getTop();
                                int i11 = (int) f9;
                                int clampViewPositionVertical = dVar.clampViewPositionVertical(h10, top + i11, i11);
                                int viewHorizontalDragRange = dVar.getViewHorizontalDragRange(h10);
                                int viewVerticalDragRange = dVar.getViewVerticalDragRange(h10);
                                if (viewHorizontalDragRange != 0) {
                                    if (viewHorizontalDragRange > 0) {
                                    }
                                }
                                if (viewVerticalDragRange == 0) {
                                    break;
                                }
                                if (viewVerticalDragRange > 0 && clampViewPositionVertical == top) {
                                    break;
                                }
                            }
                            m(pointerId2, f3, f9);
                            if (this.f3379a == 1) {
                                break;
                            }
                            if (z3 && t(pointerId2, h10)) {
                                break;
                            }
                        }
                    }
                    o(motionEvent);
                }
            }
            a();
        } else {
            float x11 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int pointerId3 = motionEvent.getPointerId(0);
            n(pointerId3, x11, y10);
            View h11 = h((int) x11, (int) y10);
            if (h11 == this.f3397t && this.f3379a == 2) {
                t(pointerId3, h11);
            }
            int i12 = this.f3386h[pointerId3] & this.f3394q;
            if (i12 != 0) {
                dVar.onEdgeTouched(i12, pointerId3);
            }
        }
        return this.f3379a == 1;
    }

    public final boolean s(int i, int i6, View view) {
        this.f3397t = view;
        this.f3381c = -1;
        boolean i9 = i(i, i6, 0, 0);
        if (!i9 && this.f3379a == 0 && this.f3397t != null) {
            this.f3397t = null;
        }
        return i9;
    }

    public final boolean t(int i, View view) {
        if (view == this.f3397t && this.f3381c == i) {
            return true;
        }
        if (view == null || !this.f3396s.tryCaptureView(view, i)) {
            return false;
        }
        this.f3381c = i;
        b(i, view);
        return true;
    }
}
