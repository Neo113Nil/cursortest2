package com.gamericefishpro.space.n;

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
import com.gamericefishpro.space.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements com.gamericefishpro.space.m.o {
    public h A;
    public Drawable B;
    public boolean C;
    public boolean D;
    public boolean E;
    public int F;
    public int G;
    public int H;
    public boolean I;
    public f K;
    public f L;
    public com.gamericefishpro.space.va.a M;
    public g N;
    public final Context d;
    public Context e;
    public com.gamericefishpro.space.m.i i;
    public final LayoutInflater v;
    public com.gamericefishpro.space.m.n w;
    public ActionMenuView z;
    public final int y = R.layout.abc_action_menu_item_layout;
    public final SparseBooleanArray J = new SparseBooleanArray();
    public final com.gamericefishpro.space.m.d O = new com.gamericefishpro.space.m.d(5, this);

    public i(Context context) {
        this.d = context;
        this.v = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View a(com.gamericefishpro.space.m.j jVar, View view, ActionMenuView actionMenuView) {
        View view2 = jVar.z;
        View view3 = view2 != null ? view2 : null;
        if (view3 == null || ((jVar.y & 8) != 0 && view2 != null)) {
            com.gamericefishpro.space.m.p pVar = view instanceof com.gamericefishpro.space.m.p ? (com.gamericefishpro.space.m.p) view : (com.gamericefishpro.space.m.p) this.v.inflate(this.y, (ViewGroup) actionMenuView, false);
            pVar.a(jVar);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) pVar;
            actionMenuItemView.setItemInvoker(this.z);
            if (this.N == null) {
                this.N = new g(this);
            }
            actionMenuItemView.setPopupCallback(this.N);
            view3 = (View) pVar;
        }
        view3.setVisibility(jVar.B ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        actionMenuView.getClass();
        if (!(layoutParams instanceof k)) {
            view3.setLayoutParams(ActionMenuView.j(layoutParams));
        }
        return view3;
    }

    @Override // com.gamericefishpro.space.m.o
    public final void b(com.gamericefishpro.space.m.i iVar, boolean z) {
        e();
        f fVar = this.L;
        if (fVar != null && fVar.b()) {
            fVar.i.dismiss();
        }
        com.gamericefishpro.space.m.n nVar = this.w;
        if (nVar != null) {
            nVar.b(iVar, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.gamericefishpro.space.m.o
    public final void c() {
        int i;
        ActionMenuView actionMenuView = this.z;
        ArrayList arrayList = null;
        boolean z = false;
        if (actionMenuView != null) {
            com.gamericefishpro.space.m.i iVar = this.i;
            if (iVar != null) {
                iVar.i();
                ArrayList arrayListK = this.i.k();
                int size = arrayListK.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    com.gamericefishpro.space.m.j jVar = (com.gamericefishpro.space.m.j) arrayListK.get(i2);
                    if ((jVar.x & 32) == 32) {
                        View childAt = actionMenuView.getChildAt(i);
                        com.gamericefishpro.space.m.j itemData = childAt instanceof com.gamericefishpro.space.m.p ? ((com.gamericefishpro.space.m.p) childAt).getItemData() : null;
                        View viewA = a(jVar, childAt, actionMenuView);
                        if (jVar != itemData) {
                            viewA.setPressed(false);
                            viewA.jumpDrawablesToCurrentState();
                        }
                        if (viewA != childAt) {
                            ViewGroup viewGroup = (ViewGroup) viewA.getParent();
                            if (viewGroup != null) {
                                viewGroup.removeView(viewA);
                            }
                            this.z.addView(viewA, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < actionMenuView.getChildCount()) {
                if (actionMenuView.getChildAt(i) == this.A) {
                    i++;
                } else {
                    actionMenuView.removeViewAt(i);
                }
            }
        }
        this.z.requestLayout();
        com.gamericefishpro.space.m.i iVar2 = this.i;
        if (iVar2 != null) {
            iVar2.i();
            ArrayList arrayList2 = iVar2.i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ((com.gamericefishpro.space.m.j) arrayList2.get(i3)).getClass();
            }
        }
        com.gamericefishpro.space.m.i iVar3 = this.i;
        if (iVar3 != null) {
            iVar3.i();
            arrayList = iVar3.j;
        }
        if (this.D && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z = !((com.gamericefishpro.space.m.j) arrayList.get(0)).B;
            } else if (size3 > 0) {
                z = true;
            }
        }
        if (z) {
            if (this.A == null) {
                this.A = new h(this, this.d);
            }
            ViewGroup viewGroup2 = (ViewGroup) this.A.getParent();
            if (viewGroup2 != this.z) {
                if (viewGroup2 != null) {
                    viewGroup2.removeView(this.A);
                }
                ActionMenuView actionMenuView2 = this.z;
                h hVar = this.A;
                actionMenuView2.getClass();
                k kVarI = ActionMenuView.i();
                kVarI.a = true;
                actionMenuView2.addView(hVar, kVarI);
            }
        } else {
            h hVar2 = this.A;
            if (hVar2 != null) {
                ViewParent parent = hVar2.getParent();
                ActionMenuView actionMenuView3 = this.z;
                if (parent == actionMenuView3) {
                    actionMenuView3.removeView(this.A);
                }
            }
        }
        this.z.setOverflowReserved(this.D);
    }

    @Override // com.gamericefishpro.space.m.o
    public final boolean d(com.gamericefishpro.space.m.j jVar) {
        return false;
    }

    public final boolean e() {
        ActionMenuView actionMenuView;
        com.gamericefishpro.space.va.a aVar = this.M;
        if (aVar != null && (actionMenuView = this.z) != null) {
            actionMenuView.removeCallbacks(aVar);
            this.M = null;
            return true;
        }
        f fVar = this.K;
        if (fVar == null) {
            return false;
        }
        if (fVar.b()) {
            fVar.i.dismiss();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.gamericefishpro.space.m.o
    public final boolean f(com.gamericefishpro.space.m.s sVar) {
        boolean z;
        if (sVar.hasVisibleItems()) {
            com.gamericefishpro.space.m.s sVar2 = sVar;
            while (true) {
                com.gamericefishpro.space.m.i iVar = sVar2.v;
                if (iVar == this.i) {
                    break;
                }
                sVar2 = (com.gamericefishpro.space.m.s) iVar;
            }
            com.gamericefishpro.space.m.j jVar = sVar2.w;
            ActionMenuView actionMenuView = this.z;
            View view = null;
            view = null;
            if (actionMenuView != null) {
                int childCount = actionMenuView.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = actionMenuView.getChildAt(i);
                    if ((childAt instanceof com.gamericefishpro.space.m.p) && ((com.gamericefishpro.space.m.p) childAt).getItemData() == jVar) {
                        view = childAt;
                        break;
                    }
                }
            }
            if (view != null) {
                sVar.w.getClass();
                int size = sVar.f.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z = false;
                        break;
                    }
                    MenuItem item = sVar.getItem(i2);
                    if (item.isVisible() && item.getIcon() != null) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                f fVar = new f(this, this.e, sVar, view);
                this.L = fVar;
                fVar.g = z;
                com.gamericefishpro.space.m.k kVar = fVar.i;
                if (kVar != null) {
                    kVar.o(z);
                }
                f fVar2 = this.L;
                if (!fVar2.b()) {
                    if (fVar2.e == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    fVar2.d(0, 0, false, false);
                }
                com.gamericefishpro.space.m.n nVar = this.w;
                if (nVar != null) {
                    nVar.c(sVar);
                }
                return true;
            }
        }
        return false;
    }

    @Override // com.gamericefishpro.space.m.o
    public final void g(com.gamericefishpro.space.m.n nVar) {
        throw null;
    }

    @Override // com.gamericefishpro.space.m.o
    public final void h(Context context, com.gamericefishpro.space.m.i iVar) {
        this.e = context;
        LayoutInflater.from(context);
        this.i = iVar;
        Resources resources = context.getResources();
        if (!this.E) {
            this.D = true;
        }
        int i = 2;
        this.F = context.getResources().getDisplayMetrics().widthPixels / 2;
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
        this.H = i;
        int measuredWidth = this.F;
        if (this.D) {
            if (this.A == null) {
                h hVar = new h(this, this.d);
                this.A = hVar;
                if (this.C) {
                    hVar.setImageDrawable(this.B);
                    this.B = null;
                    this.C = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.A.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.A.getMeasuredWidth();
        } else {
            this.A = null;
        }
        this.G = measuredWidth;
        float f = resources.getDisplayMetrics().density;
    }

    @Override // com.gamericefishpro.space.m.o
    public final boolean i() {
        int size;
        ArrayList arrayListK;
        int i;
        boolean z;
        i iVar = this;
        com.gamericefishpro.space.m.i iVar2 = iVar.i;
        if (iVar2 != null) {
            arrayListK = iVar2.k();
            size = arrayListK.size();
        } else {
            size = 0;
            arrayListK = null;
        }
        int i2 = iVar.H;
        int i3 = iVar.G;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ActionMenuView actionMenuView = iVar.z;
        int i4 = 0;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i = 2;
            z = true;
            if (i4 >= size) {
                break;
            }
            com.gamericefishpro.space.m.j jVar = (com.gamericefishpro.space.m.j) arrayListK.get(i4);
            int i7 = jVar.y;
            if ((i7 & 2) == 2) {
                i5++;
            } else if ((i7 & 1) == 1) {
                i6++;
            } else {
                z2 = true;
            }
            if (iVar.I && jVar.B) {
                i2 = 0;
            }
            i4++;
        }
        if (iVar.D && (z2 || i6 + i5 > i2)) {
            i2--;
        }
        int i8 = i2 - i5;
        SparseBooleanArray sparseBooleanArray = iVar.J;
        sparseBooleanArray.clear();
        int i9 = 0;
        int i10 = 0;
        while (i9 < size) {
            com.gamericefishpro.space.m.j jVar2 = (com.gamericefishpro.space.m.j) arrayListK.get(i9);
            int i11 = jVar2.y;
            boolean z3 = (i11 & 2) == i ? z : false;
            int i12 = jVar2.b;
            if (z3) {
                View viewA = iVar.a(jVar2, null, actionMenuView);
                viewA.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewA.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i10 == 0) {
                    i10 = measuredWidth;
                }
                if (i12 != 0) {
                    sparseBooleanArray.put(i12, z);
                }
                jVar2.d(z);
            } else {
                if ((i11 & 1) == z) {
                    boolean z4 = sparseBooleanArray.get(i12);
                    boolean z5 = ((i8 > 0 || z4) && i3 > 0) ? z : false;
                    if (z5) {
                        View viewA2 = iVar.a(jVar2, null, actionMenuView);
                        viewA2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        int measuredWidth2 = viewA2.getMeasuredWidth();
                        i3 -= measuredWidth2;
                        if (i10 == 0) {
                            i10 = measuredWidth2;
                        }
                        z5 &= i3 + i10 > 0;
                    }
                    if (z5 && i12 != 0) {
                        sparseBooleanArray.put(i12, true);
                    } else if (z4) {
                        sparseBooleanArray.put(i12, false);
                        for (int i13 = 0; i13 < i9; i13++) {
                            com.gamericefishpro.space.m.j jVar3 = (com.gamericefishpro.space.m.j) arrayListK.get(i13);
                            if (jVar3.b == i12) {
                                if ((jVar3.x & 32) == 32) {
                                    i8++;
                                }
                                jVar3.d(false);
                            }
                        }
                    }
                    if (z5) {
                        i8--;
                    }
                    jVar2.d(z5);
                } else {
                    jVar2.d(false);
                }
                i9++;
                i = 2;
                iVar = this;
                z = true;
            }
            i9++;
            i = 2;
            iVar = this;
            z = true;
        }
        return z;
    }

    public final boolean j() {
        com.gamericefishpro.space.m.i iVar;
        if (!this.D) {
            return false;
        }
        f fVar = this.K;
        if ((fVar != null && fVar.b()) || (iVar = this.i) == null || this.z == null || this.M != null) {
            return false;
        }
        iVar.i();
        if (iVar.j.isEmpty()) {
            return false;
        }
        com.gamericefishpro.space.va.a aVar = new com.gamericefishpro.space.va.a(6, this, new f(this, this.e, this.i, this.A), false);
        this.M = aVar;
        this.z.post(aVar);
        return true;
    }

    @Override // com.gamericefishpro.space.m.o
    public final boolean k(com.gamericefishpro.space.m.j jVar) {
        return false;
    }
}
