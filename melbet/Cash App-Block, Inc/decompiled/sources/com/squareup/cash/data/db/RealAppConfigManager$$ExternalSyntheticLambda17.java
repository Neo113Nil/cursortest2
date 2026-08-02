package com.squareup.cash.data.db;

import com.squareup.cash.R;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.franklin.app.BankingConfig;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public final /* synthetic */ class RealAppConfigManager$$ExternalSyntheticLambda17 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RealAppConfigManager f$0;

    public /* synthetic */ RealAppConfigManager$$ExternalSyntheticLambda17(RealAppConfigManager realAppConfigManager, int i) {
        this.$r8$classId = i;
        this.f$0 = realAppConfigManager;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        AndroidStringManager androidStringManager = this.f$0.stringManager;
        String str = (String) obj;
        String str2 = (String) obj2;
        BankingConfig.RecurringDepositsDdaUpsell recurringDepositsDdaUpsell = (BankingConfig.RecurringDepositsDdaUpsell) obj3;
        switch (i) {
            case 0:
                if (str == null) {
                    str = androidStringManager.get(R.string.tab_title_instruments_banking);
                }
                if (str2 == null) {
                    str2 = androidStringManager.get(R.string.profile_balance_subtitle_cash_balance);
                }
                return new com.squareup.cash.db2.BankingConfig(str, str2, recurringDepositsDdaUpsell);
            default:
                if (str == null) {
                    str = androidStringManager.get(R.string.tab_title_instruments_banking);
                }
                if (str2 == null) {
                    str2 = androidStringManager.get(R.string.profile_balance_subtitle_cash_balance);
                }
                return new com.squareup.cash.db2.BankingConfig(str, str2, recurringDepositsDdaUpsell);
        }
    }
}
