package defpackage;

import android.app.Activity;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.bricks.Brick;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.core.net.entities.BackendConfig;
import com.yandex.messaging.core.net.entities.proto.message.UserReaction;
import com.yandex.messaging.internal.LocalMessageRef;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.entities.FullReactionInfo;
import com.yandex.messaging.internal.view.timeline.g0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlin.collections.b;

/* loaded from: classes15.dex */
public final class rai0 extends Brick implements g070 {
    public final kai0 A;
    public List B;
    public ArrayList C;
    public long D;
    public boolean F;
    public yln G;
    public final GridLayoutManager I;
    public bu10 J;
    public final View K;
    public final RecyclerView L;
    public ct21 M;
    public ct21 N;
    public final yai0 a;
    public final pai0 b;
    public final q6c0 c;
    public final g0 w;
    public final vai0 x;
    public final h3y y;
    public final nai0 z;
    public List E = EmptyList.a;
    public int H = 1;

    public rai0(Activity activity, yai0 yai0Var, pai0 pai0Var, q6c0 q6c0Var, g0 g0Var, vai0 vai0Var, h3y h3yVar, nai0 nai0Var, kai0 kai0Var) {
        LinearLayoutManager linearLayoutManager;
        this.a = yai0Var;
        this.b = pai0Var;
        this.c = q6c0Var;
        this.w = g0Var;
        this.x = vai0Var;
        this.y = h3yVar;
        this.z = nai0Var;
        this.A = kai0Var;
        View inflate = View.inflate(activity, olh0.msg_b_reactions_chooser, null);
        this.K = inflate;
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(e9h0.reactions_list);
        this.L = recyclerView;
        RecyclerView.h hVar = new RecyclerView.h();
        recyclerView.setNestedScrollingEnabled(false);
        if (((zxo) h3yVar.get()).c) {
            GridLayoutManager gridLayoutManager = new GridLayoutManager(inflate.getContext(), this.H);
            this.I = gridLayoutManager;
            linearLayoutManager = gridLayoutManager;
        } else {
            linearLayoutManager = new LinearLayoutManager(inflate.getContext(), 0, false);
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(pai0Var);
        recyclerView.setItemAnimator(null);
        recyclerView.setRecycledViewPool(hVar);
        if (((zxo) h3yVar.get()).c) {
            recyclerView.addItemDecoration(new qai0(e8m.a(8)));
            yln ylnVar = new yln(15, this);
            inflate.addOnLayoutChangeListener(ylnVar);
            this.G = ylnVar;
            pai0Var.x = new vyf0(7, this);
        }
    }

    @Override // com.yandex.bricks.Brick
    public final View getView() {
        return this.K;
    }

    @Override // defpackage.g070
    public final void l(ServerMessageRef serverMessageRef, long j, ArrayList arrayList, UserReaction[] userReactionArr) {
        this.C = arrayList;
        this.D = j;
        this.b.w = new qeg0(1, serverMessageRef, this, userReactionArr);
        s();
    }

    @Override // com.yandex.bricks.Brick, defpackage.ak6
    public final void onBrickAttach() {
        ct21 e;
        Map<String, List<Integer>> reactionsConfig;
        super.onBrickAttach();
        if (this.N == null) {
            yai0 yai0Var = this.a;
            BackendConfig a = yai0Var.c.a();
            if (((zxo) yai0Var.d.get()).c) {
                reactionsConfig = b.n(a.getExtendedReactionsConfig(), b.k(a.getReactionsConfig(), a.getExtendedReactionsConfig().keySet()));
            } else {
                reactionsConfig = a.getReactionsConfig();
            }
            this.N = yai0Var.b.e(yai0Var.a, new sai0(reactionsConfig, this));
        }
        if (this.M == null) {
            q6c0 q6c0Var = this.c;
            LocalMessageRef localMessageRef = (LocalMessageRef) q6c0Var.w;
            if (localMessageRef == null) {
                r();
                e = null;
            } else {
                e = ((com.yandex.messaging.internal.authorized.chat.b) q6c0Var.c).e((ChatRequest) q6c0Var.b, new sai0(localMessageRef, this));
            }
            this.M = e;
        }
        s();
    }

    @Override // com.yandex.bricks.Brick, defpackage.ak6
    public final void onBrickDetach() {
        super.onBrickDetach();
        ct21 ct21Var = this.N;
        if (ct21Var != null) {
            ct21Var.close();
        }
        this.N = null;
        ct21 ct21Var2 = this.M;
        if (ct21Var2 != null) {
            ct21Var2.close();
        }
        this.M = null;
        this.B = null;
        this.C = null;
        EmptyList emptyList = EmptyList.a;
        this.E = emptyList;
        this.F = false;
        yln ylnVar = this.G;
        View view = this.K;
        if (ylnVar != null) {
            view.removeOnLayoutChangeListener(ylnVar);
        }
        this.G = null;
        view.setVisibility(8);
        view.animate().cancel();
        this.b.f(emptyList, false);
    }

    public final void q() {
        int intValue;
        if (this.E.isEmpty()) {
            return;
        }
        boolean z = ((zxo) this.y.get()).c;
        pai0 pai0Var = this.b;
        if (!z) {
            pai0Var.f(this.E, false);
            return;
        }
        int a = e8m.a(48);
        RecyclerView recyclerView = this.L;
        int width = recyclerView.getWidth();
        Integer valueOf = Integer.valueOf(width);
        if (width <= 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            intValue = valueOf.intValue();
        } else {
            View rootView = recyclerView.getRootView();
            Integer valueOf2 = rootView != null ? Integer.valueOf(rootView.getWidth()) : null;
            intValue = valueOf2 != null ? valueOf2.intValue() : 0;
        }
        int paddingRight = intValue - (recyclerView.getPaddingRight() + recyclerView.getPaddingLeft());
        if (paddingRight < 0) {
            paddingRight = 0;
        }
        int i = paddingRight / a;
        if (i < 2) {
            i = 2;
        }
        this.H = i;
        GridLayoutManager gridLayoutManager = this.I;
        if (gridLayoutManager != null) {
            gridLayoutManager.s2(i);
        }
        boolean z2 = this.F;
        List list = this.E;
        if (z2) {
            pai0Var.f(list, false);
            return;
        }
        List list2 = list;
        int i2 = this.H - 1;
        pai0Var.f(a.A0(list2, i2 >= 0 ? i2 : 0), true);
    }

    public final void r() {
        this.K.setVisibility(8);
        g990 g990Var = new g990(25);
        pai0 pai0Var = this.b;
        pai0Var.w = g990Var;
        pai0Var.f(EmptyList.a, false);
    }

    public final void s() {
        ArrayList arrayList;
        Object obj;
        List list = this.B;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            list = null;
        }
        if (list == null || (arrayList = this.C) == null) {
            return;
        }
        if (this.A.c) {
            nai0 nai0Var = this.z;
            Map a = nai0Var.a();
            if (!a.isEmpty()) {
                nai0Var.b.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    int intValue = ((Number) it.next()).intValue();
                    lai0 lai0Var = (lai0) a.get(Integer.valueOf(intValue));
                    double exp = lai0Var != null ? Math.exp(Math.max(0.0d, (currentTimeMillis - lai0Var.b) / 3600000.0d) * (-0.004126d)) * lai0Var.a : 0.0d;
                    if (exp >= 0.01d) {
                        arrayList2.add(new Pair(Integer.valueOf(intValue), Double.valueOf(exp)));
                    } else {
                        arrayList3.add(Integer.valueOf(intValue));
                    }
                }
                List x0 = a.x0(arrayList2, new mai0());
                ArrayList arrayList4 = new ArrayList(tcc.n(x0, 10));
                Iterator it2 = x0.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(Integer.valueOf(((Number) ((Pair) it2.next()).c()).intValue()));
                }
                list = a.m0(arrayList3, arrayList4);
            }
        }
        this.x.getClass();
        List list3 = list;
        ArrayList arrayList5 = new ArrayList(tcc.n(list3, 10));
        Iterator it3 = list3.iterator();
        while (true) {
            boolean z = false;
            if (!it3.hasNext()) {
                break;
            }
            int intValue2 = ((Number) it3.next()).intValue();
            Iterator it4 = arrayList.iterator();
            while (true) {
                if (it4.hasNext()) {
                    obj = it4.next();
                    if (((FullReactionInfo) obj).getType() == intValue2) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            FullReactionInfo fullReactionInfo = (FullReactionInfo) obj;
            int count = fullReactionInfo != null ? fullReactionInfo.getCount() : 0;
            if (fullReactionInfo != null) {
                z = fullReactionInfo.isChecked();
            }
            arrayList5.add(new FullReactionInfo(intValue2, count, z));
        }
        ArrayList arrayList6 = new ArrayList();
        for (Object obj2 : arrayList) {
            FullReactionInfo fullReactionInfo2 = (FullReactionInfo) obj2;
            if (!arrayList5.isEmpty()) {
                Iterator it5 = arrayList5.iterator();
                while (it5.hasNext()) {
                    if (((FullReactionInfo) it5.next()).getType() == fullReactionInfo2.getType()) {
                        break;
                    }
                }
            }
            arrayList6.add(obj2);
        }
        this.E = a.m0(arrayList6, arrayList5);
        q();
        View view = this.K;
        if (view.getVisibility() != 0) {
            view.setAlpha(0.0f);
            view.setVisibility(0);
            view.animate().alpha(1.0f).setDuration(200L).start();
        }
    }
}
