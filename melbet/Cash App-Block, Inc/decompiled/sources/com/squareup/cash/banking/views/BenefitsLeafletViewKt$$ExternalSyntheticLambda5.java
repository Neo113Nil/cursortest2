package com.squareup.cash.banking.views;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.R;
import com.squareup.cash.afterpayapplet.fixtures.AfterpayCardFixtures;
import com.squareup.cash.afterpayapplet.fixtures.AfterpayHomeFixturesKt;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader;
import com.squareup.cash.afterpayapplet.viewmodels.CardThumbnailDisplayStyle;
import com.squareup.cash.afterpayapplet.viewmodels.Tap;
import com.squareup.cash.afterpayapplet.views.AfterpaySearchViewKt$$ExternalSyntheticLambda43;
import com.squareup.cash.afterpayapplet.views.homesection.v3.AfterpayCardKt;
import com.squareup.cash.appmessages.db.CardMessageQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarOverlay;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda2;
import com.squareup.cash.banking.viewmodels.BalanceHomeViewModel;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.featureflags.FeatureFlag$ControlTreatmentAmplitudeExperiment$Options;
import com.squareup.cash.money.core.states.AppletAvailabilityState;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.protos.franklin.ui.UiAvatar;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList;
import org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import squareup.cash.ui.arcade.elements.ButtonProminence;

