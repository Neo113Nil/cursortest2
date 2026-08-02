package com.squareup.cash.arcade.components.list;

import android.content.ClipData;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WithAlignmentLineElement;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.ClipEntry;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextMeasurer;
import androidx.compose.ui.text.TextPainterKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.media3.ui.compose.PlayerSurfaceKt$$ExternalSyntheticLambda2;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.local.views.internal.DismissableToastKt$$ExternalSyntheticLambda4;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.AlignmentLinesKt;
import com.squareup.cash.arcade.components.BadgeKt$$ExternalSyntheticLambda2;
import com.squareup.cash.arcade.components.CopyCodeKt$$ExternalSyntheticLambda10;
import com.squareup.cash.arcade.components.ToastKt$$ExternalSyntheticLambda11;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.treehouse.NavBarBinding$$ExternalSyntheticLambda2;
import com.squareup.cash.banking.views.BankingDialogKt$$ExternalSyntheticLambda8;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.overlays.OverlaysKt$$ExternalSyntheticLambda1;
import com.squareup.cash.score.views.InfoSectionKt$$ExternalSyntheticLambda0;
import com.squareup.cash.score.views.InfoSectionKt$$ExternalSyntheticLambda5;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import java.util.Map;
import kotlin.comparisons.ComparisonsKt___ComparisonsJvmKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.collections.immutable.ImmutableList;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public abstract class ListOrderedKt {
    public static final void ItemWithoutBody(int i, Composer composer, ComposableLambdaImpl composableLambdaImpl, Modifier modifier, ListOrderedColors$Subtle listOrderedColors$Subtle, String str) {
        int i2;
        long j;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1964820232);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(composableLambdaImpl) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(listOrderedColors$Subtle) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(modifier) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new NavBarBinding$$ExternalSyntheticLambda2(10);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier semantics = SemanticsModifierKt.semantics(modifier, true, (Function1) rememberedValue);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$SpacedAligned, Alignment.Companion.Top, gapComposer, 6);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, semantics);
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
            ListNumber(str, listOrderedColors$Subtle, null, gapComposer, (i2 & 896) | 6 | ((i2 << 3) & 112));
            WithAlignmentLineElement withAlignmentLineElement = new WithAlignmentLineElement(AlignmentLinesKt.FirstLineCenter);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, withAlignmentLineElement);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            ProvidedValue defaultProvidedValue$runtime = ArcadeThemeKt.LocalTextStyle.defaultProvidedValue$runtime(((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelMedium);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalTextColor;
            switch (listOrderedColors$Subtle.$r8$classId) {
                case 0:
                    gapComposer.startReplaceGroup(-2019521059);
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    j = colors.semantic.text.standard;
                    gapComposer.end(false);
                    break;
                default:
                    gapComposer.startReplaceGroup(-702326899);
                    Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    j = colors2.semantic.text.standard;
                    gapComposer.end(false);
                    break;
            }
            Updater.CompositionLocalProvider(new ProvidedValue[]{defaultProvidedValue$runtime, re$$ExternalSyntheticOutline0.m(j, staticProvidableCompositionLocal)}, Expect_jvmKt.rememberComposableLambda(2100598050, new OverlaysKt$$ExternalSyntheticLambda1(composableLambdaImpl, 12), gapComposer), gapComposer, 56);
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ListOrderedKt$$ExternalSyntheticLambda10(str, composableLambdaImpl, listOrderedColors$Subtle, modifier, i);
        }
    }

    public static final void ListNumber(String str, ListOrderedColors$Subtle listOrderedColors$Subtle, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        long j;
        long j2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(837436187);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(RowScopeInstance.INSTANCE) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(str) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(listOrderedColors$Subtle) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            TextMeasurer rememberTextMeasurer = TextPainterKt.rememberTextMeasurer(gapComposer);
            TextStyle m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).listNumber, 0L, 0L, null, null, 0L, new BaselineShift(0.12f), 0L, null, null, null, 0, 0L, null, new LineHeightStyle(LineHeightStyle.Alignment.Center, 17, 1), 0, 15728383);
            long j3 = TextMeasurer.m979measurewNUYSr0$default(rememberTextMeasurer, str, m994copyp1EtxEg$default, 0, 0L, IptcConstants.IMAGE_RESOURCE_BLOCK_OBSOLETE_PHOTOSHOP_TAG1).size;
            Density density = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
            float f = ((Dp) ComparisonsKt___ComparisonsJvmKt.maxOf(new Dp(density.mo233toDpu2uoSUM((int) (j3 >> 32))), ComparisonsKt___ComparisonsJvmKt.maxOf(new Dp(density.mo233toDpu2uoSUM((int) (j3 & BodyPartID.bodyIdMax))), new Dp(24.0f)))).value;
            BiasAlignment biasAlignment = Alignment.Companion.Center;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion, f);
            switch (listOrderedColors$Subtle.$r8$classId) {
                case 0:
                    gapComposer.startReplaceGroup(140938945);
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    j = colors.semantic.background.subtle;
                    gapComposer.end(false);
                    break;
                default:
                    gapComposer.startReplaceGroup(1030532977);
                    Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    j = colors2.semantic.icon.standard;
                    gapComposer.end(false);
                    break;
            }
            Modifier then = ImageKt.m177backgroundbw27NRU(m285size3ABfNKs, j, RoundedCornerShapeKt.CircleShape).then(new WithAlignmentLineElement(AlignmentLinesKt.FirstLineCenter));
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, then);
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
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            switch (listOrderedColors$Subtle.$r8$classId) {
                case 0:
                    gapComposer.startReplaceGroup(550055265);
                    Colors colors3 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    j2 = colors3.semantic.text.standard;
                    gapComposer.end(false);
                    break;
                default:
                    gapComposer.startReplaceGroup(-945674735);
                    Colors colors4 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors4 == null) {
                        colors4 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    j2 = colors4.semantic.text.inverse;
                    gapComposer.end(false);
                    break;
            }
            Room.m1165Text25TpFw(0, 0, 0, 3, ((i3 >> 3) & 14) | 48, 0, 3824, j2, (Composer) gapComposer, SizeKt.wrapContentSize$default(companion, null, 3), m994copyp1EtxEg$default, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CopyCodeKt$$ExternalSyntheticLambda10(i, 15, modifier2, str, listOrderedColors$Subtle);
        }
    }

    public static final void ListOrderedContainer(Modifier modifier, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        int i2;
        Modifier wrapContentHeight;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(196197014);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(composableLambdaImpl) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            wrapContentHeight = SizeKt.wrapContentHeight(SizeKt.fillMaxWidth(modifier, 1.0f), Alignment.Companion.CenterVertically, (r2 & 2) == 0);
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(wrapContentHeight, ((Dp) gapComposer.consume(ArcadeThemeKt.LocalScreenMargin)).value, RecyclerView.DECELERATION_RATE, 2);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            int i3 = (i2 << 6) & 7168;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
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
            Recorder$$ExternalSyntheticOutline1.m(((i3 >> 6) & 112) | 6, composableLambdaImpl, ColumnScopeInstance.INSTANCE, gapComposer, true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ListOrderedKt$$ExternalSyntheticLambda11(modifier, composableLambdaImpl, i, 0);
        }
    }

    public static final void ListOrderedStandard(Modifier modifier, ImmutableList immutableList, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        immutableList.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(524544428);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i3 | (gapComposer.changed(immutableList) ? 32 : 16);
        if (gapComposer.shouldExecute(i5 & 1, (i5 & 19) != 18)) {
            modifier2 = i4 != 0 ? Modifier.Companion.$$INSTANCE : modifier;
            boolean z = (i5 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ListOrderedKt$$ExternalSyntheticLambda0(immutableList, 1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            ListOrderedStandard(i5 & 14, 0, gapComposer, modifier2, (Function1) rememberedValue);
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PlayerSurfaceKt$$ExternalSyntheticLambda2(modifier2, (Object) immutableList, i, i2, 6);
        }
    }

    public static final void ListOrderedSubtle(int i, int i2, Composer composer, Modifier modifier, Function1 function1) {
        int i3;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(650677589);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            if (i4 != 0) {
                modifier = Modifier.Companion.$$INSTANCE;
            }
            ListOrderedSubtleItemsScope listOrderedSubtleItemsScope = new ListOrderedSubtleItemsScope();
            function1.invoke(listOrderedSubtleItemsScope);
            ListOrderedContainer(modifier, Expect_jvmKt.rememberComposableLambda(-1491033563, new BankingDialogKt$$ExternalSyntheticLambda8(listOrderedSubtleItemsScope, 5), gapComposer), gapComposer, (i3 & 14) | 48);
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ListOrderedKt$$ExternalSyntheticLambda3(modifier2, function1, i, i2, 1);
        }
    }

    public static final void OrderedListItemStandard(int i, Composer composer, ComposableLambdaImpl composableLambdaImpl, Modifier modifier, ListOrderedColors$Subtle listOrderedColors$Subtle, String str) {
        int i2;
        String str2;
        str.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1655975166);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(composableLambdaImpl) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        if ((i & 3072) == 0) {
            i3 |= gapComposer.changed(listOrderedColors$Subtle) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            int i4 = (i3 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | ((i3 >> 3) & 896) | ((i3 << 3) & 7168);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            ItemWithoutBody(i4, gapComposer, composableLambdaImpl, companion, listOrderedColors$Subtle, str);
            str2 = str;
            modifier = companion;
        } else {
            str2 = str;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ListOrderedKt$$ExternalSyntheticLambda10(str2, composableLambdaImpl, modifier, listOrderedColors$Subtle, i);
        }
    }

    public static final void SlashCommandMenu(int i, Composer composer, Modifier modifier, List list, Function1 function1) {
        list.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-551156252);
        int i2 = (gapComposer.changedInstance(list) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changed(modifier) ? 256 : 128);
        int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            AnimatedContentKt.AnimatedVisibility(!list.isEmpty(), modifier, EnterExitTransitionKt.fadeIn$default(AnimatableKt.tween$default(150, 0, null, 6), 2), EnterExitTransitionKt.fadeOut$default(AnimatableKt.tween$default(150, 0, null, 6), 2), (String) null, (Function3) Expect_jvmKt.rememberComposableLambda(-35942900, new InfoSectionKt$$ExternalSyntheticLambda0(i3, function1, list), gapComposer), (Composer) gapComposer, ((i2 >> 3) & 112) | 200064, 16);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InfoSectionKt$$ExternalSyntheticLambda5(list, function1, modifier, i, 4);
        }
    }

    public static final void StandardItemWithBody(String str, ComposableLambdaImpl composableLambdaImpl, Function2 function2, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1131051863);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changed(str) ? 4 : 2) | (gapComposer.changedInstance(composableLambdaImpl) ? 32 : 16) | (gapComposer.changedInstance(function2) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new NavBarBinding$$ExternalSyntheticLambda2(9);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            modifier2 = modifier;
            Modifier semantics = SemanticsModifierKt.semantics(modifier2, true, (Function1) rememberedValue);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$SpacedAligned, Alignment.Companion.Top, gapComposer, 6);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, semantics);
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
            ListNumber(str, ListOrderedColors$Subtle.INSTANCE$1, null, gapComposer, 390 | ((i2 << 3) & 112));
            WithAlignmentLineElement withAlignmentLineElement = new WithAlignmentLineElement(AlignmentLinesKt.FirstLineCenter);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, withAlignmentLineElement);
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
            DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = ArcadeThemeKt.LocalTextStyle;
            ProvidedValue defaultProvidedValue$runtime = dynamicProvidableCompositionLocal.defaultProvidedValue$runtime(Strings.getTypography(gapComposer).labelMedium);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalTextColor;
            Updater.CompositionLocalProvider(new ProvidedValue[]{defaultProvidedValue$runtime, re$$ExternalSyntheticOutline0.m(Strings.getColors(gapComposer).semantic.text.standard, staticProvidableCompositionLocal)}, Expect_jvmKt.rememberComposableLambda(-578182449, new OverlaysKt$$ExternalSyntheticLambda1(composableLambdaImpl, 11), gapComposer), gapComposer, 56);
            Updater.CompositionLocalProvider(new ProvidedValue[]{dynamicProvidableCompositionLocal.defaultProvidedValue$runtime(Strings.getTypography(gapComposer).bodySmall), re$$ExternalSyntheticOutline0.m(Strings.getColors(gapComposer).semantic.text.standard, staticProvidableCompositionLocal)}, Expect_jvmKt.rememberComposableLambda(-189703368, new ToastKt$$ExternalSyntheticLambda11(16, function2), gapComposer), gapComposer, 56);
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            modifier2 = modifier;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DismissableToastKt$$ExternalSyntheticLambda4(str, composableLambdaImpl, function2, modifier2, i, 28);
        }
    }

    public static final String readPlainText(ClipEntry clipEntry) {
        ClipData clipData = clipEntry.clipData;
        ClipData clipData2 = clipEntry.clipData;
        int itemCount = clipData.getItemCount();
        boolean z = false;
        for (int i = 0; i < itemCount; i++) {
            z = z || clipData2.getItemAt(i).getText() != null;
        }
        if (!z) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int itemCount2 = clipData2.getItemCount();
        boolean z2 = false;
        for (int i2 = 0; i2 < itemCount2; i2++) {
            CharSequence text = clipData2.getItemAt(i2).getText();
            if (text != null) {
                if (z2) {
                    sb.append("\n");
                }
                sb.append(text);
                z2 = true;
            }
        }
        return sb.toString();
    }

    public static final void ListOrderedSubtle(Modifier modifier, ImmutableList immutableList, Composer composer, int i) {
        immutableList.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1853003908);
        int i2 = i | 6 | (gapComposer.changed(immutableList) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ListOrderedKt$$ExternalSyntheticLambda0(immutableList, 0);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            ListOrderedSubtle(6, 0, gapComposer, companion, (Function1) rememberedValue);
            modifier = companion;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BadgeKt$$ExternalSyntheticLambda2(modifier, (Object) immutableList, i, 7);
        }
    }

    public static final void ListOrderedStandard(int i, int i2, Composer composer, Modifier modifier, Function1 function1) {
        int i3;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-218650747);
        int i4 = i2 & 1;
        int i5 = 4;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            if (i4 != 0) {
                modifier = Modifier.Companion.$$INSTANCE;
            }
            ListOrderedStandardItemsScope listOrderedStandardItemsScope = new ListOrderedStandardItemsScope();
            function1.invoke(listOrderedStandardItemsScope);
            ListOrderedContainer(modifier, Expect_jvmKt.rememberComposableLambda(-1113733035, new BankingDialogKt$$ExternalSyntheticLambda8(listOrderedStandardItemsScope, i5), gapComposer), gapComposer, (i3 & 14) | 48);
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ListOrderedKt$$ExternalSyntheticLambda3(modifier2, function1, i, i2, 0);
        }
    }
}
