package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.x0;
import androidx.recyclerview.widget.y;
import com.lightside.slab.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes11.dex */
public class wsb extends y implements yv5 {
    public final List a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wsb(List list, int i) {
        super(new xhj());
        list = (i & 1) != 0 ? EmptyList.a : list;
        this.a = list;
    }

    @Override // defpackage.yv5
    public final void c(Object obj) {
        super.submitList(new ArrayList((List) obj));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        Object item = getItem(i);
        int i2 = 0;
        for (Object obj : this.a) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                scc.m();
                throw null;
            }
            if (((Boolean) ((fum) obj).b.invoke(item)).booleanValue()) {
                return i2;
            }
            i2 = i3;
        }
        throw new IllegalStateException(("No matching chunk for item " + item + " at position " + i).toString());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        ((vsb) x0Var).c(getItem(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        fum fumVar = (fum) this.a.get(i);
        a aVar = (a) fumVar.a.invoke(viewGroup.getContext());
        return new vsb(aVar, new eum(aVar));
    }

    public wsb() {
        this(null, 3);
    }
}
