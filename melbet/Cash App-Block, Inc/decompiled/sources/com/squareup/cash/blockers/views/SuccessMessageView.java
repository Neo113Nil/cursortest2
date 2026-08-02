package com.squareup.cash.blockers.views;

import android.content.Context;
import app.cash.broadway.ui.Ui;
import coil3.size.DimensionKt;
import com.squareup.cash.R;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.mooncake.components.AlertDialogView;
import com.squareup.cash.mooncake.components.MooncakePillButton;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.ui.OnBackListener;
import kotlin.Unit;

/* loaded from: classes7.dex */
public final class SuccessMessageView extends AlertDialogView implements OnBackListener, Ui {
    public Ui.EventReceiver eventReceiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuccessMessageView(Context context, BlockersScreens.SuccessMessageScreen successMessageScreen) {
        super(context, null, true, 2);
        context.getClass();
        ColorModel colorModel = successMessageScreen.blockersData.accentColor;
        if (colorModel != null) {
            MooncakePillButton mooncakePillButton = this.dialog.buttonsContainer.primary;
            Integer forTheme = DimensionKt.forTheme(colorModel, ThemeHelpersKt.themeInfo(this));
            forTheme.getClass();
            mooncakePillButton.setTextColor(forTheme.intValue());
        }
        String str = successMessageScreen.title;
        if (str != null) {
            setTitle(str);
        }
        setMessage(successMessageScreen.message);
        setPositiveButton(R.string.blockers_success_message_positive, new SsnViewKt$$ExternalSyntheticLambda4(this, 5));
    }

    @Override // com.squareup.cash.ui.OnBackListener
    public final boolean onBack() {
        return true;
    }

    @Override // app.cash.broadway.ui.Ui
    public void setEventReceiver(Ui.EventReceiver eventReceiver) {
        eventReceiver.getClass();
        this.eventReceiver = eventReceiver;
    }

    @Override // app.cash.broadway.ui.Ui
    public void setModel(Unit unit) {
        unit.getClass();
    }
}
