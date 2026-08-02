package com.squareup.cash.blockers.views;

import android.content.Context;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import app.cash.broadway.ui.Ui;
import com.squareup.cash.R;
import com.squareup.cash.blockers.viewmodels.FormMenuActionViewModel;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.widget.TextStyles;
import com.squareup.cash.sheet.BottomSheet$$ExternalSyntheticLambda0;
import com.squareup.cash.ui.OutsideTapCloses;
import com.squareup.cash.ui.drawable.DividerDrawable;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.util.Strings;

/* loaded from: classes4.dex */
public final class FormMenuActionView extends LinearLayout implements OutsideTapCloses, Ui {
    public final ColorPalette colorPalette;
    public Ui.EventReceiver eventReceiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FormMenuActionView(Context context) {
        super(context);
        context.getClass();
        ColorPalette colorPalette = ThemeHelpersKt.themeInfo(this).colorPalette;
        this.colorPalette = colorPalette;
        setOrientation(1);
        setShowDividers(2);
        setDividerDrawable(new DividerDrawable(colorPalette.hairline));
    }

    @Override // app.cash.broadway.ui.Ui
    public void setEventReceiver(Ui.EventReceiver eventReceiver) {
        eventReceiver.getClass();
        this.eventReceiver = eventReceiver;
    }

    @Override // app.cash.broadway.ui.Ui
    public void setModel(FormMenuActionViewModel formMenuActionViewModel) {
        formMenuActionViewModel.getClass();
        for (BlockerAction blockerAction : formMenuActionViewModel.actions) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            appCompatTextView.setGravity(17);
            int dimensionPixelSize = appCompatTextView.getResources().getDimensionPixelSize(R.dimen.bottom_sheet_item_padding);
            appCompatTextView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            appCompatTextView.setText(blockerAction.text);
            Strings.applyStyle(appCompatTextView, TextStyles.mainTitle);
            appCompatTextView.setTextColor(this.colorPalette.tertiaryButtonTint);
            addView(appCompatTextView);
            appCompatTextView.setOnClickListener(new BottomSheet$$ExternalSyntheticLambda0(8, this, blockerAction));
        }
    }
}
