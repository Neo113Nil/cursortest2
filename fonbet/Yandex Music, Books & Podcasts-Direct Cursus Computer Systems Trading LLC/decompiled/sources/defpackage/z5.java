package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public abstract class z5 extends ViewGroup {
    public WeakReference a;
    public IBinder b;
    public y5w c;
    public tr5 d;
    public Function0 e;
    public boolean f;
    public boolean g;
    public boolean h;

    public z5(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        xdu xduVar = new xdu(this, 1);
        addOnAttachStateChangeListener(xduVar);
        ydu yduVar = new ydu(this);
        tyf.w(this).a.add(yduVar);
        this.e = new t03(22, this, xduVar, yduVar);
    }

    private final void setParentContext(tr5 tr5Var) {
        if (this.d != tr5Var) {
            this.d = tr5Var;
            if (tr5Var != null) {
                this.a = null;
            }
            y5w y5wVar = this.c;
            if (y5wVar != null) {
                y5wVar.c();
                this.c = null;
                if (isAttachedToWindow()) {
                    n();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.b != iBinder) {
            this.b = iBinder;
            this.a = null;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        k();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        k();
        return super.addViewInLayout(view, i, layoutParams);
    }

    public final boolean getHasComposition() {
        return this.c != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.f;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.h || super.isTransitionGroup();
    }

    public abstract void j(int i, hq5 hq5Var);

    public final void k() {
        if (this.g) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    public final void l() {
        if (this.d != null || isAttachedToWindow()) {
            n();
        } else {
            xq0.q("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
        }
    }

    public final void m() {
        y5w y5wVar = this.c;
        if (y5wVar != null) {
            y5wVar.c();
        }
        this.c = null;
        requestLayout();
    }

    public final void n() {
        if (this.c == null) {
            try {
                this.g = true;
                this.c = a6w.a(this, q(), new wn5(new y5(0, this), -656146368, true));
            } finally {
                this.g = false;
            }
        }
    }

    public void o(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            n();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        o(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        n();
        p(i, i2);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        childAt.setLayoutDirection(i);
    }

    public void p(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final tr5 q() {
        cnn cnnVar;
        CoroutineContext coroutineContext;
        lbk lbkVar;
        tr5 tr5Var = this.d;
        if (tr5Var == null) {
            tr5Var = erv.b(this);
            if (tr5Var == null) {
                for (ViewParent parent = getParent(); tr5Var == null && (parent instanceof View); parent = parent.getParent()) {
                    tr5Var = erv.b((View) parent);
                }
            }
            if (tr5Var != null) {
                tr5 tr5Var2 = (!(tr5Var instanceof cnn) || ((zmn) ((cnn) tr5Var).u.getValue()).compareTo(zmn.b) > 0) ? tr5Var : null;
                if (tr5Var2 != null) {
                    this.a = new WeakReference(tr5Var2);
                }
            } else {
                tr5Var = null;
            }
            if (tr5Var == null) {
                WeakReference weakReference = this.a;
                if (weakReference == null || (tr5Var = (tr5) weakReference.get()) == null || ((tr5Var instanceof cnn) && ((zmn) ((cnn) tr5Var).u.getValue()).compareTo(zmn.b) <= 0)) {
                    tr5Var = null;
                }
                if (tr5Var == null) {
                    if (!isAttachedToWindow()) {
                        sme.b("Cannot locate windowRecomposer; View " + this + " is not attached to a window");
                    }
                    Object parent2 = getParent();
                    View view = this;
                    while (parent2 instanceof View) {
                        View view2 = (View) parent2;
                        if (view2.getId() == 16908290) {
                            break;
                        }
                        view = view2;
                        parent2 = view2.getParent();
                    }
                    tr5 b = erv.b(view);
                    if (b == null) {
                        ((arv) brv.a.get()).getClass();
                        g gVar = g.a;
                        dg6 dg6Var = d.t0;
                        gVar.getClass();
                        dg6Var.getClass();
                        jyr jyrVar = bj0.n;
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            coroutineContext = (CoroutineContext) bj0.n.getValue();
                        } else {
                            coroutineContext = (CoroutineContext) bj0.o.get();
                            if (coroutineContext == null) {
                                xq0.q("no AndroidUiDispatcher for this thread");
                                return null;
                            }
                        }
                        CoroutineContext plus = coroutineContext.plus(gVar);
                        qdi qdiVar = (qdi) plus.get(l48.f);
                        if (qdiVar != null) {
                            lbk lbkVar2 = new lbk(qdiVar);
                            z0j z0jVar = lbkVar2.b;
                            synchronized (z0jVar.c) {
                                z0jVar.b = false;
                                lbkVar = lbkVar2;
                            }
                        } else {
                            lbkVar = 0;
                        }
                        xqn xqnVar = new xqn();
                        CoroutineContext coroutineContext2 = (hei) plus.get(e88.f);
                        if (coroutineContext2 == null) {
                            coroutineContext2 = new iei();
                            xqnVar.a = coroutineContext2;
                        }
                        if (lbkVar != 0) {
                            gVar = lbkVar;
                        }
                        CoroutineContext plus2 = plus.plus(gVar).plus(coroutineContext2);
                        cnn cnnVar2 = new cnn(plus2);
                        synchronized (cnnVar2.c) {
                            cnnVar2.t = true;
                        }
                        tf6 e = gld.e(plus2);
                        dzf E = swf.E(view);
                        nyf lifecycle = E != null ? E.getLifecycle() : null;
                        if (lifecycle == null) {
                            sme.c("ViewTreeLifecycleOwner not found from " + view);
                            rj7.f();
                            return null;
                        }
                        view.addOnAttachStateChangeListener(new ac8(view, cnnVar2, 5));
                        lifecycle.a(new drv(e, lbkVar, cnnVar2, xqnVar, view));
                        view.setTag(R.id.androidx_compose_ui_view_composition_context, cnnVar2);
                        cmd cmdVar = cmd.a;
                        Handler handler = view.getHandler();
                        int i = csd.a;
                        view.addOnAttachStateChangeListener(new jb(13, x97.y(cmdVar, new bsd(handler, "windowRecomposer cleanup", false).g, null, new y6v(cnnVar2, view, r1, 7), 2)));
                        cnnVar = cnnVar2;
                    } else {
                        if (!(b instanceof cnn)) {
                            xq0.q("root viewTreeParentCompositionContext is not a Recomposer");
                            return null;
                        }
                        cnnVar = (cnn) b;
                    }
                    r1 = ((zmn) cnnVar.u.getValue()).compareTo(zmn.b) > 0 ? cnnVar : null;
                    if (r1 != null) {
                        this.a = new WeakReference(r1);
                    }
                    return cnnVar;
                }
            }
        }
        return tr5Var;
    }

    public final void setParentCompositionContext(tr5 tr5Var) {
        setParentContext(tr5Var);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.f = z;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((uzj) childAt).setShowLayoutBounds(z);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.h = true;
    }

    public final void setViewCompositionStrategy(@NotNull zdu zduVar) {
        Function0 function0 = this.e;
        if (function0 != null) {
            function0.invoke();
        }
        this.e = zduVar.e(this);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        k();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        k();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        k();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        k();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        k();
        super.addView(view, i, layoutParams);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    public z5(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ z5(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public z5(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }
}
