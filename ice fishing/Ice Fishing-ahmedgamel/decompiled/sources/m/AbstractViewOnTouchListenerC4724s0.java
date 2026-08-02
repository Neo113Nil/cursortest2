package m;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import l.InterfaceC4652C;

/* renamed from: m.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC4724s0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: A, reason: collision with root package name */
    public int f39293A;

    /* renamed from: B, reason: collision with root package name */
    public final int[] f39294B = new int[2];

    /* renamed from: n, reason: collision with root package name */
    public final float f39295n;

    /* renamed from: u, reason: collision with root package name */
    public final int f39296u;

    /* renamed from: v, reason: collision with root package name */
    public final int f39297v;

    /* renamed from: w, reason: collision with root package name */
    public final View f39298w;

    /* renamed from: x, reason: collision with root package name */
    public RunnableC4722r0 f39299x;

    /* renamed from: y, reason: collision with root package name */
    public RunnableC4722r0 f39300y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f39301z;

    public AbstractViewOnTouchListenerC4724s0(View view) {
        this.f39298w = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f39295n = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f39296u = tapTimeout;
        this.f39297v = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        RunnableC4722r0 runnableC4722r0 = this.f39300y;
        View view = this.f39298w;
        if (runnableC4722r0 != null) {
            view.removeCallbacks(runnableC4722r0);
        }
        RunnableC4722r0 runnableC4722r02 = this.f39299x;
        if (runnableC4722r02 != null) {
            view.removeCallbacks(runnableC4722r02);
        }
    }

    public abstract InterfaceC4652C b();

    public abstract boolean c();

    public boolean d() {
        InterfaceC4652C b9 = b();
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
        boolean z6;
        C4719p0 f2;
        boolean z9 = this.f39301z;
        View view2 = this.f39298w;
        if (z9) {
            InterfaceC4652C b9 = b();
            if (b9 != null && b9.a() && (f2 = b9.f()) != null && f2.isShown()) {
                MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f39294B;
                view2.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                f2.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean b10 = f2.b(obtainNoHistory, this.f39293A);
                obtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z10 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (b10) {
                }
            }
            if (d()) {
                z6 = false;
            }
            z6 = true;
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 != 0) {
                    if (actionMasked2 != 1) {
                        if (actionMasked2 == 2) {
                            int findPointerIndex = motionEvent.findPointerIndex(this.f39293A);
                            if (findPointerIndex >= 0) {
                                float x9 = motionEvent.getX(findPointerIndex);
                                float y7 = motionEvent.getY(findPointerIndex);
                                float f9 = this.f39295n;
                                float f10 = -f9;
                                if (x9 < f10 || y7 < f10 || x9 >= (view2.getRight() - view2.getLeft()) + f9 || y7 >= (view2.getBottom() - view2.getTop()) + f9) {
                                    a();
                                    view2.getParent().requestDisallowInterceptTouchEvent(true);
                                    if (c()) {
                                        z6 = true;
                                        if (z6) {
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
                    this.f39293A = motionEvent.getPointerId(0);
                    if (this.f39299x == null) {
                        this.f39299x = new RunnableC4722r0(this, 0);
                    }
                    view2.postDelayed(this.f39299x, this.f39296u);
                    if (this.f39300y == null) {
                        this.f39300y = new RunnableC4722r0(this, 1);
                    }
                    view2.postDelayed(this.f39300y, this.f39297v);
                }
            }
            z6 = false;
            if (z6) {
            }
        }
        this.f39301z = z6;
        return z6 || z9;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f39301z = false;
        this.f39293A = -1;
        RunnableC4722r0 runnableC4722r0 = this.f39299x;
        if (runnableC4722r0 != null) {
            this.f39298w.removeCallbacks(runnableC4722r0);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
