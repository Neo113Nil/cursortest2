package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c;
import androidx.recyclerview.widget.x0;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes14.dex */
public final class se6 extends RecyclerView.Adapter {
    public final pav a;
    public tls b;
    public final c c = new c(this, new a10(3));

    public se6(pav pavVar) {
        this.a = pavVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.c.f.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        ((re6) x0Var).c((qe6) this.c.f.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ListItemComponent listItemComponent = new ListItemComponent(viewGroup.getContext(), null, 0, 6, null);
        nzs.s(listItemComponent, -1, -2);
        return new re6(listItemComponent, this.a, this.b);
    }
}
