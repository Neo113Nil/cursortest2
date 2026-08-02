package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.SavingsEvents$SavingsAccountCloseAccountBottomSheetType;
import com.ybsdk.core.analytics.generated.delegates.SavingsEvents$SavingsAccountCloseAccountCloseType;
import com.ybsdk.core.analytics.generated.delegates.SavingsEvents$SavingsAccountCloseAccountLeaveType;
import com.ybsdk.core.analytics.generated.delegates.SavingsEvents$SavingsAccountCloseAccountOpenType;
import com.ybsdk.core.design.spans.YbBulletSpan;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.savings.internal.helpers.a;
import com.ybsdk.feature.savings.internal.screens.close.deposit.SavingsAccountCloseDepositParams;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import com.ybsdk.widgets.common.bottomsheet.c;
import com.ybsdk.widgets.common.bottomsheet.d;
import com.ybsdk.widgets.common.bottomsheet.g;
import com.ybsdk.widgets.common.bottomsheet.h;
import com.ybsdk.widgets.common.bottomsheet.l;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlinx.coroutines.flow.e;

/* loaded from: classes3.dex */
public final class q3m0 extends uc5 {
    public static final int J = kp50.r(10);
    public final SavingsAccountCloseDepositParams B;
    public final tfl0 C;
    public final AppAnalyticsReporter D;
    public final w2m0 E;
    public final fdm0 F;
    public final w3m0 G;
    public final mdm0 H;
    public final BottomSheetDialogView.State I;

