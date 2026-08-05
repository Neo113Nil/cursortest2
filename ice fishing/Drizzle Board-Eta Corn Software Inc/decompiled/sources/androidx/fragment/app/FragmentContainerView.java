package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.kolosta.rejin.jilosa.R;
import defpackage.ej;
import defpackage.f4UNdked;
import defpackage.hg0;
import defpackage.li;
import defpackage.m1;
import defpackage.n1;
import defpackage.ni;
import defpackage.q70;
import defpackage.t00;
import defpackage.wi0;
import defpackage.xj;
import defpackage.yi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {
    public final ArrayList MdtA4re8;
    public final ArrayList NCTxEWno;
    public boolean VgvYg0wo;
    public View.OnApplyWindowInsetsListener wxUZMvaN;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, ej ejVar) {
        super(context, attributeSet);
        View view;
        context.getClass();
        attributeSet.getClass();
        this.NCTxEWno = new ArrayList();
        this.MdtA4re8 = new ArrayList();
        this.VgvYg0wo = true;
        String classAttribute = attributeSet.getClassAttribute();
        int i = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t00.NCTxEWno, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        li lwWCatUu = ejVar.lwWCatUu(id);
        if (classAttribute != null && lwWCatUu == null) {
            if (id == -1) {
                m1.Ey6iv0m0(q70.P7K7Inc8("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
                throw null;
            }
            yi Mq3SeTnW = ejVar.Mq3SeTnW();
            context.getClassLoader();
            li qoPGr6Ce = Mq3SeTnW.qoPGr6Ce(classAttribute);
            qoPGr6Ce.getClass();
            qoPGr6Ce.gjV1z5T1 = id;
            qoPGr6Ce.WYNAV5pd = id;
            qoPGr6Ce.DK9slbsy = string;
            qoPGr6Ce.Ey6iv0m0 = ejVar;
            qoPGr6Ce.I5GHvsYW = ejVar.I5GHvsYW;
            qoPGr6Ce.i7xS8jrb(context, attributeSet, null);
            n1 n1Var = new n1(ejVar);
            n1Var.sjUBp5pO = true;
            qoPGr6Ce.SgZGMMPL = this;
            n1Var.VgvYg0wo(getId(), qoPGr6Ce, string, 1);
            if (n1Var.b2ZJblxo) {
                m1.Ey6iv0m0("This transaction is already being added to the back stack");
                throw null;
            }
            n1Var.Qr9iLBAD = false;
            ej ejVar2 = n1Var.OxcuoDLp;
            if (ejVar2.I5GHvsYW != null && !ejVar2.eIA6dogk) {
                ejVar2.FySoLYna(true);
                n1Var.qoPGr6Ce(ejVar2.VhgXwMj9, ejVar2.aZz0PFXp);
                ejVar2.NCTxEWno = true;
                try {
                    ejVar2.HdOGZAzC(ejVar2.VhgXwMj9, ejVar2.aZz0PFXp);
                    ejVar2.wxUZMvaN();
                    ejVar2.tef3qNMP();
                    if (ejVar2.pRiPUEwG) {
                        ejVar2.pRiPUEwG = false;
                        ejVar2.LfKQckgD();
                    }
                    ((HashMap) ejVar2.MdtA4re8.NCTxEWno).values().removeAll(Collections.singleton(null));
                } catch (Throwable th) {
                    ejVar2.wxUZMvaN();
                    throw th;
                }
            }
        }
        ArrayList VgvYg0wo = ejVar.MdtA4re8.VgvYg0wo();
        int size = VgvYg0wo.size();
        while (i < size) {
            Object obj = VgvYg0wo.get(i);
            i++;
            xj xjVar = (xj) obj;
            li liVar = xjVar.MdtA4re8;
            if (liVar.WYNAV5pd == getId() && (view = liVar.ytu5o6f4) != null && view.getParent() == null) {
                liVar.SgZGMMPL = this;
                xjVar.NCTxEWno();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof li ? (li) tag : null) != null) {
            super.addView(view, i, layoutParams);
        } else {
            m1.I5GHvsYW(view, " is not associated with a Fragment.", "Views added to a FragmentContainerView must be associated with a Fragment. View ");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        wi0 wi0Var;
        windowInsets.getClass();
        wi0 VgvYg0wo = wi0.VgvYg0wo(windowInsets, null);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.wxUZMvaN;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            onApplyWindowInsets.getClass();
            wi0Var = wi0.VgvYg0wo(onApplyWindowInsets, null);
        } else {
            WeakHashMap weakHashMap = hg0.qoPGr6Ce;
            WindowInsets wxUZMvaN = VgvYg0wo.wxUZMvaN();
            if (wxUZMvaN != null && !wxUZMvaN.equals(wxUZMvaN)) {
                VgvYg0wo = wi0.VgvYg0wo(wxUZMvaN, this);
            }
            wi0Var = VgvYg0wo;
        }
        if (!wi0Var.qoPGr6Ce.OxcuoDLp()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                hg0.NCTxEWno(getChildAt(i), wi0Var);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.getClass();
        if (this.VgvYg0wo) {
            ArrayList arrayList = this.NCTxEWno;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                super.drawChild(canvas, (View) obj, getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        canvas.getClass();
        view.getClass();
        if (this.VgvYg0wo) {
            ArrayList arrayList = this.NCTxEWno;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        view.getClass();
        this.MdtA4re8.remove(view);
        if (this.NCTxEWno.remove(view)) {
            this.VgvYg0wo = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends li> F getFragment() {
        li liVar;
        f4UNdked f4undked;
        ej ejVar;
        View view = this;
        while (true) {
            if (view == null) {
                liVar = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            liVar = tag instanceof li ? (li) tag : null;
            if (liVar != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (liVar == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    f4undked = null;
                    break;
                }
                if (context instanceof f4UNdked) {
                    f4undked = (f4UNdked) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (f4undked == null) {
                m1.ygLcUYwZ(this, " is not within a subclass of FragmentActivity.", "View ");
                return null;
            }
            ejVar = ((ni) f4undked.Ey6iv0m0.MdtA4re8).KlHjfFWx;
        } else {
            if (liVar.I5GHvsYW == null || !liVar.ow5vqvCr) {
                throw new IllegalStateException("The Fragment " + liVar + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            ejVar = liVar.jb9XjC4I();
        }
        return (F) ejVar.lwWCatUu(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        windowInsets.getClass();
        return windowInsets;
    }

    public final void qoPGr6Ce(View view) {
        if (this.MdtA4re8.contains(view)) {
            this.NCTxEWno.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View childAt = getChildAt(childCount);
                childAt.getClass();
                qoPGr6Ce(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        view.getClass();
        qoPGr6Ce(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        View childAt = getChildAt(i);
        childAt.getClass();
        qoPGr6Ce(childAt);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        view.getClass();
        qoPGr6Ce(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            childAt.getClass();
            qoPGr6Ce(childAt);
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            childAt.getClass();
            qoPGr6Ce(childAt);
        }
        super.removeViewsInLayout(i, i2);
    }

    public final void setDrawDisappearingViewsLast(boolean z) {
        this.VgvYg0wo = z;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        onApplyWindowInsetsListener.getClass();
        this.wxUZMvaN = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        view.getClass();
        if (view.getParent() == this) {
            this.MdtA4re8.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        String str;
        context.getClass();
        this.NCTxEWno = new ArrayList();
        this.MdtA4re8 = new ArrayList();
        this.VgvYg0wo = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t00.NCTxEWno, 0, 0);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context) {
        super(context);
        context.getClass();
        this.NCTxEWno = new ArrayList();
        this.MdtA4re8 = new ArrayList();
        this.VgvYg0wo = true;
    }
}
