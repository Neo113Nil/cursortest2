package com.squareup.cash.formview.components.arcade;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda26;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.AsyncImageKt;
import com.google.accompanist.drawablepainter.DrawablePainterKt;
import com.google.android.gms.internal.mlkit_genai_prompt.zzacp;
import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.R;
import com.squareup.cash.afterpayapplet.views.AfterpaySearchViewKt$$ExternalSyntheticLambda50;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.dialog.ArcadeModal$$ExternalSyntheticLambda5;
import com.squareup.cash.formview.components.FormElementViewBuilder$toView$24;
import com.squareup.cash.formview.components.FormRemoteImageKt$$ExternalSyntheticLambda0;
import com.squareup.cash.formview.components.SelectableRowElementIconResolverKt$WhenMappings;
import com.squareup.cash.formview.components.arcade.SelectableRowViewModel;
import com.squareup.cash.formview.viewevents.api.FormViewEvent;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda4;
import com.squareup.cash.mooncake.compose_ui.ComposeUtilsKt;
import com.squareup.cash.ui.drawable.NumberedBulletDrawable;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.cash.ui.widget.StackedAvatarViewModelKt;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.util.cash.Countries;
import com.squareup.workflow1.Worker;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes6.dex */
public final class ArcadeSelectableRow extends AbstractComposeView {
    public final RealImageLoader imageLoader;
    public final SelectableRowViewModel model;
    public final FormElementViewBuilder$toView$24 onEvent;

