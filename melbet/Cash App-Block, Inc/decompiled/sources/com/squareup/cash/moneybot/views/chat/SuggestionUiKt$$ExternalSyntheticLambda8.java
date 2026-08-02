package com.squareup.cash.moneybot.views.chat;

import androidx.cardview.widget.CardViewApi21Impl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.WindowInfoImpl;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.emoji2.text.MetadataRepo;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.mlkit.common.internal.zzd;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarOverlay;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.avatar.DiagonalAvatarValues;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.money.core.states.AppletAvailabilityState;
import com.squareup.cash.moneybot.genie.MoneybotScaffoldViewKt;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.moneybot.genie.protos.MoneybotScaffold;
import com.squareup.cash.moneybot.viewmodels.SuggestionRowIcon;
import com.squareup.cash.moneybot.viewmodels.chat.ChatCardViewModel;
import com.squareup.cash.moneybot.viewmodels.chat.MoneybotChatViewModel;
import com.squareup.cash.moneybot.viewmodels.feedback.MoneybotFeedbackViewModel;
import com.squareup.cash.moneybot.viewmodels.plugins.TemplateCardViewModel;
import com.squareup.cash.moneybot.viewmodels.staticpicker.MoneybotStaticPickerViewModel;
import com.squareup.cash.moneybot.views.card.InsightChartKt;
import com.squareup.cash.moneybot.views.menu.DropdownItem;
import com.squareup.cash.moneybot.views.plugins.TextCardKt;
import com.squareup.cash.mooncake.compose_ui.components.IconContainerView;
import com.squareup.cash.nearby.viewmodels.ListSection;
import com.squareup.cash.offers.viewmodels.OffersCollectionListingViewModel;
import com.squareup.cash.offers.viewmodels.OffersDetailsSheetViewModelV2;
import com.squareup.cash.offers.viewmodels.OffersFullscreenCollectionViewModel;
import com.squareup.cash.offers.viewmodels.itemviewmodels.LegacyOffersAvatarViewModel;
import com.squareup.cash.offers.viewmodels.itemviewmodels.OffersRowViewModel;
import com.squareup.cash.offers.views.FormattedCaptionViewModel;
import com.squareup.cash.offers.views.OffersAvatarKt$$ExternalSyntheticLambda0;
import com.squareup.cash.offers.views.collection.OffersCollectionListingKt;
import com.squareup.cash.offers.views.home.OffersHeroTileKt;
import com.squareup.cash.p2pblocking.viewmodels.AllowlistSelectionViewModel;
import com.squareup.cash.passkeys.viewmodels.PasskeyUpsellViewModel;
import com.squareup.cash.paychecks.applets.presenters.RealPaychecksAppletTileRepository;
import com.squareup.cash.paychecks.backend.api.model.PaychecksUiState;
import com.squareup.cash.paychecks.viewmodels.ActiveDistributionSectionBodyViewModel;
import com.squareup.cash.paychecks.viewmodels.DestinationAllocationRowViewModel;
import com.squareup.cash.paychecks.viewmodels.DistributePaycheckViewModel;
import com.squareup.cash.paychecks.viewmodels.MultipleAllocationViewModel;
import com.squareup.cash.paychecks.viewmodels.PaychecksHomeViewModel;
import com.squareup.cash.paychecks.views.HelpSheetViewKt;
import com.squareup.cash.paychecks.views.HelpSheetViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.paychecks.views.PaycheckDistributionWheel$PlacementConfig;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.util.cash.Countries;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import squareup.cash.paychecks.UiState;

