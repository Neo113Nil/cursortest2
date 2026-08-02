package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import androidx.recyclerview.widget.y;
import com.google.android.material.card.MaterialCardView;
import com.yandex.plus.ui.core.theme.PlusTheme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class qze extends y {
    public final /* synthetic */ int a = 1;
    public final b5d0 b;
    public final Object c;
    public final cms w;

    public qze(b5d0 b5d0Var, n4u0 n4u0Var, wls wlsVar) {
        super(l370.a);
        this.b = b5d0Var;
        this.c = n4u0Var;
        this.w = wlsVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        switch (this.a) {
            case 0:
                return !((nze) getItem(i)).f ? 1 : 0;
            default:
                return super.getItemViewType(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        switch (this.a) {
            case 0:
                pze pzeVar = (pze) x0Var;
                nze nzeVar = (nze) getItem(i);
                ((TextView) pzeVar.Q.a(pze.U[3])).setText(nzeVar.b);
                zr60 zr60Var = pzeVar.S;
                List list = nzeVar.c;
                ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new wr60((CharSequence) it.next()));
                }
                zr60Var.submitList(arrayList);
                wv5 wv5Var = pzeVar.N;
                kgx[] kgxVarArr = pze.U;
                ((Button) wv5Var.a(kgxVarArr[0])).setText(nzeVar.d);
                v3a1.c((TextView) pzeVar.R.a(kgxVarArr[5]), nzeVar.e);
                qze qzeVar = pzeVar.T;
                p8f0 p8f0Var = new p8f0((PlusTheme) qzeVar.c, qzeVar.b, Integer.valueOf(((MaterialCardView) pzeVar.O.a(kgxVarArr[1])).getCardBackgroundColor().getDefaultColor()));
                RecyclerView recyclerView = (RecyclerView) pzeVar.P.a(kgxVarArr[2]);
                recyclerView.setAdapter(p8f0Var);
                recyclerView.addItemDecoration(new q8f0());
                recyclerView.setChildDrawingOrderCallback(new x8e(3));
                List list2 = nzeVar.a;
                ArrayList arrayList2 = p8f0Var.w;
                arrayList2.clear();
                arrayList2.addAll(list2);
                p8f0Var.notifyDataSetChanged();
                break;
            default:
                m370 m370Var = (m370) x0Var;
                jjb jjbVar = (jjb) getItem(i);
                m370Var.N = jjbVar;
                ((TextView) m370Var.O.a(m370.Q[0])).setText(jjbVar.a);
                m9f0 m9f0Var = m370Var.P;
                m9f0Var.c(jjbVar.b);
                m9f0Var.a.setVisibility(0);
                break;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2;
        switch (this.a) {
            case 0:
                LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
                if (i == 0) {
                    i2 = imh0.pay_sdk_item_counter_offer_prioritized;
                } else {
                    if (i != 1) {
                        ny61.r(qv10.g(i, "Unexpected viewType for counter offers adapter: "));
                        return null;
                    }
                    i2 = imh0.pay_sdk_item_counter_offer_default;
                }
                pze pzeVar = new pze(this, from.inflate(i2, viewGroup, false), i == 0);
                bb1.L((Button) pzeVar.N.a(pze.U[0]), new k5(22, this, pzeVar));
                return pzeVar;
            default:
                return new m370(this, LayoutInflater.from(viewGroup.getContext()).inflate(imh0.pay_sdk_item_onsale, viewGroup, false));
        }
    }

    public qze(PlusTheme plusTheme, b5d0 b5d0Var, tls tlsVar) {
        super(oze.a);
        this.c = plusTheme;
        this.b = b5d0Var;
        this.w = tlsVar;
    }
}
