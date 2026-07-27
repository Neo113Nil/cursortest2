package t0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: t0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5026u extends AbstractC4992G {

    /* renamed from: a, reason: collision with root package name */
    public RecyclerView f40773a;

    /* renamed from: b, reason: collision with root package name */
    public final C5005U f40774b = new C5005U(this);

    /* renamed from: c, reason: collision with root package name */
    public C5025t f40775c;

    /* renamed from: d, reason: collision with root package name */
    public C5025t f40776d;

    public static int b(View view, androidx.emoji2.text.g gVar) {
        return ((gVar.c(view) / 2) + gVar.e(view)) - ((gVar.l() / 2) + gVar.k());
    }

    public static View c(AbstractC4990E abstractC4990E, androidx.emoji2.text.g gVar) {
        int v9 = abstractC4990E.v();
        View view = null;
        if (v9 == 0) {
            return null;
        }
        int l9 = (gVar.l() / 2) + gVar.k();
        int i = Integer.MAX_VALUE;
        for (int i6 = 0; i6 < v9; i6++) {
            View u3 = abstractC4990E.u(i6);
            int abs = Math.abs(((gVar.c(u3) / 2) + gVar.e(u3)) - l9);
            if (abs < i) {
                view = u3;
                i = abs;
            }
        }
        return view;
    }

    public final int[] a(AbstractC4990E abstractC4990E, View view) {
        int[] iArr = new int[2];
        if (abstractC4990E.d()) {
            iArr[0] = b(view, d(abstractC4990E));
        } else {
            iArr[0] = 0;
        }
        if (abstractC4990E.e()) {
            iArr[1] = b(view, e(abstractC4990E));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    public final androidx.emoji2.text.g d(AbstractC4990E abstractC4990E) {
        C5025t c5025t = this.f40776d;
        if (c5025t == null || ((AbstractC4990E) c5025t.f4769b) != abstractC4990E) {
            this.f40776d = new C5025t(abstractC4990E, 0);
        }
        return this.f40776d;
    }

    public final androidx.emoji2.text.g e(AbstractC4990E abstractC4990E) {
        C5025t c5025t = this.f40775c;
        if (c5025t == null || ((AbstractC4990E) c5025t.f4769b) != abstractC4990E) {
            this.f40775c = new C5025t(abstractC4990E, 1);
        }
        return this.f40775c;
    }

    public final void f() {
        AbstractC4990E layoutManager;
        RecyclerView recyclerView = this.f40773a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return;
        }
        View c9 = layoutManager.e() ? c(layoutManager, e(layoutManager)) : layoutManager.d() ? c(layoutManager, d(layoutManager)) : null;
        if (c9 == null) {
            return;
        }
        int[] a9 = a(layoutManager, c9);
        int i = a9[0];
        if (i == 0 && a9[1] == 0) {
            return;
        }
        this.f40773a.Z(i, a9[1], false);
    }
}
