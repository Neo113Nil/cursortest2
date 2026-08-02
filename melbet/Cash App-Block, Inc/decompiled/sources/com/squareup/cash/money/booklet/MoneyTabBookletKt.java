package com.squareup.cash.money.booklet;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.compat.quirk.StillCaptureFlashStopRepeatingQuirk;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.RequestTemplate;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.room.util.DBUtil;
import app.cash.local.views.instore.TableQrCodeScannerViewKt;
import app.cash.local.views.internal.menus.LocalMenuHoursViewKt;
import app.cash.local.views.internal.menus.LocalMenuSelectorKt;
import app.cash.local.views.toolbar.LocalToolbarKt;
import com.datadog.android.rum.model.ErrorEvent;
import com.google.android.gms.internal.mlkit_vision_barcode.zzuv;
import com.google.android.gms.internal.mlkit_vision_common.zzlc;
import com.google.android.gms.internal.mlkit_vision_common.zzld;
import com.google.android.gms.internal.mlkit_vision_common.zzle;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.money.views.HypeWelcomeUIKt$$ExternalSyntheticLambda0;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletEntrypoint;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletEntrypoint$Entrypoint$CreditBalance;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletEntrypoint$Entrypoint$CreditDetails;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletEntrypoint$Entrypoint$OverDue;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletEntrypoint$Entrypoint$Uninstalled;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletEntrypoint$Entrypoint$V3LoanBrief;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletEntrypoint$Entrypoint$V3TextBrief;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletEntrypoint$Entrypoint$V3Uninstalled;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletHomeSection;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletHomeSection$Section$AvatarTextSection;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletHomeSection$Section$Banner;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletHomeSection$Section$CardSection;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletHomeSection$Section$CheckEligibility;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletHomeSection$Section$HeroBalanceSection;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletHomeSection$Section$HeroUpsellSection;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletHomeSection$Section$OrderList;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletHomeSection$Section$PageHeaderSection;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletHomeSection$Section$PaymentMgmt;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletHomeSection$Section$PrepurchaseCardToggleSection;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletHomeSection$Section$TextLinesSection;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletHomeSection$SectionHeader$CreditLineHeader;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletHomeSection$SectionHeader$StandardHeader;
import com.squareup.protos.cash.cashsuggest.api.AppletCardSection;
import com.squareup.protos.cash.cashsuggest.api.AppletCardSection$Content$ImageTextContent;
import com.squareup.protos.cash.cashsuggest.api.AppletCardSection$Content$TileCarousel;
import com.squareup.protos.cash.cashsuggest.api.AppletCardSection$Content$TransactionList;
import com.squareup.protos.cash.cashsuggest.api.AppletCardSection$Footer$AvatarTextFooter;
import com.squareup.protos.cash.cashsuggest.api.AppletCardSection$Footer$ButtonTextFooter;
import com.squareup.protos.cash.cashsuggest.api.AppletCardSection$Footer$TappableFooter;
import com.squareup.protos.cash.cashsuggest.api.AppletCardSection$Header$StandardHeader;
import com.squareup.protos.cash.cashsuggest.api.Banner;
import com.squareup.protos.cash.cashsuggest.api.CreditLineSectionHeader;
import com.squareup.protos.cash.cashsuggest.api.CreditLineSectionHeader$Subtitle$CreditLine;
import com.squareup.protos.cash.cashsuggest.api.CreditLineType;
import com.squareup.protos.cash.cashsuggest.api.HeroBalanceSection;
import com.squareup.protos.cash.cashsuggest.api.HeroBalanceSection$Content$NoBalance;
import com.squareup.protos.cash.cashsuggest.api.HeroBalanceSection$Content$PaymentCalendar;
import com.squareup.protos.cash.cashsuggest.api.HeroUpsellSection;
import com.squareup.protos.cash.cashsuggest.api.OrderListSection;
import com.squareup.protos.cash.cashsuggest.api.OrderListSection$ScreenContent$EligibleOrders;
import com.squareup.protos.cash.cashsuggest.api.PaymentMgmtSection;
import com.squareup.protos.cash.cashsuggest.api.PrepurchaseCardToggleSection;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.protos.cash.shop.rendering.api.AvatarCarouselSection;
import com.squareup.protos.cash.shop.rendering.api.AvatarTextSection;
import com.squareup.protos.cash.shop.rendering.api.CategoryTileSection;
import com.squareup.protos.cash.shop.rendering.api.CategoryTileSection$CategoryTile$Style$IconStyle;
import com.squareup.protos.cash.shop.rendering.api.ClearInputTapAction;
import com.squareup.protos.cash.shop.rendering.api.DismissTapAction;
import com.squareup.protos.cash.shop.rendering.api.EngagedItemToken;
import com.squareup.protos.cash.shop.rendering.api.EngagedItemToken$Token$MerchantToken;
import com.squareup.protos.cash.shop.rendering.api.FilterGroupSection;
import com.squareup.protos.cash.shop.rendering.api.FilterGroupSection$FilterGroupItem$Style$FilterSheet;
import com.squareup.protos.cash.shop.rendering.api.FilterGroupSection$FilterGroupItem$Style$FilterToggle;
import com.squareup.protos.cash.shop.rendering.api.ImageTextSection;
import com.squareup.protos.cash.shop.rendering.api.InfoSheet;
import com.squareup.protos.cash.shop.rendering.api.PageHeaderSection;
import com.squareup.protos.cash.shop.rendering.api.RowSection;
import com.squareup.protos.cash.shop.rendering.api.RowSection$Row$Type$AvatarRow;
import com.squareup.protos.cash.shop.rendering.api.RowSection$Row$Type$FilterRow;
import com.squareup.protos.cash.shop.rendering.api.SearchSection;
import com.squareup.protos.cash.shop.rendering.api.SearchSection$Content$AvartarCarouselSection;
import com.squareup.protos.cash.shop.rendering.api.SearchSection$Content$ImageTextSection;
import com.squareup.protos.cash.shop.rendering.api.SearchSection$Content$RowSection;
import com.squareup.protos.cash.shop.rendering.api.SearchSection$Content$TileSection;
import com.squareup.protos.cash.shop.rendering.api.SearchSection$Content$UpsellCard;
import com.squareup.protos.cash.shop.rendering.api.SectionHeader;
import com.squareup.protos.cash.shop.rendering.api.TapAction;
import com.squareup.protos.cash.shop.rendering.api.TapAction$Action$ClearInputAction;
import com.squareup.protos.cash.shop.rendering.api.TapAction$Action$DismissAction;
import com.squareup.protos.cash.shop.rendering.api.TapAction$Action$OpenInfoSheetAction;
import com.squareup.protos.cash.shop.rendering.api.TapAction$Action$UrlAction;
import com.squareup.protos.cash.shop.rendering.api.TextLinesSection;
import com.squareup.protos.cash.shop.rendering.api.UpsellCardSection;
import com.squareup.protos.cash.shop.rendering.api.UrlTapAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import okio.ByteString;

