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
import com.watchfacestudio.spraktum.R;
import java.util.ArrayList;

/* renamed from: h.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0213i implements g.p {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3252a;

    /* renamed from: b, reason: collision with root package name */
    public Context f3253b;

    /* renamed from: c, reason: collision with root package name */
    public g.j f3254c;

    /* renamed from: d, reason: collision with root package name */
    public final LayoutInflater f3255d;

    /* renamed from: e, reason: collision with root package name */
    public g.o f3256e;

    /* renamed from: g, reason: collision with root package name */
    public ActionMenuView f3258g;

    /* renamed from: h, reason: collision with root package name */
    public C0212h f3259h;

    /* renamed from: i, reason: collision with root package name */
    public Drawable f3260i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3261j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3262k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3263l;

    /* renamed from: m, reason: collision with root package name */
    public int f3264m;

    /* renamed from: n, reason: collision with root package name */
    public int f3265n;

    /* renamed from: o, reason: collision with root package name */
    public int f3266o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f3267p;

    /* renamed from: r, reason: collision with root package name */
    public C0210f f3269r;

    /* renamed from: s, reason: collision with root package name */
    public C0210f f3270s;
    public D0.f t;

    /* renamed from: u, reason: collision with root package name */
    public C0211g f3271u;

    /* renamed from: f, reason: collision with root package name */
    public final int f3257f = R.layout.abc_action_menu_item_layout;

    /* renamed from: q, reason: collision with root package name */
    public final SparseBooleanArray f3268q = new SparseBooleanArray();

    /* renamed from: v, reason: collision with root package name */
    public final Z0.i f3272v = new Z0.i(18, this);

    public C0213i(Context context) {
        this.f3252a = context;
        this.f3255d = LayoutInflater.from(context);
    }

    @Override // g.p
    public final void a(g.j jVar, boolean z2) {
        i();
        C0210f c0210f = this.f3270s;
        if (c0210f != null && c0210f.b()) {
            c0210f.f3107i.dismiss();
        }
        g.o oVar = this.f3256e;
        if (oVar != null) {
            oVar.a(jVar, z2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // g.p
    public final boolean b(g.t tVar) {
        boolean z2;
        if (!tVar.hasVisibleItems()) {
            return false;
        }
        g.t tVar2 = tVar;
        while (true) {
            g.j jVar = tVar2.f3128v;
            if (jVar == this.f3254c) {
                break;
            }
            tVar2 = (g.t) jVar;
        }
        ActionMenuView actionMenuView = this.f3258g;
        View view = null;
        if (actionMenuView != null) {
            int childCount = actionMenuView.getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    break;
                }
                View childAt = actionMenuView.getChildAt(i2);
                if ((childAt instanceof g.q) && ((g.q) childAt).getItemData() == tVar2.f3129w) {
                    view = childAt;
                    break;
                }
                i2++;
            }
        }
        if (view == null) {
            return false;
        }
        tVar.f3129w.getClass();
        int size = tVar.f3056f.size();
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
        C0210f c0210f = new C0210f(this, this.f3253b, tVar, view);
        this.f3270s = c0210f;
        c0210f.f3105g = z2;
        g.l lVar = c0210f.f3107i;
        if (lVar != null) {
            lVar.o(z2);
        }
        C0210f c0210f2 = this.f3270s;
        if (!c0210f2.b()) {
            if (c0210f2.f3103e == null) {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
            c0210f2.d(0, 0, false, false);
        }
        g.o oVar = this.f3256e;
        if (oVar != null) {
            oVar.e(tVar);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [g.q] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final View c(g.k kVar, View view, ActionMenuView actionMenuView) {
        View view2 = kVar.f3096z;
        if (view2 == null) {
            view2 = null;
        }
        if (view2 == null || kVar.c()) {
            ActionMenuItemView actionMenuItemView = view instanceof g.q ? (g.q) view : (g.q) this.f3255d.inflate(this.f3257f, (ViewGroup) actionMenuView, false);
            actionMenuItemView.c(kVar);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker(this.f3258g);
            if (this.f3271u == null) {
                this.f3271u = new C0211g(this);
            }
            actionMenuItemView2.setPopupCallback(this.f3271u);
            view2 = actionMenuItemView;
        }
        view2.setVisibility(kVar.f3071B ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        actionMenuView.getClass();
        if (!(layoutParams instanceof C0215k)) {
            view2.setLayoutParams(ActionMenuView.i(layoutParams));
        }
        return view2;
    }

    @Override // g.p
    public final void d(g.o oVar) {
        throw null;
    }

    @Override // g.p
    public final boolean e() {
        int i2;
        ArrayList arrayList;
        int i3;
        boolean z2;
        g.j jVar = this.f3254c;
        if (jVar != null) {
            arrayList = jVar.k();
            i2 = arrayList.size();
        } else {
            i2 = 0;
            arrayList = null;
        }
        int i4 = this.f3266o;
        int i5 = this.f3265n;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ActionMenuView actionMenuView = this.f3258g;
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
            int i9 = kVar.f3095y;
            if ((i9 & 2) == 2) {
                i7++;
            } else if ((i9 & 1) == 1) {
                i8++;
            } else {
                z3 = true;
            }
            if (this.f3267p && kVar.f3071B) {
                i4 = 0;
            }
            i6++;
        }
        if (this.f3262k && (z3 || i8 + i7 > i4)) {
            i4--;
        }
        int i10 = i4 - i7;
        SparseBooleanArray sparseBooleanArray = this.f3268q;
        sparseBooleanArray.clear();
        int i11 = 0;
        int i12 = 0;
        while (i11 < i2) {
            g.k kVar2 = (g.k) arrayList.get(i11);
            int i13 = kVar2.f3095y;
            boolean z4 = (i13 & 2) == i3 ? z2 : false;
            int i14 = kVar2.f3073b;
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
                        if (kVar3.f3073b == i14) {
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
    public final boolean f(g.k kVar) {
        return false;
    }

    @Override // g.p
    public final boolean g(g.k kVar) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // g.p
    public final void h() {
        int i2;
        ActionMenuView actionMenuView = this.f3258g;
        ArrayList arrayList = null;
        boolean z2 = false;
        if (actionMenuView != null) {
            g.j jVar = this.f3254c;
            if (jVar != null) {
                jVar.i();
                ArrayList k2 = this.f3254c.k();
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
                            this.f3258g.addView(c2, i2);
                        }
                        i2++;
                    }
                }
            } else {
                i2 = 0;
            }
            while (i2 < actionMenuView.getChildCount()) {
                if (actionMenuView.getChildAt(i2) == this.f3259h) {
                    i2++;
                } else {
                    actionMenuView.removeViewAt(i2);
                }
            }
        }
        this.f3258g.requestLayout();
        g.j jVar2 = this.f3254c;
        if (jVar2 != null) {
            jVar2.i();
            ArrayList arrayList2 = jVar2.f3059i;
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                ((g.k) arrayList2.get(i4)).getClass();
            }
        }
        g.j jVar3 = this.f3254c;
        if (jVar3 != null) {
            jVar3.i();
            arrayList = jVar3.f3060j;
        }
        if (this.f3262k && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z2 = !((g.k) arrayList.get(0)).f3071B;
            } else if (size3 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.f3259h == null) {
                this.f3259h = new C0212h(this, this.f3252a);
            }
            ViewGroup viewGroup2 = (ViewGroup) this.f3259h.getParent();
            if (viewGroup2 != this.f3258g) {
                if (viewGroup2 != null) {
                    viewGroup2.removeView(this.f3259h);
                }
                ActionMenuView actionMenuView2 = this.f3258g;
                C0212h c0212h = this.f3259h;
                actionMenuView2.getClass();
                C0215k h2 = ActionMenuView.h();
                h2.f3278c = true;
                actionMenuView2.addView(c0212h, h2);
            }
        } else {
            C0212h c0212h2 = this.f3259h;
            if (c0212h2 != null) {
                ViewParent parent = c0212h2.getParent();
                ActionMenuView actionMenuView3 = this.f3258g;
                if (parent == actionMenuView3) {
                    actionMenuView3.removeView(this.f3259h);
                }
            }
        }
        this.f3258g.setOverflowReserved(this.f3262k);
    }

    public final boolean i() {
        ActionMenuView actionMenuView;
        D0.f fVar = this.t;
        if (fVar != null && (actionMenuView = this.f3258g) != null) {
            actionMenuView.removeCallbacks(fVar);
            this.t = null;
            return true;
        }
        C0210f c0210f = this.f3269r;
        if (c0210f == null) {
            return false;
        }
        if (c0210f.b()) {
            c0210f.f3107i.dismiss();
        }
        return true;
    }

    public final boolean j() {
        g.j jVar;
        if (!this.f3262k) {
            return false;
        }
        C0210f c0210f = this.f3269r;
        if ((c0210f != null && c0210f.b()) || (jVar = this.f3254c) == null || this.f3258g == null || this.t != null) {
            return false;
        }
        jVar.i();
        if (jVar.f3060j.isEmpty()) {
            return false;
        }
        D0.f fVar = new D0.f(4, this, new C0210f(this, this.f3253b, this.f3254c, this.f3259h));
        this.t = fVar;
        this.f3258g.post(fVar);
        g.o oVar = this.f3256e;
        if (oVar == null) {
            return true;
        }
        oVar.e(null);
        return true;
    }

    @Override // g.p
    public final void k(Context context, g.j jVar) {
        this.f3253b = context;
        LayoutInflater.from(context);
        this.f3254c = jVar;
        Resources resources = context.getResources();
        if (!this.f3263l) {
            this.f3262k = true;
        }
        int i2 = 2;
        this.f3264m = context.getResources().getDisplayMetrics().widthPixels / 2;
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
        this.f3266o = i2;
        int i5 = this.f3264m;
        if (this.f3262k) {
            if (this.f3259h == null) {
                C0212h c0212h = new C0212h(this, this.f3252a);
                this.f3259h = c0212h;
                if (this.f3261j) {
                    c0212h.setImageDrawable(this.f3260i);
                    this.f3260i = null;
                    this.f3261j = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f3259h.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i5 -= this.f3259h.getMeasuredWidth();
        } else {
            this.f3259h = null;
        }
        this.f3265n = i5;
        float f2 = resources.getDisplayMetrics().density;
    }
}
