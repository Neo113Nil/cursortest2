package com.squareup.cash.blockers.views;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import app.cash.broadway.ui.Ui;
import com.squareup.cash.R;
import com.squareup.cash.blockers.viewmodels.PasscodeHelpViewEvent;
import com.squareup.cash.mooncake.components.MooncakePillButton;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.ui.OutsideTapCloses;
import com.squareup.cash.ui.drawable.DividerDrawable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class PasscodeHelpSheet extends LinearLayout implements Ui, OutsideTapCloses {
    public Ui.EventReceiver eventReceiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasscodeHelpSheet(Context context) {
        super(context);
        context.getClass();
        ColorPalette colorPalette = ThemeHelpersKt.themeInfo(this).colorPalette;
        setDividerDrawable(new DividerDrawable(colorPalette.hairline));
        setShowDividers(2);
        final int i = 1;
        setOrientation(1);
        MooncakePillButton.Style style = MooncakePillButton.Style.TERTIARY;
        MooncakePillButton mooncakePillButton = new MooncakePillButton(context, null, null, style, 6, null);
        int dimensionPixelSize = mooncakePillButton.getResources().getDimensionPixelSize(R.dimen.bottom_sheet_item_padding);
        mooncakePillButton.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        mooncakePillButton.setText(R.string.blockers_passcode_help_forgot);
        mooncakePillButton.setTextColor(colorPalette.label);
        final int i2 = 0;
        mooncakePillButton.setOnClickListener(new View.OnClickListener(this) { // from class: com.squareup.cash.blockers.views.PasscodeHelpSheet$$ExternalSyntheticLambda0
            public final /* synthetic */ PasscodeHelpSheet f$0;

            {
                this.f$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                PasscodeHelpSheet passcodeHelpSheet = this.f$0;
                switch (i3) {
                    case 0:
                        Ui.EventReceiver eventReceiver = passcodeHelpSheet.eventReceiver;
                        if (eventReceiver != null) {
                            eventReceiver.sendEvent(PasscodeHelpViewEvent.Forgot.INSTANCE);
                            return;
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                        }
                    default:
                        Ui.EventReceiver eventReceiver2 = passcodeHelpSheet.eventReceiver;
                        if (eventReceiver2 != null) {
                            eventReceiver2.sendEvent(PasscodeHelpViewEvent.Cancel.INSTANCE);
                            return;
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                        }
                }
            }
        });
        MooncakePillButton mooncakePillButton2 = new MooncakePillButton(context, null, null, style, 6, null);
        int dimensionPixelSize2 = mooncakePillButton2.getResources().getDimensionPixelSize(R.dimen.bottom_sheet_item_padding);
        mooncakePillButton2.setPadding(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
        mooncakePillButton2.setText(R.string.cancel);
        mooncakePillButton2.setOnClickListener(new View.OnClickListener(this) { // from class: com.squareup.cash.blockers.views.PasscodeHelpSheet$$ExternalSyntheticLambda0
            public final /* synthetic */ PasscodeHelpSheet f$0;

            {
                this.f$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i;
                PasscodeHelpSheet passcodeHelpSheet = this.f$0;
                switch (i3) {
                    case 0:
                        Ui.EventReceiver eventReceiver = passcodeHelpSheet.eventReceiver;
                        if (eventReceiver != null) {
                            eventReceiver.sendEvent(PasscodeHelpViewEvent.Forgot.INSTANCE);
                            return;
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                        }
                    default:
                        Ui.EventReceiver eventReceiver2 = passcodeHelpSheet.eventReceiver;
                        if (eventReceiver2 != null) {
                            eventReceiver2.sendEvent(PasscodeHelpViewEvent.Cancel.INSTANCE);
                            return;
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                        }
                }
            }
        });
        addView(mooncakePillButton);
        addView(mooncakePillButton2);
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
