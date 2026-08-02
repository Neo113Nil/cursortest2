package com.mikepenz.markdown.compose;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.IconButtonKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.mikepenz.markdown.compose.components.DefaultMarkdownComponents;
import com.mikepenz.markdown.compose.components.MarkdownComponentModel;
import com.mikepenz.markdown.model.DefaultMarkdownPadding;
import com.mikepenz.markdown.model.DefaultMarkdownTypography;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.formview.components.FormView$$ExternalSyntheticLambda0;
import com.squareup.cash.globalsearch.views.QuickAccessBarKt$$ExternalSyntheticLambda1;
import com.squareup.cash.history.views.SkipPaymentView$$ExternalSyntheticLambda1;
import com.squareup.cash.investing.components.news.InvestingNewsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.investing.viewmodels.drip.DividendReinvestmentLearnMoreSheetViewModel;
import com.squareup.util.Strings;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.intellij.markdown.MarkdownElementType;
import org.intellij.markdown.MarkdownTokenTypes;
import org.intellij.markdown.ast.ASTNodeImpl;
import org.intellij.markdown.flavours.gfm.GFMElementTypes;

/* loaded from: classes9.dex */
public abstract class MarkdownExtensionKt {
    public static final void DividendReinvestmentLearnMore(DividendReinvestmentLearnMoreSheetViewModel dividendReinvestmentLearnMoreSheetViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        dividendReinvestmentLearnMoreSheetViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1863322269);
        int i2 = i | (gapComposer.changedInstance(dividendReinvestmentLearnMoreSheetViewModel) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changed(modifier) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(ImageKt.verticalScroll$default(SizeKt.fillMaxWidth(modifier, 1.0f), ImageKt.rememberScrollState(gapComposer), false, 14), 16.0f, 16.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m299paddingVpY3zN4);
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
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 32.0f, 7);
            Modifier.Companion companion2 = companion;
            String str = dividendReinvestmentLearnMoreSheetViewModel.title;
            TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).header;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, colors.semantic.text.standard, (Composer) gapComposer, m302paddingqDBjuR0$default, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            gapComposer = gapComposer;
            gapComposer.startReplaceGroup(12124655);
            Iterator it = dividendReinvestmentLearnMoreSheetViewModel.infoSections.iterator();
            while (it.hasNext()) {
                Modifier.Companion companion3 = companion2;
                DividendReinvestmentLearnMoreInfoSection(SpacerKt.m302paddingqDBjuR0$default(companion3, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 32.0f, 7), (DividendReinvestmentLearnMoreSheetViewModel.InfoSection) it.next(), gapComposer, 6);
                companion2 = companion3;
            }
            Modifier.Companion companion4 = companion2;
            gapComposer.end(false);
            SpacerKt.Spacer(gapComposer, SpacerKt.m302paddingqDBjuR0$default(companion4, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, 7));
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion4, 1.0f);
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new InvestingNewsKt$$ExternalSyntheticLambda0(13, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, fillMaxWidth, null, false, false, null, Expect_jvmKt.rememberComposableLambda(1644463906, new FormView$$ExternalSyntheticLambda0(dividendReinvestmentLearnMoreSheetViewModel, 24), gapComposer), gapComposer, 1572912, 60);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new QuickAccessBarKt$$ExternalSyntheticLambda1(dividendReinvestmentLearnMoreSheetViewModel, function1, modifier, i, 23);
        }
    }

    public static final void DividendReinvestmentLearnMoreInfoSection(Modifier modifier, DividendReinvestmentLearnMoreSheetViewModel.InfoSection infoSection, Composer composer, int i) {
        infoSection.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-441898969);
        Applier applier = gapComposer.applier;
        int i2 = (gapComposer.changed(infoSection) ? 32 : 16) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Trace.m1191Iconww6aTOc(Icons.BulletGeneric24, (String) null, SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 12.0f, RecyclerView.DECELERATION_RATE, 11), 0L, gapComposer, 438, 8);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, companion);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 2.0f, 7);
            String str = infoSection.title;
            TextStyle textStyle = Strings.getTypography(gapComposer).labelMedium;
            long j = Strings.getColors(gapComposer).semantic.text.standard;
            gapComposer = gapComposer;
            Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, j, (Composer) gapComposer, m302paddingqDBjuR0$default, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodySmall, (TextLineBalancing) null, infoSection.description, (Map) null, (Function1) null, false);
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SkipPaymentView$$ExternalSyntheticLambda1(modifier, infoSection, i, 26);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MarkdownElement(ASTNodeImpl aSTNodeImpl, DefaultMarkdownComponents defaultMarkdownComponents, String str, boolean z, Composer composer, int i, int i2) {
        int i3;
        boolean z2;
        int i4;
        boolean z3;
        RecomposeScopeImpl endRestartGroup;
        DefaultMarkdownComponents defaultMarkdownComponents2 = defaultMarkdownComponents;
        String str2 = str;
        aSTNodeImpl.getClass();
        defaultMarkdownComponents2.getClass();
        str2.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1830284224);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changed(aSTNodeImpl) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changed(defaultMarkdownComponents2) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changed(str2) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            z2 = z;
            i3 |= gapComposer.changed(z2) ? 2048 : 1024;
            i4 = i3;
            if (gapComposer.shouldExecute(i4 & 1, (i4 & 1171) == 1170)) {
                gapComposer.skipToGroupEnd();
                z3 = z2;
            } else {
                boolean z4 = i5 != 0 ? true : z2;
                DefaultMarkdownTypography defaultMarkdownTypography = (DefaultMarkdownTypography) gapComposer.consume(ComposeLocalKt.LocalMarkdownTypography);
                boolean changed = ((i4 & 14) == 4) | ((i4 & 896) == 256) | gapComposer.changed(defaultMarkdownTypography);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new MarkdownComponentModel(str2, aSTNodeImpl, defaultMarkdownTypography);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                MarkdownComponentModel markdownComponentModel = (MarkdownComponentModel) rememberedValue;
                if (z4) {
                    gapComposer.startReplaceGroup(-2033438277);
                    re$$ExternalSyntheticOutline0.m(Modifier.Companion.$$INSTANCE, ((DefaultMarkdownPadding) gapComposer.consume(ComposeLocalKt.LocalMarkdownPadding)).block, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(1387979554);
                    gapComposer.end(false);
                }
                MarkdownElementType markdownElementType = aSTNodeImpl.f1630type;
                if (Intrinsics.areEqual(markdownElementType, MarkdownTokenTypes.TEXT)) {
                    gapComposer.startReplaceGroup(-2033434805);
                    defaultMarkdownComponents2.text.invoke(markdownComponentModel, gapComposer, 0);
                    gapComposer.end(false);
                } else if (Intrinsics.areEqual(markdownElementType, MarkdownTokenTypes.EOL)) {
                    gapComposer.startReplaceGroup(-2033433590);
                    defaultMarkdownComponents2.eol.invoke(markdownComponentModel, gapComposer, 0);
                    gapComposer.end(false);
                } else if (Intrinsics.areEqual(markdownElementType, MarkdownTokenTypes.CODE_FENCE)) {
                    gapComposer.startReplaceGroup(-2033432176);
                    defaultMarkdownComponents2.codeFence.invoke(markdownComponentModel, gapComposer, 0);
                    gapComposer.end(false);
                } else if (Intrinsics.areEqual(markdownElementType, MarkdownTokenTypes.CODE_BLOCK)) {
                    gapComposer.startReplaceGroup(-2033430576);
                    defaultMarkdownComponents2.codeBlock.invoke(markdownComponentModel, gapComposer, 0);
                    gapComposer.end(false);
                } else if (Intrinsics.areEqual(markdownElementType, MarkdownTokenTypes.ATX_1)) {
                    gapComposer.startReplaceGroup(-2033429137);
                    defaultMarkdownComponents2.heading1.invoke(markdownComponentModel, gapComposer, 0);
                    gapComposer.end(false);
                } else if (Intrinsics.areEqual(markdownElementType, MarkdownTokenTypes.ATX_2)) {
                    gapComposer.startReplaceGroup(-2033427729);
                    defaultMarkdownComponents2.heading2.invoke(markdownComponentModel, gapComposer, 0);
                    gapComposer.end(false);
                } else if (Intrinsics.areEqual(markdownElementType, MarkdownTokenTypes.ATX_3)) {
                    gapComposer.startReplaceGroup(-2033426321);
                    defaultMarkdownComponents2.heading3.invoke(markdownComponentModel, gapComposer, 0);
                    gapComposer.end(false);
                } else if (Intrinsics.areEqual(markdownElementType, MarkdownTokenTypes.ATX_4)) {
                    gapComposer.startReplaceGroup(-2033424913);
                    defaultMarkdownComponents2.heading4.invoke(markdownComponentModel, gapComposer, 0);
                    gapComposer.end(false);
                } else if (Intrinsics.areEqual(markdownElementType, MarkdownTokenTypes.ATX_5)) {
                    gapComposer.startReplaceGroup(-2033423505);
                    defaultMarkdownComponents2.heading5.invoke(markdownComponentModel, gapComposer, 0);
                    gapComposer.end(false);
                } else if (Intrinsics.areEqual(markdownElementType, MarkdownTokenTypes.ATX_6)) {
                    gapComposer.startReplaceGroup(-2033422097);
                    defaultMarkdownComponents2.heading6.invoke(markdownComponentModel, gapComposer, 0);
                    gapComposer.end(false);
                } else if (Intrinsics.areEqual(markdownElementType, MarkdownTokenTypes.SETEXT_1$1)) {
                    gapComposer.startReplaceGroup(-2033420587);
                    defaultMarkdownComponents2.setextHeading1.invoke(markdownComponentModel, gapComposer, 0);
                    gapComposer.end(false);
                } else if (Intrinsics.areEqual(markdownElementType, MarkdownTokenTypes.SETEXT_2$1)) {
                    gapComposer.startReplaceGroup(-2033418891);
                    defaultMarkdownComponents2.setextHeading2.invoke(markdownComponentModel, gapComposer, 0);
                    gapComposer.end(false);
                } else if (Intrinsics.areEqual(markdownElementType, MarkdownTokenTypes.BLOCK_QUOTE$1)) {
                    gapComposer.startReplaceGroup(-2033417103);
                    defaultMarkdownComponents2.blockQuote.invoke(markdownComponentModel, gapComposer, 0);
                    gapComposer.end(false);
                } else if (Intrinsics.areEqual(markdownElementType, MarkdownTokenTypes.PARAGRAPH)) {
                    gapComposer.startReplaceGroup(-2033415504);
                    defaultMarkdownComponents2.paragraph.invoke(markdownComponentModel, gapComposer, 0);
                    gapComposer.end(false);
                } else if (Intrinsics.areEqual(markdownElementType, MarkdownTokenTypes.ORDERED_LIST)) {
                    gapComposer.startReplaceGroup(-2033413838);
                    defaultMarkdownComponents2.orderedList.invoke(markdownComponentModel, gapComposer, 0);
                    gapComposer.end(false);
                } else if (Intrinsics.areEqual(markdownElementType, MarkdownTokenTypes.UNORDERED_LIST)) {
                    gapComposer.startReplaceGroup(-2033412044);
                    defaultMarkdownComponents2.unorderedList.invoke(markdownComponentModel, gapComposer, 0);
                    gapComposer.end(false);
                } else if (Intrinsics.areEqual(markdownElementType, MarkdownTokenTypes.IMAGE)) {
                    gapComposer.startReplaceGroup(-2033410484);
                    defaultMarkdownComponents2.image.invoke(markdownComponentModel, gapComposer, 0);
                    gapComposer.end(false);
                } else if (Intrinsics.areEqual(markdownElementType, MarkdownTokenTypes.HORIZONTAL_RULE)) {
                    gapComposer.startReplaceGroup(-2033408843);
                    defaultMarkdownComponents2.horizontalRule.invoke(markdownComponentModel, gapComposer, 0);
                    gapComposer.end(false);
                } else if (Intrinsics.areEqual(markdownElementType, GFMElementTypes.TABLE)) {
                    gapComposer.startReplaceGroup(-2033407252);
                    defaultMarkdownComponents2.table.invoke(markdownComponentModel, gapComposer, 0);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(1388915661);
                    gapComposer.startReplaceGroup(1388956425);
                    gapComposer.end(false);
                    gapComposer.end(false);
                    gapComposer.startReplaceGroup(1389027137);
                    Iterator it = aSTNodeImpl.getChildren().iterator();
                    while (it.hasNext()) {
                        MarkdownElement((ASTNodeImpl) it.next(), defaultMarkdownComponents2, str2, z4, gapComposer, i4 & 8176, 0);
                        defaultMarkdownComponents2 = defaultMarkdownComponents;
                        str2 = str;
                    }
                    gapComposer.end(false);
                    z3 = z4;
                }
                gapComposer.startReplaceGroup(1389151106);
                gapComposer.end(false);
                z3 = z4;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new IconButtonKt$$ExternalSyntheticLambda0(aSTNodeImpl, defaultMarkdownComponents, str, z3, i, i2, 7);
                return;
            }
            return;
        }
        z2 = z;
        i4 = i3;
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 1171) == 1170)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
