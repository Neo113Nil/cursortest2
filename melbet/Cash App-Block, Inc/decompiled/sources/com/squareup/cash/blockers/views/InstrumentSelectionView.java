package com.squareup.cash.blockers.views;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageButton;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.Ui;
import coil3.RealImageLoader;
import com.google.android.gms.internal.mlkit_genai_prompt.zzage;
import com.plaid.internal.Q0$$ExternalSyntheticLambda0;
import com.squareup.cash.R;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.viewmodels.InstrumentDetailModel$InstrumentDetailListModel;
import com.squareup.cash.blockers.viewmodels.InstrumentDetailModel$InstrumentDetailTextModel;
import com.squareup.cash.blockers.viewmodels.InstrumentSelectionViewEvent;
import com.squareup.cash.blockers.viewmodels.InstrumentSelectionViewModel;
import com.squareup.cash.blockers.viewmodels.SelectedInstrumentModel;
import com.squareup.cash.blockers.views.BlockerLayout;
import com.squareup.cash.mooncake.components.MooncakeLargeIcon;
import com.squareup.cash.mooncake.components.MooncakePillButton;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.widget.TextStyles;
import com.squareup.cash.mooncake.theming.RipplesKt;
import com.squareup.cash.sheet.BottomSheet$$ExternalSyntheticLambda0;
import com.squareup.cash.ui.DialogResultListener;
import com.squareup.cash.ui.widget.text.FigmaTextView;
import com.squareup.cash.util.BackHandlerKt;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.YInt;
import com.squareup.util.Strings;
import com.squareup.util.android.Views;
import com.squareup.wire.ByteArrayProtoReader32;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class InstrumentSelectionView extends BlockerLayout implements Ui, DialogResultListener {
    public final ColorPalette colorPalette;
    public Integer currentSelectedOptionId;
    public Integer currentSelectedSecondaryOptionId;
    public final FigmaTextView detail;
    public final LinearLayout detailRows;
    public Ui.EventReceiver eventReceiver;
    public final FigmaTextView headerView;
    public final MooncakeLargeIcon iconView;
    public final MooncakePillButton nextButton;
    public final SelectedInstrumentView secondarySelectedOption;
    public final SelectedInstrumentView selectedOption;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstrumentSelectionView(Context context, RealImageLoader realImageLoader) {
        super(context);
        context.getClass();
        ColorPalette colorPalette = ThemeHelpersKt.themeInfo(this).colorPalette;
        this.colorPalette = colorPalette;
        MooncakePillButton mooncakePillButton = new MooncakePillButton(context, null, MooncakePillButton.Size.LARGE, MooncakePillButton.Style.PRIMARY, 2, null);
        this.nextButton = mooncakePillButton;
        final int i = 2;
        MooncakeLargeIcon mooncakeLargeIcon = new MooncakeLargeIcon(context, null, MooncakeLargeIcon.Icon.Deposit, 2);
        this.iconView = mooncakeLargeIcon;
        FigmaTextView figmaTextView = new FigmaTextView(context, null, 2, null);
        Strings.applyStyle(figmaTextView, TextStyles.header3);
        figmaTextView.setTextColor(colorPalette.label);
        this.headerView = figmaTextView;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        final int i2 = 1;
        linearLayout.setOrientation(1);
        this.detailRows = linearLayout;
        FigmaTextView figmaTextView2 = new FigmaTextView(context, null, 2, null);
        Strings.applyStyle(figmaTextView2, TextStyles.mainBody);
        figmaTextView2.setTextColor(colorPalette.secondaryLabel);
        this.detail = figmaTextView2;
        SelectedInstrumentView selectedInstrumentView = new SelectedInstrumentView(context, realImageLoader);
        this.selectedOption = selectedInstrumentView;
        SelectedInstrumentView selectedInstrumentView2 = new SelectedInstrumentView(context, realImageLoader);
        this.secondarySelectedOption = selectedInstrumentView2;
        final ContourLayout contourLayout = new ContourLayout(context);
        contourLayout.contourWidthMatchParent();
        contourLayout.contourHeightWrapContent();
        ContourLayout.layoutBy$default(contourLayout, mooncakeLargeIcon, ContourLayout.leftTo(new LabelValueView$$ExternalSyntheticLambda0(15)), ContourLayout.topTo(new LabelValueView$$ExternalSyntheticLambda0(18)));
        ByteArrayProtoReader32 leftTo = ContourLayout.leftTo(new LabelValueView$$ExternalSyntheticLambda0(19));
        leftTo.rightTo(1, new LabelValueView$$ExternalSyntheticLambda0(20));
        ContourLayout.layoutBy$default(contourLayout, figmaTextView, leftTo, ContourLayout.topTo(new Function1() { // from class: com.squareup.cash.blockers.views.InstrumentSelectionView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i3 = i;
                InstrumentSelectionView instrumentSelectionView = this;
                ContourLayout contourLayout2 = contourLayout;
                ((ContourLayout.LayoutSpec) obj).getClass();
                switch (i3) {
                    case 0:
                        return new YInt(contourLayout2.getDip(20) + contourLayout2.m3810bottomdBGyhoQ(instrumentSelectionView.headerView));
                    case 1:
                        return new YInt(contourLayout2.getDip(16) + contourLayout2.m3810bottomdBGyhoQ(instrumentSelectionView.headerView));
                    default:
                        return new YInt(contourLayout2.m3814getYdipdBGyhoQ(16) + contourLayout2.m3810bottomdBGyhoQ(instrumentSelectionView.iconView));
                }
            }
        }));
        ByteArrayProtoReader32 leftTo2 = ContourLayout.leftTo(new LabelValueView$$ExternalSyntheticLambda0(21));
        leftTo2.rightTo(1, new LabelValueView$$ExternalSyntheticLambda0(22));
        ContourLayout.layoutBy$default(contourLayout, figmaTextView2, leftTo2, ContourLayout.topTo(new Function1() { // from class: com.squareup.cash.blockers.views.InstrumentSelectionView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i3 = i2;
                InstrumentSelectionView instrumentSelectionView = this;
                ContourLayout contourLayout2 = contourLayout;
                ((ContourLayout.LayoutSpec) obj).getClass();
                switch (i3) {
                    case 0:
                        return new YInt(contourLayout2.getDip(20) + contourLayout2.m3810bottomdBGyhoQ(instrumentSelectionView.headerView));
                    case 1:
                        return new YInt(contourLayout2.getDip(16) + contourLayout2.m3810bottomdBGyhoQ(instrumentSelectionView.headerView));
                    default:
                        return new YInt(contourLayout2.m3814getYdipdBGyhoQ(16) + contourLayout2.m3810bottomdBGyhoQ(instrumentSelectionView.iconView));
                }
            }
        }));
        ByteArrayProtoReader32 leftTo3 = ContourLayout.leftTo(new LabelValueView$$ExternalSyntheticLambda0(16));
        leftTo3.rightTo(1, new LabelValueView$$ExternalSyntheticLambda0(17));
        final int i3 = 0;
        ContourLayout.layoutBy$default(contourLayout, linearLayout, leftTo3, ContourLayout.topTo(new Function1() { // from class: com.squareup.cash.blockers.views.InstrumentSelectionView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i32 = i3;
                InstrumentSelectionView instrumentSelectionView = this;
                ContourLayout contourLayout2 = contourLayout;
                ((ContourLayout.LayoutSpec) obj).getClass();
                switch (i32) {
                    case 0:
                        return new YInt(contourLayout2.getDip(20) + contourLayout2.m3810bottomdBGyhoQ(instrumentSelectionView.headerView));
                    case 1:
                        return new YInt(contourLayout2.getDip(16) + contourLayout2.m3810bottomdBGyhoQ(instrumentSelectionView.headerView));
                    default:
                        return new YInt(contourLayout2.m3814getYdipdBGyhoQ(16) + contourLayout2.m3810bottomdBGyhoQ(instrumentSelectionView.iconView));
                }
            }
        }));
        linearLayout.setPadding(0, contourLayout.getDip(4), 0, contourLayout.getDip(4));
        setId(R.id.blocker_instrument_selection_view);
        BackHandlerKt.setBackHandler(this, new InstrumentSelectionView$$ExternalSyntheticLambda2(this, 0));
        AppCompatImageButton appCompatImageButton = this.closeButton;
        if (appCompatImageButton == null) {
            Context context2 = getContext();
            context2.getClass();
            AppCompatImageButton appCompatImageButton2 = new AppCompatImageButton(context2);
            appCompatImageButton2.setImageResource(R.drawable.close_black);
            appCompatImageButton2.setColorFilter(ThemeHelpersKt.findThemeInfo(context2).colorPalette.icon);
            appCompatImageButton2.setBackground(RipplesKt.createBorderlessRippleDrawable(appCompatImageButton2));
            appCompatImageButton2.setContentDescription(context2.getString(R.string.close));
            this.closeButton = appCompatImageButton2;
            addView(appCompatImageButton2);
            appCompatImageButton = appCompatImageButton2;
        }
        appCompatImageButton.setOnClickListener(new Q0$$ExternalSyntheticLambda0(this, 27));
        verticallyLayoutInto(this.contentLayout, (BlockerLayout.Element[]) Arrays.copyOf(new BlockerLayout.Element[]{new BlockerLayout.Element.Field(contourLayout)}, 1));
        setFooterContent(new BlockerLayout.Element.Field(selectedInstrumentView), new BlockerLayout.Element.Spacer(), new BlockerLayout.Element.Field(selectedInstrumentView2), new BlockerLayout.Element.Spacer(), new BlockerLayout.Element.Field(mooncakePillButton));
        mooncakePillButton.setVisibility(8);
    }

    public final void handleClickEvents(View view, boolean z, InstrumentSelectionViewEvent instrumentSelectionViewEvent) {
        if (z) {
            view.setBackground(RipplesKt.createRippleDrawable$default(view, null, 3));
            view.setOnClickListener(new InstrumentSelectionView$$ExternalSyntheticLambda17(this, instrumentSelectionViewEvent, 1));
        } else {
            view.setBackground(null);
            view.setOnClickListener(null);
            view.setClickable(false);
        }
    }

    @Override // com.squareup.cash.ui.DialogResultListener
    public final void onDialogCanceled(Screen screen) {
        screen.getClass();
    }

    @Override // com.squareup.cash.ui.DialogResultListener
    public final void onDialogResult(Screen screen, Object obj) {
        screen.getClass();
        if (screen instanceof BlockersScreens.InstrumentSelectionListScreen) {
            obj.getClass();
            InstrumentSelectionViewEvent.NewInstrumentSelected newInstrumentSelected = new InstrumentSelectionViewEvent.NewInstrumentSelected(((BlockersScreens.InstrumentSelectionListScreen.InstrumentResult) obj).id, ((BlockersScreens.InstrumentSelectionListScreen) screen).isSecondaryOption);
            Ui.EventReceiver eventReceiver = this.eventReceiver;
            if (eventReceiver == null) {
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
            }
            eventReceiver.sendEvent(newInstrumentSelected);
        }
        if (screen instanceof BlockersScreens.InstrumentSelectionDetailsScreen) {
            obj.getClass();
            BlockersScreens.InstrumentSelectionDetailsScreen.Result result = (BlockersScreens.InstrumentSelectionDetailsScreen.Result) obj;
            if (result.equals(BlockersScreens.InstrumentSelectionDetailsScreen.Result.Cancel.INSTANCE)) {
                Ui.EventReceiver eventReceiver2 = this.eventReceiver;
                if (eventReceiver2 != null) {
                    eventReceiver2.sendEvent(new InstrumentSelectionViewEvent.DismissInstrumentDetails(((BlockersScreens.InstrumentSelectionDetailsScreen) screen).isSecondaryOption));
                    return;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                    throw null;
                }
            }
            if (!(result instanceof BlockersScreens.InstrumentSelectionDetailsScreen.Result.InstrumentResult)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            Ui.EventReceiver eventReceiver3 = this.eventReceiver;
            if (eventReceiver3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
            }
            BlockersScreens.InstrumentSelectionDetailsScreen.Result.InstrumentResult instrumentResult = (BlockersScreens.InstrumentSelectionDetailsScreen.Result.InstrumentResult) result;
            eventReceiver3.sendEvent(new InstrumentSelectionViewEvent.InstrumentDetailActionRequested(instrumentResult.id, ((BlockersScreens.InstrumentSelectionDetailsScreen) screen).isSecondaryOption, instrumentResult.blockerAction));
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        parcelable.getClass();
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("super_state"));
        if (bundle.containsKey("selected_id")) {
            int i = bundle.getInt("selected_id");
            this.currentSelectedOptionId = Integer.valueOf(i);
            Ui.EventReceiver eventReceiver = this.eventReceiver;
            if (eventReceiver == null) {
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
            }
            eventReceiver.sendEvent(new InstrumentSelectionViewEvent.NewInstrumentSelected(i, false));
        }
        if (bundle.containsKey("secondary_selected_id")) {
            int i2 = bundle.getInt("secondary_selected_id");
            this.currentSelectedSecondaryOptionId = Integer.valueOf(i2);
            Ui.EventReceiver eventReceiver2 = this.eventReceiver;
            if (eventReceiver2 != null) {
                eventReceiver2.sendEvent(new InstrumentSelectionViewEvent.NewInstrumentSelected(i2, true));
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("super_state", onSaveInstanceState);
        Integer num = this.currentSelectedOptionId;
        if (num != null) {
            bundle.putInt("selected_id", num.intValue());
        }
        Integer num2 = this.currentSelectedSecondaryOptionId;
        if (num2 != null) {
            bundle.putInt("secondary_selected_id", num2.intValue());
        }
        return bundle;
    }

    @Override // app.cash.broadway.ui.Ui
    public void setEventReceiver(Ui.EventReceiver eventReceiver) {
        eventReceiver.getClass();
        this.eventReceiver = eventReceiver;
    }

    @Override // app.cash.broadway.ui.Ui
    public void setModel(InstrumentSelectionViewModel instrumentSelectionViewModel) {
        instrumentSelectionViewModel.getClass();
        boolean z = instrumentSelectionViewModel instanceof InstrumentSelectionViewModel.Submitting;
        setLoading(z);
        int i = z ? 8 : 0;
        SelectedInstrumentView selectedInstrumentView = this.selectedOption;
        selectedInstrumentView.setVisibility(i);
        int i2 = z ? 8 : 0;
        SelectedInstrumentView selectedInstrumentView2 = this.secondarySelectedOption;
        selectedInstrumentView2.setVisibility(i2);
        if (instrumentSelectionViewModel instanceof InstrumentSelectionViewModel.Selecting) {
            InstrumentSelectionViewModel.Selecting selecting = (InstrumentSelectionViewModel.Selecting) instrumentSelectionViewModel;
            SelectedInstrumentModel selectedInstrumentModel = selecting.selectedInstrument;
            this.currentSelectedOptionId = Integer.valueOf(selectedInstrumentModel.id);
            SelectedInstrumentModel selectedInstrumentModel2 = selecting.secondarySelectedInstrument;
            this.currentSelectedSecondaryOptionId = selectedInstrumentModel2 != null ? Integer.valueOf(selectedInstrumentModel2.id) : null;
            this.headerView.setText(selecting.headerText);
            zzage zzageVar = selecting.details;
            boolean z2 = zzageVar instanceof InstrumentDetailModel$InstrumentDetailTextModel;
            FigmaTextView figmaTextView = this.detail;
            LinearLayout linearLayout = this.detailRows;
            if (z2) {
                linearLayout.setVisibility(8);
                InstrumentDetailModel$InstrumentDetailTextModel instrumentDetailModel$InstrumentDetailTextModel = (InstrumentDetailModel$InstrumentDetailTextModel) zzageVar;
                boolean z3 = instrumentDetailModel$InstrumentDetailTextModel.hasDialog;
                String str = instrumentDetailModel$InstrumentDetailTextModel.text;
                figmaTextView.setVisibility(!StringsKt.isBlank(str) ? 0 : 8);
                figmaTextView.setText(SsnViewKt.access$renderClickableDetail(this, str, z3, this.colorPalette.secondaryIcon, new Size(Views.dip((View) this, 6), Views.dip((View) this, 8))));
                handleClickEvents(figmaTextView, z3, InstrumentSelectionViewEvent.DetailTextClicked.INSTANCE);
            } else if (zzageVar instanceof InstrumentDetailModel$InstrumentDetailListModel) {
                figmaTextView.setVisibility(8);
                ArrayList arrayList = ((InstrumentDetailModel$InstrumentDetailListModel) zzageVar).detailRows;
                linearLayout.setVisibility(!arrayList.isEmpty() ? 0 : 8);
                Views.resizeAndBind$default(linearLayout, arrayList.size(), Integer.valueOf(Views.dip((View) this, 8)), new InstrumentSelectionView$$ExternalSyntheticLambda2(this, 1), new SetPinViewKt$$ExternalSyntheticLambda2(16, zzageVar, this), 6);
            } else {
                figmaTextView.setVisibility(8);
                linearLayout.setVisibility(8);
            }
            selectedInstrumentView.setModel(selectedInstrumentModel);
            selectedInstrumentView.setOnClickListener(new BottomSheet$$ExternalSyntheticLambda0(11, selecting, this));
            if (selectedInstrumentModel2 != null) {
                selectedInstrumentView2.setModel(selectedInstrumentModel2);
                selectedInstrumentView2.setOnClickListener(new BottomSheet$$ExternalSyntheticLambda0(12, selectedInstrumentModel2, this));
            }
            selectedInstrumentView2.setVisibility(selectedInstrumentModel2 != null ? 0 : 8);
            String str2 = selecting.submitButtonTitle;
            MooncakePillButton mooncakePillButton = this.nextButton;
            mooncakePillButton.setText(str2);
            mooncakePillButton.setVisibility(0);
            InstrumentSelectionViewEvent instrumentSelectionViewEvent = selecting.submitButtonAction;
            if (instrumentSelectionViewEvent == null) {
                mooncakePillButton.setEnabled(false);
            } else {
                mooncakePillButton.setEnabled(true);
                mooncakePillButton.setOnClickListener(new InstrumentSelectionView$$ExternalSyntheticLambda17(this, instrumentSelectionViewEvent, 0));
            }
        }
    }
}
