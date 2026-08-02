package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import core.flex.ui.OrientationAwareRecyclerView;
import java.util.Iterator;
import just.adapter.sticky.a;
import just.adapter.sticky.b;

/* loaded from: classes9.dex */
public final class uyp0 implements uji0 {
    public final /* synthetic */ int a;
    public final RecyclerView b;
    public final /* synthetic */ Object c;

    public /* synthetic */ uyp0(Object obj, RecyclerView recyclerView, int i) {
        this.a = i;
        this.c = obj;
        this.b = recyclerView;
    }

    @Override // defpackage.uji0
    public final void a(View view) {
        switch (this.a) {
            case 0:
                ((wyp0) this.c).f(this.b);
                break;
            default:
                view.setVisibility(0);
                break;
        }
    }

    @Override // defpackage.uji0
    public final void b(View view) {
        int i = this.a;
        Object obj = this.c;
        RecyclerView recyclerView = this.b;
        switch (i) {
            case 0:
                ((wyp0) obj).f(recyclerView);
                break;
            default:
                int childAdapterPosition = ((OrientationAwareRecyclerView) recyclerView).getChildAdapterPosition(view);
                Iterator it = ((a) obj).c.iterator();
                while (it.hasNext()) {
                    b bVar = (b) it.next();
                    if (((Boolean) bVar.c.a.invoke(Integer.valueOf(childAdapterPosition))).booleanValue() && bVar.p != -1) {
                        view.setVisibility(8);
                    }
                }
                break;
        }
    }
}
