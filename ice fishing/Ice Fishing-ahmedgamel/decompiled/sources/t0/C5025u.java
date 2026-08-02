package t0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: t0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5025u extends AbstractC4989E {

    /* renamed from: a, reason: collision with root package name */
    public RecyclerView f40825a;

    /* renamed from: b, reason: collision with root package name */
    public final C5002S f40826b = new C5002S(this);

    /* renamed from: c, reason: collision with root package name */
    public C5023s f40827c;

    /* renamed from: d, reason: collision with root package name */
    public C5023s f40828d;

    public static int b(View view, androidx.emoji2.text.g gVar) {
        return ((gVar.c(view) / 2) + gVar.e(view)) - ((gVar.l() / 2) + gVar.k());
    }

    public static View c(AbstractC4987C abstractC4987C, androidx.emoji2.text.g gVar) {
        int v9 = abstractC4987C.v();
        View view = null;
        if (v9 == 0) {
            return null;
        }
        int l9 = (gVar.l() / 2) + gVar.k();
        int i = Integer.MAX_VALUE;
        for (int i4 = 0; i4 < v9; i4++) {
            View u6 = abstractC4987C.u(i4);
            int abs = Math.abs(((gVar.c(u6) / 2) + gVar.e(u6)) - l9);
            if (abs < i) {
                view = u6;
                i = abs;
            }
        }
        return view;
    }

    public final int[] a(AbstractC4987C abstractC4987C, View view) {
        int[] iArr = new int[2];
        if (abstractC4987C.d()) {
            iArr[0] = b(view, d(abstractC4987C));
        } else {
            iArr[0] = 0;
        }
        if (abstractC4987C.e()) {
            iArr[1] = b(view, e(abstractC4987C));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    public final androidx.emoji2.text.g d(AbstractC4987C abstractC4987C) {
        C5023s c5023s = this.f40828d;
        if (c5023s == null || ((AbstractC4987C) c5023s.f4737b) != abstractC4987C) {
            this.f40828d = new C5023s(abstractC4987C, 0);
        }
        return this.f40828d;
    }

    public final androidx.emoji2.text.g e(AbstractC4987C abstractC4987C) {
        C5023s c5023s = this.f40827c;
        if (c5023s == null || ((AbstractC4987C) c5023s.f4737b) != abstractC4987C) {
            this.f40827c = new C5023s(abstractC4987C, 1);
        }
        return this.f40827c;
    }

    public final void f() {
        AbstractC4987C layoutManager;
        RecyclerView recyclerView = this.f40825a;
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
        this.f40825a.Z(i, a9[1], false);
    }
}
