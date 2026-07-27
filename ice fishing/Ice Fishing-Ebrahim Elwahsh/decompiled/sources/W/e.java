package W;

import F3.C;
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
    public static final G0.b f3390x = new G0.b(1);

    /* renamed from: a, reason: collision with root package name */
    public int f3391a;

    /* renamed from: b, reason: collision with root package name */
    public int f3392b;

    /* renamed from: d, reason: collision with root package name */
    public float[] f3394d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f3395e;

    /* renamed from: f, reason: collision with root package name */
    public float[] f3396f;

    /* renamed from: g, reason: collision with root package name */
    public float[] f3397g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f3398h;
    public int[] i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f3399j;

    /* renamed from: k, reason: collision with root package name */
    public int f3400k;

    /* renamed from: l, reason: collision with root package name */
    public VelocityTracker f3401l;

    /* renamed from: m, reason: collision with root package name */
    public final float f3402m;

    /* renamed from: n, reason: collision with root package name */
    public float f3403n;

    /* renamed from: o, reason: collision with root package name */
    public int f3404o;

    /* renamed from: p, reason: collision with root package name */
    public final int f3405p;

    /* renamed from: q, reason: collision with root package name */
    public int f3406q;

    /* renamed from: r, reason: collision with root package name */
    public final OverScroller f3407r;

    /* renamed from: s, reason: collision with root package name */
    public final d f3408s;

    /* renamed from: t, reason: collision with root package name */
    public View f3409t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f3410u;

    /* renamed from: v, reason: collision with root package name */
    public final ViewGroup f3411v;

    /* renamed from: c, reason: collision with root package name */
    public int f3393c = -1;

    /* renamed from: w, reason: collision with root package name */
    public final C f3412w = new C(10, this);

    public e(Context context, ViewGroup viewGroup, d dVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (dVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f3411v = viewGroup;
        this.f3408s = dVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f3405p = i;
        this.f3404o = i;
        this.f3392b = viewConfiguration.getScaledTouchSlop();
        this.f3402m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f3403n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f3407r = new OverScroller(context, f3390x);
    }

    public final void a() {
        this.f3393c = -1;
        float[] fArr = this.f3394d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f3395e, 0.0f);
            Arrays.fill(this.f3396f, 0.0f);
            Arrays.fill(this.f3397g, 0.0f);
            Arrays.fill(this.f3398h, 0);
            Arrays.fill(this.i, 0);
            Arrays.fill(this.f3399j, 0);
            this.f3400k = 0;
        }
        VelocityTracker velocityTracker = this.f3401l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f3401l = null;
        }
    }

    public final void b(int i, View view) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.f3411v;
        if (parent != viewGroup) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + viewGroup + ")");
        }
        this.f3409t = view;
        this.f3393c = i;
        this.f3408s.onViewCaptured(view, i);
        p(1);
    }

    public final boolean c(float f6, float f9, int i, int i4) {
        float abs = Math.abs(f6);
        float abs2 = Math.abs(f9);
        if ((this.f3398h[i] & i4) == i4 && (this.f3406q & i4) != 0 && (this.f3399j[i] & i4) != i4 && (this.i[i] & i4) != i4) {
            float f10 = this.f3392b;
            if (abs > f10 || abs2 > f10) {
                if (abs < abs2 * 0.5f && this.f3408s.onEdgeLock(i4)) {
                    int[] iArr = this.f3399j;
                    iArr[i] = iArr[i] | i4;
                    return false;
                }
                if ((this.i[i] & i4) == 0 && abs > this.f3392b) {
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
    public final boolean d(View view, float f6, float f9) {
        if (view != null) {
            d dVar = this.f3408s;
            boolean z8 = dVar.getViewHorizontalDragRange(view) > 0;
            boolean z9 = dVar.getViewVerticalDragRange(view) > 0;
            if (z8 && z9) {
                float f10 = (f9 * f9) + (f6 * f6);
                int i = this.f3392b;
                if (f10 > i * i) {
                }
            } else if (!z8 ? !(!z9 || Math.abs(f9) <= this.f3392b) : Math.abs(f6) > this.f3392b) {
                return true;
            }
        }
        return false;
    }

    public final void e(int i) {
        float[] fArr = this.f3394d;
        if (fArr != null) {
            int i4 = this.f3400k;
            int i9 = 1 << i;
            if ((i4 & i9) != 0) {
                fArr[i] = 0.0f;
                this.f3395e[i] = 0.0f;
                this.f3396f[i] = 0.0f;
                this.f3397g[i] = 0.0f;
                this.f3398h[i] = 0;
                this.i[i] = 0;
                this.f3399j[i] = 0;
                this.f3400k = (~i9) & i4;
            }
        }
    }

    public final int f(int i, int i4, int i9) {
        if (i == 0) {
            return 0;
        }
        float width = this.f3411v.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int abs = Math.abs(i4);
        return Math.min(abs > 0 ? Math.round(Math.abs(sin / abs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i9) + 1.0f) * 256.0f), 600);
    }

    public final boolean g() {
        if (this.f3391a == 2) {
            OverScroller overScroller = this.f3407r;
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f3409t.getLeft();
            int top = currY - this.f3409t.getTop();
            if (left != 0) {
                View view = this.f3409t;
                WeakHashMap weakHashMap = X.f2240a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f3409t;
                WeakHashMap weakHashMap2 = X.f2240a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f3408s.onViewPositionChanged(this.f3409t, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.f3411v.post(this.f3412w);
            }
        }
        return this.f3391a == 2;
    }

    public final View h(int i, int i4) {
        ViewGroup viewGroup = this.f3411v;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(this.f3408s.getOrderedChildIndex(childCount));
            if (i >= childAt.getLeft() && i < childAt.getRight() && i4 >= childAt.getTop() && i4 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean i(int i, int i4, int i9, int i10) {
        float f6;
        float f9;
        float f10;
        float f11;
        int left = this.f3409t.getLeft();
        int top = this.f3409t.getTop();
        int i11 = i - left;
        int i12 = i4 - top;
        OverScroller overScroller = this.f3407r;
        if (i11 == 0 && i12 == 0) {
            overScroller.abortAnimation();
            p(0);
            return false;
        }
        View view = this.f3409t;
        int i13 = (int) this.f3403n;
        int i14 = (int) this.f3402m;
        int abs = Math.abs(i9);
        if (abs < i13) {
            i9 = 0;
        } else if (abs > i14) {
            i9 = i9 > 0 ? i14 : -i14;
        }
        int i15 = (int) this.f3403n;
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
            f6 = abs5;
            f9 = i16;
        } else {
            f6 = abs3;
            f9 = i17;
        }
        float f12 = f6 / f9;
        if (i10 != 0) {
            f10 = abs6;
            f11 = i16;
        } else {
            f10 = abs4;
            f11 = i17;
        }
        float f13 = f10 / f11;
        d dVar = this.f3408s;
        overScroller.startScroll(left, top, i11, i12, (int) ((f(i12, i10, dVar.getViewVerticalDragRange(view)) * f13) + (f(i11, i9, dVar.getViewHorizontalDragRange(view)) * f12)));
        p(2);
        return true;
    }

    public final boolean j(int i) {
        if ((this.f3400k & (1 << i)) != 0) {
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
        if (this.f3401l == null) {
            this.f3401l = VelocityTracker.obtain();
        }
        this.f3401l.addMovement(motionEvent);
        int i4 = 0;
        d dVar = this.f3408s;
        if (actionMasked == 0) {
            float x3 = motionEvent.getX();
            float y6 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View h9 = h((int) x3, (int) y6);
            n(pointerId, x3, y6);
            t(pointerId, h9);
            int i9 = this.f3398h[pointerId] & this.f3406q;
            if (i9 != 0) {
                dVar.onEdgeTouched(i9, pointerId);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f3391a == 1) {
                l();
            }
            a();
            return;
        }
        if (actionMasked == 2) {
            if (this.f3391a != 1) {
                int pointerCount = motionEvent.getPointerCount();
                while (i4 < pointerCount) {
                    int pointerId2 = motionEvent.getPointerId(i4);
                    if (j(pointerId2)) {
                        float x9 = motionEvent.getX(i4);
                        float y8 = motionEvent.getY(i4);
                        float f6 = x9 - this.f3394d[pointerId2];
                        float f9 = y8 - this.f3395e[pointerId2];
                        m(pointerId2, f6, f9);
                        if (this.f3391a != 1) {
                            View h10 = h((int) x9, (int) y8);
                            if (d(h10, f6, f9) && t(pointerId2, h10)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    i4++;
                }
                o(motionEvent);
                return;
            }
            if (j(this.f3393c)) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f3393c);
                float x10 = motionEvent.getX(findPointerIndex);
                float y9 = motionEvent.getY(findPointerIndex);
                float[] fArr = this.f3396f;
                int i10 = this.f3393c;
                int i11 = (int) (x10 - fArr[i10]);
                int i12 = (int) (y9 - this.f3397g[i10]);
                int left = this.f3409t.getLeft() + i11;
                int top = this.f3409t.getTop() + i12;
                int left2 = this.f3409t.getLeft();
                int top2 = this.f3409t.getTop();
                if (i11 != 0) {
                    left = dVar.clampViewPositionHorizontal(this.f3409t, left, i11);
                    WeakHashMap weakHashMap = X.f2240a;
                    this.f3409t.offsetLeftAndRight(left - left2);
                }
                int i13 = left;
                if (i12 != 0) {
                    top = dVar.clampViewPositionVertical(this.f3409t, top, i12);
                    WeakHashMap weakHashMap2 = X.f2240a;
                    this.f3409t.offsetTopAndBottom(top - top2);
                }
                int i14 = top;
                if (i11 != 0 || i12 != 0) {
                    this.f3408s.onViewPositionChanged(this.f3409t, i13, i14, i13 - left2, i14 - top2);
                }
                o(motionEvent);
                return;
            }
            return;
        }
        if (actionMasked == 3) {
            if (this.f3391a == 1) {
                this.f3410u = true;
                dVar.onViewReleased(this.f3409t, 0.0f, 0.0f);
                this.f3410u = false;
                if (this.f3391a == 1) {
                    p(0);
                }
            }
            a();
            return;
        }
        if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x11 = motionEvent.getX(actionIndex);
            float y10 = motionEvent.getY(actionIndex);
            n(pointerId3, x11, y10);
            if (this.f3391a == 0) {
                t(pointerId3, h((int) x11, (int) y10));
                int i15 = this.f3398h[pointerId3] & this.f3406q;
                if (i15 != 0) {
                    dVar.onEdgeTouched(i15, pointerId3);
                    return;
                }
                return;
            }
            int i16 = (int) x11;
            int i17 = (int) y10;
            View view = this.f3409t;
            if (view != null && i16 >= view.getLeft() && i16 < view.getRight() && i17 >= view.getTop() && i17 < view.getBottom()) {
                t(pointerId3, this.f3409t);
                return;
            }
            return;
        }
        if (actionMasked != 6) {
            return;
        }
        int pointerId4 = motionEvent.getPointerId(actionIndex);
        if (this.f3391a == 1 && pointerId4 == this.f3393c) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (true) {
                if (i4 >= pointerCount2) {
                    i = -1;
                    break;
                }
                int pointerId5 = motionEvent.getPointerId(i4);
                if (pointerId5 != this.f3393c) {
                    View h11 = h((int) motionEvent.getX(i4), (int) motionEvent.getY(i4));
                    View view2 = this.f3409t;
                    if (h11 == view2 && t(pointerId5, view2)) {
                        i = this.f3393c;
                        break;
                    }
                }
                i4++;
            }
            if (i == -1) {
                l();
            }
        }
        e(pointerId4);
    }

    public final void l() {
        VelocityTracker velocityTracker = this.f3401l;
        float f6 = this.f3402m;
        velocityTracker.computeCurrentVelocity(1000, f6);
        float xVelocity = this.f3401l.getXVelocity(this.f3393c);
        float f9 = this.f3403n;
        float abs = Math.abs(xVelocity);
        if (abs < f9) {
            xVelocity = 0.0f;
        } else if (abs > f6) {
            xVelocity = xVelocity > 0.0f ? f6 : -f6;
        }
        float yVelocity = this.f3401l.getYVelocity(this.f3393c);
        float f10 = this.f3403n;
        float abs2 = Math.abs(yVelocity);
        if (abs2 < f10) {
            f6 = 0.0f;
        } else if (abs2 <= f6) {
            f6 = yVelocity;
        } else if (yVelocity <= 0.0f) {
            f6 = -f6;
        }
        this.f3410u = true;
        this.f3408s.onViewReleased(this.f3409t, xVelocity, f6);
        this.f3410u = false;
        if (this.f3391a == 1) {
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
    public final void m(int i, float f6, float f9) {
        boolean c4 = c(f6, f9, i, 1);
        boolean z8 = c4;
        if (c(f9, f6, i, 4)) {
            z8 = (c4 ? 1 : 0) | 4;
        }
        boolean z9 = z8;
        if (c(f6, f9, i, 2)) {
            z9 = (z8 ? 1 : 0) | 2;
        }
        ?? r02 = z9;
        if (c(f9, f6, i, 8)) {
            r02 = (z9 ? 1 : 0) | 8;
        }
        if (r02 != 0) {
            int[] iArr = this.i;
            iArr[i] = iArr[i] | r02;
            this.f3408s.onEdgeDragStarted(r02, i);
        }
    }

    public final void n(int i, float f6, float f9) {
        float[] fArr = this.f3394d;
        if (fArr == null || fArr.length <= i) {
            int i4 = i + 1;
            float[] fArr2 = new float[i4];
            float[] fArr3 = new float[i4];
            float[] fArr4 = new float[i4];
            float[] fArr5 = new float[i4];
            int[] iArr = new int[i4];
            int[] iArr2 = new int[i4];
            int[] iArr3 = new int[i4];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f3395e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f3396f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f3397g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f3398h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f3399j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f3394d = fArr2;
            this.f3395e = fArr3;
            this.f3396f = fArr4;
            this.f3397g = fArr5;
            this.f3398h = iArr;
            this.i = iArr2;
            this.f3399j = iArr3;
        }
        float[] fArr9 = this.f3394d;
        this.f3396f[i] = f6;
        fArr9[i] = f6;
        float[] fArr10 = this.f3395e;
        this.f3397g[i] = f9;
        fArr10[i] = f9;
        int[] iArr7 = this.f3398h;
        int i9 = (int) f6;
        int i10 = (int) f9;
        ViewGroup viewGroup = this.f3411v;
        int i11 = i9 < viewGroup.getLeft() + this.f3404o ? 1 : 0;
        if (i10 < viewGroup.getTop() + this.f3404o) {
            i11 |= 4;
        }
        if (i9 > viewGroup.getRight() - this.f3404o) {
            i11 |= 2;
        }
        if (i10 > viewGroup.getBottom() - this.f3404o) {
            i11 |= 8;
        }
        iArr7[i] = i11;
        this.f3400k = (1 << i) | this.f3400k;
    }

    public final void o(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (j(pointerId)) {
                float x3 = motionEvent.getX(i);
                float y6 = motionEvent.getY(i);
                this.f3396f[pointerId] = x3;
                this.f3397g[pointerId] = y6;
            }
        }
    }

    public final void p(int i) {
        this.f3411v.removeCallbacks(this.f3412w);
        if (this.f3391a != i) {
            this.f3391a = i;
            this.f3408s.onViewDragStateChanged(i);
            if (this.f3391a == 0) {
                this.f3409t = null;
            }
        }
    }

    public final boolean q(int i, int i4) {
        if (this.f3410u) {
            return i(i, i4, (int) this.f3401l.getXVelocity(this.f3393c), (int) this.f3401l.getYVelocity(this.f3393c));
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
        if (this.f3401l == null) {
            this.f3401l = VelocityTracker.obtain();
        }
        this.f3401l.addMovement(motionEvent);
        d dVar = this.f3408s;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 5) {
                            int pointerId = motionEvent.getPointerId(actionIndex);
                            float x3 = motionEvent.getX(actionIndex);
                            float y6 = motionEvent.getY(actionIndex);
                            n(pointerId, x3, y6);
                            int i = this.f3391a;
                            if (i == 0) {
                                int i4 = this.f3398h[pointerId] & this.f3406q;
                                if (i4 != 0) {
                                    dVar.onEdgeTouched(i4, pointerId);
                                }
                            } else if (i == 2 && (h9 = h((int) x3, (int) y6)) == this.f3409t) {
                                t(pointerId, h9);
                            }
                        } else if (actionMasked == 6) {
                            e(motionEvent.getPointerId(actionIndex));
                        }
                    }
                } else if (this.f3394d != null && this.f3395e != null) {
                    int pointerCount = motionEvent.getPointerCount();
                    for (int i9 = 0; i9 < pointerCount; i9++) {
                        int pointerId2 = motionEvent.getPointerId(i9);
                        if (j(pointerId2)) {
                            float x9 = motionEvent.getX(i9);
                            float y8 = motionEvent.getY(i9);
                            float f6 = x9 - this.f3394d[pointerId2];
                            float f9 = y8 - this.f3395e[pointerId2];
                            View h10 = h((int) x9, (int) y8);
                            boolean z8 = h10 != null && d(h10, f6, f9);
                            if (z8) {
                                int left = h10.getLeft();
                                int i10 = (int) f6;
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
                            m(pointerId2, f6, f9);
                            if (this.f3391a == 1) {
                                break;
                            }
                            if (z8 && t(pointerId2, h10)) {
                                break;
                            }
                        }
                    }
                    o(motionEvent);
                }
            }
            a();
        } else {
            float x10 = motionEvent.getX();
            float y9 = motionEvent.getY();
            int pointerId3 = motionEvent.getPointerId(0);
            n(pointerId3, x10, y9);
            View h11 = h((int) x10, (int) y9);
            if (h11 == this.f3409t && this.f3391a == 2) {
                t(pointerId3, h11);
            }
            int i12 = this.f3398h[pointerId3] & this.f3406q;
            if (i12 != 0) {
                dVar.onEdgeTouched(i12, pointerId3);
            }
        }
        return this.f3391a == 1;
    }

    public final boolean s(int i, int i4, View view) {
        this.f3409t = view;
        this.f3393c = -1;
        boolean i9 = i(i, i4, 0, 0);
        if (!i9 && this.f3391a == 0 && this.f3409t != null) {
            this.f3409t = null;
        }
        return i9;
    }

    public final boolean t(int i, View view) {
        if (view == this.f3409t && this.f3393c == i) {
            return true;
        }
        if (view == null || !this.f3408s.tryCaptureView(view, i)) {
            return false;
        }
        this.f3393c = i;
        b(i, view);
        return true;
    }
}
