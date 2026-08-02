package defpackage;

import android.content.Context;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.savings.internal.entities.SavingsClosingVersion;
import com.ybsdk.feature.savings.internal.screens.close.deposit.SavingsAccountCloseDepositParams;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class w3m0 implements ev31 {
    public final Context a;

    public w3m0(Context context) {
        this.a = context;
    }

    @Override // defpackage.ev31
    public final Object q(Object obj) {
        YbButtonView.a aVar;
        s3m0 s3m0Var;
        s3m0 s3m0Var2;
        g3m0 g3m0Var = (g3m0) obj;
        boolean z = g3m0Var.b;
        SavingsAccountCloseDepositParams savingsAccountCloseDepositParams = g3m0Var.a;
        String secondaryButtonTitle = savingsAccountCloseDepositParams.getSecondaryButtonTitle();
        if (secondaryButtonTitle != null) {
            aVar = new YbButtonView.a(g8e.i(Text.Companion, secondaryButtonTitle), null, null, z ? new ColorModel.Attr(ung0.ybColor_button_disabled) : new ColorModel.Attr(ung0.ybColor_button_secondaryNormal), z ? new ColorModel.Attr(ung0.ybColor_textIcon_quaternary) : new ColorModel.Attr(ung0.ybColor_textIcon_primary), null, null, false, false, null, 4070);
        } else {
            aVar = null;
        }
        Text.Constant i = g8e.i(Text.Companion, savingsAccountCloseDepositParams.getTitle());
        Text.Constant constant = new Text.Constant(savingsAccountCloseDepositParams.getSubtitle());
        SavingsClosingVersion version = savingsAccountCloseDepositParams.getVersion();
        int[] iArr = v3m0.a;
        int i2 = iArr[version.ordinal()];
        if (i2 == 1) {
            s3m0Var = new s3m0(new Text.Resource(dzh0.ybsdk_savings_savings_closing_deposit_label_penalty), new Text.Constant(savingsAccountCloseDepositParams.getAmountProfit()), null);
        } else {
            if (i2 != 2) {
                w511.b();
                return null;
            }
            s3m0Var = new s3m0(new Text.Resource(dzh0.ybsdk_savings_savings_savings_closing_deposit_label_penalty_v2), new Text.Constant(savingsAccountCloseDepositParams.getAmountTotal()), new Text.Constant(String.format(this.a.getString(dzh0.ybsdk_savings_savings_closing_deposit_description_penalty_v2), Arrays.copyOf(new Object[]{savingsAccountCloseDepositParams.getAmountPenalty()}, 1))));
        }
        s3m0 s3m0Var3 = s3m0Var;
        int i3 = iArr[savingsAccountCloseDepositParams.getVersion().ordinal()];
        if (i3 == 1) {
            s3m0Var2 = new s3m0(new Text.Resource(dzh0.ybsdk_savings_savings_closing_deposit_label_profit), new Text.Constant(savingsAccountCloseDepositParams.getAmountProfit()), null);
        } else {
            if (i3 != 2) {
                w511.b();
                return null;
            }
            Text.Resource resource = new Text.Resource(dzh0.ybsdk_savings_savings_closing_deposit_label_profit_v2);
            String amountFull = savingsAccountCloseDepositParams.getAmountFull();
            Text constant2 = amountFull != null ? new Text.Constant(amountFull) : Text.Empty.INSTANCE;
            String date = savingsAccountCloseDepositParams.getDate();
            s3m0Var2 = new s3m0(resource, constant2, date != null ? new Text.Constant(date) : null);
        }
        return new t3m0(i, constant, s3m0Var3, s3m0Var2, new YbButtonViewGroup.b(null, new YbButtonView.a(new Text.Constant(savingsAccountCloseDepositParams.getActionButtonTitle()), null, null, null, null, null, null, false, g3m0Var.b, null, 3070), aVar, null, 9));
    }
}
