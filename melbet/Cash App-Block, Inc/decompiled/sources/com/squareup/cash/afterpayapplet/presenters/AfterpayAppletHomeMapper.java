package com.squareup.cash.afterpayapplet.presenters;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import app.cash.local.views.internal.menus.LocalMenuHoursViewKt;
import app.cash.local.views.internal.menus.LocalMenuSelectorKt;
import app.cash.redwood.protocol.host.NodeReuseKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.R;
import com.squareup.cash.afterpayapplet.backend.AfterpayAppletAnalyticsEventsSpec;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader;
import com.squareup.cash.afterpayapplet.viewmodels.RemoteImage;
import com.squareup.cash.afterpayapplet.viewmodels.Tap;
import com.squareup.cash.afterpayapplet.viewmodels.TappableIcon;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$AfterpayAppletMoneybarAnimation;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.money.booklet.HeaderSectionKt;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.observability.protovalidation.ProtoValidationScope;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.util.money.Moneys;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletHome;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletHomeSection;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletHomeSection$Section$AvatarTextSection;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletHomeSection$Section$Banner;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletHomeSection$Section$CardSection;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletHomeSection$Section$CheckEligibility;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletHomeSection$Section$HeroBalanceSection;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletHomeSection$Section$HeroUpsellSection;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletHomeSection$Section$IconTextSection;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletHomeSection$Section$OrderList;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletHomeSection$Section$PageHeaderSection;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletHomeSection$Section$PaymentMgmt;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletHomeSection$Section$PrepurchaseCardToggleSection;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletHomeSection$Section$TextLinesSection;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletHomeSection$SectionHeader$CreditLineHeader;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletHomeSection$SectionHeader$StandardHeader;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletResponse;
import com.squareup.protos.cash.cashsuggest.api.AppletCardSection;
import com.squareup.protos.cash.cashsuggest.api.Banner;
import com.squareup.protos.cash.cashsuggest.api.CreditLineData;
import com.squareup.protos.cash.cashsuggest.api.CreditLineSectionHeader;
import com.squareup.protos.cash.cashsuggest.api.CreditLineSectionHeader$Subtitle$CreditLine;
import com.squareup.protos.cash.cashsuggest.api.CreditLineSectionHeader$Subtitle$MoneyBar;
import com.squareup.protos.cash.cashsuggest.api.CreditLineSectionHeader$Subtitle$TextSubtitle;
import com.squareup.protos.cash.cashsuggest.api.CreditLineSnapshot;
import com.squareup.protos.cash.cashsuggest.api.CreditLineType;
import com.squareup.protos.cash.cashsuggest.api.HeroBalanceSection;
import com.squareup.protos.cash.cashsuggest.api.HeroUpsellSection;
import com.squareup.protos.cash.cashsuggest.api.MoneyBar;
import com.squareup.protos.cash.cashsuggest.api.OrderListSection;
import com.squareup.protos.cash.cashsuggest.api.PaymentMgmtSection;
import com.squareup.protos.cash.cashsuggest.api.PrepurchaseCardToggleSection;
import com.squareup.protos.cash.grantly.api.Channel;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.protos.cash.shop.rendering.api.AvatarTextSection;
import com.squareup.protos.cash.shop.rendering.api.Button;
import com.squareup.protos.cash.shop.rendering.api.Footer;
import com.squareup.protos.cash.shop.rendering.api.IconTextSection;
import com.squareup.protos.cash.shop.rendering.api.ImageTextSection;
import com.squareup.protos.cash.shop.rendering.api.PageHeaderSection;
import com.squareup.protos.cash.shop.rendering.api.SectionHeader;
import com.squareup.protos.cash.shop.rendering.api.TapAction;
import com.squareup.protos.cash.shop.rendering.api.TextLinesSection;
import com.squareup.protos.cash.shop.rendering.api.TintedIcon;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import com.squareup.util.cash.StringsKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NotImplementedError;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList;
import okhttp3.internal.Tags;
import squareup.cash.earnings.EarningTool;

/* loaded from: classes5.dex */
public final class AfterpayAppletHomeMapper {
    public final FeatureFlagManager featureFlagManager;
    public final MoneyFormatter moneyFormatterStandard;
    public final MoneyFormatter moneyFormatterStandardCompact;
    public final AndroidStringManager stringManager;

