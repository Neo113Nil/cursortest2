package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.gallery.a;
import com.yandex.div.core.view2.divs.widgets.DivRecyclerView;
import com.yandex.div.core.view2.i;
import com.yandex.div2.DivGallery;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;

/* loaded from: classes.dex */
public final class vrk extends RecyclerView.g {
    public final aw5 a;
    public final DivRecyclerView b;
    public final urk c;
    public final Div2View d;
    public int e;
    public boolean f;

    public vrk(aw5 aw5Var, DivRecyclerView divRecyclerView, urk urkVar, DivGallery divGallery) {
        this.a = aw5Var;
        this.b = divRecyclerView;
        this.c = urkVar;
        Div2View div2View = aw5Var.a;
        this.d = div2View;
        div2View.getConfig().getClass();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        super.onScrollStateChanged(recyclerView, i);
        if (i == 1) {
            this.f = false;
        }
        if (i == 0) {
            this.d.getDiv2Component().h();
            rvo rvoVar = this.a.b;
            urk urkVar = this.c;
            urkVar.a();
            urkVar.b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        ?? r0;
        int width = this.c.width() / 20;
        int abs = Math.abs(i2) + Math.abs(i) + this.e;
        this.e = abs;
        if (abs <= width) {
            return;
        }
        this.e = 0;
        boolean z = this.f;
        Div2View div2View = this.d;
        if (!z) {
            this.f = true;
            div2View.getDiv2Component().h();
        }
        i G = div2View.getDiv2Component().G();
        DivRecyclerView divRecyclerView = this.b;
        int childCount = divRecyclerView.getChildCount();
        EmptyList emptyList = EmptyList.a;
        if (childCount > 0) {
            View childAt = divRecyclerView.getChildAt(0);
            if (childAt == null) {
                ny61.s();
                return;
            }
            if (1 < divRecyclerView.getChildCount()) {
                r0 = new ArrayList();
                r0.add(childAt);
                int i3 = 1;
                while (i3 < divRecyclerView.getChildCount()) {
                    int i4 = i3 + 1;
                    View childAt2 = divRecyclerView.getChildAt(i3);
                    if (childAt2 == null) {
                        ny61.s();
                        return;
                    } else {
                        r0.add(childAt2);
                        i3 = i4;
                    }
                }
            } else {
                r0 = Collections.singletonList(childAt);
            }
        } else {
            r0 = emptyList;
        }
        Iterator it = G.g.entrySet().iterator();
        while (it.hasNext()) {
            if (!r0.contains(((Map.Entry) it.next()).getKey())) {
                it.remove();
            }
        }
        if (!G.l) {
            G.l = true;
            G.c.post(G.m);
        }
        int i5 = 0;
        while (true) {
            int childCount2 = divRecyclerView.getChildCount();
            aw5 aw5Var = this.a;
            if (i5 >= childCount2) {
                LinkedHashMap f = G.f();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : f.entrySet()) {
                    Object key = entry.getKey();
                    h8 h8Var = new h8(3, divRecyclerView);
                    int i6 = 0;
                    while (true) {
                        if (!h8Var.hasNext()) {
                            i6 = -1;
                            break;
                        }
                        Object next = h8Var.next();
                        if (i6 < 0) {
                            scc.m();
                            throw null;
                        }
                        if (jl40.l(key, next)) {
                            break;
                        } else {
                            i6++;
                        }
                    }
                    if (i6 < 0) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    View view = (View) entry2.getKey();
                    m3k m3kVar = (m3k) entry2.getValue();
                    List l = m3kVar.d().l();
                    if (l != null) {
                        rvo rvoVar = aw5Var.b;
                        G.j(aw5Var.a, rvoVar, view, m3kVar, emptyList, i.e(l, rvoVar));
                    }
                }
                return;
            }
            int i7 = i5 + 1;
            View childAt3 = divRecyclerView.getChildAt(i5);
            if (childAt3 == null) {
                ny61.s();
                return;
            }
            int childAdapterPosition = divRecyclerView.getChildAdapterPosition(childAt3);
            if (childAdapterPosition != -1) {
                m3k m3kVar2 = ((cxk) ((a) divRecyclerView.getAdapter()).g().get(childAdapterPosition)).a;
                aw5 v = com.yandex.div.core.view2.divs.a.v(childAt3);
                if (v != null) {
                    aw5Var = v;
                }
                G.h(aw5Var, childAt3, m3kVar2);
            }
            i5 = i7;
        }
    }
}
