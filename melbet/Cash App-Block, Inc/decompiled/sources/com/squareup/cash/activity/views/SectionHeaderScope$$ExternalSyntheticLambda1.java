package com.squareup.cash.activity.views;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.room.Room;
import app.cash.passcode.presenters.EndAppLockPresenter;
import com.squareup.cash.account.components.ThemeSwitcherViewKt;
import com.squareup.cash.account.components.accountswitcher.BadgeTitleKt;
import com.squareup.cash.account.settings.viewmodels.ThemeSwitcherViewModel;
import com.squareup.cash.account.viewmodels.accountswitcher.AccountSwitcherViewModel;
import com.squareup.cash.account.viewmodels.accountswitcher.AddAccountOptionsViewModel;
import com.squareup.cash.activity.backend.ActivityItem;
import com.squareup.cash.activity.backend.FormattedPaymentHistoryActivityItem;
import com.squareup.cash.activity.backend.loader.Activities;
import com.squareup.cash.activity.presenters.ActivityEmbeddedPresenter$Configuration;
import com.squareup.cash.activity.presenters.ActivityItemPresenter;
import com.squareup.cash.activity.presenters.ActivityTabPresenter;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter;
import com.squareup.cash.activity.viewmodels.ActivityFeedEntry;
import com.squareup.cash.activity.viewmodels.ReceiptViewModel;
import com.squareup.cash.activity.views.receipts.ReceiptUiKt;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpaySearchViewModel;
import com.squareup.cash.afterpayapplet.views.AfterpaySearchViewKt;
import com.squareup.cash.afterpayapplet.views.homesection.LegalSectionKt;
import com.squareup.cash.agents.applets.viewmodels.AgentsHomeViewModel;
import com.squareup.cash.agents.applets.views.AgentsHomeViewKt;
import com.squareup.cash.appupdate.viewmodels.AppUpdateDialogViewModel;
import com.squareup.cash.appupdate.views.AppUpdateDialogKt;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.bindings.component.ArcadeComponentButtonProtoBindingKt;
import com.squareup.cash.arcade.bindings.component.ArcadeComponentProtoBindingKt;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import com.squareup.cash.cashapplite.views.KycAppletTile;
import com.squareup.cash.cdf.ActivityItemOrigin;
import com.squareup.cash.composeUi.foundation.text.MarkdownSpanValues;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.money.applets.viewmodels.AppletTile;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.franklin.ui.ReceiptSection;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlinx.coroutines.flow.Flow;
import org.apache.commons.imaging.formats.jpeg.JpegConstants;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import squareup.cash.ui.arcade.elements.ActionableButtonCtaGroup;
import squareup.cash.ui.arcade.elements.ButtonCompact;
import squareup.cash.ui.arcade.elements.ButtonCtaGroup;
import squareup.cash.ui.arcade.elements.ButtonDefaultGroup;
import squareup.cash.ui.arcade.elements.HeroNumericsHeader;
import squareup.cash.ui.arcade.elements.InlineMessage;
import squareup.cash.ui.arcade.elements.PageHeader;
import squareup.cash.ui.arcade.elements.SectionHeader;

