package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import defpackage.iqx;
import java.util.List;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;

/* loaded from: classes5.dex */
public final class rqx extends RecyclerView.Adapter {
    public final List a;

    public rqx(List list) {
        this.a = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        gtv gtvVar = (gtv) x0Var;
        List list = this.a;
        iqx.a aVar = (iqx.a) list.get(i);
        boolean z = i == list.size() - 1;
        ListItemComponent listItemComponent = gtvVar.N;
        listItemComponent.setTitle(aVar.a);
        listItemComponent.setSubtitle(aVar.b);
        listItemComponent.setDividers(DividerPosition.BOTTOM, z ? DividerType.NONE : DividerType.MARGIN);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ListItemComponent listItemComponent = new ListItemComponent(viewGroup.getContext(), null, 0, 6, null);
        listItemComponent.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new gtv(listItemComponent);
    }
}
