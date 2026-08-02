package com.google.android.gms.internal.mlkit_common;

import com.plaid.internal.EnumC0170g;
import com.squareup.cash.banking.observability.ProtoParsingError;
import com.squareup.cash.earnings.backend.api.model.EarningsUiConfiguration;
import com.squareup.cash.observability.protovalidation.ProtoParsingError;
import com.squareup.cash.observability.protovalidation.ProtoValidationScope;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.work.webview.views.WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.StringsKt;
import squareup.cash.earnings.ActionButton;
import squareup.cash.earnings.ActiveDistributionSection;
import squareup.cash.earnings.ActivitySection;
import squareup.cash.earnings.AddPaycheckTool;
import squareup.cash.earnings.EarnerModeSheetData;
import squareup.cash.earnings.EarnerModeTool;
import squareup.cash.earnings.EarnerOnboardingTool;
import squareup.cash.earnings.EarningCardSection;
import squareup.cash.earnings.EarningTool;
import squareup.cash.earnings.EarningToolsSection;
import squareup.cash.earnings.EarningsHomeUi;
import squareup.cash.earnings.ManageCustomersTool;
import squareup.cash.earnings.PaycheckDistributionTool;

/* loaded from: classes10.dex */
public abstract class zzy implements ModelJsonParser {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x03cb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x038a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0013 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0141 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x010a A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v2, types: [com.squareup.cash.earnings.backend.api.model.EarningsUiConfiguration$EarningsHomeUi$EarningsHomeSection$EarningToolsSection$EarningToolItem$AddPaycheck] */
    /* JADX WARN: Type inference failed for: r11v3, types: [com.squareup.cash.earnings.backend.api.model.EarningsUiConfiguration$EarningsHomeUi$EarningsHomeSection$EarningToolsSection$EarningToolItem$ManageCustomers] */
    /* JADX WARN: Type inference failed for: r11v4, types: [com.squareup.cash.earnings.backend.api.model.EarningsUiConfiguration$EarningsHomeUi$EarningsHomeSection$EarningToolsSection$EarningToolItem$EarnerOnboarding] */
    /* JADX WARN: Type inference failed for: r11v7, types: [com.squareup.cash.earnings.backend.api.model.EarningsUiConfiguration$EarningsHomeUi$EarningsHomeSection$EarningToolsSection$EarningToolItem$EarnerMode] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v6, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r15v9, types: [com.squareup.cash.earnings.backend.api.model.EarningsUiConfiguration$EarningsHomeUi$EarningsHomeSection$EarningToolsSection$EarningToolItem$EarnerModeSheetData$DurationOption] */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1, types: [com.squareup.cash.earnings.backend.api.model.EarningsUiConfiguration$EarningsHomeUi$EarningsHomeSection$EarningToolsSection$EarningToolItem$EarnerModeSheetData] */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r22v17 */
    /* JADX WARN: Type inference failed for: r22v18 */
    /* JADX WARN: Type inference failed for: r22v4, types: [com.squareup.cash.earnings.backend.api.model.EarningsUiConfiguration$EarningsHomeUi] */
    /* JADX WARN: Type inference failed for: r22v6 */
    /* JADX WARN: Type inference failed for: r22v7 */
    /* JADX WARN: Type inference failed for: r22v9 */
    /* JADX WARN: Type inference failed for: r5v12, types: [com.squareup.cash.earnings.backend.api.model.EarningsUiConfiguration$EarningsHomeUi$EarningsHomeSection$EarningToolsSection] */
    /* JADX WARN: Type inference failed for: r5v26, types: [com.squareup.cash.earnings.backend.api.model.EarningsUiConfiguration$EarningsHomeUi$EarningsHomeSection$HeaderSection] */
    /* JADX WARN: Type inference failed for: r6v40, types: [com.squareup.cash.earnings.backend.api.model.EarningsUiConfiguration$EarningsHomeUi$EarningsHomeSection$ActionButtonsSection] */
    /* JADX WARN: Type inference failed for: r6v41, types: [com.squareup.cash.earnings.backend.api.model.EarningsUiConfiguration$EarningsHomeUi$EarningsHomeSection$FdicFooterSection] */
    /* JADX WARN: Type inference failed for: r6v43, types: [com.squareup.cash.earnings.backend.api.model.EarningsUiConfiguration$EarningsHomeUi$EarningsHomeSection$ActiveDistributionSection] */
    /* JADX WARN: Type inference failed for: r7v38, types: [com.squareup.cash.earnings.backend.api.model.EarningsUiConfiguration$EarningsHomeUi$EarningsHomeSection$DistributionNuxSection] */
    /* JADX WARN: Type inference failed for: r8v36, types: [com.squareup.cash.earnings.backend.api.model.EarningsUiConfiguration$EarningsHomeUi$EarningsHomeSection$ActivitySection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final EarningsUiConfiguration.EarningsHomeUi toEarningsHomeUi(ProtoValidationScope protoValidationScope, EarningsHomeUi earningsHomeUi) {
        String str;
        ?? r22;
        ArrayList arrayList;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        EarningsUiConfiguration.EarningsHomeUi.EarningsHomeSection.EarningToolsSection.EarningToolItem.PaycheckDistribution paycheckDistribution;
        String str14;
        ?? r17;
        String str15;
        String str16;
        Object obj;
        String str17;
        String str18;
        LocalizedString localizedString;
        String str19;
        String str20;
        EarningsUiConfiguration.EarningsHomeUi.EarningsHomeSection.ActionButtonsSection.ActionButtonItem actionButtonItem;
        String str21;
        String str22;
        String reportIfNullAndContinue;
        String reportIfNullAndContinue2;
        String reportIfNullAndContinue3;
        String reportIfNullAndContinue4;
        String str23;
        String reportIfNullAndContinue5;
        String str24;
        List list = earningsHomeUi.sections;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            EarningsHomeUi.Section.AbstractC0087Section abstractC0087Section = ((EarningsHomeUi.Section) it.next()).section;
            String str25 = null;
            r6 = null;
            r6 = null;
            r6 = null;
            r6 = null;
            r6 = null;
            r6 = null;
            r6 = null;
            r6 = null;
            r6 = null;
            String str26 = null;
            if (abstractC0087Section instanceof EarningsHomeUi.Section.AbstractC0087Section.Header) {
                LocalizedString localizedString2 = ((EarningsHomeUi.Section.AbstractC0087Section.Header) abstractC0087Section).value.title;
                str24 = new EarningsUiConfiguration.EarningsHomeUi.EarningsHomeSection.HeaderSection(localizedString2 != null ? localizedString2.translated_value : null);
            } else {
                if (abstractC0087Section instanceof EarningsHomeUi.Section.AbstractC0087Section.Activity) {
                    ActivitySection activitySection = ((EarningsHomeUi.Section.AbstractC0087Section.Activity) abstractC0087Section).value;
                    String reportIfNullAndContinue6 = protoValidationScope.reportIfNullAndContinue(activitySection.title, "activity title", (String) null);
                    if (reportIfNullAndContinue6 != null && (reportIfNullAndContinue5 = protoValidationScope.reportIfNullAndContinue(activitySection.view_all_button_title, "activity view_all_button_title", (String) null)) != null) {
                        str26 = new EarningsUiConfiguration.EarningsHomeUi.EarningsHomeSection.ActivitySection(reportIfNullAndContinue6, reportIfNullAndContinue6, protoValidationScope.reportIfNullAndContinue(activitySection.no_activity_subtitle, "activity no_activity_subtitle", (String) null), protoValidationScope.reportIfNullAndContinue(activitySection.load_failure_subtitle, "activity load_failure_subtitle", (String) null), reportIfNullAndContinue5);
                    }
                } else if (abstractC0087Section instanceof EarningsHomeUi.Section.AbstractC0087Section.ActiveDistribution) {
                    ActiveDistributionSection activeDistributionSection = ((EarningsHomeUi.Section.AbstractC0087Section.ActiveDistribution) abstractC0087Section).value;
                    String reportIfNullAndContinue7 = protoValidationScope.reportIfNullAndContinue(activeDistributionSection.title_text, "active_distribution title_text", (String) null);
                    if (reportIfNullAndContinue7 != null && (reportIfNullAndContinue4 = protoValidationScope.reportIfNullAndContinue(activeDistributionSection.edit_button_text, "active_distribution edit_button_text", (String) null)) != null && (str23 = (String) protoValidationScope.reportIfNullAndContinue("active_distribution client_route", (String) null, activeDistributionSection.client_route)) != null) {
                        str26 = new EarningsUiConfiguration.EarningsHomeUi.EarningsHomeSection.ActiveDistributionSection(reportIfNullAndContinue7, reportIfNullAndContinue4, str23, activeDistributionSection.stream_avatars);
                    }
                } else if (abstractC0087Section instanceof EarningsHomeUi.Section.AbstractC0087Section.EarningCard) {
                    EarningCardSection earningCardSection = ((EarningsHomeUi.Section.AbstractC0087Section.EarningCard) abstractC0087Section).value;
                    String str27 = (String) protoValidationScope.reportIfNullAndContinue("earning_card client_route", (String) null, earningCardSection.client_route);
                    if (str27 != null && (reportIfNullAndContinue = protoValidationScope.reportIfNullAndContinue(earningCardSection.title, "earning_card title", (String) null)) != null && (reportIfNullAndContinue2 = protoValidationScope.reportIfNullAndContinue(earningCardSection.subtitle, "earning_card subtitle", (String) null)) != null && (reportIfNullAndContinue3 = protoValidationScope.reportIfNullAndContinue(earningCardSection.call_to_action_text, "earning_card call_to_action_text", (String) null)) != null) {
                        str26 = new EarningsUiConfiguration.EarningsHomeUi.EarningsHomeSection.DistributionNuxSection(earningCardSection.header_image, str27, reportIfNullAndContinue, reportIfNullAndContinue2, reportIfNullAndContinue3);
                    }
                } else if (abstractC0087Section instanceof EarningsHomeUi.Section.AbstractC0087Section.FdicFooter) {
                    str26 = EarningsUiConfiguration.EarningsHomeUi.EarningsHomeSection.FdicFooterSection.INSTANCE;
                } else if (abstractC0087Section instanceof EarningsHomeUi.Section.AbstractC0087Section.ActionButtons) {
                    List<ActionButton> list2 = ((EarningsHomeUi.Section.AbstractC0087Section.ActionButtons) abstractC0087Section).value.buttons;
                    ArrayList arrayList3 = new ArrayList();
                    for (ActionButton actionButton : list2) {
                        LocalizedString localizedString3 = actionButton.title;
                        if (localizedString3 != null && (str21 = localizedString3.translated_value) != null) {
                            if (StringsKt.isBlank(str21)) {
                                str21 = null;
                            }
                            if (str21 != null && (str22 = actionButton.client_route) != null) {
                                if (StringsKt.isBlank(str22)) {
                                    str22 = null;
                                }
                                if (str22 != null) {
                                    actionButtonItem = new EarningsUiConfiguration.EarningsHomeUi.EarningsHomeSection.ActionButtonsSection.ActionButtonItem(str21, str22);
                                    if (actionButtonItem == null) {
                                        arrayList3.add(actionButtonItem);
                                    }
                                }
                            }
                        }
                        actionButtonItem = null;
                        if (actionButtonItem == null) {
                        }
                    }
                    if (!arrayList3.isEmpty()) {
                        str26 = new EarningsUiConfiguration.EarningsHomeUi.EarningsHomeSection.ActionButtonsSection(arrayList3);
                    }
                } else {
                    if (abstractC0087Section instanceof EarningsHomeUi.Section.AbstractC0087Section.EarningTools) {
                        EarningToolsSection earningToolsSection = ((EarningsHomeUi.Section.AbstractC0087Section.EarningTools) abstractC0087Section).value;
                        List list3 = earningToolsSection.tools;
                        ArrayList arrayList4 = new ArrayList();
                        Iterator it2 = list3.iterator();
                        while (it2.hasNext()) {
                            EarningTool.Tool tool = ((EarningTool) it2.next()).tool;
                            if (tool instanceof EarningTool.Tool.EarnerMode) {
                                EarnerModeTool earnerModeTool = ((EarningTool.Tool.EarnerMode) tool).value;
                                LocalizedString localizedString4 = earnerModeTool.title;
                                if (localizedString4 != null && (str14 = localizedString4.translated_value) != null) {
                                    String str28 = !StringsKt.isBlank(str14) ? str14 : str25;
                                    if (str28 != null) {
                                        String str29 = earnerModeTool.client_route;
                                        String str30 = (str29 == null || StringsKt.isBlank(str29)) ? str25 : str29;
                                        EarnerModeSheetData earnerModeSheetData = earnerModeTool.earner_mode_sheet_data;
                                        if (earnerModeSheetData != null) {
                                            LocalizedString localizedString5 = earnerModeSheetData.title;
                                            if (localizedString5 != null && (str18 = localizedString5.translated_value) != null) {
                                                if (StringsKt.isBlank(str18)) {
                                                    str18 = str25;
                                                }
                                                if (str18 != null && (localizedString = earnerModeSheetData.body) != null && (str19 = localizedString.translated_value) != null) {
                                                    if (StringsKt.isBlank(str19)) {
                                                        str19 = str25;
                                                    }
                                                    if (str19 != null) {
                                                        List list4 = earnerModeSheetData.durations;
                                                        ArrayList arrayList5 = new ArrayList();
                                                        Iterator it3 = list4.iterator();
                                                        while (it3.hasNext()) {
                                                            long seconds = ((Duration) it3.next()).getSeconds();
                                                            ?? r15 = Long.valueOf(seconds);
                                                            if (seconds <= 0) {
                                                                r15 = str25;
                                                            }
                                                            String str31 = str25;
                                                            ArrayList arrayList6 = arrayList4;
                                                            String durationOption = r15 != null ? new EarningsUiConfiguration.EarningsHomeUi.EarningsHomeSection.EarningToolsSection.EarningToolItem.EarnerModeSheetData.DurationOption(r15.longValue()) : str31;
                                                            if (durationOption != null) {
                                                                arrayList5.add(durationOption);
                                                            }
                                                            str25 = str31;
                                                            arrayList4 = arrayList6;
                                                        }
                                                        str16 = str25;
                                                        arrayList = arrayList4;
                                                        LocalizedString localizedString6 = earnerModeSheetData.primary_button_text;
                                                        if (localizedString6 != null && (str20 = localizedString6.translated_value) != null) {
                                                            if (StringsKt.isBlank(str20)) {
                                                                str20 = str16;
                                                            }
                                                            if (str20 != null && !arrayList5.isEmpty()) {
                                                                obj = new EarningsUiConfiguration.EarningsHomeUi.EarningsHomeSection.EarningToolsSection.EarningToolItem.EarnerModeSheetData(str18, str19, str20, arrayList5);
                                                                str17 = str16;
                                                                r17 = obj;
                                                                r22 = str17;
                                                            }
                                                        }
                                                        obj = str16;
                                                        str17 = str16;
                                                        r17 = obj;
                                                        r22 = str17;
                                                    }
                                                }
                                            }
                                            str16 = str25;
                                            arrayList = arrayList4;
                                            obj = str16;
                                            str17 = str16;
                                            r17 = obj;
                                            r22 = str17;
                                        } else {
                                            String str32 = str25;
                                            arrayList = arrayList4;
                                            r17 = str32;
                                            r22 = str32;
                                        }
                                        if (str30 != null || r17 != null) {
                                            LocalizedString localizedString7 = earnerModeTool.subtitle;
                                            String str33 = (localizedString7 == null || (str15 = localizedString7.translated_value) == null || StringsKt.isBlank(str15)) ? r22 : str15;
                                            Boolean bool = earnerModeTool.earner_mode_state;
                                            paycheckDistribution = new EarningsUiConfiguration.EarningsHomeUi.EarningsHomeSection.EarningToolsSection.EarningToolItem.EarnerMode(str28, str33, bool != null ? bool.booleanValue() : false, earnerModeTool.earner_mode_ends_at, str30, r17);
                                            str13 = r22;
                                            ArrayList arrayList7 = arrayList;
                                            if (paycheckDistribution != null) {
                                                arrayList7.add(paycheckDistribution);
                                            }
                                            arrayList4 = arrayList7;
                                            str25 = str13;
                                        }
                                        paycheckDistribution = r22;
                                        str13 = r22;
                                        ArrayList arrayList72 = arrayList;
                                        if (paycheckDistribution != null) {
                                        }
                                        arrayList4 = arrayList72;
                                        str25 = str13;
                                    }
                                }
                                r22 = str25;
                                arrayList = arrayList4;
                                paycheckDistribution = r22;
                                str13 = r22;
                                ArrayList arrayList722 = arrayList;
                                if (paycheckDistribution != null) {
                                }
                                arrayList4 = arrayList722;
                                str25 = str13;
                            } else {
                                r22 = str25;
                                arrayList = arrayList4;
                                if (tool instanceof EarningTool.Tool.EarnerOnboarding) {
                                    EarnerOnboardingTool earnerOnboardingTool = ((EarningTool.Tool.EarnerOnboarding) tool).value;
                                    LocalizedString localizedString8 = earnerOnboardingTool.title;
                                    if (localizedString8 != null && (str10 = localizedString8.translated_value) != null) {
                                        if (StringsKt.isBlank(str10)) {
                                            str10 = r22;
                                        }
                                        if (str10 != null && (str11 = earnerOnboardingTool.client_route) != null) {
                                            if (StringsKt.isBlank(str11)) {
                                                str11 = r22;
                                            }
                                            if (str11 != null) {
                                                LocalizedString localizedString9 = earnerOnboardingTool.subtitle;
                                                if (localizedString9 == null || (str12 = localizedString9.translated_value) == null || StringsKt.isBlank(str12)) {
                                                    str12 = r22;
                                                }
                                                paycheckDistribution = new EarningsUiConfiguration.EarningsHomeUi.EarningsHomeSection.EarningToolsSection.EarningToolItem.EarnerOnboarding(str10, str12, str11);
                                                str13 = r22;
                                                ArrayList arrayList7222 = arrayList;
                                                if (paycheckDistribution != null) {
                                                }
                                                arrayList4 = arrayList7222;
                                                str25 = str13;
                                            }
                                        }
                                    }
                                    paycheckDistribution = r22;
                                    str13 = r22;
                                    ArrayList arrayList72222 = arrayList;
                                    if (paycheckDistribution != null) {
                                    }
                                    arrayList4 = arrayList72222;
                                    str25 = str13;
                                } else if (tool instanceof EarningTool.Tool.ManageCustomers) {
                                    ManageCustomersTool manageCustomersTool = ((EarningTool.Tool.ManageCustomers) tool).value;
                                    LocalizedString localizedString10 = manageCustomersTool.title;
                                    if (localizedString10 != null && (str7 = localizedString10.translated_value) != null) {
                                        if (StringsKt.isBlank(str7)) {
                                            str7 = r22;
                                        }
                                        if (str7 != null && (str8 = manageCustomersTool.client_route) != null) {
                                            if (StringsKt.isBlank(str8)) {
                                                str8 = r22;
                                            }
                                            if (str8 != null) {
                                                LocalizedString localizedString11 = manageCustomersTool.subtitle;
                                                if (localizedString11 == null || (str9 = localizedString11.translated_value) == null || StringsKt.isBlank(str9)) {
                                                    str9 = r22;
                                                }
                                                paycheckDistribution = new EarningsUiConfiguration.EarningsHomeUi.EarningsHomeSection.EarningToolsSection.EarningToolItem.ManageCustomers(str7, str9, str8);
                                                str13 = r22;
                                                ArrayList arrayList722222 = arrayList;
                                                if (paycheckDistribution != null) {
                                                }
                                                arrayList4 = arrayList722222;
                                                str25 = str13;
                                            }
                                        }
                                    }
                                    paycheckDistribution = r22;
                                    str13 = r22;
                                    ArrayList arrayList7222222 = arrayList;
                                    if (paycheckDistribution != null) {
                                    }
                                    arrayList4 = arrayList7222222;
                                    str25 = str13;
                                } else if (tool instanceof EarningTool.Tool.AddPaycheck) {
                                    AddPaycheckTool addPaycheckTool = ((EarningTool.Tool.AddPaycheck) tool).value;
                                    LocalizedString localizedString12 = addPaycheckTool.title;
                                    if (localizedString12 != null && (str4 = localizedString12.translated_value) != null) {
                                        if (StringsKt.isBlank(str4)) {
                                            str4 = r22;
                                        }
                                        if (str4 != null && (str5 = addPaycheckTool.client_route) != null) {
                                            if (StringsKt.isBlank(str5)) {
                                                str5 = r22;
                                            }
                                            if (str5 != null) {
                                                LocalizedString localizedString13 = addPaycheckTool.subtitle;
                                                if (localizedString13 == null || (str6 = localizedString13.translated_value) == null || StringsKt.isBlank(str6)) {
                                                    str6 = r22;
                                                }
                                                paycheckDistribution = new EarningsUiConfiguration.EarningsHomeUi.EarningsHomeSection.EarningToolsSection.EarningToolItem.AddPaycheck(str4, str6, str5);
                                                str13 = r22;
                                                ArrayList arrayList72222222 = arrayList;
                                                if (paycheckDistribution != null) {
                                                }
                                                arrayList4 = arrayList72222222;
                                                str25 = str13;
                                            }
                                        }
                                    }
                                    paycheckDistribution = r22;
                                    str13 = r22;
                                    ArrayList arrayList722222222 = arrayList;
                                    if (paycheckDistribution != null) {
                                    }
                                    arrayList4 = arrayList722222222;
                                    str25 = str13;
                                } else {
                                    if (tool instanceof EarningTool.Tool.PaycheckDistribution) {
                                        PaycheckDistributionTool paycheckDistributionTool = ((EarningTool.Tool.PaycheckDistribution) tool).value;
                                        LocalizedString localizedString14 = paycheckDistributionTool.title;
                                        if (localizedString14 != null && (str2 = localizedString14.translated_value) != null) {
                                            if (StringsKt.isBlank(str2)) {
                                                str2 = r22;
                                            }
                                            if (str2 != null && (str3 = paycheckDistributionTool.client_route) != null) {
                                                if (StringsKt.isBlank(str3)) {
                                                    str3 = r22;
                                                }
                                                if (str3 != null) {
                                                    paycheckDistribution = new EarningsUiConfiguration.EarningsHomeUi.EarningsHomeSection.EarningToolsSection.EarningToolItem.PaycheckDistribution(str2, str3, paycheckDistributionTool.stream_avatars);
                                                    str13 = r22;
                                                    ArrayList arrayList7222222222 = arrayList;
                                                    if (paycheckDistribution != null) {
                                                    }
                                                    arrayList4 = arrayList7222222222;
                                                    str25 = str13;
                                                }
                                            }
                                        }
                                    } else if (tool != null) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return r22;
                                    }
                                    paycheckDistribution = r22;
                                    str13 = r22;
                                    ArrayList arrayList72222222222 = arrayList;
                                    if (paycheckDistribution != null) {
                                    }
                                    arrayList4 = arrayList72222222222;
                                    str25 = str13;
                                }
                            }
                        }
                        str = str25;
                        ArrayList arrayList8 = arrayList4;
                        if (!arrayList8.isEmpty()) {
                            LocalizedString localizedString15 = earningToolsSection.title;
                            str24 = new EarningsUiConfiguration.EarningsHomeUi.EarningsHomeSection.EarningToolsSection(localizedString15 != null ? localizedString15.translated_value : str, arrayList8);
                        }
                    } else {
                        str = null;
                        ProtoParsingError protoParsingError = new ProtoParsingError("EarningsHomeUi Section", ProtoParsingError.ErrorType.INVALID_TYPE_TO_SEALED_INTERFACE_MAPPING, null, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                        ErrorReporter errorReporter = ErrorReporter.Companion.INSTANCE;
                        if (errorReporter == null) {
                            WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m();
                            return null;
                        }
                        errorReporter.report(protoParsingError, ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                    }
                    str26 = str;
                }
                if (str26 == null) {
                    arrayList2.add(str26);
                }
            }
            str26 = str24;
            if (str26 == null) {
            }
        }
        return new EarningsUiConfiguration.EarningsHomeUi(arrayList2);
    }

    public static int zza(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }
}
