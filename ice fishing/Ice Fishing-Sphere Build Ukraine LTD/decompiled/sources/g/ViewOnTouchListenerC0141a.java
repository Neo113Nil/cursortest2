package g;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.view.menu.ActionMenuItemView;
import h.AbstractC0150A;
import h.C0162f;
import h.C0163g;
import h.C0164h;
import h.C0165i;
import h.RunnableC0152C;

/* renamed from: g.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC0141a implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final float f1919a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1920b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1921c;

    /* renamed from: d, reason: collision with root package name */
    public final View f1922d;

    /* renamed from: e, reason: collision with root package name */
    public RunnableC0152C f1923e;

    /* renamed from: f, reason: collision with root package name */
    public RunnableC0152C f1924f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1925g;

    /* renamed from: h, reason: collision with root package name */
    public int f1926h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f1927i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1928j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ View f1929k;

    public ViewOnTouchListenerC0141a(View view) {
        this.f1927i = new int[2];
        this.f1922d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1919a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f1920b = tapTimeout;
        this.f1921c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        RunnableC0152C runnableC0152C = this.f1924f;
        View view = this.f1922d;
        if (runnableC0152C != null) {
            view.removeCallbacks(runnableC0152C);
        }
        RunnableC0152C runnableC0152C2 = this.f1923e;
        if (runnableC0152C2 != null) {
            view.removeCallbacks(runnableC0152C2);
        }
    }

    public final l b() {
        C0162f c0162f;
        switch (this.f1928j) {
            case 0:
                AbstractC0142b abstractC0142b = ((ActionMenuItemView) this.f1929k).f1091n;
                if (abstractC0142b == null || (c0162f = ((C0163g) abstractC0142b).f2186a.f2212w) == null) {
                    return null;
                }
                return c0162f.a();
            default:
                C0162f c0162f2 = ((C0164h) this.f1929k).f2187g.f2211v;
                if (c0162f2 == null) {
                    return null;
                }
                return c0162f2.a();
        }
    }

    public final boolean c() {
        l b2;
        switch (this.f1928j) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f1929k;
                i iVar = actionMenuItemView.f1089l;
                return iVar != null && iVar.a(actionMenuItemView.f1086i) && (b2 = b()) != null && b2.c();
            default:
                ((C0164h) this.f1929k).f2187g.f();
                return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
    
        if (r14 != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009f, code lost:
    
        if (r4 != 3) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0124  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z2;
        boolean z3;
        AbstractC0150A abstractC0150A;
        boolean z4 = this.f1925g;
        View view2 = this.f1922d;
        if (z4) {
            l b2 = b();
            if (b2 != null && b2.c() && (abstractC0150A = (AbstractC0150A) b2.e()) != null && abstractC0150A.isShown()) {
                MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f1927i;
                view2.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                abstractC0150A.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean b3 = abstractC0150A.b(this.f1926h, obtainNoHistory);
                obtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z5 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (b3) {
                }
            }
            switch (this.f1928j) {
                case 1:
                    C0165i c0165i = ((C0164h) this.f1929k).f2187g;
                    if (c0165i.f2213x == null) {
                        c0165i.e();
                        z3 = true;
                        break;
                    } else {
                        z3 = false;
                        break;
                    }
                default:
                    l b4 = b();
                    if (b4 != null && b4.c()) {
                        b4.dismiss();
                    }
                    z3 = true;
                    break;
            }
            if (z3) {
                z2 = false;
            }
            z2 = true;
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 != 0) {
                    if (actionMasked2 != 1) {
                        if (actionMasked2 == 2) {
                            int findPointerIndex = motionEvent.findPointerIndex(this.f1926h);
                            if (findPointerIndex >= 0) {
                                float x2 = motionEvent.getX(findPointerIndex);
                                float y2 = motionEvent.getY(findPointerIndex);
                                float f2 = this.f1919a;
                                float f3 = -f2;
                                if (x2 < f3 || y2 < f3 || x2 >= (view2.getRight() - view2.getLeft()) + f2 || y2 >= (view2.getBottom() - view2.getTop()) + f2) {
                                    a();
                                    view2.getParent().requestDisallowInterceptTouchEvent(true);
                                    if (c()) {
                                        z2 = true;
                                        if (z2) {
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
                    this.f1926h = motionEvent.getPointerId(0);
                    if (this.f1923e == null) {
                        this.f1923e = new RunnableC0152C(this, 0);
                    }
                    view2.postDelayed(this.f1923e, this.f1920b);
                    if (this.f1924f == null) {
                        this.f1924f = new RunnableC0152C(this, 1);
                    }
                    view2.postDelayed(this.f1924f, this.f1921c);
                }
            }
            z2 = false;
            if (z2) {
            }
        }
        this.f1925g = z2;
        return z2 || z4;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f1925g = false;
        this.f1926h = -1;
        RunnableC0152C runnableC0152C = this.f1923e;
        if (runnableC0152C != null) {
            this.f1922d.removeCallbacks(runnableC0152C);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewOnTouchListenerC0141a(ActionMenuItemView actionMenuItemView) {
        this((View) actionMenuItemView);
        this.f1928j = 0;
        this.f1929k = actionMenuItemView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewOnTouchListenerC0141a(C0164h c0164h, C0164h c0164h2) {
        this(c0164h2);
        this.f1928j = 1;
        this.f1929k = c0164h;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
