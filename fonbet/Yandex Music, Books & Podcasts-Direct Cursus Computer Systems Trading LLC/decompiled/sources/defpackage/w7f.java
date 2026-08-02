package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class w7f {
    public static final /* synthetic */ s9f[] f = {new yxm(w7f.class, "loadingPlaceholderContainer", "getLoadingPlaceholderContainer()Landroid/view/View;", 0), f1d.c(ern.a, w7f.class, "list", "getList()Landroidx/recyclerview/widget/RecyclerView;", 0), new yxm(w7f.class, "title", "getTitle()Landroid/widget/TextView;", 0)};
    public final g8c a;
    public final t7f b;
    public final u7f c;
    public final q13 d;
    public final s7f e;

    public w7f(View view, g8c g8cVar, t7f t7fVar, u7f u7fVar, t7f t7fVar2) {
        g8cVar.getClass();
        this.a = g8cVar;
        this.b = t7fVar;
        this.c = u7fVar;
        Context context = view.getContext();
        context.getClass();
        this.d = new q13(new etb(view, 25));
        q13 q13Var = new q13(new etb(view, 26));
        s7f s7fVar = new s7f(new v1e(11, this), new lhd(12, this), t7fVar2);
        this.e = s7fVar;
        s9f[] s9fVarArr = f;
        ((RecyclerView) q13Var.a(s9fVarArr[1])).setAdapter(s7fVar);
        RecyclerView recyclerView = (RecyclerView) q13Var.a(s9fVarArr[1]);
        float dimension = context.getResources().getDimension(R.dimen.unit_and_half_margin);
        float dimension2 = context.getResources().getDimension(R.dimen.edge_margin);
        float dimension3 = context.getResources().getDimension(R.dimen.juicy_bottom_sheet_list_item_small_padding);
        context.getResources().getDimension(R.dimen.double_edge_margin);
        recyclerView.s(new h8f(dimension, dimension2, context.getResources().getDimension(R.dimen.juicy_bottom_sheet_list_item_corner_radius), dimension3, weo.M(context, R.attr.bgPlaceholder)));
        RecyclerView recyclerView2 = (RecyclerView) q13Var.a(s9fVarArr[1]);
        s9f s9fVar = s9fVarArr[2];
        s9fVar.getClass();
        try {
            View findViewById = view.findViewById(R.id.bottom_sheet_add_to_playlist_title);
            if (findViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            recyclerView2.t(new kvd((TextView) findViewById));
        } catch (ClassCastException e) {
            l1j.n(f1d.f("Invalid view binding (see cause) for ", s9fVar), e);
            throw null;
        }
    }

    public final void a(evl evlVar) {
        s7f s7fVar = this.e;
        s7fVar.getClass();
        ArrayList arrayList = (ArrayList) s7fVar.h;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (((evl) it.next()).a.e().equals(evlVar.a.e())) {
                break;
            } else {
                i++;
            }
        }
        arrayList.set(i, evlVar);
        s7fVar.a.d(i + 1, 1, "partial_update_tag");
    }
}
