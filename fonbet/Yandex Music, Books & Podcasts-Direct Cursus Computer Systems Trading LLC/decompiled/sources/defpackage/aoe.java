package defpackage;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class aoe extends rr4 {
    public final View c;
    public int d;
    public int e;
    public final int[] f;

    public aoe(View view) {
        super(0);
        this.f = new int[2];
        this.c = view;
    }

    @Override // defpackage.rr4
    public final void f(vpv vpvVar) {
        this.c.setTranslationY(0.0f);
    }

    @Override // defpackage.rr4
    public final void g(vpv vpvVar) {
        View view = this.c;
        int[] iArr = this.f;
        view.getLocationOnScreen(iArr);
        this.d = iArr[1];
    }

    @Override // defpackage.rr4
    public final kqv h(kqv kqvVar, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((((vpv) it.next()).a.d() & 8) != 0) {
                this.c.setTranslationY(wm0.c(this.e, r0.a.c(), 0));
                break;
            }
        }
        return kqvVar;
    }

    @Override // defpackage.rr4
    public final nur i(vpv vpvVar, nur nurVar) {
        View view = this.c;
        int[] iArr = this.f;
        view.getLocationOnScreen(iArr);
        int i = this.d - iArr[1];
        this.e = i;
        view.setTranslationY(i);
        return nurVar;
    }
}
