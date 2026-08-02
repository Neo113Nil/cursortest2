package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.counter_offers.f;

/* loaded from: classes3.dex */
public final class ib9 extends dpn {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ib9(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.dpn
    public void a(RecyclerView recyclerView, int i) {
        switch (this.a) {
            case 1:
                ((o3a) this.b).y.D(new e4a(i));
                break;
            case 4:
                f fVar = (f) this.b;
                if (i == 0) {
                    f.a(fVar);
                    f.c(fVar);
                    f.b(fVar);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.dpn
    public void b(RecyclerView recyclerView, int i, int i2) {
        switch (this.a) {
            case 0:
                yon layoutManager = recyclerView.getLayoutManager();
                layoutManager.getClass();
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                qon adapter = ((oc9) this.b).getViewPager().getAdapter();
                int c = adapter != null ? adapter.c() : 0;
                int r1 = linearLayoutManager.r1();
                int t1 = linearLayoutManager.t1();
                if (r1 >= c - 2 && i > 0) {
                    recyclerView.z0(2);
                    break;
                } else if (t1 <= 1 && i < 0) {
                    recyclerView.z0(c - 3);
                    break;
                }
                break;
            case 1:
                ((o3a) this.b).y.D(new f4a(recyclerView.computeVerticalScrollOffset(), recyclerView.computeHorizontalScrollOffset(), i, i2));
                break;
            case 2:
                m5c m5cVar = (m5c) this.b;
                int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
                int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
                int i3 = m5cVar.a;
                int computeVerticalScrollRange = m5cVar.s.computeVerticalScrollRange();
                int i4 = m5cVar.r;
                m5cVar.t = computeVerticalScrollRange - i4 > 0 && i4 >= i3;
                int computeHorizontalScrollRange = m5cVar.s.computeHorizontalScrollRange();
                int i5 = m5cVar.q;
                boolean z = computeHorizontalScrollRange - i5 > 0 && i5 >= i3;
                m5cVar.u = z;
                boolean z2 = m5cVar.t;
                if (!z2 && !z) {
                    if (m5cVar.v != 0) {
                        m5cVar.l(0);
                        break;
                    }
                } else {
                    if (z2) {
                        float f = i4;
                        m5cVar.l = (int) ((((f / 2.0f) + computeVerticalScrollOffset) * f) / computeVerticalScrollRange);
                        m5cVar.k = Math.min(i4, (i4 * i4) / computeVerticalScrollRange);
                    }
                    if (m5cVar.u) {
                        float f2 = computeHorizontalScrollOffset;
                        float f3 = i5;
                        m5cVar.o = (int) ((((f3 / 2.0f) + f2) * f3) / computeHorizontalScrollRange);
                        m5cVar.n = Math.min(i5, (i5 * i5) / computeHorizontalScrollRange);
                    }
                    int i6 = m5cVar.v;
                    if (i6 == 0 || i6 == 1) {
                        m5cVar.l(1);
                        break;
                    }
                }
                break;
            case 3:
                FloatingActionButton floatingActionButton = (FloatingActionButton) this.b;
                if (i2 <= 0) {
                    floatingActionButton.h(null, true);
                    break;
                } else {
                    floatingActionButton.l(null, true);
                    break;
                }
        }
    }
}
