package com.gamericefishpro.space.n;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c2 implements com.gamericefishpro.space.m.o {
    public com.gamericefishpro.space.m.i d;
    public com.gamericefishpro.space.m.j e;
    public final /* synthetic */ Toolbar i;

    public c2(Toolbar toolbar) {
        this.i = toolbar;
    }

    @Override // com.gamericefishpro.space.m.o
    public final void c() {
        if (this.e != null) {
            com.gamericefishpro.space.m.i iVar = this.d;
            if (iVar != null) {
                int size = iVar.f.size();
                for (int i = 0; i < size; i++) {
                    if (this.d.getItem(i) == this.e) {
                        return;
                    }
                }
            }
            d(this.e);
        }
    }

    @Override // com.gamericefishpro.space.m.o
    public final boolean d(com.gamericefishpro.space.m.j jVar) {
        Toolbar toolbar = this.i;
        toolbar.removeView(toolbar.B);
        toolbar.removeView(toolbar.A);
        toolbar.B = null;
        ArrayList arrayList = toolbar.a0;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.e = null;
        toolbar.requestLayout();
        jVar.B = false;
        jVar.n.o(false);
        toolbar.s();
        return true;
    }

    @Override // com.gamericefishpro.space.m.o
    public final boolean f(com.gamericefishpro.space.m.s sVar) {
        return false;
    }

    @Override // com.gamericefishpro.space.m.o
    public final void h(Context context, com.gamericefishpro.space.m.i iVar) {
        com.gamericefishpro.space.m.j jVar;
        com.gamericefishpro.space.m.i iVar2 = this.d;
        if (iVar2 != null && (jVar = this.e) != null) {
            iVar2.d(jVar);
        }
        this.d = iVar;
    }

    @Override // com.gamericefishpro.space.m.o
    public final boolean i() {
        return false;
    }

    @Override // com.gamericefishpro.space.m.o
    public final boolean k(com.gamericefishpro.space.m.j jVar) {
        Toolbar toolbar = this.i;
        toolbar.c();
        ViewParent parent = toolbar.A.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.A);
            }
            toolbar.addView(toolbar.A);
        }
        View view = jVar.z;
        if (view == null) {
            view = null;
        }
        toolbar.B = view;
        this.e = jVar;
        ViewParent parent2 = view.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.B);
            }
            d2 d2VarG = Toolbar.g();
            d2VarG.a = (toolbar.G & 112) | 8388611;
            d2VarG.b = 2;
            toolbar.B.setLayoutParams(d2VarG);
            toolbar.addView(toolbar.B);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((d2) childAt.getLayoutParams()).b != 2 && childAt != toolbar.d) {
                toolbar.removeViewAt(childCount);
                toolbar.a0.add(childAt);
            }
        }
        toolbar.requestLayout();
        jVar.B = true;
        jVar.n.o(false);
        toolbar.s();
        return true;
    }

    @Override // com.gamericefishpro.space.m.o
    public final void b(com.gamericefishpro.space.m.i iVar, boolean z) {
    }
}