/* loaded from: classes5.dex */
public final /* synthetic */ class SectionHeaderScope$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ int f$3;

    public /* synthetic */ SectionHeaderScope$$ExternalSyntheticLambda1(ActionableButtonCtaGroup actionableButtonCtaGroup, Function1 function1, int i) {
        this.$r8$classId = 20;
        this.f$0 = actionableButtonCtaGroup;
        this.f$1 = function1;
        this.f$3 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        int i2 = this.f$3;
        Object obj3 = this.f$1;
        Object obj4 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ((SectionHeaderScope) obj4).DefaultHeader(Updater.updateChangedFlags(1), i2, (Composer) obj, (Modifier) obj3);
                break;
            case 1:
                ((Integer) obj2).intValue();
                ThemeSwitcherViewKt.ThemeSwitcher((ThemeSwitcherViewModel.Loaded) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                ThemeSwitcherViewKt.ErrorContent((ThemeSwitcherViewModel.Error) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                BadgeTitleKt.AccountSwitcherLoaded((AccountSwitcherViewModel.Loaded) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 4:
                ((Integer) obj2).intValue();
                BadgeTitleKt.AddAccountOptionsLoaded((AddAccountOptionsViewModel.Loaded) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                ((CardStudioPresenter) obj4).m3429models((Flow) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                GapComposer gapComposer = (GapComposer) ((Composer) obj);
                gapComposer.startReplaceGroup(-665706527);
                ActivityFeedEntry.Item item = new ActivityFeedEntry.Item(((ActivityTabPresenter) obj4).rememberActivityItemPresenter((FormattedPaymentHistoryActivityItem) obj3, ActivityItemOrigin.SEARCH_RESULTS, i2, gapComposer).models(gapComposer));
                gapComposer.end(false);
                break;
            case 7:
                ActivityEmbeddedPresenter$Configuration activityEmbeddedPresenter$Configuration = ((RealActivityEmbeddedPresenter) obj3).configuration;
                ((Integer) obj2).getClass();
                GapComposer gapComposer2 = (GapComposer) ((Composer) obj);
                gapComposer2.startReplaceGroup(-1338778556);
                ActivityFeedEntry.EmbeddedHeader embeddedHeader = new ActivityFeedEntry.EmbeddedHeader((((Activities) obj4).hasMore || i2 > activityEmbeddedPresenter$Configuration.showMoreThreshold) && activityEmbeddedPresenter$Configuration.showMoreCallback != null);
                gapComposer2.end(false);
                break;
            case 8:
                ((Integer) obj2).getClass();
                GapComposer gapComposer3 = (GapComposer) ((Composer) obj);
                gapComposer3.startReplaceGroup(-1719757575);
                ActivityFeedEntry.Item item2 = new ActivityFeedEntry.Item(((RealActivityEmbeddedPresenter) obj4).rememberActivityItemPresenter((ActivityItem) obj3, i2, gapComposer3).models(gapComposer3));
                gapComposer3.end(false);
                break;
            case 9:
                ((Integer) obj2).getClass();
                GapComposer gapComposer4 = (GapComposer) ((Composer) obj);
                gapComposer4.startReplaceGroup(392815373);
                ActivityFeedEntry.Item item3 = new ActivityFeedEntry.Item(((ActivityItemPresenter) ((Function4) obj4).invoke((ActivityItem) obj3, Integer.valueOf(i2), gapComposer4, 0)).models(gapComposer4));
                gapComposer4.end(false);
                break;
            case 10:
                ((Integer) obj2).getClass();
                ReceiptUiKt.ActionRow((ReceiptSection.ActionRow) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                ReceiptUiKt.LoadingError((ReceiptViewModel.LoadingError) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                ((EndAppLockPresenter) obj4).m1348models((Flow) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                AfterpaySearchViewKt.AfterpaySearch((AfterpaySearchViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 14:
                ((Integer) obj2).intValue();
                AfterpaySearchViewKt.FilterBottomSheetContent((AfterpaySearchViewModel.FilterBottomSheetViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                LegalSectionKt.DefaultHeader((AfterpayAppletHomeContentViewModel.HomeSection.CreditSectionHeader.DefaultCreditHeader) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                ((KycAppletTile) obj4).UI((AppletTile.AppletTileAppearance) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 17:
                ((Integer) obj2).intValue();
                AgentsHomeViewKt.AgentsHomeView((AgentsHomeViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 18:
                ((Integer) obj2).intValue();
                AppUpdateDialogKt.AppUpdateDialog((AppUpdateDialogViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                ArcadeComponentButtonProtoBindingKt.RenderButtonCompact((ButtonCompact) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                ArcadeComponentButtonProtoBindingKt.RenderActionableButtonCtaGroup((ActionableButtonCtaGroup) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                ArcadeComponentButtonProtoBindingKt.RenderButtonCtaGroup((ButtonCtaGroup) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                ArcadeComponentButtonProtoBindingKt.RenderButtonDefaultGroup((ButtonDefaultGroup) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                ArcadeComponentProtoBindingKt.RenderHeroNumericsHeader((HeroNumericsHeader) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                ArcadeComponentProtoBindingKt.RenderPageHeader((PageHeader) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 25:
                ((Integer) obj2).getClass();
                ArcadeComponentProtoBindingKt.RenderInlineMessage((InlineMessage) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 26:
                ((Integer) obj2).getClass();
                ArcadeComponentProtoBindingKt.RenderSectionHeader((SectionHeader) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 27:
                String str = (String) obj4;
                Function2 function2 = (Function2) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer;
                if (gapComposer5.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalTypography;
                    LazyDslKt.m304MarkdownTextpCuZGqc(str, function2, fillMaxWidth, null, 0L, new MarkdownSpanValues(new SpanStyle(0L, ((Typography) gapComposer5.consume(staticProvidableCompositionLocal)).linkXSmall.spanStyle.fontSize, ((Typography) gapComposer5.consume(staticProvidableCompositionLocal)).linkXSmall.spanStyle.fontWeight, ((Typography) gapComposer5.consume(staticProvidableCompositionLocal)).linkXSmall.spanStyle.fontStyle, (FontSynthesis) null, ((Typography) gapComposer5.consume(staticProvidableCompositionLocal)).linkXSmall.spanStyle.fontFamily, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, JpegConstants.RST1_MARKER), 2), null, null, 0, 0, this.f$3, gapComposer5, MLKEMEngine.KyberPolyBytes, 984);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                break;
            case 28:
                PageHeader pageHeader = (PageHeader) obj4;
                TextStyle textStyle = (TextStyle) obj3;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer2;
                if (gapComposer6.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                    Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
                    LocalizedString localizedString = pageHeader.header;
                    localizedString.getClass();
                    String str2 = localizedString.translated_value;
                    str2.getClass();
                    if (textStyle == null) {
                        gapComposer6.startReplaceGroup(-1620446239);
                        TextStyle textStyle2 = (TextStyle) gapComposer6.consume(ArcadeThemeKt.LocalTextStyle);
                        if (textStyle2 == null) {
                            gapComposer6.startReplaceGroup(-1100573765);
                            textStyle2 = ((Typography) gapComposer6.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
                        } else {
                            gapComposer6.startReplaceGroup(-1100574912);
                        }
                        gapComposer6.end(false);
                        textStyle = textStyle2;
                    } else {
                        gapComposer6.startReplaceGroup(-1620447169);
                    }
                    gapComposer6.end(false);
                    Room.m1165Text25TpFw(0, 0, 0, this.f$3, 48, 0, 3832, 0L, (Composer) gapComposer6, fillMaxWidth2, textStyle, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                ModalKt.ProgressBrandedContent((ExoPlayer) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ SectionHeaderScope$$ExternalSyntheticLambda1(SectionHeaderScope sectionHeaderScope, Modifier modifier, int i, int i2) {
        this.$r8$classId = 0;
        this.f$0 = sectionHeaderScope;
        this.f$1 = modifier;
        this.f$3 = i2;
    }

    public /* synthetic */ SectionHeaderScope$$ExternalSyntheticLambda1(Object obj, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$3 = i;
    }

    public /* synthetic */ SectionHeaderScope$$ExternalSyntheticLambda1(Activities activities, int i, RealActivityEmbeddedPresenter realActivityEmbeddedPresenter) {
        this.$r8$classId = 7;
        this.f$0 = activities;
        this.f$3 = i;
        this.f$1 = realActivityEmbeddedPresenter;
    }

    public /* synthetic */ SectionHeaderScope$$ExternalSyntheticLambda1(ButtonCompact buttonCompact, Function1 function1, int i) {
        this.$r8$classId = 19;
        this.f$0 = buttonCompact;
        this.f$1 = function1;
        this.f$3 = i;
    }

    public /* synthetic */ SectionHeaderScope$$ExternalSyntheticLambda1(ButtonCtaGroup buttonCtaGroup, Function1 function1, int i) {
        this.$r8$classId = 21;
        this.f$0 = buttonCtaGroup;
        this.f$1 = function1;
        this.f$3 = i;
    }

    public /* synthetic */ SectionHeaderScope$$ExternalSyntheticLambda1(ButtonDefaultGroup buttonDefaultGroup, Function1 function1, int i) {
        this.$r8$classId = 22;
        this.f$0 = buttonDefaultGroup;
        this.f$1 = function1;
        this.f$3 = i;
    }

    public /* synthetic */ SectionHeaderScope$$ExternalSyntheticLambda1(HeroNumericsHeader heroNumericsHeader, Function1 function1, int i) {
        this.$r8$classId = 23;
        this.f$0 = heroNumericsHeader;
        this.f$1 = function1;
        this.f$3 = i;
    }

    public /* synthetic */ SectionHeaderScope$$ExternalSyntheticLambda1(InlineMessage inlineMessage, Function1 function1, int i) {
        this.$r8$classId = 25;
        this.f$0 = inlineMessage;
        this.f$1 = function1;
        this.f$3 = i;
    }

    public /* synthetic */ SectionHeaderScope$$ExternalSyntheticLambda1(PageHeader pageHeader, Function1 function1, int i) {
        this.$r8$classId = 24;
        this.f$0 = pageHeader;
        this.f$1 = function1;
        this.f$3 = i;
    }

    public /* synthetic */ SectionHeaderScope$$ExternalSyntheticLambda1(SectionHeader sectionHeader, Function1 function1, int i) {
        this.$r8$classId = 26;
        this.f$0 = sectionHeader;
        this.f$1 = function1;
        this.f$3 = i;
    }
}
