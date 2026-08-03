package y1;

import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import m0.d2;
import org.fortheloss.st.R;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class a extends ViewGroup {

    /* renamed from: g, reason: collision with root package name */
    public WeakReference f8457g;

    /* renamed from: h, reason: collision with root package name */
    public IBinder f8458h;

    /* renamed from: i, reason: collision with root package name */
    public a2 f8459i;

    /* renamed from: j, reason: collision with root package name */
    public m0.v f8460j;

    /* renamed from: k, reason: collision with root package name */
    public a0.l f8461k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f8462l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f8463m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f8464n;

    private final void setParentContext(m0.v vVar) {
        if (this.f8460j != vVar) {
            this.f8460j = vVar;
            if (vVar != null) {
                this.f8457g = null;
            }
            a2 a2Var = this.f8459i;
            if (a2Var != null) {
                a2Var.c();
                this.f8459i = null;
                if (isAttachedToWindow()) {
                    c();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.f8458h != iBinder) {
            this.f8458h = iBinder;
            this.f8457g = null;
        }
    }

    public abstract void a(int i10, m0.r rVar);

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        b();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        b();
        return super.addViewInLayout(view, i10, layoutParams);
    }

    public final void b() {
        if (this.f8463m) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    public final void c() {
        if (this.f8459i == null) {
            try {
                this.f8463m = true;
                this.f8459i = b2.a(this, d(), new u0.d(-656146368, new a1.g(7, this), true));
            } finally {
                this.f8463m = false;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final m0.v d() {
        d2 d2Var;
        fc.i iVar;
        m0.n1 n1Var;
        m0.v vVar = this.f8460j;
        if (vVar == null) {
            vVar = x1.b(this);
            if (vVar == null) {
                Object parent = getParent();
                while (vVar == null && (parent instanceof View)) {
                    View view = (View) parent;
                    vVar = x1.b(view);
                    parent = view.getParent();
                }
            }
            if (vVar != null) {
                m0.v vVar2 = (!(vVar instanceof d2) || ((m0.z1) ((d2) vVar).f4568t.getValue()).compareTo(m0.z1.f4847h) > 0) ? vVar : null;
                if (vVar2 != null) {
                    this.f8457g = new WeakReference(vVar2);
                }
            } else {
                vVar = null;
            }
            if (vVar == null) {
                WeakReference weakReference = this.f8457g;
                if (weakReference == null || (vVar = (m0.v) weakReference.get()) == null || ((vVar instanceof d2) && ((m0.z1) ((d2) vVar).f4568t.getValue()).compareTo(m0.z1.f4847h) <= 0)) {
                    vVar = null;
                }
                if (vVar == null) {
                    if (!isAttachedToWindow()) {
                        u1.a.b("Cannot locate windowRecomposer; View " + this + " is not attached to a window");
                    }
                    Object parent2 = getParent();
                    View view2 = this;
                    while (parent2 instanceof View) {
                        View view3 = (View) parent2;
                        if (view3.getId() == 16908290) {
                            break;
                        }
                        view2 = view3;
                        parent2 = view3.getParent();
                    }
                    m0.v b2 = x1.b(view2);
                    if (b2 == null) {
                        ((s1) t1.f8651a.get()).getClass();
                        fc.j jVar = fc.j.f2348g;
                        ac.m mVar = j0.f8558s;
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            iVar = (fc.i) j0.f8558s.getValue();
                        } else {
                            iVar = (fc.i) j0.f8559t.get();
                            if (iVar == null) {
                                throw new IllegalStateException("no AndroidUiDispatcher for this thread");
                            }
                        }
                        fc.i d10 = iVar.d(jVar);
                        m0.a1 a1Var = (m0.a1) d10.v(m0.z0.f4840h);
                        if (a1Var != null) {
                            m0.n1 n1Var2 = new m0.n1(a1Var);
                            b4.e eVar = (b4.e) n1Var2.f4686i;
                            synchronized (eVar.f961b) {
                                eVar.f960a = false;
                                n1Var = n1Var2;
                            }
                        } else {
                            n1Var = 0;
                        }
                        pc.s sVar = new pc.s();
                        fc.i iVar2 = (y0.o) d10.v(y0.c.f8432t);
                        if (iVar2 == null) {
                            iVar2 = new h1();
                            sVar.f5683g = iVar2;
                        }
                        if (n1Var != 0) {
                            jVar = n1Var;
                        }
                        fc.i d11 = d10.d(jVar).d(iVar2);
                        d2 d2Var2 = new d2(d11);
                        synchronized (d2Var2.f4550b) {
                            d2Var2.f4567s = true;
                        }
                        dd.e a6 = yc.a0.a(d11);
                        androidx.lifecycle.u e10 = androidx.lifecycle.m0.e(view2);
                        androidx.lifecycle.w h10 = e10 != null ? e10.h() : null;
                        if (h10 == null) {
                            u1.a.c("ViewTreeLifecycleOwner not found from " + view2);
                            throw new ac.d();
                        }
                        view2.addOnAttachStateChangeListener(new u1(view2, d2Var2));
                        h10.a(new w1(a6, n1Var, d2Var2, sVar, view2));
                        view2.setTag(R.id.androidx_compose_ui_view_composition_context, d2Var2);
                        Handler handler = view2.getHandler();
                        int i10 = zc.e.f9183a;
                        fc.i iVar3 = new zc.d(handler, "windowRecomposer cleanup", false).f9182l;
                        c0.d dVar = new c0.d(d2Var2, view2, r1, 14);
                        yc.z zVar = yc.z.f8924j;
                        if ((2 & 1) != 0) {
                            iVar3 = fc.j.f2348g;
                        }
                        if ((2 & 2) != 0) {
                            zVar = yc.z.f8921g;
                        }
                        fc.i h11 = yc.a0.h(fc.j.f2348g, iVar3, true);
                        fd.e eVar2 = yc.i0.f8859a;
                        if (h11 != eVar2 && h11.v(fc.e.f2347g) == null) {
                            h11 = h11.d(eVar2);
                        }
                        yc.a l1Var = zVar == yc.z.f8922h ? new yc.l1(h11, dVar) : new yc.r1(h11, true);
                        l1Var.f0(zVar, l1Var, dVar);
                        view2.addOnAttachStateChangeListener(new f1.e(5, l1Var));
                        d2Var = d2Var2;
                    } else {
                        if (!(b2 instanceof d2)) {
                            throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer");
                        }
                        d2Var = (d2) b2;
                    }
                    r1 = ((m0.z1) d2Var.f4568t.getValue()).compareTo(m0.z1.f4847h) > 0 ? d2Var : null;
                    if (r1 != null) {
                        this.f8457g = new WeakReference(r1);
                    }
                    return d2Var;
                }
            }
        }
        return vVar;
    }

    public final boolean getHasComposition() {
        return this.f8459i != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.f8462l;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.f8464n || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            c();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i12 - i10) - getPaddingRight(), (i13 - i11) - getPaddingBottom());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        c();
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i10, i11);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i10)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i11) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i11)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i10);
        }
    }

    public final void setParentCompositionContext(m0.v vVar) {
        setParentContext(vVar);
    }

    public final void setShowLayoutBounds(boolean z10) {
        this.f8462l = z10;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((r) ((x1.m1) childAt)).setShowLayoutBounds(z10);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z10) {
        super.setTransitionGroup(z10);
        this.f8464n = true;
    }

    public final void setViewCompositionStrategy(n1 n1Var) {
        a0.l lVar = this.f8461k;
        if (lVar != null) {
            lVar.invoke();
        }
        ((e0) n1Var).getClass();
        f1.e eVar = new f1.e(4, this);
        addOnAttachStateChangeListener(eVar);
        x7.f fVar = new x7.f();
        bc.a0.p(this).f5045a.add(fVar);
        this.f8461k = new a0.l(this, eVar, fVar, 4);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10) {
        b();
        super.addView(view, i10);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        b();
        return super.addViewInLayout(view, i10, layoutParams, z10);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, int i11) {
        b();
        super.addView(view, i10, i11);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, i10, layoutParams);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }
}
