package defpackage;

import android.view.ViewGroup;
import androidx.core.view.OneShotPreDrawListener;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.x0;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;
import ru.yandex.taxi.preorder.summary.selector.data.TariffCardType;

/* loaded from: classes6.dex */
public final class vrx0 extends dvy0 implements glx0 {
    public List A = EmptyList.a;
    public gsx0 B;
    public OneShotPreDrawListener C;
    public boolean D;
    public but0 E;
    public final h3y c;
    public final fva0 w;
    public final unx0 x;
    public final bmq0 y;
    public final hbp0 z;

    public vrx0(h3y h3yVar, fva0 fva0Var, unx0 unx0Var, bmq0 bmq0Var, hbp0 hbp0Var) {
        this.c = h3yVar;
        this.w = fva0Var;
        this.x = unx0Var;
        this.y = bmq0Var;
        this.z = hbp0Var;
    }

    @Override // defpackage.dvy0
    /* renamed from: g */
    public final void onBindViewHolder(xwy0 xwy0Var, int i) {
        sb5 sb5Var = (sb5) xwy0Var;
        super.onBindViewHolder(sb5Var, i);
        elx0 item = getItem(i);
        if (item != null) {
            sb5Var.W(null, item);
        }
    }

    @Override // defpackage.glx0
    public final elx0 getItem(int i) {
        if (i < 0 || i >= getItemCount()) {
            return null;
        }
        return (elx0) k().get(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return k().size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        int itemCount = getItemCount();
        if (itemCount == 1) {
            return TariffCardType.Single.getViewId();
        }
        if (itemCount != 2 && ((elx0) k().get(i)).a()) {
            return TariffCardType.Option.getViewId();
        }
        return TariffCardType.Regular.getViewId();
    }

    @Override // defpackage.dvy0
    /* renamed from: h */
    public final boolean onFailedToRecycleView(xwy0 xwy0Var) {
        sb5 sb5Var = (sb5) xwy0Var;
        super.onFailedToRecycleView(sb5Var);
        sb5Var.X();
        return true;
    }

    @Override // defpackage.dvy0
    /* renamed from: i */
    public final void onViewRecycled(xwy0 xwy0Var) {
        super.onViewRecycled((sb5) xwy0Var);
        OneShotPreDrawListener oneShotPreDrawListener = this.C;
        if (oneShotPreDrawListener != null) {
            oneShotPreDrawListener.removeListener();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a6 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean j(List list) {
        int l;
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (list.isEmpty()) {
            this.A = list;
            notifyDataSetChanged();
            l = l();
        } else {
            elx0 elx0Var = (elx0) a.S(l(), k());
            boolean z4 = list.size() != k().size();
            i f = kp50.f(new lds0(k(), list, new aub(19)), false);
            this.A = list;
            f.b(this);
            l = l();
            elx0 elx0Var2 = (elx0) a.S(l, k());
            if ((elx0Var == null && elx0Var2 == null) || (elx0Var != null && elx0Var2 != null && elx0Var.b(elx0Var2))) {
                if (jl40.l(elx0Var != null ? Boolean.valueOf(elx0Var.w) : null, elx0Var2 != null ? Boolean.valueOf(elx0Var2.w) : null)) {
                    z = false;
                    if (!this.y.a) {
                        if (xtb1.e(elx0Var2 != null ? elx0Var2.L : null, elx0Var != null ? elx0Var.L : null)) {
                            z2 = true;
                            if (!z || z4 || z2) {
                                z3 = true;
                            }
                        }
                    }
                    z2 = false;
                    if (!z) {
                    }
                    z3 = true;
                }
            }
            z = true;
            if (!this.y.a) {
            }
            z2 = false;
            if (!z) {
            }
            z3 = true;
        }
        elx0 elx0Var3 = (elx0) a.S(l, k());
        mr31 mr31Var = elx0Var3 != null ? elx0Var3.s : null;
        but0 but0Var = this.E;
        if (mr31Var != null) {
            if (but0Var != null) {
                but0Var.invoke(Integer.valueOf(l), mr31Var);
                return z3;
            }
        } else if (but0Var != null) {
            but0Var.invoke(-1, null);
        }
        return z3;
    }

    public final List k() {
        return a.J0(this.A);
    }

    public final int l() {
        Iterator it = k().iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((elx0) it.next()).u) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i, List list) {
        sb5 sb5Var = (sb5) x0Var;
        if (list.isEmpty()) {
            super.onBindViewHolder(sb5Var, i, list);
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            yhj yhjVar = (yhj) it.next();
            sb5Var.W((elx0) yhjVar.a, (elx0) yhjVar.b);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (!this.D) {
            fva0.f(this.w, "TariffsRibbonView.ViewHolder", PerformanceAnalytics$Type.Inflate, 0L, 4);
        }
        sb5 a = ((lqx0) this.c.get()).a(viewGroup, i, this.z);
        if (!this.D) {
            this.C = fva0.c(this.w, a.a, "TariffsRibbonView.ViewHolder", null, 12);
            this.D = true;
        }
        return a;
    }

    @Override // defpackage.dvy0, androidx.recyclerview.widget.RecyclerView.Adapter
    public final boolean onFailedToRecycleView(x0 x0Var) {
        sb5 sb5Var = (sb5) x0Var;
        super.onFailedToRecycleView(sb5Var);
        sb5Var.X();
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(x0 x0Var) {
        sb5 sb5Var = (sb5) x0Var;
        super.onViewAttachedToWindow(sb5Var);
        sb5Var.b0(new urx0(this, sb5Var));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewDetachedFromWindow(x0 x0Var) {
        sb5 sb5Var = (sb5) x0Var;
        super.onViewDetachedFromWindow(sb5Var);
        sb5Var.b0(rb5.a);
    }

    @Override // defpackage.dvy0, androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(x0 x0Var) {
        super.onViewRecycled((sb5) x0Var);
        OneShotPreDrawListener oneShotPreDrawListener = this.C;
        if (oneShotPreDrawListener != null) {
            oneShotPreDrawListener.removeListener();
        }
    }

    @Override // defpackage.dvy0, androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        sb5 sb5Var = (sb5) x0Var;
        super.onBindViewHolder(sb5Var, i);
        elx0 item = getItem(i);
        if (item != null) {
            sb5Var.W(null, item);
        }
    }
}
