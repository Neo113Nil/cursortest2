package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.x0;
import androidx.recyclerview.widget.y;

/* loaded from: classes2.dex */
public final class zr60 extends y {
    public zr60() {
        super(xr60.a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        ((TextView) ((yr60) x0Var).N.a(yr60.O[0])).setText(((wr60) getItem(i)).a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new yr60(LayoutInflater.from(viewGroup.getContext()).inflate(imh0.pay_sdk_item_tarifficator_offer_benefit_content, viewGroup, false));
    }
}
