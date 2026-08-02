package com.squareup.cash.mooncake.components;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.foundation.pager.PagerLayoutInfoKt;
import com.squareup.cash.R;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.theming.ThemablesKt;
import com.squareup.util.android.Views;

/* loaded from: classes6.dex */
public final class MooncakeLargeIcon extends AppCompatImageView {
    public final ColorPalette colorPalette;

    public enum Icon {
        /* JADX INFO: Fake field, exist only in values array */
        Increase(new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.status_card_shipping, new SplitButtons$$ExternalSyntheticLambda0(3)), null),
        Success(new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_fg_success_circle, null), new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_bg_circle, null)),
        Instant(new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_fg_instant, null), new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_bg_circle, null)),
        Pending(new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_fg_pending, null), new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_bg_circle, null)),
        Locked(new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_fg_locked, null), new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_bg_circle, null)),
        GreenLockedShield(new MooncakeLargeIcon$DrawableResource$NonTinted(R.drawable.mooncake_large_icon_green_locked_shield), null),
        Verified(new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_fg_success_shield, null), new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_bg_circle, null)),
        Verifying(new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_fg_verifying, null), new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_bg_circle, null)),
        VerificationFailed(new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_fg_shield_alert, null), new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_bg_circle, new SplitButtons$$ExternalSyntheticLambda0(12))),
        /* JADX INFO: Fake field, exist only in values array */
        RedAlertShield(new MooncakeLargeIcon$DrawableResource$NonTinted(R.drawable.mooncake_large_icon_red_alert), null),
        /* JADX INFO: Fake field, exist only in values array */
        Headshot(new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_headshot, null), null),
        /* JADX INFO: Fake field, exist only in values array */
        Files(new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_filepile, null), null),
        Failed(new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_fg_failed, null), new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_bg_circle, new SplitButtons$$ExternalSyntheticLambda0(13))),
        Alert(new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_fg_alert, null), new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_bg_circle, new SplitButtons$$ExternalSyntheticLambda0(14))),
        /* JADX INFO: Fake field, exist only in values array */
        Warning(new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_fg_alert, new SplitButtons$$ExternalSyntheticLambda0(15)), new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_bg_circle, new SplitButtons$$ExternalSyntheticLambda0(16))),
        /* JADX INFO: Fake field, exist only in values array */
        Checkmark(new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_fg_alert, null), new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_bg_shield, new SplitButtons$$ExternalSyntheticLambda0(4))),
        Borrow(new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_fg_borrow, null), new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_bg_circle, null)),
        Recurring(new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_fg_recurring, null), new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_bg_circle, null)),
        Deposit(new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_fg_deposit, null), new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_bg_circle, null)),
        Document(new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_fg_document, null), new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_bg_circle, null)),
        Scribble(new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_fg_scribble, null), new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_bg_circle, null)),
        QRCode(new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_fg_qrcode, null), new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_bg_circle, null)),
        Cvv(new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_fg_cvv, null), new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_bg_circle, null)),
        Calendar(new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_fg_calendar, null), new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_bg_circle, null)),
        Card(new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_fg_card, null), new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_bg_circle, null)),
        Camera(new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_fg_camera, null), new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_bg_circle, null)),
        Bank(new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_fg_bank, null), new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_bg_circle, null)),
        SecurityWarning(new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_fg_alert, null), new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_bg_circle, new SplitButtons$$ExternalSyntheticLambda0(5))),
        Envelope(new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_fg_envelope, null), new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_bg_circle, null)),
        LogoMark(new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_fg_logo, null), new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_bg_circle, null)),
        /* JADX INFO: Fake field, exist only in values array */
        Increase(new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_fg_limits, null), new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_bg_circle, null)),
        InvestingRoundUps(new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_fg_investing_roundups, null), new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_bg_circle, null)),
        Unlock(new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_fg_unlocked, null), new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_bg_circle, null)),
        Family(new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_fg_family, null), new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_bg_circle, null)),
        Investing(new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_fg_investing, null), new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_bg_circle, null)),
        Person(new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_fg_person, null), new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_bg_circle, null)),
        Goal(new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_fg_goal, null), new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_bg_circle, null)),
        Wire(new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_fg_wire, null), new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_bg_circle, null)),
        /* JADX INFO: Fake field, exist only in values array */
        Increase(new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_fg_arrow_up, null), new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_bg_circle, null)),
        /* JADX INFO: Fake field, exist only in values array */
        Checkmark(new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_fg_decrease, null), new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_bg_circle, new SplitButtons$$ExternalSyntheticLambda0(6))),
        Recurring_Double_Arrows(new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_fg_recurring_double_arrows, null), new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_bg_circle, null)),
        /* JADX INFO: Fake field, exist only in values array */
        Checkmark(new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_fg_checkmark, null), new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_bg_circle, null)),
        Globe(new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_fg_globe, null), new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_bg_circle, null)),
        CardTopRightPlus(new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_fg_card_plus_top_right, null), new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_bg_circle, null)),
        CardCheckMark(new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_fg_card_checkmark, null), new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_bg_circle, null)),
        CardExpired(new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_fg_card_expired, null), new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_bg_circle, null)),
        Location(new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_fg_location_marker, null), new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_bg_circle, null)),
        WarningTriangle(new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_fg_warning_triangle, null), new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_bg_circle, null)),
        Declined(new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_fg_declined, null), new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_bg_circle, null)),
        EligibilityWarning(new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_fg_alert, new SplitButtons$$ExternalSyntheticLambda0(7)), new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_bg_circle, new SplitButtons$$ExternalSyntheticLambda0(8))),
        GreenAlert(new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_fg_alert, null), new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_bg_circle, new SplitButtons$$ExternalSyntheticLambda0(9))),
        Dash(new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_fg_dash, null), new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_bg_circle, null)),
        Edit(new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_edit, null), new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_bg_circle, null)),
        Savings(new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.icon_savings_32, null), new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_bg_circle, null)),
        Bitcoin(new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.icon_currency_btc_32, null), new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_bg_circle, null)),
        Clear(new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_clear, new SplitButtons$$ExternalSyntheticLambda0(10)), new MooncakeLargeIcon$DrawableResource$Tinted(R.drawable.mooncake_large_icon_bg_circle, new SplitButtons$$ExternalSyntheticLambda0(11)));

        public final PagerLayoutInfoKt background;
        public final PagerLayoutInfoKt foreground;

        Icon(PagerLayoutInfoKt pagerLayoutInfoKt, MooncakeLargeIcon$DrawableResource$Tinted mooncakeLargeIcon$DrawableResource$Tinted) {
            this.foreground = pagerLayoutInfoKt;
            this.background = mooncakeLargeIcon$DrawableResource$Tinted;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MooncakeLargeIcon(Context context, AttributeSet attributeSet, Icon icon, int i) {
        super(context, attributeSet);
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        icon = (i & 4) != 0 ? null : icon;
        context.getClass();
        this.colorPalette = ThemeHelpersKt.themeInfo(this).colorPalette;
        setLayoutParams(new ViewGroup.LayoutParams(Views.dip((View) this, 58), Views.dip((View) this, 58)));
        if (icon != null) {
            setIcon(icon);
        }
    }

    public final void setIcon(Icon icon) {
        Drawable drawable;
        icon.getClass();
        ColorPalette colorPalette = this.colorPalette;
        int i = colorPalette.tint;
        int contrastAdjustedColor = icon.background != null ? ThemablesKt.contrastAdjustedColor(-1, i, colorPalette.primaryButtonTintInverted) : i;
        PagerLayoutInfoKt pagerLayoutInfoKt = icon.foreground;
        Context context = getContext();
        context.getClass();
        Drawable resolve$components = pagerLayoutInfoKt.resolve$components(context, colorPalette, contrastAdjustedColor);
        PagerLayoutInfoKt pagerLayoutInfoKt2 = icon.background;
        if (pagerLayoutInfoKt2 != null) {
            Context context2 = getContext();
            context2.getClass();
            drawable = pagerLayoutInfoKt2.resolve$components(context2, colorPalette, i);
        } else {
            drawable = null;
        }
        if (drawable != null) {
            resolve$components = new LayerDrawable(new Drawable[]{drawable, resolve$components});
        }
        setImageDrawable(resolve$components);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MooncakeLargeIcon(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, null, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MooncakeLargeIcon(Context context) {
        this(context, null, null, 6);
        context.getClass();
    }
}
