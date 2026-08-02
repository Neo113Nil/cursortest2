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
import com.IceFishing.LiveIceFishing.C5248R;
import java.util.ArrayList;
import l.InterfaceC4650A;
import l.SubMenuC4654E;

/* renamed from: m.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4708k implements l.y {

    /* renamed from: A, reason: collision with root package name */
    public InterfaceC4650A f39226A;

    /* renamed from: B, reason: collision with root package name */
    public C4706j f39227B;

    /* renamed from: C, reason: collision with root package name */
    public Drawable f39228C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f39229D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f39230E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f39231F;

    /* renamed from: G, reason: collision with root package name */
    public int f39232G;

    /* renamed from: H, reason: collision with root package name */
    public int f39233H;

    /* renamed from: I, reason: collision with root package name */
    public int f39234I;
    public boolean J;

    /* renamed from: L, reason: collision with root package name */
    public C4700g f39236L;

    /* renamed from: M, reason: collision with root package name */
    public C4700g f39237M;

    /* renamed from: N, reason: collision with root package name */
    public RunnableC4704i f39238N;

    /* renamed from: O, reason: collision with root package name */
    public C4702h f39239O;

    /* renamed from: n, reason: collision with root package name */
    public final Context f39241n;

    /* renamed from: u, reason: collision with root package name */
    public Context f39242u;

    /* renamed from: v, reason: collision with root package name */
    public l.m f39243v;

    /* renamed from: w, reason: collision with root package name */
    public final LayoutInflater f39244w;

    /* renamed from: x, reason: collision with root package name */
    public l.x f39245x;

    /* renamed from: y, reason: collision with root package name */
    public final int f39246y = C5248R.layout.abc_action_menu_layout;

    /* renamed from: z, reason: collision with root package name */
    public final int f39247z = C5248R.layout.abc_action_menu_item_layout;

    /* renamed from: K, reason: collision with root package name */
    public final SparseBooleanArray f39235K = new SparseBooleanArray();

    /* renamed from: P, reason: collision with root package name */
    public final I0.j f39240P = new I0.j(29, this);

    public C4708k(Context context) {
        this.f39241n = context;
        this.f39244w = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [l.z] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final View a(l.o oVar, View view, ViewGroup viewGroup) {
        View actionView = oVar.getActionView();
        if (actionView == null || oVar.e()) {
            ActionMenuItemView actionMenuItemView = view instanceof l.z ? (l.z) view : (l.z) this.f39244w.inflate(this.f39247z, viewGroup, false);
            actionMenuItemView.b(oVar);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.f39226A);
            if (this.f39239O == null) {
                this.f39239O = new C4702h(this);
            }
            actionMenuItemView2.setPopupCallback(this.f39239O);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(oVar.f38777V ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C4712m)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    @Override // l.y
    public final void b(l.m mVar, boolean z6) {
        f();
        C4700g c4700g = this.f39237M;
        if (c4700g != null && c4700g.b()) {
            c4700g.i.dismiss();
        }
        l.x xVar = this.f39245x;
        if (xVar != null) {
            xVar.b(mVar, z6);
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
        int i4;
        boolean z6;
        C4708k c4708k = this;
        l.m mVar = c4708k.f39243v;
        if (mVar != null) {
            arrayList = mVar.l();
            i = arrayList.size();
        } else {
            i = 0;
            arrayList = null;
        }
        int i6 = c4708k.f39234I;
        int i9 = c4708k.f39233H;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) c4708k.f39226A;
        int i10 = 0;
        boolean z9 = false;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i4 = 2;
            z6 = true;
            if (i10 >= i) {
                break;
            }
            l.o oVar = (l.o) arrayList.get(i10);
            int i13 = oVar.f38773R;
            if ((i13 & 2) == 2) {
                i11++;
            } else if ((i13 & 1) == 1) {
                i12++;
            } else {
                z9 = true;
            }
            if (c4708k.J && oVar.f38777V) {
                i6 = 0;
            }
            i10++;
        }
        if (c4708k.f39230E && (z9 || i12 + i11 > i6)) {
            i6--;
        }
        int i14 = i6 - i11;
        SparseBooleanArray sparseBooleanArray = c4708k.f39235K;
        sparseBooleanArray.clear();
        int i15 = 0;
        int i16 = 0;
        while (i15 < i) {
            l.o oVar2 = (l.o) arrayList.get(i15);
            int i17 = oVar2.f38773R;
            boolean z10 = (i17 & 2) == i4 ? z6 : false;
            int i18 = oVar2.f38779u;
            if (z10) {
                View a9 = c4708k.a(oVar2, null, viewGroup);
                a9.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a9.getMeasuredWidth();
                i9 -= measuredWidth;
                if (i16 == 0) {
                    i16 = measuredWidth;
                }
                if (i18 != 0) {
                    sparseBooleanArray.put(i18, z6);
                }
                oVar2.f(z6);
            } else if ((i17 & 1) == z6) {
                boolean z11 = sparseBooleanArray.get(i18);
                boolean z12 = ((i14 > 0 || z11) && i9 > 0) ? z6 : false;
                if (z12) {
                    View a10 = c4708k.a(oVar2, null, viewGroup);
                    a10.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = a10.getMeasuredWidth();
                    i9 -= measuredWidth2;
                    if (i16 == 0) {
                        i16 = measuredWidth2;
                    }
                    z12 &= i9 + i16 > 0;
                }
                if (z12 && i18 != 0) {
                    sparseBooleanArray.put(i18, true);
                } else if (z11) {
                    sparseBooleanArray.put(i18, false);
                    for (int i19 = 0; i19 < i15; i19++) {
                        l.o oVar3 = (l.o) arrayList.get(i19);
                        if (oVar3.f38779u == i18) {
                            if ((oVar3.f38772Q & 32) == 32) {
                                i14++;
                            }
                            oVar3.f(false);
                        }
                    }
                }
                if (z12) {
                    i14--;
                }
                oVar2.f(z12);
            } else {
                oVar2.f(false);
                i15++;
                i4 = 2;
                c4708k = this;
                z6 = true;
            }
            i15++;
            i4 = 2;
            c4708k = this;
            z6 = true;
        }
        return z6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.y
    public final void e() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.f39226A;
        ArrayList arrayList = null;
        boolean z6 = false;
        if (viewGroup != null) {
            l.m mVar = this.f39243v;
            if (mVar != null) {
                mVar.i();
                ArrayList l9 = this.f39243v.l();
                int size = l9.size();
                i = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    l.o oVar = (l.o) l9.get(i4);
                    if ((oVar.f38772Q & 32) == 32) {
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
                            ((ViewGroup) this.f39226A).addView(a9, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.f39227B) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.f39226A).requestLayout();
        l.m mVar2 = this.f39243v;
        if (mVar2 != null) {
            mVar2.i();
            ArrayList arrayList2 = mVar2.f38732B;
            int size2 = arrayList2.size();
            for (int i6 = 0; i6 < size2; i6++) {
                l.p pVar = ((l.o) arrayList2.get(i6)).f38775T;
            }
        }
        l.m mVar3 = this.f39243v;
        if (mVar3 != null) {
            mVar3.i();
            arrayList = mVar3.f38733C;
        }
        if (this.f39230E && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z6 = !((l.o) arrayList.get(0)).f38777V;
            } else if (size3 > 0) {
                z6 = true;
            }
        }
        if (z6) {
            if (this.f39227B == null) {
                this.f39227B = new C4706j(this, this.f39241n);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f39227B.getParent();
            if (viewGroup3 != this.f39226A) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f39227B);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f39226A;
                C4706j c4706j = this.f39227B;
                actionMenuView.getClass();
                C4712m j6 = ActionMenuView.j();
                j6.f39252a = true;
                actionMenuView.addView(c4706j, j6);
            }
        } else {
            C4706j c4706j2 = this.f39227B;
            if (c4706j2 != null) {
                Object parent = c4706j2.getParent();
                Object obj = this.f39226A;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f39227B);
                }
            }
        }
        ((ActionMenuView) this.f39226A).setOverflowReserved(this.f39230E);
    }

    public final boolean f() {
        Object obj;
        RunnableC4704i runnableC4704i = this.f39238N;
        if (runnableC4704i != null && (obj = this.f39226A) != null) {
            ((View) obj).removeCallbacks(runnableC4704i);
            this.f39238N = null;
            return true;
        }
        C4700g c4700g = this.f39236L;
        if (c4700g == null) {
            return false;
        }
        if (c4700g.b()) {
            c4700g.i.dismiss();
        }
        return true;
    }

    @Override // l.y
    public final void g(l.x xVar) {
        throw null;
    }

    @Override // l.y
    public final void h(Context context, l.m mVar) {
        this.f39242u = context;
        LayoutInflater.from(context);
        this.f39243v = mVar;
        Resources resources = context.getResources();
        if (!this.f39231F) {
            this.f39230E = true;
        }
        int i = 2;
        this.f39232G = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i4 = configuration.screenWidthDp;
        int i6 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i4 > 600 || ((i4 > 960 && i6 > 720) || (i4 > 720 && i6 > 960))) {
            i = 5;
        } else if (i4 >= 500 || ((i4 > 640 && i6 > 480) || (i4 > 480 && i6 > 640))) {
            i = 4;
        } else if (i4 >= 360) {
            i = 3;
        }
        this.f39234I = i;
        int i9 = this.f39232G;
        if (this.f39230E) {
            if (this.f39227B == null) {
                C4706j c4706j = new C4706j(this, this.f39241n);
                this.f39227B = c4706j;
                if (this.f39229D) {
                    c4706j.setImageDrawable(this.f39228C);
                    this.f39228C = null;
                    this.f39229D = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f39227B.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i9 -= this.f39227B.getMeasuredWidth();
        } else {
            this.f39227B = null;
        }
        this.f39233H = i9;
        float f2 = resources.getDisplayMetrics().density;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.y
    public final boolean i(SubMenuC4654E subMenuC4654E) {
        boolean z6;
        if (subMenuC4654E.hasVisibleItems()) {
            SubMenuC4654E subMenuC4654E2 = subMenuC4654E;
            while (true) {
                l.m mVar = subMenuC4654E2.f38665S;
                if (mVar == this.f39243v) {
                    break;
                }
                subMenuC4654E2 = (SubMenuC4654E) mVar;
            }
            ViewGroup viewGroup = (ViewGroup) this.f39226A;
            View view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof l.z) && ((l.z) childAt).getItemData() == subMenuC4654E2.f38666T) {
                        view = childAt;
                        break;
                    }
                    i++;
                }
            }
            if (view != null) {
                subMenuC4654E.f38666T.getClass();
                int size = subMenuC4654E.f38752y.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size) {
                        z6 = false;
                        break;
                    }
                    MenuItem item = subMenuC4654E.getItem(i4);
                    if (item.isVisible() && item.getIcon() != null) {
                        z6 = true;
                        break;
                    }
                    i4++;
                }
                C4700g c4700g = new C4700g(this, this.f39242u, subMenuC4654E, view);
                this.f39237M = c4700g;
                c4700g.f38803g = z6;
                l.u uVar = c4700g.i;
                if (uVar != null) {
                    uVar.n(z6);
                }
                C4700g c4700g2 = this.f39237M;
                if (!c4700g2.b()) {
                    if (c4700g2.f38801e == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    c4700g2.d(0, 0, false, false);
                }
                l.x xVar = this.f39245x;
                if (xVar != null) {
                    xVar.e(subMenuC4654E);
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
        C4700g c4700g = this.f39236L;
        return c4700g != null && c4700g.b();
    }

    public final boolean l() {
        l.m mVar;
        if (!this.f39230E || k() || (mVar = this.f39243v) == null || this.f39226A == null || this.f39238N != null) {
            return false;
        }
        mVar.i();
        if (mVar.f38733C.isEmpty()) {
            return false;
        }
        RunnableC4704i runnableC4704i = new RunnableC4704i(this, new C4700g(this, this.f39242u, this.f39243v, this.f39227B));
        this.f39238N = runnableC4704i;
        ((View) this.f39226A).post(runnableC4704i);
        return true;
    }
}
