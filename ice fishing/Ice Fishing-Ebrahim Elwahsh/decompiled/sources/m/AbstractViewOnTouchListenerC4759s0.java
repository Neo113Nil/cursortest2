package m;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import l.InterfaceC4670B;

/* renamed from: m.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC4759s0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: A, reason: collision with root package name */
    public int f39495A;

    /* renamed from: B, reason: collision with root package name */
    public final int[] f39496B = new int[2];

    /* renamed from: n, reason: collision with root package name */
    public final float f39497n;

    /* renamed from: u, reason: collision with root package name */
    public final int f39498u;

    /* renamed from: v, reason: collision with root package name */
    public final int f39499v;

    /* renamed from: w, reason: collision with root package name */
    public final View f39500w;

    /* renamed from: x, reason: collision with root package name */
    public RunnableC4757r0 f39501x;

    /* renamed from: y, reason: collision with root package name */
    public RunnableC4757r0 f39502y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f39503z;

    public AbstractViewOnTouchListenerC4759s0(View view) {
        this.f39500w = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f39497n = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f39498u = tapTimeout;
        this.f39499v = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        RunnableC4757r0 runnableC4757r0 = this.f39502y;
        View view = this.f39500w;
        if (runnableC4757r0 != null) {
            view.removeCallbacks(runnableC4757r0);
        }
        RunnableC4757r0 runnableC4757r02 = this.f39501x;
        if (runnableC4757r02 != null) {
            view.removeCallbacks(runnableC4757r02);
        }
    }

    public abstract InterfaceC4670B b();

    public abstract boolean c();

    public boolean d() {
        InterfaceC4670B b9 = b();
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
        boolean z8;
        C4754p0 f6;
        boolean z9 = this.f39503z;
        View view2 = this.f39500w;
        if (z9) {
            InterfaceC4670B b9 = b();
            if (b9 != null && b9.a() && (f6 = b9.f()) != null && f6.isShown()) {
                MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f39496B;
                view2.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                f6.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean b10 = f6.b(obtainNoHistory, this.f39495A);
                obtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z10 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (b10) {
                }
            }
            if (d()) {
                z8 = false;
            }
            z8 = true;
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 != 0) {
                    if (actionMasked2 != 1) {
                        if (actionMasked2 == 2) {
                            int findPointerIndex = motionEvent.findPointerIndex(this.f39495A);
                            if (findPointerIndex >= 0) {
                                float x3 = motionEvent.getX(findPointerIndex);
                                float y6 = motionEvent.getY(findPointerIndex);
                                float f9 = this.f39497n;
                                float f10 = -f9;
                                if (x3 < f10 || y6 < f10 || x3 >= (view2.getRight() - view2.getLeft()) + f9 || y6 >= (view2.getBottom() - view2.getTop()) + f9) {
                                    a();
                                    view2.getParent().requestDisallowInterceptTouchEvent(true);
                                    if (c()) {
                                        z8 = true;
                                        if (z8) {
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
                    this.f39495A = motionEvent.getPointerId(0);
                    if (this.f39501x == null) {
                        this.f39501x = new RunnableC4757r0(this, 0);
                    }
                    view2.postDelayed(this.f39501x, this.f39498u);
                    if (this.f39502y == null) {
                        this.f39502y = new RunnableC4757r0(this, 1);
                    }
                    view2.postDelayed(this.f39502y, this.f39499v);
                }
            }
            z8 = false;
            if (z8) {
            }
        }
        this.f39503z = z8;
        return z8 || z9;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f39503z = false;
        this.f39495A = -1;
        RunnableC4757r0 runnableC4757r0 = this.f39501x;
        if (runnableC4757r0 != null) {
            this.f39500w.removeCallbacks(runnableC4757r0);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
