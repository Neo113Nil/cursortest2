package com.squareup.cash.investing.components.metrics;

import android.content.Context;
import android.widget.LinearLayout;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final /* synthetic */ class FinancialBarGraphKt$$ExternalSyntheticLambda16 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ LinearLayout f$0;

    public /* synthetic */ FinancialBarGraphKt$$ExternalSyntheticLambda16(LinearLayout linearLayout, int i) {
        this.$r8$classId = i;
        this.f$0 = linearLayout;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        LinearLayout linearLayout = this.f$0;
        switch (i) {
            case 0:
                Context context = linearLayout.getContext();
                context.getClass();
                InvestingFinancialGraphBarView investingFinancialGraphBarView = new InvestingFinancialGraphBarView(context, null);
                investingFinancialGraphBarView.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
                return investingFinancialGraphBarView;
            default:
                Context context2 = linearLayout.getContext();
                context2.getClass();
                InvestingEarningsGraphDotView investingEarningsGraphDotView = new InvestingEarningsGraphDotView(context2, null);
                investingEarningsGraphDotView.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
                return investingEarningsGraphDotView;
        }
    }
}
