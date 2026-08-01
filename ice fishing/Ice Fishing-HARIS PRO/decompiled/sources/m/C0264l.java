package m;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.lumenpath.harispro.hrnavigator.R;
import java.util.ArrayList;
import l.InterfaceC0212A;
import l.MenuC0229m;
import l.SubMenuC0216E;

/* renamed from: m.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0264l implements l.y {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3959a;

    /* renamed from: b, reason: collision with root package name */
    public Context f3960b;

    /* renamed from: c, reason: collision with root package name */
    public MenuC0229m f3961c;

    /* renamed from: d, reason: collision with root package name */
    public final LayoutInflater f3962d;
    public l.x e;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC0212A f3965h;
    public int i;
    public C0260j j;

    /* renamed from: k, reason: collision with root package name */
    public Drawable f3966k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3967l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3968m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f3969n;

    /* renamed from: o, reason: collision with root package name */
    public int f3970o;

    /* renamed from: p, reason: collision with root package name */
    public int f3971p;

    /* renamed from: q, reason: collision with root package name */
    public int f3972q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3973r;

    /* renamed from: t, reason: collision with root package name */
    public C0254g f3975t;

    /* renamed from: u, reason: collision with root package name */
    public C0254g f3976u;

    /* renamed from: v, reason: collision with root package name */
    public RunnableC0258i f3977v;

    /* renamed from: w, reason: collision with root package name */
    public C0256h f3978w;

    /* renamed from: y, reason: collision with root package name */
    public int f3980y;

    /* renamed from: f, reason: collision with root package name */
    public final int f3963f = R.layout.abc_action_menu_layout;

    /* renamed from: g, reason: collision with root package name */
    public final int f3964g = R.layout.abc_action_menu_item_layout;

    /* renamed from: s, reason: collision with root package name */
    public final SparseBooleanArray f3974s = new SparseBooleanArray();

    /* renamed from: x, reason: collision with root package name */
    public final B.b f3979x = new B.b(27, this);

    public C0264l(Context context) {
        this.f3959a = context;
        this.f3962d = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [l.z] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final View a(l.o oVar, View view, ViewGroup viewGroup) {
        View actionView = oVar.getActionView();
        if (actionView == null || oVar.e()) {
            ActionMenuItemView actionMenuItemView = view instanceof l.z ? (l.z) view : (l.z) this.f3962d.inflate(this.f3964g, viewGroup, false);
            actionMenuItemView.c(oVar);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.f3965h);
            if (this.f3978w == null) {
                this.f3978w = new C0256h(this);
            }
            actionMenuItemView2.setPopupCallback(this.f3978w);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(oVar.f3735C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C0268n)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    @Override // l.y
    public final void b(MenuC0229m menuC0229m, boolean z2) {
        c();
        C0254g c0254g = this.f3976u;
        if (c0254g != null && c0254g.b()) {
            c0254g.i.dismiss();
        }
        l.x xVar = this.e;
        if (xVar != null) {
            xVar.b(menuC0229m, z2);
        }
    }

    public final boolean c() {
        Object obj;
        RunnableC0258i runnableC0258i = this.f3977v;
        if (runnableC0258i != null && (obj = this.f3965h) != null) {
            ((View) obj).removeCallbacks(runnableC0258i);
            this.f3977v = null;
            return true;
        }
        C0254g c0254g = this.f3975t;
        if (c0254g == null) {
            return false;
        }
        if (c0254g.b()) {
            c0254g.i.dismiss();
        }
        return true;
    }

    @Override // l.y
    public final void d(Context context, MenuC0229m menuC0229m) {
        this.f3960b = context;
        LayoutInflater.from(context);
        this.f3961c = menuC0229m;
        Resources resources = context.getResources();
        if (!this.f3969n) {
            this.f3968m = true;
        }
        int i = 2;
        this.f3970o = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.f3972q = i;
        int i4 = this.f3970o;
        if (this.f3968m) {
            if (this.j == null) {
                C0260j c0260j = new C0260j(this, this.f3959a);
                this.j = c0260j;
                if (this.f3967l) {
                    c0260j.setImageDrawable(this.f3966k);
                    this.f3966k = null;
                    this.f3967l = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.j.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i4 -= this.j.getMeasuredWidth();
        } else {
            this.j = null;
        }
        this.f3971p = i4;
        float f2 = resources.getDisplayMetrics().density;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.y
    public final boolean e(SubMenuC0216E subMenuC0216E) {
        boolean z2;
        if (!subMenuC0216E.hasVisibleItems()) {
            return false;
        }
        SubMenuC0216E subMenuC0216E2 = subMenuC0216E;
        while (true) {
            MenuC0229m menuC0229m = subMenuC0216E2.f3650z;
            if (menuC0229m == this.f3961c) {
                break;
            }
            subMenuC0216E2 = (SubMenuC0216E) menuC0229m;
        }
        ViewGroup viewGroup = (ViewGroup) this.f3965h;
        View view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof l.z) && ((l.z) childAt).getItemData() == subMenuC0216E2.f3649A) {
                    view = childAt;
                    break;
                }
                i++;
            }
        }
        if (view == null) {
            return false;
        }
        this.f3980y = subMenuC0216E.f3649A.f3736a;
        int size = subMenuC0216E.f3713f.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                z2 = false;
                break;
            }
            MenuItem item = subMenuC0216E.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                z2 = true;
                break;
            }
            i2++;
        }
        C0254g c0254g = new C0254g(this, this.f3960b, subMenuC0216E, view);
        this.f3976u = c0254g;
        c0254g.f3776g = z2;
        l.u uVar = c0254g.i;
        if (uVar != null) {
            uVar.r(z2);
        }
        C0254g c0254g2 = this.f3976u;
        if (!c0254g2.b()) {
            if (c0254g2.e == null) {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
            c0254g2.d(0, 0, false, false);
        }
        l.x xVar = this.e;
        if (xVar != null) {
            xVar.j(subMenuC0216E);
        }
        return true;
    }

    @Override // l.y
    public final int f() {
        return this.i;
    }

    public final boolean g() {
        C0254g c0254g = this.f3975t;
        return c0254g != null && c0254g.b();
    }

    @Override // l.y
    public final void h(l.x xVar) {
        throw null;
    }

    @Override // l.y
    public final boolean i(l.o oVar) {
        return false;
    }

    @Override // l.y
    public final boolean j() {
        int i;
        ArrayList arrayList;
        int i2;
        boolean z2;
        MenuC0229m menuC0229m = this.f3961c;
        if (menuC0229m != null) {
            arrayList = menuC0229m.l();
            i = arrayList.size();
        } else {
            i = 0;
            arrayList = null;
        }
        int i3 = this.f3972q;
        int i4 = this.f3971p;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f3965h;
        int i5 = 0;
        boolean z3 = false;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i2 = 2;
            z2 = true;
            if (i5 >= i) {
                break;
            }
            l.o oVar = (l.o) arrayList.get(i5);
            int i8 = oVar.f3757y;
            if ((i8 & 2) == 2) {
                i6++;
            } else if ((i8 & 1) == 1) {
                i7++;
            } else {
                z3 = true;
            }
            if (this.f3973r && oVar.f3735C) {
                i3 = 0;
            }
            i5++;
        }
        if (this.f3968m && (z3 || i7 + i6 > i3)) {
            i3--;
        }
        int i9 = i3 - i6;
        SparseBooleanArray sparseBooleanArray = this.f3974s;
        sparseBooleanArray.clear();
        int i10 = 0;
        int i11 = 0;
        while (i10 < i) {
            l.o oVar2 = (l.o) arrayList.get(i10);
            int i12 = oVar2.f3757y;
            boolean z4 = (i12 & 2) == i2 ? z2 : false;
            int i13 = oVar2.f3737b;
            if (z4) {
                View a2 = a(oVar2, null, viewGroup);
                a2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a2.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i11 == 0) {
                    i11 = measuredWidth;
                }
                if (i13 != 0) {
                    sparseBooleanArray.put(i13, z2);
                }
                oVar2.h(z2);
            } else if ((i12 & 1) == z2) {
                boolean z5 = sparseBooleanArray.get(i13);
                boolean z6 = ((i9 > 0 || z5) && i4 > 0) ? z2 : false;
                if (z6) {
                    View a3 = a(oVar2, null, viewGroup);
                    a3.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = a3.getMeasuredWidth();
                    i4 -= measuredWidth2;
                    if (i11 == 0) {
                        i11 = measuredWidth2;
                    }
                    z6 &= i4 + i11 > 0;
                }
                if (z6 && i13 != 0) {
                    sparseBooleanArray.put(i13, true);
                } else if (z5) {
                    sparseBooleanArray.put(i13, false);
                    for (int i14 = 0; i14 < i10; i14++) {
                        l.o oVar3 = (l.o) arrayList.get(i14);
                        if (oVar3.f3737b == i13) {
                            if (oVar3.f()) {
                                i9++;
                            }
                            oVar3.h(false);
                        }
                    }
                }
                if (z6) {
                    i9--;
                }
                oVar2.h(z6);
            } else {
                oVar2.h(false);
                i10++;
                i2 = 2;
                z2 = true;
            }
            i10++;
            i2 = 2;
            z2 = true;
        }
        return z2;
    }

    @Override // l.y
    public final boolean k(l.o oVar) {
        return false;
    }

    @Override // l.y
    public final Parcelable l() {
        C0262k c0262k = new C0262k();
        c0262k.f3958a = this.f3980y;
        return c0262k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.y
    public final void m(boolean z2) {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.f3965h;
        ArrayList arrayList = null;
        boolean z3 = false;
        if (viewGroup != null) {
            MenuC0229m menuC0229m = this.f3961c;
            if (menuC0229m != null) {
                menuC0229m.i();
                ArrayList l2 = this.f3961c.l();
                int size = l2.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    l.o oVar = (l.o) l2.get(i2);
                    if (oVar.f()) {
                        View childAt = viewGroup.getChildAt(i);
                        l.o itemData = childAt instanceof l.z ? ((l.z) childAt).getItemData() : null;
                        View a2 = a(oVar, childAt, viewGroup);
                        if (oVar != itemData) {
                            a2.setPressed(false);
                            a2.jumpDrawablesToCurrentState();
                        }
                        if (a2 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a2.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a2);
                            }
                            ((ViewGroup) this.f3965h).addView(a2, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.j) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.f3965h).requestLayout();
        MenuC0229m menuC0229m2 = this.f3961c;
        if (menuC0229m2 != null) {
            menuC0229m2.i();
            ArrayList arrayList2 = menuC0229m2.i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                l.p pVar = ((l.o) arrayList2.get(i3)).f3733A;
            }
        }
        MenuC0229m menuC0229m3 = this.f3961c;
        if (menuC0229m3 != null) {
            menuC0229m3.i();
            arrayList = menuC0229m3.j;
        }
        if (this.f3968m && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z3 = !((l.o) arrayList.get(0)).f3735C;
            } else if (size3 > 0) {
                z3 = true;
            }
        }
        if (z3) {
            if (this.j == null) {
                this.j = new C0260j(this, this.f3959a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.j.getParent();
            if (viewGroup3 != this.f3965h) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.j);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f3965h;
                C0260j c0260j = this.j;
                actionMenuView.getClass();
                C0268n j = ActionMenuView.j();
                j.f3983a = true;
                actionMenuView.addView(c0260j, j);
            }
        } else {
            C0260j c0260j2 = this.j;
            if (c0260j2 != null) {
                Object parent = c0260j2.getParent();
                Object obj = this.f3965h;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.j);
                }
            }
        }
        ((ActionMenuView) this.f3965h).setOverflowReserved(this.f3968m);
    }

    @Override // l.y
    public final void n(Parcelable parcelable) {
        int i;
        MenuItem findItem;
        if ((parcelable instanceof C0262k) && (i = ((C0262k) parcelable).f3958a) > 0 && (findItem = this.f3961c.findItem(i)) != null) {
            e((SubMenuC0216E) findItem.getSubMenu());
        }
    }

    public final boolean o() {
        MenuC0229m menuC0229m;
        if (!this.f3968m || g() || (menuC0229m = this.f3961c) == null || this.f3965h == null || this.f3977v != null) {
            return false;
        }
        menuC0229m.i();
        if (menuC0229m.j.isEmpty()) {
            return false;
        }
        RunnableC0258i runnableC0258i = new RunnableC0258i(this, new C0254g(this, this.f3960b, this.f3961c, this.j));
        this.f3977v = runnableC0258i;
        ((View) this.f3965h).post(runnableC0258i);
        return true;
    }
}
