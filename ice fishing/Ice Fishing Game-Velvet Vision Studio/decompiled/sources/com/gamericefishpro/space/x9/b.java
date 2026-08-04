package com.gamericefishpro.space.x9;

import android.view.View;
import com.gamericefishpro.space.d4.o0;
import com.gamericefishpro.space.d4.o1;
import com.gamericefishpro.space.d4.x0;
import com.gamericefishpro.space.u6.e;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends o0 {
    public final View i;
    public int v;
    public int w;
    public final int[] y;

    public b(View view) {
        super(0);
        this.y = new int[2];
        this.i = view;
    }

    @Override // com.gamericefishpro.space.d4.o0
    public final void d(x0 x0Var) {
        this.i.setTranslationY(0.0f);
    }

    @Override // com.gamericefishpro.space.d4.o0
    public final void e() {
        View view = this.i;
        int[] iArr = this.y;
        view.getLocationOnScreen(iArr);
        this.v = iArr[1];
    }

    @Override // com.gamericefishpro.space.d4.o0
    public final o1 f(o1 o1Var, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            x0 x0Var = (x0) it.next();
            if ((x0Var.a.d() & 8) != 0) {
                this.i.setTranslationY(com.gamericefishpro.space.t9.a.c(x0Var.a.c(), this.w, 0));
                break;
            }
        }
        return o1Var;
    }

    @Override // com.gamericefishpro.space.d4.o0
    public final e g(x0 x0Var, e eVar) {
        View view = this.i;
        int[] iArr = this.y;
        view.getLocationOnScreen(iArr);
        int i = this.v - iArr[1];
        this.w = i;
        view.setTranslationY(i);
        return eVar;
    }
}
