package com.squareup.cash.mooncake.resources;

import app.cash.arcade.values.ImageResource;
import app.cash.mooncake.values.MooncakeColors;
import app.cash.mooncake.values.MooncakeImages;
import com.squareup.cash.R;
import com.squareup.cash.mooncake.resourceindex.ColorCodesKt;
import com.squareup.cash.mooncake.themes.MooncakeThemesResourceIndexKt;
import com.squareup.kotterknife.Lazy;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.builders.MapBuilder;

/* loaded from: classes6.dex */
public abstract class ResourcesKt {
    public static final Lazy mooncakeResourceIndex;

    static {
        Pair pair = new Pair(MooncakeImages.activityHeart, Integer.valueOf(R.drawable.activity_heart));
        Pair pair2 = new Pair(MooncakeImages.activityUnreadBadge, Integer.valueOf(R.drawable.activity_unread_badge));
        Pair pair3 = new Pair(MooncakeImages.cardControlQuestion, Integer.valueOf(R.drawable.card_control_question));
        Pair pair4 = new Pair(MooncakeImages.formIconLoyaltyCheckmark, Integer.valueOf(R.drawable.form_icon_loyalty_checkmark));
        Pair pair5 = new Pair(MooncakeImages.iconAlert, Integer.valueOf(R.drawable.activity_icon_desc_alert));
        ImageResource.Id id = MooncakeImages.iconAlertProminent;
        Integer valueOf = Integer.valueOf(R.drawable.ic_red_shield_exclamation);
        Pair pair6 = new Pair(id, valueOf);
        Pair pair7 = new Pair(MooncakeImages.iconBusiness, Integer.valueOf(R.drawable.badge_business_customer));
        Pair pair8 = new Pair(MooncakeImages.iconCard, Integer.valueOf(R.drawable.activity_icon_desc_debit));
        Pair pair9 = new Pair(MooncakeImages.iconClock, Integer.valueOf(R.drawable.activity_icon_desc_clock));
        Pair pair10 = new Pair(MooncakeImages.iconDirectDebit, Integer.valueOf(R.drawable.activity_icon_desc_direct_debit));
        Pair pair11 = new Pair(MooncakeImages.iconDirectDeposit, Integer.valueOf(R.drawable.activity_icon_desc_direct_deposit));
        Pair pair12 = new Pair(MooncakeImages.iconDoubleChevron, Integer.valueOf(R.drawable.activity_icon_desc_skipped));
        ImageResource.Id id2 = MooncakeImages.iconInProgress;
        Integer valueOf2 = Integer.valueOf(R.drawable.receipt_status_pending);
        Pair pair13 = new Pair(id2, valueOf2);
        Pair pair14 = new Pair(MooncakeImages.iconInvesting, Integer.valueOf(R.drawable.activity_icon_desc_invest));
        Pair pair15 = new Pair(MooncakeImages.iconNoSymbol, Integer.valueOf(R.drawable.activity_icon_desc_null));
        Pair pair16 = new Pair(MooncakeImages.iconNote, Integer.valueOf(R.drawable.activity_icon_desc_note));
        Pair pair17 = new Pair(MooncakeImages.iconOnline, Integer.valueOf(R.drawable.activity_icon_desc_online));
        Pair pair18 = new Pair(MooncakeImages.iconPayWithCash, Integer.valueOf(R.drawable.ic_pwc_icon));
        Pair pair19 = new Pair(MooncakeImages.iconQr_code, Integer.valueOf(R.drawable.activity_icon_qr_code));
        Pair pair20 = new Pair(MooncakeImages.iconRecurring, Integer.valueOf(R.drawable.activity_icon_desc_recurring));
        Pair pair21 = new Pair(MooncakeImages.iconReturned, Integer.valueOf(R.drawable.activity_icon_desc_returned));
        Pair pair22 = new Pair(MooncakeImages.iconShield, Integer.valueOf(R.drawable.activity_icon_desc_shield));
        Pair pair23 = new Pair(MooncakeImages.iconShieldCheckmark, Integer.valueOf(R.drawable.ic_green_shield_check));
        Pair pair24 = new Pair(MooncakeImages.iconVerified, Integer.valueOf(R.drawable.badge_verified_customer));
        Pair pair25 = new Pair(MooncakeImages.linkedIcon, Integer.valueOf(R.drawable.linked_icon));
        Pair pair26 = new Pair(MooncakeImages.loyaltyStar, Integer.valueOf(R.drawable.loyalty_star));
        Pair pair27 = new Pair(MooncakeImages.mooncakeSpinner, Integer.valueOf(R.drawable.mooncake_spinner));
        Pair pair28 = new Pair(MooncakeImages.paymentRollupCard, Integer.valueOf(R.drawable.payment_rollup_card_ellipsis));
        Pair pair29 = new Pair(MooncakeImages.paymentRollupInvesting, Integer.valueOf(R.drawable.pending_rollup_investing_squig));
        Pair pair30 = new Pair(MooncakeImages.recurringIcon, Integer.valueOf(R.drawable.recurring_icon));
        Pair pair31 = new Pair(MooncakeImages.referralCodePlaceholderAvatar, Integer.valueOf(R.drawable.referral_code_placeholder_avatar));
        Pair pair32 = new Pair(MooncakeImages.roundUps10dpWith14dpPadding, Integer.valueOf(R.drawable.round_ups_avatar_badge));
        Pair pair33 = new Pair(MooncakeImages.toolbarButtonOverflow, Integer.valueOf(R.drawable.overflow));
        Pair pair34 = new Pair(MooncakeImages.toolbarButtonClose, Integer.valueOf(R.drawable.close_white));
        Pair pair35 = new Pair(MooncakeImages.lightningBoltAvatarBadge, Integer.valueOf(R.drawable.lightning_bolt_avatar_badge));
        Pair pair36 = new Pair(MooncakeImages.headerIconCheckmark, Integer.valueOf(R.drawable.receipt_status_complete));
        Pair pair37 = new Pair(MooncakeImages.headerIconError, Integer.valueOf(R.drawable.receipt_status_failed));
        Pair pair38 = new Pair(MooncakeImages.headerIconInstant, Integer.valueOf(R.drawable.receipt_status_instant));
        Pair pair39 = new Pair(MooncakeImages.headerIconWaiting, valueOf2);
        Pair pair40 = new Pair(MooncakeImages.headerIconReported, Integer.valueOf(R.drawable.receipt_status_reported));
        ImageResource.Id id3 = MooncakeImages.headerIconSecurityShield;
        Integer valueOf3 = Integer.valueOf(R.drawable.receipt_status_security);
        Lazy[] lazyArr = {new Lazy(MapsKt__MapsKt.mapOf(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, pair13, pair14, pair15, pair16, pair17, pair18, pair19, pair20, pair21, pair22, pair23, pair24, pair25, pair26, pair27, pair28, pair29, pair30, pair31, pair32, pair33, pair34, pair35, pair36, pair37, pair38, pair39, pair40, new Pair(id3, valueOf3), new Pair(MooncakeImages.headerIconSkipped, Integer.valueOf(R.drawable.receipt_status_skipped)), new Pair(MooncakeImages.headerIconBlocked, Integer.valueOf(R.drawable.receipt_status_blocked)), new Pair(MooncakeImages.headerIconAlertFilled, valueOf), new Pair(MooncakeImages.receiptButtonIconCheck, Integer.valueOf(R.drawable.receipts_button_icon_check)), new Pair(MooncakeImages.receiptButtonIconHeart, Integer.valueOf(R.drawable.receipt_button_heart)), new Pair(MooncakeImages.receiptButtonIconInstant, Integer.valueOf(R.drawable.receipts_button_icon_instant)), new Pair(MooncakeImages.receiptButtonIconSecurity, valueOf3), new Pair(MooncakeImages.receiptButtonIconSkipped, Integer.valueOf(R.drawable.receipt_button_icon_skipped)), new Pair(MooncakeImages.receiptButtonIconBlocked, Integer.valueOf(R.drawable.receipt_button_icon_blocked)), new Pair(MooncakeImages.sparkleIconGreen, Integer.valueOf(R.drawable.sparkle_stars_green)), new Pair(MooncakeImages.sparkleIconWhite, Integer.valueOf(R.drawable.sparkle_stars_white)), new Pair(MooncakeImages.blockedProminent, Integer.valueOf(R.drawable.ic_red_circle_blocked)), new Pair(MooncakeImages.iconPaymentPlan, Integer.valueOf(R.drawable.activity_icon_desc_pay_in_four)), new Pair(MooncakeImages.paymentPlanOverlay, Integer.valueOf(R.drawable.pay_in_four_avatar_badge))), MapsKt__MapsKt.mapOf(new Pair(MooncakeColors.brightGreenNormal, ColorCodesKt.colorCode(-16726224)), new Pair(MooncakeColors.failed, ColorCodesKt.colorCode(-1748912)), new Pair(MooncakeColors.security, ColorCodesKt.colorCode(-16735249)))), MooncakeThemesResourceIndexKt.mooncakeThemesOnlyResourceIndex};
        MapBuilder mapBuilder = new MapBuilder();
        for (int i = 0; i < 2; i++) {
            mapBuilder.putAll((Map) lazyArr[i].initializer);
        }
        MapBuilder build = mapBuilder.build();
        MapBuilder mapBuilder2 = new MapBuilder();
        for (int i2 = 0; i2 < 2; i2++) {
            mapBuilder2.putAll((Map) lazyArr[i2].value);
        }
        mooncakeResourceIndex = new Lazy(build, mapBuilder2.build());
    }
}
