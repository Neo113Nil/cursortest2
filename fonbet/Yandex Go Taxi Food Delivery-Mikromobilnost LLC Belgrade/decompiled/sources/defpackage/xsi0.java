package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class xsi0 extends RecyclerView.h {
    public final wsi0 d;
    public final LinkedHashSet e = new LinkedHashSet();

    public xsi0(wsi0 wsi0Var) {
        this.d = wsi0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void a() {
        super.a();
        LinkedHashSet linkedHashSet = this.e;
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            wwg.Y(this.d, ((x0) it.next()).a);
        }
        linkedHashSet.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final x0 b(int i) {
        x0 b = super.b(i);
        if (b == null) {
            return null;
        }
        this.e.remove(b);
        return b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void d(x0 x0Var) {
        super.d(x0Var);
        this.e.add(x0Var);
    }
}
