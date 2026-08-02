package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Button;
import androidx.core.view.a;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class ob extends qpn {
    public final vi2 f;
    public final ArrayList g;
    public final ib h;
    public kb i;
    public boolean j;

    public ob(vi2 vi2Var) {
        super(vi2Var);
        this.f = vi2Var;
        this.g = new ArrayList();
        ib ibVar = new ib(0, this);
        this.h = ibVar;
        if (vi2Var.s) {
            vi2Var.getViewTreeObserver().addOnGlobalLayoutListener(ibVar);
        }
        vi2Var.addOnAttachStateChangeListener(new jb(0, this));
        int childCount = vi2Var.getChildCount();
        for (int i = 0; i < childCount; i++) {
            vi2Var.getChildAt(i).setImportantForAccessibility(this.j ? 1 : 4);
        }
        this.f.setOnBackClickListener(new sld(3, this));
    }

    @Override // defpackage.qpn, androidx.core.view.a
    public final void d(View view, vb vbVar) {
        super.d(view, vbVar);
        vbVar.n(this.j ? ern.a(RecyclerView.class).f() : ern.a(Button.class).f());
        vbVar.a(16);
        vbVar.o(true);
        vbVar.a.setImportantForAccessibility(true);
        vbVar.v(true);
        vi2 vi2Var = this.f;
        int childCount = vi2Var.getChildCount();
        for (int i = 0; i < childCount; i++) {
            vi2Var.getChildAt(i).setImportantForAccessibility(this.j ? 1 : 4);
        }
    }

    @Override // defpackage.qpn, androidx.core.view.a
    public final boolean g(View view, int i, Bundle bundle) {
        boolean z;
        View view2;
        View child;
        if (i == 16) {
            boolean z2 = this.j;
            vi2 vi2Var = this.f;
            if (!z2) {
                this.j = true;
                int childCount = vi2Var.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    vi2Var.getChildAt(i2).setImportantForAccessibility(this.j ? 1 : 4);
                }
            }
            l(vi2Var);
            ze0 a = gl5.a(mb.a, nb.a);
            if (vi2Var.getChildCount() > 0) {
                view2 = vi2Var.getChildAt(0);
                if (view2 == null) {
                    rj7.m();
                    return false;
                }
                int i3 = 1;
                while (i3 < vi2Var.getChildCount()) {
                    int i4 = i3 + 1;
                    View childAt = vi2Var.getChildAt(i3);
                    if (childAt == null) {
                        rj7.m();
                        return false;
                    }
                    if (a.compare(view2, childAt) > 0) {
                        view2 = childAt;
                    }
                    i3 = i4;
                }
            } else {
                view2 = null;
            }
            if (view2 == null) {
                view2 = null;
            } else if ((view2 instanceof j1a) && (child = ((j1a) view2).getChild()) != null) {
                view2 = child;
            }
            if (view2 != null) {
                view2.performAccessibilityAction(64, null);
                view2.sendAccessibilityEvent(1);
            }
            z = true;
        } else {
            z = false;
        }
        return super.g(view, i, bundle) || z;
    }

    @Override // defpackage.qpn
    public final a j() {
        kb kbVar = this.i;
        if (kbVar != null) {
            return kbVar;
        }
        kb kbVar2 = new kb(this);
        this.i = kbVar2;
        return kbVar2;
    }

    public final void k() {
        if (this.j) {
            this.j = false;
            vi2 vi2Var = this.f;
            int childCount = vi2Var.getChildCount();
            for (int i = 0; i < childCount; i++) {
                vi2Var.getChildAt(i).setImportantForAccessibility(this.j ? 1 : 4);
            }
        }
        ArrayList arrayList = this.g;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            lb lbVar = (lb) it.next();
            View view = (View) lbVar.a.get();
            if (view != null) {
                view.setImportantForAccessibility(lbVar.b);
            }
        }
        arrayList.clear();
    }

    public final void l(ViewGroup viewGroup) {
        ViewParent parent = viewGroup.getParent();
        ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup2 == null || viewGroup.equals(viewGroup2.getRootView())) {
            return;
        }
        int i = 0;
        while (true) {
            if (!(i < viewGroup2.getChildCount())) {
                l(viewGroup2);
                return;
            }
            int i2 = i + 1;
            View childAt = viewGroup2.getChildAt(i);
            if (childAt == null) {
                rj7.m();
                return;
            }
            if (!childAt.equals(viewGroup) && childAt.getImportantForAccessibility() != 4) {
                this.g.add(new lb(new WeakReference(childAt), childAt.getImportantForAccessibility()));
                childAt.setImportantForAccessibility(4);
            }
            i = i2;
        }
    }
}
