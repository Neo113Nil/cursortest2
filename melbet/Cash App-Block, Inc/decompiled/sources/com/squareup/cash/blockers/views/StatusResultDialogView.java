package com.squareup.cash.blockers.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import app.cash.broadway.ui.Ui;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.R;
import com.squareup.cash.blockers.viewmodels.StatusResultViewModel;
import com.squareup.cash.borrow.views.BulletinTileKt$$ExternalSyntheticLambda12;
import com.squareup.cash.mooncake.components.AlertDialogView;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.protos.franklin.common.StatusResult;
import com.squareup.protos.franklin.common.StatusResultButton;
import defpackage.Drop$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class StatusResultDialogView extends AlertDialogView implements Ui {
    public Ui.EventReceiver eventReceiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatusResultDialogView(Context context) {
        super(context, null, true, 2);
        context.getClass();
    }

    @Override // app.cash.broadway.ui.Ui
    public void setEventReceiver(Ui.EventReceiver eventReceiver) {
        eventReceiver.getClass();
        this.eventReceiver = eventReceiver;
    }

    @Override // app.cash.broadway.ui.Ui
    public void setModel(StatusResultViewModel statusResultViewModel) {
        statusResultViewModel.getClass();
        if (statusResultViewModel instanceof StatusResultViewModel.Ready) {
            StatusResultViewModel.Ready ready = (StatusResultViewModel.Ready) statusResultViewModel;
            StatusResult.Icon icon = ready.icon;
            Drawable drawable = null;
            if (icon != null) {
                switch (icon) {
                    case SUCCESS:
                    case PENDING:
                        Context context = getContext();
                        context.getClass();
                        drawable = PlatformKt.getDrawableCompat(context, R.drawable.checkmark, null);
                        break;
                    case INSTANT:
                        Context context2 = getContext();
                        context2.getClass();
                        drawable = PlatformKt.getDrawableCompat(context2, R.drawable.status_bolt, null);
                        break;
                    case BANK:
                    case ACTION_REQUIRED:
                        Context context3 = getContext();
                        context3.getClass();
                        drawable = PlatformKt.getDrawableCompat(context3, R.drawable.exclamation, null);
                        break;
                    case FAILURE:
                        Context context4 = getContext();
                        context4.getClass();
                        TypedValue typedValue = new TypedValue();
                        getContext().getTheme().resolveAttribute(R.attr.statusResultErrorColor, typedValue, true);
                        drawable = PlatformKt.getDrawableCompat(context4, R.drawable.failed, Integer.valueOf(getContext().getColor(typedValue.resourceId)));
                        break;
                    case VERIFICATION_REQUIRED:
                        Context context5 = getContext();
                        context5.getClass();
                        drawable = PlatformKt.getDrawableCompat(context5, R.drawable.verification_required, null);
                        break;
                    case PACKAGE:
                        Context context6 = getContext();
                        context6.getClass();
                        drawable = PlatformKt.getDrawableCompat(context6, R.drawable.status_card_shipping, Integer.valueOf(ThemeHelpersKt.themeInfo(this).colorPalette.icon));
                        break;
                    case ACCOUNT_LOCKED:
                        Context context7 = getContext();
                        context7.getClass();
                        drawable = PlatformKt.getDrawableCompat(context7, R.drawable.account_locked, null);
                        break;
                    case NONE:
                        break;
                    default:
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                }
            }
            setIcon(drawable);
            setMessage(ready.text);
            setPositiveButton(ready.primaryButton.text, new BulletinTileKt$$ExternalSyntheticLambda12(20, this, ready));
            StatusResultButton statusResultButton = ready.secondaryButton;
            if (statusResultButton != null) {
                setNegativeButton(statusResultButton.text, new BulletinTileKt$$ExternalSyntheticLambda12(21, this, statusResultButton));
            }
        }
    }
}
