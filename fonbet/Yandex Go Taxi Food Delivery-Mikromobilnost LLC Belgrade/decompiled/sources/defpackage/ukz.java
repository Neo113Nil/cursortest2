package defpackage;

import android.text.SpannedString;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.x0;
import androidx.recyclerview.widget.y;
import java.util.List;

/* loaded from: classes2.dex */
public final class ukz extends y {
    public final tls a;

    public ukz(tls tlsVar) {
        super(new rkz());
        this.a = tlsVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i, List list) {
        if (list.isEmpty()) {
            super.onBindViewHolder(x0Var, i, list);
            return;
        }
        Object obj = list.get(0);
        jzj jzjVar = obj instanceof jzj ? (jzj) obj : null;
        if (jzjVar != null) {
            klz klzVar = (klz) x0Var;
            SpannedString spannedString = jzjVar.b;
            wv5 wv5Var = klzVar.O;
            kgx[] kgxVarArr = klz.P;
            ((TextView) wv5Var.a(kgxVarArr[0])).setText(spannedString);
            bb1.L((TextView) wv5Var.a(kgxVarArr[0]), new vsn(27, klzVar, spannedString));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new klz(LayoutInflater.from(viewGroup.getContext()).inflate(bmh0.plus_debug_panel_item_log, viewGroup, false), this.a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        klz klzVar = (klz) x0Var;
        SpannedString spannedString = ((jzj) getItem(i)).b;
        wv5 wv5Var = klzVar.O;
        kgx[] kgxVarArr = klz.P;
        ((TextView) wv5Var.a(kgxVarArr[0])).setText(spannedString);
        bb1.L((TextView) wv5Var.a(kgxVarArr[0]), new vsn(27, klzVar, spannedString));
    }
}
