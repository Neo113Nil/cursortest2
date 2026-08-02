package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.core.view2.divs.gallery.a;
import com.yandex.div.core.view2.divs.widgets.DivRecyclerView;

/* loaded from: classes11.dex */
public final class zpl extends xpl {
    public final /* synthetic */ aql p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zpl(aql aqlVar, DivRecyclerView divRecyclerView) {
        super(divRecyclerView.getContext());
        this.p = aqlVar;
    }

    @Override // androidx.recyclerview.widget.w
    public final int j(int i, int i2, int i3, int i4, int i5) {
        DivRecyclerView divRecyclerView = this.p.b;
        w890 pagerSnapStartHelper = divRecyclerView.getPagerSnapStartHelper();
        if (pagerSnapStartHelper == null) {
            return 0;
        }
        int i6 = pagerSnapStartHelper.f;
        RecyclerView.Adapter adapter = divRecyclerView.getAdapter();
        a aVar = adapter instanceof a ? (a) adapter : null;
        return (((((aVar == null || aVar.E != 0) ? divRecyclerView.getHeight() : divRecyclerView.getWidth()) - i) - i2) + i6) / 2;
    }
}
