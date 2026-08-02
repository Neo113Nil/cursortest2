package defpackage;

import android.graphics.Bitmap;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;

/* loaded from: classes5.dex */
public final class x000 extends RecyclerView.Adapter {
    public final Bitmap a;
    public final ptw b;
    public lmo w;
    public List c = EmptyList.a;
    public int x = -1;

    public x000(Bitmap bitmap, ptw ptwVar) {
        this.a = bitmap;
        this.b = ptwVar;
    }

    public final void f(lmo lmoVar) {
        int i = this.x;
        this.x = this.c.indexOf(lmoVar);
        notifyItemChanged(i);
        int i2 = this.x;
        if (i2 < 0 || i2 >= this.c.size()) {
            return;
        }
        notifyItemChanged(this.x);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        w000 w000Var = (w000) x0Var;
        lmo lmoVar = (lmo) this.c.get(i);
        boolean z = i == this.x;
        ListItemComponent listItemComponent = w000Var.N;
        listItemComponent.setTitle(lmoVar.c);
        x000 x000Var = w000Var.O;
        listItemComponent.setLeadImage(x000Var.a);
        listItemComponent.setDebounceClickListener(new r7v(29, x000Var, lmoVar));
        if (z) {
            listItemComponent.setTrailImage(dzg0.component_list_item_check_checked_single);
        } else {
            listItemComponent.setTrailImage(dzg0.component_list_item_check_unchecked_single);
        }
        int size = this.c.size() - 1;
        ListItemComponent listItemComponent2 = w000Var.N;
        if (i < size) {
            listItemComponent2.setDividers(DividerPosition.BOTTOM, DividerType.MARGIN);
        } else {
            listItemComponent2.setDividers(DividerPosition.NONE, DividerType.MARGIN);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ListItemComponent listItemComponent = new ListItemComponent(viewGroup.getContext(), null, 0, 6, null);
        listItemComponent.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new w000(this, listItemComponent);
    }
}
