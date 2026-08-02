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
    public static final G0.b f3508x = new G0.b(1);

    /* renamed from: a, reason: collision with root package name */
    public int f3509a;

    /* renamed from: b, reason: collision with root package name */
    public int f3510b;

    /* renamed from: d, reason: collision with root package name */
    public float[] f3512d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f3513e;

    /* renamed from: f, reason: collision with root package name */
    public float[] f3514f;

    /* renamed from: g, reason: collision with root package name */
    public float[] f3515g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f3516h;
    public int[] i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f3517j;

    /* renamed from: k, reason: collision with root package name */
    public int f3518k;

    /* renamed from: l, reason: collision with root package name */
    public VelocityTracker f3519l;

    /* renamed from: m, reason: collision with root package name */
    public final float f3520m;

    /* renamed from: n, reason: collision with root package name */
    public float f3521n;

    /* renamed from: o, reason: collision with root package name */
    public int f3522o;

    /* renamed from: p, reason: collision with root package name */
    public final int f3523p;

    /* renamed from: q, reason: collision with root package name */
    public int f3524q;

    /* renamed from: r, reason: collision with root package name */
    public final OverScroller f3525r;

    /* renamed from: s, reason: collision with root package name */
    public final d f3526s;

    /* renamed from: t, reason: collision with root package name */
    public View f3527t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f3528u;

    /* renamed from: v, reason: collision with root package name */
    public final ViewGroup f3529v;

    /* renamed from: c, reason: collision with root package name */
    public int f3511c = -1;

    /* renamed from: w, reason: collision with root package name */
    public final G0.c f3530w = new G0.c(13, this);

    public e(Context context, ViewGroup viewGroup, d dVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (dVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f3529v = viewGroup;
        this.f3526s = dVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f3523p = i;
        this.f3522o = i;
        this.f3510b = viewConfiguration.getScaledTouchSlop();
        this.f3520m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f3521n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f3525r = new OverScroller(context, f3508x);
    }

    public final void a() {
        this.f3511c = -1;
        float[] fArr = this.f3512d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f3513e, 0.0f);
            Arrays.fill(this.f3514f, 0.0f);
            Arrays.fill(this.f3515g, 0.0f);
            Arrays.fill(this.f3516h, 0);
            Arrays.fill(this.i, 0);
            Arrays.fill(this.f3517j, 0);
            this.f3518k = 0;
        }
        VelocityTracker velocityTracker = this.f3519l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f3519l = null;
        }
    }

    public final void b(int i, View view) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.f3529v;
        if (parent != viewGroup) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + viewGroup + ")");
        }
        this.f3527t = view;
        this.f3511c = i;
        this.f3526s.onViewCaptured(view, i);
        p(1);
    }

    public final boolean c(float f2, float f9, int i, int i4) {
        float abs = Math.abs(f2);
        float abs2 = Math.abs(f9);
        if ((this.f3516h[i] & i4) == i4 && (this.f3524q & i4) != 0 && (this.f3517j[i] & i4) != i4 && (this.i[i] & i4) != i4) {
            float f10 = this.f3510b;
            if (abs > f10 || abs2 > f10) {
                if (abs < abs2 * 0.5f && this.f3526s.onEdgeLock(i4)) {
                    int[] iArr = this.f3517j;
                    iArr[i] = iArr[i] | i4;
                    return false;
                }
                if ((this.i[i] & i4) == 0 && abs > this.f3510b) {
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
    public final boolean d(View view, float f2, float f9) {
        if (view != null) {
            d dVar = this.f3526s;
            boolean z6 = dVar.getViewHorizontalDragRange(view) > 0;
            boolean z9 = dVar.getViewVerticalDragRange(view) > 0;
            if (z6 && z9) {
                float f10 = (f9 * f9) + (f2 * f2);
                int i = this.f3510b;
                if (f10 > i * i) {
                }
            } else if (!z6 ? !(!z9 || Math.abs(f9) <= this.f3510b) : Math.abs(f2) > this.f3510b) {
                return true;
            }
        }
        return false;
    }

    public final void e(int i) {
        float[] fArr = this.f3512d;
        if (fArr != null) {
            int i4 = this.f3518k;
            int i6 = 1 << i;
            if ((i4 & i6) != 0) {
                fArr[i] = 0.0f;
                this.f3513e[i] = 0.0f;
                this.f3514f[i] = 0.0f;
                this.f3515g[i] = 0.0f;
                this.f3516h[i] = 0;
                this.i[i] = 0;
                this.f3517j[i] = 0;
                this.f3518k = (~i6) & i4;
            }
        }
    }

    public final int f(int i, int i4, int i6) {
        if (i == 0) {
            return 0;
        }
        float width = this.f3529v.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int abs = Math.abs(i4);
        return Math.min(abs > 0 ? Math.round(Math.abs(sin / abs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i6) + 1.0f) * 256.0f), 600);
    }

    public final boolean g() {
        if (this.f3509a == 2) {
            OverScroller overScroller = this.f3525r;
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f3527t.getLeft();
            int top = currY - this.f3527t.getTop();
            if (left != 0) {
                View view = this.f3527t;
                WeakHashMap weakHashMap = X.f2142a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f3527t;
                WeakHashMap weakHashMap2 = X.f2142a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f3526s.onViewPositionChanged(this.f3527t, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.f3529v.post(this.f3530w);
            }
        }
        return this.f3509a == 2;
    }

    public final View h(int i, int i4) {
        ViewGroup viewGroup = this.f3529v;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(this.f3526s.getOrderedChildIndex(childCount));
            if (i >= childAt.getLeft() && i < childAt.getRight() && i4 >= childAt.getTop() && i4 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean i(int i, int i4, int i6, int i9) {
        float f2;
        float f9;
        float f10;
        float f11;
        int left = this.f3527t.getLeft();
        int top = this.f3527t.getTop();
        int i10 = i - left;
        int i11 = i4 - top;
        OverScroller overScroller = this.f3525r;
        if (i10 == 0 && i11 == 0) {
            overScroller.abortAnimation();
            p(0);
            return false;
        }
        View view = this.f3527t;
        int i12 = (int) this.f3521n;
        int i13 = (int) this.f3520m;
        int abs = Math.abs(i6);
        if (abs < i12) {
            i6 = 0;
        } else if (abs > i13) {
            i6 = i6 > 0 ? i13 : -i13;
        }
        int i14 = (int) this.f3521n;
        int abs2 = Math.abs(i9);
        if (abs2 < i14) {
            i9 = 0;
        } else if (abs2 > i13) {
            i9 = i9 > 0 ? i13 : -i13;
        }
        int abs3 = Math.abs(i10);
        int abs4 = Math.abs(i11);
        int abs5 = Math.abs(i6);
        int abs6 = Math.abs(i9);
        int i15 = abs5 + abs6;
        int i16 = abs3 + abs4;
        if (i6 != 0) {
            f2 = abs5;
            f9 = i15;
        } else {
            f2 = abs3;
            f9 = i16;
        }
        float f12 = f2 / f9;
        if (i9 != 0) {
            f10 = abs6;
            f11 = i15;
        } else {
            f10 = abs4;
            f11 = i16;
        }
        float f13 = f10 / f11;
        d dVar = this.f3526s;
        overScroller.startScroll(left, top, i10, i11, (int) ((f(i11, i9, dVar.getViewVerticalDragRange(view)) * f13) + (f(i10, i6, dVar.getViewHorizontalDragRange(view)) * f12)));
        p(2);
        return true;
    }

    public final boolean j(int i) {
        if ((this.f3518k & (1 << i)) != 0) {
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
        if (this.f3519l == null) {
            this.f3519l = VelocityTracker.obtain();
        }
        this.f3519l.addMovement(motionEvent);
        int i4 = 0;
        d dVar = this.f3526s;
        if (actionMasked == 0) {
            float x9 = motionEvent.getX();
            float y7 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View h3 = h((int) x9, (int) y7);
            n(pointerId, x9, y7);
            t(pointerId, h3);
            int i6 = this.f3516h[pointerId] & this.f3524q;
            if (i6 != 0) {
                dVar.onEdgeTouched(i6, pointerId);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f3509a == 1) {
                l();
            }
            a();
            return;
        }
        if (actionMasked == 2) {
            if (this.f3509a != 1) {
                int pointerCount = motionEvent.getPointerCount();
                while (i4 < pointerCount) {
                    int pointerId2 = motionEvent.getPointerId(i4);
                    if (j(pointerId2)) {
                        float x10 = motionEvent.getX(i4);
                        float y9 = motionEvent.getY(i4);
                        float f2 = x10 - this.f3512d[pointerId2];
                        float f9 = y9 - this.f3513e[pointerId2];
                        m(pointerId2, f2, f9);
                        if (this.f3509a != 1) {
                            View h9 = h((int) x10, (int) y9);
                            if (d(h9, f2, f9) && t(pointerId2, h9)) {
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
            if (j(this.f3511c)) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f3511c);
                float x11 = motionEvent.getX(findPointerIndex);
                float y10 = motionEvent.getY(findPointerIndex);
                float[] fArr = this.f3514f;
                int i9 = this.f3511c;
                int i10 = (int) (x11 - fArr[i9]);
                int i11 = (int) (y10 - this.f3515g[i9]);
                int left = this.f3527t.getLeft() + i10;
                int top = this.f3527t.getTop() + i11;
                int left2 = this.f3527t.getLeft();
                int top2 = this.f3527t.getTop();
                if (i10 != 0) {
                    left = dVar.clampViewPositionHorizontal(this.f3527t, left, i10);
                    WeakHashMap weakHashMap = X.f2142a;
                    this.f3527t.offsetLeftAndRight(left - left2);
                }
                int i12 = left;
                if (i11 != 0) {
                    top = dVar.clampViewPositionVertical(this.f3527t, top, i11);
                    WeakHashMap weakHashMap2 = X.f2142a;
                    this.f3527t.offsetTopAndBottom(top - top2);
                }
                int i13 = top;
                if (i10 != 0 || i11 != 0) {
                    this.f3526s.onViewPositionChanged(this.f3527t, i12, i13, i12 - left2, i13 - top2);
                }
                o(motionEvent);
                return;
            }
            return;
        }
        if (actionMasked == 3) {
            if (this.f3509a == 1) {
                this.f3528u = true;
                dVar.onViewReleased(this.f3527t, 0.0f, 0.0f);
                this.f3528u = false;
                if (this.f3509a == 1) {
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
            if (this.f3509a == 0) {
                t(pointerId3, h((int) x12, (int) y11));
                int i14 = this.f3516h[pointerId3] & this.f3524q;
                if (i14 != 0) {
                    dVar.onEdgeTouched(i14, pointerId3);
                    return;
                }
                return;
            }
            int i15 = (int) x12;
            int i16 = (int) y11;
            View view = this.f3527t;
            if (view != null && i15 >= view.getLeft() && i15 < view.getRight() && i16 >= view.getTop() && i16 < view.getBottom()) {
                t(pointerId3, this.f3527t);
                return;
            }
            return;
        }
        if (actionMasked != 6) {
            return;
        }
        int pointerId4 = motionEvent.getPointerId(actionIndex);
        if (this.f3509a == 1 && pointerId4 == this.f3511c) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (true) {
                if (i4 >= pointerCount2) {
                    i = -1;
                    break;
                }
                int pointerId5 = motionEvent.getPointerId(i4);
                if (pointerId5 != this.f3511c) {
                    View h10 = h((int) motionEvent.getX(i4), (int) motionEvent.getY(i4));
                    View view2 = this.f3527t;
                    if (h10 == view2 && t(pointerId5, view2)) {
                        i = this.f3511c;
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
        VelocityTracker velocityTracker = this.f3519l;
        float f2 = this.f3520m;
        velocityTracker.computeCurrentVelocity(1000, f2);
        float xVelocity = this.f3519l.getXVelocity(this.f3511c);
        float f9 = this.f3521n;
        float abs = Math.abs(xVelocity);
        if (abs < f9) {
            xVelocity = 0.0f;
        } else if (abs > f2) {
            xVelocity = xVelocity > 0.0f ? f2 : -f2;
        }
        float yVelocity = this.f3519l.getYVelocity(this.f3511c);
        float f10 = this.f3521n;
        float abs2 = Math.abs(yVelocity);
        if (abs2 < f10) {
            f2 = 0.0f;
        } else if (abs2 <= f2) {
            f2 = yVelocity;
        } else if (yVelocity <= 0.0f) {
            f2 = -f2;
        }
        this.f3528u = true;
        this.f3526s.onViewReleased(this.f3527t, xVelocity, f2);
        this.f3528u = false;
        if (this.f3509a == 1) {
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
    public final void m(int i, float f2, float f9) {
        boolean c9 = c(f2, f9, i, 1);
        boolean z6 = c9;
        if (c(f9, f2, i, 4)) {
            z6 = (c9 ? 1 : 0) | 4;
        }
        boolean z9 = z6;
        if (c(f2, f9, i, 2)) {
            z9 = (z6 ? 1 : 0) | 2;
        }
        ?? r02 = z9;
        if (c(f9, f2, i, 8)) {
            r02 = (z9 ? 1 : 0) | 8;
        }
        if (r02 != 0) {
            int[] iArr = this.i;
            iArr[i] = iArr[i] | r02;
            this.f3526s.onEdgeDragStarted(r02, i);
        }
    }

    public final void n(int i, float f2, float f9) {
        float[] fArr = this.f3512d;
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
                float[] fArr6 = this.f3513e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f3514f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f3515g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f3516h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f3517j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f3512d = fArr2;
            this.f3513e = fArr3;
            this.f3514f = fArr4;
            this.f3515g = fArr5;
            this.f3516h = iArr;
            this.i = iArr2;
            this.f3517j = iArr3;
        }
        float[] fArr9 = this.f3512d;
        this.f3514f[i] = f2;
        fArr9[i] = f2;
        float[] fArr10 = this.f3513e;
        this.f3515g[i] = f9;
        fArr10[i] = f9;
        int[] iArr7 = this.f3516h;
        int i6 = (int) f2;
        int i9 = (int) f9;
        ViewGroup viewGroup = this.f3529v;
        int i10 = i6 < viewGroup.getLeft() + this.f3522o ? 1 : 0;
        if (i9 < viewGroup.getTop() + this.f3522o) {
            i10 |= 4;
        }
        if (i6 > viewGroup.getRight() - this.f3522o) {
            i10 |= 2;
        }
        if (i9 > viewGroup.getBottom() - this.f3522o) {
            i10 |= 8;
        }
        iArr7[i] = i10;
        this.f3518k = (1 << i) | this.f3518k;
    }

    public final void o(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (j(pointerId)) {
                float x9 = motionEvent.getX(i);
                float y7 = motionEvent.getY(i);
                this.f3514f[pointerId] = x9;
                this.f3515g[pointerId] = y7;
            }
        }
    }

    public final void p(int i) {
        this.f3529v.removeCallbacks(this.f3530w);
        if (this.f3509a != i) {
            this.f3509a = i;
            this.f3526s.onViewDragStateChanged(i);
            if (this.f3509a == 0) {
                this.f3527t = null;
            }
        }
    }

    public final boolean q(int i, int i4) {
        if (this.f3528u) {
            return i(i, i4, (int) this.f3519l.getXVelocity(this.f3511c), (int) this.f3519l.getYVelocity(this.f3511c));
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
        View h3;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f3519l == null) {
            this.f3519l = VelocityTracker.obtain();
        }
        this.f3519l.addMovement(motionEvent);
        d dVar = this.f3526s;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 5) {
                            int pointerId = motionEvent.getPointerId(actionIndex);
                            float x9 = motionEvent.getX(actionIndex);
                            float y7 = motionEvent.getY(actionIndex);
                            n(pointerId, x9, y7);
                            int i = this.f3509a;
                            if (i == 0) {
                                int i4 = this.f3516h[pointerId] & this.f3524q;
                                if (i4 != 0) {
                                    dVar.onEdgeTouched(i4, pointerId);
                                }
                            } else if (i == 2 && (h3 = h((int) x9, (int) y7)) == this.f3527t) {
                                t(pointerId, h3);
                            }
                        } else if (actionMasked == 6) {
                            e(motionEvent.getPointerId(actionIndex));
                        }
                    }
                } else if (this.f3512d != null && this.f3513e != null) {
                    int pointerCount = motionEvent.getPointerCount();
                    for (int i6 = 0; i6 < pointerCount; i6++) {
                        int pointerId2 = motionEvent.getPointerId(i6);
                        if (j(pointerId2)) {
                            float x10 = motionEvent.getX(i6);
                            float y9 = motionEvent.getY(i6);
                            float f2 = x10 - this.f3512d[pointerId2];
                            float f9 = y9 - this.f3513e[pointerId2];
                            View h9 = h((int) x10, (int) y9);
                            boolean z6 = h9 != null && d(h9, f2, f9);
                            if (z6) {
                                int left = h9.getLeft();
                                int i9 = (int) f2;
                                int clampViewPositionHorizontal = dVar.clampViewPositionHorizontal(h9, left + i9, i9);
                                int top = h9.getTop();
                                int i10 = (int) f9;
                                int clampViewPositionVertical = dVar.clampViewPositionVertical(h9, top + i10, i10);
                                int viewHorizontalDragRange = dVar.getViewHorizontalDragRange(h9);
                                int viewVerticalDragRange = dVar.getViewVerticalDragRange(h9);
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
                            m(pointerId2, f2, f9);
                            if (this.f3509a == 1) {
                                break;
                            }
                            if (z6 && t(pointerId2, h9)) {
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
            View h10 = h((int) x11, (int) y10);
            if (h10 == this.f3527t && this.f3509a == 2) {
                t(pointerId3, h10);
            }
            int i11 = this.f3516h[pointerId3] & this.f3524q;
            if (i11 != 0) {
                dVar.onEdgeTouched(i11, pointerId3);
            }
        }
        return this.f3509a == 1;
    }

    public final boolean s(int i, int i4, View view) {
        this.f3527t = view;
        this.f3511c = -1;
        boolean i6 = i(i, i4, 0, 0);
        if (!i6 && this.f3509a == 0 && this.f3527t != null) {
            this.f3527t = null;
        }
        return i6;
    }

    public final boolean t(int i, View view) {
        if (view == this.f3527t && this.f3511c == i) {
            return true;
        }
        if (view == null || !this.f3526s.tryCaptureView(view, i)) {
            return false;
        }
        this.f3511c = i;
        b(i, view);
        return true;
    }
}
