package com.squareup.cash.appmessages.views;

import android.icu.text.DateTimePatternGenerator;
import androidx.camera.camera2.pipe.CameraGraph$OperatingMode;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.local.views.map.BrandSheetViewKt$$ExternalSyntheticLambda1;
import coil3.compose.LocalImageLoaderKt;
import coil3.compose.UtilsKt$$ExternalSyntheticLambda1;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.R;
import com.squareup.cash.account.components.business.BusinessInfoView;
import com.squareup.cash.account.settings.viewmodels.business.BusinessInfoViewModel;
import com.squareup.cash.activity.backend.ActivityFeedGroup;
import com.squareup.cash.activity.backend.ActivityGrouping;
import com.squareup.cash.activity.presenters.SharedPresenterUtilsKt$WhenMappings;
import com.squareup.cash.activity.viewmodels.ActivityFeedEntry;
import com.squareup.cash.activity.viewmodels.FullScreenActivityViewModel;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticLambda9;
import com.squareup.cash.afterpayapplet.applets.viewmodels.AfterpayAppletTileViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletInfoSheetViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletNotificationViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletPurchasesEmbeddedViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletUpsellSheetViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpaySearchViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.FooterSection;
import com.squareup.cash.afterpayapplet.views.AfterpayAppletNotificationView;
import com.squareup.cash.afterpayapplet.views.AfterpaySearchViewKt;
import com.squareup.cash.afterpayapplet.views.browser.SelectAfterpayPromptSheet;
import com.squareup.cash.afterpayapplet.views.homesection.LegalSectionKt;
import com.squareup.cash.afterpayapplet.views.homesection.v3.AfterpayCardKt;
import com.squareup.cash.agents.applets.viewmodels.AgentsAppletTileViewModel;
import com.squareup.cash.amountchooser.views.AtmPickerGridKt$$ExternalSyntheticLambda4;
import com.squareup.cash.appintro.viewmodels.AlternativeNewSponsorAliasViewModel;
import com.squareup.cash.appintro.views.AlternativeNewSponsorAliasView;
import com.squareup.cash.appmessages.InlineAppMessageViewModel;
import com.squareup.cash.appmessages.sheet.SheetAppMessageModel;
import com.squareup.cash.appmessages.views.sheet.SheetAppMessageView;
import com.squareup.cash.appmessages.views.sheet.SheetAppMessageView$$ExternalSyntheticLambda21;
import com.squareup.cash.appmessages.views.sheet.SheetAppMessageView$$ExternalSyntheticLambda22;
import com.squareup.cash.arcade.components.Badge;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.SearchBarKeyboardState;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.banking.views.BankingDialogKt$$ExternalSyntheticLambda5;
import com.squareup.cash.cashapplite.views.KycAppletTile;
import com.squareup.cash.datetimeformatter.real.RealDateTimeFormatterFactory;
import com.squareup.cash.family.applets.views.FamilyAppletTile;
import com.squareup.cash.money.applets.viewmodels.AppletTile;
import com.squareup.cash.p2pblocking.views.P2PListView;
import com.squareup.cash.profile.views.ProfileUiView;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.tax.applet.views.TaxesAppletViewsModule$$ExternalSyntheticLambda1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class InlineAppMessageKt$$ExternalSyntheticLambda8 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ InlineAppMessageKt$$ExternalSyntheticLambda8(P2PListView p2PListView, AfterpayAppletPurchasesEmbeddedViewModel afterpayAppletPurchasesEmbeddedViewModel, Function1 function1) {
        this.$r8$classId = 8;
        this.f$0 = p2PListView;
        this.f$2 = afterpayAppletPurchasesEmbeddedViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String format2;
        Modifier.Companion companion;
        int i = this.$r8$classId;
        Object obj3 = Composer.Companion.Empty;
        Object obj4 = this.f$2;
        Object obj5 = this.f$1;
        Object obj6 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                InlineAppMessageKt.InlineAppMessage((InlineAppMessageViewModel.Ready) obj6, (Function1) obj5, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                int i2 = BusinessInfoView.$r8$clinit;
                ((BusinessInfoView) obj6).Content((BusinessInfoViewModel) obj4, (Function1) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 2:
                ActivityFeedGroup activityFeedGroup = (ActivityFeedGroup) obj6;
                AndroidStringManager androidStringManager = (AndroidStringManager) obj5;
                RealDateTimeFormatterFactory realDateTimeFormatterFactory = (RealDateTimeFormatterFactory) obj4;
                ((Integer) obj2).getClass();
                GapComposer gapComposer = (GapComposer) ((Composer) obj);
                gapComposer.startReplaceGroup(819244497);
                activityFeedGroup.getClass();
                ActivityGrouping activityGrouping = activityFeedGroup.grouping;
                if (!(activityGrouping instanceof ActivityGrouping.BySection)) {
                    if (!Intrinsics.areEqual(activityGrouping, ActivityGrouping.ByThisMonth.INSTANCE)) {
                        if (!Intrinsics.areEqual(activityGrouping, ActivityGrouping.ByToday.INSTANCE)) {
                            if (!(activityGrouping instanceof ActivityGrouping.ByOtherMonth)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                break;
                            } else {
                                DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern(DateTimePatternGenerator.getInstance((Locale) realDateTimeFormatterFactory.localeManager.resolvedLocale.$$delegate_0.getValue()).getBestPattern("yMMMM"));
                                ofPattern.getClass();
                                format2 = ofPattern.format(((ActivityGrouping.ByOtherMonth) activityGrouping).date);
                            }
                        } else {
                            format2 = androidStringManager.get(R.string.activity_header_today);
                        }
                    } else {
                        format2 = androidStringManager.get(R.string.activity_header_this_month);
                    }
                } else {
                    int i3 = SharedPresenterUtilsKt$WhenMappings.$EnumSwitchMapping$0[((ActivityGrouping.BySection) activityGrouping).section.ordinal()];
                    if (i3 == 1) {
                        format2 = androidStringManager.get(R.string.activity_header_pending);
                    } else if (i3 == 2) {
                        format2 = androidStringManager.get(R.string.activity_header_upcoming);
                    } else if (i3 == 3) {
                        format2 = androidStringManager.get(R.string.activity_header_completed);
                    } else if (i3 == 4) {
                        OptionalProvider$$ExternalSyntheticLambda0.m();
                        break;
                    } else {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    }
                }
                format2.getClass();
                ActivityFeedEntry.Header header = new ActivityFeedEntry.Header(activityGrouping, format2, activityFeedGroup.aggregation);
                gapComposer.end(false);
                break;
            case 3:
                ((Integer) obj2).getClass();
                ((ProfileUiView) obj6).Content((FullScreenActivityViewModel) obj4, (Function1) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                ((FamilyAppletTile) obj6).V3UninstalledContent((AfterpayAppletTileViewModel.V3Uninstalled) obj5, (TaxesAppletViewsModule$$ExternalSyntheticLambda1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                AfterpaySearchViewKt.AfterpayAppletActivityEmbeddedList((FullScreenActivityViewModel) obj6, (FooterSection) obj4, (Function1) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                AfterpaySearchViewKt.AfterpayAppletInfoSheetContent((Modifier) obj4, (AfterpayAppletInfoSheetViewModel) obj6, (Function1) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                int i4 = AfterpayAppletNotificationView.$r8$clinit;
                ((AfterpayAppletNotificationView) obj6).Content((AfterpayAppletNotificationViewModel) obj4, (Function1) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 8:
                P2PListView p2PListView = (P2PListView) obj6;
                AfterpayAppletPurchasesEmbeddedViewModel afterpayAppletPurchasesEmbeddedViewModel = (AfterpayAppletPurchasesEmbeddedViewModel) obj4;
                Function1 function1 = (Function1) obj5;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(p2PListView.imageLoader), Expect_jvmKt.rememberComposableLambda(-853933393, new AtmPickerGridKt$$ExternalSyntheticLambda4(12, afterpayAppletPurchasesEmbeddedViewModel, function1), gapComposer2), gapComposer2, 56);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            case 9:
                ((Integer) obj2).getClass();
                AfterpaySearchViewKt.AfterpayPurchasesContent((AfterpayAppletPurchasesEmbeddedViewModel.Default) obj6, (Function1) obj5, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                AfterpaySearchViewKt.AfterpayAppletUpsellSheet((AfterpayAppletUpsellSheetViewModel) obj6, (Function1) obj5, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                AfterpaySearchViewKt.NoResults((Modifier) obj4, (AfterpaySearchViewModel.BodyViewModel.NoContentViewModel) obj6, (Function1) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                AfterpaySearchViewKt.RecentlyViewedCarousel((AfterpaySearchViewModel.BodyViewModel.ResultsViewModel.RecentlyViewedCarouselViewModel) obj6, (SearchBarKeyboardState) obj4, (Function1) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                int i5 = SelectAfterpayPromptSheet.$r8$clinit;
                ((SelectAfterpayPromptSheet) obj6).Content((Unit) obj4, (Function1) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                LegalSectionKt.AfterpayAppletBannerSection((Modifier) obj4, (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.BannerSection) obj6, (Function1) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                AfterpayCardKt.AfterpayAppletNoBalanceHeroSection((Modifier) obj4, (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.NoBalance) obj6, (Function1) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 16:
                AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.PrepurchaseToggleSection.ToggleState toggleState = (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.PrepurchaseToggleSection.ToggleState) obj6;
                Function1 function12 = (Function1) obj5;
                AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.PrepurchaseToggleSection prepurchaseToggleSection = (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.PrepurchaseToggleSection) obj4;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer2;
                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    boolean z = toggleState == AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.PrepurchaseToggleSection.ToggleState.TURNED_ON;
                    boolean changed = gapComposer3.changed(function12);
                    Object rememberedValue = gapComposer3.rememberedValue();
                    if (changed || rememberedValue == obj3) {
                        rememberedValue = new UtilsKt$$ExternalSyntheticLambda1(27, function12);
                        gapComposer3.updateRememberedValue(rememberedValue);
                    }
                    ModalKt.Toggle(z, null, (Function1) rememberedValue, !prepurchaseToggleSection.isToggleLoading, Expect_jvmKt.rememberComposableLambda(293886390, new BalanceFeedKt$$ExternalSyntheticLambda9(prepurchaseToggleSection, 21), gapComposer3), gapComposer3, 24576, 2);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
            case 17:
                ((Integer) obj2).getClass();
                AfterpayCardKt.TransactionListContent((AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardContent.TransactionList) obj6, (Modifier) obj4, (Function1) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                CameraGraph$OperatingMode.AfterpayCategoryTile((Modifier) obj4, (AfterpaySearchViewModel.CategoryTileViewModel) obj6, (Function0) obj5, (Composer) obj, Updater.updateChangedFlags(7));
                break;
            case 19:
                ((Integer) obj2).getClass();
                ((KycAppletTile) obj6).InstalledUI((AgentsAppletTileViewModel.Installed) obj5, (AppletTile.AppletTileAppearance) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                int i6 = AlternativeNewSponsorAliasView.$r8$clinit;
                ((AlternativeNewSponsorAliasView) obj6).Content((AlternativeNewSponsorAliasViewModel) obj4, (Function1) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                ((SheetAppMessageView) obj6).Content((SheetAppMessageModel) obj4, (Function1) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 22:
                SheetAppMessageModel.Loaded loaded = (SheetAppMessageModel.Loaded) obj6;
                Function1 function13 = (Function1) obj5;
                SheetAppMessageView sheetAppMessageView = (SheetAppMessageView) obj4;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer3;
                if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    SheetAppMessageModel.CtaButton ctaButton = loaded.secondaryCta;
                    Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                    if (ctaButton == null) {
                        gapComposer4.startReplaceGroup(-46211536);
                        gapComposer4.end(false);
                        companion = companion2;
                    } else {
                        gapComposer4.startReplaceGroup(-46211535);
                        ButtonProminence buttonProminence = ButtonProminence.SUBTLE;
                        Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(companion2, 1.0f), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 8.0f, 7);
                        boolean changed2 = gapComposer4.changed(function13) | gapComposer4.changedInstance(ctaButton);
                        Object rememberedValue2 = gapComposer4.rememberedValue();
                        if (changed2 || rememberedValue2 == obj3) {
                            rememberedValue2 = new BankingDialogKt$$ExternalSyntheticLambda5(8, function13, ctaButton);
                            gapComposer4.updateRememberedValue(rememberedValue2);
                        }
                        ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-229973601, new BrandSheetViewKt$$ExternalSyntheticLambda1(ctaButton, sheetAppMessageView, loaded), gapComposer4);
                        companion = companion2;
                        coil3.size.SizeKt.ButtonCta((Function0) rememberedValue2, m302paddingqDBjuR0$default, buttonProminence, false, false, null, rememberComposableLambda, gapComposer4, 1573296, 56);
                        gapComposer4.end(false);
                    }
                    ButtonProminence buttonProminence2 = ButtonProminence.PROMINENT;
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean changed3 = gapComposer4.changed(function13) | gapComposer4.changed(loaded);
                    Object rememberedValue3 = gapComposer4.rememberedValue();
                    if (changed3 || rememberedValue3 == obj3) {
                        rememberedValue3 = new SheetAppMessageView$$ExternalSyntheticLambda21(function13, loaded, 1);
                        gapComposer4.updateRememberedValue(rememberedValue3);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue3, fillMaxWidth, buttonProminence2, false, false, null, Expect_jvmKt.rememberComposableLambda(-1864042436, new SheetAppMessageView$$ExternalSyntheticLambda22(loaded, sheetAppMessageView), gapComposer4), gapComposer4, 1573296, 56);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                break;
            case 23:
                ((Integer) obj2).getClass();
                ((CellDefaultAccessory.ButtonCompact) obj6).Content((Badge) obj5, (Function0) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                ((CellDefaultAccessory.Checkbox) obj6).Content((Badge) obj5, (Function0) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 25:
                ((Integer) obj2).getClass();
                ((CellDefaultAccessory.Label) obj6).Content((Badge) obj5, (Function0) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 26:
                ((Integer) obj2).getClass();
                ((CellDefaultAccessory.Label) obj6).Content((Badge) obj5, (Function0) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 27:
                ((Integer) obj2).getClass();
                ((CellDefaultAccessory.None) obj6).Content((Badge) obj5, (Function0) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 28:
                ((Integer) obj2).getClass();
                ((CellDefaultAccessory.Radio) obj6).Content((Badge) obj5, (Function0) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            default:
                ((Integer) obj2).getClass();
                ((CellDefaultAccessory.Toggle) obj6).Content((Badge) obj5, (Function0) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ InlineAppMessageKt$$ExternalSyntheticLambda8(int i, Object obj, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    public /* synthetic */ InlineAppMessageKt$$ExternalSyntheticLambda8(int i, int i2, Modifier modifier, Object obj, Function function) {
        this.$r8$classId = i2;
        this.f$2 = modifier;
        this.f$0 = obj;
        this.f$1 = function;
    }

    public /* synthetic */ InlineAppMessageKt$$ExternalSyntheticLambda8(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    public /* synthetic */ InlineAppMessageKt$$ExternalSyntheticLambda8(Object obj, Object obj2, Function1 function1, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$1 = function1;
    }
}
