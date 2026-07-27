package h;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.icecatchbiger.hookfrostmaster.R;
import java.util.ArrayList;

/* renamed from: h.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0165i implements g.p {

    /* renamed from: e, reason: collision with root package name */
    public final Context f2195e;

    /* renamed from: f, reason: collision with root package name */
    public Context f2196f;

    /* renamed from: g, reason: collision with root package name */
    public g.j f2197g;

    /* renamed from: h, reason: collision with root package name */
    public final LayoutInflater f2198h;

    /* renamed from: i, reason: collision with root package name */
    public g.o f2199i;

    /* renamed from: k, reason: collision with root package name */
    public ActionMenuView f2201k;

    /* renamed from: l, reason: collision with root package name */
    public C0164h f2202l;

    /* renamed from: m, reason: collision with root package name */
    public Drawable f2203m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2204n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2205o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2206p;

    /* renamed from: q, reason: collision with root package name */
    public int f2207q;
    public int r;

    /* renamed from: s, reason: collision with root package name */
    public int f2208s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2209t;

    /* renamed from: v, reason: collision with root package name */
    public C0162f f2211v;

    /* renamed from: w, reason: collision with root package name */
    public C0162f f2212w;

    /* renamed from: x, reason: collision with root package name */
    public Q0.i f2213x;

    /* renamed from: y, reason: collision with root package name */
    public C0163g f2214y;

    /* renamed from: j, reason: collision with root package name */
    public final int f2200j = R.layout.abc_action_menu_item_layout;

    /* renamed from: u, reason: collision with root package name */
    public final SparseBooleanArray f2210u = new SparseBooleanArray();

    /* renamed from: z, reason: collision with root package name */
    public final A.j f2215z = new A.j(21, this);

    public C0165i(Context context) {
        this.f2195e = context;
        this.f2198h = LayoutInflater.from(context);
    }

    @Override // g.p
    public final void a(g.j jVar, boolean z2) {
        e();
        C0162f c0162f = this.f2212w;
        if (c0162f != null && c0162f.b()) {
            c0162f.f2028i.dismiss();
        }
        g.o oVar = this.f2199i;
        if (oVar != null) {
            oVar.a(jVar, z2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // g.p
    public final void b() {
        int i2;
        ActionMenuView actionMenuView = this.f2201k;
        ArrayList arrayList = null;
        boolean z2 = false;
        if (actionMenuView != null) {
            g.j jVar = this.f2197g;
            if (jVar != null) {
                jVar.i();
                ArrayList k2 = this.f2197g.k();
                int size = k2.size();
                i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    g.k kVar = (g.k) k2.get(i3);
                    if (kVar.d()) {
                        View childAt = actionMenuView.getChildAt(i2);
                        g.k itemData = childAt instanceof g.q ? ((g.q) childAt).getItemData() : null;
                        View c2 = c(kVar, childAt, actionMenuView);
                        if (kVar != itemData) {
                            c2.setPressed(false);
                            c2.jumpDrawablesToCurrentState();
                        }
                        if (c2 != childAt) {
                            ViewGroup viewGroup = (ViewGroup) c2.getParent();
                            if (viewGroup != null) {
                                viewGroup.removeView(c2);
                            }
                            this.f2201k.addView(c2, i2);
                        }
                        i2++;
                    }
                }
            } else {
                i2 = 0;
            }
            while (i2 < actionMenuView.getChildCount()) {
                if (actionMenuView.getChildAt(i2) == this.f2202l) {
                    i2++;
                } else {
                    actionMenuView.removeViewAt(i2);
                }
            }
        }
        this.f2201k.requestLayout();
        g.j jVar2 = this.f2197g;
        if (jVar2 != null) {
            jVar2.i();
            ArrayList arrayList2 = jVar2.f1980i;
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                ((g.k) arrayList2.get(i4)).getClass();
            }
        }
        g.j jVar3 = this.f2197g;
        if (jVar3 != null) {
            jVar3.i();
            arrayList = jVar3.f1981j;
        }
        if (this.f2205o && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z2 = !((g.k) arrayList.get(0)).f1992B;
            } else if (size3 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.f2202l == null) {
                this.f2202l = new C0164h(this, this.f2195e);
            }
            ViewGroup viewGroup2 = (ViewGroup) this.f2202l.getParent();
            if (viewGroup2 != this.f2201k) {
                if (viewGroup2 != null) {
                    viewGroup2.removeView(this.f2202l);
                }
                ActionMenuView actionMenuView2 = this.f2201k;
                C0164h c0164h = this.f2202l;
                actionMenuView2.getClass();
                C0167k h2 = ActionMenuView.h();
                h2.f2221c = true;
                actionMenuView2.addView(c0164h, h2);
            }
        } else {
            C0164h c0164h2 = this.f2202l;
            if (c0164h2 != null) {
                ViewParent parent = c0164h2.getParent();
                ActionMenuView actionMenuView3 = this.f2201k;
                if (parent == actionMenuView3) {
                    actionMenuView3.removeView(this.f2202l);
                }
            }
        }
        this.f2201k.setOverflowReserved(this.f2205o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [g.q] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final View c(g.k kVar, View view, ActionMenuView actionMenuView) {
        View view2 = kVar.f2017z;
        if (view2 == null) {
            view2 = null;
        }
        if (view2 == null || kVar.c()) {
            ActionMenuItemView actionMenuItemView = view instanceof g.q ? (g.q) view : (g.q) this.f2198h.inflate(this.f2200j, (ViewGroup) actionMenuView, false);
            actionMenuItemView.c(kVar);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker(this.f2201k);
            if (this.f2214y == null) {
                this.f2214y = new C0163g(this);
            }
            actionMenuItemView2.setPopupCallback(this.f2214y);
            view2 = actionMenuItemView;
        }
        view2.setVisibility(kVar.f1992B ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        actionMenuView.getClass();
        if (!(layoutParams instanceof C0167k)) {
            view2.setLayoutParams(ActionMenuView.i(layoutParams));
        }
        return view2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // g.p
    public final boolean d(g.t tVar) {
        boolean z2;
        if (!tVar.hasVisibleItems()) {
            return false;
        }
        g.t tVar2 = tVar;
        while (true) {
            g.j jVar = tVar2.f2049v;
            if (jVar == this.f2197g) {
                break;
            }
            tVar2 = (g.t) jVar;
        }
        ActionMenuView actionMenuView = this.f2201k;
        View view = null;
        if (actionMenuView != null) {
            int childCount = actionMenuView.getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    break;
                }
                View childAt = actionMenuView.getChildAt(i2);
                if ((childAt instanceof g.q) && ((g.q) childAt).getItemData() == tVar2.f2050w) {
                    view = childAt;
                    break;
                }
                i2++;
            }
        }
        if (view == null) {
            return false;
        }
        tVar.f2050w.getClass();
        int size = tVar.f1977f.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                z2 = false;
                break;
            }
            MenuItem item = tVar.getItem(i3);
            if (item.isVisible() && item.getIcon() != null) {
                z2 = true;
                break;
            }
            i3++;
        }
        C0162f c0162f = new C0162f(this, this.f2196f, tVar, view);
        this.f2212w = c0162f;
        c0162f.f2026g = z2;
        g.l lVar = c0162f.f2028i;
        if (lVar != null) {
            lVar.o(z2);
        }
        C0162f c0162f2 = this.f2212w;
        if (!c0162f2.b()) {
            if (c0162f2.f2024e == null) {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
            c0162f2.d(0, 0, false, false);
        }
        g.o oVar = this.f2199i;
        if (oVar != null) {
            oVar.n(tVar);
        }
        return true;
    }

    public final boolean e() {
        ActionMenuView actionMenuView;
        Q0.i iVar = this.f2213x;
        if (iVar != null && (actionMenuView = this.f2201k) != null) {
            actionMenuView.removeCallbacks(iVar);
            this.f2213x = null;
            return true;
        }
        C0162f c0162f = this.f2211v;
        if (c0162f == null) {
            return false;
        }
        if (c0162f.b()) {
            c0162f.f2028i.dismiss();
        }
        return true;
    }

    public final boolean f() {
        g.j jVar;
        if (!this.f2205o) {
            return false;
        }
        C0162f c0162f = this.f2211v;
        if ((c0162f != null && c0162f.b()) || (jVar = this.f2197g) == null || this.f2201k == null || this.f2213x != null) {
            return false;
        }
        jVar.i();
        if (jVar.f1981j.isEmpty()) {
            return false;
        }
        Q0.i iVar = new Q0.i(1, this, new C0162f(this, this.f2196f, this.f2197g, this.f2202l));
        this.f2213x = iVar;
        this.f2201k.post(iVar);
        g.o oVar = this.f2199i;
        if (oVar == null) {
            return true;
        }
        oVar.n(null);
        return true;
    }

    @Override // g.p
    public final void g(g.o oVar) {
        throw null;
    }

    @Override // g.p
    public final boolean h() {
        int i2;
        ArrayList arrayList;
        int i3;
        boolean z2;
        g.j jVar = this.f2197g;
        if (jVar != null) {
            arrayList = jVar.k();
            i2 = arrayList.size();
        } else {
            i2 = 0;
            arrayList = null;
        }
        int i4 = this.f2208s;
        int i5 = this.r;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ActionMenuView actionMenuView = this.f2201k;
        int i6 = 0;
        boolean z3 = false;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            i3 = 2;
            z2 = true;
            if (i6 >= i2) {
                break;
            }
            g.k kVar = (g.k) arrayList.get(i6);
            int i9 = kVar.f2016y;
            if ((i9 & 2) == 2) {
                i7++;
            } else if ((i9 & 1) == 1) {
                i8++;
            } else {
                z3 = true;
            }
            if (this.f2209t && kVar.f1992B) {
                i4 = 0;
            }
            i6++;
        }
        if (this.f2205o && (z3 || i8 + i7 > i4)) {
            i4--;
        }
        int i10 = i4 - i7;
        SparseBooleanArray sparseBooleanArray = this.f2210u;
        sparseBooleanArray.clear();
        int i11 = 0;
        int i12 = 0;
        while (i11 < i2) {
            g.k kVar2 = (g.k) arrayList.get(i11);
            int i13 = kVar2.f2016y;
            boolean z4 = (i13 & 2) == i3 ? z2 : false;
            int i14 = kVar2.f1994b;
            if (z4) {
                View c2 = c(kVar2, null, actionMenuView);
                c2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = c2.getMeasuredWidth();
                i5 -= measuredWidth;
                if (i12 == 0) {
                    i12 = measuredWidth;
                }
                if (i14 != 0) {
                    sparseBooleanArray.put(i14, z2);
                }
                kVar2.f(z2);
            } else if ((i13 & 1) == z2) {
                boolean z5 = sparseBooleanArray.get(i14);
                boolean z6 = ((i10 > 0 || z5) && i5 > 0) ? z2 : false;
                if (z6) {
                    View c3 = c(kVar2, null, actionMenuView);
                    c3.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = c3.getMeasuredWidth();
                    i5 -= measuredWidth2;
                    if (i12 == 0) {
                        i12 = measuredWidth2;
                    }
                    z6 &= i5 + i12 > 0;
                }
                if (z6 && i14 != 0) {
                    sparseBooleanArray.put(i14, true);
                } else if (z5) {
                    sparseBooleanArray.put(i14, false);
                    for (int i15 = 0; i15 < i11; i15++) {
                        g.k kVar3 = (g.k) arrayList.get(i15);
                        if (kVar3.f1994b == i14) {
                            if (kVar3.d()) {
                                i10++;
                            }
                            kVar3.f(false);
                        }
                    }
                }
                if (z6) {
                    i10--;
                }
                kVar2.f(z6);
            } else {
                kVar2.f(false);
                i11++;
                i3 = 2;
                z2 = true;
            }
            i11++;
            i3 = 2;
            z2 = true;
        }
        return z2;
    }

    @Override // g.p
    public final void i(Context context, g.j jVar) {
        this.f2196f = context;
        LayoutInflater.from(context);
        this.f2197g = jVar;
        Resources resources = context.getResources();
        if (!this.f2206p) {
            this.f2205o = true;
        }
        int i2 = 2;
        this.f2207q = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i3 = configuration.screenWidthDp;
        int i4 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i3 > 600 || ((i3 > 960 && i4 > 720) || (i3 > 720 && i4 > 960))) {
            i2 = 5;
        } else if (i3 >= 500 || ((i3 > 640 && i4 > 480) || (i3 > 480 && i4 > 640))) {
            i2 = 4;
        } else if (i3 >= 360) {
            i2 = 3;
        }
        this.f2208s = i2;
        int i5 = this.f2207q;
        if (this.f2205o) {
            if (this.f2202l == null) {
                C0164h c0164h = new C0164h(this, this.f2195e);
                this.f2202l = c0164h;
                if (this.f2204n) {
                    c0164h.setImageDrawable(this.f2203m);
                    this.f2203m = null;
                    this.f2204n = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f2202l.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i5 -= this.f2202l.getMeasuredWidth();
        } else {
            this.f2202l = null;
        }
        this.r = i5;
        float f2 = resources.getDisplayMetrics().density;
    }

    @Override // g.p
    public final boolean j(g.k kVar) {
        return false;
    }

    @Override // g.p
    public final boolean k(g.k kVar) {
        return false;
    }
}
