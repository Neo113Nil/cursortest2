package com.squareup.cash.buynowpaylater.views;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import app.cash.broadway.ui.Ui;
import com.plaid.internal.Q0$$ExternalSyntheticLambda0;
import com.squareup.cash.R;
import com.squareup.cash.buynowpaylater.viewmodels.OverflowActionsModel;
import com.squareup.cash.buynowpaylater.viewmodels.TextModel;
import com.squareup.cash.calendar.views.CalendarRowKt$$ExternalSyntheticLambda10;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.widget.TextStyles;
import com.squareup.cash.sheet.BottomSheet$$ExternalSyntheticLambda0;
import com.squareup.cash.ui.OutsideTapCloses;
import com.squareup.cash.ui.drawable.DividerDrawable;
import com.squareup.cash.ui.widget.text.FigmaTextView;
import com.squareup.util.Strings;
import com.squareup.util.android.Views;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class AfterPayOrderDetailsOverflowSheetView extends LinearLayout implements OutsideTapCloses, Ui {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final ColorPalette colorPalette;
    public Ui.EventReceiver eventReceiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AfterPayOrderDetailsOverflowSheetView(Context context) {
        super(context);
        context.getClass();
        ColorPalette colorPalette = ThemeHelpersKt.themeInfo(this).colorPalette;
        this.colorPalette = colorPalette;
        setBackgroundColor(colorPalette.elevatedBackground);
        setOrientation(1);
    }

    public final FigmaTextView createOverflowItemView() {
        Context context = getContext();
        context.getClass();
        FigmaTextView figmaTextView = new FigmaTextView(context, null, 2, null);
        Strings.applyStyle(figmaTextView, TextStyles.mainTitle);
        figmaTextView.setTextColor(this.colorPalette.label);
        figmaTextView.setGravity(17);
        figmaTextView.setPadding(Views.dip((View) figmaTextView, 16), Views.dip((View) figmaTextView, 16), Views.dip((View) figmaTextView, 16), Views.dip((View) figmaTextView, 16));
        return figmaTextView;
    }

    @Override // app.cash.broadway.ui.Ui
    public void setEventReceiver(Ui.EventReceiver eventReceiver) {
        eventReceiver.getClass();
        this.eventReceiver = eventReceiver;
    }

    @Override // app.cash.broadway.ui.Ui
    public void setModel(List<OverflowActionsModel> list) {
        list.getClass();
        removeAllViews();
        Iterator<T> it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            ColorPalette colorPalette = this.colorPalette;
            if (!hasNext) {
                FigmaTextView createOverflowItemView = createOverflowItemView();
                createOverflowItemView.setTextColor(colorPalette.label);
                createOverflowItemView.setText(createOverflowItemView.getContext().getString(R.string.close));
                createOverflowItemView.setOnClickListener(new Q0$$ExternalSyntheticLambda0(this, 29));
                addView(createOverflowItemView);
                return;
            }
            OverflowActionsModel overflowActionsModel = (OverflowActionsModel) it.next();
            FigmaTextView createOverflowItemView2 = createOverflowItemView();
            createOverflowItemView2.setTextColor(colorPalette.green);
            TextModel textModel = overflowActionsModel.title;
            if (textModel != null) {
                ImageUtilsKt.applyTextModel(createOverflowItemView2, textModel, new CalendarRowKt$$ExternalSyntheticLambda10(14));
            }
            createOverflowItemView2.setOnClickListener(new BottomSheet$$ExternalSyntheticLambda0(13, overflowActionsModel, this));
            addView(createOverflowItemView2);
            AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
            appCompatImageView.setBackground(new DividerDrawable(colorPalette.hairline));
            addView(appCompatImageView);
        }
    }
}
