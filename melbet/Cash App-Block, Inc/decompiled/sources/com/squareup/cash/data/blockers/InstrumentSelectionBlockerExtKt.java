package com.squareup.cash.data.blockers;

import android.os.Parcelable;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.blockers.screens.InstrumentSelectionData;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.screens.RedactedString;
import com.squareup.cash.work.webview.views.WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0;
import com.squareup.protos.cash.digitalwallet.DigitalWalletType;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.blockers.InstrumentSelectionBlocker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import okio.ByteString;

/* loaded from: classes8.dex */
public abstract class InstrumentSelectionBlockerExtKt {

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InstrumentSelectionBlocker.SubmissionEndpoint.values().length];
            try {
                iArr[InstrumentSelectionBlocker.SubmissionEndpoint.V_2_0_SELECT_INSTRUMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final InstrumentSelectionData.InstrumentOption.PreselectableOption initialSelectedOption(ArrayList arrayList, Integer num) {
        Object obj = arrayList.get(num != null ? num.intValue() : 0);
        InstrumentSelectionData.InstrumentOption.PreselectableOption preselectableOption = obj instanceof InstrumentSelectionData.InstrumentOption.PreselectableOption ? (InstrumentSelectionData.InstrumentOption.PreselectableOption) obj : null;
        if (preselectableOption != null) {
            return preselectableOption;
        }
        a$$ExternalSyntheticBUOutline0.m$3("Preselected option must be a PreselectableOption");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x019d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final InstrumentSelectionData toData(InstrumentSelectionBlocker instrumentSelectionBlocker) {
        InstrumentSelectionBlocker.ShowOptionsAction showOptionsAction;
        InstrumentSelectionData.PreselectedOptionAction preselectedOptionAction;
        InstrumentSelectionBlocker.ShowDialogAction showDialogAction;
        InstrumentSelectionData.PreselectedOptionAction preselectedShowDialogAction;
        List<InstrumentSelectionBlocker.InstrumentOption> list;
        InstrumentSelectionBlocker.SubmissionEndpoint submissionEndpoint;
        InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction selectInstrumentAction;
        InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectionAction selectionAction;
        instrumentSelectionBlocker.getClass();
        List<InstrumentSelectionBlocker.InstrumentOption> list2 = instrumentSelectionBlocker.options;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list2.iterator();
        int i = 0;
        while (true) {
            InstrumentSelectionBlocker.InstrumentOption.DisabledState disabledState = null;
            if (!it.hasNext()) {
                if (arrayList.isEmpty()) {
                    a$$ExternalSyntheticBUOutline0.m$3("Options list must contain at least one of selectable option or a disabled option that is preselected");
                    return null;
                }
                ArrayList options = toOptions(instrumentSelectionBlocker.options, false);
                InstrumentSelectionData.InstrumentOption.PreselectableOption initialSelectedOption = initialSelectedOption(options, instrumentSelectionBlocker.preselected_option_index);
                InstrumentSelectionBlocker.PreselectedOptionAction preselectedOptionAction2 = instrumentSelectionBlocker.preselected_option_action;
                if (preselectedOptionAction2 != null) {
                    InstrumentSelectionBlocker.PreselectedOptionAction.ShowOptionsAction showOptionsAction2 = preselectedOptionAction2 instanceof InstrumentSelectionBlocker.PreselectedOptionAction.ShowOptionsAction ? (InstrumentSelectionBlocker.PreselectedOptionAction.ShowOptionsAction) preselectedOptionAction2 : null;
                    if (showOptionsAction2 != null) {
                        showOptionsAction = showOptionsAction2.getValue();
                        preselectedOptionAction = InstrumentSelectionData.PreselectedOptionAction.PreselectedShowOptionsAction.INSTANCE;
                        if (showOptionsAction == null) {
                            InstrumentSelectionBlocker.PreselectedOptionAction preselectedOptionAction3 = instrumentSelectionBlocker.preselected_option_action;
                            if (preselectedOptionAction3 != null) {
                                InstrumentSelectionBlocker.PreselectedOptionAction.ShowDialogAction showDialogAction2 = preselectedOptionAction3 instanceof InstrumentSelectionBlocker.PreselectedOptionAction.ShowDialogAction ? (InstrumentSelectionBlocker.PreselectedOptionAction.ShowDialogAction) preselectedOptionAction3 : null;
                                if (showDialogAction2 != null) {
                                    showDialogAction = showDialogAction2.getValue();
                                    if (showDialogAction != null) {
                                        InstrumentSelectionBlocker.PreselectedOptionAction preselectedOptionAction4 = instrumentSelectionBlocker.preselected_option_action;
                                        preselectedOptionAction4.getClass();
                                        InstrumentSelectionBlocker.PreselectedOptionAction.ShowDialogAction showDialogAction3 = preselectedOptionAction4 instanceof InstrumentSelectionBlocker.PreselectedOptionAction.ShowDialogAction ? (InstrumentSelectionBlocker.PreselectedOptionAction.ShowDialogAction) preselectedOptionAction4 : null;
                                        InstrumentSelectionBlocker.ShowDialogAction value = showDialogAction3 != null ? showDialogAction3.getValue() : null;
                                        value.getClass();
                                        String str = value.title;
                                        str.getClass();
                                        RedactedString redactedString = new RedactedString(str);
                                        String str2 = value.body;
                                        RedactedString redactedString2 = str2 != null ? new RedactedString(str2) : null;
                                        String str3 = value.submit_button_text;
                                        BlockerAction blockerAction = value.blocker_action;
                                        if (blockerAction == null) {
                                            blockerAction = BlockersOneofExtensionsKt.BlockerAction$default(null, new BlockerAction.SubmitAction("id", null, null, null, 14, null), 1);
                                        }
                                        String str4 = value.dismiss_button_text;
                                        str4.getClass();
                                        preselectedShowDialogAction = new InstrumentSelectionData.PreselectedOptionAction.PreselectedShowDialogAction(initialSelectedOption, new InstrumentSelectionData.InstrumentOption.Enabled.OptionDialog(redactedString, redactedString2, str3, blockerAction, str4));
                                        list = instrumentSelectionBlocker.secondary_options;
                                        if (list.isEmpty()) {
                                            list = null;
                                        }
                                        ArrayList options2 = list != null ? toOptions(list, true) : null;
                                        InstrumentSelectionData.InstrumentOption.PreselectableOption initialSelectedOption2 = options2 != null ? initialSelectedOption(options2, instrumentSelectionBlocker.preselected_secondary_option_index) : null;
                                        String str5 = instrumentSelectionBlocker.header_text;
                                        str5.getClass();
                                        String str6 = instrumentSelectionBlocker.submit_button_title;
                                        str6.getClass();
                                        String str7 = instrumentSelectionBlocker.selected_instrument_label;
                                        String str8 = (str7 != null || str7.length() <= 0) ? null : str7;
                                        String str9 = instrumentSelectionBlocker.list_header_title;
                                        String str10 = (str9 != null || str9.length() <= 0) ? null : str9;
                                        String str11 = instrumentSelectionBlocker.secondary_list_header_title;
                                        String str12 = (str11 != null || str11.length() <= 0) ? null : str11;
                                        String str13 = instrumentSelectionBlocker.list_dismiss_button_text;
                                        str13.getClass();
                                        InstrumentSelectionData.PreselectedOptionAction preselectedOptionAction5 = options2 != null ? preselectedOptionAction : null;
                                        Boolean bool = instrumentSelectionBlocker.secondary_option_fields_take_precedence;
                                        boolean booleanValue = bool != null ? bool.booleanValue() : false;
                                        submissionEndpoint = instrumentSelectionBlocker.submission_endpoint;
                                        InstrumentSelectionData.SubmissionEndpoint submissionEndpoint2 = InstrumentSelectionData.SubmissionEndpoint.V2;
                                        if ((submissionEndpoint == null ? -1 : WhenMappings.$EnumSwitchMapping$0[submissionEndpoint.ordinal()]) != 1) {
                                            InstrumentSelectionBlockerError instrumentSelectionBlockerError = new InstrumentSelectionBlockerError();
                                            ErrorReporter errorReporter = ErrorReporter.Companion.INSTANCE;
                                            if (errorReporter == null) {
                                                WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m();
                                                return null;
                                            }
                                            errorReporter.report(instrumentSelectionBlockerError, ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                                        }
                                        return new InstrumentSelectionData(str5, str6, options, initialSelectedOption, preselectedShowDialogAction, str8, options2, initialSelectedOption2, preselectedOptionAction5, str10, str12, str13, booleanValue, submissionEndpoint2);
                                    }
                                }
                            }
                            showDialogAction = null;
                            if (showDialogAction != null) {
                            }
                        }
                        preselectedShowDialogAction = preselectedOptionAction;
                        list = instrumentSelectionBlocker.secondary_options;
                        if (list.isEmpty()) {
                        }
                        if (list != null) {
                        }
                        if (options2 != null) {
                        }
                        String str52 = instrumentSelectionBlocker.header_text;
                        str52.getClass();
                        String str62 = instrumentSelectionBlocker.submit_button_title;
                        str62.getClass();
                        String str72 = instrumentSelectionBlocker.selected_instrument_label;
                        if (str72 != null) {
                        }
                        String str92 = instrumentSelectionBlocker.list_header_title;
                        if (str92 != null) {
                        }
                        String str112 = instrumentSelectionBlocker.secondary_list_header_title;
                        if (str112 != null) {
                        }
                        String str132 = instrumentSelectionBlocker.list_dismiss_button_text;
                        str132.getClass();
                        if (options2 != null) {
                        }
                        Boolean bool2 = instrumentSelectionBlocker.secondary_option_fields_take_precedence;
                        boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : false;
                        submissionEndpoint = instrumentSelectionBlocker.submission_endpoint;
                        InstrumentSelectionData.SubmissionEndpoint submissionEndpoint22 = InstrumentSelectionData.SubmissionEndpoint.V2;
                        if ((submissionEndpoint == null ? -1 : WhenMappings.$EnumSwitchMapping$0[submissionEndpoint.ordinal()]) != 1) {
                        }
                        return new InstrumentSelectionData(str52, str62, options, initialSelectedOption, preselectedShowDialogAction, str8, options2, initialSelectedOption2, preselectedOptionAction5, str10, str12, str132, booleanValue2, submissionEndpoint22);
                    }
                }
                showOptionsAction = null;
                preselectedOptionAction = InstrumentSelectionData.PreselectedOptionAction.PreselectedShowOptionsAction.INSTANCE;
                if (showOptionsAction == null) {
                }
                preselectedShowDialogAction = preselectedOptionAction;
                list = instrumentSelectionBlocker.secondary_options;
                if (list.isEmpty()) {
                }
                if (list != null) {
                }
                if (options2 != null) {
                }
                String str522 = instrumentSelectionBlocker.header_text;
                str522.getClass();
                String str622 = instrumentSelectionBlocker.submit_button_title;
                str622.getClass();
                String str722 = instrumentSelectionBlocker.selected_instrument_label;
                if (str722 != null) {
                }
                String str922 = instrumentSelectionBlocker.list_header_title;
                if (str922 != null) {
                }
                String str1122 = instrumentSelectionBlocker.secondary_list_header_title;
                if (str1122 != null) {
                }
                String str1322 = instrumentSelectionBlocker.list_dismiss_button_text;
                str1322.getClass();
                if (options2 != null) {
                }
                Boolean bool22 = instrumentSelectionBlocker.secondary_option_fields_take_precedence;
                boolean booleanValue22 = bool22 != null ? bool22.booleanValue() : false;
                submissionEndpoint = instrumentSelectionBlocker.submission_endpoint;
                InstrumentSelectionData.SubmissionEndpoint submissionEndpoint222 = InstrumentSelectionData.SubmissionEndpoint.V2;
                if ((submissionEndpoint == null ? -1 : WhenMappings.$EnumSwitchMapping$0[submissionEndpoint.ordinal()]) != 1) {
                }
                return new InstrumentSelectionData(str522, str622, options, initialSelectedOption, preselectedShowDialogAction, str8, options2, initialSelectedOption2, preselectedOptionAction5, str10, str12, str1322, booleanValue22, submissionEndpoint222);
            }
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
                throw null;
            }
            InstrumentSelectionBlocker.InstrumentOption instrumentOption = (InstrumentSelectionBlocker.InstrumentOption) next;
            InstrumentSelectionBlocker.InstrumentOption.State state = instrumentOption.state;
            if (state != null) {
                InstrumentSelectionBlocker.InstrumentOption.State.EnabledState enabledState = state instanceof InstrumentSelectionBlocker.InstrumentOption.State.EnabledState ? (InstrumentSelectionBlocker.InstrumentOption.State.EnabledState) state : null;
                InstrumentSelectionBlocker.InstrumentOption.EnabledState value2 = enabledState != null ? enabledState.getValue() : null;
                if (value2 != null && (selectionAction = value2.selection_action) != null) {
                    InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectionAction.SelectInstrumentAction selectInstrumentAction2 = selectionAction instanceof InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectionAction.SelectInstrumentAction ? (InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectionAction.SelectInstrumentAction) selectionAction : null;
                    if (selectInstrumentAction2 != null) {
                        selectInstrumentAction = selectInstrumentAction2.getValue();
                        if (selectInstrumentAction == null) {
                            InstrumentSelectionBlocker.InstrumentOption.State state2 = instrumentOption.state;
                            if (state2 != null) {
                                InstrumentSelectionBlocker.InstrumentOption.State.DisabledState disabledState2 = state2 instanceof InstrumentSelectionBlocker.InstrumentOption.State.DisabledState ? (InstrumentSelectionBlocker.InstrumentOption.State.DisabledState) state2 : null;
                                if (disabledState2 != null) {
                                    disabledState = disabledState2.getValue();
                                }
                            }
                            if (disabledState != null) {
                                Integer num = instrumentSelectionBlocker.preselected_option_index;
                                if (num != null) {
                                    if (i != num.intValue()) {
                                    }
                                }
                            }
                            i = i2;
                        }
                        arrayList.add(next);
                        i = i2;
                    }
                }
            }
            selectInstrumentAction = null;
            if (selectInstrumentAction == null) {
            }
            arrayList.add(next);
            i = i2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x035b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03bb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x03c9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0243  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ArrayList toOptions(List list, boolean z) {
        InstrumentSelectionBlocker.InstrumentOption.NewLinkIcon newLinkIcon;
        InstrumentSelectionBlocker.InstrumentOption.CardIcon cardIcon;
        InstrumentSelectionBlocker.InstrumentOption.BankIcon bankIcon;
        InstrumentSelectionBlocker.InstrumentOption.BalanceIcon balanceIcon;
        InstrumentSelectionBlocker.InstrumentOption.AppIcon appIcon;
        DigitalWalletType digitalWalletType;
        InstrumentSelectionBlocker.InstrumentOption.EmojiIcon emojiIcon;
        InstrumentSelectionData.InstrumentOption.IconStyle emojiIcon2;
        InstrumentSelectionData.InstrumentOption.IconStyle iconStyle;
        InstrumentSelectionData.InstrumentOption.IconStyle iconStyle2;
        InstrumentSelectionBlocker.InstrumentOption.State state;
        InstrumentSelectionBlocker.InstrumentOption.EnabledState enabledState;
        InstrumentSelectionBlocker.InstrumentOption.DisabledState disabledState;
        Parcelable disabled;
        Parcelable parcelable;
        InstrumentSelectionBlocker.ShowDialogAction showDialogAction;
        InstrumentSelectionBlocker.InstrumentOption.EnabledState.SubmitInstrumentAction submitInstrumentAction;
        InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction selectInstrumentAction;
        InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.Detail detail;
        InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.DetailList detailList;
        InstrumentSelectionData.InstrumentOption.PreselectableOption.Detail detail2;
        InstrumentSelectionData.InstrumentOption.PreselectableOption.Detail detailList2;
        InstrumentSelectionData.InstrumentOption.PreselectableOption.Detail.DetailInfoDialog detailInfoDialog;
        InstrumentSelectionData.InstrumentOption.PreselectableOption.Detail.DetailInfoDialog detailInfoDialog2;
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
                throw null;
            }
            InstrumentSelectionBlocker.InstrumentOption instrumentOption = (InstrumentSelectionBlocker.InstrumentOption) obj;
            InstrumentSelectionBlocker.InstrumentOption.IconStyle iconStyle3 = instrumentOption.icon_style;
            Image image = instrumentOption.avatar;
            if (iconStyle3 != null) {
                InstrumentSelectionBlocker.InstrumentOption.IconStyle.NewLinkIcon newLinkIcon2 = iconStyle3 instanceof InstrumentSelectionBlocker.InstrumentOption.IconStyle.NewLinkIcon ? (InstrumentSelectionBlocker.InstrumentOption.IconStyle.NewLinkIcon) iconStyle3 : null;
                if (newLinkIcon2 != null) {
                    newLinkIcon = newLinkIcon2.getValue();
                    if (newLinkIcon == null) {
                        iconStyle = InstrumentSelectionData.InstrumentOption.IconStyle.NewLink.INSTANCE;
                    } else {
                        if (iconStyle3 != null) {
                            InstrumentSelectionBlocker.InstrumentOption.IconStyle.CardIcon cardIcon2 = iconStyle3 instanceof InstrumentSelectionBlocker.InstrumentOption.IconStyle.CardIcon ? (InstrumentSelectionBlocker.InstrumentOption.IconStyle.CardIcon) iconStyle3 : null;
                            if (cardIcon2 != null) {
                                cardIcon = cardIcon2.getValue();
                                if (cardIcon == null) {
                                    iconStyle = InstrumentSelectionData.InstrumentOption.IconStyle.Card.INSTANCE;
                                } else {
                                    if (iconStyle3 != null) {
                                        InstrumentSelectionBlocker.InstrumentOption.IconStyle.BankIcon bankIcon2 = iconStyle3 instanceof InstrumentSelectionBlocker.InstrumentOption.IconStyle.BankIcon ? (InstrumentSelectionBlocker.InstrumentOption.IconStyle.BankIcon) iconStyle3 : null;
                                        if (bankIcon2 != null) {
                                            bankIcon = bankIcon2.getValue();
                                            if (bankIcon == null) {
                                                iconStyle = InstrumentSelectionData.InstrumentOption.IconStyle.Bank.INSTANCE;
                                            } else {
                                                if (iconStyle3 != null) {
                                                    InstrumentSelectionBlocker.InstrumentOption.IconStyle.BalanceIcon balanceIcon2 = iconStyle3 instanceof InstrumentSelectionBlocker.InstrumentOption.IconStyle.BalanceIcon ? (InstrumentSelectionBlocker.InstrumentOption.IconStyle.BalanceIcon) iconStyle3 : null;
                                                    if (balanceIcon2 != null) {
                                                        balanceIcon = balanceIcon2.getValue();
                                                        if (balanceIcon == null) {
                                                            InstrumentSelectionBlocker.InstrumentOption.IconStyle.BalanceIcon balanceIcon3 = iconStyle3 instanceof InstrumentSelectionBlocker.InstrumentOption.IconStyle.BalanceIcon ? (InstrumentSelectionBlocker.InstrumentOption.IconStyle.BalanceIcon) iconStyle3 : null;
                                                            InstrumentSelectionBlocker.InstrumentOption.BalanceIcon value = balanceIcon3 != null ? balanceIcon3.getValue() : null;
                                                            value.getClass();
                                                            CurrencyCode currencyCode = value.currency_code;
                                                            currencyCode.getClass();
                                                            emojiIcon2 = new InstrumentSelectionData.InstrumentOption.IconStyle.Balance(currencyCode);
                                                        } else {
                                                            if (iconStyle3 != null) {
                                                                InstrumentSelectionBlocker.InstrumentOption.IconStyle.AppIcon appIcon2 = iconStyle3 instanceof InstrumentSelectionBlocker.InstrumentOption.IconStyle.AppIcon ? (InstrumentSelectionBlocker.InstrumentOption.IconStyle.AppIcon) iconStyle3 : null;
                                                                if (appIcon2 != null) {
                                                                    appIcon = appIcon2.getValue();
                                                                    if (appIcon == null) {
                                                                        iconStyle = InstrumentSelectionData.InstrumentOption.IconStyle.AppIcon.INSTANCE;
                                                                    } else {
                                                                        if (iconStyle3 != null) {
                                                                            InstrumentSelectionBlocker.InstrumentOption.IconStyle.DigitalWalletIcon digitalWalletIcon = iconStyle3 instanceof InstrumentSelectionBlocker.InstrumentOption.IconStyle.DigitalWalletIcon ? (InstrumentSelectionBlocker.InstrumentOption.IconStyle.DigitalWalletIcon) iconStyle3 : null;
                                                                            InstrumentSelectionBlocker.InstrumentOption.DigitalWalletIcon value2 = digitalWalletIcon != null ? digitalWalletIcon.getValue() : null;
                                                                            if (value2 != null) {
                                                                                digitalWalletType = value2.type;
                                                                                if (digitalWalletType != DigitalWalletType.GOOGLE_PAY) {
                                                                                    iconStyle = InstrumentSelectionData.InstrumentOption.IconStyle.GooglePayIcon.INSTANCE;
                                                                                } else {
                                                                                    if (iconStyle3 != null) {
                                                                                        InstrumentSelectionBlocker.InstrumentOption.IconStyle.EmojiIcon emojiIcon3 = iconStyle3 instanceof InstrumentSelectionBlocker.InstrumentOption.IconStyle.EmojiIcon ? (InstrumentSelectionBlocker.InstrumentOption.IconStyle.EmojiIcon) iconStyle3 : null;
                                                                                        if (emojiIcon3 != null) {
                                                                                            emojiIcon = emojiIcon3.getValue();
                                                                                            if (emojiIcon != null) {
                                                                                                a$$ExternalSyntheticBUOutline0.m$3("No icon style provided for instrument option");
                                                                                                return null;
                                                                                            }
                                                                                            InstrumentSelectionBlocker.InstrumentOption.IconStyle.EmojiIcon emojiIcon4 = iconStyle3 instanceof InstrumentSelectionBlocker.InstrumentOption.IconStyle.EmojiIcon ? (InstrumentSelectionBlocker.InstrumentOption.IconStyle.EmojiIcon) iconStyle3 : null;
                                                                                            InstrumentSelectionBlocker.InstrumentOption.EmojiIcon value3 = emojiIcon4 != null ? emojiIcon4.getValue() : null;
                                                                                            value3.getClass();
                                                                                            String str = value3.icon_id;
                                                                                            if (str == null) {
                                                                                                a$$ExternalSyntheticBUOutline0.m$3("Emoji icon ID must be provided for emoji icon style.");
                                                                                                return null;
                                                                                            }
                                                                                            emojiIcon2 = new InstrumentSelectionData.InstrumentOption.IconStyle.EmojiIcon(str);
                                                                                        }
                                                                                    }
                                                                                    emojiIcon = null;
                                                                                    if (emojiIcon != null) {
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        digitalWalletType = null;
                                                                        if (digitalWalletType != DigitalWalletType.GOOGLE_PAY) {
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            appIcon = null;
                                                            if (appIcon == null) {
                                                            }
                                                        }
                                                        iconStyle2 = emojiIcon2;
                                                        InstrumentSelectionBlocker.OptionStyle optionStyle = instrumentOption.option_style;
                                                        optionStyle.getClass();
                                                        String str2 = instrumentOption.list_title;
                                                        str2.getClass();
                                                        RedactedString redactedString = new RedactedString(str2);
                                                        String str3 = instrumentOption.list_subtitle_primary;
                                                        RedactedString redactedString2 = str3 == null ? new RedactedString(str3) : null;
                                                        String str4 = instrumentOption.list_subtitle_suffix;
                                                        InstrumentSelectionData.InstrumentOption.Data data = new InstrumentSelectionData.InstrumentOption.Data(image, iconStyle2, optionStyle, redactedString, redactedString2, str4 == null ? new RedactedString(str4) : null, instrumentOption.list_pill_text);
                                                        state = instrumentOption.state;
                                                        if (state != null) {
                                                            InstrumentSelectionBlocker.InstrumentOption.State.EnabledState enabledState2 = state instanceof InstrumentSelectionBlocker.InstrumentOption.State.EnabledState ? (InstrumentSelectionBlocker.InstrumentOption.State.EnabledState) state : null;
                                                            if (enabledState2 != null) {
                                                                enabledState = enabledState2.getValue();
                                                                if (enabledState != null) {
                                                                    InstrumentSelectionBlocker.InstrumentOption.State.EnabledState enabledState3 = state instanceof InstrumentSelectionBlocker.InstrumentOption.State.EnabledState ? (InstrumentSelectionBlocker.InstrumentOption.State.EnabledState) state : null;
                                                                    InstrumentSelectionBlocker.InstrumentOption.EnabledState value4 = enabledState3 != null ? enabledState3.getValue() : null;
                                                                    value4.getClass();
                                                                    InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectionAction selectionAction = value4.selection_action;
                                                                    if (selectionAction != null) {
                                                                        InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectionAction.ShowDialogAction showDialogAction2 = selectionAction instanceof InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectionAction.ShowDialogAction ? (InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectionAction.ShowDialogAction) selectionAction : null;
                                                                        if (showDialogAction2 != null) {
                                                                            showDialogAction = showDialogAction2.getValue();
                                                                            if (showDialogAction != null) {
                                                                                InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectionAction selectionAction2 = value4.selection_action;
                                                                                if (selectionAction2 != null) {
                                                                                    InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectionAction.SubmitInstrumentAction submitInstrumentAction2 = selectionAction2 instanceof InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectionAction.SubmitInstrumentAction ? (InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectionAction.SubmitInstrumentAction) selectionAction2 : null;
                                                                                    if (submitInstrumentAction2 != null) {
                                                                                        submitInstrumentAction = submitInstrumentAction2.getValue();
                                                                                        if (submitInstrumentAction != null) {
                                                                                            InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectionAction selectionAction3 = value4.selection_action;
                                                                                            if (selectionAction3 != null) {
                                                                                                InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectionAction.SelectInstrumentAction selectInstrumentAction2 = selectionAction3 instanceof InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectionAction.SelectInstrumentAction ? (InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectionAction.SelectInstrumentAction) selectionAction3 : null;
                                                                                                if (selectInstrumentAction2 != null) {
                                                                                                    selectInstrumentAction = selectInstrumentAction2.getValue();
                                                                                                    if (selectInstrumentAction != null) {
                                                                                                        a$$ExternalSyntheticBUOutline0.m$3("No action provided for instrument option");
                                                                                                        return null;
                                                                                                    }
                                                                                                    InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectionAction selectionAction4 = value4.selection_action;
                                                                                                    selectionAction4.getClass();
                                                                                                    InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectionAction.SelectInstrumentAction selectInstrumentAction3 = selectionAction4 instanceof InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectionAction.SelectInstrumentAction ? (InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectionAction.SelectInstrumentAction) selectionAction4 : null;
                                                                                                    InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction value5 = selectInstrumentAction3 != null ? selectInstrumentAction3.getValue() : null;
                                                                                                    value5.getClass();
                                                                                                    InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.InstrumentDetails instrumentDetails = value5.instrument_details;
                                                                                                    if (instrumentDetails != null) {
                                                                                                        InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.InstrumentDetails.Detail detail3 = instrumentDetails instanceof InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.InstrumentDetails.Detail ? (InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.InstrumentDetails.Detail) instrumentDetails : null;
                                                                                                        if (detail3 != null) {
                                                                                                            detail = detail3.getValue();
                                                                                                            InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.InstrumentDetails instrumentDetails2 = value5.instrument_details;
                                                                                                            if (detail == null) {
                                                                                                                instrumentDetails2.getClass();
                                                                                                                InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.InstrumentDetails.Detail detail4 = instrumentDetails2 instanceof InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.InstrumentDetails.Detail ? (InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.InstrumentDetails.Detail) instrumentDetails2 : null;
                                                                                                                InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.Detail value6 = detail4 != null ? detail4.getValue() : null;
                                                                                                                value6.getClass();
                                                                                                                String str5 = value6.text;
                                                                                                                InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.InstrumentDetailsDialog instrumentDetailsDialog = value6.dialog;
                                                                                                                if (instrumentDetailsDialog != null) {
                                                                                                                    String str6 = instrumentDetailsDialog.info_dialog_text;
                                                                                                                    str6.getClass();
                                                                                                                    String str7 = instrumentDetailsDialog.info_dialog_dismiss_button_text;
                                                                                                                    str7.getClass();
                                                                                                                    detailInfoDialog2 = new InstrumentSelectionData.InstrumentOption.PreselectableOption.Detail.DetailInfoDialog(str6, str7);
                                                                                                                } else {
                                                                                                                    detailInfoDialog2 = null;
                                                                                                                }
                                                                                                                detailList2 = new InstrumentSelectionData.InstrumentOption.PreselectableOption.Detail.DetailText(str5, detailInfoDialog2);
                                                                                                            } else {
                                                                                                                if (instrumentDetails2 != null) {
                                                                                                                    InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.InstrumentDetails.DetailList detailList3 = instrumentDetails2 instanceof InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.InstrumentDetails.DetailList ? (InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.InstrumentDetails.DetailList) instrumentDetails2 : null;
                                                                                                                    if (detailList3 != null) {
                                                                                                                        detailList = detailList3.getValue();
                                                                                                                        if (detailList == null) {
                                                                                                                            InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.InstrumentDetails instrumentDetails3 = value5.instrument_details;
                                                                                                                            instrumentDetails3.getClass();
                                                                                                                            InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.InstrumentDetails.DetailList detailList4 = instrumentDetails3 instanceof InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.InstrumentDetails.DetailList ? (InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.InstrumentDetails.DetailList) instrumentDetails3 : null;
                                                                                                                            InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.DetailList value7 = detailList4 != null ? detailList4.getValue() : null;
                                                                                                                            value7.getClass();
                                                                                                                            List<InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.DetailList.DetailRow> list3 = value7.detail_rows;
                                                                                                                            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                                                                                                                            for (InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.DetailList.DetailRow detailRow : list3) {
                                                                                                                                String str8 = detailRow.label;
                                                                                                                                str8.getClass();
                                                                                                                                String str9 = detailRow.value;
                                                                                                                                str9.getClass();
                                                                                                                                InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.InstrumentDetailsDialog instrumentDetailsDialog2 = detailRow.dialog;
                                                                                                                                if (instrumentDetailsDialog2 != null) {
                                                                                                                                    String str10 = instrumentDetailsDialog2.info_dialog_text;
                                                                                                                                    str10.getClass();
                                                                                                                                    String str11 = instrumentDetailsDialog2.info_dialog_dismiss_button_text;
                                                                                                                                    str11.getClass();
                                                                                                                                    detailInfoDialog = new InstrumentSelectionData.InstrumentOption.PreselectableOption.Detail.DetailInfoDialog(str10, str11);
                                                                                                                                } else {
                                                                                                                                    detailInfoDialog = null;
                                                                                                                                }
                                                                                                                                arrayList2.add(new InstrumentSelectionData.InstrumentOption.PreselectableOption.Detail.DetailList.DetailRow(str8, str9, detailInfoDialog));
                                                                                                                            }
                                                                                                                            detailList2 = new InstrumentSelectionData.InstrumentOption.PreselectableOption.Detail.DetailList(arrayList2);
                                                                                                                        } else {
                                                                                                                            detail2 = null;
                                                                                                                            ByteString byteString = value4.encoded_selected_option;
                                                                                                                            byteString.getClass();
                                                                                                                            String str12 = value5.selected_title;
                                                                                                                            str12.getClass();
                                                                                                                            RedactedString redactedString3 = new RedactedString(str12);
                                                                                                                            String str13 = value5.selected_subtitle_primary;
                                                                                                                            RedactedString redactedString4 = str13 != null ? new RedactedString(str13) : null;
                                                                                                                            String str14 = value5.selected_subtitle_suffix;
                                                                                                                            RedactedString redactedString5 = str14 != null ? new RedactedString(str14) : null;
                                                                                                                            String str15 = value5.instrument_header_text;
                                                                                                                            disabled = new InstrumentSelectionData.InstrumentOption.Enabled.SelectOption(i, byteString, data, redactedString3, redactedString4, redactedString5, detail2, (str15 != null || str15.length() <= 0) ? null : str15);
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                                detailList = null;
                                                                                                                if (detailList == null) {
                                                                                                                }
                                                                                                            }
                                                                                                            detail2 = detailList2;
                                                                                                            ByteString byteString2 = value4.encoded_selected_option;
                                                                                                            byteString2.getClass();
                                                                                                            String str122 = value5.selected_title;
                                                                                                            str122.getClass();
                                                                                                            RedactedString redactedString32 = new RedactedString(str122);
                                                                                                            String str132 = value5.selected_subtitle_primary;
                                                                                                            if (str132 != null) {
                                                                                                            }
                                                                                                            String str142 = value5.selected_subtitle_suffix;
                                                                                                            if (str142 != null) {
                                                                                                            }
                                                                                                            String str152 = value5.instrument_header_text;
                                                                                                            disabled = new InstrumentSelectionData.InstrumentOption.Enabled.SelectOption(i, byteString2, data, redactedString32, redactedString4, redactedString5, detail2, (str152 != null || str152.length() <= 0) ? null : str152);
                                                                                                        }
                                                                                                    }
                                                                                                    detail = null;
                                                                                                    InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.InstrumentDetails instrumentDetails22 = value5.instrument_details;
                                                                                                    if (detail == null) {
                                                                                                    }
                                                                                                    detail2 = detailList2;
                                                                                                    ByteString byteString22 = value4.encoded_selected_option;
                                                                                                    byteString22.getClass();
                                                                                                    String str1222 = value5.selected_title;
                                                                                                    str1222.getClass();
                                                                                                    RedactedString redactedString322 = new RedactedString(str1222);
                                                                                                    String str1322 = value5.selected_subtitle_primary;
                                                                                                    if (str1322 != null) {
                                                                                                    }
                                                                                                    String str1422 = value5.selected_subtitle_suffix;
                                                                                                    if (str1422 != null) {
                                                                                                    }
                                                                                                    String str1522 = value5.instrument_header_text;
                                                                                                    disabled = new InstrumentSelectionData.InstrumentOption.Enabled.SelectOption(i, byteString22, data, redactedString322, redactedString4, redactedString5, detail2, (str1522 != null || str1522.length() <= 0) ? null : str1522);
                                                                                                }
                                                                                            }
                                                                                            selectInstrumentAction = null;
                                                                                            if (selectInstrumentAction != null) {
                                                                                            }
                                                                                        } else {
                                                                                            if (z) {
                                                                                                a$$ExternalSyntheticBUOutline0.m$3("SelectInstrumentAction was expected, but found SubmitInstrumentAction");
                                                                                                return null;
                                                                                            }
                                                                                            ByteString byteString3 = value4.encoded_selected_option;
                                                                                            byteString3.getClass();
                                                                                            parcelable = new InstrumentSelectionData.InstrumentOption.Enabled.SubmitOption(i, byteString3, data);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                submitInstrumentAction = null;
                                                                                if (submitInstrumentAction != null) {
                                                                                }
                                                                            } else {
                                                                                if (z) {
                                                                                    a$$ExternalSyntheticBUOutline0.m$3("SelectInstrumentAction was expected, but found ShowDialogAction");
                                                                                    return null;
                                                                                }
                                                                                InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectionAction selectionAction5 = value4.selection_action;
                                                                                selectionAction5.getClass();
                                                                                InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectionAction.ShowDialogAction showDialogAction3 = selectionAction5 instanceof InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectionAction.ShowDialogAction ? (InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectionAction.ShowDialogAction) selectionAction5 : null;
                                                                                InstrumentSelectionBlocker.ShowDialogAction value8 = showDialogAction3 != null ? showDialogAction3.getValue() : null;
                                                                                value8.getClass();
                                                                                ByteString byteString4 = value4.encoded_selected_option;
                                                                                byteString4.getClass();
                                                                                String str16 = value8.title;
                                                                                str16.getClass();
                                                                                RedactedString redactedString6 = new RedactedString(str16);
                                                                                String str17 = value8.body;
                                                                                RedactedString redactedString7 = str17 != null ? new RedactedString(str17) : null;
                                                                                String str18 = value8.submit_button_text;
                                                                                BlockerAction blockerAction = value8.blocker_action;
                                                                                if (blockerAction == null) {
                                                                                    blockerAction = BlockersOneofExtensionsKt.BlockerAction$default(null, new BlockerAction.SubmitAction("id", null, null, null, 14, null), 1);
                                                                                }
                                                                                String str19 = value8.dismiss_button_text;
                                                                                str19.getClass();
                                                                                parcelable = new InstrumentSelectionData.InstrumentOption.Enabled.ShowDialogOption(i, byteString4, data, new InstrumentSelectionData.InstrumentOption.Enabled.OptionDialog(redactedString6, redactedString7, str18, blockerAction, str19));
                                                                            }
                                                                            arrayList.add(parcelable);
                                                                            i = i2;
                                                                        }
                                                                    }
                                                                    showDialogAction = null;
                                                                    if (showDialogAction != null) {
                                                                    }
                                                                    arrayList.add(parcelable);
                                                                    i = i2;
                                                                } else {
                                                                    if (state != null) {
                                                                        InstrumentSelectionBlocker.InstrumentOption.State.DisabledState disabledState2 = state instanceof InstrumentSelectionBlocker.InstrumentOption.State.DisabledState ? (InstrumentSelectionBlocker.InstrumentOption.State.DisabledState) state : null;
                                                                        if (disabledState2 != null) {
                                                                            disabledState = disabledState2.getValue();
                                                                            if (disabledState != null) {
                                                                                a$$ExternalSyntheticBUOutline0.m$3("No state provided for instrument option");
                                                                                return null;
                                                                            }
                                                                            InstrumentSelectionBlocker.InstrumentOption.State.DisabledState disabledState3 = state instanceof InstrumentSelectionBlocker.InstrumentOption.State.DisabledState ? (InstrumentSelectionBlocker.InstrumentOption.State.DisabledState) state : null;
                                                                            InstrumentSelectionBlocker.InstrumentOption.DisabledState value9 = disabledState3 != null ? disabledState3.getValue() : null;
                                                                            value9.getClass();
                                                                            String str20 = value9.selected_title;
                                                                            RedactedString redactedString8 = str20 != null ? new RedactedString(str20) : null;
                                                                            String str21 = value9.selected_subtitle_primary;
                                                                            RedactedString redactedString9 = str21 != null ? new RedactedString(str21) : null;
                                                                            String str22 = value9.selected_subtitle_suffix;
                                                                            disabled = new InstrumentSelectionData.InstrumentOption.Disabled(i, data, redactedString8, redactedString9, str22 != null ? new RedactedString(str22) : null, null, null);
                                                                        }
                                                                    }
                                                                    disabledState = null;
                                                                    if (disabledState != null) {
                                                                    }
                                                                }
                                                                parcelable = disabled;
                                                                arrayList.add(parcelable);
                                                                i = i2;
                                                            }
                                                        }
                                                        enabledState = null;
                                                        if (enabledState != null) {
                                                        }
                                                        parcelable = disabled;
                                                        arrayList.add(parcelable);
                                                        i = i2;
                                                    }
                                                }
                                                balanceIcon = null;
                                                if (balanceIcon == null) {
                                                }
                                                iconStyle2 = emojiIcon2;
                                                InstrumentSelectionBlocker.OptionStyle optionStyle2 = instrumentOption.option_style;
                                                optionStyle2.getClass();
                                                String str23 = instrumentOption.list_title;
                                                str23.getClass();
                                                RedactedString redactedString10 = new RedactedString(str23);
                                                String str32 = instrumentOption.list_subtitle_primary;
                                                if (str32 == null) {
                                                }
                                                String str42 = instrumentOption.list_subtitle_suffix;
                                                InstrumentSelectionData.InstrumentOption.Data data2 = new InstrumentSelectionData.InstrumentOption.Data(image, iconStyle2, optionStyle2, redactedString10, redactedString2, str42 == null ? new RedactedString(str42) : null, instrumentOption.list_pill_text);
                                                state = instrumentOption.state;
                                                if (state != null) {
                                                }
                                                enabledState = null;
                                                if (enabledState != null) {
                                                }
                                                parcelable = disabled;
                                                arrayList.add(parcelable);
                                                i = i2;
                                            }
                                        }
                                    }
                                    bankIcon = null;
                                    if (bankIcon == null) {
                                    }
                                }
                            }
                        }
                        cardIcon = null;
                        if (cardIcon == null) {
                        }
                    }
                    iconStyle2 = iconStyle;
                    InstrumentSelectionBlocker.OptionStyle optionStyle22 = instrumentOption.option_style;
                    optionStyle22.getClass();
                    String str232 = instrumentOption.list_title;
                    str232.getClass();
                    RedactedString redactedString102 = new RedactedString(str232);
                    String str322 = instrumentOption.list_subtitle_primary;
                    if (str322 == null) {
                    }
                    String str422 = instrumentOption.list_subtitle_suffix;
                    InstrumentSelectionData.InstrumentOption.Data data22 = new InstrumentSelectionData.InstrumentOption.Data(image, iconStyle2, optionStyle22, redactedString102, redactedString2, str422 == null ? new RedactedString(str422) : null, instrumentOption.list_pill_text);
                    state = instrumentOption.state;
                    if (state != null) {
                    }
                    enabledState = null;
                    if (enabledState != null) {
                    }
                    parcelable = disabled;
                    arrayList.add(parcelable);
                    i = i2;
                }
            }
            newLinkIcon = null;
            if (newLinkIcon == null) {
            }
            iconStyle2 = iconStyle;
            InstrumentSelectionBlocker.OptionStyle optionStyle222 = instrumentOption.option_style;
            optionStyle222.getClass();
            String str2322 = instrumentOption.list_title;
            str2322.getClass();
            RedactedString redactedString1022 = new RedactedString(str2322);
            String str3222 = instrumentOption.list_subtitle_primary;
            if (str3222 == null) {
            }
            String str4222 = instrumentOption.list_subtitle_suffix;
            InstrumentSelectionData.InstrumentOption.Data data222 = new InstrumentSelectionData.InstrumentOption.Data(image, iconStyle2, optionStyle222, redactedString1022, redactedString2, str4222 == null ? new RedactedString(str4222) : null, instrumentOption.list_pill_text);
            state = instrumentOption.state;
            if (state != null) {
            }
            enabledState = null;
            if (enabledState != null) {
            }
            parcelable = disabled;
            arrayList.add(parcelable);
            i = i2;
        }
        return arrayList;
    }
}
