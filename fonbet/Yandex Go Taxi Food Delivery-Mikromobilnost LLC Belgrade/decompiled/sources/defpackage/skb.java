package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.x0;
import androidx.recyclerview.widget.y;
import com.yandex.plus.home.common.ui.DisabledEmptyLineClickLinkMovementMethod;

/* loaded from: classes2.dex */
public final class skb extends y {
    public skb() {
        super(qkb.a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        hjb hjbVar = (hjb) getItem(i);
        wv5 wv5Var = ((rkb) x0Var).N;
        kgx[] kgxVarArr = rkb.O;
        ((TextView) wv5Var.a(kgxVarArr[0])).setMovementMethod(new DisabledEmptyLineClickLinkMovementMethod());
        ((TextView) wv5Var.a(kgxVarArr[0])).setText(hjbVar.b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new rkb(LayoutInflater.from(viewGroup.getContext()).inflate(imh0.pay_sdk_item_checkout_legal, viewGroup, false));
    }
}
