package defpackage;

import android.content.Context;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.utils.NumberFormatUtils$Currencies;
import com.ybsdk.core.utils.date.YbDateFormat;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.widgets.common.LoadableInput;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import com.ybsdk.widgets.common.g;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class u6m0 implements ev31 {
    public final Context a;
    public final w530 b;
    public final SimpleDateFormat c;
    public final Text.Join w;

    public u6m0(Context context, w530 w530Var) {
        this.a = context;
        this.b = w530Var;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(YbDateFormat.SHORT_USER_DATE_ONLY.getPattern(), Locale.getDefault());
        this.c = simpleDateFormat;
        Text.Resource h = unr0.h(Text.Companion, dzh0.ybsdk_savings_goal_input_prefix_date);
        Calendar calendar = Calendar.getInstance();
        calendar.add(1, 1);
        this.w = new Text.Join(scc.g(h, new Text.Constant(simpleDateFormat.format(calendar.getTime()))), " ");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0039  */
    @Override // defpackage.ev31
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        String str;
        String currency;
        BigDecimal amount;
        BigInteger bigInteger;
        i6m0 i6m0Var = (i6m0) obj;
        MoneyEntity moneyEntity = i6m0Var.f;
        Text text = i6m0Var.a;
        Text text2 = i6m0Var.b;
        String str2 = i6m0Var.d;
        if (str2 == null) {
            Date date = i6m0Var.c;
            str2 = date != null ? this.c.format(date) : null;
            if (str2 == null) {
                str = "";
                LoadableInput.LoadingState loadingState = LoadableInput.LoadingState.DEFAULT;
                Text.Resource h = unr0.h(Text.Companion, dzh0.ybsdk_savings_goal_input_label_date);
                LoadableInput.LabelState labelState = LoadableInput.LabelState.COLLAPSED;
                Text.Join join = (evu0.J(str) ? str : null) == null ? new Text.Join(scc.g(new Text.Resource(dzh0.ybsdk_savings_goal_input_prefix_date), new Text.Constant(" ")), "") : null;
                s6m0 s6m0Var = i6m0Var.e;
                boolean z = s6m0Var == null;
                Text.Resource resource = s6m0Var == null ? s6m0Var.a : null;
                int i = nyg0.ybsdk_background_loadable_input_edit_text;
                Context context = this.a;
                g gVar = new g(str, yxy.a, loadingState, h, this.w, null, z, resource, join, null, false, vng.t(i, context), labelState, 32363520);
                String bigInteger2 = (moneyEntity != null || (amount = moneyEntity.getAmount()) == null || (bigInteger = amount.toBigInteger()) == null) ? null : bigInteger.toString();
                String str3 = bigInteger2 != null ? bigInteger2 : "";
                cyy cyyVar = new cyy(1);
                Text.Resource resource2 = new Text.Resource(dzh0.ybsdk_savings_goal_input_label_amount);
                if (moneyEntity != null || (currency = moneyEntity.getCurrency()) == null || (r0 = this.b.b(currency)) == null) {
                    String symbol = NumberFormatUtils$Currencies.RUB.getSymbol();
                }
                Text.Constant constant = new Text.Constant(symbol);
                s6m0 s6m0Var2 = i6m0Var.h;
                return new r6m0(text, text2, gVar, new g(str3, cyyVar, loadingState, resource2, null, null, s6m0Var2 == null, s6m0Var2 == null ? s6m0Var2.a : null, null, constant, false, vng.t(nyg0.ybsdk_background_loadable_input_edit_text, context), null, 33407488), new YbButtonViewGroup.b(YbButtonViewGroup.Orientation.HORIZONTAL, new YbButtonView.a(new Text.Resource(dzh0.ybsdk_savings_goal_button_save), null, null, null, null, null, null, false, i6m0Var.i, null, 3070), !i6m0Var.k ? new YbButtonView.a(new Text.Resource(dzh0.ybsdk_savings_goal_button_delete), null, null, null, null, null, null, false, i6m0Var.j, null, 3070) : null, null, 8));
            }
        }
        str = str2;
        LoadableInput.LoadingState loadingState2 = LoadableInput.LoadingState.DEFAULT;
        Text.Resource h2 = unr0.h(Text.Companion, dzh0.ybsdk_savings_goal_input_label_date);
        LoadableInput.LabelState labelState2 = LoadableInput.LabelState.COLLAPSED;
        if ((evu0.J(str) ? str : null) == null) {
        }
        s6m0 s6m0Var3 = i6m0Var.e;
        if (s6m0Var3 == null) {
        }
        if (s6m0Var3 == null) {
        }
        int i2 = nyg0.ybsdk_background_loadable_input_edit_text;
        Context context2 = this.a;
        g gVar2 = new g(str, yxy.a, loadingState2, h2, this.w, null, z, resource, join, null, false, vng.t(i2, context2), labelState2, 32363520);
        if (moneyEntity != null) {
        }
        if (bigInteger2 != null) {
        }
        cyy cyyVar2 = new cyy(1);
        Text.Resource resource22 = new Text.Resource(dzh0.ybsdk_savings_goal_input_label_amount);
        if (moneyEntity != null) {
        }
        String symbol2 = NumberFormatUtils$Currencies.RUB.getSymbol();
        Text.Constant constant2 = new Text.Constant(symbol2);
        s6m0 s6m0Var22 = i6m0Var.h;
        return new r6m0(text, text2, gVar2, new g(str3, cyyVar2, loadingState2, resource22, null, null, s6m0Var22 == null, s6m0Var22 == null ? s6m0Var22.a : null, null, constant2, false, vng.t(nyg0.ybsdk_background_loadable_input_edit_text, context2), null, 33407488), new YbButtonViewGroup.b(YbButtonViewGroup.Orientation.HORIZONTAL, new YbButtonView.a(new Text.Resource(dzh0.ybsdk_savings_goal_button_save), null, null, null, null, null, null, false, i6m0Var.i, null, 3070), !i6m0Var.k ? new YbButtonView.a(new Text.Resource(dzh0.ybsdk_savings_goal_button_delete), null, null, null, null, null, null, false, i6m0Var.j, null, 3070) : null, null, 8));
    }
}
