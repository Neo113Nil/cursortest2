package com.squareup.cash.money.booklet;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.squareup.cash.advertising.views.FullscreenAdViewKt;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.moneybot.widgets.UtilsKt$$ExternalSyntheticLambda0;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import retrofit2.DefaultMethodSupport;
import squareup.cash.earnings.EarningTool;
import squareup.cash.earnings.EarningsHomeUi;
import squareup.cash.earnings.EarningsTimeFrame;

/* loaded from: classes6.dex */
public final /* synthetic */ class MoneyTabBookletKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 2;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ MoneyTabBookletViewModel f$1;

    public /* synthetic */ MoneyTabBookletKt$$ExternalSyntheticLambda0(MoneyTabBookletViewModel moneyTabBookletViewModel, Function1 function1) {
        this.f$1 = moneyTabBookletViewModel;
        this.f$0 = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [boolean, int] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ?? r9;
        int i = this.$r8$classId;
        Function1 function1 = this.f$0;
        MoneyTabBookletViewModel moneyTabBookletViewModel = this.f$1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                boolean shouldExecute = gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2);
                Applier applier = gapComposer.applier;
                if (shouldExecute) {
                    Modifier fillMaxSize = SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f);
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    Modifier systemBarsPadding = SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape));
                    Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
                    BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, systemBarsPadding);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf = Integer.valueOf(hashCode);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
                    NavigationType navigationType = NavigationType.CLOSE;
                    boolean changed = gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    Object obj3 = Composer.Companion.Empty;
                    if (changed || rememberedValue == obj3) {
                        rememberedValue = new CashMapViewKt$$ExternalSyntheticLambda4(23, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    DBUtil.TitleBarSub((String) null, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer, 54, 108);
                    Modifier verticalScroll$default = ImageKt.verticalScroll$default(new LayoutWeightElement(1.0f, true), ImageKt.rememberScrollState(gapComposer), false, 14);
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
                    int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, verticalScroll$default);
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    gapComposer.startReplaceGroup(610126716);
                    int i2 = 0;
                    for (Object obj4 : moneyTabBookletViewModel.sections) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                            throw null;
                        }
                        MoneyTabBookletSection moneyTabBookletSection = (MoneyTabBookletSection) obj4;
                        if (i2 > 0) {
                            gapComposer.startReplaceGroup(-1726881008);
                            r9 = 0;
                            MoneyTabBookletKt.SpacerBetweenSections((MoneyTabBookletSection) moneyTabBookletViewModel.sections.get(i2 - 1), moneyTabBookletSection, gapComposer, 0);
                            gapComposer.end(false);
                        } else {
                            r9 = 0;
                            gapComposer.startReplaceGroup(-1726784908);
                            gapComposer.end(false);
                        }
                        if (moneyTabBookletSection instanceof CardSection) {
                            gapComposer.startReplaceGroup(1052677834);
                            DefaultMethodSupport.CardSection((CardSection) moneyTabBookletSection, gapComposer, r9);
                            gapComposer.end(r9);
                        } else if (moneyTabBookletSection instanceof CollapsibleDetailsSection) {
                            gapComposer.startReplaceGroup(1052680184);
                            FullscreenAdViewKt.CollapsibleDetailsSection((CollapsibleDetailsSection) moneyTabBookletSection, null, gapComposer, r9);
                            gapComposer.end(r9);
                        } else if (moneyTabBookletSection instanceof DisclosureSection) {
                            gapComposer.startReplaceGroup(1052683258);
                            DisclosureSection disclosureSection = (DisclosureSection) moneyTabBookletSection;
                            boolean changed2 = gapComposer.changed(function1);
                            Object rememberedValue2 = gapComposer.rememberedValue();
                            if (changed2 || rememberedValue2 == obj3) {
                                rememberedValue2 = new UtilsKt$$ExternalSyntheticLambda0(12, function1);
                                gapComposer.updateRememberedValue(rememberedValue2);
                            }
                            DisclosureSectionKt.DisclosureSection(disclosureSection, (Function1) rememberedValue2, gapComposer, 0);
                            gapComposer.end(false);
                        } else if (moneyTabBookletSection instanceof HeaderSection) {
                            gapComposer.startReplaceGroup(1052688684);
                            HeaderSectionKt.HeaderSection((HeaderSection) moneyTabBookletSection, gapComposer, 0);
                            gapComposer.end(false);
                        } else if (moneyTabBookletSection instanceof HeroSection) {
                            gapComposer.startReplaceGroup(1052690634);
                            EarningTool.Tool.HeroSection((HeroSection) moneyTabBookletSection, gapComposer, 0);
                            gapComposer.end(false);
                        } else if (moneyTabBookletSection instanceof ListUnorderedSection) {
                            gapComposer.startReplaceGroup(1052692819);
                            EarningsTimeFrame.TimeFrame.ListUnorderedSection((ListUnorderedSection) moneyTabBookletSection, gapComposer, 0);
                            gapComposer.end(false);
                        } else {
                            if (!(moneyTabBookletSection instanceof ListUnorderedCardSection)) {
                                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1052676951, false);
                            }
                            gapComposer.startReplaceGroup(1052695415);
                            EarningsHomeUi.Section.AbstractC0087Section.ListUnorderedCardSection((ListUnorderedCardSection) moneyTabBookletSection, gapComposer, 0);
                            gapComposer.end(false);
                        }
                        i2 = i3;
                    }
                    gapComposer.end(false);
                    DBUtil.SpacerBetweenSectionXLarge(0, 1, gapComposer, null);
                    gapComposer.end(true);
                    DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(1422796113, new MoneyTabBookletKt$$ExternalSyntheticLambda4(0, function1, moneyTabBookletViewModel), gapComposer), gapComposer, 24576, 15);
                    gapComposer.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                MoneyTabBookletKt.MoneyTabBooklet(moneyTabBookletViewModel, function1, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            default:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                    MoneyTabBookletKt.MoneyTabBooklet(moneyTabBookletViewModel, function1, gapComposer2, 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ MoneyTabBookletKt$$ExternalSyntheticLambda0(MoneyTabBookletViewModel moneyTabBookletViewModel, Function1 function1, int i) {
        this.f$1 = moneyTabBookletViewModel;
        this.f$0 = function1;
    }

    public /* synthetic */ MoneyTabBookletKt$$ExternalSyntheticLambda0(Function1 function1, MoneyTabBookletViewModel moneyTabBookletViewModel) {
        this.f$0 = function1;
        this.f$1 = moneyTabBookletViewModel;
    }
}
