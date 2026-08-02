package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import com.yandex.div.core.state.a;
import com.yandex.div.core.state.b;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.y;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivVisibility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class zik extends y {
    public ArrayList A;
    public final aw5 y;
    public final b z;

    public zik(aw5 aw5Var, b bVar, List list) {
        super(list);
        this.y = aw5Var;
        this.z = bVar;
        this.A = a.i(list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        cxk cxkVar = (cxk) kotlin.collections.a.S(i, g());
        if (cxkVar == null) {
            return 0;
        }
        Expression g = cxkVar.a.d().g();
        String str = g != null ? (String) g.a(cxkVar.b) : null;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean k(RecyclerView recyclerView, z2l z2lVar, aw5 aw5Var) {
        ArrayList arrayList;
        Div2View div2View = aw5Var.a;
        rvo rvoVar = aw5Var.b;
        g3l g3lVar = (g3l) z2lVar.a.get(div2View.getDataTag());
        if (g3lVar != null) {
            com.yandex.div.core.downloader.a aVar = new com.yandex.div.core.downloader.a(g3lVar, new px(3, aw5Var));
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (true) {
                arrayList = this.a;
                if (i >= arrayList.size()) {
                    break;
                }
                String id = ((cxk) arrayList.get(i)).a.d().getId();
                List a = id != null ? z2lVar.a(div2View.getDataTag(), id) : null;
                if (a != null) {
                    h(i);
                    f(i, com.yandex.div.internal.core.a.h(a, rvoVar));
                    i += a.size() - 1;
                    linkedHashSet.add(id);
                }
                i++;
            }
            Set keySet = g3lVar.a.keySet();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : keySet) {
                if (!linkedHashSet.contains((String) obj)) {
                    arrayList2.add(obj);
                }
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                int size = arrayList.size();
                int i2 = 0;
                while (true) {
                    if (i2 < size) {
                        m3k m = aVar.m(recyclerView != null ? recyclerView : div2View, ((cxk) arrayList.get(i2)).a, str, rvoVar);
                        if (m != null) {
                            cxk cxkVar = new cxk(m, rvoVar);
                            boolean z = ((DivVisibility) m.d().getVisibility().a(rvoVar)) != DivVisibility.GONE;
                            ArrayList arrayList3 = this.c;
                            boolean booleanValue = ((Boolean) arrayList3.get(i2)).booleanValue();
                            arrayList.set(i2, cxkVar);
                            arrayList3.set(i2, Boolean.valueOf(z));
                            if (z || booleanValue) {
                                this.w = false;
                            }
                            if (booleanValue && !z) {
                                e(j(i2));
                            } else if (!booleanValue && z) {
                                d(j(i2));
                            } else if (booleanValue && z) {
                                b(j(i2));
                            }
                        } else {
                            i2++;
                        }
                    }
                }
            }
            if (!linkedHashSet.isEmpty()) {
                this.A = a.i(arrayList);
                i();
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(kjk kjkVar, int i) {
        tvo tvoVar;
        cxk cxkVar = (cxk) g().get(i);
        b a = this.z.a((String) this.A.get(this.a.indexOf(cxkVar)));
        aw5 aw5Var = this.y;
        ykl0 runtimeStore = aw5Var.a.getRuntimeStore();
        m3k m3kVar = cxkVar.a;
        rvo rvoVar = cxkVar.b;
        com.yandex.div.core.expression.a a2 = runtimeStore.a(a, m3kVar, rvoVar, aw5Var.b);
        if (a2 != null && (tvoVar = a2.a) != null) {
            rvoVar = tvoVar;
        }
        kjkVar.W(aw5Var.a(rvoVar), cxkVar.a, i, a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(x0 x0Var) {
        aw5 v;
        kjk kjkVar = (kjk) x0Var;
        super.onViewAttachedToWindow(kjkVar);
        View child = kjkVar.N.getChild();
        if (child == null || (v = com.yandex.div.core.view2.divs.a.v(child)) == null) {
            return;
        }
        com.yandex.div.core.view2.divs.a.l(child, v, kjkVar.P);
    }
}
