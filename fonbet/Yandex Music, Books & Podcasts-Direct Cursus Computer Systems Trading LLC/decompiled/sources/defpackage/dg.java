package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public final class dg implements gyh {
    public final Context a;
    public Context b;
    public hxh c;
    public final LayoutInflater d;
    public fyh e;
    public nyh h;
    public cg i;
    public Drawable j;
    public boolean k;
    public boolean l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public ag s;
    public ag t;
    public x8x u;
    public bg v;
    public final int f = R.layout.abc_action_menu_layout;
    public final int g = R.layout.abc_action_menu_item_layout;
    public final SparseBooleanArray r = new SparseBooleanArray();
    public final ozw w = new ozw(3, this);

    public dg(Context context) {
        this.a = context;
        this.d = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [myh] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final View a(rxh rxhVar, View view, ViewGroup viewGroup) {
        View actionView = rxhVar.getActionView();
        if (actionView == null || rxhVar.e()) {
            ActionMenuItemView actionMenuItemView = view instanceof myh ? (myh) view : (myh) this.d.inflate(this.g, viewGroup, false);
            actionMenuItemView.c(rxhVar);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.h);
            if (this.v == null) {
                this.v = new bg(this);
            }
            actionMenuItemView2.setPopupCallback(this.v);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(rxhVar.C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof fg)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gyh
    public final boolean b(tmr tmrVar) {
        boolean z;
        if (tmrVar.hasVisibleItems()) {
            tmr tmrVar2 = tmrVar;
            while (true) {
                hxh hxhVar = tmrVar2.z;
                if (hxhVar == this.c) {
                    break;
                }
                tmrVar2 = (tmr) hxhVar;
            }
            rxh rxhVar = tmrVar2.A;
            ViewGroup viewGroup = (ViewGroup) this.h;
            View view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof myh) && ((myh) childAt).getItemData() == rxhVar) {
                        view = childAt;
                        break;
                    }
                    i++;
                }
            }
            if (view != null) {
                tmrVar.A.getClass();
                int size = tmrVar.f.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z = false;
                        break;
                    }
                    MenuItem item = tmrVar.getItem(i2);
                    if (item.isVisible() && item.getIcon() != null) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                ag agVar = new ag(this, this.b, tmrVar, view);
                this.t = agVar;
                agVar.g = z;
                yxh yxhVar = agVar.i;
                if (yxhVar != null) {
                    yxhVar.n(z);
                }
                ag agVar2 = this.t;
                if (!agVar2.b()) {
                    if (agVar2.e == null) {
                        xq0.q("MenuPopupHelper cannot be used without an anchor");
                        return false;
                    }
                    agVar2.d(0, 0, false, false);
                }
                fyh fyhVar = this.e;
                if (fyhVar != null) {
                    fyhVar.w(tmrVar);
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.gyh
    public final boolean c(rxh rxhVar) {
        return false;
    }

    @Override // defpackage.gyh
    public final void d(fyh fyhVar) {
        throw null;
    }

    @Override // defpackage.gyh
    public final void e(hxh hxhVar, boolean z) {
        f();
        ag agVar = this.t;
        if (agVar != null && agVar.b()) {
            agVar.i.dismiss();
        }
        fyh fyhVar = this.e;
        if (fyhVar != null) {
            fyhVar.e(hxhVar, z);
        }
    }

    public final boolean f() {
        Object obj;
        x8x x8xVar = this.u;
        if (x8xVar != null && (obj = this.h) != null) {
            ((View) obj).removeCallbacks(x8xVar);
            this.u = null;
            return true;
        }
        ag agVar = this.s;
        if (agVar == null) {
            return false;
        }
        if (agVar.b()) {
            agVar.i.dismiss();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gyh
    public final void g() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.h;
        ArrayList arrayList = null;
        boolean z = false;
        if (viewGroup != null) {
            hxh hxhVar = this.c;
            if (hxhVar != null) {
                hxhVar.i();
                ArrayList l = this.c.l();
                int size = l.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    rxh rxhVar = (rxh) l.get(i2);
                    if ((rxhVar.x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        rxh itemData = childAt instanceof myh ? ((myh) childAt).getItemData() : null;
                        View a = a(rxhVar, childAt, viewGroup);
                        if (rxhVar != itemData) {
                            a.setPressed(false);
                            a.jumpDrawablesToCurrentState();
                        }
                        if (a != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a);
                            }
                            ((ViewGroup) this.h).addView(a, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.i) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.h).requestLayout();
        hxh hxhVar2 = this.c;
        if (hxhVar2 != null) {
            hxhVar2.i();
            ArrayList arrayList2 = hxhVar2.i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                txh txhVar = ((rxh) arrayList2.get(i3)).A;
            }
        }
        hxh hxhVar3 = this.c;
        if (hxhVar3 != null) {
            hxhVar3.i();
            arrayList = hxhVar3.j;
        }
        if (this.l && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z = !((rxh) arrayList.get(0)).C;
            } else if (size3 > 0) {
                z = true;
            }
        }
        cg cgVar = this.i;
        if (z) {
            if (cgVar == null) {
                this.i = new cg(this, this.a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.i.getParent();
            if (viewGroup3 != this.h) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.i);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.h;
                cg cgVar2 = this.i;
                actionMenuView.getClass();
                fg j = ActionMenuView.j();
                j.a = true;
                actionMenuView.addView(cgVar2, j);
            }
        } else if (cgVar != null) {
            Object parent = cgVar.getParent();
            Object obj = this.h;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.i);
            }
        }
        ((ActionMenuView) this.h).setOverflowReserved(this.l);
    }

    @Override // defpackage.gyh
    public final boolean h() {
        int i;
        ArrayList arrayList;
        int i2;
        boolean z;
        dg dgVar = this;
        hxh hxhVar = dgVar.c;
        if (hxhVar != null) {
            arrayList = hxhVar.l();
            i = arrayList.size();
        } else {
            i = 0;
            arrayList = null;
        }
        int i3 = dgVar.p;
        int i4 = dgVar.o;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) dgVar.h;
        int i5 = 0;
        boolean z2 = false;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i2 = 2;
            z = true;
            if (i5 >= i) {
                break;
            }
            rxh rxhVar = (rxh) arrayList.get(i5);
            int i8 = rxhVar.y;
            if ((i8 & 2) == 2) {
                i6++;
            } else if ((i8 & 1) == 1) {
                i7++;
            } else {
                z2 = true;
            }
            if (dgVar.q && rxhVar.C) {
                i3 = 0;
            }
            i5++;
        }
        if (dgVar.l && (z2 || i7 + i6 > i3)) {
            i3--;
        }
        int i9 = i3 - i6;
        SparseBooleanArray sparseBooleanArray = dgVar.r;
        sparseBooleanArray.clear();
        int i10 = 0;
        int i11 = 0;
        while (i10 < i) {
            rxh rxhVar2 = (rxh) arrayList.get(i10);
            int i12 = rxhVar2.y;
            boolean z3 = (i12 & 2) == i2 ? z : false;
            int i13 = rxhVar2.b;
            if (z3) {
                View a = dgVar.a(rxhVar2, null, viewGroup);
                a.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i11 == 0) {
                    i11 = measuredWidth;
                }
                if (i13 != 0) {
                    sparseBooleanArray.put(i13, z);
                }
                rxhVar2.f(z);
            } else if ((i12 & 1) == z) {
                boolean z4 = sparseBooleanArray.get(i13);
                boolean z5 = ((i9 > 0 || z4) && i4 > 0) ? z : false;
                if (z5) {
                    View a2 = dgVar.a(rxhVar2, null, viewGroup);
                    a2.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = a2.getMeasuredWidth();
                    i4 -= measuredWidth2;
                    if (i11 == 0) {
                        i11 = measuredWidth2;
                    }
                    z5 &= i4 + i11 > 0;
                }
                if (z5 && i13 != 0) {
                    sparseBooleanArray.put(i13, true);
                } else if (z4) {
                    sparseBooleanArray.put(i13, false);
                    for (int i14 = 0; i14 < i10; i14++) {
                        rxh rxhVar3 = (rxh) arrayList.get(i14);
                        if (rxhVar3.b == i13) {
                            if ((rxhVar3.x & 32) == 32) {
                                i9++;
                            }
                            rxhVar3.f(false);
                        }
                    }
                }
                if (z5) {
                    i9--;
                }
                rxhVar2.f(z5);
            } else {
                rxhVar2.f(false);
                i10++;
                i2 = 2;
                dgVar = this;
                z = true;
            }
            i10++;
            i2 = 2;
            dgVar = this;
            z = true;
        }
        return z;
    }

    @Override // defpackage.gyh
    public final boolean i(rxh rxhVar) {
        return false;
    }

    @Override // defpackage.gyh
    public final void j(Context context, hxh hxhVar) {
        this.b = context;
        LayoutInflater.from(context);
        this.c = hxhVar;
        Resources resources = context.getResources();
        qe a = qe.a(context);
        if (!this.m) {
            this.l = true;
        }
        this.n = a.a.getResources().getDisplayMetrics().widthPixels / 2;
        this.p = a.b();
        int i = this.n;
        if (this.l) {
            if (this.i == null) {
                cg cgVar = new cg(this, this.a);
                this.i = cgVar;
                if (this.k) {
                    cgVar.setImageDrawable(this.j);
                    this.j = null;
                    this.k = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.i.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.i.getMeasuredWidth();
        } else {
            this.i = null;
        }
        this.o = i;
        float f = resources.getDisplayMetrics().density;
    }

    public final boolean k() {
        ag agVar = this.s;
        return agVar != null && agVar.b();
    }

    public final boolean l() {
        hxh hxhVar;
        if (!this.l || k() || (hxhVar = this.c) == null || this.h == null || this.u != null) {
            return false;
        }
        hxhVar.i();
        if (hxhVar.j.isEmpty()) {
            return false;
        }
        x8x x8xVar = new x8x(this, new ag(this, this.b, this.c, this.i), false, 2);
        this.u = x8xVar;
        ((View) this.h).post(x8xVar);
        return true;
    }
}