/* loaded from: classes6.dex */
public final /* synthetic */ class SuggestionUiKt$$ExternalSyntheticLambda8 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ SuggestionUiKt$$ExternalSyntheticLambda8(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:153:0x0383, code lost:
    
        if (r7 == null) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0385, code lost:
    
        r19 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0388, code lost:
    
        r19 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0391, code lost:
    
        if (r7 == null) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0234, code lost:
    
        if (r0 == null) goto L96;
     */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        Color m;
        long j;
        String str;
        Icons icons;
        String str2;
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Object obj3 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                SuggestionUiKt.SuggestionRowIcon((SuggestionRowIcon) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                MoneybotScaffoldViewKt.CategoryRow((MoneybotScaffold.Evidence.Breakdown.CategoryRow) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                MoneybotScaffoldViewKt.TransactionRow((MoneybotScaffold.Evidence.MerchantCard.Transaction) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                MoneybotScaffoldViewKt.BreakdownChart((MoneybotScaffold.Evidence.Breakdown.BarChart) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                MoneybotScaffoldViewKt.MoneybotEvidenceView((MoneybotScaffold.Evidence) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                MoneybotScaffoldViewKt.BreakdownView((MoneybotScaffold.Evidence.Breakdown) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                InsightChartKt.LegendItemRow((ChatCardViewModel.InsightCard.Chart.Legend.LegendItem) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 7:
                ChatCardViewModel.InsightCard.ChartToggleButton chartToggleButton = (ChatCardViewModel.InsightCard.ChartToggleButton) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, RecyclerView.DECELERATION_RATE, 8.0f, 1);
                    String str3 = chartToggleButton.label;
                    TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).buttonCompact;
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, colors.semantic.text.standard, (Composer) gapComposer, m300paddingVpY3zN4$default, textStyle, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                CardViewApi21Impl.ErrorToast((MoneybotChatViewModel.Content.ToastMessage) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 9:
                MoneybotFeedbackViewModel moneybotFeedbackViewModel = (MoneybotFeedbackViewModel) obj3;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, moneybotFeedbackViewModel.dropdownLabel, (Map) null, (Function1) null, false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                DropdownItem dropdownItem = (DropdownItem) obj3;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer3, 48);
                    int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, companion);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer3.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer3.startReusableNode();
                    if (gapComposer3.inserting) {
                        gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer3.useNode();
                    }
                    Updater.m576setimpl(gapComposer3, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer3, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    if (dropdownItem.icon != null) {
                        gapComposer3.startReplaceGroup(-1627632053);
                        Icons icons2 = dropdownItem.icon;
                        Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion, 16.0f);
                        Colors colors2 = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                        if (colors2 == null) {
                            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                        } else {
                            gapComposer3.startReplaceGroup(-1762997739);
                            gapComposer3.end(false);
                        }
                        Trace.m1191Iconww6aTOc(icons2, (String) null, m285size3ABfNKs, colors2.semantic.icon.standard, gapComposer3, 432, 0);
                        SpacerKt.Spacer(gapComposer3, SizeKt.m290width3ABfNKs(companion, 12.0f));
                        gapComposer3.end(false);
                    } else {
                        gapComposer3.startReplaceGroup(-1627344714);
                        gapComposer3.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 1, 0, 0, 3834, 0L, (Composer) gapComposer3, (Modifier) null, ((Typography) gapComposer3.consume(ArcadeThemeKt.LocalTypography)).bodyMedium, (TextLineBalancing) null, Room.stringResource(gapComposer3, dropdownItem.textRes), (Map) null, (Function1) null, false);
                    gapComposer3.end(true);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                TextCardKt.BottomPickerIcon((TemplateCardViewModel.Icon) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 12:
                MoneybotStaticPickerViewModel.Option option = (MoneybotStaticPickerViewModel.Option) obj3;
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, option.label, (Map) null, (Function1) null, false);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                ((IconContainerView) obj3).Content((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 14:
                ListSection listSection = (ListSection) obj3;
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, listSection.title, (Map) null, (Function1) null, false);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                OffersFullscreenCollectionViewModel offersFullscreenCollectionViewModel = (OffersFullscreenCollectionViewModel) obj3;
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (!gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    gapComposer6.skipToGroupEnd();
                } else if (offersFullscreenCollectionViewModel.listViewModel instanceof OffersCollectionListingViewModel.Loaded) {
                    gapComposer6.startReplaceGroup(581070083);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer6, (Modifier) null, ((Typography) gapComposer6.consume(ArcadeThemeKt.LocalTypography)).titleBarPageTitle, (TextLineBalancing) null, offersFullscreenCollectionViewModel.headerViewModel.collectionTitle, (Map) null, (Function1) null, false);
                    gapComposer6.end(false);
                } else {
                    gapComposer6.startReplaceGroup(581251712);
                    gapComposer6.end(false);
                }
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).getClass();
                OffersCollectionListingKt.OffersCollectionError((OffersCollectionListingViewModel.Error) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 17:
                OffersDetailsSheetViewModelV2.Loaded loaded = (OffersDetailsSheetViewModelV2.Loaded) obj3;
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                    AvatarsKt.DiagonalStackedAvatars(DiagonalAvatarValues.Size96, loaded.avatar, null, AvatarSize.Size64, null, gapComposer7, 3078);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                OffersHeroTileKt.ExpirationCaption((FormattedCaptionViewModel) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 19:
                OffersRowViewModel offersRowViewModel = (OffersRowViewModel) obj3;
                Composer composer8 = (Composer) obj;
                int intValue8 = ((Integer) obj2).intValue();
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 3) != 2)) {
                    AvatarSize avatarSize = AvatarSize.Size48;
                    LegacyOffersAvatarViewModel legacyOffersAvatarViewModel = offersRowViewModel.avatar;
                    Character ch = legacyOffersAvatarViewModel.monogram;
                    String valueOf = ch != null ? String.valueOf(ch.charValue()) : null;
                    String str4 = valueOf == null ? "" : valueOf;
                    com.squareup.protos.cash.ui.Color color = legacyOffersAvatarViewModel.backgroundColor;
                    String str5 = legacyOffersAvatarViewModel.lightImageUrl;
                    if (color == null) {
                        gapComposer8.startReplaceGroup(586349263);
                        gapComposer8.end(false);
                        m = null;
                    } else {
                        m = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer8, 1820029810, color, gapComposer8, false);
                    }
                    if (m == null) {
                        gapComposer8.startReplaceGroup(1820031315);
                        Colors colors3 = (Colors) gapComposer8.consume(ArcadeThemeKt.LocalColors);
                        if (colors3 == null) {
                            colors3 = re$$ExternalSyntheticOutline0.m(gapComposer8, -1762997026, gapComposer8, false);
                        } else {
                            gapComposer8.startReplaceGroup(-1762997739);
                            gapComposer8.end(false);
                        }
                        j = colors3.semantic.icon.extraSubtle;
                        gapComposer8.end(false);
                    } else {
                        gapComposer8.startReplaceGroup(1820029114);
                        gapComposer8.end(false);
                        j = m.value;
                    }
                    long j2 = j;
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                    Colors colors4 = (Colors) gapComposer8.consume(staticProvidableCompositionLocal);
                    if (colors4 == null) {
                        colors4 = re$$ExternalSyntheticOutline0.m(gapComposer8, -1762997026, gapComposer8, false);
                    } else {
                        gapComposer8.startReplaceGroup(-1762997739);
                        gapComposer8.end(false);
                    }
                    if (!colors4.isLight) {
                        String str6 = legacyOffersAvatarViewModel.darkImageUrl;
                        if (str6 != null) {
                            str5 = str6;
                            break;
                        }
                    }
                    AvatarImage.Remote.Image image = new AvatarImage.Remote.Image(str, false, null, 0L, new OffersAvatarKt$$ExternalSyntheticLambda0(9), 62);
                    Icons icons3 = Icons.Check16;
                    Colors colors5 = (Colors) gapComposer8.consume(staticProvidableCompositionLocal);
                    if (colors5 == null) {
                        colors5 = re$$ExternalSyntheticOutline0.m(gapComposer8, -1762997026, gapComposer8, false);
                    } else {
                        gapComposer8.startReplaceGroup(-1762997739);
                        gapComposer8.end(false);
                    }
                    TextViewKt.Avatar(avatarSize, new AvatarEntry(str4, j2, null, image, null, offersRowViewModel.showActiveBoostAvatarBadge ? new AvatarOverlay.LocalIcon(4, colors5.semantic.background.subtle, 0L, icons3) : null, null, null, EnumC0170g.SDK_ASSET_ICON_ARROW_DOWN_VALUE), null, false, gapComposer8, 6, 28);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                MetadataRepo metadataRepo = (MetadataRepo) obj3;
                Composer composer9 = (Composer) obj;
                int intValue9 = ((Integer) obj2).intValue();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2)) {
                    metadataRepo.Content(gapComposer9, 0);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                AllowlistSelectionViewModel allowlistSelectionViewModel = (AllowlistSelectionViewModel) obj3;
                Composer composer10 = (Composer) obj;
                int intValue10 = ((Integer) obj2).intValue();
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer10, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, allowlistSelectionViewModel.title, (Map) null, (Function1) null, false);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 22:
                PasskeyUpsellViewModel passkeyUpsellViewModel = (PasskeyUpsellViewModel) obj3;
                Composer composer11 = (Composer) obj;
                int intValue11 = ((Integer) obj2).intValue();
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 3) != 2)) {
                    AvatarSize avatarSize2 = AvatarSize.Size64;
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ArcadeThemeKt.LocalColors;
                    Colors colors6 = (Colors) gapComposer11.consume(staticProvidableCompositionLocal2);
                    if (colors6 == null) {
                        colors6 = re$$ExternalSyntheticOutline0.m(gapComposer11, -1762997026, gapComposer11, false);
                    } else {
                        gapComposer11.startReplaceGroup(-1762997739);
                        gapComposer11.end(false);
                    }
                    long j3 = colors6.semantic.background.brand;
                    Icon icon = passkeyUpsellViewModel.icon;
                    if (icon != null && (str2 = icon.arcade_id) != null) {
                        Icons.Companion.getClass();
                        icons = zzd.get(str2);
                        break;
                    }
                    icons = Icons.Passkey24;
                    Colors colors7 = (Colors) gapComposer11.consume(staticProvidableCompositionLocal2);
                    if (colors7 == null) {
                        colors7 = re$$ExternalSyntheticOutline0.m(gapComposer11, -1762997026, gapComposer11, false);
                    } else {
                        gapComposer11.startReplaceGroup(-1762997739);
                        gapComposer11.end(false);
                    }
                    TextViewKt.m3613AvatarB_rZmmc(avatarSize2, "", j3, (String) null, (Modifier) null, (AvatarImage) new AvatarImage.LocalIcon(icons, colors7.semantic.text.inverse, 4), (Function2) null, (AvatarOverlay) null, false, 0L, (Composer) gapComposer11, 3126, 0, 2000);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 23:
                RealPaychecksAppletTileRepository realPaychecksAppletTileRepository = (RealPaychecksAppletTileRepository) obj3;
                UiState uiState = (UiState) obj;
                if (((Boolean) obj2).booleanValue()) {
                    return AppletAvailabilityState.UNAVAILABLE;
                }
                PaychecksUiState.PaychecksAppletState paychecksAppletState = uiState != null ? WindowInfoImpl.Companion.buildApplet(realPaychecksAppletTileRepository, uiState).state : null;
                int i2 = paychecksAppletState == null ? -1 : RealPaychecksAppletTileRepository.WhenMappings.$EnumSwitchMapping$0[paychecksAppletState.ordinal()];
                if (i2 == -1) {
                    return AppletAvailabilityState.LOADING;
                }
                if (i2 == 1 || i2 == 2) {
                    return AppletAvailabilityState.AVAILABLE;
                }
                if (i2 == 3) {
                    return AppletAvailabilityState.UNAVAILABLE;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 24:
                ActiveDistributionSectionBodyViewModel activeDistributionSectionBodyViewModel = (ActiveDistributionSectionBodyViewModel) obj3;
                Composer composer12 = (Composer) obj;
                int intValue12 = ((Integer) obj2).intValue();
                GapComposer gapComposer12 = (GapComposer) composer12;
                if (gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 3) != 2)) {
                    HelpSheetViewKt.PaycheckDistributionWheel(activeDistributionSectionBodyViewModel.wheelViewModel, PaycheckDistributionWheel$PlacementConfig.PAYCHECKS_HOME_SECTION, SizeKt.m277height3ABfNKs(companion, 160.0f), null, null, null, null, gapComposer12, MLKEMEngine.KyberPolyBytes, 120);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 25:
                ((Integer) obj2).getClass();
                HelpSheetViewKt.ActivitySection((PaychecksHomeViewModel.Content.Section.ArcadeActivity) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 26:
                PaychecksHomeViewModel.Content.Section.DirectDeposit.PendingDirectDeposit.PendingDirectDepositSheetContent pendingDirectDepositSheetContent = (PaychecksHomeViewModel.Content.Section.DirectDeposit.PendingDirectDeposit.PendingDirectDepositSheetContent) obj3;
                Composer composer13 = (Composer) obj;
                int intValue13 = ((Integer) obj2).intValue();
                GapComposer gapComposer13 = (GapComposer) composer13;
                if (gapComposer13.shouldExecute(intValue13 & 1, (intValue13 & 3) != 2)) {
                    AvatarSize avatarSize3 = AvatarSize.Size64;
                    Colors colors8 = (Colors) gapComposer13.consume(ArcadeThemeKt.LocalColors);
                    if (colors8 == null) {
                        colors8 = re$$ExternalSyntheticOutline0.m(gapComposer13, -1762997026, gapComposer13, false);
                    } else {
                        gapComposer13.startReplaceGroup(-1762997739);
                        gapComposer13.end(false);
                    }
                    long j4 = colors8.semantic.background.brand;
                    zzd zzdVar = Icons.Companion;
                    String str7 = pendingDirectDepositSheetContent.icon.arcade_id;
                    str7.getClass();
                    zzdVar.getClass();
                    Icons icons4 = zzd.get(str7);
                    icons4.getClass();
                    TextViewKt.Avatar(avatarSize3, new AvatarEntry("", j4, null, new AvatarImage.LocalIcon(icons4, 0L, 6), null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE), null, false, gapComposer13, 6, 28);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 27:
                DestinationAllocationRowViewModel destinationAllocationRowViewModel = (DestinationAllocationRowViewModel) obj3;
                Composer composer14 = (Composer) obj;
                int intValue14 = ((Integer) obj2).intValue();
                GapComposer gapComposer14 = (GapComposer) composer14;
                if (gapComposer14.shouldExecute(intValue14 & 1, (intValue14 & 3) != 2)) {
                    HelpSheetViewKt.Icon(destinationAllocationRowViewModel.icon, SizeKt.m285size3ABfNKs(companion, 12.0f), gapComposer14, 48);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 28:
                DistributePaycheckViewModel.Loaded loaded2 = (DistributePaycheckViewModel.Loaded) obj3;
                Composer composer15 = (Composer) obj;
                int intValue15 = ((Integer) obj2).intValue();
                GapComposer gapComposer15 = (GapComposer) composer15;
                if (gapComposer15.shouldExecute(intValue15 & 1, (intValue15 & 3) != 2)) {
                    Countries.PageHeader(loaded2.title, SizeKt.fillMaxWidth(companion, 1.0f), (Function2) null, (String) null, gapComposer15, 48, 12);
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                MultipleAllocationViewModel.Active active = (MultipleAllocationViewModel.Active) obj3;
                Composer composer16 = (Composer) obj;
                int intValue16 = ((Integer) obj2).intValue();
                GapComposer gapComposer16 = (GapComposer) composer16;
                if (gapComposer16.shouldExecute(intValue16 & 1, (intValue16 & 3) != 2)) {
                    String str8 = active.title;
                    Object rememberedValue = gapComposer16.rememberedValue();
                    if (rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new HelpSheetViewKt$$ExternalSyntheticLambda4(16);
                        gapComposer16.updateRememberedValue(rememberedValue);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4092, 0L, (Composer) gapComposer16, SemanticsModifierKt.semantics(companion, false, (Function1) rememberedValue), (TextStyle) null, (TextLineBalancing) null, str8, (Map) null, (Function1) null, false);
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ SuggestionUiKt$$ExternalSyntheticLambda8(Object obj, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
    }
}
