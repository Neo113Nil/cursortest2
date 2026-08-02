package m;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import k.InterfaceC4626c;
import l.SubMenuC4654E;

/* loaded from: classes.dex */
public final class T0 implements l.y {

    /* renamed from: n, reason: collision with root package name */
    public l.m f39128n;

    /* renamed from: u, reason: collision with root package name */
    public l.o f39129u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Toolbar f39130v;

    public T0(Toolbar toolbar) {
        this.f39130v = toolbar;
    }

    @Override // l.y
    public final boolean c(l.o oVar) {
        Toolbar toolbar = this.f39130v;
        toolbar.c();
        ViewParent parent = toolbar.f4553A.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f4553A);
            }
            toolbar.addView(toolbar.f4553A);
        }
        View actionView = oVar.getActionView();
        toolbar.f4554B = actionView;
        this.f39129u = oVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f4554B);
            }
            U0 h3 = Toolbar.h();
            h3.f39131a = (toolbar.f4559G & 112) | 8388611;
            h3.f39132b = 2;
            toolbar.f4554B.setLayoutParams(h3);
            toolbar.addView(toolbar.f4554B);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((U0) childAt.getLayoutParams()).f39132b != 2 && childAt != toolbar.f4579n) {
                toolbar.removeViewAt(childCount);
                toolbar.f4575i0.add(childAt);
            }
        }
        toolbar.requestLayout();
        oVar.f38777V = true;
        oVar.f38763G.p(false);
        KeyEvent.Callback callback = toolbar.f4554B;
        if (callback instanceof InterfaceC4626c) {
            ((l.q) ((InterfaceC4626c) callback)).f38788n.onActionViewExpanded();
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
        if (this.f39129u != null) {
            l.m mVar = this.f39128n;
            if (mVar != null) {
                int size = mVar.f38752y.size();
                for (int i = 0; i < size; i++) {
                    if (this.f39128n.getItem(i) == this.f39129u) {
                        return;
                    }
                }
            }
            j(this.f39129u);
        }
    }

    @Override // l.y
    public final void h(Context context, l.m mVar) {
        l.o oVar;
        l.m mVar2 = this.f39128n;
        if (mVar2 != null && (oVar = this.f39129u) != null) {
            mVar2.d(oVar);
        }
        this.f39128n = mVar;
    }

    @Override // l.y
    public final boolean i(SubMenuC4654E subMenuC4654E) {
        return false;
    }

    @Override // l.y
    public final boolean j(l.o oVar) {
        Toolbar toolbar = this.f39130v;
        KeyEvent.Callback callback = toolbar.f4554B;
        if (callback instanceof InterfaceC4626c) {
            ((l.q) ((InterfaceC4626c) callback)).f38788n.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f4554B);
        toolbar.removeView(toolbar.f4553A);
        toolbar.f4554B = null;
        ArrayList arrayList = toolbar.f4575i0;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f39129u = null;
        toolbar.requestLayout();
        oVar.f38777V = false;
        oVar.f38763G.p(false);
        toolbar.w();
        return true;
    }

    @Override // l.y
    public final void b(l.m mVar, boolean z6) {
    }
}
