package m;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import l.InterfaceC0214C;

/* renamed from: m.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC0282u0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final float f4029a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4030b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4031c;

    /* renamed from: d, reason: collision with root package name */
    public final View f4032d;
    public RunnableC0280t0 e;

    /* renamed from: f, reason: collision with root package name */
    public RunnableC0280t0 f4033f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4034g;

    /* renamed from: h, reason: collision with root package name */
    public int f4035h;
    public final int[] i = new int[2];

    public AbstractViewOnTouchListenerC0282u0(View view) {
        this.f4032d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f4029a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f4030b = tapTimeout;
        this.f4031c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        RunnableC0280t0 runnableC0280t0 = this.f4033f;
        View view = this.f4032d;
        if (runnableC0280t0 != null) {
            view.removeCallbacks(runnableC0280t0);
        }
        RunnableC0280t0 runnableC0280t02 = this.e;
        if (runnableC0280t02 != null) {
            view.removeCallbacks(runnableC0280t02);
        }
    }

    public abstract InterfaceC0214C b();

    public abstract boolean c();

    public boolean d() {
        InterfaceC0214C b2 = b();
        if (b2 == null || !b2.a()) {
            return true;
        }
        b2.dismiss();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        if (r14 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007b, code lost:
    
        if (r4 != 3) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0100  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z2;
        C0276r0 g2;
        boolean z3 = this.f4034g;
        View view2 = this.f4032d;
        if (z3) {
            InterfaceC0214C b2 = b();
            if (b2 != null && b2.a() && (g2 = b2.g()) != null && g2.isShown()) {
                MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.i;
                view2.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                g2.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean b3 = g2.b(obtainNoHistory, this.f4035h);
                obtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z4 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (b3) {
                }
            }
            if (d()) {
                z2 = false;
            }
            z2 = true;
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 != 0) {
                    if (actionMasked2 != 1) {
                        if (actionMasked2 == 2) {
                            int findPointerIndex = motionEvent.findPointerIndex(this.f4035h);
                            if (findPointerIndex >= 0) {
                                float x2 = motionEvent.getX(findPointerIndex);
                                float y2 = motionEvent.getY(findPointerIndex);
                                float f2 = this.f4029a;
                                float f3 = -f2;
                                if (x2 < f3 || y2 < f3 || x2 >= (view2.getRight() - view2.getLeft()) + f2 || y2 >= (view2.getBottom() - view2.getTop()) + f2) {
                                    a();
                                    view2.getParent().requestDisallowInterceptTouchEvent(true);
                                    if (c()) {
                                        z2 = true;
                                        if (z2) {
                                            long uptimeMillis = SystemClock.uptimeMillis();
                                            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, RecyclerView.f2111C0, RecyclerView.f2111C0, 0);
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
                    this.f4035h = motionEvent.getPointerId(0);
                    if (this.e == null) {
                        this.e = new RunnableC0280t0(this, 0);
                    }
                    view2.postDelayed(this.e, this.f4030b);
                    if (this.f4033f == null) {
                        this.f4033f = new RunnableC0280t0(this, 1);
                    }
                    view2.postDelayed(this.f4033f, this.f4031c);
                }
            }
            z2 = false;
            if (z2) {
            }
        }
        this.f4034g = z2;
        return z2 || z3;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f4034g = false;
        this.f4035h = -1;
        RunnableC0280t0 runnableC0280t0 = this.e;
        if (runnableC0280t0 != null) {
            this.f4032d.removeCallbacks(runnableC0280t0);
        }
    }
}
