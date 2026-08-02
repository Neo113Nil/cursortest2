package com.squareup.cash.security.views;

import android.content.Context;
import app.cash.broadway.ui.Ui;
import com.squareup.cash.mooncake.components.AlertDialogView;
import com.squareup.cash.mooncake.components.MooncakePillButton;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.security.screens.PasswordDialogScreen;
import com.squareup.cash.security.viewmodels.PasswordDialogViewEvent$ButtonClick;
import com.squareup.cash.security.viewmodels.PasswordDialogViewModel;
import com.squareup.cash.ui.OutsideTapCloses;
import com.squareup.cash.ui.SecureScreen;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class PasswordDialogView extends AlertDialogView implements OutsideTapCloses, SecureScreen, Ui {
    public final ColorPalette colorPalette;
    public Ui.EventReceiver eventReceiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasswordDialogView(Context context) {
        super(context, null, false, 6);
        context.getClass();
        this.colorPalette = ThemeHelpersKt.themeInfo(this).colorPalette;
    }

    public final void applyButtonStyle(MooncakePillButton mooncakePillButton, PasswordDialogScreen.PasswordDialog.Style style) {
        int i;
        int ordinal = style.ordinal();
        ColorPalette colorPalette = this.colorPalette;
        if (ordinal == 0) {
            i = colorPalette.tint;
        } else {
            if (ordinal != 1) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            i = colorPalette.error;
        }
        MooncakePillButton.setColors$default(mooncakePillButton, i, 0, null, 4, null);
    }

    @Override // app.cash.broadway.ui.Ui
    public void setEventReceiver(Ui.EventReceiver eventReceiver) {
        eventReceiver.getClass();
        this.eventReceiver = eventReceiver;
    }

    @Override // app.cash.broadway.ui.Ui
    public void setModel(PasswordDialogViewModel passwordDialogViewModel) {
        passwordDialogViewModel.getClass();
        if (!(passwordDialogViewModel instanceof PasswordDialogViewModel.LoadPasswordDialog)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        PasswordDialogScreen.PasswordDialog passwordDialog = ((PasswordDialogViewModel.LoadPasswordDialog) passwordDialogViewModel).passwordDialog;
        String str = passwordDialog.title;
        if (str != null) {
            setTitle(str);
        }
        String str2 = passwordDialog.message;
        if (str2 != null) {
            setMessage(str2);
        }
        final PasswordDialogScreen.PasswordDialog.Button button = passwordDialog.primaryButton;
        AlertDialogView.Layout layout = this.dialog;
        if (button != null) {
            final int i = 0;
            setPositiveButton(button.title, new Function0(this) { // from class: com.squareup.cash.security.views.PasswordDialogView$$ExternalSyntheticLambda0
                public final /* synthetic */ PasswordDialogView f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i2 = i;
                    PasswordDialogScreen.PasswordDialog.Button button2 = button;
                    PasswordDialogView passwordDialogView = this.f$0;
                    switch (i2) {
                        case 0:
                            Ui.EventReceiver eventReceiver = passwordDialogView.eventReceiver;
                            if (eventReceiver != null) {
                                eventReceiver.sendEvent(new PasswordDialogViewEvent$ButtonClick(button2));
                                return Unit.INSTANCE;
                            }
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                        default:
                            Ui.EventReceiver eventReceiver2 = passwordDialogView.eventReceiver;
                            if (eventReceiver2 != null) {
                                eventReceiver2.sendEvent(new PasswordDialogViewEvent$ButtonClick(button2));
                                return Unit.INSTANCE;
                            }
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                    }
                }
            });
            applyButtonStyle(layout.buttonsContainer.primary, button.style);
        }
        final PasswordDialogScreen.PasswordDialog.Button button2 = passwordDialog.secondaryButton;
        if (button2 != null) {
            final int i2 = 1;
            setNegativeButton(button2.title, new Function0(this) { // from class: com.squareup.cash.security.views.PasswordDialogView$$ExternalSyntheticLambda0
                public final /* synthetic */ PasswordDialogView f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i22 = i2;
                    PasswordDialogScreen.PasswordDialog.Button button22 = button2;
                    PasswordDialogView passwordDialogView = this.f$0;
                    switch (i22) {
                        case 0:
                            Ui.EventReceiver eventReceiver = passwordDialogView.eventReceiver;
                            if (eventReceiver != null) {
                                eventReceiver.sendEvent(new PasswordDialogViewEvent$ButtonClick(button22));
                                return Unit.INSTANCE;
                            }
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                        default:
                            Ui.EventReceiver eventReceiver2 = passwordDialogView.eventReceiver;
                            if (eventReceiver2 != null) {
                                eventReceiver2.sendEvent(new PasswordDialogViewEvent$ButtonClick(button22));
                                return Unit.INSTANCE;
                            }
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                    }
                }
            });
            applyButtonStyle(layout.buttonsContainer.secondary, button2.style);
        }
    }
}
