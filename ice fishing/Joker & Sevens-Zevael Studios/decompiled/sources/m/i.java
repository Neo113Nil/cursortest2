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
import android.view.ViewParent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import org.fortheloss.st.R;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class i implements l.n {
    public g A;

    /* renamed from: g, reason: collision with root package name */
    public final Context f4312g;

    /* renamed from: h, reason: collision with root package name */
    public Context f4313h;

    /* renamed from: i, reason: collision with root package name */
    public l.h f4314i;

    /* renamed from: j, reason: collision with root package name */
    public final LayoutInflater f4315j;

    /* renamed from: k, reason: collision with root package name */
    public l.m f4316k;

    /* renamed from: m, reason: collision with root package name */
    public ActionMenuView f4318m;

    /* renamed from: n, reason: collision with root package name */
    public h f4319n;

    /* renamed from: o, reason: collision with root package name */
    public Drawable f4320o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f4321p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f4322q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f4323r;

    /* renamed from: s, reason: collision with root package name */
    public int f4324s;

    /* renamed from: t, reason: collision with root package name */
    public int f4325t;

    /* renamed from: u, reason: collision with root package name */
    public int f4326u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f4327v;

    /* renamed from: x, reason: collision with root package name */
    public f f4329x;

    /* renamed from: y, reason: collision with root package name */
    public f f4330y;

    /* renamed from: z, reason: collision with root package name */
    public dd.i f4331z;

    /* renamed from: l, reason: collision with root package name */
    public final int f4317l = R.layout.abc_action_menu_item_layout;

    /* renamed from: w, reason: collision with root package name */
    public final SparseBooleanArray f4328w = new SparseBooleanArray();
    public final f8.c B = new f8.c(25, this);

    public i(Context context) {
        this.f4312g = context;
        this.f4315j = LayoutInflater.from(context);
    }

    @Override // l.n
    public final void a(l.h hVar, boolean z10) {
        d();
        f fVar = this.f4330y;
        if (fVar != null && fVar.b()) {
            fVar.f3746i.dismiss();
        }
        l.m mVar = this.f4316k;
        if (mVar != null) {
            mVar.a(hVar, z10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r7v4, types: [l.o] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    public final View b(l.i iVar, View view, ActionMenuView actionMenuView) {
        View view2 = iVar.f3735z;
        View view3 = view2 != null ? view2 : null;
        if (view3 == null || ((iVar.f3734y & 8) != 0 && view2 != null)) {
            ActionMenuItemView actionMenuItemView = view instanceof l.o ? (l.o) view : (l.o) this.f4315j.inflate(this.f4317l, (ViewGroup) actionMenuView, false);
            actionMenuItemView.b(iVar);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker(this.f4318m);
            if (this.A == null) {
                this.A = new g(this);
            }
            actionMenuItemView2.setPopupCallback(this.A);
            view3 = actionMenuItemView;
        }
        view3.setVisibility(iVar.B ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        actionMenuView.getClass();
        if (!(layoutParams instanceof k)) {
            view3.setLayoutParams(ActionMenuView.i(layoutParams));
        }
        return view3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.n
    public final void c() {
        int i10;
        ActionMenuView actionMenuView = this.f4318m;
        ArrayList arrayList = null;
        boolean z10 = false;
        if (actionMenuView != null) {
            l.h hVar = this.f4314i;
            if (hVar != null) {
                hVar.i();
                ArrayList k3 = this.f4314i.k();
                int size = k3.size();
                i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    l.i iVar = (l.i) k3.get(i11);
                    if ((iVar.f3733x & 32) == 32) {
                        View childAt = actionMenuView.getChildAt(i10);
                        l.i itemData = childAt instanceof l.o ? ((l.o) childAt).getItemData() : null;
                        View b2 = b(iVar, childAt, actionMenuView);
                        if (iVar != itemData) {
                            b2.setPressed(false);
                            b2.jumpDrawablesToCurrentState();
                        }
                        if (b2 != childAt) {
                            ViewGroup viewGroup = (ViewGroup) b2.getParent();
                            if (viewGroup != null) {
                                viewGroup.removeView(b2);
                            }
                            this.f4318m.addView(b2, i10);
                        }
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            while (i10 < actionMenuView.getChildCount()) {
                if (actionMenuView.getChildAt(i10) == this.f4319n) {
                    i10++;
                } else {
                    actionMenuView.removeViewAt(i10);
                }
            }
        }
        this.f4318m.requestLayout();
        l.h hVar2 = this.f4314i;
        if (hVar2 != null) {
            hVar2.i();
            ArrayList arrayList2 = hVar2.f3698i;
            int size2 = arrayList2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                ((l.i) arrayList2.get(i12)).getClass();
            }
        }
        l.h hVar3 = this.f4314i;
        if (hVar3 != null) {
            hVar3.i();
            arrayList = hVar3.f3699j;
        }
        if (this.f4322q && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z10 = !((l.i) arrayList.get(0)).B;
            } else if (size3 > 0) {
                z10 = true;
            }
        }
        if (z10) {
            if (this.f4319n == null) {
                this.f4319n = new h(this, this.f4312g);
            }
            ViewGroup viewGroup2 = (ViewGroup) this.f4319n.getParent();
            if (viewGroup2 != this.f4318m) {
                if (viewGroup2 != null) {
                    viewGroup2.removeView(this.f4319n);
                }
                ActionMenuView actionMenuView2 = this.f4318m;
                h hVar4 = this.f4319n;
                actionMenuView2.getClass();
                k h10 = ActionMenuView.h();
                h10.f4369a = true;
                actionMenuView2.addView(hVar4, h10);
            }
        } else {
            h hVar5 = this.f4319n;
            if (hVar5 != null) {
                ViewParent parent = hVar5.getParent();
                ActionMenuView actionMenuView3 = this.f4318m;
                if (parent == actionMenuView3) {
                    actionMenuView3.removeView(this.f4319n);
                }
            }
        }
        this.f4318m.setOverflowReserved(this.f4322q);
    }

    public final boolean d() {
        ActionMenuView actionMenuView;
        dd.i iVar = this.f4331z;
        if (iVar != null && (actionMenuView = this.f4318m) != null) {
            actionMenuView.removeCallbacks(iVar);
            this.f4331z = null;
            return true;
        }
        f fVar = this.f4329x;
        if (fVar == null) {
            return false;
        }
        if (fVar.b()) {
            fVar.f3746i.dismiss();
        }
        return true;
    }

    @Override // l.n
    public final void e(l.m mVar) {
        throw null;
    }

    @Override // l.n
    public final boolean f(l.i iVar) {
        return false;
    }

    @Override // l.n
    public final void g(Context context, l.h hVar) {
        this.f4313h = context;
        LayoutInflater.from(context);
        this.f4314i = hVar;
        Resources resources = context.getResources();
        if (!this.f4323r) {
            this.f4322q = true;
        }
        int i10 = 2;
        this.f4324s = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i11 = configuration.screenWidthDp;
        int i12 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i11 > 600 || ((i11 > 960 && i12 > 720) || (i11 > 720 && i12 > 960))) {
            i10 = 5;
        } else if (i11 >= 500 || ((i11 > 640 && i12 > 480) || (i11 > 480 && i12 > 640))) {
            i10 = 4;
        } else if (i11 >= 360) {
            i10 = 3;
        }
        this.f4326u = i10;
        int i13 = this.f4324s;
        if (this.f4322q) {
            if (this.f4319n == null) {
                h hVar2 = new h(this, this.f4312g);
                this.f4319n = hVar2;
                if (this.f4321p) {
                    hVar2.setImageDrawable(this.f4320o);
                    this.f4320o = null;
                    this.f4321p = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f4319n.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i13 -= this.f4319n.getMeasuredWidth();
        } else {
            this.f4319n = null;
        }
        this.f4325t = i13;
        float f10 = resources.getDisplayMetrics().density;
    }

    @Override // l.n
    public final boolean h() {
        int i10;
        ArrayList arrayList;
        int i11;
        boolean z10;
        i iVar = this;
        l.h hVar = iVar.f4314i;
        if (hVar != null) {
            arrayList = hVar.k();
            i10 = arrayList.size();
        } else {
            i10 = 0;
            arrayList = null;
        }
        int i12 = iVar.f4326u;
        int i13 = iVar.f4325t;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ActionMenuView actionMenuView = iVar.f4318m;
        int i14 = 0;
        boolean z11 = false;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            i11 = 2;
            z10 = true;
            if (i14 >= i10) {
                break;
            }
            l.i iVar2 = (l.i) arrayList.get(i14);
            int i17 = iVar2.f3734y;
            if ((i17 & 2) == 2) {
                i15++;
            } else if ((i17 & 1) == 1) {
                i16++;
            } else {
                z11 = true;
            }
            if (iVar.f4327v && iVar2.B) {
                i12 = 0;
            }
            i14++;
        }
        if (iVar.f4322q && (z11 || i16 + i15 > i12)) {
            i12--;
        }
        int i18 = i12 - i15;
        SparseBooleanArray sparseBooleanArray = iVar.f4328w;
        sparseBooleanArray.clear();
        int i19 = 0;
        int i20 = 0;
        while (i19 < i10) {
            l.i iVar3 = (l.i) arrayList.get(i19);
            int i21 = iVar3.f3734y;
            boolean z12 = (i21 & 2) == i11 ? z10 : false;
            int i22 = iVar3.f3711b;
            if (z12) {
                View b2 = iVar.b(iVar3, null, actionMenuView);
                b2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = b2.getMeasuredWidth();
                i13 -= measuredWidth;
                if (i20 == 0) {
                    i20 = measuredWidth;
                }
                if (i22 != 0) {
                    sparseBooleanArray.put(i22, z10);
                }
                iVar3.d(z10);
            } else if ((i21 & 1) == z10) {
                boolean z13 = sparseBooleanArray.get(i22);
                boolean z14 = ((i18 > 0 || z13) && i13 > 0) ? z10 : false;
                if (z14) {
                    View b10 = iVar.b(iVar3, null, actionMenuView);
                    b10.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = b10.getMeasuredWidth();
                    i13 -= measuredWidth2;
                    if (i20 == 0) {
                        i20 = measuredWidth2;
                    }
                    z14 &= i13 + i20 > 0;
                }
                if (z14 && i22 != 0) {
                    sparseBooleanArray.put(i22, true);
                } else if (z13) {
                    sparseBooleanArray.put(i22, false);
                    for (int i23 = 0; i23 < i19; i23++) {
                        l.i iVar4 = (l.i) arrayList.get(i23);
                        if (iVar4.f3711b == i22) {
                            if ((iVar4.f3733x & 32) == 32) {
                                i18++;
                            }
                            iVar4.d(false);
                        }
                    }
                }
                if (z14) {
                    i18--;
                }
                iVar3.d(z14);
            } else {
                iVar3.d(false);
                i19++;
                i11 = 2;
                iVar = this;
                z10 = true;
            }
            i19++;
            i11 = 2;
            iVar = this;
            z10 = true;
        }
        return z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.n
    public final boolean i(l.r rVar) {
        boolean z10;
        if (rVar.hasVisibleItems()) {
            l.r rVar2 = rVar;
            while (true) {
                l.h hVar = rVar2.f3768v;
                if (hVar == this.f4314i) {
                    break;
                }
                rVar2 = (l.r) hVar;
            }
            l.i iVar = rVar2.f3769w;
            ActionMenuView actionMenuView = this.f4318m;
            View view = null;
            if (actionMenuView != null) {
                int childCount = actionMenuView.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 >= childCount) {
                        break;
                    }
                    View childAt = actionMenuView.getChildAt(i10);
                    if ((childAt instanceof l.o) && ((l.o) childAt).getItemData() == iVar) {
                        view = childAt;
                        break;
                    }
                    i10++;
                }
            }
            if (view != null) {
                rVar.f3769w.getClass();
                int size = rVar.f3695f.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        z10 = false;
                        break;
                    }
                    MenuItem item = rVar.getItem(i11);
                    if (item.isVisible() && item.getIcon() != null) {
                        z10 = true;
                        break;
                    }
                    i11++;
                }
                f fVar = new f(this, this.f4313h, rVar, view);
                this.f4330y = fVar;
                fVar.f3744g = z10;
                l.j jVar = fVar.f3746i;
                if (jVar != null) {
                    jVar.o(z10);
                }
                f fVar2 = this.f4330y;
                if (!fVar2.b()) {
                    if (fVar2.f3742e == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    fVar2.d(0, 0, false, false);
                }
                l.m mVar = this.f4316k;
                if (mVar != null) {
                    mVar.f(rVar);
                }
                return true;
            }
        }
        return false;
    }

    public final boolean j() {
        l.h hVar;
        if (!this.f4322q) {
            return false;
        }
        f fVar = this.f4329x;
        if ((fVar != null && fVar.b()) || (hVar = this.f4314i) == null || this.f4318m == null || this.f4331z != null) {
            return false;
        }
        hVar.i();
        if (hVar.f3699j.isEmpty()) {
            return false;
        }
        dd.i iVar = new dd.i(12, this, new f(this, this.f4313h, this.f4314i, this.f4319n));
        this.f4331z = iVar;
        this.f4318m.post(iVar);
        return true;
    }

    @Override // l.n
    public final boolean k(l.i iVar) {
        return false;
    }
}
