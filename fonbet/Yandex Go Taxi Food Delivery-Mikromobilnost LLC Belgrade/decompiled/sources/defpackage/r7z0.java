package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import com.yandex.go.feed.global.div.custom.time_slot_histogram.TimeSlotHistogramSlotView;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes6.dex */
public final class r7z0 extends RecyclerView.Adapter {
    public final int a;
    public final m7z0 b;
    public final gtk c;
    public List w = EmptyList.a;
    public int x = -1;

    public r7z0(int i, m7z0 m7z0Var, gtk gtkVar) {
        this.a = i;
        this.b = m7z0Var;
        this.c = gtkVar;
    }

    public final void f(int i, boolean z) {
        int i2 = this.x;
        if (i2 != i) {
            this.x = i;
            if (i2 == -1 || !z) {
                notifyItemChanged(i2);
                notifyItemChanged(i);
            } else {
                notifyItemChanged(i2, "animate_selection");
                notifyItemChanged(i, "animate_selection");
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.w.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i, List list) {
        z7z0 z7z0Var = (z7z0) x0Var;
        boolean isEmpty = list.isEmpty();
        int i2 = this.a;
        if (isEmpty) {
            z7z0Var.W((p7z0) this.w.get(i), i == this.x, i2, null);
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            z7z0Var.W((p7z0) this.w.get(i), i == this.x, i2, it.next());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new z7z0(new TimeSlotHistogramSlotView(viewGroup.getContext(), this.c), this.b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        ((z7z0) x0Var).W((p7z0) this.w.get(i), i == this.x, this.a, null);
    }
}
