package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.Expression;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public final class wrs extends RecyclerView.g {
    public final /* synthetic */ xrs a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ List f;
    public final /* synthetic */ rvo g;
    public final /* synthetic */ Div2View h;

    public wrs(xrs xrsVar, String str, String str2, String str3, String str4, ArrayList arrayList, rvo rvoVar, Div2View div2View) {
        this.a = xrsVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = arrayList;
        this.g = rvoVar;
        this.h = div2View;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        Div2View div2View;
        y6k actionHandler;
        String str = this.b;
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        xrs xrsVar = this.a;
        xrs.a(xrsVar, str, computeHorizontalScrollOffset);
        xrs.a(xrsVar, this.c, recyclerView.computeVerticalScrollOffset());
        xrs.a(xrsVar, this.d, Math.max(0, (recyclerView.computeHorizontalScrollRange() - recyclerView.computeHorizontalScrollExtent()) - recyclerView.computeHorizontalScrollOffset()));
        xrs.a(xrsVar, this.e, Math.max(0, (recyclerView.computeVerticalScrollRange() - recyclerView.computeVerticalScrollExtent()) - recyclerView.computeVerticalScrollOffset()));
        List<v3k> list = this.f;
        if (list != null) {
            for (v3k v3kVar : list) {
                Expression expression = v3kVar.b;
                rvo rvoVar = this.g;
                if (((Boolean) expression.a(rvoVar)).booleanValue() && (actionHandler = (div2View = this.h).getActionHandler()) != null) {
                    actionHandler.handleAction(v3kVar, div2View, rvoVar);
                }
            }
        }
    }
}