    /* loaded from: classes7.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[CreditLineSectionHeader.DisplayEffect.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CreditLineType.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Channel.Companion companion = CreditLineType.Companion;
                iArr2[3] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                Channel.Companion companion2 = CreditLineType.Companion;
                iArr2[1] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                Channel.Companion companion3 = CreditLineType.Companion;
                iArr2[2] = 4;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                Channel.Companion companion4 = CreditLineType.Companion;
                iArr2[4] = 5;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[SectionHeader.DisplayEffect.values().length];
            try {
                iArr3[2] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[AppletCardSection.StandardHeader.DisplayStyle.values().length];
            try {
                iArr4[1] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    public AfterpayAppletHomeMapper(FeatureFlagManager featureFlagManager, LocalizedMoneyFormatter.Factory factory, AndroidStringManager androidStringManager) {
        this.stringManager = androidStringManager;
        this.featureFlagManager = featureFlagManager;
        this.moneyFormatterStandard = factory.create(MoneyFormatterConfig.STANDARD);
        this.moneyFormatterStandardCompact = factory.create(MoneyFormatterConfig.COMPACT);
    }

    public static AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AvatarText toAvatarTextSection(ProtoValidationScope protoValidationScope, AvatarTextSection avatarTextSection) {
        List reversed = CollectionsKt.reversed(avatarTextSection.avatars);
        LocalizedString localizedString = avatarTextSection.title;
        String translated = localizedString != null ? StringsKt.translated(localizedString) : null;
        ProtoValidationScope.required(translated, "title");
        LocalizedString localizedString2 = avatarTextSection.subtitle;
        String translated2 = localizedString2 != null ? StringsKt.translated(localizedString2) : null;
        ProtoValidationScope.required(translated2, "subtitle");
        TapAction tapAction = avatarTextSection.tap_action;
        return new AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AvatarText(reversed, translated, translated2, tapAction != null ? AfterpayAppletHomeMapperKt.toTapViewModel(protoValidationScope, tapAction) : null);
    }

    public static CalendarProviderInput toCalendarProviderInput$presenters(ProtoValidationScope protoValidationScope, HeroBalanceSection.PaymentCalendar paymentCalendar) {
        Tap tap;
        OverdueInfo overdueInfo;
        AfterpayAppletHomeContentViewModel.HomeSection.ButtonModel buttonModel;
        TapAction tapAction;
        LocalizedString localizedString;
        HeroBalanceSection.SectionCTA sectionCTA = paymentCalendar.cta;
        List list = paymentCalendar.upcoming_payments;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (true) {
            tap = null;
            AfterpayAppletAnalyticsEventsSpec afterpayAppletAnalyticsEventsSpec = null;
            tap = null;
            if (!it.hasNext()) {
                break;
            }
            HeroBalanceSection.PaymentCalendar.Payment payment = (HeroBalanceSection.PaymentCalendar.Payment) it.next();
            Long l = payment.due_date_ms;
            ProtoValidationScope.required(l, "due_date_ms");
            long longValue = l.longValue();
            Money money = payment.amount;
            ProtoValidationScope.required(money, "payment.amount");
            AnalyticsEvent analyticsEvent = payment.analytic_view_event;
            AfterpayAppletAnalyticsEventsSpec afterpayAppletAnalyticsEventsSpec2 = analyticsEvent != null ? HeaderSectionKt.toAfterpayAppletAnalyticsEventsSpec(analyticsEvent) : null;
            AnalyticsEvent analyticsEvent2 = payment.analytic_tap_event;
            if (analyticsEvent2 != null) {
                afterpayAppletAnalyticsEventsSpec = HeaderSectionKt.toAfterpayAppletAnalyticsEventsSpec(analyticsEvent2);
            }
            arrayList.add(new PaymentInfo(longValue, money, afterpayAppletAnalyticsEventsSpec2, afterpayAppletAnalyticsEventsSpec));
        }
        HeroBalanceSection.PaymentCalendar.Overdue overdue = paymentCalendar.overdue;
        if (overdue != null) {
            Money money2 = overdue.amount;
            ProtoValidationScope.required(money2, "overdue.amount");
            AnalyticsEvent analyticsEvent3 = overdue.analytic_view_event;
            AfterpayAppletAnalyticsEventsSpec afterpayAppletAnalyticsEventsSpec3 = analyticsEvent3 != null ? HeaderSectionKt.toAfterpayAppletAnalyticsEventsSpec(analyticsEvent3) : null;
            AnalyticsEvent analyticsEvent4 = overdue.analytic_tap_event;
            overdueInfo = new OverdueInfo(money2, afterpayAppletAnalyticsEventsSpec3, analyticsEvent4 != null ? HeaderSectionKt.toAfterpayAppletAnalyticsEventsSpec(analyticsEvent4) : null);
        } else {
            overdueInfo = null;
        }
        Button button = paymentCalendar.primary_button;
        if (button != null) {
            String required = ProtoValidationScope.required(button.l_text, "button.l_text");
            Icon icon = button.arcade_icon;
            String str = icon != null ? icon.arcade_id : null;
            TapAction tapAction2 = button.tap_action;
            ProtoValidationScope.required(tapAction2, "button.tap_action");
            buttonModel = new AfterpayAppletHomeContentViewModel.HomeSection.ButtonModel(required, str, AfterpayAppletHomeMapperKt.toTapViewModel(protoValidationScope, tapAction2), AfterpayAppletHomeMapperKt.toProminence(button.prominence));
        } else {
            buttonModel = null;
        }
        String translated = (sectionCTA == null || (localizedString = sectionCTA.title) == null) ? null : StringsKt.translated(localizedString);
        if (sectionCTA != null && (tapAction = sectionCTA.tap_action) != null) {
            tap = AfterpayAppletHomeMapperKt.toTapViewModel(protoValidationScope, tapAction);
        }
        return new CalendarProviderInput(arrayList, overdueInfo, buttonModel, translated, tap);
    }

    public static AfterpayAppletHomeContentViewModel.HomeSection.Header toHeader(ProtoValidationScope protoValidationScope, SectionHeader sectionHeader) {
        String required = ProtoValidationScope.required(sectionHeader.l_title, "l_title");
        LocalizedString localizedString = sectionHeader.l_subtitle;
        String translated = localizedString != null ? StringsKt.translated(localizedString) : null;
        SectionHeader.DisplayEffect displayEffect = sectionHeader.display_effect;
        AfterpayAppletHomeContentViewModel.HomeSection.Header.SectionDisplayEffect sectionDisplayEffect = (displayEffect == null ? -1 : WhenMappings.$EnumSwitchMapping$2[displayEffect.ordinal()]) == 1 ? AfterpayAppletHomeContentViewModel.HomeSection.Header.SectionDisplayEffect.FADED_EFFECT : AfterpayAppletHomeContentViewModel.HomeSection.Header.SectionDisplayEffect.DEFAULT_EFFECT;
        TapAction tapAction = sectionHeader.tap_action;
        return new AfterpayAppletHomeContentViewModel.HomeSection.Header(required, sectionDisplayEffect, translated, tapAction != null ? AfterpayAppletHomeMapperKt.toTapViewModel(protoValidationScope, tapAction) : null);
    }

    public static AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.IconText toIconTextSection(ProtoValidationScope protoValidationScope, IconTextSection iconTextSection) {
        TintedIcon tintedIcon = iconTextSection.tinted_icon;
        if (tintedIcon == null) {
            a$$ExternalSyntheticBUOutline0.m$3("tinted_icon is null");
            return null;
        }
        Icon icon = tintedIcon.icon;
        String str = icon != null ? icon.arcade_id : null;
        if (str == null) {
            a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
            return null;
        }
        Color color = tintedIcon.icon_color;
        com.squareup.cash.afterpayapplet.viewmodels.TintedIcon tintedIcon2 = new com.squareup.cash.afterpayapplet.viewmodels.TintedIcon(str, color != null ? new ColorModel.Accented(color) : ColorModel.Icon.INSTANCE);
        LocalizedString localizedString = iconTextSection.title;
        String translated = localizedString != null ? StringsKt.translated(localizedString) : null;
        if (translated == null) {
            a$$ExternalSyntheticBUOutline0.m$3("title was null");
            return null;
        }
        LocalizedString localizedString2 = iconTextSection.subtitle;
        String translated2 = localizedString2 != null ? StringsKt.translated(localizedString2) : null;
        TapAction tapAction = iconTextSection.tap_action;
        return new AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.IconText(tintedIcon2, translated, translated2, tapAction != null ? AfterpayAppletHomeMapperKt.toTapViewModel(protoValidationScope, tapAction) : null);
    }

    public static AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.ImageText toImageTextSection(ProtoValidationScope protoValidationScope, ImageTextSection imageTextSection) {
        Image image = imageTextSection.image;
        AfterpayAppletHomeContentViewModel.HomeSection.ButtonModel buttonModel = null;
        RemoteImage access$toRemoteImage = image != null ? AfterpayAppletHomeMapperKt.access$toRemoteImage(image) : null;
        LocalizedString localizedString = imageTextSection.title;
        String translated = localizedString != null ? StringsKt.translated(localizedString) : null;
        if (translated == null) {
            a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
            return null;
        }
        LocalizedString localizedString2 = imageTextSection.subtitle;
        String translated2 = localizedString2 != null ? StringsKt.translated(localizedString2) : null;
        Button button = imageTextSection.button;
        if (button != null) {
            LocalizedString localizedString3 = button.l_text;
            String translated3 = localizedString3 != null ? StringsKt.translated(localizedString3) : null;
            if (translated3 == null) {
                a$$ExternalSyntheticBUOutline0.m$3("button title was null");
                return null;
            }
            Icon icon = button.arcade_icon;
            String str = icon != null ? icon.arcade_id : null;
            TapAction tapAction = button.tap_action;
            if (tapAction == null) {
                a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                return null;
            }
            buttonModel = new AfterpayAppletHomeContentViewModel.HomeSection.ButtonModel(translated3, str, AfterpayAppletHomeMapperKt.toTapViewModel(protoValidationScope, tapAction), AfterpayAppletHomeMapperKt.toProminence(button.prominence));
        }
        return new AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.ImageText(access$toRemoteImage, translated, translated2, buttonModel);
    }

    public static AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.TextLines toTextLinesSection(TextLinesSection textLinesSection) {
        List list = textLinesSection.text_lines;
        ProtoValidationScope.required(list, "text_lines");
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(StringsKt.translated((LocalizedString) it.next()));
        }
        return new AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.TextLines(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0175 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractPersistentList homeSectionList(ProtoValidationScope protoValidationScope, AfterpayAppletResponse afterpayAppletResponse, List list) {
        Icon icon;
        LocalizedString localizedString;
        HeroBalanceSection heroBalanceSection;
        AppletCardSection appletCardSection;
        PaymentMgmtSection paymentMgmtSection;
        LocalMenuSelectorKt localMenuSelectorKt;
        SectionHeader sectionHeader;
        CreditLineSectionHeader creditLineSectionHeader;
        OrderListSection orderListSection;
        TextLinesSection textLinesSection;
        ImageTextSection imageTextSection;
        PageHeaderSection pageHeaderSection;
        AvatarTextSection avatarTextSection;
        IconTextSection iconTextSection;
        HeroUpsellSection heroUpsellSection;
        PrepurchaseCardToggleSection prepurchaseCardToggleSection;
        Banner banner;
        AfterpayAppletHomeContentViewModel.HomeSection homeSectionContent;
        AfterpayAppletHome afterpayAppletHome = afterpayAppletResponse.home;
        ProtoValidationScope.required(afterpayAppletHome, "home");
        Footer footer = afterpayAppletHome.footer;
        List<AfterpayAppletHomeSection> list2 = afterpayAppletHome.sections;
        ProtoValidationScope protoValidationScope2 = protoValidationScope;
        ProtoValidationScope.requiredCount(protoValidationScope2, list2, "sections", 1, null);
        CreditLineSnapshot creditLineSnapshot = afterpayAppletResponse.credit_line_snapshot;
        ProtoValidationScope.required(creditLineSnapshot, "credit_line_snapshot");
        ArrayList arrayList = new ArrayList();
        for (AfterpayAppletHomeSection afterpayAppletHomeSection : list2) {
            String str = afterpayAppletHomeSection.section_id;
            LocalMenuHoursViewKt localMenuHoursViewKt = afterpayAppletHomeSection.section;
            if (localMenuHoursViewKt != null) {
                AfterpayAppletHomeSection$Section$HeroBalanceSection afterpayAppletHomeSection$Section$HeroBalanceSection = localMenuHoursViewKt instanceof AfterpayAppletHomeSection$Section$HeroBalanceSection ? (AfterpayAppletHomeSection$Section$HeroBalanceSection) localMenuHoursViewKt : null;
                if (afterpayAppletHomeSection$Section$HeroBalanceSection != null) {
                    heroBalanceSection = afterpayAppletHomeSection$Section$HeroBalanceSection.value;
                    if (localMenuHoursViewKt != null) {
                        AfterpayAppletHomeSection$Section$CardSection afterpayAppletHomeSection$Section$CardSection = localMenuHoursViewKt instanceof AfterpayAppletHomeSection$Section$CardSection ? (AfterpayAppletHomeSection$Section$CardSection) localMenuHoursViewKt : null;
                        if (afterpayAppletHomeSection$Section$CardSection != null) {
                            appletCardSection = afterpayAppletHomeSection$Section$CardSection.value;
                            if (localMenuHoursViewKt != null) {
                                AfterpayAppletHomeSection$Section$PaymentMgmt afterpayAppletHomeSection$Section$PaymentMgmt = localMenuHoursViewKt instanceof AfterpayAppletHomeSection$Section$PaymentMgmt ? (AfterpayAppletHomeSection$Section$PaymentMgmt) localMenuHoursViewKt : null;
                                if (afterpayAppletHomeSection$Section$PaymentMgmt != null) {
                                    paymentMgmtSection = afterpayAppletHomeSection$Section$PaymentMgmt.value;
                                    localMenuSelectorKt = afterpayAppletHomeSection.section_header;
                                    if (localMenuSelectorKt != null) {
                                        AfterpayAppletHomeSection$SectionHeader$StandardHeader afterpayAppletHomeSection$SectionHeader$StandardHeader = localMenuSelectorKt instanceof AfterpayAppletHomeSection$SectionHeader$StandardHeader ? (AfterpayAppletHomeSection$SectionHeader$StandardHeader) localMenuSelectorKt : null;
                                        if (afterpayAppletHomeSection$SectionHeader$StandardHeader != null) {
                                            sectionHeader = afterpayAppletHomeSection$SectionHeader$StandardHeader.value;
                                            if (localMenuSelectorKt != null) {
                                                AfterpayAppletHomeSection$SectionHeader$CreditLineHeader afterpayAppletHomeSection$SectionHeader$CreditLineHeader = localMenuSelectorKt instanceof AfterpayAppletHomeSection$SectionHeader$CreditLineHeader ? (AfterpayAppletHomeSection$SectionHeader$CreditLineHeader) localMenuSelectorKt : null;
                                                if (afterpayAppletHomeSection$SectionHeader$CreditLineHeader != null) {
                                                    creditLineSectionHeader = afterpayAppletHomeSection$SectionHeader$CreditLineHeader.value;
                                                    if (localMenuHoursViewKt != null) {
                                                        AfterpayAppletHomeSection$Section$OrderList afterpayAppletHomeSection$Section$OrderList = localMenuHoursViewKt instanceof AfterpayAppletHomeSection$Section$OrderList ? (AfterpayAppletHomeSection$Section$OrderList) localMenuHoursViewKt : null;
                                                        if (afterpayAppletHomeSection$Section$OrderList != null) {
                                                            orderListSection = afterpayAppletHomeSection$Section$OrderList.value;
                                                            if (localMenuHoursViewKt != null) {
                                                                AfterpayAppletHomeSection$Section$TextLinesSection afterpayAppletHomeSection$Section$TextLinesSection = localMenuHoursViewKt instanceof AfterpayAppletHomeSection$Section$TextLinesSection ? (AfterpayAppletHomeSection$Section$TextLinesSection) localMenuHoursViewKt : null;
                                                                if (afterpayAppletHomeSection$Section$TextLinesSection != null) {
                                                                    textLinesSection = afterpayAppletHomeSection$Section$TextLinesSection.value;
                                                                    if (localMenuHoursViewKt != null) {
                                                                        AfterpayAppletHomeSection$Section$CheckEligibility afterpayAppletHomeSection$Section$CheckEligibility = localMenuHoursViewKt instanceof AfterpayAppletHomeSection$Section$CheckEligibility ? (AfterpayAppletHomeSection$Section$CheckEligibility) localMenuHoursViewKt : null;
                                                                        if (afterpayAppletHomeSection$Section$CheckEligibility != null) {
                                                                            imageTextSection = afterpayAppletHomeSection$Section$CheckEligibility.value;
                                                                            if (localMenuHoursViewKt != null) {
                                                                                AfterpayAppletHomeSection$Section$PageHeaderSection afterpayAppletHomeSection$Section$PageHeaderSection = localMenuHoursViewKt instanceof AfterpayAppletHomeSection$Section$PageHeaderSection ? (AfterpayAppletHomeSection$Section$PageHeaderSection) localMenuHoursViewKt : null;
                                                                                if (afterpayAppletHomeSection$Section$PageHeaderSection != null) {
                                                                                    pageHeaderSection = afterpayAppletHomeSection$Section$PageHeaderSection.value;
                                                                                    if (localMenuHoursViewKt != null) {
                                                                                        AfterpayAppletHomeSection$Section$AvatarTextSection afterpayAppletHomeSection$Section$AvatarTextSection = localMenuHoursViewKt instanceof AfterpayAppletHomeSection$Section$AvatarTextSection ? (AfterpayAppletHomeSection$Section$AvatarTextSection) localMenuHoursViewKt : null;
                                                                                        if (afterpayAppletHomeSection$Section$AvatarTextSection != null) {
                                                                                            avatarTextSection = afterpayAppletHomeSection$Section$AvatarTextSection.value;
                                                                                            if (localMenuHoursViewKt != null) {
                                                                                                AfterpayAppletHomeSection$Section$IconTextSection afterpayAppletHomeSection$Section$IconTextSection = localMenuHoursViewKt instanceof AfterpayAppletHomeSection$Section$IconTextSection ? (AfterpayAppletHomeSection$Section$IconTextSection) localMenuHoursViewKt : null;
                                                                                                if (afterpayAppletHomeSection$Section$IconTextSection != null) {
                                                                                                    iconTextSection = afterpayAppletHomeSection$Section$IconTextSection.value;
                                                                                                    if (localMenuHoursViewKt != null) {
                                                                                                        AfterpayAppletHomeSection$Section$HeroUpsellSection afterpayAppletHomeSection$Section$HeroUpsellSection = localMenuHoursViewKt instanceof AfterpayAppletHomeSection$Section$HeroUpsellSection ? (AfterpayAppletHomeSection$Section$HeroUpsellSection) localMenuHoursViewKt : null;
                                                                                                        if (afterpayAppletHomeSection$Section$HeroUpsellSection != null) {
                                                                                                            heroUpsellSection = afterpayAppletHomeSection$Section$HeroUpsellSection.value;
                                                                                                            if (localMenuHoursViewKt != null) {
                                                                                                                AfterpayAppletHomeSection$Section$PrepurchaseCardToggleSection afterpayAppletHomeSection$Section$PrepurchaseCardToggleSection = localMenuHoursViewKt instanceof AfterpayAppletHomeSection$Section$PrepurchaseCardToggleSection ? (AfterpayAppletHomeSection$Section$PrepurchaseCardToggleSection) localMenuHoursViewKt : null;
                                                                                                                if (afterpayAppletHomeSection$Section$PrepurchaseCardToggleSection != null) {
                                                                                                                    prepurchaseCardToggleSection = afterpayAppletHomeSection$Section$PrepurchaseCardToggleSection.value;
                                                                                                                    if (localMenuHoursViewKt != null) {
                                                                                                                        AfterpayAppletHomeSection$Section$Banner afterpayAppletHomeSection$Section$Banner = localMenuHoursViewKt instanceof AfterpayAppletHomeSection$Section$Banner ? (AfterpayAppletHomeSection$Section$Banner) localMenuHoursViewKt : null;
                                                                                                                        if (afterpayAppletHomeSection$Section$Banner != null) {
                                                                                                                            banner = afterpayAppletHomeSection$Section$Banner.value;
                                                                                                                            boolean areEqual = Intrinsics.areEqual(afterpayAppletHomeSection.show_divider, Boolean.TRUE);
                                                                                                                            AnalyticsEvent analyticsEvent = afterpayAppletHomeSection.analytic_view_event;
                                                                                                                            homeSectionContent = toHomeSectionContent(protoValidationScope2, str, creditLineSnapshot, heroBalanceSection, appletCardSection, orderListSection, list, paymentMgmtSection, sectionHeader, creditLineSectionHeader, imageTextSection, pageHeaderSection, avatarTextSection, textLinesSection, iconTextSection, heroUpsellSection, prepurchaseCardToggleSection, banner, areEqual, analyticsEvent != null ? CollectionsKt__CollectionsJVMKt.listOf(HeaderSectionKt.toAfterpayAppletAnalyticsEventsSpec(analyticsEvent)) : null);
                                                                                                                            if (homeSectionContent != null) {
                                                                                                                                arrayList.add(homeSectionContent);
                                                                                                                            }
                                                                                                                            protoValidationScope2 = protoValidationScope;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    banner = null;
                                                                                                                    boolean areEqual2 = Intrinsics.areEqual(afterpayAppletHomeSection.show_divider, Boolean.TRUE);
                                                                                                                    AnalyticsEvent analyticsEvent2 = afterpayAppletHomeSection.analytic_view_event;
                                                                                                                    homeSectionContent = toHomeSectionContent(protoValidationScope2, str, creditLineSnapshot, heroBalanceSection, appletCardSection, orderListSection, list, paymentMgmtSection, sectionHeader, creditLineSectionHeader, imageTextSection, pageHeaderSection, avatarTextSection, textLinesSection, iconTextSection, heroUpsellSection, prepurchaseCardToggleSection, banner, areEqual2, analyticsEvent2 != null ? CollectionsKt__CollectionsJVMKt.listOf(HeaderSectionKt.toAfterpayAppletAnalyticsEventsSpec(analyticsEvent2)) : null);
                                                                                                                    if (homeSectionContent != null) {
                                                                                                                    }
                                                                                                                    protoValidationScope2 = protoValidationScope;
                                                                                                                }
                                                                                                            }
                                                                                                            prepurchaseCardToggleSection = null;
                                                                                                            if (localMenuHoursViewKt != null) {
                                                                                                            }
                                                                                                            banner = null;
                                                                                                            boolean areEqual22 = Intrinsics.areEqual(afterpayAppletHomeSection.show_divider, Boolean.TRUE);
                                                                                                            AnalyticsEvent analyticsEvent22 = afterpayAppletHomeSection.analytic_view_event;
                                                                                                            homeSectionContent = toHomeSectionContent(protoValidationScope2, str, creditLineSnapshot, heroBalanceSection, appletCardSection, orderListSection, list, paymentMgmtSection, sectionHeader, creditLineSectionHeader, imageTextSection, pageHeaderSection, avatarTextSection, textLinesSection, iconTextSection, heroUpsellSection, prepurchaseCardToggleSection, banner, areEqual22, analyticsEvent22 != null ? CollectionsKt__CollectionsJVMKt.listOf(HeaderSectionKt.toAfterpayAppletAnalyticsEventsSpec(analyticsEvent22)) : null);
                                                                                                            if (homeSectionContent != null) {
                                                                                                            }
                                                                                                            protoValidationScope2 = protoValidationScope;
                                                                                                        }
                                                                                                    }
                                                                                                    heroUpsellSection = null;
                                                                                                    if (localMenuHoursViewKt != null) {
                                                                                                    }
                                                                                                    prepurchaseCardToggleSection = null;
                                                                                                    if (localMenuHoursViewKt != null) {
                                                                                                    }
                                                                                                    banner = null;
                                                                                                    boolean areEqual222 = Intrinsics.areEqual(afterpayAppletHomeSection.show_divider, Boolean.TRUE);
                                                                                                    AnalyticsEvent analyticsEvent222 = afterpayAppletHomeSection.analytic_view_event;
                                                                                                    homeSectionContent = toHomeSectionContent(protoValidationScope2, str, creditLineSnapshot, heroBalanceSection, appletCardSection, orderListSection, list, paymentMgmtSection, sectionHeader, creditLineSectionHeader, imageTextSection, pageHeaderSection, avatarTextSection, textLinesSection, iconTextSection, heroUpsellSection, prepurchaseCardToggleSection, banner, areEqual222, analyticsEvent222 != null ? CollectionsKt__CollectionsJVMKt.listOf(HeaderSectionKt.toAfterpayAppletAnalyticsEventsSpec(analyticsEvent222)) : null);
                                                                                                    if (homeSectionContent != null) {
                                                                                                    }
                                                                                                    protoValidationScope2 = protoValidationScope;
                                                                                                }
                                                                                            }
                                                                                            iconTextSection = null;
                                                                                            if (localMenuHoursViewKt != null) {
                                                                                            }
                                                                                            heroUpsellSection = null;
                                                                                            if (localMenuHoursViewKt != null) {
                                                                                            }
                                                                                            prepurchaseCardToggleSection = null;
                                                                                            if (localMenuHoursViewKt != null) {
                                                                                            }
                                                                                            banner = null;
                                                                                            boolean areEqual2222 = Intrinsics.areEqual(afterpayAppletHomeSection.show_divider, Boolean.TRUE);
                                                                                            AnalyticsEvent analyticsEvent2222 = afterpayAppletHomeSection.analytic_view_event;
                                                                                            homeSectionContent = toHomeSectionContent(protoValidationScope2, str, creditLineSnapshot, heroBalanceSection, appletCardSection, orderListSection, list, paymentMgmtSection, sectionHeader, creditLineSectionHeader, imageTextSection, pageHeaderSection, avatarTextSection, textLinesSection, iconTextSection, heroUpsellSection, prepurchaseCardToggleSection, banner, areEqual2222, analyticsEvent2222 != null ? CollectionsKt__CollectionsJVMKt.listOf(HeaderSectionKt.toAfterpayAppletAnalyticsEventsSpec(analyticsEvent2222)) : null);
                                                                                            if (homeSectionContent != null) {
                                                                                            }
                                                                                            protoValidationScope2 = protoValidationScope;
                                                                                        }
                                                                                    }
                                                                                    avatarTextSection = null;
                                                                                    if (localMenuHoursViewKt != null) {
                                                                                    }
                                                                                    iconTextSection = null;
                                                                                    if (localMenuHoursViewKt != null) {
                                                                                    }
                                                                                    heroUpsellSection = null;
                                                                                    if (localMenuHoursViewKt != null) {
                                                                                    }
                                                                                    prepurchaseCardToggleSection = null;
                                                                                    if (localMenuHoursViewKt != null) {
                                                                                    }
                                                                                    banner = null;
                                                                                    boolean areEqual22222 = Intrinsics.areEqual(afterpayAppletHomeSection.show_divider, Boolean.TRUE);
                                                                                    AnalyticsEvent analyticsEvent22222 = afterpayAppletHomeSection.analytic_view_event;
                                                                                    homeSectionContent = toHomeSectionContent(protoValidationScope2, str, creditLineSnapshot, heroBalanceSection, appletCardSection, orderListSection, list, paymentMgmtSection, sectionHeader, creditLineSectionHeader, imageTextSection, pageHeaderSection, avatarTextSection, textLinesSection, iconTextSection, heroUpsellSection, prepurchaseCardToggleSection, banner, areEqual22222, analyticsEvent22222 != null ? CollectionsKt__CollectionsJVMKt.listOf(HeaderSectionKt.toAfterpayAppletAnalyticsEventsSpec(analyticsEvent22222)) : null);
                                                                                    if (homeSectionContent != null) {
                                                                                    }
                                                                                    protoValidationScope2 = protoValidationScope;
                                                                                }
                                                                            }
                                                                            pageHeaderSection = null;
                                                                            if (localMenuHoursViewKt != null) {
                                                                            }
                                                                            avatarTextSection = null;
                                                                            if (localMenuHoursViewKt != null) {
                                                                            }
                                                                            iconTextSection = null;
                                                                            if (localMenuHoursViewKt != null) {
                                                                            }
                                                                            heroUpsellSection = null;
                                                                            if (localMenuHoursViewKt != null) {
                                                                            }
                                                                            prepurchaseCardToggleSection = null;
                                                                            if (localMenuHoursViewKt != null) {
                                                                            }
                                                                            banner = null;
                                                                            boolean areEqual222222 = Intrinsics.areEqual(afterpayAppletHomeSection.show_divider, Boolean.TRUE);
                                                                            AnalyticsEvent analyticsEvent222222 = afterpayAppletHomeSection.analytic_view_event;
                                                                            homeSectionContent = toHomeSectionContent(protoValidationScope2, str, creditLineSnapshot, heroBalanceSection, appletCardSection, orderListSection, list, paymentMgmtSection, sectionHeader, creditLineSectionHeader, imageTextSection, pageHeaderSection, avatarTextSection, textLinesSection, iconTextSection, heroUpsellSection, prepurchaseCardToggleSection, banner, areEqual222222, analyticsEvent222222 != null ? CollectionsKt__CollectionsJVMKt.listOf(HeaderSectionKt.toAfterpayAppletAnalyticsEventsSpec(analyticsEvent222222)) : null);
                                                                            if (homeSectionContent != null) {
                                                                            }
                                                                            protoValidationScope2 = protoValidationScope;
                                                                        }
                                                                    }
                                                                    imageTextSection = null;
                                                                    if (localMenuHoursViewKt != null) {
                                                                    }
                                                                    pageHeaderSection = null;
                                                                    if (localMenuHoursViewKt != null) {
                                                                    }
                                                                    avatarTextSection = null;
                                                                    if (localMenuHoursViewKt != null) {
                                                                    }
                                                                    iconTextSection = null;
                                                                    if (localMenuHoursViewKt != null) {
                                                                    }
                                                                    heroUpsellSection = null;
                                                                    if (localMenuHoursViewKt != null) {
                                                                    }
                                                                    prepurchaseCardToggleSection = null;
                                                                    if (localMenuHoursViewKt != null) {
                                                                    }
                                                                    banner = null;
                                                                    boolean areEqual2222222 = Intrinsics.areEqual(afterpayAppletHomeSection.show_divider, Boolean.TRUE);
                                                                    AnalyticsEvent analyticsEvent2222222 = afterpayAppletHomeSection.analytic_view_event;
                                                                    homeSectionContent = toHomeSectionContent(protoValidationScope2, str, creditLineSnapshot, heroBalanceSection, appletCardSection, orderListSection, list, paymentMgmtSection, sectionHeader, creditLineSectionHeader, imageTextSection, pageHeaderSection, avatarTextSection, textLinesSection, iconTextSection, heroUpsellSection, prepurchaseCardToggleSection, banner, areEqual2222222, analyticsEvent2222222 != null ? CollectionsKt__CollectionsJVMKt.listOf(HeaderSectionKt.toAfterpayAppletAnalyticsEventsSpec(analyticsEvent2222222)) : null);
                                                                    if (homeSectionContent != null) {
                                                                    }
                                                                    protoValidationScope2 = protoValidationScope;
                                                                }
                                                            }
                                                            textLinesSection = null;
                                                            if (localMenuHoursViewKt != null) {
                                                            }
                                                            imageTextSection = null;
                                                            if (localMenuHoursViewKt != null) {
                                                            }
                                                            pageHeaderSection = null;
                                                            if (localMenuHoursViewKt != null) {
                                                            }
                                                            avatarTextSection = null;
                                                            if (localMenuHoursViewKt != null) {
                                                            }
                                                            iconTextSection = null;
                                                            if (localMenuHoursViewKt != null) {
                                                            }
                                                            heroUpsellSection = null;
                                                            if (localMenuHoursViewKt != null) {
                                                            }
                                                            prepurchaseCardToggleSection = null;
                                                            if (localMenuHoursViewKt != null) {
                                                            }
                                                            banner = null;
                                                            boolean areEqual22222222 = Intrinsics.areEqual(afterpayAppletHomeSection.show_divider, Boolean.TRUE);
                                                            AnalyticsEvent analyticsEvent22222222 = afterpayAppletHomeSection.analytic_view_event;
                                                            homeSectionContent = toHomeSectionContent(protoValidationScope2, str, creditLineSnapshot, heroBalanceSection, appletCardSection, orderListSection, list, paymentMgmtSection, sectionHeader, creditLineSectionHeader, imageTextSection, pageHeaderSection, avatarTextSection, textLinesSection, iconTextSection, heroUpsellSection, prepurchaseCardToggleSection, banner, areEqual22222222, analyticsEvent22222222 != null ? CollectionsKt__CollectionsJVMKt.listOf(HeaderSectionKt.toAfterpayAppletAnalyticsEventsSpec(analyticsEvent22222222)) : null);
                                                            if (homeSectionContent != null) {
                                                            }
                                                            protoValidationScope2 = protoValidationScope;
                                                        }
                                                    }
                                                    orderListSection = null;
                                                    if (localMenuHoursViewKt != null) {
                                                    }
                                                    textLinesSection = null;
                                                    if (localMenuHoursViewKt != null) {
                                                    }
                                                    imageTextSection = null;
                                                    if (localMenuHoursViewKt != null) {
                                                    }
                                                    pageHeaderSection = null;
                                                    if (localMenuHoursViewKt != null) {
                                                    }
                                                    avatarTextSection = null;
                                                    if (localMenuHoursViewKt != null) {
                                                    }
                                                    iconTextSection = null;
                                                    if (localMenuHoursViewKt != null) {
                                                    }
                                                    heroUpsellSection = null;
                                                    if (localMenuHoursViewKt != null) {
                                                    }
                                                    prepurchaseCardToggleSection = null;
                                                    if (localMenuHoursViewKt != null) {
                                                    }
                                                    banner = null;
                                                    boolean areEqual222222222 = Intrinsics.areEqual(afterpayAppletHomeSection.show_divider, Boolean.TRUE);
                                                    AnalyticsEvent analyticsEvent222222222 = afterpayAppletHomeSection.analytic_view_event;
                                                    homeSectionContent = toHomeSectionContent(protoValidationScope2, str, creditLineSnapshot, heroBalanceSection, appletCardSection, orderListSection, list, paymentMgmtSection, sectionHeader, creditLineSectionHeader, imageTextSection, pageHeaderSection, avatarTextSection, textLinesSection, iconTextSection, heroUpsellSection, prepurchaseCardToggleSection, banner, areEqual222222222, analyticsEvent222222222 != null ? CollectionsKt__CollectionsJVMKt.listOf(HeaderSectionKt.toAfterpayAppletAnalyticsEventsSpec(analyticsEvent222222222)) : null);
                                                    if (homeSectionContent != null) {
                                                    }
                                                    protoValidationScope2 = protoValidationScope;
                                                }
                                            }
                                            creditLineSectionHeader = null;
                                            if (localMenuHoursViewKt != null) {
                                            }
                                            orderListSection = null;
                                            if (localMenuHoursViewKt != null) {
                                            }
                                            textLinesSection = null;
                                            if (localMenuHoursViewKt != null) {
                                            }
                                            imageTextSection = null;
                                            if (localMenuHoursViewKt != null) {
                                            }
                                            pageHeaderSection = null;
                                            if (localMenuHoursViewKt != null) {
                                            }
                                            avatarTextSection = null;
                                            if (localMenuHoursViewKt != null) {
                                            }
                                            iconTextSection = null;
                                            if (localMenuHoursViewKt != null) {
                                            }
                                            heroUpsellSection = null;
                                            if (localMenuHoursViewKt != null) {
                                            }
                                            prepurchaseCardToggleSection = null;
                                            if (localMenuHoursViewKt != null) {
                                            }
                                            banner = null;
                                            boolean areEqual2222222222 = Intrinsics.areEqual(afterpayAppletHomeSection.show_divider, Boolean.TRUE);
                                            AnalyticsEvent analyticsEvent2222222222 = afterpayAppletHomeSection.analytic_view_event;
                                            homeSectionContent = toHomeSectionContent(protoValidationScope2, str, creditLineSnapshot, heroBalanceSection, appletCardSection, orderListSection, list, paymentMgmtSection, sectionHeader, creditLineSectionHeader, imageTextSection, pageHeaderSection, avatarTextSection, textLinesSection, iconTextSection, heroUpsellSection, prepurchaseCardToggleSection, banner, areEqual2222222222, analyticsEvent2222222222 != null ? CollectionsKt__CollectionsJVMKt.listOf(HeaderSectionKt.toAfterpayAppletAnalyticsEventsSpec(analyticsEvent2222222222)) : null);
                                            if (homeSectionContent != null) {
                                            }
                                            protoValidationScope2 = protoValidationScope;
                                        }
                                    }
                                    sectionHeader = null;
                                    if (localMenuSelectorKt != null) {
                                    }
                                    creditLineSectionHeader = null;
                                    if (localMenuHoursViewKt != null) {
                                    }
                                    orderListSection = null;
                                    if (localMenuHoursViewKt != null) {
                                    }
                                    textLinesSection = null;
                                    if (localMenuHoursViewKt != null) {
                                    }
                                    imageTextSection = null;
                                    if (localMenuHoursViewKt != null) {
                                    }
                                    pageHeaderSection = null;
                                    if (localMenuHoursViewKt != null) {
                                    }
                                    avatarTextSection = null;
                                    if (localMenuHoursViewKt != null) {
                                    }
                                    iconTextSection = null;
                                    if (localMenuHoursViewKt != null) {
                                    }
                                    heroUpsellSection = null;
                                    if (localMenuHoursViewKt != null) {
                                    }
                                    prepurchaseCardToggleSection = null;
                                    if (localMenuHoursViewKt != null) {
                                    }
                                    banner = null;
                                    boolean areEqual22222222222 = Intrinsics.areEqual(afterpayAppletHomeSection.show_divider, Boolean.TRUE);
                                    AnalyticsEvent analyticsEvent22222222222 = afterpayAppletHomeSection.analytic_view_event;
                                    homeSectionContent = toHomeSectionContent(protoValidationScope2, str, creditLineSnapshot, heroBalanceSection, appletCardSection, orderListSection, list, paymentMgmtSection, sectionHeader, creditLineSectionHeader, imageTextSection, pageHeaderSection, avatarTextSection, textLinesSection, iconTextSection, heroUpsellSection, prepurchaseCardToggleSection, banner, areEqual22222222222, analyticsEvent22222222222 != null ? CollectionsKt__CollectionsJVMKt.listOf(HeaderSectionKt.toAfterpayAppletAnalyticsEventsSpec(analyticsEvent22222222222)) : null);
                                    if (homeSectionContent != null) {
                                    }
                                    protoValidationScope2 = protoValidationScope;
                                }
                            }
                            paymentMgmtSection = null;
                            localMenuSelectorKt = afterpayAppletHomeSection.section_header;
                            if (localMenuSelectorKt != null) {
                            }
                            sectionHeader = null;
                            if (localMenuSelectorKt != null) {
                            }
                            creditLineSectionHeader = null;
                            if (localMenuHoursViewKt != null) {
                            }
                            orderListSection = null;
                            if (localMenuHoursViewKt != null) {
                            }
                            textLinesSection = null;
                            if (localMenuHoursViewKt != null) {
                            }
                            imageTextSection = null;
                            if (localMenuHoursViewKt != null) {
                            }
                            pageHeaderSection = null;
                            if (localMenuHoursViewKt != null) {
                            }
                            avatarTextSection = null;
                            if (localMenuHoursViewKt != null) {
                            }
                            iconTextSection = null;
                            if (localMenuHoursViewKt != null) {
                            }
                            heroUpsellSection = null;
                            if (localMenuHoursViewKt != null) {
                            }
                            prepurchaseCardToggleSection = null;
                            if (localMenuHoursViewKt != null) {
                            }
                            banner = null;
                            boolean areEqual222222222222 = Intrinsics.areEqual(afterpayAppletHomeSection.show_divider, Boolean.TRUE);
                            AnalyticsEvent analyticsEvent222222222222 = afterpayAppletHomeSection.analytic_view_event;
                            homeSectionContent = toHomeSectionContent(protoValidationScope2, str, creditLineSnapshot, heroBalanceSection, appletCardSection, orderListSection, list, paymentMgmtSection, sectionHeader, creditLineSectionHeader, imageTextSection, pageHeaderSection, avatarTextSection, textLinesSection, iconTextSection, heroUpsellSection, prepurchaseCardToggleSection, banner, areEqual222222222222, analyticsEvent222222222222 != null ? CollectionsKt__CollectionsJVMKt.listOf(HeaderSectionKt.toAfterpayAppletAnalyticsEventsSpec(analyticsEvent222222222222)) : null);
                            if (homeSectionContent != null) {
                            }
                            protoValidationScope2 = protoValidationScope;
                        }
                    }
                    appletCardSection = null;
                    if (localMenuHoursViewKt != null) {
                    }
                    paymentMgmtSection = null;
                    localMenuSelectorKt = afterpayAppletHomeSection.section_header;
                    if (localMenuSelectorKt != null) {
                    }
                    sectionHeader = null;
                    if (localMenuSelectorKt != null) {
                    }
                    creditLineSectionHeader = null;
                    if (localMenuHoursViewKt != null) {
                    }
                    orderListSection = null;
                    if (localMenuHoursViewKt != null) {
                    }
                    textLinesSection = null;
                    if (localMenuHoursViewKt != null) {
                    }
                    imageTextSection = null;
                    if (localMenuHoursViewKt != null) {
                    }
                    pageHeaderSection = null;
                    if (localMenuHoursViewKt != null) {
                    }
                    avatarTextSection = null;
                    if (localMenuHoursViewKt != null) {
                    }
                    iconTextSection = null;
                    if (localMenuHoursViewKt != null) {
                    }
                    heroUpsellSection = null;
                    if (localMenuHoursViewKt != null) {
                    }
                    prepurchaseCardToggleSection = null;
                    if (localMenuHoursViewKt != null) {
                    }
                    banner = null;
                    boolean areEqual2222222222222 = Intrinsics.areEqual(afterpayAppletHomeSection.show_divider, Boolean.TRUE);
                    AnalyticsEvent analyticsEvent2222222222222 = afterpayAppletHomeSection.analytic_view_event;
                    homeSectionContent = toHomeSectionContent(protoValidationScope2, str, creditLineSnapshot, heroBalanceSection, appletCardSection, orderListSection, list, paymentMgmtSection, sectionHeader, creditLineSectionHeader, imageTextSection, pageHeaderSection, avatarTextSection, textLinesSection, iconTextSection, heroUpsellSection, prepurchaseCardToggleSection, banner, areEqual2222222222222, analyticsEvent2222222222222 != null ? CollectionsKt__CollectionsJVMKt.listOf(HeaderSectionKt.toAfterpayAppletAnalyticsEventsSpec(analyticsEvent2222222222222)) : null);
                    if (homeSectionContent != null) {
                    }
                    protoValidationScope2 = protoValidationScope;
                }
            }
            heroBalanceSection = null;
            if (localMenuHoursViewKt != null) {
            }
            appletCardSection = null;
            if (localMenuHoursViewKt != null) {
            }
            paymentMgmtSection = null;
            localMenuSelectorKt = afterpayAppletHomeSection.section_header;
            if (localMenuSelectorKt != null) {
            }
            sectionHeader = null;
            if (localMenuSelectorKt != null) {
            }
            creditLineSectionHeader = null;
            if (localMenuHoursViewKt != null) {
            }
            orderListSection = null;
            if (localMenuHoursViewKt != null) {
            }
            textLinesSection = null;
            if (localMenuHoursViewKt != null) {
            }
            imageTextSection = null;
            if (localMenuHoursViewKt != null) {
            }
            pageHeaderSection = null;
            if (localMenuHoursViewKt != null) {
            }
            avatarTextSection = null;
            if (localMenuHoursViewKt != null) {
            }
            iconTextSection = null;
            if (localMenuHoursViewKt != null) {
            }
            heroUpsellSection = null;
            if (localMenuHoursViewKt != null) {
            }
            prepurchaseCardToggleSection = null;
            if (localMenuHoursViewKt != null) {
            }
            banner = null;
            boolean areEqual22222222222222 = Intrinsics.areEqual(afterpayAppletHomeSection.show_divider, Boolean.TRUE);
            AnalyticsEvent analyticsEvent22222222222222 = afterpayAppletHomeSection.analytic_view_event;
            homeSectionContent = toHomeSectionContent(protoValidationScope2, str, creditLineSnapshot, heroBalanceSection, appletCardSection, orderListSection, list, paymentMgmtSection, sectionHeader, creditLineSectionHeader, imageTextSection, pageHeaderSection, avatarTextSection, textLinesSection, iconTextSection, heroUpsellSection, prepurchaseCardToggleSection, banner, areEqual22222222222222, analyticsEvent22222222222222 != null ? CollectionsKt__CollectionsJVMKt.listOf(HeaderSectionKt.toAfterpayAppletAnalyticsEventsSpec(analyticsEvent22222222222222)) : null);
            if (homeSectionContent != null) {
            }
            protoValidationScope2 = protoValidationScope;
        }
        AbstractPersistentList persistentList = Tags.toPersistentList(arrayList);
        String translated = (footer == null || (localizedString = footer.footer_markdown_text) == null) ? null : StringsKt.translated(localizedString);
        if (translated != null) {
            return persistentList.add((Object) new AfterpayAppletHomeContentViewModel.HomeSection("footer_id", false, new AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.Legal(translated, (footer == null || (icon = footer.arcade_icon) == null) ? null : icon.arcade_id), null));
        }
        return persistentList;
    }

    public final AfterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader toCardHeaderViewModel(ProtoValidationScope protoValidationScope, AppletCardSection.StandardHeader standardHeader) {
        TappableIcon tappableIcon;
        String str;
        Money money = standardHeader.amount;
        String format2 = money != null ? this.moneyFormatterStandard.format(money) : null;
        LocalizedString localizedString = standardHeader.amount_caption;
        String translated = localizedString != null ? StringsKt.translated(localizedString) : null;
        com.squareup.protos.cash.shop.rendering.api.TappableIcon tappableIcon2 = standardHeader.amount_caption_tappable_info;
        if (tappableIcon2 != null) {
            Icon icon = tappableIcon2.arcade_icon;
            if (icon == null || (str = icon.arcade_id) == null) {
                zzd zzdVar = Icons.Companion;
                str = "vgB7eh";
            }
            TapAction tapAction = tappableIcon2.tap_action;
            Tap tapViewModel = tapAction != null ? AfterpayAppletHomeMapperKt.toTapViewModel(protoValidationScope, tapAction) : null;
            LocalizedString localizedString2 = tappableIcon2.accessibility_text;
            tappableIcon = new TappableIcon(str, tapViewModel, localizedString2 != null ? localizedString2.translated_value : null);
        } else {
            tappableIcon = null;
        }
        LocalizedString localizedString3 = standardHeader.body;
        String translated2 = localizedString3 != null ? StringsKt.translated(localizedString3) : null;
        AppletCardSection.StandardHeader.DisplayStyle displayStyle = standardHeader.display_style;
        return new AfterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader(null, format2, translated, tappableIcon, translated2, (displayStyle == null ? -1 : WhenMappings.$EnumSwitchMapping$3[displayStyle.ordinal()]) == 1 ? AfterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader.SectionDisplayEffect.DISABLED_EFFECT : AfterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader.SectionDisplayEffect.REGULAR_EFFECT);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AfterpayAppletHomeContentViewModel.HomeSection.CreditSectionHeader toCreditLineSectionHeader(ProtoValidationScope protoValidationScope, CreditLineSectionHeader creditLineSectionHeader, CreditLineSnapshot creditLineSnapshot) {
        MoneyBar moneyBar;
        String str;
        CreditLineSectionHeader.DisplayEffect displayEffect;
        Money money;
        String str2;
        NodeReuseKt nodeReuseKt = creditLineSectionHeader.subtitle;
        AfterpayAppletHomeContentViewModel.HomeSection.AppletCreditLineType appletCreditLineType = null;
        if (nodeReuseKt != null) {
            CreditLineSectionHeader$Subtitle$MoneyBar creditLineSectionHeader$Subtitle$MoneyBar = nodeReuseKt instanceof CreditLineSectionHeader$Subtitle$MoneyBar ? (CreditLineSectionHeader$Subtitle$MoneyBar) nodeReuseKt : null;
            if (creditLineSectionHeader$Subtitle$MoneyBar != null) {
                moneyBar = creditLineSectionHeader$Subtitle$MoneyBar.value;
                if (moneyBar == null) {
                    return toMoneyBarCreditHeader(protoValidationScope, creditLineSectionHeader, creditLineSnapshot);
                }
                LocalizedString localizedString = creditLineSectionHeader.title;
                String translated = localizedString != null ? StringsKt.translated(localizedString) : null;
                if (translated == null) {
                    a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                    return null;
                }
                if (nodeReuseKt != null) {
                    CreditLineSectionHeader$Subtitle$TextSubtitle creditLineSectionHeader$Subtitle$TextSubtitle = nodeReuseKt instanceof CreditLineSectionHeader$Subtitle$TextSubtitle ? (CreditLineSectionHeader$Subtitle$TextSubtitle) nodeReuseKt : null;
                    LocalizedString localizedString2 = creditLineSectionHeader$Subtitle$TextSubtitle != null ? creditLineSectionHeader$Subtitle$TextSubtitle.value : null;
                    if (localizedString2 != null) {
                        str = StringsKt.translated(localizedString2);
                        displayEffect = creditLineSectionHeader.display_effect;
                        if ((displayEffect != null ? -1 : WhenMappings.$EnumSwitchMapping$0[displayEffect.ordinal()]) != 1) {
                            if (str != null) {
                                return new AfterpayAppletHomeContentViewModel.HomeSection.CreditSectionHeader.FadedCreditHeader(translated, str);
                            }
                            a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                            return null;
                        }
                        if (nodeReuseKt != null) {
                            CreditLineSectionHeader$Subtitle$CreditLine creditLineSectionHeader$Subtitle$CreditLine = nodeReuseKt instanceof CreditLineSectionHeader$Subtitle$CreditLine ? (CreditLineSectionHeader$Subtitle$CreditLine) nodeReuseKt : null;
                            CreditLineType creditLineType = creditLineSectionHeader$Subtitle$CreditLine != null ? creditLineSectionHeader$Subtitle$CreditLine.value : null;
                            if (creditLineType != null) {
                                int ordinal = creditLineType.ordinal();
                                if (ordinal == 0) {
                                    money = EarningTool.Tool.remainingINNMoney(creditLineSnapshot);
                                } else if (ordinal == 1) {
                                    money = EarningTool.Tool.remainingONNMoney(creditLineSnapshot);
                                } else if (ordinal == 2) {
                                    money = EarningTool.Tool.totalRemainingMoney(creditLineSnapshot);
                                } else {
                                    if (ordinal != 3) {
                                        if (ordinal == 4) {
                                            throw new NotImplementedError(null, 1, null);
                                        }
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return null;
                                    }
                                    money = EarningTool.Tool.remainingRetroMoney(creditLineSnapshot);
                                }
                                AndroidStringManager androidStringManager = this.stringManager;
                                if (money == null) {
                                    String format2 = this.moneyFormatterStandard.format(money);
                                    format2.getClass();
                                    Resources resources = androidStringManager.resources;
                                    resources.getClass();
                                    str2 = new MessageFormat(resources.getString(R.string.Up_to_credit)).format(new Object[]{format2});
                                    str2.getClass();
                                } else {
                                    str2 = null;
                                }
                                TapAction tapAction = creditLineSectionHeader.tap_action;
                                Tap tapViewModel = tapAction == null ? AfterpayAppletHomeMapperKt.toTapViewModel(protoValidationScope, tapAction) : null;
                                String str3 = str != null ? str2 : str;
                                String str4 = tapViewModel == null ? androidStringManager.get(R.string.action_text) : null;
                                if (nodeReuseKt != null) {
                                    CreditLineSectionHeader$Subtitle$CreditLine creditLineSectionHeader$Subtitle$CreditLine2 = nodeReuseKt instanceof CreditLineSectionHeader$Subtitle$CreditLine ? (CreditLineSectionHeader$Subtitle$CreditLine) nodeReuseKt : null;
                                    CreditLineType creditLineType2 = creditLineSectionHeader$Subtitle$CreditLine2 != null ? creditLineSectionHeader$Subtitle$CreditLine2.value : null;
                                    if (creditLineType2 != null) {
                                        appletCreditLineType = AfterpayAppletHomeMapperKt.toAppletLineType(creditLineType2);
                                    }
                                }
                                return new AfterpayAppletHomeContentViewModel.HomeSection.CreditSectionHeader.DefaultCreditHeader(translated, str3, tapViewModel, str4, appletCreditLineType);
                            }
                        }
                        money = null;
                        AndroidStringManager androidStringManager2 = this.stringManager;
                        if (money == null) {
                        }
                        TapAction tapAction2 = creditLineSectionHeader.tap_action;
                        if (tapAction2 == null) {
                        }
                        if (str != null) {
                        }
                        if (tapViewModel == null) {
                        }
                        if (nodeReuseKt != null) {
                        }
                        return new AfterpayAppletHomeContentViewModel.HomeSection.CreditSectionHeader.DefaultCreditHeader(translated, str3, tapViewModel, str4, appletCreditLineType);
                    }
                }
                str = null;
                displayEffect = creditLineSectionHeader.display_effect;
                if ((displayEffect != null ? -1 : WhenMappings.$EnumSwitchMapping$0[displayEffect.ordinal()]) != 1) {
                }
            }
        }
        moneyBar = null;
        if (moneyBar == null) {
        }
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
    public final com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel.HomeSection toHomeSectionContent(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r39v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AfterpayAppletHomeContentViewModel.HomeSection.MoneyBarSectionHeader toMoneyBarCreditHeader(ProtoValidationScope protoValidationScope, CreditLineSectionHeader creditLineSectionHeader, CreditLineSnapshot creditLineSnapshot) {
        MoneyBar moneyBar;
        int ordinal;
        Pair pair;
        com.squareup.protos.cash.shop.rendering.api.TappableIcon tappableIcon;
        TappableIcon tappableIcon2;
        String str;
        NodeReuseKt nodeReuseKt = creditLineSectionHeader.subtitle;
        if (nodeReuseKt != null) {
            CreditLineSectionHeader$Subtitle$MoneyBar creditLineSectionHeader$Subtitle$MoneyBar = nodeReuseKt instanceof CreditLineSectionHeader$Subtitle$MoneyBar ? (CreditLineSectionHeader$Subtitle$MoneyBar) nodeReuseKt : null;
            if (creditLineSectionHeader$Subtitle$MoneyBar != null) {
                moneyBar = creditLineSectionHeader$Subtitle$MoneyBar.value;
                ProtoValidationScope.required(moneyBar, "subtitle?.money_bar");
                String required = ProtoValidationScope.required(creditLineSectionHeader.title, "title");
                CreditLineSectionHeader.DisplayEffect displayEffect = creditLineSectionHeader.display_effect;
                boolean z = (displayEffect != null ? -1 : WhenMappings.$EnumSwitchMapping$0[displayEffect.ordinal()]) == 1;
                CreditLineType creditLineType = moneyBar.credit_line;
                ProtoValidationScope.required(creditLineType, "credit_line");
                ordinal = creditLineType.ordinal();
                if (ordinal != 0) {
                    Money remainingINNMoney = EarningTool.Tool.remainingINNMoney(creditLineSnapshot);
                    ArrayList creditLines = EarningTool.Tool.creditLines(creditLineSnapshot);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = creditLines.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (((CreditLineData) next).line_type == CreditLineType.INN) {
                            arrayList.add(next);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Money money = ((CreditLineData) it2.next()).total_granted_credit;
                        if (money != null) {
                            arrayList2.add(money);
                        }
                    }
                    pair = new Pair(remainingINNMoney, EarningTool.Tool.sumOfMoney(arrayList2));
                } else if (ordinal == 1) {
                    Money remainingONNMoney = EarningTool.Tool.remainingONNMoney(creditLineSnapshot);
                    ArrayList creditLines2 = EarningTool.Tool.creditLines(creditLineSnapshot);
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it3 = creditLines2.iterator();
                    while (it3.hasNext()) {
                        Object next2 = it3.next();
                        if (((CreditLineData) next2).line_type == CreditLineType.OON) {
                            arrayList3.add(next2);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it4 = arrayList3.iterator();
                    while (it4.hasNext()) {
                        Money money2 = ((CreditLineData) it4.next()).total_granted_credit;
                        if (money2 != null) {
                            arrayList4.add(money2);
                        }
                    }
                    pair = new Pair(remainingONNMoney, EarningTool.Tool.sumOfMoney(arrayList4));
                } else if (ordinal == 2) {
                    Money money3 = EarningTool.Tool.totalRemainingMoney(creditLineSnapshot);
                    List list = creditLineSnapshot.credit_lines;
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj : list) {
                        if (((CreditLineData) obj).line_type == CreditLineType.ALL) {
                            arrayList5.add(obj);
                        }
                    }
                    ArrayList arrayList6 = new ArrayList();
                    Iterator it5 = arrayList5.iterator();
                    while (it5.hasNext()) {
                        Money money4 = ((CreditLineData) it5.next()).total_granted_credit;
                        if (money4 != null) {
                            arrayList6.add(money4);
                        }
                    }
                    pair = new Pair(money3, EarningTool.Tool.sumOfMoney(arrayList6));
                } else {
                    if (ordinal != 3) {
                        if (ordinal == 4) {
                            throw new NotImplementedError(null, 1, null);
                        }
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    Money remainingRetroMoney = EarningTool.Tool.remainingRetroMoney(creditLineSnapshot);
                    ArrayList creditLines3 = EarningTool.Tool.creditLines(creditLineSnapshot);
                    ArrayList arrayList7 = new ArrayList();
                    Iterator it6 = creditLines3.iterator();
                    while (it6.hasNext()) {
                        Object next3 = it6.next();
                        if (((CreditLineData) next3).line_type == CreditLineType.RETRO) {
                            arrayList7.add(next3);
                        }
                    }
                    ArrayList arrayList8 = new ArrayList();
                    Iterator it7 = arrayList7.iterator();
                    while (it7.hasNext()) {
                        Money money5 = ((CreditLineData) it7.next()).total_granted_credit;
                        if (money5 != null) {
                            arrayList8.add(money5);
                        }
                    }
                    pair = new Pair(remainingRetroMoney, EarningTool.Tool.sumOfMoney(arrayList8));
                }
                Money money6 = (Money) pair.first;
                Money money7 = (Money) pair.second;
                TapAction tapAction = creditLineSectionHeader.tap_action;
                Tap tapViewModel = tapAction == null ? AfterpayAppletHomeMapperKt.toTapViewModel(protoValidationScope, tapAction) : null;
                tappableIcon = creditLineSectionHeader.tappable_info;
                if (tappableIcon == null) {
                    Icon icon = tappableIcon.arcade_icon;
                    if (icon == null || (str = icon.arcade_id) == null) {
                        zzd zzdVar = Icons.Companion;
                        str = "vgB7eh";
                    }
                    TapAction tapAction2 = tappableIcon.tap_action;
                    Tap tapViewModel2 = tapAction2 != null ? AfterpayAppletHomeMapperKt.toTapViewModel(protoValidationScope, tapAction2) : null;
                    LocalizedString localizedString = tappableIcon.accessibility_text;
                    tappableIcon2 = new TappableIcon(str, tapViewModel2, localizedString != null ? localizedString.translated_value : null);
                } else {
                    tappableIcon2 = null;
                }
                String format2 = this.moneyFormatterStandard.format(money6);
                AfterpayAppletHomeContentViewModel.HomeSection.MoneyBarSectionHeader.ProgressBar progressBar = new AfterpayAppletHomeContentViewModel.HomeSection.MoneyBarSectionHeader.ProgressBar(AfterpayAppletHomeMapperKt.toAppletLineType(creditLineType), Moneys.div(money6, money7), ((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) this.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$AfterpayAppletMoneybarAnimation.INSTANCE)).enabled());
                AndroidStringManager androidStringManager = this.stringManager;
                return new AfterpayAppletHomeContentViewModel.HomeSection.MoneyBarSectionHeader(required, format2, progressBar, androidStringManager.get(R.string.money_bar_progress_start), this.moneyFormatterStandardCompact.format(money7), tapViewModel != null ? androidStringManager.get(R.string.action_text) : null, tapViewModel, tappableIcon2, z);
            }
        }
        moneyBar = null;
        ProtoValidationScope.required(moneyBar, "subtitle?.money_bar");
        String required2 = ProtoValidationScope.required(creditLineSectionHeader.title, "title");
        CreditLineSectionHeader.DisplayEffect displayEffect2 = creditLineSectionHeader.display_effect;
        if ((displayEffect2 != null ? -1 : WhenMappings.$EnumSwitchMapping$0[displayEffect2.ordinal()]) == 1) {
        }
        CreditLineType creditLineType2 = moneyBar.credit_line;
        ProtoValidationScope.required(creditLineType2, "credit_line");
        ordinal = creditLineType2.ordinal();
        if (ordinal != 0) {
        }
        Money money62 = (Money) pair.first;
        Money money72 = (Money) pair.second;
        TapAction tapAction3 = creditLineSectionHeader.tap_action;
        if (tapAction3 == null) {
        }
        tappableIcon = creditLineSectionHeader.tappable_info;
        if (tappableIcon == null) {
        }
        String format22 = this.moneyFormatterStandard.format(money62);
        AfterpayAppletHomeContentViewModel.HomeSection.MoneyBarSectionHeader.ProgressBar progressBar2 = new AfterpayAppletHomeContentViewModel.HomeSection.MoneyBarSectionHeader.ProgressBar(AfterpayAppletHomeMapperKt.toAppletLineType(creditLineType2), Moneys.div(money62, money72), ((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) this.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$AfterpayAppletMoneybarAnimation.INSTANCE)).enabled());
        AndroidStringManager androidStringManager2 = this.stringManager;
        return new AfterpayAppletHomeContentViewModel.HomeSection.MoneyBarSectionHeader(required2, format22, progressBar2, androidStringManager2.get(R.string.money_bar_progress_start), this.moneyFormatterStandardCompact.format(money72), tapViewModel != null ? androidStringManager2.get(R.string.action_text) : null, tapViewModel, tappableIcon2, z);
    }
}
