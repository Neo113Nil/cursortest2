package g;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.view.menu.ActionMenuItemView;
import h.AbstractC0229z;
import h.C0210f;
import h.C0211g;
import h.C0212h;
import h.C0213i;
import h.RunnableC0195B;

/* loaded from: classes.dex */
public final class a implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final float f2998a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2999b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3000c;

    /* renamed from: d, reason: collision with root package name */
    public final View f3001d;

    /* renamed from: e, reason: collision with root package name */
    public RunnableC0195B f3002e;

    /* renamed from: f, reason: collision with root package name */
    public RunnableC0195B f3003f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3004g;

    /* renamed from: h, reason: collision with root package name */
    public int f3005h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f3006i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f3007j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ View f3008k;

    public a(View view) {
        this.f3006i = new int[2];
        this.f3001d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f2998a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f2999b = tapTimeout;
        this.f3000c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        RunnableC0195B runnableC0195B = this.f3003f;
        View view = this.f3001d;
        if (runnableC0195B != null) {
            view.removeCallbacks(runnableC0195B);
        }
        RunnableC0195B runnableC0195B2 = this.f3002e;
        if (runnableC0195B2 != null) {
            view.removeCallbacks(runnableC0195B2);
        }
    }

    public final l b() {
        C0210f c0210f;
        switch (this.f3007j) {
            case 0:
                b bVar = ((ActionMenuItemView) this.f3008k).f2044j;
                if (bVar == null || (c0210f = ((C0211g) bVar).f3249a.f3270s) == null) {
                    return null;
                }
                return c0210f.a();
            default:
                C0210f c0210f2 = ((C0212h) this.f3008k).f3251c.f3269r;
                if (c0210f2 == null) {
                    return null;
                }
                return c0210f2.a();
        }
    }

    public final boolean c() {
        l b2;
        switch (this.f3007j) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f3008k;
                i iVar = actionMenuItemView.f2042h;
                return iVar != null && iVar.a(actionMenuItemView.f2039e) && (b2 = b()) != null && b2.i();
            default:
                ((C0212h) this.f3008k).f3251c.j();
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
        AbstractC0229z abstractC0229z;
        boolean z4 = this.f3004g;
        View view2 = this.f3001d;
        if (z4) {
            l b2 = b();
            if (b2 != null && b2.i() && (abstractC0229z = (AbstractC0229z) b2.j()) != null && abstractC0229z.isShown()) {
                MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f3006i;
                view2.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                abstractC0229z.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean b3 = abstractC0229z.b(this.f3005h, obtainNoHistory);
                obtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z5 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (b3) {
                }
            }
            switch (this.f3007j) {
                case 1:
                    C0213i c0213i = ((C0212h) this.f3008k).f3251c;
                    if (c0213i.t == null) {
                        c0213i.i();
                        z3 = true;
                        break;
                    } else {
                        z3 = false;
                        break;
                    }
                default:
                    l b4 = b();
                    if (b4 != null && b4.i()) {
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
                            int findPointerIndex = motionEvent.findPointerIndex(this.f3005h);
                            if (findPointerIndex >= 0) {
                                float x2 = motionEvent.getX(findPointerIndex);
                                float y2 = motionEvent.getY(findPointerIndex);
                                float f2 = this.f2998a;
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
                    this.f3005h = motionEvent.getPointerId(0);
                    if (this.f3002e == null) {
                        this.f3002e = new RunnableC0195B(this, 0);
                    }
                    view2.postDelayed(this.f3002e, this.f2999b);
                    if (this.f3003f == null) {
                        this.f3003f = new RunnableC0195B(this, 1);
                    }
                    view2.postDelayed(this.f3003f, this.f3000c);
                }
            }
            z2 = false;
            if (z2) {
            }
        }
        this.f3004g = z2;
        return z2 || z4;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f3004g = false;
        this.f3005h = -1;
        RunnableC0195B runnableC0195B = this.f3002e;
        if (runnableC0195B != null) {
            this.f3001d.removeCallbacks(runnableC0195B);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(ActionMenuItemView actionMenuItemView) {
        this((View) actionMenuItemView);
        this.f3007j = 0;
        this.f3008k = actionMenuItemView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(C0212h c0212h, C0212h c0212h2) {
        this(c0212h2);
        this.f3007j = 1;
        this.f3008k = c0212h;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
