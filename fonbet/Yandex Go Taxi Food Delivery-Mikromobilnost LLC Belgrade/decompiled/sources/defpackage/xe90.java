package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import java.util.ArrayList;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes6.dex */
public final class xe90 extends RecyclerView.Adapter {
    public final ArrayList a = new ArrayList();
    public nw70 b;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return this.a.get(i) instanceof qe90 ? 0 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        if (!(x0Var instanceof k1z) && (x0Var instanceof pe90)) {
            qe90 qe90Var = (qe90) this.a.get(i);
            ListItemComponent listItemComponent = ((pe90) x0Var).N;
            listItemComponent.setTitle(qe90Var.b);
            listItemComponent.setContentAlpha(qe90Var.e ? 0.5f : 1.0f);
            listItemComponent.setOnClickListener(new fx00(12, this, qe90Var));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return i == 0 ? new pe90(LayoutInflater.from(viewGroup.getContext()).inflate(crh0.park_item, viewGroup, false)) : new k1z(LayoutInflater.from(viewGroup.getContext()).inflate(crh0.loading_item, viewGroup, false));
    }
}
