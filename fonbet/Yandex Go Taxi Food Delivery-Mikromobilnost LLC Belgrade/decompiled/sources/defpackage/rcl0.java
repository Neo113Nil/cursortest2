package defpackage;

import androidx.recyclerview.widget.ItemTouchHelper$Callback;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import com.yandex.go.navigator.route_stops.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class rcl0 extends ItemTouchHelper$Callback {
    public int d;
    public final /* synthetic */ a e;

    public rcl0(a aVar) {
        this.e = aVar;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper$Callback
    public final boolean a(x0 x0Var) {
        return x0Var instanceof cel0;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper$Callback
    public final int e(x0 x0Var) {
        if (x0Var instanceof cel0) {
            return ItemTouchHelper$Callback.k(3, 0);
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0030, code lost:
    
        if (r6 == null) goto L36;
     */
    @Override // androidx.recyclerview.widget.ItemTouchHelper$Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m(RecyclerView recyclerView, x0 x0Var, x0 x0Var2) {
        int size;
        List list;
        List list2;
        a aVar = this.e;
        yxf0 yxf0Var = aVar.z;
        int F = x0Var.F() - 1;
        int F2 = x0Var2.F();
        int i = F2 - 1;
        re50 re50Var = (re50) yxf0Var.a;
        List list3 = (List) yxf0Var.b;
        if (list3 == null) {
            pe50 c = re50Var.c();
            list3 = (c == null || (list2 = c.b) == null) ? null : new ArrayList(list2);
        }
        int[] iArr = {F, i};
        List list4 = (List) yxf0Var.b;
        if (list4 != null) {
            size = list4.size();
        } else {
            pe50 c2 = re50Var.c();
            size = (c2 == null || (list = c2.b) == null) ? 0 : list.size();
        }
        int i2 = 0;
        while (true) {
            if (i2 < 2) {
                int i3 = iArr[i2];
                if (i3 < 0 || i3 >= size) {
                    break;
                }
                i2++;
            } else {
                if (F < i) {
                    while (F < i) {
                        int i4 = F + 1;
                        Collections.swap(list3, F, i4);
                        F = i4;
                    }
                } else if (F2 <= F) {
                    while (true) {
                        Collections.swap(list3, F, F - 1);
                        if (F == F2) {
                            break;
                        }
                        F--;
                    }
                }
                yxf0Var.b = list3;
            }
        }
        aVar.notifyItemMoved(x0Var.F(), x0Var2.F());
        if (recyclerView.getAdapter() != null) {
            cel0 cel0Var = (cel0) x0Var;
            cel0 cel0Var2 = (cel0) x0Var2;
            int F3 = cel0Var.F();
            int F4 = cel0Var2.F();
            if (F3 >= aVar.getItemCount() - 2) {
                F3 = -1;
            }
            cel0Var.c0(F3, true);
            if (F4 >= aVar.getItemCount() - 2) {
                F4 = -1;
            }
            cel0Var2.c0(F4, false);
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper$Callback
    public final void o(x0 x0Var, int i) {
        Object value;
        pe50 pe50Var;
        if (i == 0 && this.d == 2) {
            yxf0 yxf0Var = this.e.z;
            List list = (List) yxf0Var.b;
            if (list != null) {
                r0 r0Var = ((re50) yxf0Var.a).b;
                do {
                    value = r0Var.getValue();
                    pe50Var = (pe50) value;
                } while (!r0Var.k(value, pe50Var != null ? pe50.a(pe50Var, null, list, 1) : null));
            }
            yxf0Var.b = null;
        }
        this.d = i;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper$Callback
    public final void p(x0 x0Var, int i) {
    }
}