    public q3m0(SavingsAccountCloseDepositParams savingsAccountCloseDepositParams, tfl0 tfl0Var, Context context, AppAnalyticsReporter appAnalyticsReporter, w2m0 w2m0Var, fdm0 fdm0Var, w3m0 w3m0Var, mdm0 mdm0Var) {
        super(new iik0(27, savingsAccountCloseDepositParams), w3m0Var);
        this.B = savingsAccountCloseDepositParams;
        this.C = tfl0Var;
        this.D = appAnalyticsReporter;
        this.E = w2m0Var;
        this.F = fdm0Var;
        this.G = w3m0Var;
        this.H = mdm0Var;
        pbv pbvVar = new pbv(savingsAccountCloseDepositParams.getImageUrl(), (ccv) null, rev.o, (dcv) null, (vfv) null, 58);
        String string = context.getString(dzh0.ybsdk_savings_savings_closing_deposit_bottom_sheet_subtitle_v2);
        SpannableString spannableString = new SpannableString(String.format(context.getString(dzh0.ybsdk_savings_savings_closing_deposit_bottom_sheet_bullet_balance), Arrays.copyOf(new Object[]{savingsAccountCloseDepositParams.getAmountTotal()}, 1)));
        spannableString.setSpan(new YbBulletSpan(0, 0.0f, 0.0f, 0.0f, 15, null), 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString(String.format(context.getString(dzh0.ybsdk_savings_savings_closing_deposit_bottom_sheet_bullet_interest), Arrays.copyOf(new Object[]{savingsAccountCloseDepositParams.getAmountPenalty()}, 1)));
        spannableString2.setSpan(new YbBulletSpan(0, 0.0f, 0.0f, 0.0f, 15, null), 0, spannableString2.length(), 33);
        SpannableString spannableString3 = new SpannableString(TextUtils.concat(string, "\n\n", spannableString, "\n", spannableString2));
        spannableString3.setSpan(new AbsoluteSizeSpan(kp50.r(10)), string.length() + 1, string.length() + 2, 33);
        this.I = new BottomSheetDialogView.State((d) new BottomSheetDialogView.State.a(unr0.h(Text.Companion, dzh0.ybsdk_savings_savings_closing_deposit_bottom_sheet_title), new Text.Constant(spannableString3), new g(pbvVar, BottomSheetDialogView.State.ImageScale.FIT_START, Integer.valueOf(kp50.r(20)), Integer.valueOf(kp50.r(24)), 8), null, null, null, 56), new YbButtonViewGroup.b(null, new YbButtonView.a(new Text.Resource(dzh0.ybsdk_savings_savings_closing_deposit_bottom_sheet_button_primary_v2), null, null, null, null, null, null, false, false, null, 4094), new YbButtonView.a(new Text.Resource(dzh0.ybsdk_savings_savings_closing_deposit_bottom_sheet_button_secondary_v2), null, null, null, null, null, null, false, false, null, 4094), null, 9), (h) null, false, (BottomSheetDialogView.State.Background) null, (l) null, (p1b) null, false, (c) null, false, (z1x0) null, (z1x0) null, false, false, 65532);
        appAnalyticsReporter.f0.G(SavingsEvents$SavingsAccountCloseAccountOpenType.DEPOSIT, null);
        v4b1.g(pbvVar, context);
        com.ybsdk.core.utils.ext.c.a(e.t(a.f(savingsAccountCloseDepositParams.getAgreementId(), ((a) w2m0Var).h)), ds31.a(this), new v41(20, this));
    }

    public final void b0() {
        rt1 rt1Var = this.D.f0;
        SavingsEvents$SavingsAccountCloseAccountCloseType savingsEvents$SavingsAccountCloseAccountCloseType = SavingsEvents$SavingsAccountCloseAccountCloseType.DEPOSIT;
        LinkedHashMap linkedHashMap = new LinkedHashMap(1);
        if (savingsEvents$SavingsAccountCloseAccountCloseType != null) {
            linkedHashMap.put("type", savingsEvents$SavingsAccountCloseAccountCloseType.getOriginalValue());
        }
        rt1Var.a.a("savings.account.close_account.close", linkedHashMap);
        ((a) this.E).e(this.B.getAgreementId(), this.b.i("IDEMPOTENCY_KEY_FOR_CLOSING"));
    }

    public final void c0() {
        if (((g3m0) X()).b) {
            return;
        }
        rt1 rt1Var = this.D.f0;
        SavingsEvents$SavingsAccountCloseAccountLeaveType savingsEvents$SavingsAccountCloseAccountLeaveType = SavingsEvents$SavingsAccountCloseAccountLeaveType.DEPOSIT;
        LinkedHashMap linkedHashMap = new LinkedHashMap(1);
        if (savingsEvents$SavingsAccountCloseAccountLeaveType != null) {
            linkedHashMap.put("type", savingsEvents$SavingsAccountCloseAccountLeaveType.getOriginalValue());
        }
        rt1Var.a.a("savings.account.close_account.leave", linkedHashMap);
        this.C.e();
    }

    public final void d0() {
        rt1 rt1Var = this.D.f0;
        SavingsEvents$SavingsAccountCloseAccountBottomSheetType savingsEvents$SavingsAccountCloseAccountBottomSheetType = SavingsEvents$SavingsAccountCloseAccountBottomSheetType.DEPOSIT;
        LinkedHashMap linkedHashMap = new LinkedHashMap(1);
        if (savingsEvents$SavingsAccountCloseAccountBottomSheetType != null) {
            linkedHashMap.put("type", savingsEvents$SavingsAccountCloseAccountBottomSheetType.getOriginalValue());
        }
        rt1Var.a.a("savings.account.close_account.bottom_sheet", linkedHashMap);
        Z(new i3m0(this.I));
    }

    public final void e0() {
        if (((g3m0) X()).b) {
            return;
        }
        rt1 rt1Var = this.D.f0;
        SavingsEvents$SavingsAccountCloseAccountLeaveType savingsEvents$SavingsAccountCloseAccountLeaveType = SavingsEvents$SavingsAccountCloseAccountLeaveType.DEPOSIT;
        LinkedHashMap linkedHashMap = new LinkedHashMap(1);
        if (savingsEvents$SavingsAccountCloseAccountLeaveType != null) {
            linkedHashMap.put("type", savingsEvents$SavingsAccountCloseAccountLeaveType.getOriginalValue());
        }
        rt1Var.a.a("savings.account.close_account.leave", linkedHashMap);
        this.C.e();
    }
}
