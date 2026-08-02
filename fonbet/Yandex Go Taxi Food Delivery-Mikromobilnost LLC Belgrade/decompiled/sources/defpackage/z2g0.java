package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.x0;
import androidx.recyclerview.widget.y;
import ru.yandex.taxi.design.ListGroupHeaderComponent;
import ru.yandex.taxi.settings.presentation.list.viewholder.a;

/* loaded from: classes6.dex */
public final class z2g0 extends y {
    public final amp0 a;

    public z2g0(amp0 amp0Var) {
        super(a3g0.a);
        this.a = amp0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return !(((z5r0) getItem(i)) instanceof x5r0) ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        ((w95) x0Var).W((z5r0) getItem(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        return i == 0 ? new e5q0((ListGroupHeaderComponent) from.inflate(yqh0.section_item, viewGroup, false)) : new a(from.inflate(yqh0.push_setting_list_item, viewGroup, false), this.a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(x0 x0Var) {
        w95 w95Var = (w95) x0Var;
        super.onViewRecycled(w95Var);
        w95Var.X();
    }
}