/* loaded from: classes5.dex */
public final /* synthetic */ class BenefitsLeafletViewKt$$ExternalSyntheticLambda5 implements Function2 {
    public final /* synthetic */ int $r8$classId;

    private final Object invoke$com$squareup$cash$banking$views$ComposableSingletons$TransfersViewKt$$ExternalSyntheticLambda0(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
            Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3838, 0L, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.bank_transfer_section_title), (Map) null, (Function1) null, false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = 16;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        int i3 = 2;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                BenefitsLeafletViewKt.HideKeyboardOnLaunch((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 1:
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
                    Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(ImageKt.m177backgroundbw27NRU(companion, colors.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1), 16.0f);
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
                    AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardSection afterpayCardSection = new AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardSection(new AfterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader(null, "$250.00", "Available to spend online with Afterpay", AfterpayCardFixtures.standardInfoIcon, "Find Afterpay at checkout on partner apps and sites. Pay later with no interest.", AfterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader.SectionDisplayEffect.REGULAR_EFFECT), new AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardContent.TileCarousel(AfterpayCardFixtures.merchantCarouselTiles), new AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.CardFooter.ButtonFooter("Over 1,000 partner stores", new AfterpayAppletHomeContentViewModel.HomeSection.ButtonModel("Browse", null, new Tap.Url("https://www.afterpay.com/browse-partners", null), ButtonProminence.PROMINENT)));
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = new CardMessageQueries$$ExternalSyntheticLambda1(i3);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    AfterpayCardKt.AfterpayCardSection(null, afterpayCardSection, false, (Function1) rememberedValue, gapComposer, 3456, 1);
                    gapComposer.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Colors colors2 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    Modifier m298padding3ABfNKs2 = SpacerKt.m298padding3ABfNKs(ImageKt.m177backgroundbw27NRU(companion, colors2.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1), 16.0f);
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
                    int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, m298padding3ABfNKs2);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer2.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer2.useNode();
                    }
                    Updater.m576setimpl(gapComposer2, columnMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer2, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                    AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardSection afterpayCardSection2 = new AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardSection(new AfterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader("$150.30", "Available to get back", AfterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader.SectionDisplayEffect.REGULAR_EFFECT, 16), null, new AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.CardFooter.AvatarTextFooter(CollectionsKt__CollectionsJVMKt.listOf(new UiAvatar(null, GpsTagConstants.GPS_TAG_GPS_STATUS_VALUE_MEASUREMENT_IN_PROGRESS, null, null, null, null, null, 32765)), "Switch to Afterpay", "4 eligible transactions", new Tap.Url("//action", null)));
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new CardMessageQueries$$ExternalSyntheticLambda1(12);
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    AfterpayCardKt.AfterpayCardSection(null, afterpayCardSection2, true, (Function1) rememberedValue2, gapComposer2, 3456, 1);
                    gapComposer2.end(true);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    Colors colors3 = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                    } else {
                        gapComposer3.startReplaceGroup(-1762997739);
                        gapComposer3.end(false);
                    }
                    Modifier m298padding3ABfNKs3 = SpacerKt.m298padding3ABfNKs(ImageKt.m177backgroundbw27NRU(companion, colors3.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1), 16.0f);
                    ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer3, 0);
                    int hashCode3 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer3, m298padding3ABfNKs3);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer3.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer3.startReusableNode();
                    if (gapComposer3.inserting) {
                        gapComposer3.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer3.useNode();
                    }
                    Updater.m576setimpl(gapComposer3, columnMeasurePolicy3, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer3, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                    AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardSection afterpayCardSection3 = new AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardSection(null, AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardContent.ImageTextContent.copy$default(AfterpayHomeFixturesKt.afterpayCardContent, null, 29), new AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.CardFooter.TappableFooter(null, "Get up to $400 back", "With future eligible transactions", new Tap.Url("//action", null)));
                    Object rememberedValue3 = gapComposer3.rememberedValue();
                    if (rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new AfterpaySearchViewKt$$ExternalSyntheticLambda43(28);
                        gapComposer3.updateRememberedValue(rememberedValue3);
                    }
                    AfterpayCardKt.AfterpayCardSection(null, afterpayCardSection3, false, (Function1) rememberedValue3, gapComposer3, 3456, 1);
                    gapComposer3.end(true);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    Colors colors4 = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
                    if (colors4 == null) {
                        colors4 = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                    } else {
                        gapComposer4.startReplaceGroup(-1762997739);
                        gapComposer4.end(false);
                    }
                    Modifier m298padding3ABfNKs4 = SpacerKt.m298padding3ABfNKs(ImageKt.m177backgroundbw27NRU(companion, colors4.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1), 16.0f);
                    ColumnMeasurePolicy columnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer4, 0);
                    int hashCode4 = Long.hashCode(gapComposer4.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer4.currentCompositionLocalScope();
                    Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer4, m298padding3ABfNKs4);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$14 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer4.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer4.startReusableNode();
                    if (gapComposer4.inserting) {
                        gapComposer4.createNode(layoutNode$Companion$Constructor$14);
                    } else {
                        gapComposer4.useNode();
                    }
                    Updater.m576setimpl(gapComposer4, columnMeasurePolicy4, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer4, currentCompositionLocalScope4, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer4, Integer.valueOf(hashCode4), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer4, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer4, materializeModifier4, ComposeUiNode.Companion.SetModifier);
                    AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardSection afterpayCardSection4 = new AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardSection(new AfterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader("$200", "Available on Cash App Card", AfterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader.SectionDisplayEffect.DISABLED_EFFECT, 9), AfterpayHomeFixturesKt.createAfterpayCardContentWithCashCard$default(1), new AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.CardFooter.TappableFooter(null, "Activate your card", null, new Tap.Url("//action", null)));
                    Object rememberedValue4 = gapComposer4.rememberedValue();
                    if (rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new CardMessageQueries$$ExternalSyntheticLambda1(10);
                        gapComposer4.updateRememberedValue(rememberedValue4);
                    }
                    AfterpayCardKt.AfterpayCardSection(null, afterpayCardSection4, false, (Function1) rememberedValue4, gapComposer4, 3456, 1);
                    gapComposer4.end(true);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    Colors colors5 = (Colors) gapComposer5.consume(ArcadeThemeKt.LocalColors);
                    if (colors5 == null) {
                        colors5 = re$$ExternalSyntheticOutline0.m(gapComposer5, -1762997026, gapComposer5, false);
                    } else {
                        gapComposer5.startReplaceGroup(-1762997739);
                        gapComposer5.end(false);
                    }
                    Modifier m298padding3ABfNKs5 = SpacerKt.m298padding3ABfNKs(ImageKt.m177backgroundbw27NRU(companion, colors5.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1), 16.0f);
                    ColumnMeasurePolicy columnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer5, 0);
                    int hashCode5 = Long.hashCode(gapComposer5.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer5.currentCompositionLocalScope();
                    Modifier materializeModifier5 = PlatformKt.materializeModifier(gapComposer5, m298padding3ABfNKs5);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$15 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer5.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer5.startReusableNode();
                    if (gapComposer5.inserting) {
                        gapComposer5.createNode(layoutNode$Companion$Constructor$15);
                    } else {
                        gapComposer5.useNode();
                    }
                    Updater.m576setimpl(gapComposer5, columnMeasurePolicy5, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer5, currentCompositionLocalScope5, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer5, Integer.valueOf(hashCode5), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer5, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer5, materializeModifier5, ComposeUiNode.Companion.SetModifier);
                    AfterpayCardKt.AfterpayCardPreview(gapComposer5, 0);
                    gapComposer5.end(true);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    Colors colors6 = (Colors) gapComposer6.consume(ArcadeThemeKt.LocalColors);
                    if (colors6 == null) {
                        colors6 = re$$ExternalSyntheticOutline0.m(gapComposer6, -1762997026, gapComposer6, false);
                    } else {
                        gapComposer6.startReplaceGroup(-1762997739);
                        gapComposer6.end(false);
                    }
                    Modifier m298padding3ABfNKs6 = SpacerKt.m298padding3ABfNKs(ImageKt.m177backgroundbw27NRU(companion, colors6.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1), 16.0f);
                    ColumnMeasurePolicy columnMeasurePolicy6 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer6, 0);
                    int hashCode6 = Long.hashCode(gapComposer6.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope6 = gapComposer6.currentCompositionLocalScope();
                    Modifier materializeModifier6 = PlatformKt.materializeModifier(gapComposer6, m298padding3ABfNKs6);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$16 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer6.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer6.startReusableNode();
                    if (gapComposer6.inserting) {
                        gapComposer6.createNode(layoutNode$Companion$Constructor$16);
                    } else {
                        gapComposer6.useNode();
                    }
                    Updater.m576setimpl(gapComposer6, columnMeasurePolicy6, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer6, currentCompositionLocalScope6, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer6, Integer.valueOf(hashCode6), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer6, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer6, materializeModifier6, ComposeUiNode.Companion.SetModifier);
                    AfterpayCardKt.AfterpayCardPreview(gapComposer6, 0);
                    gapComposer6.end(true);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                    AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardContent.ImageTextContent imageTextContent = AfterpayHomeFixturesKt.afterpayCardContent;
                    Object rememberedValue5 = gapComposer7.rememberedValue();
                    if (rememberedValue5 == neverEqualPolicy) {
                        rememberedValue5 = new CardMessageQueries$$ExternalSyntheticLambda1(13);
                        gapComposer7.updateRememberedValue(rememberedValue5);
                    }
                    AfterpayCardKt.CardImageTextView(null, imageTextContent, (Function1) rememberedValue5, gapComposer7, MLKEMEngine.KyberPolyBytes);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                Composer composer8 = (Composer) obj;
                int intValue8 = ((Integer) obj2).intValue();
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 3) != 2)) {
                    CardThumbnailDisplayStyle cardThumbnailDisplayStyle = CardThumbnailDisplayStyle.STANDARD;
                    int i4 = 14;
                    AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardContent.ImageTextContent createAfterpayCardContentWithCashCard$default = AfterpayHomeFixturesKt.createAfterpayCardContentWithCashCard$default(14);
                    Object rememberedValue6 = gapComposer8.rememberedValue();
                    if (rememberedValue6 == neverEqualPolicy) {
                        rememberedValue6 = new CardMessageQueries$$ExternalSyntheticLambda1(i4);
                        gapComposer8.updateRememberedValue(rememberedValue6);
                    }
                    AfterpayCardKt.CardImageTextView(null, createAfterpayCardContentWithCashCard$default, (Function1) rememberedValue6, gapComposer8, MLKEMEngine.KyberPolyBytes);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                Composer composer9 = (Composer) obj;
                int intValue9 = ((Integer) obj2).intValue();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2)) {
                    Colors colors7 = (Colors) gapComposer9.consume(ArcadeThemeKt.LocalColors);
                    if (colors7 == null) {
                        colors7 = re$$ExternalSyntheticOutline0.m(gapComposer9, -1762997026, gapComposer9, false);
                    } else {
                        gapComposer9.startReplaceGroup(-1762997739);
                        gapComposer9.end(false);
                    }
                    Modifier m298padding3ABfNKs7 = SpacerKt.m298padding3ABfNKs(ImageKt.m177backgroundbw27NRU(companion, colors7.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1), 16.0f);
                    ColumnMeasurePolicy columnMeasurePolicy7 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer9, 0);
                    int hashCode7 = Long.hashCode(gapComposer9.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope7 = gapComposer9.currentCompositionLocalScope();
                    Modifier materializeModifier7 = PlatformKt.materializeModifier(gapComposer9, m298padding3ABfNKs7);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$17 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer9.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer9.startReusableNode();
                    if (gapComposer9.inserting) {
                        gapComposer9.createNode(layoutNode$Companion$Constructor$17);
                    } else {
                        gapComposer9.useNode();
                    }
                    Updater.m576setimpl(gapComposer9, columnMeasurePolicy7, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer9, currentCompositionLocalScope7, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer9, Integer.valueOf(hashCode7), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer9, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer9, materializeModifier7, ComposeUiNode.Companion.SetModifier);
                    AfterpayCardKt.AfterpayCard(null, AfterpayCardKt.lambda$1596512710, gapComposer9, 48, 1);
                    gapComposer9.end(true);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                Composer composer10 = (Composer) obj;
                int intValue10 = ((Integer) obj2).intValue();
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 3) != 2)) {
                    Colors colors8 = (Colors) gapComposer10.consume(ArcadeThemeKt.LocalColors);
                    if (colors8 == null) {
                        colors8 = re$$ExternalSyntheticOutline0.m(gapComposer10, -1762997026, gapComposer10, false);
                    } else {
                        gapComposer10.startReplaceGroup(-1762997739);
                        gapComposer10.end(false);
                    }
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(ImageKt.m177backgroundbw27NRU(companion, colors8.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1), RecyclerView.DECELERATION_RATE, 16.0f, 1);
                    ColumnMeasurePolicy columnMeasurePolicy8 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer10, 0);
                    int hashCode8 = Long.hashCode(gapComposer10.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope8 = gapComposer10.currentCompositionLocalScope();
                    Modifier materializeModifier8 = PlatformKt.materializeModifier(gapComposer10, m300paddingVpY3zN4$default);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$18 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer10.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer10.startReusableNode();
                    if (gapComposer10.inserting) {
                        gapComposer10.createNode(layoutNode$Companion$Constructor$18);
                    } else {
                        gapComposer10.useNode();
                    }
                    Updater.m576setimpl(gapComposer10, columnMeasurePolicy8, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer10, currentCompositionLocalScope8, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer10, Integer.valueOf(hashCode8), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer10, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer10, materializeModifier8, ComposeUiNode.Companion.SetModifier);
                    AbstractPersistentList abstractPersistentList = AfterpayCardFixtures.merchantCarouselTiles;
                    Object rememberedValue7 = gapComposer10.rememberedValue();
                    if (rememberedValue7 == neverEqualPolicy) {
                        rememberedValue7 = new CardMessageQueries$$ExternalSyntheticLambda1(15);
                        gapComposer10.updateRememberedValue(rememberedValue7);
                    }
                    AfterpayCardKt.TileCarouselContent(MLKEMEngine.KyberPolyBytes, gapComposer10, null, abstractPersistentList, (Function1) rememberedValue7);
                    gapComposer10.end(true);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                Composer composer11 = (Composer) obj;
                int intValue11 = ((Integer) obj2).intValue();
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 3) != 2)) {
                    Colors colors9 = (Colors) gapComposer11.consume(ArcadeThemeKt.LocalColors);
                    if (colors9 == null) {
                        colors9 = re$$ExternalSyntheticOutline0.m(gapComposer11, -1762997026, gapComposer11, false);
                    } else {
                        gapComposer11.startReplaceGroup(-1762997739);
                        gapComposer11.end(false);
                    }
                    Modifier m300paddingVpY3zN4$default2 = SpacerKt.m300paddingVpY3zN4$default(ImageKt.m177backgroundbw27NRU(companion, colors9.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1), RecyclerView.DECELERATION_RATE, 16.0f, 1);
                    ColumnMeasurePolicy columnMeasurePolicy9 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer11, 0);
                    int hashCode9 = Long.hashCode(gapComposer11.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope9 = gapComposer11.currentCompositionLocalScope();
                    Modifier materializeModifier9 = PlatformKt.materializeModifier(gapComposer11, m300paddingVpY3zN4$default2);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$19 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer11.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer11.startReusableNode();
                    if (gapComposer11.inserting) {
                        gapComposer11.createNode(layoutNode$Companion$Constructor$19);
                    } else {
                        gapComposer11.useNode();
                    }
                    Updater.m576setimpl(gapComposer11, columnMeasurePolicy9, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer11, currentCompositionLocalScope9, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer11, Integer.valueOf(hashCode9), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer11, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer11, materializeModifier9, ComposeUiNode.Companion.SetModifier);
                    AbstractPersistentList abstractPersistentList2 = AfterpayCardFixtures.merchantCarouselTilesNoDimmer;
                    Object rememberedValue8 = gapComposer11.rememberedValue();
                    if (rememberedValue8 == neverEqualPolicy) {
                        rememberedValue8 = new CardMessageQueries$$ExternalSyntheticLambda1(i2);
                        gapComposer11.updateRememberedValue(rememberedValue8);
                    }
                    AfterpayCardKt.TileCarouselContent(MLKEMEngine.KyberPolyBytes, gapComposer11, null, abstractPersistentList2, (Function1) rememberedValue8);
                    gapComposer11.end(true);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                FeatureFlag$ControlTreatmentAmplitudeExperiment$Options featureFlag$ControlTreatmentAmplitudeExperiment$Options = (FeatureFlag$ControlTreatmentAmplitudeExperiment$Options) obj;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                featureFlag$ControlTreatmentAmplitudeExperiment$Options.getClass();
                return (!featureFlag$ControlTreatmentAmplitudeExperiment$Options.enabled() || booleanValue) ? AppletAvailabilityState.UNAVAILABLE : AppletAvailabilityState.AVAILABLE;
            case 13:
                Composer composer12 = (Composer) obj;
                int intValue12 = ((Integer) obj2).intValue();
                GapComposer gapComposer12 = (GapComposer) composer12;
                if (!gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 3) != 2)) {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                Composer composer13 = (Composer) obj;
                int intValue13 = ((Integer) obj2).intValue();
                GapComposer gapComposer13 = (GapComposer) composer13;
                if (gapComposer13.shouldExecute(intValue13 & 1, (intValue13 & 3) != 2)) {
                    Icons icons = Icons.Push24;
                    Colors colors10 = (Colors) gapComposer13.consume(ArcadeThemeKt.LocalColors);
                    if (colors10 == null) {
                        colors10 = re$$ExternalSyntheticOutline0.m(gapComposer13, -1762997026, gapComposer13, false);
                    } else {
                        gapComposer13.startReplaceGroup(-1762997739);
                        gapComposer13.end(false);
                    }
                    Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, colors10.component.cell.controls.icon.f174default, gapComposer13, 54, 4);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                Composer composer14 = (Composer) obj;
                int intValue14 = ((Integer) obj2).intValue();
                GapComposer gapComposer14 = (GapComposer) composer14;
                if (gapComposer14.shouldExecute(intValue14 & 1, (intValue14 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 6, 0, 4094, 0L, (Composer) gapComposer14, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, "+ $50", (Map) null, (Function1) null, false);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 16:
                Composer composer15 = (Composer) obj;
                int intValue15 = ((Integer) obj2).intValue();
                GapComposer gapComposer15 = (GapComposer) composer15;
                if (gapComposer15.shouldExecute(intValue15 & 1, (intValue15 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 6, 0, 4094, 0L, (Composer) gapComposer15, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, "$83.81", (Map) null, (Function1) null, false);
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                Composer composer16 = (Composer) obj;
                int intValue16 = ((Integer) obj2).intValue();
                GapComposer gapComposer16 = (GapComposer) composer16;
                if (gapComposer16.shouldExecute(intValue16 & 1, (intValue16 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 6, 0, 4094, 0L, (Composer) gapComposer16, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, "+ $50", (Map) null, (Function1) null, false);
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                Composer composer17 = (Composer) obj;
                int intValue17 = ((Integer) obj2).intValue();
                GapComposer gapComposer17 = (GapComposer) composer17;
                if (gapComposer17.shouldExecute(intValue17 & 1, (intValue17 & 3) != 2)) {
                    Trace.m1191Iconww6aTOc(Icons.Expand24, (String) null, (Modifier) null, 0L, gapComposer17, 54, 12);
                } else {
                    gapComposer17.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                Composer composer18 = (Composer) obj;
                int intValue18 = ((Integer) obj2).intValue();
                GapComposer gapComposer18 = (GapComposer) composer18;
                if (gapComposer18.shouldExecute(intValue18 & 1, (intValue18 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer18, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer18, R.string.balance_home_banking_details_placeholder), (Map) null, (Function1) null, false);
                } else {
                    gapComposer18.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                Composer composer19 = (Composer) obj;
                int intValue19 = ((Integer) obj2).intValue();
                GapComposer gapComposer19 = (GapComposer) composer19;
                if (gapComposer19.shouldExecute(intValue19 & 1, (intValue19 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer19, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer19, R.string.balance_home_banking_details_placeholder), (Map) null, (Function1) null, false);
                } else {
                    gapComposer19.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                Composer composer20 = (Composer) obj;
                int intValue20 = ((Integer) obj2).intValue();
                GapComposer gapComposer20 = (GapComposer) composer20;
                if (gapComposer20.shouldExecute(intValue20 & 1, (intValue20 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer20, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer20, R.string.overdraft_manage_row_title), (Map) null, (Function1) null, false);
                } else {
                    gapComposer20.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 22:
                Composer composer21 = (Composer) obj;
                int intValue21 = ((Integer) obj2).intValue();
                GapComposer gapComposer21 = (GapComposer) composer21;
                if (gapComposer21.shouldExecute(intValue21 & 1, (intValue21 & 3) != 2)) {
                    Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                    BalanceHomeViewModel.Loaded loaded = BalanceHomeViewKt.PREVIEW_MODEL;
                    Object rememberedValue9 = gapComposer21.rememberedValue();
                    if (rememberedValue9 == neverEqualPolicy) {
                        rememberedValue9 = new AvatarsKt$$ExternalSyntheticLambda2(27);
                        gapComposer21.updateRememberedValue(rememberedValue9);
                    }
                    BalanceHomeViewKt.BalanceHome(loaded, (Function1) rememberedValue9, fillMaxSize, null, gapComposer21, 432, 8);
                } else {
                    gapComposer21.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 23:
                Composer composer22 = (Composer) obj;
                int intValue22 = ((Integer) obj2).intValue();
                GapComposer gapComposer22 = (GapComposer) composer22;
                if (gapComposer22.shouldExecute(intValue22 & 1, (intValue22 & 3) != 2)) {
                    AvatarSize avatarSize = AvatarSize.Size64;
                    Colors colors11 = (Colors) gapComposer22.consume(ArcadeThemeKt.LocalColors);
                    if (colors11 == null) {
                        colors11 = re$$ExternalSyntheticOutline0.m(gapComposer22, -1762997026, gapComposer22, false);
                    } else {
                        gapComposer22.startReplaceGroup(-1762997739);
                        gapComposer22.end(false);
                    }
                    TextViewKt.m3613AvatarB_rZmmc(avatarSize, "", colors11.semantic.background.danger, (String) null, (Modifier) null, (AvatarImage) new AvatarImage.LocalIcon(Icons.Alert32, 0L, 6), (Function2) null, (AvatarOverlay) null, false, 0L, (Composer) gapComposer22, 199734, 0, 2000);
                } else {
                    gapComposer22.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 24:
                Composer composer23 = (Composer) obj;
                int intValue23 = ((Integer) obj2).intValue();
                GapComposer gapComposer23 = (GapComposer) composer23;
                if (gapComposer23.shouldExecute(intValue23 & 1, (intValue23 & 3) != 2)) {
                    Icons icons2 = Icons.AlertReportedFill24;
                    Colors colors12 = (Colors) gapComposer23.consume(ArcadeThemeKt.LocalColors);
                    if (colors12 == null) {
                        colors12 = re$$ExternalSyntheticOutline0.m(gapComposer23, -1762997026, gapComposer23, false);
                    } else {
                        gapComposer23.startReplaceGroup(-1762997739);
                        gapComposer23.end(false);
                    }
                    Trace.m1191Iconww6aTOc(icons2, (String) null, (Modifier) null, colors12.semantic.text.warning, gapComposer23, 54, 4);
                } else {
                    gapComposer23.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 25:
                Composer composer24 = (Composer) obj;
                int intValue24 = ((Integer) obj2).intValue();
                GapComposer gapComposer24 = (GapComposer) composer24;
                if (gapComposer24.shouldExecute(intValue24 & 1, (intValue24 & 3) != 2)) {
                    Icons icons3 = Icons.AlertReportedFill24;
                    Colors colors13 = (Colors) gapComposer24.consume(ArcadeThemeKt.LocalColors);
                    if (colors13 == null) {
                        colors13 = re$$ExternalSyntheticOutline0.m(gapComposer24, -1762997026, gapComposer24, false);
                    } else {
                        gapComposer24.startReplaceGroup(-1762997739);
                        gapComposer24.end(false);
                    }
                    Trace.m1191Iconww6aTOc(icons3, (String) null, (Modifier) null, colors13.semantic.text.warning, gapComposer24, 54, 4);
                } else {
                    gapComposer24.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 26:
                Composer composer25 = (Composer) obj;
                int intValue25 = ((Integer) obj2).intValue();
                GapComposer gapComposer25 = (GapComposer) composer25;
                if (gapComposer25.shouldExecute(intValue25 & 1, (intValue25 & 3) != 2)) {
                    Trace.m1191Iconww6aTOc(Icons.DiscountMinimum24, (String) null, (Modifier) null, 0L, gapComposer25, 54, 12);
                } else {
                    gapComposer25.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 27:
                Composer composer26 = (Composer) obj;
                int intValue26 = ((Integer) obj2).intValue();
                GapComposer gapComposer26 = (GapComposer) composer26;
                if (gapComposer26.shouldExecute(intValue26 & 1, (intValue26 & 3) != 2)) {
                    Trace.m1191Iconww6aTOc(Icons.Date24, (String) null, (Modifier) null, 0L, gapComposer26, 54, 12);
                } else {
                    gapComposer26.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 28:
                return invoke$com$squareup$cash$banking$views$ComposableSingletons$TransfersViewKt$$ExternalSyntheticLambda0(obj, obj2);
            default:
                Composer composer27 = (Composer) obj;
                int intValue27 = ((Integer) obj2).intValue();
                GapComposer gapComposer27 = (GapComposer) composer27;
                if (gapComposer27.shouldExecute(intValue27 & 1, (intValue27 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3838, 0L, (Composer) gapComposer27, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer27, R.string.wire_transfer_section_title), (Map) null, (Function1) null, false);
                } else {
                    gapComposer27.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ BenefitsLeafletViewKt$$ExternalSyntheticLambda5(byte b, int i) {
        this.$r8$classId = i;
    }
}
