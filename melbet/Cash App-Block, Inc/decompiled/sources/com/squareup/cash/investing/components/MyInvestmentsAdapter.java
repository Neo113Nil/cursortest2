package com.squareup.cash.investing.components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.R;
import com.squareup.cash.composable.adapter.SingleRowAdapter;
import com.squareup.cash.google.pay.RealGooglePayer$$ExternalSyntheticLambda0;
import com.squareup.cash.history.views.SkipPaymentView$$ExternalSyntheticLambda1;
import com.squareup.cash.investing.components.common.InvestingTileHeaderView;
import com.squareup.cash.investing.components.performance.SectionRowView;
import com.squareup.cash.investing.viewmodels.MyInvestmentsContentModel;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.util.android.Views;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class MyInvestmentsAdapter extends SingleRowAdapter {
    public final InvestingHomeView$$ExternalSyntheticLambda2 eventReceiverProducer;

    public MyInvestmentsAdapter(InvestingHomeView$$ExternalSyntheticLambda2 investingHomeView$$ExternalSyntheticLambda2) {
        super(8, true);
        this.eventReceiverProducer = investingHomeView$$ExternalSyntheticLambda2;
    }

    @Override // com.squareup.cash.composable.adapter.SingleRowAdapter
    public final void bind(View view, Object obj) {
        String str;
        int i;
        int i2;
        final MooncakeMyInvestmentsTileView mooncakeMyInvestmentsTileView = (MooncakeMyInvestmentsTileView) view;
        MyInvestmentsContentModel myInvestmentsContentModel = (MyInvestmentsContentModel) obj;
        mooncakeMyInvestmentsTileView.getClass();
        myInvestmentsContentModel.getClass();
        final int i3 = 1;
        mooncakeMyInvestmentsTileView.setRoundedBottomCorners(!myInvestmentsContentModel.getHasHoldings());
        LinearLayout linearLayout = mooncakeMyInvestmentsTileView.statsContainer;
        InvestingTileHeaderView investingTileHeaderView = mooncakeMyInvestmentsTileView.title;
        ColorPalette colorPalette = mooncakeMyInvestmentsTileView.colorPalette;
        LinearLayout linearLayout2 = mooncakeMyInvestmentsTileView.investedLayout;
        AppCompatTextView appCompatTextView = mooncakeMyInvestmentsTileView.investedAmount;
        linearLayout2.removeView(appCompatTextView);
        AppCompatTextView appCompatTextView2 = mooncakeMyInvestmentsTileView.investedLabel;
        linearLayout2.removeView(appCompatTextView2);
        linearLayout2.addView(appCompatTextView);
        linearLayout2.addView(appCompatTextView2);
        CharSequence text = appCompatTextView2.getText();
        CharSequence text2 = appCompatTextView.getText();
        StringBuilder sb = new StringBuilder();
        sb.append((Object) text);
        sb.append((Object) text2);
        linearLayout2.setContentDescription(sb.toString());
        LinearLayout linearLayout3 = mooncakeMyInvestmentsTileView.netProfitLayout;
        AppCompatTextView appCompatTextView3 = mooncakeMyInvestmentsTileView.netProfitAmount;
        linearLayout3.removeView(appCompatTextView3);
        AppCompatTextView appCompatTextView4 = mooncakeMyInvestmentsTileView.netProfitLabel;
        linearLayout3.removeView(appCompatTextView4);
        linearLayout3.addView(appCompatTextView3);
        linearLayout3.addView(appCompatTextView4);
        CharSequence text3 = appCompatTextView4.getText();
        CharSequence text4 = appCompatTextView3.getText();
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) text3);
        sb2.append((Object) text4);
        linearLayout3.setContentDescription(sb2.toString());
        appCompatTextView.setText(myInvestmentsContentModel.getInvestedText());
        if (myInvestmentsContentModel instanceof MyInvestmentsContentModel.UnknownNetProfit) {
            str = "...";
        } else {
            if (!(myInvestmentsContentModel instanceof MyInvestmentsContentModel.KnownNetProfit)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            str = ((MyInvestmentsContentModel.KnownNetProfit) myInvestmentsContentModel).netProfitText;
        }
        appCompatTextView3.setText(str);
        if (myInvestmentsContentModel.isStale()) {
            Context context = mooncakeMyInvestmentsTileView.getContext();
            context.getClass();
            i = context.getColor(R.color.investing_components_stale_data);
        } else {
            i = colorPalette.secondaryLabel;
        }
        appCompatTextView2.setTextColor(i);
        appCompatTextView4.setTextColor(i);
        if (myInvestmentsContentModel.isStale()) {
            Context context2 = mooncakeMyInvestmentsTileView.getContext();
            context2.getClass();
            i2 = context2.getColor(R.color.investing_components_stale_data);
        } else {
            i2 = colorPalette.label;
        }
        appCompatTextView.setTextColor(i2);
        appCompatTextView3.setTextColor(i2);
        investingTileHeaderView.render(myInvestmentsContentModel.getTitle(), null, myInvestmentsContentModel.getShowHeaderAction() ? InvestingTileHeaderView.TileHeaderAction.SHOW_PERFORMANCE : null, InvestingTileHeaderView.TileHeaderDescriptionColor.SECONDARY);
        investingTileHeaderView.setOnActionClickListener(new Function0() { // from class: com.squareup.cash.investing.components.MooncakeMyInvestmentsTileView$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4 = r2;
                MooncakeMyInvestmentsTileView mooncakeMyInvestmentsTileView2 = mooncakeMyInvestmentsTileView;
                switch (i4) {
                    case 0:
                        Function0 function0 = mooncakeMyInvestmentsTileView2.actionClickListener;
                        if (function0 != null) {
                            function0.invoke();
                        }
                        return Unit.INSTANCE;
                    default:
                        int i5 = MooncakeMyInvestmentsTileView.$r8$clinit;
                        Context context3 = mooncakeMyInvestmentsTileView2.getContext();
                        context3.getClass();
                        SectionRowView sectionRowView = new SectionRowView(context3);
                        sectionRowView.setImportantForAccessibility(1);
                        sectionRowView.setFocusableInTouchMode(true);
                        return sectionRowView;
                }
            }
        });
        mooncakeMyInvestmentsTileView.setRoundedBottomCorners(!myInvestmentsContentModel.getHasHoldings());
        linearLayout.setVisibility(myInvestmentsContentModel.getInvestmentStats().isEmpty() ? 8 : 0);
        Views.resizeAndBind$default(linearLayout, myInvestmentsContentModel.getInvestmentStats().size(), null, new Function0() { // from class: com.squareup.cash.investing.components.MooncakeMyInvestmentsTileView$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4 = i3;
                MooncakeMyInvestmentsTileView mooncakeMyInvestmentsTileView2 = mooncakeMyInvestmentsTileView;
                switch (i4) {
                    case 0:
                        Function0 function0 = mooncakeMyInvestmentsTileView2.actionClickListener;
                        if (function0 != null) {
                            function0.invoke();
                        }
                        return Unit.INSTANCE;
                    default:
                        int i5 = MooncakeMyInvestmentsTileView.$r8$clinit;
                        Context context3 = mooncakeMyInvestmentsTileView2.getContext();
                        context3.getClass();
                        SectionRowView sectionRowView = new SectionRowView(context3);
                        sectionRowView.setImportantForAccessibility(1);
                        sectionRowView.setFocusableInTouchMode(true);
                        return sectionRowView;
                }
            }
        }, new SkipPaymentView$$ExternalSyntheticLambda1(15, myInvestmentsContentModel, mooncakeMyInvestmentsTileView), 14);
        mooncakeMyInvestmentsTileView.setActionClickListener(new RealGooglePayer$$ExternalSyntheticLambda0(this, 15));
    }

    @Override // com.squareup.cash.composable.adapter.SingleRowAdapter
    public final View createView(ViewGroup viewGroup) {
        viewGroup.getClass();
        Context context = viewGroup.getContext();
        context.getClass();
        MooncakeMyInvestmentsTileView mooncakeMyInvestmentsTileView = new MooncakeMyInvestmentsTileView(context, null, 2);
        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, -2);
        layoutParams.setMargins(mooncakeMyInvestmentsTileView.getDip(24), 0, mooncakeMyInvestmentsTileView.getDip(24), 0);
        mooncakeMyInvestmentsTileView.setLayoutParams(layoutParams);
        return mooncakeMyInvestmentsTileView;
    }
}
