package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes6.dex */
public final class xy41 extends RecyclerView.Adapter {
    public List a = EmptyList.a;
    public ez41 b;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        wy41 wy41Var = (wy41) x0Var;
        vy41 vy41Var = (vy41) this.a.get(i);
        ListItemComponent listItemComponent = wy41Var.N;
        listItemComponent.setTitle(vy41Var.b);
        listItemComponent.setSubtitle(vy41Var.a);
        listItemComponent.ellipsizeTitleMiddle(true);
        listItemComponent.setOnClickListener(new y7z0(16, wy41Var, vy41Var));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2 = wy41.P;
        return new wy41(LayoutInflater.from(viewGroup.getContext()).inflate(nlh0.where_you_are_addresses, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(x0 x0Var) {
        wy41 wy41Var = (wy41) x0Var;
        ez41 ez41Var = this.b;
        if (ez41Var == null) {
            return;
        }
        wy41Var.O = ez41Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewDetachedFromWindow(x0 x0Var) {
        wy41 wy41Var = (wy41) x0Var;
        super.onViewDetachedFromWindow(wy41Var);
        wy41Var.O = null;
    }
}
