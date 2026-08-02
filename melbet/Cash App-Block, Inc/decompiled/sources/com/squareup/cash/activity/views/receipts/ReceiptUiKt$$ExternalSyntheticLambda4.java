package com.squareup.cash.activity.views.receipts;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import app.cash.inputfieldtext.InputFieldText;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.viewmodels.ReceiptViewModel;
import com.squareup.cash.activity.views.ActivityTabViewKt$$ExternalSyntheticLambda17;
import com.squareup.cash.afterpayapplet.fixtures.AfterpayCardFixtures;
import com.squareup.cash.afterpayapplet.fixtures.AfterpayHomeFixturesKt;
import com.squareup.cash.afterpayapplet.fixtures.AfterpaySearchFixturesKt;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpaySearchViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.CardThumbnailDisplayStyle;
import com.squareup.cash.afterpayapplet.viewmodels.FooterImageContent;
import com.squareup.cash.afterpayapplet.viewmodels.RemoteImage;
import com.squareup.cash.afterpayapplet.viewmodels.Tap;
import com.squareup.cash.afterpayapplet.viewmodels.TappableIcon;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpaySearchViewEvent;
import com.squareup.cash.afterpayapplet.views.AfterpaySearchViewKt;
import com.squareup.cash.afterpayapplet.views.AfterpaySearchViewKt$$ExternalSyntheticLambda43;
import com.squareup.cash.afterpayapplet.views.browser.SelectAfterpayPromptSheetKt;
import com.squareup.cash.afterpayapplet.views.homesection.LegalSectionKt;
import com.squareup.cash.afterpayapplet.views.homesection.v3.AfterpayCardKt;
import com.squareup.cash.appmessages.db.CardMessageQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.common.moneyformatter.MoneyKt;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.ui.UiAvatar;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList;
import org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import squareup.cash.ui.arcade.elements.ButtonProminence;

