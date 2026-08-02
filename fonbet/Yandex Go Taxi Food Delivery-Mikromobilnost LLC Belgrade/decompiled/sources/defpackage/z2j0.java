package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.design.ListItemCheckComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;

/* loaded from: classes13.dex */
public final class z2j0 extends RecyclerView.Adapter {
    public final vfc0 a;
    public List b = EmptyList.a;

    public z2j0(vfc0 vfc0Var) {
        this.a = vfc0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        y2j0 y2j0Var = (y2j0) x0Var;
        boolean z = i == this.b.size() - 1;
        x2j0 x2j0Var = (x2j0) this.b.get(i);
        ListItemCheckComponent listItemCheckComponent = y2j0Var.N;
        listItemCheckComponent.setTitle(x2j0Var.a);
        listItemCheckComponent.setSubtitle(x2j0Var.b);
        listItemCheckComponent.setChecked(x2j0Var.d);
        if (z) {
            listItemCheckComponent.setDividers(DividerPosition.NONE, DividerType.NORMAL);
        } else {
            listItemCheckComponent.setDividers(DividerPosition.BOTTOM, DividerType.NORMAL);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new y2j0(viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(x0 x0Var) {
        ((y2j0) x0Var).O = new odf0(15, this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewDetachedFromWindow(x0 x0Var) {
        ((y2j0) x0Var).O = null;
    }
}
