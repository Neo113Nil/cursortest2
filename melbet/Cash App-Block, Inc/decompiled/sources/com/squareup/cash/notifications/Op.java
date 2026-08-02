package com.squareup.cash.notifications;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import com.squareup.cash.moneybot.components.api.ClientRenderableUi;
import com.squareup.cash.moneybot.genie.protos.ComposePlatform;
import com.squareup.cash.moneybot.viewmodels.plugins.PromptButtonListViewModel;
import com.squareup.cash.moneybot.views.plugins.PromptButtonListKt;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.supportarticles.app.v1.Color;
import com.squareup.cash.work.data.real.InvalidDataException;
import com.squareup.protos.cash.api.sandbox.MagicValue;
import com.squareup.protos.cash.cashapproxy.api.TextStyle;
import com.squareup.protos.cash.cashbusinessaccounts.plasma.v1.DowngradeBusinessAccountFlowParameters;
import com.squareup.protos.cash.cashidv.common.ProvideLegalBlockerTemplateName;
import com.squareup.protos.common.calendar.CalendarEvent;
import com.squareup.protos.timecards.scheduling.ShiftSchedule;
import java.time.Instant;
import java.time.OffsetDateTime;
import kotlin.Function;
import kotlin.jvm.functions.Function1;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import timber.log.Timber;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class Op {
    public static final /* synthetic */ Op[] $VALUES;
    public static final Op APP_MESSAGE_ACTION;
    public static final Op CLEAR_APP_DATA;
    public static final Companion Companion;
    public static final Op GET_PROFILE;
    public static final Op GET_REWARDS;
    public static final Op HOME;
    public static final Op NONE;
    public static final Op OPEN_URL;
    public static final Op PASSCODE_CHANGED;
    public static final Op PLAY_INTEGRITY_DEVICE_CHALLENGE;

    static {
        Op op = new Op("NONE", 0);
        NONE = op;
        Op op2 = new Op("APP_MESSAGE_ACTION", 1);
        APP_MESSAGE_ACTION = op2;
        Op op3 = new Op("PLAY_INTEGRITY_DEVICE_CHALLENGE", 2);
        PLAY_INTEGRITY_DEVICE_CHALLENGE = op3;
        Op op4 = new Op("GET_PROFILE", 3);
        GET_PROFILE = op4;
        Op op5 = new Op("GET_REWARDS", 4);
        GET_REWARDS = op5;
        Op op6 = new Op("HOME", 5);
        HOME = op6;
        Op op7 = new Op("OPEN_URL", 6);
        OPEN_URL = op7;
        Op op8 = new Op("PASSCODE_CHANGED", 7);
        PASSCODE_CHANGED = op8;
        Op op9 = new Op("CLEAR_APP_DATA", 8);
        CLEAR_APP_DATA = op9;
        $VALUES = new Op[]{op, op2, op3, op4, op5, op6, op7, op8, op9};
        Companion = new Companion();
    }

    public static Op valueOf(String str) {
        return (Op) Enum.valueOf(Op.class, str);
    }

    public static Op[] values() {
        return (Op[]) $VALUES.clone();
    }

    public final class Companion implements ClientRenderableUi {
        public static final Instant access$getNextShiftStartTime(ShiftSchedule shiftSchedule) {
            CalendarEvent calendarEvent;
            String str;
            ShiftSchedule.Version version = shiftSchedule.published_version;
            if (version == null || (calendarEvent = version.calendar_event) == null || (str = calendarEvent.start_datetime) == null) {
                return null;
            }
            try {
                return OffsetDateTime.parse(str).toInstant();
            } catch (Exception unused) {
                throw new InvalidDataException("Invalid start_datetime format");
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public static Op fromPush(String str) {
            if (str == null) {
                return Op.NONE;
            }
            switch (str.hashCode()) {
                case -2089682331:
                    if (str.equals("play-integrity-device-challenge")) {
                        return Op.PLAY_INTEGRITY_DEVICE_CHALLENGE;
                    }
                    break;
                case -2024188074:
                    if (str.equals("clear-app-data")) {
                        return Op.CLEAR_APP_DATA;
                    }
                    break;
                case -1973503894:
                    if (str.equals("do-app-message-action")) {
                        return Op.APP_MESSAGE_ACTION;
                    }
                    break;
                case -1474083278:
                    if (str.equals("get-profile")) {
                        return Op.GET_PROFILE;
                    }
                    break;
                case -505795732:
                    if (str.equals("open-url")) {
                        return Op.OPEN_URL;
                    }
                    break;
                case -64007251:
                    if (str.equals("get-rewards")) {
                        return Op.GET_REWARDS;
                    }
                    break;
                case 3208415:
                    if (str.equals("home")) {
                        return Op.HOME;
                    }
                    break;
                case 983468389:
                    if (str.equals("passcode-changed")) {
                        return Op.PASSCODE_CHANGED;
                    }
                    break;
            }
            Timber.Forest.e(new IllegalArgumentException("Unsupported op: ".concat(str)));
            return Op.NONE;
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static MagicValue m3672fromValue(int i) {
            if (i == 3000) {
                return MagicValue.CustomerRequestFailureCustomerIneligible;
            }
            switch (i) {
                case 1:
                    return MagicValue.PaymentApprovedConnectionError;
                case 2:
                    return MagicValue.PaymentDeclineCompliance;
                case 3:
                    return MagicValue.PaymentDeclineInsufficientFunds;
                case 4:
                    return MagicValue.PaymentDeclineOther;
                case 5:
                    return MagicValue.PaymentDeclineRisk;
                case 6:
                    return MagicValue.PaymentDeclineTooLarge;
                case 7:
                    return MagicValue.PaymentDeclineTooSmall;
                case 8:
                    return MagicValue.PaymentDeclineGrantConsumed;
                case 9:
                    return MagicValue.PaymentDeclineGrantExpired;
                case 10:
                    return MagicValue.PaymentDeclineGrantMissing;
                case 11:
                    return MagicValue.PaymentDeclineGrantRevoked;
                case 12:
                    return MagicValue.PaymentCreationFailureMerchantDisabled;
                case 13:
                    return MagicValue.PaymentCreationFailureMerchantPending;
                case 14:
                    return MagicValue.PaymentCreationFailureMerchantMissing;
                default:
                    switch (i) {
                        case IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO /* 1000 */:
                            return MagicValue.RefundApprovedConnectionError;
                        case IptcConstants.IMAGE_RESOURCE_BLOCK_MACINTOSH_PRINT_INFO /* 1001 */:
                            return MagicValue.RefundDeclineCompliance;
                        case IptcConstants.IMAGE_RESOURCE_BLOCK_XML_DATA /* 1002 */:
                            return MagicValue.RefundDeclineOther;
                        case IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_COLOR_TABLE /* 1003 */:
                            return MagicValue.RefundDeclineRisk;
                        case 1004:
                            return MagicValue.RefundDeclineTooLarge;
                        case IptcConstants.IMAGE_RESOURCE_BLOCK_RESOLUTION_INFO /* 1005 */:
                            return MagicValue.RefundDeclineTooSmall;
                        case IptcConstants.IMAGE_RESOURCE_BLOCK_ALPHA_CHANNELS_NAMES /* 1006 */:
                            return MagicValue.RefundDeclineGrantConsumed;
                        case IptcConstants.IMAGE_RESOURCE_BLOCK_DISPLAY_INFO /* 1007 */:
                            return MagicValue.RefundDeclineGrantExpired;
                        case IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION /* 1008 */:
                            return MagicValue.RefundDeclineGrantMissing;
                        case IptcConstants.IMAGE_RESOURCE_BLOCK_BORDER_INFORMATION /* 1009 */:
                            return MagicValue.RefundDeclineGrantRevoked;
                        case IptcConstants.IMAGE_RESOURCE_BLOCK_BACKGROUND_COLOR /* 1010 */:
                            return MagicValue.RefundCreationFailureMerchantDisabled;
                        case IptcConstants.IMAGE_RESOURCE_BLOCK_PRINT_FLAGS /* 1011 */:
                            return MagicValue.RefundCreationFailureMerchantMissing;
                        case IptcConstants.IMAGE_RESOURCE_BLOCK_BW_HALFTONING_INFO /* 1012 */:
                            return MagicValue.RefundCreationFailureMerchantPending;
                        default:
                            switch (i) {
                                case 2000:
                                    return MagicValue.CreateDisputeCD10;
                                case 2001:
                                    return MagicValue.CreateDisputeCD11;
                                case 2002:
                                    return MagicValue.CreateDisputeCD12;
                                case 2003:
                                    return MagicValue.CreateDisputeCD13;
                                case 2004:
                                    return MagicValue.CreateDisputeFR10;
                                case 2005:
                                    return MagicValue.CreateDisputeFR11;
                                case 2006:
                                    return MagicValue.CreateDisputePE10;
                                case 2007:
                                    return MagicValue.CreateDisputePE11;
                                case 2008:
                                    return MagicValue.CreateDisputePE12;
                                case 2009:
                                    return MagicValue.CreateDisputeAmountDifferent;
                                default:
                                    return null;
                            }
                    }
            }
        }

        public void Content(PromptButtonListViewModel promptButtonListViewModel, Function1 function1, Composer composer, int i) {
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.startRestartGroup(-1663691102);
            int i2 = (gapComposer.changedInstance(promptButtonListViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
            if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
                PromptButtonListKt.PromptButtonList(promptButtonListViewModel, null, function1, gapComposer, ((i2 << 3) & 896) | (i2 & 14));
            } else {
                gapComposer.skipToGroupEnd();
            }
            RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.block = new MusicViewKt$$ExternalSyntheticLambda5((Object) this, (Object) promptButtonListViewModel, (Function) function1, i, 6);
            }
        }

        @Override // com.squareup.cash.moneybot.components.api.ClientRenderableUi
        public /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, Composer composer) {
            Content((PromptButtonListViewModel) obj, function1, composer, 0);
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static TextStyle m3673fromValue(int i) {
            switch (i) {
                case 1:
                    return TextStyle.TEXT_STYLE_BIG_MONEY;
                case 2:
                    return TextStyle.TEXT_STYLE_HEADER_1;
                case 3:
                    return TextStyle.TEXT_STYLE_HEADER_2;
                case 4:
                    return TextStyle.TEXT_STYLE_HEADER_3;
                case 5:
                    return TextStyle.TEXT_STYLE_HEADER_4;
                case 6:
                    return TextStyle.TEXT_STYLE_MAIN_TITLE;
                case 7:
                    return TextStyle.TEXT_STYLE_MAIN_BODY;
                case 8:
                    return TextStyle.TEXT_STYLE_SMALL_TITLE;
                case 9:
                    return TextStyle.TEXT_STYLE_SMALL_BODY;
                case 10:
                    return TextStyle.TEXT_STYLE_STRONG_CAPTION;
                case 11:
                    return TextStyle.TEXT_STYLE_CAPTION;
                case 12:
                    return TextStyle.TEXT_STYLE_IDENTIFIER;
                default:
                    return null;
            }
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static ProvideLegalBlockerTemplateName m3675fromValue(int i) {
            switch (i) {
                case 0:
                    return ProvideLegalBlockerTemplateName.PROVIDE_LEGAL_NAME_UNSPECIFIED;
                case 1:
                    return ProvideLegalBlockerTemplateName.PROVIDE_LEGAL_NAME_DEFAULT;
                case 2:
                default:
                    return null;
                case 3:
                    return ProvideLegalBlockerTemplateName.PROVIDE_LEGAL_NAME_CONFIRM_IDENTITY_FLOW;
                case 4:
                    return ProvideLegalBlockerTemplateName.PROVIDE_LEGAL_NAME_P2P;
                case 5:
                    return ProvideLegalBlockerTemplateName.PROVIDE_LEGAL_NAME_IDV_ONBOARDING;
                case 6:
                    return ProvideLegalBlockerTemplateName.PROVIDE_LEGAL_NAME_DEFAULT_2;
                case 7:
                    return ProvideLegalBlockerTemplateName.PROVIDE_LEGAL_NAME_CONFIRM_TEEN_ACCOUNT;
                case 8:
                    return ProvideLegalBlockerTemplateName.PROVIDE_LEGAL_NAME_CONFIRM_KID_ACCOUNT;
                case 9:
                    return ProvideLegalBlockerTemplateName.PROVIDE_LEGAL_NAME_REQUEST_SPONSORSHIP;
                case 10:
                    return ProvideLegalBlockerTemplateName.PROVIDE_LEGAL_NAME_REQUEST_SPONSORSHIP_SPONSOR_LED;
                case 11:
                    return ProvideLegalBlockerTemplateName.PROVIDE_LEGAL_NAME_ONBOARDING;
                case 12:
                    return ProvideLegalBlockerTemplateName.PROVIDE_LEGAL_NAME_RE_IDV;
                case 13:
                    return ProvideLegalBlockerTemplateName.PROVIDE_LEGAL_NAME_PHONE_PLAN;
            }
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static Color m3671fromValue(int i) {
            switch (i) {
                case 0:
                    return Color.COLOR_UNSPECIFIED;
                case 1:
                    return Color.COLOR_GREEN;
                case 2:
                    return Color.COLOR_TURQUOISE;
                case 3:
                    return Color.COLOR_SKY;
                case 4:
                    return Color.COLOR_OCEAN;
                case 5:
                    return Color.COLOR_ROYAL;
                case 6:
                    return Color.COLOR_PURPLE;
                case 7:
                    return Color.COLOR_PINK;
                case 8:
                    return Color.COLOR_SCARLET;
                case 9:
                    return Color.COLOR_AMBER;
                case 10:
                    return Color.COLOR_SUNSHINE;
                case 11:
                    return Color.COLOR_GRAY;
                case 12:
                    return Color.COLOR_INVESTING;
                case 13:
                    return Color.COLOR_BITCOIN;
                default:
                    return null;
            }
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static DowngradeBusinessAccountFlowParameters.EntryPoint m3674fromValue(int i) {
            switch (i) {
                case 1:
                    return DowngradeBusinessAccountFlowParameters.EntryPoint.REVIEW_BUSINESS_ACCOUNT_TAX_NOTIFICATION_TAX_CHANGES_INFO;
                case 2:
                    return DowngradeBusinessAccountFlowParameters.EntryPoint.REVIEW_BUSINESS_ACCOUNT_TAX_NOTIFICATION_FAQ;
                case 3:
                    return DowngradeBusinessAccountFlowParameters.EntryPoint.IN_APP_BUSINESS_INFO_SECTION;
                case 4:
                    return DowngradeBusinessAccountFlowParameters.EntryPoint.IN_APP_PERSONAL_SECTION;
                case 5:
                    return DowngradeBusinessAccountFlowParameters.EntryPoint.IN_APP_EDIT_PROFILE_SECTION;
                case 6:
                    return DowngradeBusinessAccountFlowParameters.EntryPoint.REVIEW_BUSINESS_ACCOUNT_TAX_NOTIFICATION_EMAIL;
                case 7:
                    return DowngradeBusinessAccountFlowParameters.EntryPoint.REVIEW_BUSINESS_ACCOUNT_TAX_NOTIFICATION_BUSINESS_USE_CASE;
                case 8:
                    return DowngradeBusinessAccountFlowParameters.EntryPoint.IN_APP_BUSINESS_USE_CASE;
                case 9:
                    return DowngradeBusinessAccountFlowParameters.EntryPoint.KYB_REMEDIATION_FLOW_UNSUPPORTED;
                case 10:
                    return DowngradeBusinessAccountFlowParameters.EntryPoint.KYB_REMEDIATION_ELIGIBILITY_UNSUPPORTED;
                case 11:
                    return DowngradeBusinessAccountFlowParameters.EntryPoint.KYB_REMEDIATION_NON_RETRIABLE_FAILURE;
                case 12:
                    return DowngradeBusinessAccountFlowParameters.EntryPoint.KYB_REMEDIATION_SQ_ONBOARDING;
                case 13:
                    return DowngradeBusinessAccountFlowParameters.EntryPoint.IN_APP_FEATURE_RESTRICTION;
                case 14:
                    return DowngradeBusinessAccountFlowParameters.EntryPoint.KYB_REMEDIATION_NOT_A_BUSINESS;
                default:
                    return null;
            }
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static ComposePlatform.Typography m3670fromValue(int i) {
            switch (i) {
                case 0:
                    return ComposePlatform.Typography.TYPOGRAPHY_UNSPECIFIED;
                case 1:
                    return ComposePlatform.Typography.TYPOGRAPHY_DISPLAY_LARGE;
                case 2:
                    return ComposePlatform.Typography.TYPOGRAPHY_DISPLAY_MEDIUM;
                case 3:
                    return ComposePlatform.Typography.TYPOGRAPHY_DISPLAY_SMALL;
                case 4:
                    return ComposePlatform.Typography.TYPOGRAPHY_HEADLINE_LARGE;
                case 5:
                    return ComposePlatform.Typography.TYPOGRAPHY_HEADLINE_MEDIUM;
                case 6:
                    return ComposePlatform.Typography.TYPOGRAPHY_HEADLINE_SMALL;
                case 7:
                    return ComposePlatform.Typography.TYPOGRAPHY_TITLE_LARGE;
                case 8:
                    return ComposePlatform.Typography.TYPOGRAPHY_TITLE_MEDIUM;
                case 9:
                    return ComposePlatform.Typography.TYPOGRAPHY_TITLE_SMALL;
                case 10:
                    return ComposePlatform.Typography.TYPOGRAPHY_BODY_LARGE;
                case 11:
                    return ComposePlatform.Typography.TYPOGRAPHY_BODY_MEDIUM;
                case 12:
                    return ComposePlatform.Typography.TYPOGRAPHY_BODY_SMALL;
                case 13:
                    return ComposePlatform.Typography.TYPOGRAPHY_LABEL_LARGE;
                case 14:
                    return ComposePlatform.Typography.TYPOGRAPHY_LABEL_MEDIUM;
                case 15:
                    return ComposePlatform.Typography.TYPOGRAPHY_LABEL_SMALL;
                default:
                    return null;
            }
        }

        public static ComposePlatform.ButtonStyle fromValue(int i) {
            if (i == 0) {
                return ComposePlatform.ButtonStyle.BUTTON_STYLE_UNSPECIFIED;
            }
            if (i == 1) {
                return ComposePlatform.ButtonStyle.BUTTON_STYLE_FILLED;
            }
            if (i == 2) {
                return ComposePlatform.ButtonStyle.BUTTON_STYLE_FILLED_TONAL;
            }
            if (i == 3) {
                return ComposePlatform.ButtonStyle.BUTTON_STYLE_ELEVATED;
            }
            if (i == 4) {
                return ComposePlatform.ButtonStyle.BUTTON_STYLE_OUTLINED;
            }
            if (i != 5) {
                return null;
            }
            return ComposePlatform.ButtonStyle.BUTTON_STYLE_TEXT;
        }
    }
}
