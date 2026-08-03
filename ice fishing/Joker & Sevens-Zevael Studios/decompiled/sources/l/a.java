package l;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.view.menu.ActionMenuItemView;
import com.onesignal.inAppMessages.internal.display.impl.a;
import m.e0;
import m.g0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: g, reason: collision with root package name */
    public final float f3648g;

    /* renamed from: h, reason: collision with root package name */
    public final int f3649h;

    /* renamed from: i, reason: collision with root package name */
    public final int f3650i;

    /* renamed from: j, reason: collision with root package name */
    public final View f3651j;

    /* renamed from: k, reason: collision with root package name */
    public g0 f3652k;

    /* renamed from: l, reason: collision with root package name */
    public g0 f3653l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3654m;

    /* renamed from: n, reason: collision with root package name */
    public int f3655n;

    /* renamed from: o, reason: collision with root package name */
    public final int[] f3656o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f3657p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ View f3658q;

    public a(View view) {
        this.f3656o = new int[2];
        this.f3651j = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f3648g = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f3649h = tapTimeout;
        this.f3650i = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        g0 g0Var = this.f3653l;
        View view = this.f3651j;
        if (g0Var != null) {
            view.removeCallbacks(g0Var);
        }
        g0 g0Var2 = this.f3652k;
        if (g0Var2 != null) {
            view.removeCallbacks(g0Var2);
        }
    }

    public final j b() {
        m.f fVar;
        switch (this.f3657p) {
            case 0:
                b bVar = ((ActionMenuItemView) this.f3658q).f357q;
                if (bVar == null || (fVar = ((m.g) bVar).f4297a.f4330y) == null) {
                    return null;
                }
                return fVar.a();
            default:
                m.f fVar2 = ((m.h) this.f3658q).f4306i.f4329x;
                if (fVar2 == null) {
                    return null;
                }
                return fVar2.a();
        }
    }

    public final boolean c() {
        j b2;
        switch (this.f3657p) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f3658q;
                g gVar = actionMenuItemView.f355o;
                return gVar != null && gVar.a(actionMenuItemView.f352l) && (b2 = b()) != null && b2.j();
            default:
                ((m.h) this.f3658q).f4306i.j();
                return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
    
        if (r14 != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x009f, code lost:
    
        if (r4 != 3) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0124  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        e0 e0Var;
        boolean z12 = this.f3654m;
        View view2 = this.f3651j;
        if (z12) {
            j b2 = b();
            if (b2 != null && b2.j() && (e0Var = (e0) b2.d()) != null && e0Var.isShown()) {
                MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f3656o;
                view2.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                e0Var.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean b10 = e0Var.b(obtainNoHistory, this.f3655n);
                obtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z13 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (b10) {
                }
            }
            switch (this.f3657p) {
                case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                    m.i iVar = ((m.h) this.f3658q).f4306i;
                    if (iVar.f4331z == null) {
                        iVar.d();
                        z11 = true;
                        break;
                    } else {
                        z11 = false;
                        break;
                    }
                default:
                    j b11 = b();
                    if (b11 != null && b11.j()) {
                        b11.dismiss();
                    }
                    z11 = true;
                    break;
            }
            if (z11) {
                z10 = false;
            }
            z10 = true;
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 != 0) {
                    if (actionMasked2 != 1) {
                        if (actionMasked2 == 2) {
                            int findPointerIndex = motionEvent.findPointerIndex(this.f3655n);
                            if (findPointerIndex >= 0) {
                                float x10 = motionEvent.getX(findPointerIndex);
                                float y10 = motionEvent.getY(findPointerIndex);
                                float f10 = this.f3648g;
                                float f11 = -f10;
                                if (x10 < f11 || y10 < f11 || x10 >= (view2.getRight() - view2.getLeft()) + f10 || y10 >= (view2.getBottom() - view2.getTop()) + f10) {
                                    a();
                                    view2.getParent().requestDisallowInterceptTouchEvent(true);
                                    if (c()) {
                                        z10 = true;
                                        if (z10) {
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
                    this.f3655n = motionEvent.getPointerId(0);
                    if (this.f3652k == null) {
                        this.f3652k = new g0(this, 0);
                    }
                    view2.postDelayed(this.f3652k, this.f3649h);
                    if (this.f3653l == null) {
                        this.f3653l = new g0(this, 1);
                    }
                    view2.postDelayed(this.f3653l, this.f3650i);
                }
            }
            z10 = false;
            if (z10) {
            }
        }
        this.f3654m = z10;
        return z10 || z12;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f3654m = false;
        this.f3655n = -1;
        g0 g0Var = this.f3652k;
        if (g0Var != null) {
            this.f3651j.removeCallbacks(g0Var);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(ActionMenuItemView actionMenuItemView) {
        this((View) actionMenuItemView);
        this.f3657p = 0;
        this.f3658q = actionMenuItemView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(m.h hVar, m.h hVar2) {
        this(hVar2);
        this.f3657p = 1;
        this.f3658q = hVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
