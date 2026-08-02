package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.x0;
import androidx.recyclerview.widget.y;
import com.yandex.plus.ui.core.theme.PlusTheme;

/* loaded from: classes2.dex */
public final class yha0 extends y {
    public final boolean a;
    public final PlusTheme b;
    public final b5d0 c;
    public final tls w;

    public yha0(boolean z, PlusTheme plusTheme, b5d0 b5d0Var, tls tlsVar) {
        super(xha0.a);
        this.a = z;
        this.b = plusTheme;
        this.c = b5d0Var;
        this.w = tlsVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        wha0 wha0Var = (wha0) x0Var;
        if (this.a) {
            wha0Var.W((med0) getItem(i));
        } else {
            wha0Var.W((med0) getCurrentList().get((getCurrentList().size() - 1) - i));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new wha0(this, LayoutInflater.from(viewGroup.getContext()).inflate(hmh0.pay_sdk_item_payment_promo, viewGroup, false));
    }
}
