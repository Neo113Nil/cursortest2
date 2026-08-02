package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.NumberFormatUtils$Currencies;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.widgets.common.LoadableInput;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import com.ybsdk.widgets.common.c;
import com.ybsdk.widgets.common.d;
import com.ybsdk.widgets.common.g;
import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: classes3.dex */
public final class vns implements ev31 {
    public final Context a;

    public vns(Context context) {
        this.a = context;
    }

    @Override // defpackage.ev31
    public final Object q(Object obj) {
        ahq0 ahq0Var;
        String b;
        String formattedAmount;
        BigInteger bigInteger;
        ins insVar = (ins) obj;
        hns hnsVar = insVar.c;
        gns gnsVar = insVar.d;
        fns fnsVar = insVar.b;
        if (fnsVar != null) {
            return new tns(new d(fnsVar.a, fnsVar.b, true));
        }
        Text.Constant constant = null;
        if (gnsVar == null) {
            return hnsVar != null ? new qns(new c(hnsVar.b, hnsVar.c, new bks(hnsVar.d, null, 6), true, new YbButtonViewGroup.b(null, new YbButtonView.a(hnsVar.e.a, null, null, null, null, null, null, false, false, null, 4094), null, null, 13))) : new sns(r501.a(insVar.a, null, null, null, null, null, null, null, null, null, null, null, null, 65534));
        }
        h5a0 h5a0Var = gnsVar.f;
        MoneyEntity moneyEntity = gnsVar.e;
        BigDecimal amount = moneyEntity != null ? moneyEntity.getAmount() : null;
        String bigInteger2 = (amount == null || (bigInteger = amount.toBigInteger()) == null) ? null : bigInteger.toString();
        if (bigInteger2 == null) {
            bigInteger2 = "";
        }
        String str = bigInteger2;
        Text text = gnsVar.a;
        Text text2 = gnsVar.b;
        Context context = this.a;
        if (h5a0Var != null) {
            boolean z = gnsVar.i.a.size() > 1;
            Text title = h5a0Var.getTitle();
            if (title == null) {
                title = Text.Empty.INSTANCE;
            }
            Text text3 = title;
            Text.Resource h = unr0.h(Text.Companion, dzh0.ybsdk_deposit_deposit_payment_method_title);
            MoneyEntity amount2 = h5a0Var.getAmount();
            ahq0Var = new ahq0(z, h5a0Var.a(context), text3, (amount2 == null || (formattedAmount = amount2.getFormattedAmount()) == null) ? null : com.ybsdk.core.utils.text.d.e(formattedAmount), h, (Text.Resource) null, 0, (ColorModel) null, 480);
        } else {
            ahq0Var = ahq0.j;
        }
        ahq0 ahq0Var2 = ahq0Var;
        g gVar = g.z;
        Text.Resource h2 = unr0.h(Text.Companion, dzh0.ybsdk_savings_fund_open_and_topup_money_input_label);
        cyy cyyVar = new cyy(true, false);
        LoadableInput.LoadingState loadingState = LoadableInput.LoadingState.DEFAULT;
        Text.Constant constant2 = evu0.J(str) ? null : new Text.Constant(NumberFormatUtils$Currencies.RUB.getSymbol());
        Drawable t = vng.t(nyg0.ybsdk_background_loadable_input_edit_text, context);
        Text.Constant constant3 = new Text.Constant(g8e.o("0 ", NumberFormatUtils$Currencies.RUB.getSymbol()));
        Text text4 = gnsVar.k;
        g a = g.a(gVar, str, cyyVar, false, loadingState, h2, constant3, null, text4 != null, text4, null, constant2, false, t, null, false, 0, text4 != null, 0, 0, null, null, null, 33374788);
        rr51 rr51Var = gnsVar.d;
        YbButtonView.a aVar = new YbButtonView.a(gnsVar.h, null, null, null, null, null, null, false, false, null, 4094);
        if (h5a0Var != null && (b = h5a0Var.b()) != null) {
            constant = com.ybsdk.core.utils.text.d.e(b);
        }
        return new pns(text, text2, ahq0Var2, a, new YbButtonViewGroup.b(null, aVar, null, new YbButtonViewGroup.a(constant, 6), 5), rr51Var);
    }
}
