package m;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import l.InterfaceC4641C;

/* renamed from: m.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC4711s0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: A, reason: collision with root package name */
    public int f39224A;

    /* renamed from: B, reason: collision with root package name */
    public final int[] f39225B = new int[2];

    /* renamed from: n, reason: collision with root package name */
    public final float f39226n;

    /* renamed from: u, reason: collision with root package name */
    public final int f39227u;

    /* renamed from: v, reason: collision with root package name */
    public final int f39228v;

    /* renamed from: w, reason: collision with root package name */
    public final View f39229w;

    /* renamed from: x, reason: collision with root package name */
    public RunnableC4709r0 f39230x;

    /* renamed from: y, reason: collision with root package name */
    public RunnableC4709r0 f39231y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f39232z;

    public AbstractViewOnTouchListenerC4711s0(View view) {
        this.f39229w = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f39226n = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f39227u = tapTimeout;
        this.f39228v = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        RunnableC4709r0 runnableC4709r0 = this.f39231y;
        View view = this.f39229w;
        if (runnableC4709r0 != null) {
            view.removeCallbacks(runnableC4709r0);
        }
        RunnableC4709r0 runnableC4709r02 = this.f39230x;
        if (runnableC4709r02 != null) {
            view.removeCallbacks(runnableC4709r02);
        }
    }

    public abstract InterfaceC4641C b();

    public abstract boolean c();

    public boolean d() {
        InterfaceC4641C b9 = b();
        if (b9 == null || !b9.a()) {
            return true;
        }
        b9.dismiss();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        if (r14 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007b, code lost:
    
        if (r4 != 3) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0100  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z3;
        C4706p0 f3;
        boolean z6 = this.f39232z;
        View view2 = this.f39229w;
        if (z6) {
            InterfaceC4641C b9 = b();
            if (b9 != null && b9.a() && (f3 = b9.f()) != null && f3.isShown()) {
                MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f39225B;
                view2.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                f3.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean b10 = f3.b(obtainNoHistory, this.f39224A);
                obtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z9 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (b10) {
                }
            }
            if (d()) {
                z3 = false;
            }
            z3 = true;
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 != 0) {
                    if (actionMasked2 != 1) {
                        if (actionMasked2 == 2) {
                            int findPointerIndex = motionEvent.findPointerIndex(this.f39224A);
                            if (findPointerIndex >= 0) {
                                float x9 = motionEvent.getX(findPointerIndex);
                                float y7 = motionEvent.getY(findPointerIndex);
                                float f9 = this.f39226n;
                                float f10 = -f9;
                                if (x9 < f10 || y7 < f10 || x9 >= (view2.getRight() - view2.getLeft()) + f9 || y7 >= (view2.getBottom() - view2.getTop()) + f9) {
                                    a();
                                    view2.getParent().requestDisallowInterceptTouchEvent(true);
                                    if (c()) {
                                        z3 = true;
                                        if (z3) {
                                            long uptimeMillis = SystemClock.uptimeMillis();
                                            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                                            view2.onTouchEvent(obtain);
                                            obtain.recycle();
                                        }
                                    }
                                }
                            }
                        }
                    }
                    a();
                } else {
                    this.f39224A = motionEvent.getPointerId(0);
                    if (this.f39230x == null) {
                        this.f39230x = new RunnableC4709r0(this, 0);
                    }
                    view2.postDelayed(this.f39230x, this.f39227u);
                    if (this.f39231y == null) {
                        this.f39231y = new RunnableC4709r0(this, 1);
                    }
                    view2.postDelayed(this.f39231y, this.f39228v);
                }
            }
            z3 = false;
            if (z3) {
            }
        }
        this.f39232z = z3;
        return z3 || z6;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f39232z = false;
        this.f39224A = -1;
        RunnableC4709r0 runnableC4709r0 = this.f39230x;
        if (runnableC4709r0 != null) {
            this.f39229w.removeCallbacks(runnableC4709r0);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