/* loaded from: classes5.dex */
public final /* synthetic */ class ReceiptUiKt$$ExternalSyntheticLambda4 implements Function2 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ ReceiptUiKt$$ExternalSyntheticLambda4(int i) {
        this.$r8$classId = i;
    }

    private final Object invoke$com$squareup$cash$afterpayapplet$views$homesection$v3$ComposableSingletons$AfterpayCardSectionKt$$ExternalSyntheticLambda4(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(ImageKt.m177backgroundbw27NRU(Modifier.Companion.$$INSTANCE, colors.semantic.background.f1047app, ColorKt.RectangleShape), 16.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m298padding3ABfNKs);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardSection afterpayCardSection = new AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardSection(new AfterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader(null, "$150.30", "Available to get back", null, null, AfterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader.SectionDisplayEffect.REGULAR_EFFECT), null, new AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.CardFooter.AvatarTextFooter(CollectionsKt__CollectionsJVMKt.listOf(new UiAvatar(null, GpsTagConstants.GPS_TAG_GPS_STATUS_VALUE_MEASUREMENT_IN_PROGRESS, null, null, null, null, null, 32765)), "Switch to Afterpay", "4 eligible transactions", new Tap.Url("//action", null)));
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new CardMessageQueries$$ExternalSyntheticLambda1(6);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            AfterpayCardKt.AfterpayCardSection(null, afterpayCardSection, false, (Function1) rememberedValue, gapComposer, 3456, 1);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = 11;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        int i3 = 1;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ReceiptUiKt.Loading((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 1:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ReceiptViewModel.LoadingError loadingError = new ReceiptViewModel.LoadingError("Unable to load receipt", "Try reloading, or check again later.");
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = new ActivityTabViewKt$$ExternalSyntheticLambda17(8);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    ReceiptUiKt.LoadingError(loadingError, (Function1) rememberedValue, gapComposer, 48);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                return Integer.valueOf(((Integer) obj2).intValue() - ((Integer) obj).intValue());
            case 3:
                ((Integer) obj2).getClass();
                AfterpaySearchViewKt.LoadingMerchantSheetView((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 4:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    AfterpaySearchViewModel afterpaySearchViewModel = AfterpaySearchFixturesKt.noQueryParameterViewModel;
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new AfterpaySearchViewKt$$ExternalSyntheticLambda43(11);
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    AfterpaySearchViewKt.AfterpaySearch(afterpaySearchViewModel, (Function1) rememberedValue2, gapComposer2, 48);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    AfterpaySearchViewModel afterpaySearchViewModel2 = AfterpaySearchFixturesKt.noResultsViewModel;
                    Object rememberedValue3 = gapComposer3.rememberedValue();
                    if (rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new AfterpaySearchViewKt$$ExternalSyntheticLambda43(4);
                        gapComposer3.updateRememberedValue(rememberedValue3);
                    }
                    AfterpaySearchViewKt.AfterpaySearch(afterpaySearchViewModel2, (Function1) rememberedValue3, gapComposer3, 48);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    AfterpaySearchViewModel afterpaySearchViewModel3 = AfterpaySearchFixturesKt.noResults_noFilters_LoadingViewModel;
                    Object rememberedValue4 = gapComposer4.rememberedValue();
                    if (rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new AfterpaySearchViewKt$$ExternalSyntheticLambda43(6);
                        gapComposer4.updateRememberedValue(rememberedValue4);
                    }
                    AfterpaySearchViewKt.AfterpaySearch(afterpaySearchViewModel3, (Function1) rememberedValue4, gapComposer4, 48);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    AfterpaySearchViewModel afterpaySearchViewModel4 = AfterpaySearchFixturesKt.noResults_withFilters_LoadingViewModel;
                    Object rememberedValue5 = gapComposer5.rememberedValue();
                    if (rememberedValue5 == neverEqualPolicy) {
                        rememberedValue5 = new AfterpaySearchViewKt$$ExternalSyntheticLambda43(13);
                        gapComposer5.updateRememberedValue(rememberedValue5);
                    }
                    AfterpaySearchViewKt.AfterpaySearch(afterpaySearchViewModel4, (Function1) rememberedValue5, gapComposer5, 48);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    AfterpaySearchViewModel afterpaySearchViewModel5 = new AfterpaySearchViewModel("Afterpay partners", "Search brands or stores", new InputFieldText.Simple("my search"), EmptyList.INSTANCE, new AfterpaySearchViewModel.BodyViewModel.NoContentViewModel("Couldn’t load search", "Check your connection and try again", (Image) null, true, "Try again", (String) null, (AfterpaySearchViewEvent) AfterpaySearchViewEvent.TryAgainButtonClicked.INSTANCE), null);
                    Object rememberedValue6 = gapComposer6.rememberedValue();
                    if (rememberedValue6 == neverEqualPolicy) {
                        rememberedValue6 = new AfterpaySearchViewKt$$ExternalSyntheticLambda43(8);
                        gapComposer6.updateRememberedValue(rememberedValue6);
                    }
                    AfterpaySearchViewKt.AfterpaySearch(afterpaySearchViewModel5, (Function1) rememberedValue6, gapComposer6, 48);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                    AfterpaySearchViewModel.FilterBottomSheetViewModel filterBottomSheetViewModel = AfterpaySearchFixturesKt.filterBottomSheet_ResultsViewModelViewModel.filterBottomSheet;
                    filterBottomSheetViewModel.getClass();
                    Object rememberedValue7 = gapComposer7.rememberedValue();
                    if (rememberedValue7 == neverEqualPolicy) {
                        rememberedValue7 = new AfterpaySearchViewKt$$ExternalSyntheticLambda43(12);
                        gapComposer7.updateRememberedValue(rememberedValue7);
                    }
                    AfterpaySearchViewKt.FilterBottomSheetContent(filterBottomSheetViewModel, (Function1) rememberedValue7, gapComposer7, 48);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                Composer composer8 = (Composer) obj;
                int intValue8 = ((Integer) obj2).intValue();
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 3) != 2)) {
                    MoneyKt.m3505FakeBottomSheet3IgeMak(null, 0L, AfterpaySearchViewKt.f134lambda$781489412, gapComposer8, MLKEMEngine.KyberPolyBytes, 3);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                Composer composer9 = (Composer) obj;
                int intValue9 = ((Integer) obj2).intValue();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2)) {
                    AfterpaySearchViewModel afterpaySearchViewModel6 = AfterpaySearchFixturesKt.noQueryParameterViewModel;
                    String str = afterpaySearchViewModel6.title;
                    String str2 = afterpaySearchViewModel6.queryPlaceholder;
                    InputFieldText inputFieldText = afterpaySearchViewModel6.query;
                    List list = afterpaySearchViewModel6.filterPillViewModels;
                    AfterpaySearchViewModel.FilterBottomSheetViewModel filterBottomSheetViewModel2 = afterpaySearchViewModel6.filterBottomSheet;
                    str.getClass();
                    str2.getClass();
                    inputFieldText.getClass();
                    list.getClass();
                    AfterpaySearchViewModel afterpaySearchViewModel7 = new AfterpaySearchViewModel(str, str2, inputFieldText, list, AfterpaySearchViewModel.BodyViewModel.LoadingViewModel.INSTANCE, filterBottomSheetViewModel2);
                    Object rememberedValue8 = gapComposer9.rememberedValue();
                    if (rememberedValue8 == neverEqualPolicy) {
                        rememberedValue8 = new AfterpaySearchViewKt$$ExternalSyntheticLambda43(3);
                        gapComposer9.updateRememberedValue(rememberedValue8);
                    }
                    AfterpaySearchViewKt.AfterpaySearch(afterpaySearchViewModel7, (Function1) rememberedValue8, gapComposer9, 48);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                Composer composer10 = (Composer) obj;
                int intValue10 = ((Integer) obj2).intValue();
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 3) != 2)) {
                    InputFieldText.Simple simple = new InputFieldText.Simple("my search");
                    AfterpaySearchViewModel.BodyViewModel.ResultsViewModel.SectionViewModel sectionViewModel = AfterpaySearchFixturesKt.resultSectionViewModel1;
                    List take = CollectionsKt.take(sectionViewModel.rowViewModels, 2);
                    String str3 = sectionViewModel.id;
                    boolean z = sectionViewModel.showFooterDivider;
                    str3.getClass();
                    take.getClass();
                    AfterpaySearchViewModel afterpaySearchViewModel8 = new AfterpaySearchViewModel("Afterpay partners", "Search brands or stores", simple, EmptyList.INSTANCE, new AfterpaySearchViewModel.BodyViewModel.ResultsViewModel(null, null, CollectionsKt__CollectionsKt.listOf((Object[]) new AfterpaySearchViewModel.BodyViewModel.ResultsViewModel.SectionViewModel[]{new AfterpaySearchViewModel.BodyViewModel.ResultsViewModel.SectionViewModel(str3, "Search Results", null, take, z), AfterpaySearchFixturesKt.clearInputSectionViewModel}), 6), null);
                    Object rememberedValue9 = gapComposer10.rememberedValue();
                    if (rememberedValue9 == neverEqualPolicy) {
                        rememberedValue9 = new AfterpaySearchViewKt$$ExternalSyntheticLambda43(5);
                        gapComposer10.updateRememberedValue(rememberedValue9);
                    }
                    AfterpaySearchViewKt.AfterpaySearch(afterpaySearchViewModel8, (Function1) rememberedValue9, gapComposer10, 48);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                Composer composer11 = (Composer) obj;
                int intValue11 = ((Integer) obj2).intValue();
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 3) != 2)) {
                    AfterpaySearchViewModel afterpaySearchViewModel9 = AfterpaySearchFixturesKt.resultsWithUpsellCardViewModel;
                    Object rememberedValue10 = gapComposer11.rememberedValue();
                    if (rememberedValue10 == neverEqualPolicy) {
                        rememberedValue10 = new AfterpaySearchViewKt$$ExternalSyntheticLambda43(10);
                        gapComposer11.updateRememberedValue(rememberedValue10);
                    }
                    AfterpaySearchViewKt.AfterpaySearch(afterpaySearchViewModel9, (Function1) rememberedValue10, gapComposer11, 48);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                Composer composer12 = (Composer) obj;
                int intValue12 = ((Integer) obj2).intValue();
                GapComposer gapComposer12 = (GapComposer) composer12;
                if (gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 3) != 2)) {
                    AfterpaySearchViewModel afterpaySearchViewModel10 = AfterpaySearchFixturesKt.resultsViewModel;
                    Object rememberedValue11 = gapComposer12.rememberedValue();
                    if (rememberedValue11 == neverEqualPolicy) {
                        rememberedValue11 = new AfterpaySearchViewKt$$ExternalSyntheticLambda43(9);
                        gapComposer12.updateRememberedValue(rememberedValue11);
                    }
                    AfterpaySearchViewKt.AfterpaySearch(afterpaySearchViewModel10, (Function1) rememberedValue11, gapComposer12, 48);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                Composer composer13 = (Composer) obj;
                int intValue13 = ((Integer) obj2).intValue();
                GapComposer gapComposer13 = (GapComposer) composer13;
                if (gapComposer13.shouldExecute(intValue13 & 1, (intValue13 & 3) != 2)) {
                    Object rememberedValue12 = gapComposer13.rememberedValue();
                    if (rememberedValue12 == neverEqualPolicy) {
                        rememberedValue12 = new AfterpaySearchViewKt$$ExternalSyntheticLambda43(15);
                        gapComposer13.updateRememberedValue(rememberedValue12);
                    }
                    SelectAfterpayPromptSheetKt.SelectAfterpayPrompt((Function1) rememberedValue12, gapComposer13, 6);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 16:
                Composer composer14 = (Composer) obj;
                int intValue14 = ((Integer) obj2).intValue();
                GapComposer gapComposer14 = (GapComposer) composer14;
                if (!gapComposer14.shouldExecute(intValue14 & 1, (intValue14 & 3) != 2)) {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                Composer composer15 = (Composer) obj;
                int intValue15 = ((Integer) obj2).intValue();
                GapComposer gapComposer15 = (GapComposer) composer15;
                if (!gapComposer15.shouldExecute(intValue15 & 1, (intValue15 & 3) != 2)) {
                    gapComposer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                LegalSectionKt.HomeSectionDivider((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                AfterpayCardKt.AfterpayCardPreview((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 20:
                Composer composer16 = (Composer) obj;
                int intValue16 = ((Integer) obj2).intValue();
                GapComposer gapComposer16 = (GapComposer) composer16;
                if (gapComposer16.shouldExecute(intValue16 & 1, (intValue16 & 3) != 2)) {
                    Colors colors = (Colors) gapComposer16.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer16, -1762997026, gapComposer16, false);
                    } else {
                        gapComposer16.startReplaceGroup(-1762997739);
                        gapComposer16.end(false);
                    }
                    Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(ImageKt.m177backgroundbw27NRU(companion, colors.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1), 16.0f);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer16, 0);
                    int hashCode = Long.hashCode(gapComposer16.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer16.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer16, m298padding3ABfNKs);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer16.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer16.startReusableNode();
                    if (gapComposer16.inserting) {
                        gapComposer16.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer16.useNode();
                    }
                    Updater.m576setimpl(gapComposer16, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer16, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer16, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer16, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer16, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    CardThumbnailDisplayStyle cardThumbnailDisplayStyle = CardThumbnailDisplayStyle.STANDARD;
                    AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardSection afterpayCardSection = new AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardSection(null, AfterpayHomeFixturesKt.createAfterpayCardContentWithCashCard$default(14), new AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.CardFooter.TappableFooter(null, "Get Afterpay on your card", null, new Tap.Url("//action", null)));
                    Object rememberedValue13 = gapComposer16.rememberedValue();
                    if (rememberedValue13 == neverEqualPolicy) {
                        rememberedValue13 = new CardMessageQueries$$ExternalSyntheticLambda1(5);
                        gapComposer16.updateRememberedValue(rememberedValue13);
                    }
                    AfterpayCardKt.AfterpayCardSection(null, afterpayCardSection, false, (Function1) rememberedValue13, gapComposer16, 3456, 1);
                    gapComposer16.end(true);
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                Composer composer17 = (Composer) obj;
                int intValue17 = ((Integer) obj2).intValue();
                GapComposer gapComposer17 = (GapComposer) composer17;
                if (gapComposer17.shouldExecute(intValue17 & 1, (intValue17 & 3) != 2)) {
                    Colors colors2 = (Colors) gapComposer17.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer17, -1762997026, gapComposer17, false);
                    } else {
                        gapComposer17.startReplaceGroup(-1762997739);
                        gapComposer17.end(false);
                    }
                    Modifier m298padding3ABfNKs2 = SpacerKt.m298padding3ABfNKs(ImageKt.m177backgroundbw27NRU(companion, colors2.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1), 16.0f);
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer17, 0);
                    int hashCode2 = Long.hashCode(gapComposer17.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer17.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer17, m298padding3ABfNKs2);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer17.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer17.startReusableNode();
                    if (gapComposer17.inserting) {
                        gapComposer17.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer17.useNode();
                    }
                    Updater.m576setimpl(gapComposer17, columnMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer17, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer17, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer17, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer17, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                    AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardSection afterpayCardSection2 = new AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardSection(new AfterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader("Use Afterpay on card purchases", "$0.00", "Available to spend", AfterpayCardFixtures.standardInfoIcon, null, AfterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader.SectionDisplayEffect.DISABLED_EFFECT), new AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardContent.TileCarousel(AfterpayCardFixtures.merchantCarouselTiles), new AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.CardFooter.ButtonFooter("Over 1,000 partner stores", new AfterpayAppletHomeContentViewModel.HomeSection.ButtonModel("Browse", null, new Tap.Url("https://www.afterpay.com/browse-partners", null), ButtonProminence.PROMINENT)));
                    Object rememberedValue14 = gapComposer17.rememberedValue();
                    if (rememberedValue14 == neverEqualPolicy) {
                        rememberedValue14 = new CardMessageQueries$$ExternalSyntheticLambda1(3);
                        gapComposer17.updateRememberedValue(rememberedValue14);
                    }
                    AfterpayCardKt.AfterpayCardSection(null, afterpayCardSection2, false, (Function1) rememberedValue14, gapComposer17, 3456, 1);
                    gapComposer17.end(true);
                } else {
                    gapComposer17.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 22:
                Composer composer18 = (Composer) obj;
                int intValue18 = ((Integer) obj2).intValue();
                GapComposer gapComposer18 = (GapComposer) composer18;
                if (gapComposer18.shouldExecute(intValue18 & 1, (intValue18 & 3) != 2)) {
                    Colors colors3 = (Colors) gapComposer18.consume(ArcadeThemeKt.LocalColors);
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer18, -1762997026, gapComposer18, false);
                    } else {
                        gapComposer18.startReplaceGroup(-1762997739);
                        gapComposer18.end(false);
                    }
                    Modifier m298padding3ABfNKs3 = SpacerKt.m298padding3ABfNKs(ImageKt.m177backgroundbw27NRU(companion, colors3.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1), 16.0f);
                    ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer18, 0);
                    int hashCode3 = Long.hashCode(gapComposer18.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer18.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer18, m298padding3ABfNKs3);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer18.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer18.startReusableNode();
                    if (gapComposer18.inserting) {
                        gapComposer18.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer18.useNode();
                    }
                    Updater.m576setimpl(gapComposer18, columnMeasurePolicy3, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer18, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer18, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer18, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer18, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                    AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardSection afterpayCardSection3 = new AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardSection(new AfterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader("Online at partner stores", "$250 available", "Available to shop online", AfterpayCardFixtures.standardInfoIcon, "Find Afterpay at checkout on partner apps and sites. Pay later with no interest.", AfterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader.SectionDisplayEffect.REGULAR_EFFECT), new AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardContent.TileCarousel(AfterpayCardFixtures.merchantCarouselTiles), new AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.CardFooter.TappableFooter(null, "View (4) eligible transactions", null, null));
                    Object rememberedValue15 = gapComposer18.rememberedValue();
                    if (rememberedValue15 == neverEqualPolicy) {
                        rememberedValue15 = new CardMessageQueries$$ExternalSyntheticLambda1(i3);
                        gapComposer18.updateRememberedValue(rememberedValue15);
                    }
                    AfterpayCardKt.AfterpayCardSection(null, afterpayCardSection3, false, (Function1) rememberedValue15, gapComposer18, 3456, 1);
                    gapComposer18.end(true);
                } else {
                    gapComposer18.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 23:
                Composer composer19 = (Composer) obj;
                int intValue19 = ((Integer) obj2).intValue();
                GapComposer gapComposer19 = (GapComposer) composer19;
                if (gapComposer19.shouldExecute(intValue19 & 1, (intValue19 & 3) != 2)) {
                    Colors colors4 = (Colors) gapComposer19.consume(ArcadeThemeKt.LocalColors);
                    if (colors4 == null) {
                        colors4 = re$$ExternalSyntheticOutline0.m(gapComposer19, -1762997026, gapComposer19, false);
                    } else {
                        gapComposer19.startReplaceGroup(-1762997739);
                        gapComposer19.end(false);
                    }
                    Modifier m298padding3ABfNKs4 = SpacerKt.m298padding3ABfNKs(ImageKt.m177backgroundbw27NRU(companion, colors4.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1), 16.0f);
                    ColumnMeasurePolicy columnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer19, 0);
                    int hashCode4 = Long.hashCode(gapComposer19.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer19.currentCompositionLocalScope();
                    Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer19, m298padding3ABfNKs4);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$14 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer19.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer19.startReusableNode();
                    if (gapComposer19.inserting) {
                        gapComposer19.createNode(layoutNode$Companion$Constructor$14);
                    } else {
                        gapComposer19.useNode();
                    }
                    Updater.m576setimpl(gapComposer19, columnMeasurePolicy4, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer19, currentCompositionLocalScope4, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer19, Integer.valueOf(hashCode4), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer19, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer19, materializeModifier4, ComposeUiNode.Companion.SetModifier);
                    AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardSection afterpayCardSection4 = new AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardSection(new AfterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader("Use Afterpay on card purchases", "$250 available", "Available to shop online", AfterpayCardFixtures.standardInfoIcon, "Access your virtual card details and make purchases online.", AfterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader.SectionDisplayEffect.REGULAR_EFFECT), null, new AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.CardFooter.TappableFooter(new FooterImageContent.Image(new RemoteImage(new RemoteImage.ImageUrl("fake:///pay-in-four-light.png", "fake:///pay-in-four-light.png"))), "Manage your Afterpay Card", null, null));
                    Object rememberedValue16 = gapComposer19.rememberedValue();
                    if (rememberedValue16 == neverEqualPolicy) {
                        rememberedValue16 = new CardMessageQueries$$ExternalSyntheticLambda1(8);
                        gapComposer19.updateRememberedValue(rememberedValue16);
                    }
                    AfterpayCardKt.AfterpayCardSection(null, afterpayCardSection4, false, (Function1) rememberedValue16, gapComposer19, 3456, 1);
                    gapComposer19.end(true);
                } else {
                    gapComposer19.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 24:
                Composer composer20 = (Composer) obj;
                int intValue20 = ((Integer) obj2).intValue();
                GapComposer gapComposer20 = (GapComposer) composer20;
                if (gapComposer20.shouldExecute(intValue20 & 1, (intValue20 & 3) != 2)) {
                    Colors colors5 = (Colors) gapComposer20.consume(ArcadeThemeKt.LocalColors);
                    if (colors5 == null) {
                        colors5 = re$$ExternalSyntheticOutline0.m(gapComposer20, -1762997026, gapComposer20, false);
                    } else {
                        gapComposer20.startReplaceGroup(-1762997739);
                        gapComposer20.end(false);
                    }
                    Modifier m298padding3ABfNKs5 = SpacerKt.m298padding3ABfNKs(ImageKt.m177backgroundbw27NRU(companion, colors5.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1), 16.0f);
                    ColumnMeasurePolicy columnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer20, 0);
                    int hashCode5 = Long.hashCode(gapComposer20.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer20.currentCompositionLocalScope();
                    Modifier materializeModifier5 = PlatformKt.materializeModifier(gapComposer20, m298padding3ABfNKs5);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$15 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer20.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer20.startReusableNode();
                    if (gapComposer20.inserting) {
                        gapComposer20.createNode(layoutNode$Companion$Constructor$15);
                    } else {
                        gapComposer20.useNode();
                    }
                    Updater.m576setimpl(gapComposer20, columnMeasurePolicy5, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer20, currentCompositionLocalScope5, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer20, Integer.valueOf(hashCode5), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer20, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer20, materializeModifier5, ComposeUiNode.Companion.SetModifier);
                    AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardSection afterpayCardSection5 = new AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardSection(new AfterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader("Your transactions", null, null, null, null, AfterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader.SectionDisplayEffect.REGULAR_EFFECT), null, new AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.CardFooter.TappableFooter(null, "Manage transactions", "View all eligible purchases", new Tap.Url("//action", null)));
                    Object rememberedValue17 = gapComposer20.rememberedValue();
                    if (rememberedValue17 == neverEqualPolicy) {
                        rememberedValue17 = new CardMessageQueries$$ExternalSyntheticLambda1(4);
                        gapComposer20.updateRememberedValue(rememberedValue17);
                    }
                    AfterpayCardKt.AfterpayCardSection(null, afterpayCardSection5, false, (Function1) rememberedValue17, gapComposer20, 3456, 1);
                    gapComposer20.end(true);
                } else {
                    gapComposer20.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 25:
                Composer composer21 = (Composer) obj;
                int intValue21 = ((Integer) obj2).intValue();
                GapComposer gapComposer21 = (GapComposer) composer21;
                if (gapComposer21.shouldExecute(intValue21 & 1, (intValue21 & 3) != 2)) {
                    Colors colors6 = (Colors) gapComposer21.consume(ArcadeThemeKt.LocalColors);
                    if (colors6 == null) {
                        colors6 = re$$ExternalSyntheticOutline0.m(gapComposer21, -1762997026, gapComposer21, false);
                    } else {
                        gapComposer21.startReplaceGroup(-1762997739);
                        gapComposer21.end(false);
                    }
                    Modifier m298padding3ABfNKs6 = SpacerKt.m298padding3ABfNKs(ImageKt.m177backgroundbw27NRU(companion, colors6.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1), 16.0f);
                    ColumnMeasurePolicy columnMeasurePolicy6 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer21, 0);
                    int hashCode6 = Long.hashCode(gapComposer21.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope6 = gapComposer21.currentCompositionLocalScope();
                    Modifier materializeModifier6 = PlatformKt.materializeModifier(gapComposer21, m298padding3ABfNKs6);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$16 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer21.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer21.startReusableNode();
                    if (gapComposer21.inserting) {
                        gapComposer21.createNode(layoutNode$Companion$Constructor$16);
                    } else {
                        gapComposer21.useNode();
                    }
                    Updater.m576setimpl(gapComposer21, columnMeasurePolicy6, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer21, currentCompositionLocalScope6, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer21, Integer.valueOf(hashCode6), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer21, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer21, materializeModifier6, ComposeUiNode.Companion.SetModifier);
                    AbstractPersistentList abstractPersistentList = AfterpayCardFixtures.merchantCarouselTiles;
                    AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardSection afterpayCardSection6 = new AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardSection(new AfterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader(null, "$50.00", "Available on Cash App Card", new TappableIcon("InformationOutline16", null, "Information about Afterpay"), "Turn on Afterpay before your next card purchase to pay over time.", AfterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader.SectionDisplayEffect.REGULAR_EFFECT), null, new AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.CardFooter.TappableFooter(null, "Manage card", null, null));
                    Object rememberedValue18 = gapComposer21.rememberedValue();
                    if (rememberedValue18 == neverEqualPolicy) {
                        rememberedValue18 = new CardMessageQueries$$ExternalSyntheticLambda1(7);
                        gapComposer21.updateRememberedValue(rememberedValue18);
                    }
                    AfterpayCardKt.AfterpayCardSection(null, afterpayCardSection6, false, (Function1) rememberedValue18, gapComposer21, 3456, 1);
                    gapComposer21.end(true);
                } else {
                    gapComposer21.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 26:
                Composer composer22 = (Composer) obj;
                int intValue22 = ((Integer) obj2).intValue();
                GapComposer gapComposer22 = (GapComposer) composer22;
                if (gapComposer22.shouldExecute(intValue22 & 1, (intValue22 & 3) != 2)) {
                    Colors colors7 = (Colors) gapComposer22.consume(ArcadeThemeKt.LocalColors);
                    if (colors7 == null) {
                        colors7 = re$$ExternalSyntheticOutline0.m(gapComposer22, -1762997026, gapComposer22, false);
                    } else {
                        gapComposer22.startReplaceGroup(-1762997739);
                        gapComposer22.end(false);
                    }
                    Modifier m298padding3ABfNKs7 = SpacerKt.m298padding3ABfNKs(ImageKt.m177backgroundbw27NRU(companion, colors7.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1), 16.0f);
                    ColumnMeasurePolicy columnMeasurePolicy7 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer22, 0);
                    int hashCode7 = Long.hashCode(gapComposer22.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope7 = gapComposer22.currentCompositionLocalScope();
                    Modifier materializeModifier7 = PlatformKt.materializeModifier(gapComposer22, m298padding3ABfNKs7);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$17 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer22.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer22.startReusableNode();
                    if (gapComposer22.inserting) {
                        gapComposer22.createNode(layoutNode$Companion$Constructor$17);
                    } else {
                        gapComposer22.useNode();
                    }
                    Updater.m576setimpl(gapComposer22, columnMeasurePolicy7, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer22, currentCompositionLocalScope7, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer22, Integer.valueOf(hashCode7), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer22, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer22, materializeModifier7, ComposeUiNode.Companion.SetModifier);
                    AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardSection afterpayCardSection7 = new AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardSection(new AfterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader("Use Afterpay on card purchases", "$250 available", "Available to shop online", AfterpayCardFixtures.standardInfoIcon, "Access your virtual card details and make purchases online.", AfterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader.SectionDisplayEffect.REGULAR_EFFECT), null, new AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.CardFooter.TappableFooter(new FooterImageContent.CardThumbnail(CardThumbnailDisplayStyle.ROTATED, AfterpayCardFixtures.fakeStyledCardViewModel), "Manage your Afterpay Card", null, null));
                    Object rememberedValue19 = gapComposer22.rememberedValue();
                    if (rememberedValue19 == neverEqualPolicy) {
                        rememberedValue19 = new CardMessageQueries$$ExternalSyntheticLambda1(9);
                        gapComposer22.updateRememberedValue(rememberedValue19);
                    }
                    AfterpayCardKt.AfterpayCardSection(null, afterpayCardSection7, false, (Function1) rememberedValue19, gapComposer22, 3456, 1);
                    gapComposer22.end(true);
                } else {
                    gapComposer22.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 27:
                Composer composer23 = (Composer) obj;
                int intValue23 = ((Integer) obj2).intValue();
                GapComposer gapComposer23 = (GapComposer) composer23;
                if (gapComposer23.shouldExecute(intValue23 & 1, (intValue23 & 3) != 2)) {
                    Colors colors8 = (Colors) gapComposer23.consume(ArcadeThemeKt.LocalColors);
                    if (colors8 == null) {
                        colors8 = re$$ExternalSyntheticOutline0.m(gapComposer23, -1762997026, gapComposer23, false);
                    } else {
                        gapComposer23.startReplaceGroup(-1762997739);
                        gapComposer23.end(false);
                    }
                    Modifier m298padding3ABfNKs8 = SpacerKt.m298padding3ABfNKs(ImageKt.m177backgroundbw27NRU(companion, colors8.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1), 16.0f);
                    ColumnMeasurePolicy columnMeasurePolicy8 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer23, 0);
                    int hashCode8 = Long.hashCode(gapComposer23.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope8 = gapComposer23.currentCompositionLocalScope();
                    Modifier materializeModifier8 = PlatformKt.materializeModifier(gapComposer23, m298padding3ABfNKs8);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$18 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer23.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer23.startReusableNode();
                    if (gapComposer23.inserting) {
                        gapComposer23.createNode(layoutNode$Companion$Constructor$18);
                    } else {
                        gapComposer23.useNode();
                    }
                    Updater.m576setimpl(gapComposer23, columnMeasurePolicy8, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer23, currentCompositionLocalScope8, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer23, Integer.valueOf(hashCode8), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer23, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer23, materializeModifier8, ComposeUiNode.Companion.SetModifier);
                    AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardSection afterpayCardSection8 = new AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardSection(new AfterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader("Recent transactions", "$250.00", "Total spent this month", AfterpayCardFixtures.standardInfoIcon, "View your recent Afterpay purchases and payment schedules.", AfterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader.SectionDisplayEffect.REGULAR_EFFECT), AfterpayCardFixtures.sampleTransactionList, new AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.CardFooter.TappableFooter(null, "View all transactions", null, null));
                    Object rememberedValue20 = gapComposer23.rememberedValue();
                    if (rememberedValue20 == neverEqualPolicy) {
                        rememberedValue20 = new AfterpaySearchViewKt$$ExternalSyntheticLambda43(29);
                        gapComposer23.updateRememberedValue(rememberedValue20);
                    }
                    AfterpayCardKt.AfterpayCardSection(null, afterpayCardSection8, false, (Function1) rememberedValue20, gapComposer23, 3456, 1);
                    gapComposer23.end(true);
                } else {
                    gapComposer23.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 28:
                return invoke$com$squareup$cash$afterpayapplet$views$homesection$v3$ComposableSingletons$AfterpayCardSectionKt$$ExternalSyntheticLambda4(obj, obj2);
            default:
                Composer composer24 = (Composer) obj;
                int intValue24 = ((Integer) obj2).intValue();
                GapComposer gapComposer24 = (GapComposer) composer24;
                if (gapComposer24.shouldExecute(intValue24 & 1, (intValue24 & 3) != 2)) {
                    Colors colors9 = (Colors) gapComposer24.consume(ArcadeThemeKt.LocalColors);
                    if (colors9 == null) {
                        colors9 = re$$ExternalSyntheticOutline0.m(gapComposer24, -1762997026, gapComposer24, false);
                    } else {
                        gapComposer24.startReplaceGroup(-1762997739);
                        gapComposer24.end(false);
                    }
                    Modifier m298padding3ABfNKs9 = SpacerKt.m298padding3ABfNKs(ImageKt.m177backgroundbw27NRU(companion, colors9.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1), 16.0f);
                    ColumnMeasurePolicy columnMeasurePolicy9 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer24, 0);
                    int hashCode9 = Long.hashCode(gapComposer24.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope9 = gapComposer24.currentCompositionLocalScope();
                    Modifier materializeModifier9 = PlatformKt.materializeModifier(gapComposer24, m298padding3ABfNKs9);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$19 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer24.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer24.startReusableNode();
                    if (gapComposer24.inserting) {
                        gapComposer24.createNode(layoutNode$Companion$Constructor$19);
                    } else {
                        gapComposer24.useNode();
                    }
                    Updater.m576setimpl(gapComposer24, columnMeasurePolicy9, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer24, currentCompositionLocalScope9, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer24, Integer.valueOf(hashCode9), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer24, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer24, materializeModifier9, ComposeUiNode.Companion.SetModifier);
                    AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardSection afterpayCardSection9 = new AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardSection(new AfterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader("$0.00", "Available to shop online", AfterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader.SectionDisplayEffect.DISABLED_EFFECT, 16), null, null);
                    Object rememberedValue21 = gapComposer24.rememberedValue();
                    if (rememberedValue21 == neverEqualPolicy) {
                        rememberedValue21 = new CardMessageQueries$$ExternalSyntheticLambda1(i2);
                        gapComposer24.updateRememberedValue(rememberedValue21);
                    }
                    AfterpayCardKt.AfterpayCardSection(null, afterpayCardSection9, true, (Function1) rememberedValue21, gapComposer24, 3456, 1);
                    gapComposer24.end(true);
                } else {
                    gapComposer24.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ ReceiptUiKt$$ExternalSyntheticLambda4(int i, int i2) {
        this.$r8$classId = i2;
    }
}
