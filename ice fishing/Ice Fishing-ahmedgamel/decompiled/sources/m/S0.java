package m;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import k.InterfaceC4616c;
import l.SubMenuC4643E;

/* loaded from: classes.dex */
public final class S0 implements l.y {

    /* renamed from: n, reason: collision with root package name */
    public l.m f39059n;

    /* renamed from: u, reason: collision with root package name */
    public l.o f39060u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Toolbar f39061v;

    public S0(Toolbar toolbar) {
        this.f39061v = toolbar;
    }

    @Override // l.y
    public final boolean c(l.o oVar) {
        Toolbar toolbar = this.f39061v;
        toolbar.c();
        ViewParent parent = toolbar.f4585A.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f4585A);
            }
            toolbar.addView(toolbar.f4585A);
        }
        View actionView = oVar.getActionView();
        toolbar.f4587B = actionView;
        this.f39060u = oVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f4587B);
            }
            T0 h9 = Toolbar.h();
            h9.f39062a = (toolbar.f4593G & 112) | 8388611;
            h9.f39063b = 2;
            toolbar.f4587B.setLayoutParams(h9);
            toolbar.addView(toolbar.f4587B);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((T0) childAt.getLayoutParams()).f39063b != 2 && childAt != toolbar.f4609n) {
                toolbar.removeViewAt(childCount);
                toolbar.f4610n0.add(childAt);
            }
        }
        toolbar.requestLayout();
        oVar.f38850V = true;
        oVar.f38836G.p(false);
        KeyEvent.Callback callback = toolbar.f4587B;
        if (callback instanceof InterfaceC4616c) {
            ((l.q) ((InterfaceC4616c) callback)).f38861n.onActionViewExpanded();
        }
        toolbar.w();
        return true;
    }

    @Override // l.y
    public final boolean d() {
        return false;
    }

    @Override // l.y
    public final void e() {
        if (this.f39060u != null) {
            l.m mVar = this.f39059n;
            if (mVar != null) {
                int size = mVar.f38825y.size();
                for (int i = 0; i < size; i++) {
                    if (this.f39059n.getItem(i) == this.f39060u) {
                        return;
                    }
                }
            }
            j(this.f39060u);
        }
    }

    @Override // l.y
    public final void h(Context context, l.m mVar) {
        l.o oVar;
        l.m mVar2 = this.f39059n;
        if (mVar2 != null && (oVar = this.f39060u) != null) {
            mVar2.d(oVar);
        }
        this.f39059n = mVar;
    }

    @Override // l.y
    public final boolean i(SubMenuC4643E subMenuC4643E) {
        return false;
    }

    @Override // l.y
    public final boolean j(l.o oVar) {
        Toolbar toolbar = this.f39061v;
        KeyEvent.Callback callback = toolbar.f4587B;
        if (callback instanceof InterfaceC4616c) {
            ((l.q) ((InterfaceC4616c) callback)).f38861n.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f4587B);
        toolbar.removeView(toolbar.f4585A);
        toolbar.f4587B = null;
        ArrayList arrayList = toolbar.f4610n0;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f39060u = null;
        toolbar.requestLayout();
        oVar.f38850V = false;
        oVar.f38836G.p(false);
        toolbar.w();
        return true;
    }

    @Override // l.y
    public final void b(l.m mVar, boolean z3) {
    }
}
