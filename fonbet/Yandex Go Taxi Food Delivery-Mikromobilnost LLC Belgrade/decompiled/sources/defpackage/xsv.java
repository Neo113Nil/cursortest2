package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.x0;
import androidx.recyclerview.widget.y;
import kotlin.Pair;

/* loaded from: classes2.dex */
public final class xsv extends y {
    public xsv() {
        super(vsv.a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        wsv wsvVar = (wsv) x0Var;
        Pair pair = (Pair) getItem(i);
        String str = (String) pair.c();
        String str2 = (String) pair.f();
        wv5 wv5Var = wsvVar.N;
        kgx[] kgxVarArr = wsv.P;
        ((TextView) wv5Var.a(kgxVarArr[0])).setText(str);
        ((TextView) wsvVar.O.a(kgxVarArr[1])).setText(str2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new wsv(LayoutInflater.from(viewGroup.getContext()).inflate(gmh0.pay_sdk_item_debug_info, viewGroup, false));
    }
}
