package defpackage;

import android.view.View;
import android.widget.TextView;
import com.yandex.mobile.ads.R$id;
import yads.ui3;

/* loaded from: classes7.dex */
public final class uf71 extends p971 {
    public final ui3 N;
    public final TextView O;
    public final TextView P;
    public final TextView Q;

    public uf71(View view, ui3 ui3Var) {
        super(view);
        this.N = ui3Var;
        this.O = (TextView) view.findViewById(R$id.item_name);
        this.P = (TextView) view.findViewById(R$id.item_ad_unit_format);
        this.Q = (TextView) view.findViewById(R$id.item_ad_unit_id);
    }

    @Override // defpackage.p971
    public final void W(zz61 zz61Var) {
        se81 se81Var = (se81) zz61Var;
        this.O.setText(se81Var.a);
        this.P.setText(se81Var.b);
        this.Q.setText(se81Var.c);
        this.a.setOnClickListener(new y7z0(18, this, se81Var));
    }
}
