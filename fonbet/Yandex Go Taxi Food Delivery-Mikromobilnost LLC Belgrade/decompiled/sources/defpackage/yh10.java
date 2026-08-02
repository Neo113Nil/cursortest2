package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;

/* loaded from: classes13.dex */
public final class yh10 extends RecyclerView.Adapter {
    public List a = EmptyList.a;

    public yh10() {
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        return ((th10) this.a.get(i)).a.hashCode();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        xh10 xh10Var = (xh10) x0Var;
        th10 th10Var = (th10) this.a.get(i);
        ListItemComponent listItemComponent = xh10Var.N;
        listItemComponent.setTitle(th10Var.b);
        listItemComponent.setSubtitle(th10Var.c);
        listItemComponent.setTrailImage(th10Var.d);
        String str = th10Var.i;
        listItemComponent.setAnalyticsButtonName(str);
        listItemComponent.setDebounceClickListener(th10Var.f);
        listItemComponent.setTrailStrongTextColor(qje.t(xng0.textMain, xh10Var.a.getContext()));
        listItemComponent.setTrailCompanionText(th10Var.h);
        listItemComponent.setTrailContainerClickListener(th10Var.e, str);
        if (th10Var.g) {
            listItemComponent.setDividers(DividerPosition.BOTTOM, DividerType.NORMAL);
        } else {
            listItemComponent.setDividers(DividerPosition.NONE, DividerType.NONE);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ListItemComponent listItemComponent = new ListItemComponent(viewGroup.getContext(), null, 0, 6, null);
        listItemComponent.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new xh10(listItemComponent);
    }
}
