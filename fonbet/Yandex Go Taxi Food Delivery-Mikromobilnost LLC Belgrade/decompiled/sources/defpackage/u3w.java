package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import com.yandex.go.promocodes.referral.api.net.dto.DescriptionItem;
import java.util.List;

/* loaded from: classes13.dex */
public final class u3w extends RecyclerView.Adapter {
    public final List a;

    public u3w(List list) {
        this.a = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        c4w c4wVar = (c4w) x0Var;
        DescriptionItem descriptionItem = (DescriptionItem) this.a.get(i);
        c4wVar.N.setText(String.valueOf(i + 1));
        c4wVar.O.setText(descriptionItem.a);
        c4wVar.P.setText(descriptionItem.b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new c4w(LayoutInflater.from(viewGroup.getContext()).inflate(dvh0.instruction_item_view, viewGroup, false));
    }
}
