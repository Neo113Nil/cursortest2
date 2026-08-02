package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class e3e extends won {
    public final /* synthetic */ int a;
    public int b;

    public /* synthetic */ e3e(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // defpackage.won
    public final void f(Rect rect, View view, RecyclerView recyclerView, kpn kpnVar) {
        int r1;
        switch (this.a) {
            case 0:
                int i = this.b;
                int Y = RecyclerView.Y(view);
                rect.left = Y == 0 ? 0 : i / 2;
                rect.right = Y != kpnVar.b() + (-1) ? i / 2 : 0;
                break;
            case 1:
                rect.getClass();
                view.getClass();
                kpnVar.getClass();
                qon adapter = recyclerView.getAdapter();
                r8f r8fVar = adapter instanceof r8f ? (r8f) adapter : null;
                if (r8fVar != null) {
                    if (RecyclerView.Y(view) == r8fVar.g.size() - 1) {
                        v8f v = r8fVar.v(0);
                        v8f v8fVar = v8f.a;
                        if (v == v8fVar) {
                            yon layoutManager = recyclerView.getLayoutManager();
                            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                            if (linearLayoutManager != null && (r1 = linearLayoutManager.r1()) != -1) {
                                if ((r8fVar.v(r1) == v8fVar || this.b != 0) && r8fVar.v(RecyclerView.Z(view)) == v8f.f) {
                                    rect.set(0, 0, 0, this.b);
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    su4.s(2, null, "Trying to get offset for RV with null adapter", null);
                    break;
                }
                break;
            default:
                rect.getClass();
                view.getClass();
                kpnVar.getClass();
                rect.top = RecyclerView.Z(view) > 0 ? this.b : 0;
                break;
        }
    }

    public /* synthetic */ e3e() {
        this.a = 1;
    }
}
