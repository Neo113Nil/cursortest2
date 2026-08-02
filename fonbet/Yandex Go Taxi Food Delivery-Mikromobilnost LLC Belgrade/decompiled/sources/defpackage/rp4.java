package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes2.dex */
public final class rp4 extends op4 {
    public final sls O;
    public final ImageView P;
    public final TextView Q;
    public final ImageView R;
    public final View S;
    public final int T;

    public rp4(View view, sls slsVar) {
        super(view);
        this.O = slsVar;
        this.P = (ImageView) this.N.findViewById(o9h0.paymentsdk_bank_icon);
        this.Q = (TextView) this.N.findViewById(o9h0.paymentsdk_bank_title);
        this.R = (ImageView) this.N.findViewById(o9h0.paymentsdk_bank_radio_button);
        this.S = this.N.findViewById(o9h0.paymentsdk_bank_divider);
        this.N.findViewById(o9h0.paymentsdk_bank_container).setOnClickListener(new tf(11, this));
        this.T = iob1.e(view.getContext().getTheme(), ong0.paymentsdk_newCardIcon);
    }

    @Override // defpackage.op4
    public final void W(int i) {
        View view = this.a;
        Resources resources = view.getResources();
        Resources.Theme theme = view.getContext().getTheme();
        ThreadLocal threadLocal = wuj0.a;
        this.P.setImageDrawable(yma1.b(resources, this.T, theme));
        this.S.setVisibility(8);
        this.Q.setText(view.getResources().getString(ryh0.paymentsdk_sbp_another));
        this.R.setImageResource(exg0.paymentsdk_ic_arrow);
    }
}