/* loaded from: classes5.dex */
public abstract class MoneyTabBookletKt {
    public static final void MoneyTabBooklet(MoneyTabBookletViewModel moneyTabBookletViewModel, Function1 function1, Composer composer, int i) {
        moneyTabBookletViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1158319874);
        int i2 = (gapComposer.changedInstance(moneyTabBookletViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(731043785, new MoneyTabBookletKt$$ExternalSyntheticLambda0(function1, moneyTabBookletViewModel), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MoneyTabBookletKt$$ExternalSyntheticLambda0(moneyTabBookletViewModel, function1, i);
        }
    }

    public static final void SpacerBetweenSections(MoneyTabBookletSection moneyTabBookletSection, MoneyTabBookletSection moneyTabBookletSection2, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1994526379);
        int i2 = (gapComposer.changedInstance(moneyTabBookletSection) ? 4 : 2) | i | (gapComposer.changedInstance(moneyTabBookletSection2) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            boolean z = moneyTabBookletSection instanceof CardSection;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (z && (moneyTabBookletSection2 instanceof CardSection)) {
                gapComposer.startReplaceGroup(1184441359);
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 16.0f));
                gapComposer.end(false);
            } else if (z && (moneyTabBookletSection2 instanceof ListUnorderedCardSection)) {
                gapComposer.startReplaceGroup(1184445871);
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 16.0f));
                gapComposer.end(false);
            } else if ((moneyTabBookletSection instanceof CollapsibleDetailsSection) && (moneyTabBookletSection2 instanceof DisclosureSection)) {
                gapComposer.startReplaceGroup(1184450567);
                DBUtil.SpacerBetweenSectionXLarge(0, 1, gapComposer, null);
                gapComposer.end(false);
            } else {
                boolean z2 = moneyTabBookletSection instanceof HeaderSection;
                if (z2 && (moneyTabBookletSection2 instanceof CollapsibleDetailsSection)) {
                    gapComposer.startReplaceGroup(1184453702);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                    gapComposer.end(false);
                } else if (z2 && (moneyTabBookletSection2 instanceof ListUnorderedSection)) {
                    gapComposer.startReplaceGroup(1184456645);
                    DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer, null);
                    gapComposer.end(false);
                } else if ((moneyTabBookletSection instanceof HeroSection) && (moneyTabBookletSection2 instanceof HeaderSection)) {
                    gapComposer.startReplaceGroup(1184459270);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                    gapComposer.end(false);
                } else if ((moneyTabBookletSection instanceof ListUnorderedSection) && (moneyTabBookletSection2 instanceof CardSection)) {
                    gapComposer.startReplaceGroup(1184462151);
                    DBUtil.SpacerBetweenSectionXLarge(0, 1, gapComposer, null);
                    gapComposer.end(false);
                } else if ((moneyTabBookletSection instanceof ListUnorderedCardSection) && (moneyTabBookletSection2 instanceof HeaderSection)) {
                    gapComposer.startReplaceGroup(1184465255);
                    DBUtil.SpacerBetweenSectionXLarge(0, 1, gapComposer, null);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(1184466566);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                    gapComposer.end(false);
                }
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HypeWelcomeUIKt$$ExternalSyntheticLambda0(moneyTabBookletSection, moneyTabBookletSection2, i, 23);
        }
    }

    public static void afterpayAppletEntrypoint$default(LocalizedString localizedString, AfterpayAppletEntrypoint.CreditBalance creditBalance, AfterpayAppletEntrypoint.Overdue overdue, AfterpayAppletEntrypoint.CreditDetails creditDetails, AfterpayAppletEntrypoint.Uninstalled uninstalled, AfterpayAppletEntrypoint.V3Uninstalled v3Uninstalled, AfterpayAppletEntrypoint.V3LoanBrief v3LoanBrief, AfterpayAppletEntrypoint.V3TextBrief v3TextBrief, AnalyticsEvent analyticsEvent, AnalyticsEvent analyticsEvent2, int i) {
        TableQrCodeScannerViewKt tableQrCodeScannerViewKt = null;
        AfterpayAppletEntrypoint.CreditBalance creditBalance2 = (i & 4) != 0 ? null : creditBalance;
        AfterpayAppletEntrypoint.Overdue overdue2 = (i & 8) != 0 ? null : overdue;
        AfterpayAppletEntrypoint.CreditDetails creditDetails2 = (i & 16) != 0 ? null : creditDetails;
        AfterpayAppletEntrypoint.Uninstalled uninstalled2 = (i & 32) != 0 ? null : uninstalled;
        AfterpayAppletEntrypoint.V3Uninstalled v3Uninstalled2 = (i & 64) != 0 ? null : v3Uninstalled;
        AfterpayAppletEntrypoint.V3LoanBrief v3LoanBrief2 = (i & 128) != 0 ? null : v3LoanBrief;
        AfterpayAppletEntrypoint.V3TextBrief v3TextBrief2 = (i & 256) != 0 ? null : v3TextBrief;
        if (creditBalance2 != null) {
            tableQrCodeScannerViewKt = new AfterpayAppletEntrypoint$Entrypoint$CreditBalance(creditBalance2);
        } else if (overdue2 != null) {
            tableQrCodeScannerViewKt = new AfterpayAppletEntrypoint$Entrypoint$OverDue(overdue2);
        } else if (creditDetails2 != null) {
            tableQrCodeScannerViewKt = new AfterpayAppletEntrypoint$Entrypoint$CreditDetails(creditDetails2);
        } else if (uninstalled2 != null) {
            tableQrCodeScannerViewKt = new AfterpayAppletEntrypoint$Entrypoint$Uninstalled(uninstalled2);
        } else if (v3Uninstalled2 != null) {
            tableQrCodeScannerViewKt = new AfterpayAppletEntrypoint$Entrypoint$V3Uninstalled(v3Uninstalled2);
        } else if (v3LoanBrief2 != null) {
            tableQrCodeScannerViewKt = new AfterpayAppletEntrypoint$Entrypoint$V3LoanBrief(v3LoanBrief2);
        } else if (v3TextBrief2 != null) {
            tableQrCodeScannerViewKt = new AfterpayAppletEntrypoint$Entrypoint$V3TextBrief(v3TextBrief2);
        }
        new AfterpayAppletEntrypoint(localizedString, tableQrCodeScannerViewKt, analyticsEvent, analyticsEvent2, null, ByteString.EMPTY);
    }

    public static AppletCardSection appletCardSection$default(AppletCardSection.StandardHeader standardHeader, AppletCardSection.TransactionList transactionList, AppletCardSection.TileCarousel tileCarousel, AppletCardSection.ImageTextContent imageTextContent, AppletCardSection.TappableFooter tappableFooter, AppletCardSection.ButtonTextFooter buttonTextFooter, AppletCardSection.AvatarTextFooter avatarTextFooter, int i) {
        LocalToolbarKt localToolbarKt = null;
        if ((i & 2) != 0) {
            transactionList = null;
        }
        if ((i & 4) != 0) {
            tileCarousel = null;
        }
        if ((i & 8) != 0) {
            imageTextContent = null;
        }
        if ((i & 16) != 0) {
            tappableFooter = null;
        }
        if ((i & 32) != 0) {
            buttonTextFooter = null;
        }
        if ((i & 64) != 0) {
            avatarTextFooter = null;
        }
        AppletCardSection$Header$StandardHeader appletCardSection$Header$StandardHeader = new AppletCardSection$Header$StandardHeader(standardHeader);
        zzuv appletCardSection$Content$TransactionList = transactionList != null ? new AppletCardSection$Content$TransactionList(transactionList) : tileCarousel != null ? new AppletCardSection$Content$TileCarousel(tileCarousel) : imageTextContent != null ? new AppletCardSection$Content$ImageTextContent(imageTextContent) : null;
        if (tappableFooter != null) {
            localToolbarKt = new AppletCardSection$Footer$TappableFooter(tappableFooter);
        } else if (buttonTextFooter != null) {
            localToolbarKt = new AppletCardSection$Footer$ButtonTextFooter(buttonTextFooter);
        } else if (avatarTextFooter != null) {
            localToolbarKt = new AppletCardSection$Footer$AvatarTextFooter(avatarTextFooter);
        }
        return new AppletCardSection(appletCardSection$Header$StandardHeader, appletCardSection$Content$TransactionList, localToolbarKt, ByteString.EMPTY);
    }

    public static CategoryTileSection.CategoryTile categoryTile$default(AnalyticsEvent analyticsEvent, TapAction tapAction, LocalizedString localizedString, CategoryTileSection.CategoryTile.IconStyle iconStyle) {
        return new CategoryTileSection.CategoryTile(analyticsEvent, tapAction, localizedString, new CategoryTileSection$CategoryTile$Style$IconStyle(iconStyle), null, null, ByteString.EMPTY);
    }

    public static CreditLineSectionHeader creditLineSectionHeader$default(LocalizedString localizedString, TapAction tapAction) {
        return new CreditLineSectionHeader(localizedString, null, null, tapAction, new CreditLineSectionHeader$Subtitle$CreditLine(CreditLineType.RETRO), null, ByteString.EMPTY);
    }

    public static EngagedItemToken engagedItemToken$default(String str) {
        return new EngagedItemToken(new EngagedItemToken$Token$MerchantToken(str));
    }

    public static FilterGroupSection.FilterGroupItem filterGroupItem$default(LocalizedString localizedString, FilterGroupSection.FilterGroupItem.Sheet sheet, FilterGroupSection.FilterGroupItem.Toggle toggle, int i) {
        ErrorEvent.Os.Companion companion = null;
        if ((i & 2) != 0) {
            sheet = null;
        }
        if ((i & 4) != 0) {
            toggle = null;
        }
        if (sheet != null) {
            companion = new FilterGroupSection$FilterGroupItem$Style$FilterSheet(sheet);
        } else if (toggle != null) {
            companion = new FilterGroupSection$FilterGroupItem$Style$FilterToggle(toggle);
        }
        return new FilterGroupSection.FilterGroupItem(localizedString, companion, null, null, ByteString.EMPTY);
    }

    public static final HeroBalanceSection heroBalanceSection(HeroBalanceSection.NoBalance noBalance, HeroBalanceSection.PaymentCalendar paymentCalendar) {
        return new HeroBalanceSection(noBalance != null ? new HeroBalanceSection$Content$NoBalance(noBalance) : paymentCalendar != null ? new HeroBalanceSection$Content$PaymentCalendar(paymentCalendar) : null, ByteString.EMPTY);
    }

    public static AfterpayAppletHomeSection homeSection$default(SectionHeader sectionHeader, CreditLineSectionHeader creditLineSectionHeader, Boolean bool, PaymentMgmtSection paymentMgmtSection, ImageTextSection imageTextSection, OrderListSection orderListSection, AvatarTextSection avatarTextSection, TextLinesSection textLinesSection, PageHeaderSection pageHeaderSection, AppletCardSection appletCardSection, HeroBalanceSection heroBalanceSection, HeroUpsellSection heroUpsellSection, PrepurchaseCardToggleSection prepurchaseCardToggleSection, Banner banner, AnalyticsEvent analyticsEvent, int i) {
        LocalMenuHoursViewKt localMenuHoursViewKt = null;
        SectionHeader sectionHeader2 = (i & 2) != 0 ? null : sectionHeader;
        CreditLineSectionHeader creditLineSectionHeader2 = (i & 4) != 0 ? null : creditLineSectionHeader;
        Boolean bool2 = (i & 8) != 0 ? null : bool;
        PaymentMgmtSection paymentMgmtSection2 = (i & 64) != 0 ? null : paymentMgmtSection;
        ImageTextSection imageTextSection2 = (i & 256) != 0 ? null : imageTextSection;
        OrderListSection orderListSection2 = (i & 2048) != 0 ? null : orderListSection;
        AvatarTextSection avatarTextSection2 = (i & 4096) != 0 ? null : avatarTextSection;
        TextLinesSection textLinesSection2 = (i & 16384) != 0 ? null : textLinesSection;
        PageHeaderSection pageHeaderSection2 = (32768 & i) != 0 ? null : pageHeaderSection;
        AppletCardSection appletCardSection2 = (131072 & i) != 0 ? null : appletCardSection;
        HeroBalanceSection heroBalanceSection2 = (262144 & i) != 0 ? null : heroBalanceSection;
        HeroUpsellSection heroUpsellSection2 = (524288 & i) != 0 ? null : heroUpsellSection;
        PrepurchaseCardToggleSection prepurchaseCardToggleSection2 = (1048576 & i) != 0 ? null : prepurchaseCardToggleSection;
        Banner banner2 = (2097152 & i) != 0 ? null : banner;
        AnalyticsEvent analyticsEvent2 = (i & 4194304) != 0 ? null : analyticsEvent;
        LocalMenuSelectorKt afterpayAppletHomeSection$SectionHeader$StandardHeader = sectionHeader2 != null ? new AfterpayAppletHomeSection$SectionHeader$StandardHeader(sectionHeader2) : creditLineSectionHeader2 != null ? new AfterpayAppletHomeSection$SectionHeader$CreditLineHeader(creditLineSectionHeader2) : null;
        if (paymentMgmtSection2 != null) {
            localMenuHoursViewKt = new AfterpayAppletHomeSection$Section$PaymentMgmt(paymentMgmtSection2);
        } else if (imageTextSection2 != null) {
            localMenuHoursViewKt = new AfterpayAppletHomeSection$Section$CheckEligibility(imageTextSection2);
        } else if (orderListSection2 != null) {
            localMenuHoursViewKt = new AfterpayAppletHomeSection$Section$OrderList(orderListSection2);
        } else if (avatarTextSection2 != null) {
            localMenuHoursViewKt = new AfterpayAppletHomeSection$Section$AvatarTextSection(avatarTextSection2);
        } else if (textLinesSection2 != null) {
            localMenuHoursViewKt = new AfterpayAppletHomeSection$Section$TextLinesSection(textLinesSection2);
        } else if (pageHeaderSection2 != null) {
            localMenuHoursViewKt = new AfterpayAppletHomeSection$Section$PageHeaderSection(pageHeaderSection2);
        } else if (appletCardSection2 != null) {
            localMenuHoursViewKt = new AfterpayAppletHomeSection$Section$CardSection(appletCardSection2);
        } else if (heroBalanceSection2 != null) {
            localMenuHoursViewKt = new AfterpayAppletHomeSection$Section$HeroBalanceSection(heroBalanceSection2);
        } else if (heroUpsellSection2 != null) {
            localMenuHoursViewKt = new AfterpayAppletHomeSection$Section$HeroUpsellSection(heroUpsellSection2);
        } else if (prepurchaseCardToggleSection2 != null) {
            localMenuHoursViewKt = new AfterpayAppletHomeSection$Section$PrepurchaseCardToggleSection(prepurchaseCardToggleSection2);
        } else if (banner2 != null) {
            localMenuHoursViewKt = new AfterpayAppletHomeSection$Section$Banner(banner2);
        }
        return new AfterpayAppletHomeSection(null, afterpayAppletHomeSection$SectionHeader$StandardHeader, bool2, localMenuHoursViewKt, analyticsEvent2, null, ByteString.EMPTY);
    }

    public static OrderListSection orderListSection$default(OrderListSection.EligibleRetroOrders eligibleRetroOrders) {
        EmptyList emptyList = EmptyList.INSTANCE;
        emptyList.getClass();
        return new OrderListSection(emptyList, new OrderListSection$ScreenContent$EligibleOrders(eligibleRetroOrders), ByteString.EMPTY);
    }

    public static RowSection.Row row$default(RowSection.FilterRow filterRow, RowSection.AvatarRow avatarRow, int i) {
        zzlc zzlcVar = null;
        if ((i & 2) != 0) {
            filterRow = null;
        }
        if ((i & 4) != 0) {
            avatarRow = null;
        }
        if (filterRow != null) {
            zzlcVar = new RowSection$Row$Type$FilterRow(filterRow);
        } else if (avatarRow != null) {
            zzlcVar = new RowSection$Row$Type$AvatarRow(avatarRow);
        }
        return new RowSection.Row(zzlcVar, ByteString.EMPTY);
    }

    public static SearchSection searchSection$default(AnalyticsEvent analyticsEvent, SectionHeader sectionHeader, String str, RowSection rowSection, AvatarCarouselSection avatarCarouselSection, ImageTextSection imageTextSection, CategoryTileSection categoryTileSection, UpsellCardSection upsellCardSection, Boolean bool, int i) {
        zzld zzldVar = null;
        if ((i & 1) != 0) {
            analyticsEvent = null;
        }
        if ((i & 2) != 0) {
            sectionHeader = null;
        }
        if ((i & 16) != 0) {
            rowSection = null;
        }
        if ((i & 64) != 0) {
            avatarCarouselSection = null;
        }
        if ((i & 128) != 0) {
            imageTextSection = null;
        }
        if ((i & 256) != 0) {
            categoryTileSection = null;
        }
        if ((i & 512) != 0) {
            upsellCardSection = null;
        }
        if ((i & 1024) != 0) {
            bool = null;
        }
        RowSection rowSection2 = rowSection;
        SectionHeader sectionHeader2 = sectionHeader;
        AnalyticsEvent analyticsEvent2 = analyticsEvent;
        if (rowSection2 != null) {
            zzldVar = new SearchSection$Content$RowSection(rowSection2);
        } else if (avatarCarouselSection != null) {
            zzldVar = new SearchSection$Content$AvartarCarouselSection(avatarCarouselSection);
        } else if (imageTextSection != null) {
            zzldVar = new SearchSection$Content$ImageTextSection(imageTextSection);
        } else if (categoryTileSection != null) {
            zzldVar = new SearchSection$Content$TileSection(categoryTileSection);
        } else if (upsellCardSection != null) {
            zzldVar = new SearchSection$Content$UpsellCard(upsellCardSection);
        }
        return new SearchSection(analyticsEvent2, sectionHeader2, str, zzldVar, bool, ByteString.EMPTY);
    }

    public static final boolean shouldStopRepeatingBeforeCapture(ArrayList arrayList) {
        if (((StillCaptureFlashStopRepeatingQuirk) DeviceQuirks.getAll().get(StillCaptureFlashStopRepeatingQuirk.class)) != null) {
            Iterator it = arrayList.iterator();
            boolean z = false;
            boolean z2 = false;
            while (it.hasNext()) {
                Request request = (Request) it.next();
                RequestTemplate requestTemplate = request.template;
                if (requestTemplate != null && requestTemplate.value == 2) {
                    z = true;
                }
                CaptureRequest.Key key = CaptureRequest.CONTROL_AE_MODE;
                key.getClass();
                Integer num = (Integer) request.parameters.get(key);
                if ((num != null && num.intValue() == 2) || (num != null && num.intValue() == 3)) {
                    z2 = true;
                }
            }
            if (z && z2) {
                return true;
            }
        }
        return false;
    }

    public static TapAction tapAction$default(DismissTapAction dismissTapAction, UrlTapAction urlTapAction, InfoSheet infoSheet, ClearInputTapAction clearInputTapAction, List list, int i) {
        zzle zzleVar = null;
        if ((i & 1) != 0) {
            dismissTapAction = null;
        }
        if ((i & 2) != 0) {
            urlTapAction = null;
        }
        if ((i & 4) != 0) {
            infoSheet = null;
        }
        if ((i & 8) != 0) {
            clearInputTapAction = null;
        }
        if ((i & 16) != 0) {
            list = EmptyList.INSTANCE;
        }
        list.getClass();
        if (dismissTapAction != null) {
            zzleVar = new TapAction$Action$DismissAction(dismissTapAction);
        } else if (urlTapAction != null) {
            zzleVar = new TapAction$Action$UrlAction(urlTapAction);
        } else if (infoSheet != null) {
            zzleVar = new TapAction$Action$OpenInfoSheetAction(infoSheet);
        } else if (clearInputTapAction != null) {
            zzleVar = new TapAction$Action$ClearInputAction(clearInputTapAction);
        }
        return new TapAction(zzleVar, list);
    }
}
