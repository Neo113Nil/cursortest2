package defpackage;

import android.view.ViewGroup;
import androidx.core.view.b;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import com.ybsdk.feature.merchant.offers.internal.view.MerchantOffersBannerView;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.a;

/* loaded from: classes3.dex */
public final class wo10 extends RecyclerView.Adapter {
    public final tls a;
    public final tls b;
    public final to10 c;
    public List w = EmptyList.a;
    public final LinkedHashSet x = new LinkedHashSet();

    public wo10(tls tlsVar, tls tlsVar2, to10 to10Var) {
        this.a = tlsVar;
        this.b = tlsVar2;
        this.c = to10Var;
    }

    public final int f() {
        if (this.w.isEmpty()) {
            return 0;
        }
        return 1073741823 - (1073741823 % this.w.size());
    }

    public final uo10 g(int i) {
        List list = this.w;
        return (uo10) a.S(i % list.size(), list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.w.isEmpty() ? 0 : Integer.MAX_VALUE;
    }

    public final int h() {
        return this.w.size();
    }

    public final void i(List list) {
        LinkedHashSet linkedHashSet = this.x;
        int d = gw00.d(tcc.n(linkedHashSet, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        for (Object obj : linkedHashSet) {
            linkedHashMap.put(obj, g(((Number) obj).intValue()));
        }
        if (list == null) {
            list = EmptyList.a;
        }
        this.w = list;
        int d2 = gw00.d(tcc.n(linkedHashSet, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(d2 >= 16 ? d2 : 16);
        for (Object obj2 : linkedHashSet) {
            linkedHashMap2.put(obj2, g(((Number) obj2).intValue()));
        }
        if (linkedHashSet.isEmpty()) {
            notifyDataSetChanged();
            return;
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            if (!jl40.l(linkedHashMap.get(Integer.valueOf(intValue)), linkedHashMap2.get(Integer.valueOf(intValue)))) {
                notifyItemChanged(intValue);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        vo10 vo10Var = (vo10) x0Var;
        uo10 g = g(i);
        if (g != null) {
            vo10Var.N.render(g);
        }
        this.x.add(Integer.valueOf(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        MerchantOffersBannerView merchantOffersBannerView = new MerchantOffersBannerView(viewGroup.getContext(), null, 0, 6, null);
        merchantOffersBannerView.setOnBannerClickListener(this.b);
        merchantOffersBannerView.setDivActionHandler(this.a);
        merchantOffersBannerView.setLongPressListener(this.c);
        b.p(merchantOffersBannerView, new it4());
        return new vo10(merchantOffersBannerView);
    }
}
