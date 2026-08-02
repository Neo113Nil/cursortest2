package com.squareup.cash.blockers.views;

import android.content.Context;
import android.widget.LinearLayout;
import app.cash.broadway.ui.Ui;
import coil3.RealImageLoader;
import com.plaid.internal.Q0$$ExternalSyntheticLambda0;
import com.squareup.cash.blockers.viewmodels.InstrumentSelectionDetailsSheetViewEvent;
import com.squareup.cash.blockers.viewmodels.InstrumentSelectionDetailsSheetViewModel;
import com.squareup.cash.instruments.viewmodels.InstrumentSheetHeaderViewModel;
import com.squareup.cash.instruments.views.InstrumentSheetHeaderView;
import com.squareup.cash.mooncake.components.MooncakeButton;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.theming.RipplesKt;
import com.squareup.cash.sheet.BottomSheet$$ExternalSyntheticLambda0;
import com.squareup.cash.ui.OnBackListener;
import com.squareup.cash.ui.OutsideTapCloses;
import com.squareup.cash.ui.drawable.DividerDrawable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class InstrumentSelectionDetailsSheet extends LinearLayout implements Ui, OnBackListener, OutsideTapCloses {
    public final MooncakeButton closeButton;
    public final MooncakeButton continueButton;
    public Ui.EventReceiver eventReceiver;
    public final InstrumentSheetHeaderView headerView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstrumentSelectionDetailsSheet(Context context, RealImageLoader realImageLoader) {
        super(context);
        context.getClass();
        ColorPalette colorPalette = ThemeHelpersKt.themeInfo(this).colorPalette;
        InstrumentSheetHeaderView instrumentSheetHeaderView = new InstrumentSheetHeaderView(context, realImageLoader);
        this.headerView = instrumentSheetHeaderView;
        MooncakeButton mooncakeButton = new MooncakeButton(context, null);
        mooncakeButton.setTextColor(colorPalette.tertiaryButtonTint);
        int i = colorPalette.elevatedBackground;
        mooncakeButton.setBackground(RipplesKt.createRippleDrawable$default(mooncakeButton, Integer.valueOf(i), 2));
        this.continueButton = mooncakeButton;
        MooncakeButton mooncakeButton2 = new MooncakeButton(context, null);
        mooncakeButton2.setBackground(RipplesKt.createRippleDrawable$default(mooncakeButton2, Integer.valueOf(i), 2));
        this.closeButton = mooncakeButton2;
        setOrientation(1);
        setShowDividers(2);
        setDividerDrawable(new DividerDrawable(colorPalette.hairline));
        addView(instrumentSheetHeaderView);
        addView(mooncakeButton);
        addView(mooncakeButton2);
    }

    @Override // com.squareup.cash.ui.OnBackListener
    public final boolean onBack() {
        Ui.EventReceiver eventReceiver = this.eventReceiver;
        if (eventReceiver != null) {
            eventReceiver.sendEvent(InstrumentSelectionDetailsSheetViewEvent.Close.INSTANCE);
            return true;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
        throw null;
    }

    @Override // app.cash.broadway.ui.Ui
    public void setEventReceiver(Ui.EventReceiver eventReceiver) {
        eventReceiver.getClass();
        this.eventReceiver = eventReceiver;
    }

    @Override // app.cash.broadway.ui.Ui
    public void setModel(InstrumentSelectionDetailsSheetViewModel instrumentSelectionDetailsSheetViewModel) {
        instrumentSelectionDetailsSheetViewModel.getClass();
        this.headerView.setModel(new InstrumentSheetHeaderViewModel(instrumentSelectionDetailsSheetViewModel.avatar, instrumentSelectionDetailsSheetViewModel.title, instrumentSelectionDetailsSheetViewModel.subtitle));
        String str = instrumentSelectionDetailsSheetViewModel.continueButtonText;
        MooncakeButton mooncakeButton = this.continueButton;
        mooncakeButton.setText(str);
        mooncakeButton.setVisibility((str == null || StringsKt.isBlank(str)) ? 8 : 0);
        mooncakeButton.setOnClickListener(new BottomSheet$$ExternalSyntheticLambda0(9, this, instrumentSelectionDetailsSheetViewModel));
        String str2 = instrumentSelectionDetailsSheetViewModel.closeButtonText;
        MooncakeButton mooncakeButton2 = this.closeButton;
        mooncakeButton2.setText(str2);
        mooncakeButton2.setOnClickListener(new Q0$$ExternalSyntheticLambda0(this, 25));
    }
}
