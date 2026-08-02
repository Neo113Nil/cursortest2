package com.squareup.cash.borrow.views;

import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.FloatingActionButtonKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda17;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.borrow.viewmodels.BorrowLimitHubViewModel;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.protos.cash.ui.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public abstract class LimitHubProgressSectionKt {
    static {
        new Color(new Color.ModeVariant("#FF3399FF", null, null, null, null, 30, null), (Color.ModeVariant) null, 6);
    }

    public static final void HorizontalProgressBar(int i, Composer composer, Modifier modifier, List list) {
        long j;
        list.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1188962076);
        int i2 = i | 6 | (gapComposer.changedInstance(list) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            gapComposer.startReplaceGroup(-131249975);
            List list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                androidx.compose.ui.graphics.Color forTheme = ThemablesKt.forTheme(((BorrowLimitHubViewModel.ProgressBarSegment) it.next()).color, gapComposer);
                if (forTheme == null) {
                    gapComposer.startReplaceGroup(-1171368206);
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    j = colors.semantic.icon.brand;
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(-1171369942);
                    gapComposer.end(false);
                    j = forTheme.value;
                }
                arrayList.add(new androidx.compose.ui.graphics.Color(j));
            }
            gapComposer.end(false);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier clip = ClipKt.clip(SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), 16.0f), RoundedCornerShapeKt.RoundedCornerShape(50));
            Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors2 == null) {
                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(clip, colors2.semantic.background.subtle, ColorKt.RectangleShape);
            boolean changedInstance = gapComposer.changedInstance(list) | gapComposer.changedInstance(arrayList);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BorrowHomeKt$$ExternalSyntheticLambda1(3, list, arrayList);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            CanvasKt.Canvas(0, gapComposer, m177backgroundbw27NRU, (Function1) rememberedValue);
            modifier = companion;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeGeoViewKt$$ExternalSyntheticLambda17(modifier, list, i, 6);
        }
    }

    /* renamed from: LabeledTextStack-Y0xEhic, reason: not valid java name */
    public static final void m3427LabeledTextStackY0xEhic(String str, String str2, long j, long j2, BiasAlignment.Horizontal horizontal, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(949507712);
        int i2 = i | (gapComposer2.changed(str) ? 4 : 2) | (gapComposer2.changed(str2) ? 32 : 16) | (gapComposer2.changed(j) ? 256 : 128) | (gapComposer2.changed(j2) ? 2048 : 1024) | (gapComposer2.changed(modifier) ? PKIFailureInfo.unsupportedVersion : 65536);
        if (gapComposer2.shouldExecute(i2 & 1, (74899 & i2) != 74898)) {
            int i3 = 5;
            if (!horizontal.equals(Alignment.Companion.Start)) {
                if (horizontal.equals(Alignment.Companion.CenterHorizontally)) {
                    i3 = 3;
                } else if (horizontal.equals(Alignment.Companion.End)) {
                    i3 = 6;
                }
            }
            Object rememberedValue = gapComposer2.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new LoanDetailsSheetKt$$ExternalSyntheticLambda3(12);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            Modifier semantics = SemanticsModifierKt.semantics(modifier, true, (Function1) rememberedValue);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, horizontal, gapComposer2, 48);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, semantics);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer2.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalTypography;
            int i4 = i3;
            Room.m1165Text25TpFw(0, 0, 0, i4, ((i2 << 3) & 7168) | (i2 & 14), 0, 3826, j, (Composer) gapComposer2, (Modifier) null, ((Typography) gapComposer2.consume(staticProvidableCompositionLocal)).bodySmall, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            gapComposer = gapComposer2;
            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(Modifier.Companion.$$INSTANCE, 4.0f));
            Room.m1165Text25TpFw(0, 0, 0, i4, ((i2 >> 3) & 14) | (i2 & 7168), 0, 3826, j2, (Composer) gapComposer2, (Modifier) null, ((Typography) gapComposer.consume(staticProvidableCompositionLocal)).header, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FloatingActionButtonKt$$ExternalSyntheticLambda0(str, str2, j, j2, horizontal, modifier, i);
        }
    }

    public static final void LimitHubProgressSection(BorrowLimitHubViewModel.Section.ProgressBarSectionModel progressBarSectionModel, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1845238410);
        int i2 = (gapComposer.changedInstance(progressBarSectionModel) ? 4 : 2) | i | (gapComposer.changed(modifier) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
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
            ProgressBarLabels(progressBarSectionModel.leadingTextStack, progressBarSectionModel.trailingTextStack, gapComposer, 0);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            HorizontalProgressBar(0, gapComposer, null, progressBarSectionModel.segments);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BulletinTileKt$$ExternalSyntheticLambda2(progressBarSectionModel, modifier, i, 7);
        }
    }

    public static final void ProgressBarLabels(BorrowLimitHubViewModel.TextStack textStack, BorrowLimitHubViewModel.TextStack textStack2, Composer composer, int i) {
        androidx.compose.ui.graphics.Color m;
        String str;
        long j;
        androidx.compose.ui.graphics.Color m2;
        long j2;
        RowScopeInstance rowScopeInstance;
        float f;
        androidx.compose.ui.graphics.Color m3;
        int i2;
        int i3;
        long j3;
        long j4;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1769278846);
        int i4 = (gapComposer.changedInstance(textStack) ? 4 : 2) | i | (gapComposer.changedInstance(textStack2) ? 32 : 16);
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.SpaceBetween, Alignment.Companion.CenterVertically, gapComposer, 54);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            androidx.compose.ui.graphics.Color color = null;
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            if (textStack == null) {
                gapComposer.startReplaceGroup(2127921107);
                gapComposer.end(false);
                f = 1.0f;
                rowScopeInstance = rowScopeInstance2;
            } else {
                gapComposer.startReplaceGroup(2127921108);
                Modifier weight = rowScopeInstance2.weight(1.0f, companion, true);
                String str2 = textStack.labelText;
                String str3 = textStack.valueText;
                Color color2 = textStack.labelColor;
                if (color2 == null) {
                    gapComposer.startReplaceGroup(939531231);
                    gapComposer.end(false);
                    m = null;
                } else {
                    m = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer, -1078071198, color2, gapComposer, false);
                }
                if (m == null) {
                    gapComposer.startReplaceGroup(-1078069698);
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    str = str3;
                    j = colors.semantic.text.subtle;
                    gapComposer.end(false);
                } else {
                    str = str3;
                    gapComposer.startReplaceGroup(-1078071775);
                    gapComposer.end(false);
                    j = m.value;
                }
                Color color3 = textStack.valueColor;
                if (color3 == null) {
                    gapComposer.startReplaceGroup(939626463);
                    gapComposer.end(false);
                    m2 = null;
                } else {
                    m2 = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer, -1078068126, color3, gapComposer, false);
                }
                if (m2 == null) {
                    gapComposer.startReplaceGroup(-1078066623);
                    Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    j2 = colors2.semantic.text.prominent;
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(-1078068700);
                    gapComposer.end(false);
                    j2 = m2.value;
                }
                rowScopeInstance = rowScopeInstance2;
                f = 1.0f;
                m3427LabeledTextStackY0xEhic(str2, str, j, j2, Alignment.Companion.Start, weight, gapComposer, 24576);
                gapComposer.end(false);
            }
            SpacerKt.Spacer(gapComposer, SizeKt.m290width3ABfNKs(companion, 4.0f));
            if (textStack2 == null) {
                gapComposer.startReplaceGroup(2128381395);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(2128381396);
                Modifier weight2 = rowScopeInstance.weight(f, companion, true);
                String str4 = textStack2.labelText;
                String str5 = textStack2.valueText;
                Color color4 = textStack2.labelColor;
                if (color4 == null) {
                    gapComposer.startReplaceGroup(-58128888);
                    gapComposer.end(false);
                    m3 = null;
                } else {
                    m3 = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer, -1664443111, color4, gapComposer, false);
                }
                if (m3 == null) {
                    gapComposer.startReplaceGroup(-1664441611);
                    Colors colors3 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    i2 = -1762997026;
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                        i3 = -1762997739;
                    } else {
                        i3 = -1762997739;
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    j3 = colors3.semantic.text.subtle;
                    gapComposer.end(false);
                } else {
                    i2 = -1762997026;
                    i3 = -1762997739;
                    gapComposer.startReplaceGroup(-1664443719);
                    gapComposer.end(false);
                    j3 = m3.value;
                }
                Color color5 = textStack2.valueColor;
                if (color5 == null) {
                    gapComposer.startReplaceGroup(-58032664);
                    gapComposer.end(false);
                } else {
                    color = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer, -1664440007, color5, gapComposer, false);
                }
                androidx.compose.ui.graphics.Color color6 = color;
                if (color6 == null) {
                    gapComposer.startReplaceGroup(-1664438507);
                    Colors colors4 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors4 == null) {
                        colors4 = re$$ExternalSyntheticOutline0.m(gapComposer, i2, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(i3);
                        gapComposer.end(false);
                    }
                    j4 = colors4.semantic.text.subtle;
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(-1664440615);
                    gapComposer.end(false);
                    j4 = color6.value;
                }
                m3427LabeledTextStackY0xEhic(str4, str5, j3, j4, Alignment.Companion.End, weight2, gapComposer, 24576);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BulletinTileKt$$ExternalSyntheticLambda2(textStack, textStack2, i, 8);
        }
    }
}
