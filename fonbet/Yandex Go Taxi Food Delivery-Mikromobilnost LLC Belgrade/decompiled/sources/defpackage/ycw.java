package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.design.ListItemCheckComponent;

/* loaded from: classes14.dex */
public final class ycw extends dvy0 {
    public final pav c;
    public final k7x0 w;
    public final xen x;
    public List y = EmptyList.a;

    public ycw(pav pavVar, k7x0 k7x0Var, xen xenVar) {
        this.c = pavVar;
        this.w = k7x0Var;
        this.x = xenVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.y.size();
    }

    @Override // defpackage.dvy0
    /* renamed from: i */
    public final void onViewRecycled(xwy0 xwy0Var) {
        zcw zcwVar = (zcw) xwy0Var;
        super.onViewRecycled(zcwVar);
        zcwVar.S.cancel();
    }

    @Override // defpackage.dvy0, androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(zcw zcwVar, int i) {
        super.onBindViewHolder(zcwVar, i);
        auq auqVar = (auq) this.y.get(i);
        ListItemCheckComponent listItemCheckComponent = zcwVar.O;
        zcwVar.W(listItemCheckComponent.getLeadImageView(), auqVar.c);
        listItemCheckComponent.setTitle(auqVar.b);
        boolean z = auqVar.d;
        listItemCheckComponent.setChecked(z);
        if (z) {
            listItemCheckComponent.setOnClickListener(null);
        } else {
            listItemCheckComponent.setDebounceClickListener(new r7v(7, zcwVar, auqVar));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ListItemCheckComponent listItemCheckComponent = new ListItemCheckComponent(viewGroup.getContext(), null, 0, 6, null);
        listItemCheckComponent.setBackgroundResource(dzg0.bg_main_ripple);
        listItemCheckComponent.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        return new zcw(listItemCheckComponent, this.c, this.w, this.x);
    }

    @Override // defpackage.dvy0, androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(x0 x0Var) {
        zcw zcwVar = (zcw) x0Var;
        super.onViewRecycled(zcwVar);
        zcwVar.S.cancel();
    }
}
