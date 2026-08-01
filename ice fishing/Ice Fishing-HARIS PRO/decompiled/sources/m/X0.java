package m;

import android.content.Context;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import k.InterfaceC0178b;
import l.MenuC0229m;
import l.SubMenuC0216E;

/* loaded from: classes.dex */
public final class X0 implements l.y {

    /* renamed from: a, reason: collision with root package name */
    public MenuC0229m f3901a;

    /* renamed from: b, reason: collision with root package name */
    public l.o f3902b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Toolbar f3903c;

    public X0(Toolbar toolbar) {
        this.f3903c = toolbar;
    }

    @Override // l.y
    public final void b(MenuC0229m menuC0229m, boolean z2) {
    }

    @Override // l.y
    public final void d(Context context, MenuC0229m menuC0229m) {
        l.o oVar;
        MenuC0229m menuC0229m2 = this.f3901a;
        if (menuC0229m2 != null && (oVar = this.f3902b) != null) {
            menuC0229m2.d(oVar);
        }
        this.f3901a = menuC0229m;
    }

    @Override // l.y
    public final boolean e(SubMenuC0216E subMenuC0216E) {
        return false;
    }

    @Override // l.y
    public final int f() {
        return 0;
    }

    @Override // l.y
    public final boolean i(l.o oVar) {
        Toolbar toolbar = this.f3903c;
        toolbar.c();
        ViewParent parent = toolbar.f1868h.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f1868h);
            }
            toolbar.addView(toolbar.f1868h);
        }
        View actionView = oVar.getActionView();
        toolbar.i = actionView;
        this.f3902b = oVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.i);
            }
            Y0 h2 = Toolbar.h();
            h2.f3904a = (toolbar.f1872n & 112) | 8388611;
            h2.f3905b = 2;
            toolbar.i.setLayoutParams(h2);
            toolbar.addView(toolbar.i);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((Y0) childAt.getLayoutParams()).f3905b != 2 && childAt != toolbar.f1862a) {
                toolbar.removeViewAt(childCount);
                toolbar.f1850E.add(childAt);
            }
        }
        toolbar.requestLayout();
        oVar.f3735C = true;
        oVar.f3746n.p(false);
        KeyEvent.Callback callback = toolbar.i;
        if (callback instanceof InterfaceC0178b) {
            ((l.q) ((InterfaceC0178b) callback)).f3762a.onActionViewExpanded();
        }
        toolbar.u();
        return true;
    }

    @Override // l.y
    public final boolean j() {
        return false;
    }

    @Override // l.y
    public final boolean k(l.o oVar) {
        Toolbar toolbar = this.f3903c;
        KeyEvent.Callback callback = toolbar.i;
        if (callback instanceof InterfaceC0178b) {
            ((l.q) ((InterfaceC0178b) callback)).f3762a.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.i);
        toolbar.removeView(toolbar.f1868h);
        toolbar.i = null;
        ArrayList arrayList = toolbar.f1850E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f3902b = null;
        toolbar.requestLayout();
        oVar.f3735C = false;
        oVar.f3746n.p(false);
        toolbar.u();
        return true;
    }

    @Override // l.y
    public final Parcelable l() {
        return null;
    }

    @Override // l.y
    public final void m(boolean z2) {
        if (this.f3902b != null) {
            MenuC0229m menuC0229m = this.f3901a;
            if (menuC0229m != null) {
                int size = menuC0229m.f3713f.size();
                for (int i = 0; i < size; i++) {
                    if (this.f3901a.getItem(i) == this.f3902b) {
                        return;
                    }
                }
            }
            k(this.f3902b);
        }
    }

    @Override // l.y
    public final void n(Parcelable parcelable) {
    }
}
