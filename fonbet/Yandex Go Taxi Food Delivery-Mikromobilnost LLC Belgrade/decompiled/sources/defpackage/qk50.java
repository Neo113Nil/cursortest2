package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;

/* loaded from: classes5.dex */
public final class qk50 extends RecyclerView.Adapter {
    public final k7x0 a;
    public final pav b;
    public final ptw c;
    public j7u0 x;
    public List w = EmptyList.a;
    public int y = -1;

    public qk50(k7x0 k7x0Var, pav pavVar, ptw ptwVar) {
        this.a = k7x0Var;
        this.b = pavVar;
        this.c = ptwVar;
    }

    public final void f(j7u0 j7u0Var) {
        int i = this.y;
        this.y = this.w.indexOf(j7u0Var);
        notifyItemChanged(i);
        int i2 = this.y;
        if (i2 < 0 || i2 >= this.w.size()) {
            return;
        }
        notifyItemChanged(this.y);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.w.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        pk50 pk50Var = (pk50) x0Var;
        j7u0 j7u0Var = (j7u0) this.w.get(i);
        boolean z = i == this.y;
        qk50 qk50Var = pk50Var.O;
        ListItemComponent listItemComponent = pk50Var.N;
        listItemComponent.setTitle(j7u0Var.c);
        listItemComponent.setTrailCompanionText(j7u0Var.b);
        hdu hduVar = j7u0Var.d;
        String str = (String) hduVar.b;
        Integer num = (Integer) hduVar.a;
        if (str == null || evu0.J(str)) {
            listItemComponent.setLeadImage(xzg0.ic_metrostation);
            if (num != null) {
                listItemComponent.setLeadTint(num.intValue());
            }
        } else {
            nac nacVar = (nac) qk50Var.b.a(listItemComponent.getLeadImageView());
            nacVar.i = new ve30(29, pk50Var, num);
            nacVar.h = new x240(26, pk50Var);
            nacVar.c(((m7x0) qk50Var.a).a(str));
        }
        listItemComponent.setDebounceClickListener(new sd30(3, qk50Var, j7u0Var));
        if (z) {
            listItemComponent.setTrailImage(dzg0.component_list_item_check_checked_single);
        } else {
            listItemComponent.setTrailImage(dzg0.component_list_item_check_unchecked_single);
        }
        if (i < this.w.size() - 1) {
            listItemComponent.setDividers(DividerPosition.BOTTOM, DividerType.MARGIN);
        } else {
            listItemComponent.setDividers(DividerPosition.NONE, DividerType.MARGIN);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ListItemComponent listItemComponent = new ListItemComponent(viewGroup.getContext(), null, 0, 6, null);
        listItemComponent.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new pk50(this, listItemComponent);
    }
}
