package m;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.icefishing.icefishingbigwin.C5275R;
import java.util.ArrayList;
import l.C4648e;
import l.InterfaceC4639A;
import l.SubMenuC4643E;

/* renamed from: m.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4695k implements l.y {

    /* renamed from: A, reason: collision with root package name */
    public InterfaceC4639A f39157A;

    /* renamed from: B, reason: collision with root package name */
    public C4693j f39158B;

    /* renamed from: C, reason: collision with root package name */
    public Drawable f39159C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f39160D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f39161E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f39162F;

    /* renamed from: G, reason: collision with root package name */
    public int f39163G;

    /* renamed from: H, reason: collision with root package name */
    public int f39164H;

    /* renamed from: I, reason: collision with root package name */
    public int f39165I;
    public boolean J;

    /* renamed from: L, reason: collision with root package name */
    public C4687g f39167L;

    /* renamed from: M, reason: collision with root package name */
    public C4687g f39168M;

    /* renamed from: N, reason: collision with root package name */
    public RunnableC4691i f39169N;

    /* renamed from: O, reason: collision with root package name */
    public C4689h f39170O;

    /* renamed from: n, reason: collision with root package name */
    public final Context f39172n;

    /* renamed from: u, reason: collision with root package name */
    public Context f39173u;

    /* renamed from: v, reason: collision with root package name */
    public l.m f39174v;

    /* renamed from: w, reason: collision with root package name */
    public final LayoutInflater f39175w;

    /* renamed from: x, reason: collision with root package name */
    public l.x f39176x;

    /* renamed from: y, reason: collision with root package name */
    public final int f39177y = C5275R.layout.abc_action_menu_layout;

    /* renamed from: z, reason: collision with root package name */
    public final int f39178z = C5275R.layout.abc_action_menu_item_layout;

    /* renamed from: K, reason: collision with root package name */
    public final SparseBooleanArray f39166K = new SparseBooleanArray();

    /* renamed from: P, reason: collision with root package name */
    public final C4648e f39171P = new C4648e(1, this);

    public C4695k(Context context) {
        this.f39172n = context;
        this.f39175w = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [l.z] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final View a(l.o oVar, View view, ViewGroup viewGroup) {
        View actionView = oVar.getActionView();
        if (actionView == null || oVar.e()) {
            ActionMenuItemView actionMenuItemView = view instanceof l.z ? (l.z) view : (l.z) this.f39175w.inflate(this.f39178z, viewGroup, false);
            actionMenuItemView.b(oVar);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.f39157A);
            if (this.f39170O == null) {
                this.f39170O = new C4689h(this);
            }
            actionMenuItemView2.setPopupCallback(this.f39170O);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(oVar.f38850V ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C4699m)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    @Override // l.y
    public final void b(l.m mVar, boolean z3) {
        f();
        C4687g c4687g = this.f39168M;
        if (c4687g != null && c4687g.b()) {
            c4687g.i.dismiss();
        }
        l.x xVar = this.f39176x;
        if (xVar != null) {
            xVar.b(mVar, z3);
        }
    }

    @Override // l.y
    public final boolean c(l.o oVar) {
        return false;
    }

    @Override // l.y
    public final boolean d() {
        int i;
        ArrayList arrayList;
        int i6;
        boolean z3;
        C4695k c4695k = this;
        l.m mVar = c4695k.f39174v;
        if (mVar != null) {
            arrayList = mVar.l();
            i = arrayList.size();
        } else {
            i = 0;
            arrayList = null;
        }
        int i9 = c4695k.f39165I;
        int i10 = c4695k.f39164H;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) c4695k.f39157A;
        int i11 = 0;
        boolean z6 = false;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            i6 = 2;
            z3 = true;
            if (i11 >= i) {
                break;
            }
            l.o oVar = (l.o) arrayList.get(i11);
            int i14 = oVar.f38846R;
            if ((i14 & 2) == 2) {
                i12++;
            } else if ((i14 & 1) == 1) {
                i13++;
            } else {
                z6 = true;
            }
            if (c4695k.J && oVar.f38850V) {
                i9 = 0;
            }
            i11++;
        }
        if (c4695k.f39161E && (z6 || i13 + i12 > i9)) {
            i9--;
        }
        int i15 = i9 - i12;
        SparseBooleanArray sparseBooleanArray = c4695k.f39166K;
        sparseBooleanArray.clear();
        int i16 = 0;
        int i17 = 0;
        while (i16 < i) {
            l.o oVar2 = (l.o) arrayList.get(i16);
            int i18 = oVar2.f38846R;
            boolean z9 = (i18 & 2) == i6 ? z3 : false;
            int i19 = oVar2.f38852u;
            if (z9) {
                View a9 = c4695k.a(oVar2, null, viewGroup);
                a9.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a9.getMeasuredWidth();
                i10 -= measuredWidth;
                if (i17 == 0) {
                    i17 = measuredWidth;
                }
                if (i19 != 0) {
                    sparseBooleanArray.put(i19, z3);
                }
                oVar2.f(z3);
            } else if ((i18 & 1) == z3) {
                boolean z10 = sparseBooleanArray.get(i19);
                boolean z11 = ((i15 > 0 || z10) && i10 > 0) ? z3 : false;
                if (z11) {
                    View a10 = c4695k.a(oVar2, null, viewGroup);
                    a10.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = a10.getMeasuredWidth();
                    i10 -= measuredWidth2;
                    if (i17 == 0) {
                        i17 = measuredWidth2;
                    }
                    z11 &= i10 + i17 > 0;
                }
                if (z11 && i19 != 0) {
                    sparseBooleanArray.put(i19, true);
                } else if (z10) {
                    sparseBooleanArray.put(i19, false);
                    for (int i20 = 0; i20 < i16; i20++) {
                        l.o oVar3 = (l.o) arrayList.get(i20);
                        if (oVar3.f38852u == i19) {
                            if ((oVar3.f38845Q & 32) == 32) {
                                i15++;
                            }
                            oVar3.f(false);
                        }
                    }
                }
                if (z11) {
                    i15--;
                }
                oVar2.f(z11);
            } else {
                oVar2.f(false);
                i16++;
                i6 = 2;
                c4695k = this;
                z3 = true;
            }
            i16++;
            i6 = 2;
            c4695k = this;
            z3 = true;
        }
        return z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.y
    public final void e() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.f39157A;
        ArrayList arrayList = null;
        boolean z3 = false;
        if (viewGroup != null) {
            l.m mVar = this.f39174v;
            if (mVar != null) {
                mVar.i();
                ArrayList l9 = this.f39174v.l();
                int size = l9.size();
                i = 0;
                for (int i6 = 0; i6 < size; i6++) {
                    l.o oVar = (l.o) l9.get(i6);
                    if ((oVar.f38845Q & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        l.o itemData = childAt instanceof l.z ? ((l.z) childAt).getItemData() : null;
                        View a9 = a(oVar, childAt, viewGroup);
                        if (oVar != itemData) {
                            a9.setPressed(false);
                            a9.jumpDrawablesToCurrentState();
                        }
                        if (a9 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a9.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a9);
                            }
                            ((ViewGroup) this.f39157A).addView(a9, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.f39158B) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.f39157A).requestLayout();
        l.m mVar2 = this.f39174v;
        if (mVar2 != null) {
            mVar2.i();
            ArrayList arrayList2 = mVar2.f38805B;
            int size2 = arrayList2.size();
            for (int i9 = 0; i9 < size2; i9++) {
                l.p pVar = ((l.o) arrayList2.get(i9)).f38848T;
            }
        }
        l.m mVar3 = this.f39174v;
        if (mVar3 != null) {
            mVar3.i();
            arrayList = mVar3.f38806C;
        }
        if (this.f39161E && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z3 = !((l.o) arrayList.get(0)).f38850V;
            } else if (size3 > 0) {
                z3 = true;
            }
        }
        if (z3) {
            if (this.f39158B == null) {
                this.f39158B = new C4693j(this, this.f39172n);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f39158B.getParent();
            if (viewGroup3 != this.f39157A) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f39158B);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f39157A;
                C4693j c4693j = this.f39158B;
                actionMenuView.getClass();
                C4699m j6 = ActionMenuView.j();
                j6.f39183a = true;
                actionMenuView.addView(c4693j, j6);
            }
        } else {
            C4693j c4693j2 = this.f39158B;
            if (c4693j2 != null) {
                Object parent = c4693j2.getParent();
                Object obj = this.f39157A;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f39158B);
                }
            }
        }
        ((ActionMenuView) this.f39157A).setOverflowReserved(this.f39161E);
    }

    public final boolean f() {
        Object obj;
        RunnableC4691i runnableC4691i = this.f39169N;
        if (runnableC4691i != null && (obj = this.f39157A) != null) {
            ((View) obj).removeCallbacks(runnableC4691i);
            this.f39169N = null;
            return true;
        }
        C4687g c4687g = this.f39167L;
        if (c4687g == null) {
            return false;
        }
        if (c4687g.b()) {
            c4687g.i.dismiss();
        }
        return true;
    }

    @Override // l.y
    public final void g(l.x xVar) {
        throw null;
    }

    @Override // l.y
    public final void h(Context context, l.m mVar) {
        this.f39173u = context;
        LayoutInflater.from(context);
        this.f39174v = mVar;
        Resources resources = context.getResources();
        if (!this.f39162F) {
            this.f39161E = true;
        }
        int i = 2;
        this.f39163G = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i6 = configuration.screenWidthDp;
        int i9 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i6 > 600 || ((i6 > 960 && i9 > 720) || (i6 > 720 && i9 > 960))) {
            i = 5;
        } else if (i6 >= 500 || ((i6 > 640 && i9 > 480) || (i6 > 480 && i9 > 640))) {
            i = 4;
        } else if (i6 >= 360) {
            i = 3;
        }
        this.f39165I = i;
        int i10 = this.f39163G;
        if (this.f39161E) {
            if (this.f39158B == null) {
                C4693j c4693j = new C4693j(this, this.f39172n);
                this.f39158B = c4693j;
                if (this.f39160D) {
                    c4693j.setImageDrawable(this.f39159C);
                    this.f39159C = null;
                    this.f39160D = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f39158B.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i10 -= this.f39158B.getMeasuredWidth();
        } else {
            this.f39158B = null;
        }
        this.f39164H = i10;
        float f3 = resources.getDisplayMetrics().density;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.y
    public final boolean i(SubMenuC4643E subMenuC4643E) {
        boolean z3;
        if (subMenuC4643E.hasVisibleItems()) {
            SubMenuC4643E subMenuC4643E2 = subMenuC4643E;
            while (true) {
                l.m mVar = subMenuC4643E2.f38738S;
                if (mVar == this.f39174v) {
                    break;
                }
                subMenuC4643E2 = (SubMenuC4643E) mVar;
            }
            ViewGroup viewGroup = (ViewGroup) this.f39157A;
            View view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof l.z) && ((l.z) childAt).getItemData() == subMenuC4643E2.f38739T) {
                        view = childAt;
                        break;
                    }
                    i++;
                }
            }
            if (view != null) {
                subMenuC4643E.f38739T.getClass();
                int size = subMenuC4643E.f38825y.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size) {
                        z3 = false;
                        break;
                    }
                    MenuItem item = subMenuC4643E.getItem(i6);
                    if (item.isVisible() && item.getIcon() != null) {
                        z3 = true;
                        break;
                    }
                    i6++;
                }
                C4687g c4687g = new C4687g(this, this.f39173u, subMenuC4643E, view);
                this.f39168M = c4687g;
                c4687g.f38876g = z3;
                l.u uVar = c4687g.i;
                if (uVar != null) {
                    uVar.n(z3);
                }
                C4687g c4687g2 = this.f39168M;
                if (!c4687g2.b()) {
                    if (c4687g2.f38874e == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    c4687g2.d(0, 0, false, false);
                }
                l.x xVar = this.f39176x;
                if (xVar != null) {
                    xVar.j(subMenuC4643E);
                }
                return true;
            }
        }
        return false;
    }

    @Override // l.y
    public final boolean j(l.o oVar) {
        return false;
    }

    public final boolean k() {
        C4687g c4687g = this.f39167L;
        return c4687g != null && c4687g.b();
    }

    public final boolean l() {
        l.m mVar;
        if (!this.f39161E || k() || (mVar = this.f39174v) == null || this.f39157A == null || this.f39169N != null) {
            return false;
        }
        mVar.i();
        if (mVar.f38806C.isEmpty()) {
            return false;
        }
        RunnableC4691i runnableC4691i = new RunnableC4691i(this, new C4687g(this, this.f39173u, this.f39174v, this.f39158B));
        this.f39169N = runnableC4691i;
        ((View) this.f39157A).post(runnableC4691i);
        return true;
    }
}
