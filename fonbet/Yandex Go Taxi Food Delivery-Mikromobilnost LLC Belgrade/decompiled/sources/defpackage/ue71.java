package defpackage;

import android.view.View;
import android.widget.TextView;
import com.yandex.mobile.ads.R$id;

/* loaded from: classes7.dex */
public final class ue71 extends p971 {
    public final TextView N;

    public ue71(View view) {
        super(view);
        this.N = (TextView) view.findViewById(R$id.item_text);
    }

    @Override // defpackage.p971
    public final void W(zz61 zz61Var) {
        this.N.setText(((su81) zz61Var).a);
    }
}
