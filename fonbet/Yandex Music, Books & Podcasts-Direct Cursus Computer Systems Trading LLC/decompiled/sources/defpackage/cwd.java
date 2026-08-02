package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes4.dex */
public final class cwd extends dpn {
    public final LinearLayoutManager a;
    public final View b;
    public boolean c;

    public cwd(LinearLayoutManager linearLayoutManager, ViewGroup viewGroup) {
        viewGroup.getClass();
        this.a = linearLayoutManager;
        this.b = viewGroup;
    }

    @Override // defpackage.dpn
    public final void a(RecyclerView recyclerView, int i) {
        View L;
        qon adapter = recyclerView.getAdapter();
        r8f r8fVar = adapter instanceof r8f ? (r8f) adapter : null;
        if (r8fVar == null) {
            su4.s(2, null, "Trying to listen Scroll with null JuicyCatalogMenuActionsAdapter adapter", null);
            return;
        }
        if (i == 0 && this.c) {
            this.c = false;
            LinearLayoutManager linearLayoutManager = this.a;
            int r1 = linearLayoutManager.r1();
            if (r8fVar.v(r1) != v8f.a || (L = linearLayoutManager.L(r1)) == null) {
                return;
            }
            float y = (L.getY() + L.getHeight()) - recyclerView.getPaddingTop();
            int height = (this.b.getHeight() + L.getHeight()) / 2;
            if (y >= r4.getHeight()) {
                if (y <= height) {
                    recyclerView.B0(0, (int) ((L.getY() + L.getHeight()) - r4.getHeight()), false);
                } else if (y < L.getHeight()) {
                    recyclerView.B0(0, (int) L.getY(), false);
                }
            }
        }
    }

    @Override // defpackage.dpn
    public final void b(RecyclerView recyclerView, int i, int i2) {
        float f;
        qon adapter = recyclerView.getAdapter();
        r8f r8fVar = adapter instanceof r8f ? (r8f) adapter : null;
        if (r8fVar == null) {
            su4.s(2, null, "Trying to listen Scroll with null JuicyCatalogMenuActionsAdapter adapter", null);
            return;
        }
        if (i != 0 || i2 != 0) {
            this.c = true;
        }
        LinearLayoutManager linearLayoutManager = this.a;
        int r1 = linearLayoutManager.r1();
        if (r1 == -1) {
            return;
        }
        v8f v = r8fVar.v(r1);
        v8f v8fVar = v8f.a;
        View view = this.b;
        if (v == v8fVar) {
            View L = linearLayoutManager.L(r1);
            if (L == null) {
                return;
            }
            f = (-L.getY()) / (L.getHeight() - view.getHeight());
            L.setAlpha(1 - f);
        } else {
            f = 1.0f;
        }
        if (f <= 0.0f) {
            view.setVisibility(8);
        } else {
            view.setVisibility(0);
            view.setAlpha(f);
        }
    }
}
