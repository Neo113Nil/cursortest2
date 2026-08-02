package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class dgc extends jc9 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dgc(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.dgu
    public final void c(int i) {
        switch (this.a) {
            case 0:
                ((kma) this.b).invoke(Integer.valueOf(i));
                break;
            default:
                t5w t5wVar = (t5w) this.b;
                int a = t5wVar.a();
                if (a > t5wVar.f) {
                    t5wVar.f = a;
                    oc9 oc9Var = t5wVar.a;
                    RecyclerView recyclerView = oc9Var.getRecyclerView();
                    if (recyclerView != null) {
                        recyclerView.setItemViewCacheSize((t5wVar.f * 2) + 3);
                    }
                    oc9Var.getViewPager().setOffscreenPageLimit(t5wVar.f);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.jc9, android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.a) {
            case 1:
                t5w t5wVar = (t5w) this.b;
                int a = t5wVar.a();
                if (a > t5wVar.f) {
                    t5wVar.f = a;
                    oc9 oc9Var = t5wVar.a;
                    RecyclerView recyclerView = oc9Var.getRecyclerView();
                    if (recyclerView != null) {
                        recyclerView.setItemViewCacheSize((t5wVar.f * 2) + 3);
                    }
                    oc9Var.getViewPager().setOffscreenPageLimit(t5wVar.f);
                    break;
                }
                break;
        }
    }
}