    /* loaded from: classes8.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[FormBlocker.Element.SelectableRowElement.DetailTextStyle.values().length];
            try {
                iArr[FormBlocker.Element.SelectableRowElement.DetailTextStyle.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FormBlocker.Element.SelectableRowElement.DetailTextStyle.CRITICAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FormBlocker.Element.SelectableRowElement.DetailTextStyle.LABEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FormBlocker.Element.SelectableRowElement.DetailTextStyle.WARNING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FormBlocker.Element.SelectableRowElement.Icon.values().length];
            try {
                iArr2[FormBlocker.Element.SelectableRowElement.Icon.NUMBER_ONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[FormBlocker.Element.SelectableRowElement.Icon.NUMBER_TWO.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[FormBlocker.Element.SelectableRowElement.Icon.NUMBER_THREE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[FormBlocker.Element.SelectableRowElement.Icon.NUMBER_FOUR.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[FormBlocker.Element.SelectableRowElement.Icon.NUMBER_FIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[FormBlocker.Element.SelectableRowElement.Icon.NUMBER_SIX.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[FormBlocker.Element.SelectableRowElement.Icon.NUMBER_SEVEN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[FormBlocker.Element.SelectableRowElement.Icon.NUMBER_EIGHT.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[FormBlocker.Element.SelectableRowElement.Icon.NUMBER_NINE.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x03bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ArcadeSelectableRow(Context context, FormBlocker.Element.SelectableRowElement selectableRowElement, FormElementViewBuilder$toView$24 formElementViewBuilder$toView$24, RealImageLoader realImageLoader) {
        super(context, null, 6, 0);
        Pair pair;
        SelectableRowViewModel.LeadingIcon leadingIcon;
        FormBlocker.Element.SelectableRowElement.Icon icon;
        SelectableRowViewModel.LeadingIcon leadingIcon2;
        Image image;
        String str;
        String str2;
        SelectableRowViewModel.TrailingIcon trailingIcon;
        SelectableRowViewModel.Body body;
        Icon icon2;
        String str3;
        context.getClass();
        SelectableRowViewModel.Action action = null;
        this.onEvent = formElementViewBuilder$toView$24;
        this.imageLoader = realImageLoader;
        String str4 = selectableRowElement.title;
        str4 = (str4 == null || StringsKt.isBlank(str4)) ? null : str4;
        String str5 = selectableRowElement.subtitle;
        str5 = (str5 == null || StringsKt.isBlank(str5)) ? null : str5;
        if (str4 != null) {
            pair = new Pair(str4, str5);
        } else {
            if (str5 == null) {
                a$$ExternalSyntheticBUOutline0.m$1("Both title and subtitle can't be null");
                throw null;
            }
            pair = new Pair(str5, null);
        }
        String str6 = (String) pair.first;
        String str7 = (String) pair.second;
        String str8 = selectableRowElement.detail_text;
        str8 = (str8 == null || StringsKt.isBlank(str8)) ? null : str8;
        FormBlocker.Element.SelectableRowElement.Action action2 = selectableRowElement.row_action;
        String str9 = (action2 == null || (str9 = action2.label) == null || StringsKt.isBlank(str9)) ? null : str9;
        FormBlocker.Element.SelectableRowElement.Action action3 = selectableRowElement.row_action;
        BlockerAction blockerAction = (action3 == null || (blockerAction = action3.action) == null) ? selectableRowElement.action : blockerAction;
        FormViewEvent.BlockerActionViewEvent.SelectableRowClicked selectableRowClicked = blockerAction != null ? new FormViewEvent.BlockerActionViewEvent.SelectableRowClicked(blockerAction) : null;
        UiAvatar uiAvatar = selectableRowElement.avatar;
        if (uiAvatar != null) {
            leadingIcon = new SelectableRowViewModel.LeadingIcon.Avatar(uiAvatar);
        } else {
            Icon icon3 = selectableRowElement.local_icon;
            if (icon3 != null && (str2 = icon3.arcade_id) != null) {
                Icons.Companion.getClass();
                Icons icons = zzd.get(str2);
                if (icons != null) {
                    leadingIcon = new SelectableRowViewModel.LeadingIcon.Small.LocalResource(icons.drawableRes);
                    icon = selectableRowElement.icon;
                    if (icon == null) {
                        FormBlocker.Element.SelectableRowElement.Icon icon4 = FormBlocker.Element.SelectableRowElement.Icon.NUMBER_ONE;
                        if (icon.compareTo(FormBlocker.Element.SelectableRowElement.Icon.NUMBER_NINE) > 0 || icon.compareTo(icon4) < 0) {
                            Integer valueOf = Integer.valueOf(R.drawable.icon_bank_account_24);
                            Integer valueOf2 = Integer.valueOf(R.drawable.icon_document_24);
                            Integer valueOf3 = Integer.valueOf(R.drawable.icon_giftcard_24);
                            Integer valueOf4 = Integer.valueOf(R.drawable.icon_avatar_24);
                            Integer valueOf5 = Integer.valueOf(R.drawable.icon_device_tap_24);
                            switch (SelectableRowElementIconResolverKt$WhenMappings.$EnumSwitchMapping$0[icon.ordinal()]) {
                                case 1:
                                case 20:
                                    break;
                                case 2:
                                    valueOf = Integer.valueOf(R.drawable.icon_bullet_generic_24);
                                    break;
                                case 3:
                                    valueOf = Integer.valueOf(R.drawable.icon_business_24);
                                    break;
                                case 4:
                                    valueOf = Integer.valueOf(R.drawable.icon_date_24);
                                    break;
                                case 5:
                                    valueOf = Integer.valueOf(R.drawable.icon_pay_later_24);
                                    break;
                                case 6:
                                    valueOf = Integer.valueOf(R.drawable.icon_taxes_24);
                                    break;
                                case 7:
                                    valueOf = Integer.valueOf(R.drawable.icon_card_basic_24);
                                    break;
                                case 8:
                                case 32:
                                    valueOf = valueOf3;
                                    break;
                                case 9:
                                    valueOf = Integer.valueOf(R.drawable.icon_cash_app_pay_24);
                                    break;
                                case 10:
                                    valueOf = Integer.valueOf(R.drawable.icon_category_food_drink_24);
                                    break;
                                case 11:
                                    valueOf = Integer.valueOf(R.drawable.icon_check_24);
                                    break;
                                case 12:
                                    valueOf = Integer.valueOf(R.drawable.icon_time_24);
                                    break;
                                case 13:
                                case 60:
                                    valueOf = valueOf5;
                                    break;
                                case 14:
                                case 50:
                                    valueOf = valueOf4;
                                    break;
                                case 15:
                                    valueOf = Integer.valueOf(R.drawable.icon_deposit_paper_24);
                                    break;
                                case 16:
                                    valueOf = Integer.valueOf(R.drawable.icon_deposit_24);
                                    break;
                                case 17:
                                case 21:
                                    valueOf = valueOf2;
                                    break;
                                case 18:
                                    valueOf = Integer.valueOf(R.drawable.icon_document_certificate_24);
                                    break;
                                case 19:
                                    valueOf = Integer.valueOf(R.drawable.icon_document_court_order_24);
                                    break;
                                case 22:
                                    valueOf = Integer.valueOf(R.drawable.icon_document_paystub_24);
                                    break;
                                case 23:
                                    valueOf = Integer.valueOf(R.drawable.icon_document_w_224);
                                    break;
                                case 24:
                                    valueOf = Integer.valueOf(R.drawable.icon_document_quill_24);
                                    break;
                                case 25:
                                    valueOf = Integer.valueOf(R.drawable.icon_currency_usd_24);
                                    break;
                                case 26:
                                    valueOf = Integer.valueOf(R.drawable.icon_edit_24);
                                    break;
                                case 27:
                                    valueOf = Integer.valueOf(R.drawable.icon_add_24);
                                    break;
                                case 28:
                                    valueOf = Integer.valueOf(R.drawable.icon_alert_outline_24);
                                    break;
                                case 29:
                                    valueOf = Integer.valueOf(R.drawable.icon_family_24);
                                    break;
                                case 30:
                                    valueOf = Integer.valueOf(R.drawable.icon_favorite_fill_24);
                                    break;
                                case 31:
                                    valueOf = Integer.valueOf(R.drawable.icon_fdic_24);
                                    break;
                                case 33:
                                    valueOf = Integer.valueOf(R.drawable.icon_international_24);
                                    break;
                                case 34:
                                    valueOf = Integer.valueOf(R.drawable.icon_id_government_24);
                                    break;
                                case 35:
                                    valueOf = Integer.valueOf(R.drawable.icon_stickers_24);
                                    break;
                                case 36:
                                    valueOf = Integer.valueOf(R.drawable.icon_like_24);
                                    break;
                                case 37:
                                    valueOf = Integer.valueOf(R.drawable.icon_download_24);
                                    break;
                                case 38:
                                    valueOf = Integer.valueOf(R.drawable.icon_information_outline_24);
                                    break;
                                case 39:
                                    valueOf = Integer.valueOf(R.drawable.icon_investing_24);
                                    break;
                                case 40:
                                    valueOf = Integer.valueOf(R.drawable.icon_number_pad_24);
                                    break;
                                case 41:
                                    valueOf = Integer.valueOf(R.drawable.icon_bitcoin_lightning_24);
                                    break;
                                case 42:
                                    valueOf = Integer.valueOf(R.drawable.icon_location_24);
                                    break;
                                case 43:
                                    valueOf = Integer.valueOf(R.drawable.icon_lock_locked_24);
                                    break;
                                case 44:
                                    valueOf = Integer.valueOf(R.drawable.icon_lock_unlocked_24);
                                    break;
                                case 45:
                                    valueOf = Integer.valueOf(R.drawable.icon_magic_24);
                                    break;
                                case 46:
                                    valueOf = Integer.valueOf(R.drawable.icon_device_mobile_24);
                                    break;
                                case 47:
                                    valueOf = Integer.valueOf(R.drawable.icon_time_infinite_24);
                                    break;
                                case 48:
                                    valueOf = Integer.valueOf(R.drawable.icon_note_24);
                                    break;
                                case 49:
                                    valueOf = Integer.valueOf(R.drawable.icon_discount_percentage_24);
                                    break;
                                case 51:
                                    valueOf = Integer.valueOf(R.drawable.icon_discount_tag_24);
                                    break;
                                case 52:
                                    valueOf = Integer.valueOf(R.drawable.icon_sensitive_hidden_24);
                                    break;
                                case 53:
                                    valueOf = Integer.valueOf(R.drawable.icon_block_24);
                                    break;
                                case 54:
                                    valueOf = Integer.valueOf(R.drawable.icon_recurring_automatic_24);
                                    break;
                                case 55:
                                    valueOf = Integer.valueOf(R.drawable.icon_round_ups_24);
                                    break;
                                case 56:
                                    valueOf = Integer.valueOf(R.drawable.icon_savings_apy_24);
                                    break;
                                case 57:
                                    valueOf = Integer.valueOf(R.drawable.icon_sensitive_visible_24);
                                    break;
                                case 58:
                                    valueOf = Integer.valueOf(R.drawable.icon_security_check_outline_24);
                                    break;
                                case 59:
                                    valueOf = Integer.valueOf(R.drawable.icon_location_duo_24);
                                    break;
                                case 61:
                                    valueOf = Integer.valueOf(R.drawable.icon_ticker_up_24);
                                    break;
                                case 62:
                                    valueOf = Integer.valueOf(R.drawable.icon_delivery_24);
                                    break;
                                case 63:
                                    valueOf = Integer.valueOf(R.drawable.icon_limits_24);
                                    break;
                                case 64:
                                    valueOf = Integer.valueOf(R.drawable.icon_transfer_p_2_p_24);
                                    break;
                                case 65:
                                    valueOf = Integer.valueOf(R.drawable.icon_zero_24);
                                    break;
                                case 66:
                                    valueOf = Integer.valueOf(R.drawable.form_icon_numeral_eight);
                                    break;
                                case 67:
                                    valueOf = Integer.valueOf(R.drawable.form_icon_numeral_five);
                                    break;
                                case 68:
                                    valueOf = Integer.valueOf(R.drawable.form_icon_numeral_four);
                                    break;
                                case 69:
                                    valueOf = Integer.valueOf(R.drawable.form_icon_numeral_nine);
                                    break;
                                case 70:
                                    valueOf = Integer.valueOf(R.drawable.form_icon_numeral_one);
                                    break;
                                case 71:
                                    valueOf = Integer.valueOf(R.drawable.form_icon_numeral_seven);
                                    break;
                                case 72:
                                    valueOf = Integer.valueOf(R.drawable.form_icon_numeral_six);
                                    break;
                                case 73:
                                    valueOf = Integer.valueOf(R.drawable.form_icon_numeral_three);
                                    break;
                                case 74:
                                    valueOf = Integer.valueOf(R.drawable.form_icon_numeral_two);
                                    break;
                                case 75:
                                    valueOf = Integer.valueOf(R.drawable.form_icon_cash_app);
                                    break;
                                case 76:
                                    valueOf = Integer.valueOf(R.drawable.form_icon_checked_box);
                                    break;
                                case 77:
                                    valueOf = Integer.valueOf(R.drawable.form_icon_unchecked_box);
                                    break;
                                case 78:
                                    valueOf = Integer.valueOf(R.drawable.square_logo);
                                    break;
                                case 79:
                                    valueOf = Integer.valueOf(R.drawable.icon_comm_chat_24);
                                    break;
                                case 80:
                                    valueOf = Integer.valueOf(R.drawable.icon_currency_btc_24);
                                    break;
                                case 81:
                                    valueOf = Integer.valueOf(R.drawable.icon_comm_phone_fill_24);
                                    break;
                                case 82:
                                    valueOf = Integer.valueOf(R.drawable.icon_atm_24);
                                    break;
                                case 83:
                                    valueOf = Integer.valueOf(R.drawable.icon_overdraft_protection_24);
                                    break;
                                default:
                                    valueOf = null;
                                    break;
                            }
                            if (valueOf == null) {
                                Path$$ExternalSyntheticBUOutline0.m$1(icon, "no icon found for ");
                                throw null;
                            }
                            leadingIcon2 = new SelectableRowViewModel.LeadingIcon.Small.LocalResource(valueOf.intValue());
                        } else {
                            switch (WhenMappings.$EnumSwitchMapping$1[icon.ordinal()]) {
                                case 1:
                                    str = "1";
                                    break;
                                case 2:
                                    str = "2";
                                    break;
                                case 3:
                                    str = "3";
                                    break;
                                case 4:
                                    str = "4";
                                    break;
                                case 5:
                                    str = "5";
                                    break;
                                case 6:
                                    str = "6";
                                    break;
                                case 7:
                                    str = "7";
                                    break;
                                case 8:
                                    str = "8";
                                    break;
                                case 9:
                                    str = "9";
                                    break;
                                default:
                                    a$$ExternalSyntheticBUOutline0.m$3("icon is not a number icon.");
                                    throw null;
                            }
                            leadingIcon2 = new SelectableRowViewModel.LeadingIcon.Small.Number(str);
                        }
                    } else {
                        leadingIcon2 = null;
                    }
                    leadingIcon = leadingIcon == null ? leadingIcon2 : leadingIcon;
                    image = selectableRowElement.remote_image;
                    if (image != null) {
                        leadingIcon = new SelectableRowViewModel.LeadingIcon.Small.ImageUrl(image, leadingIcon instanceof SelectableRowViewModel.LeadingIcon.Small.LocalResource ? (SelectableRowViewModel.LeadingIcon.Small.LocalResource) leadingIcon : null);
                    }
                }
            }
            leadingIcon = null;
            icon = selectableRowElement.icon;
            if (icon == null) {
            }
            if (leadingIcon == null) {
            }
            image = selectableRowElement.remote_image;
            if (image != null) {
            }
        }
        FormBlocker.Element.SelectableRowElement.TitleIcon titleIcon = selectableRowElement.title_icon;
        if (titleIcon != null && (icon2 = titleIcon.icon) != null && (str3 = icon2.arcade_id) != null) {
            Icons.Companion.getClass();
            Icons icons2 = zzd.get(str3);
            if (icons2 != null) {
                trailingIcon = new SelectableRowViewModel.TrailingIcon(icons2, titleIcon.tint_color);
                if (str7 == null || str8 != null) {
                    FormBlocker.Element.SelectableRowElement.DetailTextStyle detailTextStyle = selectableRowElement.subtitle_text_style;
                    detailTextStyle = detailTextStyle == null ? FormBlocker.Element.SelectableRowElement.DetailTextStyle.DEFAULT : detailTextStyle;
                    FormBlocker.Element.SelectableRowElement.DetailTextStyle detailTextStyle2 = selectableRowElement.detail_text_style;
                    body = new SelectableRowViewModel.Body(str7, detailTextStyle, str8, detailTextStyle2 == null ? FormBlocker.Element.SelectableRowElement.DetailTextStyle.DEFAULT : detailTextStyle2);
                } else {
                    body = null;
                }
                if (selectableRowClicked == null && str9 != null) {
                    action = new SelectableRowViewModel.Action.ButtonAccessory(str9, selectableRowClicked);
                } else if (selectableRowClicked != null) {
                    action = new SelectableRowViewModel.Action.ClickableRow(selectableRowClicked);
                }
                this.model = new SelectableRowViewModel(leadingIcon, trailingIcon, str6, body, action, selectableRowElement.appearance != FormBlocker.Element.SelectableRowElement.Appearance.DISABLED);
            }
        }
        trailingIcon = null;
        if (str7 == null) {
        }
        FormBlocker.Element.SelectableRowElement.DetailTextStyle detailTextStyle3 = selectableRowElement.subtitle_text_style;
        if (detailTextStyle3 == null) {
        }
        FormBlocker.Element.SelectableRowElement.DetailTextStyle detailTextStyle22 = selectableRowElement.detail_text_style;
        body = new SelectableRowViewModel.Body(str7, detailTextStyle3, str8, detailTextStyle22 == null ? FormBlocker.Element.SelectableRowElement.DetailTextStyle.DEFAULT : detailTextStyle22);
        if (selectableRowClicked == null) {
        }
        if (selectableRowClicked != null) {
        }
        this.model = new SelectableRowViewModel(leadingIcon, trailingIcon, str6, body, action, selectableRowElement.appearance != FormBlocker.Element.SelectableRowElement.Appearance.DISABLED);
    }

    public final void AvatarSelectableRow(SelectableRowViewModel selectableRowViewModel, Modifier modifier, Function0 function0, Composer composer, int i) {
        ComposableLambdaImpl composableLambdaImpl;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1838937137);
        int i2 = 2;
        int i3 = i | (gapComposer.changedInstance(selectableRowViewModel) ? 4 : 2) | (gapComposer.changedInstance(function0) ? 256 : 128) | (gapComposer.changedInstance(this) ? 2048 : 1024);
        int i4 = 1;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            SelectableRowViewModel.LeadingIcon leadingIcon = selectableRowViewModel.leadingIcon;
            CellDefaultAccessory cellDefaultAccessory = null;
            SelectableRowViewModel.LeadingIcon.Avatar avatar = leadingIcon instanceof SelectableRowViewModel.LeadingIcon.Avatar ? (SelectableRowViewModel.LeadingIcon.Avatar) leadingIcon : null;
            if (avatar == null) {
                a$$ExternalSyntheticBUOutline0.m$3("AvatarSelectableRow must contain Avatar leading icon");
                return;
            }
            StackedAvatarViewModel.Single stackedAvatarViewModel = StackedAvatarViewModelKt.toStackedAvatarViewModel(avatar.avatar);
            AvatarEntry avatarEntry = AvatarsKt.toAvatarEntry(stackedAvatarViewModel.avatar, null, new AfterpaySearchViewKt$$ExternalSyntheticLambda50(stackedAvatarViewModel, i2), gapComposer, 8, 1);
            SelectableRowViewModel.Body body = selectableRowViewModel.body;
            boolean z = body == null;
            if (body == null) {
                gapComposer.startReplaceGroup(1469221106);
                gapComposer.end(false);
                composableLambdaImpl = null;
            } else {
                gapComposer.startReplaceGroup(1469221107);
                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1414913249, new ArcadeSelectableRow$$ExternalSyntheticLambda5(this, selectableRowViewModel, i4), gapComposer);
                gapComposer.end(false);
                composableLambdaImpl = rememberComposableLambda;
            }
            SelectableRowViewModel.Action action = selectableRowViewModel.action;
            if (action == null) {
                gapComposer.startReplaceGroup(1469423660);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1469423661);
                if (action instanceof SelectableRowViewModel.Action.ClickableRow) {
                    gapComposer.startReplaceGroup(-118865952);
                    gapComposer.end(false);
                    cellDefaultAccessory = CellDefaultAccessory.Push.INSTANCE;
                } else {
                    if (!(action instanceof SelectableRowViewModel.Action.ButtonAccessory)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -118867225, false);
                    }
                    gapComposer.startReplaceGroup(-118862835);
                    CellDefaultAccessory label = new CellDefaultAccessory.Label(Expect_jvmKt.rememberComposableLambda(-2051491162, new ArcadeSelectableRow$$ExternalSyntheticLambda6(function0, action, i4), gapComposer), 1);
                    gapComposer.end(false);
                    cellDefaultAccessory = label;
                }
                gapComposer.end(false);
            }
            CellDefaultKt.m3392CellDefaultLargeIconygcbOzY(Expect_jvmKt.rememberComposableLambda(2114272467, new ArcadeModal$$ExternalSyntheticLambda5(avatarEntry, 23), gapComposer), Expect_jvmKt.rememberComposableLambda(-1017113644, new ArcadeSelectableRow$$ExternalSyntheticLambda5(this, selectableRowViewModel, i2), gapComposer), modifier, function0, null, false, z, composableLambdaImpl, null, cellDefaultAccessory, 0L, null, gapComposer, 438 | ((i3 << 3) & 7168), 0, 3376);
            gapComposer = gapComposer;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeSelectableRow$$ExternalSyntheticLambda8(this, selectableRowViewModel, modifier, function0, i, 1);
        }
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(Composer composer, int i) {
        Function0 function0;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1914117974);
        int i2 = (gapComposer.changedInstance(this) ? 4 : 2) | i;
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            SelectableRowViewModel.Action action = this.model.action;
            if (action == null) {
                gapComposer.startReplaceGroup(792428826);
                gapComposer.end(false);
                function0 = null;
            } else {
                gapComposer.startReplaceGroup(792428827);
                boolean changedInstance = gapComposer.changedInstance(this) | gapComposer.changedInstance(action);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new GLSceneScope$$ExternalSyntheticLambda4(19, this, action);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                function0 = (Function0) rememberedValue;
                gapComposer.end(false);
            }
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(821580607, new ArcadeSelectableRow$$ExternalSyntheticLambda1(this, function0, i3), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeSelectableRow$$ExternalSyntheticLambda2(this, i);
        }
    }

    public final void LeadingIcon(SelectableRowViewModel.LeadingIcon.Small small, boolean z, Composer composer, int i) {
        long j;
        Drawable drawable;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1983324985);
        int i2 = i | (gapComposer.changed(small) ? 4 : 2) | (gapComposer.changed(z) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            if (z) {
                gapComposer.startReplaceGroup(-990164191);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors.semantic.icon.standard;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-990162335);
                Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors2.semantic.icon.disabled;
                gapComposer.end(false);
            }
            boolean z2 = small instanceof SelectableRowViewModel.LeadingIcon.Small.ImageUrl;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (z2) {
                gapComposer.startReplaceGroup(-630172279);
                SelectableRowViewModel.LeadingIcon.Small.ImageUrl imageUrl = (SelectableRowViewModel.LeadingIcon.Small.ImageUrl) small;
                String urlForTheme = ThemablesKt.urlForTheme(imageUrl.image, gapComposer);
                SelectableRowViewModel.LeadingIcon.Small.LocalResource localResource = imageUrl.placeholder;
                if (localResource != null) {
                    Context context = getContext();
                    context.getClass();
                    drawable = PlatformKt.getDrawableCompat(context, localResource.drawableRes, Integer.valueOf(ColorKt.m694toArgb8_81llA(j)));
                } else {
                    drawable = null;
                }
                Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion, 24.0f);
                Painter rememberDrawablePainter = DrawablePainterKt.rememberDrawablePainter(drawable, gapComposer);
                Painter rememberDrawablePainter2 = DrawablePainterKt.rememberDrawablePainter(drawable, gapComposer);
                int i3 = Painter.$stable;
                AsyncImageKt.m1442AsyncImagex1rPTaM(urlForTheme, m285size3ABfNKs, rememberDrawablePainter, rememberDrawablePainter2, null, null, null, gapComposer, (i3 << 9) | 432 | (i3 << 12), 0, 32736);
                gapComposer.end(false);
            } else if (small instanceof SelectableRowViewModel.LeadingIcon.Small.Number) {
                gapComposer.startReplaceGroup(-629660221);
                String str = ((SelectableRowViewModel.LeadingIcon.Small.Number) small).f1134string;
                Context context2 = getContext();
                context2.getClass();
                NumberedBulletDrawable numberedBulletDrawable = new NumberedBulletDrawable(context2, str);
                int m694toArgb8_81llA = ColorKt.m694toArgb8_81llA(j);
                Colors colors3 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors3 == null) {
                    colors3 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                numberedBulletDrawable.numberColor = ColorKt.m694toArgb8_81llA(colors3.semantic.icon.inverse);
                numberedBulletDrawable.backgroundColor = m694toArgb8_81llA;
                numberedBulletDrawable.invalidateSelf();
                ImageKt.Image(DrawablePainterKt.rememberDrawablePainter(numberedBulletDrawable, gapComposer), null, SizeKt.m285size3ABfNKs(companion, 24.0f), null, null, RecyclerView.DECELERATION_RATE, null, gapComposer, Painter.$stable | 432, 120);
                gapComposer.end(false);
            } else {
                if (!(small instanceof SelectableRowViewModel.LeadingIcon.Small.LocalResource)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -990160404, false);
                }
                gapComposer.startReplaceGroup(-629223586);
                ImageKt.Image(Countries.painterResource(((SelectableRowViewModel.LeadingIcon.Small.LocalResource) small).drawableRes, 0, gapComposer), null, SizeKt.m285size3ABfNKs(companion, 24.0f), null, null, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer, Painter.$stable | 432, 56);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TabContentViewKt$$ExternalSyntheticLambda26(this, small, z, i, 20);
        }
    }

    public final void SelectableRowDetail(SelectableRowViewModel selectableRowViewModel, Composer composer, int i) {
        long j;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-119353810);
        int i2 = (gapComposer.changedInstance(selectableRowViewModel) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            SelectableRowViewModel.Body body = selectableRowViewModel.body;
            String str = body != null ? body.detailText : null;
            if (str == null) {
                gapComposer.startReplaceGroup(563668687);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(563668688);
                int i3 = WhenMappings.$EnumSwitchMapping$0[selectableRowViewModel.body.detailTextStyle.ordinal()];
                if (i3 == 1) {
                    gapComposer.startReplaceGroup(1984433843);
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    j = colors.semantic.text.success;
                    gapComposer.end(false);
                } else if (i3 == 2) {
                    gapComposer.startReplaceGroup(1984437106);
                    Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    j = colors2.semantic.text.danger;
                    gapComposer.end(false);
                } else if (i3 == 3) {
                    gapComposer.startReplaceGroup(1984440242);
                    Colors colors3 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    j = colors3.semantic.text.subtle;
                    gapComposer.end(false);
                } else {
                    if (i3 != 4) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1984430156, false);
                    }
                    gapComposer.startReplaceGroup(1984443443);
                    Colors colors4 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors4 == null) {
                        colors4 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    j = colors4.semantic.text.warning;
                    gapComposer.end(false);
                }
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, j, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeSelectableRow$$ExternalSyntheticLambda5(this, selectableRowViewModel, i, 5);
        }
    }

    public final void SelectableRowSubtitle(SelectableRowViewModel selectableRowViewModel, Composer composer, int i) {
        long j;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(539856519);
        int i2 = (gapComposer.changedInstance(selectableRowViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(this) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            SelectableRowViewModel.Body body = selectableRowViewModel.body;
            String str = body != null ? body.subtitle : null;
            if (str == null) {
                gapComposer.startReplaceGroup(-1786863132);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1786863131);
                int i3 = WhenMappings.$EnumSwitchMapping$0[selectableRowViewModel.body.subtitleTextStyle.ordinal()];
                if (i3 == 1) {
                    gapComposer.startReplaceGroup(-1110662480);
                    gapComposer.end(false);
                    j = Color.Unspecified;
                } else if (i3 == 2) {
                    gapComposer.startReplaceGroup(-1110659093);
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    j = colors.semantic.text.danger;
                    gapComposer.end(false);
                } else if (i3 == 3) {
                    gapComposer.startReplaceGroup(-1110655955);
                    Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    j = colors2.semantic.text.standard;
                    gapComposer.end(false);
                } else {
                    if (i3 != 4) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -1110665390, false);
                    }
                    gapComposer.startReplaceGroup(-1110652692);
                    Colors colors3 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    j = colors3.semantic.text.warning;
                    gapComposer.end(false);
                }
                boolean changedInstance = gapComposer.changedInstance(this);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new ArcadeSelectableRow$$ExternalSyntheticLambda2(this, 1, (byte) 0);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                LazyDslKt.m304MarkdownTextpCuZGqc(str, (Function2) rememberedValue, null, null, j, null, null, null, 0, 0, 0, gapComposer, 0, 2028);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeSelectableRow$$ExternalSyntheticLambda5(this, selectableRowViewModel, i, 3);
        }
    }

    public final void SelectableRowTitle(SelectableRowViewModel selectableRowViewModel, Composer composer, int i) {
        Color composeColor;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-344643661);
        int i2 = i | (gapComposer.changedInstance(selectableRowViewModel) ? 4 : 2) | (gapComposer.changedInstance(this) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            SelectableRowViewModel.TrailingIcon trailingIcon = selectableRowViewModel.trailingIcon;
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (trailingIcon == null) {
                gapComposer.startReplaceGroup(1987594344);
                String str = selectableRowViewModel.title;
                boolean changedInstance = gapComposer.changedInstance(this);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new ArcadeSelectableRow$$ExternalSyntheticLambda2(this, 2, (byte) 0);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                LazyDslKt.m304MarkdownTextpCuZGqc(str, (Function2) rememberedValue, null, null, 0L, null, null, null, 0, 0, 0, gapComposer, 0, 2044);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1987713725);
                gapComposer.startReplaceGroup(-490067654);
                AnnotatedString.Builder builder = new AnnotatedString.Builder();
                String str2 = selectableRowViewModel.title;
                boolean changedInstance2 = gapComposer.changedInstance(this);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changedInstance2 || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new ArcadeSelectableRow$$ExternalSyntheticLambda2(this, 3, (byte) 0);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                Worker.DefaultImpls.appendMarkdown$default(builder, str2, (Function2) rememberedValue2, 2);
                gapComposer.end(false);
                AnnotatedString annotatedString = builder.toAnnotatedString();
                Painter painter = trailingIcon.icon.painter(gapComposer);
                com.squareup.protos.cash.ui.Color color = trailingIcon.tintColor;
                if (color == null) {
                    gapComposer.startReplaceGroup(1988110462);
                    gapComposer.end(false);
                    composeColor = null;
                } else {
                    gapComposer.startReplaceGroup(-490056733);
                    composeColor = ComposeUtilsKt.toComposeColor(color, gapComposer);
                    gapComposer.end(false);
                }
                zzacp.m2014InlineIconTextQqsJerU(annotatedString, painter, null, composeColor != null ? composeColor.value : Color.Unspecified, null, null, 0L, null, 0, 0, 0, 0, false, RecyclerView.DECELERATION_RATE, gapComposer, Painter.$stable << 3, 0, 32756);
                gapComposer = gapComposer;
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeSelectableRow$$ExternalSyntheticLambda5(this, selectableRowViewModel, i, 4);
        }
    }

    public final void SmallIconSelectableRow(SelectableRowViewModel selectableRowViewModel, Modifier modifier, Function0 function0, Composer composer, int i) {
        ComposableLambdaImpl rememberComposableLambda;
        ComposableLambdaImpl composableLambdaImpl;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-681348442);
        int i2 = i | (gapComposer.changedInstance(selectableRowViewModel) ? 4 : 2) | (gapComposer.changedInstance(function0) ? 256 : 128) | (gapComposer.changedInstance(this) ? 2048 : 1024);
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            SelectableRowViewModel.LeadingIcon leadingIcon = selectableRowViewModel.leadingIcon;
            CellDefaultAccessory cellDefaultAccessory = null;
            SelectableRowViewModel.LeadingIcon.Small small = leadingIcon instanceof SelectableRowViewModel.LeadingIcon.Small ? (SelectableRowViewModel.LeadingIcon.Small) leadingIcon : null;
            if (small == null) {
                gapComposer.startReplaceGroup(-35738169);
                gapComposer.end(false);
                rememberComposableLambda = null;
            } else {
                gapComposer.startReplaceGroup(-35738168);
                rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-2102025101, new FormRemoteImageKt$$ExternalSyntheticLambda0(25, this, small, selectableRowViewModel), gapComposer);
                gapComposer.end(false);
            }
            if (selectableRowViewModel.body == null) {
                gapComposer.startReplaceGroup(-35572815);
                gapComposer.end(false);
                composableLambdaImpl = null;
            } else {
                gapComposer.startReplaceGroup(-35572814);
                ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-1278178314, new ArcadeSelectableRow$$ExternalSyntheticLambda5(this, selectableRowViewModel, i3), gapComposer);
                gapComposer.end(false);
                composableLambdaImpl = rememberComposableLambda2;
            }
            SelectableRowViewModel.Action action = selectableRowViewModel.action;
            if (action == null) {
                gapComposer.startReplaceGroup(-35358729);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-35358728);
                if (action instanceof SelectableRowViewModel.Action.ClickableRow) {
                    gapComposer.startReplaceGroup(2128579305);
                    gapComposer.end(false);
                    cellDefaultAccessory = CellDefaultAccessory.Push.INSTANCE;
                } else {
                    if (!(action instanceof SelectableRowViewModel.Action.ButtonAccessory)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 2128578032, false);
                    }
                    gapComposer.startReplaceGroup(2128582422);
                    cellDefaultAccessory = new CellDefaultAccessory.Label(Expect_jvmKt.rememberComposableLambda(-738321391, new ArcadeSelectableRow$$ExternalSyntheticLambda6(function0, action, i3), gapComposer), 1);
                    gapComposer.end(false);
                }
                gapComposer.end(false);
            }
            CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(rememberComposableLambda, Expect_jvmKt.rememberComposableLambda(1646819799, new ArcadeSelectableRow$$ExternalSyntheticLambda5(this, selectableRowViewModel, 6), gapComposer), modifier, function0, selectableRowViewModel.isEnabled, false, composableLambdaImpl, null, cellDefaultAccessory, 0L, gapComposer, 432 | ((i2 << 3) & 7168), 3408);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeSelectableRow$$ExternalSyntheticLambda8(this, selectableRowViewModel, modifier, function0, i, 0);
        }
    }
}
