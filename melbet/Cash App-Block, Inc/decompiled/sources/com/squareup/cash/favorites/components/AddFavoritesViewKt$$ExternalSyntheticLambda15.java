package com.squareup.cash.favorites.components;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.AsyncImageKt;
import coil3.compose.AsyncImagePainter;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.ScrollingScaffoldContentScope;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.image.PainterRequest;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.util.Strings;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public final /* synthetic */ class AddFavoritesViewKt$$ExternalSyntheticLambda15 implements Function3 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ AddFavoritesViewKt$$ExternalSyntheticLambda15(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        switch (i) {
            case 0:
                PainterRequest painterRequest = (PainterRequest) obj;
                int intValue = ((Integer) obj3).intValue();
                painterRequest.getClass();
                GapComposer gapComposer = (GapComposer) ((Composer) obj2);
                gapComposer.startReplaceGroup(398851471);
                AsyncImagePainter rememberAsyncImagePainter = AsyncImageKt.rememberAsyncImagePainter(painterRequest, null, gapComposer, intValue & 14, 1);
                gapComposer.end(false);
                return rememberAsyncImagePainter;
            case 1:
                Composer composer = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    Modifier m287sizeVpY3zN4 = SizeKt.m287sizeVpY3zN4(companion, 22.0f, ((Density) gapComposer2.consume(CompositionLocalsKt.LocalDensity)).mo231toDpGaN1DYA(Room.getSp(12)));
                    Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    BoxKt.Box(ImageKt.m177backgroundbw27NRU(m287sizeVpY3zN4, colors.semantic.background.subtle, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(4.0f)), gapComposer2, 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                Composer composer2 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer3 = (GapComposer) composer2;
                boolean shouldExecute = gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16);
                Applier applier = gapComposer3.applier;
                if (shouldExecute) {
                    Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion2, 1.0f);
                    Strings.getSizes(gapComposer3).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer3, 48);
                    int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, m300paddingVpY3zN4$default);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer3.startReusableNode();
                    if (gapComposer3.inserting) {
                        gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer3.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer3, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf = Integer.valueOf(hashCode);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer3, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer3, materializeModifier, composeUiNode$Companion$SetModifier$14);
                    BoxKt.Box(ImageKt.m177backgroundbw27NRU(SizeKt.m285size3ABfNKs(SpacerKt.m302paddingqDBjuR0$default(companion2, RecyclerView.DECELERATION_RATE, 20.0f, 20.0f, 20.0f, 1), 40.0f), Strings.getColors(gapComposer3).semantic.background.subtle, RoundedCornerShapeKt.CircleShape), gapComposer3, 0);
                    LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                    RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(SpacerKt.SpaceBetween, Alignment.Companion.Top, gapComposer3, 6);
                    int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, layoutWeightElement);
                    gapComposer3.startReusableNode();
                    if (gapComposer3.inserting) {
                        gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer3.useNode();
                    }
                    Updater.m576setimpl(gapComposer3, rowMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer3, composeUiNode$Companion$SetModifier$13, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer3, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    Density density = (Density) gapComposer3.consume(CompositionLocalsKt.LocalDensity);
                    BoxKt.Box(ImageKt.m177backgroundbw27NRU(SizeKt.m287sizeVpY3zN4(companion2, 128.0f, density.mo231toDpGaN1DYA(Room.getSp(16))), Strings.getColors(gapComposer3).semantic.background.subtle, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(4.0f)), gapComposer3, 0);
                    BoxKt.Box(ImageKt.m177backgroundbw27NRU(SizeKt.m287sizeVpY3zN4(companion2, 40.0f, density.mo231toDpGaN1DYA(Room.getSp(16))), Strings.getColors(gapComposer3).semantic.background.subtle, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(4.0f)), gapComposer3, 0);
                    gapComposer3.end(true);
                    gapComposer3.end(true);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                Composer composer3 = (Composer) obj2;
                ((Integer) obj3).getClass();
                ((AnimatedVisibilityScope) obj).getClass();
                Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                GapComposer gapComposer4 = (GapComposer) composer3;
                Colors colors2 = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                } else {
                    gapComposer4.startReplaceGroup(-1762997739);
                    gapComposer4.end(false);
                }
                Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxSize, colors2.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1);
                ((DefaultSizes) gapComposer4.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(m177backgroundbw27NRU, 16.0f);
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, composer3, 0);
                int hashCode3 = Long.hashCode(gapComposer4.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer4.currentCompositionLocalScope();
                Modifier materializeModifier3 = PlatformKt.materializeModifier(composer3, m298padding3ABfNKs);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                GapComposer gapComposer5 = (GapComposer) composer3;
                if (gapComposer5.applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer5.startReusableNode();
                if (gapComposer5.inserting) {
                    gapComposer5.createNode(layoutNode$Companion$Constructor$12);
                } else {
                    gapComposer5.useNode();
                }
                Updater.m576setimpl(composer3, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(composer3, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(composer3, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(composer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(composer3, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                ProgressCircularKt.ProgressCircular(0, 1, composer3, null);
                gapComposer5.end(true);
                return Unit.INSTANCE;
            case 4:
                Composer composer4 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer6 = (GapComposer) composer4;
                if (gapComposer6.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                    Modifier m287sizeVpY3zN42 = SizeKt.m287sizeVpY3zN4(companion, 128.0f, ((Density) gapComposer6.consume(CompositionLocalsKt.LocalDensity)).mo231toDpGaN1DYA(Room.getSp(12)));
                    Colors colors3 = (Colors) gapComposer6.consume(ArcadeThemeKt.LocalColors);
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer6, -1762997026, gapComposer6, false);
                    } else {
                        gapComposer6.startReplaceGroup(-1762997739);
                        gapComposer6.end(false);
                    }
                    long j = colors3.semantic.background.subtle;
                    ((DefaultSizes) gapComposer6.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    Object obj4 = DefaultSizes.border.entries;
                    BoxKt.Box(ImageKt.m177backgroundbw27NRU(m287sizeVpY3zN42, j, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(6.0f)), gapComposer6, 0);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                Composer composer5 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer7 = (GapComposer) composer5;
                if (gapComposer7.shouldExecute(intValue5 & 1, (intValue5 & 17) != 16)) {
                    DBUtil.SpacerBetweenSectionXLarge(0, 1, gapComposer7, null);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                Composer composer6 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer8 = (GapComposer) composer6;
                if (gapComposer8.shouldExecute(intValue6 & 1, (intValue6 & 17) != 16)) {
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer8, null);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                Composer composer7 = (Composer) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer9 = (GapComposer) composer7;
                if (gapComposer9.shouldExecute(intValue7 & 1, (intValue7 & 17) != 16)) {
                    DBUtil.SpacerBetweenSectionXLarge(0, 1, gapComposer9, null);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                Composer composer8 = (Composer) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer10 = (GapComposer) composer8;
                if (gapComposer10.shouldExecute(intValue8 & 1, (intValue8 & 17) != 16)) {
                    DBUtil.SpacerBetweenSectionXLarge(0, 1, gapComposer10, null);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                Composer composer9 = (Composer) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer11 = (GapComposer) composer9;
                if (gapComposer11.shouldExecute(intValue9 & 1, (intValue9 & 17) != 16)) {
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                    ((DefaultSizes) gapComposer11.consume(staticProvidableCompositionLocal)).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier m287sizeVpY3zN43 = SizeKt.m287sizeVpY3zN4(companion, 128.0f, 16.0f);
                    Colors colors4 = (Colors) gapComposer11.consume(ArcadeThemeKt.LocalColors);
                    if (colors4 == null) {
                        colors4 = re$$ExternalSyntheticOutline0.m(gapComposer11, -1762997026, gapComposer11, false);
                    } else {
                        gapComposer11.startReplaceGroup(-1762997739);
                        gapComposer11.end(false);
                    }
                    long j2 = colors4.semantic.background.subtle;
                    ((DefaultSizes) gapComposer11.consume(staticProvidableCompositionLocal)).getClass();
                    Object obj5 = DefaultSizes.border.entries;
                    BoxKt.Box(ImageKt.m177backgroundbw27NRU(m287sizeVpY3zN43, j2, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(8.0f)), gapComposer11, 0);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                Composer composer10 = (Composer) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer12 = (GapComposer) composer10;
                if (gapComposer12.shouldExecute(intValue10 & 1, (intValue10 & 17) != 16)) {
                    Modifier m287sizeVpY3zN44 = SizeKt.m287sizeVpY3zN4(companion, 128.0f, ((Density) gapComposer12.consume(CompositionLocalsKt.LocalDensity)).mo231toDpGaN1DYA(Room.getSp(12)));
                    Colors colors5 = (Colors) gapComposer12.consume(ArcadeThemeKt.LocalColors);
                    if (colors5 == null) {
                        colors5 = re$$ExternalSyntheticOutline0.m(gapComposer12, -1762997026, gapComposer12, false);
                    } else {
                        gapComposer12.startReplaceGroup(-1762997739);
                        gapComposer12.end(false);
                    }
                    BoxKt.Box(ImageKt.m177backgroundbw27NRU(m287sizeVpY3zN44, colors5.semantic.background.subtle, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(4.0f)), gapComposer12, 0);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                Composer composer11 = (Composer) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer13 = (GapComposer) composer11;
                if (gapComposer13.shouldExecute(intValue11 & 1, (intValue11 & 17) != 16)) {
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer13, 0);
                    int hashCode4 = Long.hashCode(gapComposer13.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer13.currentCompositionLocalScope();
                    Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer13, companion);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer13.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer13.startReusableNode();
                    if (gapComposer13.inserting) {
                        gapComposer13.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer13.useNode();
                    }
                    Updater.m576setimpl(gapComposer13, columnMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer13, currentCompositionLocalScope4, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer13, Integer.valueOf(hashCode4), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer13, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer13, materializeModifier4, ComposeUiNode.Companion.SetModifier);
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = CompositionLocalsKt.LocalDensity;
                    Modifier m287sizeVpY3zN45 = SizeKt.m287sizeVpY3zN4(companion, 128.0f, ((Density) gapComposer13.consume(staticProvidableCompositionLocal2)).mo231toDpGaN1DYA(Room.getSp(12)));
                    long j3 = Strings.getColors(gapComposer13).semantic.background.subtle;
                    Strings.getSizes(gapComposer13).getClass();
                    Object obj6 = DefaultSizes.border.entries;
                    BoxKt.Box(ImageKt.m177backgroundbw27NRU(m287sizeVpY3zN45, j3, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(6.0f)), gapComposer13, 0);
                    Strings.getSizes(gapComposer13).getClass();
                    DefaultSizes.spacing.getClass();
                    SpacerKt.Spacer(gapComposer13, SizeKt.m277height3ABfNKs(companion, 8.0f));
                    Modifier m287sizeVpY3zN46 = SizeKt.m287sizeVpY3zN4(companion, 91.0f, ((Density) gapComposer13.consume(staticProvidableCompositionLocal2)).mo231toDpGaN1DYA(Room.getSp(12)));
                    long j4 = Strings.getColors(gapComposer13).semantic.background.subtle;
                    Strings.getSizes(gapComposer13).getClass();
                    BoxKt.Box(ImageKt.m177backgroundbw27NRU(m287sizeVpY3zN46, j4, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(6.0f)), gapComposer13, 0);
                    gapComposer13.end(true);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                Composer composer12 = (Composer) obj2;
                ((Integer) obj3).getClass();
                ((AnimatedVisibilityScope) obj).getClass();
                Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion, 1.0f);
                GapComposer gapComposer14 = (GapComposer) composer12;
                Colors colors6 = (Colors) gapComposer14.consume(ArcadeThemeKt.LocalColors);
                if (colors6 == null) {
                    colors6 = re$$ExternalSyntheticOutline0.m(gapComposer14, -1762997026, gapComposer14, false);
                } else {
                    gapComposer14.startReplaceGroup(-1762997739);
                    gapComposer14.end(false);
                }
                Modifier m177backgroundbw27NRU2 = ImageKt.m177backgroundbw27NRU(fillMaxSize2, colors6.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1);
                ((DefaultSizes) gapComposer14.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                Modifier m298padding3ABfNKs2 = SpacerKt.m298padding3ABfNKs(m177backgroundbw27NRU2, 16.0f);
                ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, composer12, 0);
                int hashCode5 = Long.hashCode(gapComposer14.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer14.currentCompositionLocalScope();
                Modifier materializeModifier5 = PlatformKt.materializeModifier(composer12, m298padding3ABfNKs2);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$14 = ComposeUiNode.Companion.Constructor;
                GapComposer gapComposer15 = (GapComposer) composer12;
                if (gapComposer15.applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer15.startReusableNode();
                if (gapComposer15.inserting) {
                    gapComposer15.createNode(layoutNode$Companion$Constructor$14);
                } else {
                    gapComposer15.useNode();
                }
                Updater.m576setimpl(composer12, columnMeasurePolicy3, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(composer12, currentCompositionLocalScope5, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(composer12, Integer.valueOf(hashCode5), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(composer12, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(composer12, materializeModifier5, ComposeUiNode.Companion.SetModifier);
                ProgressCircularKt.ProgressCircular(0, 1, composer12, null);
                gapComposer15.end(true);
                return Unit.INSTANCE;
            case 13:
                PainterRequest painterRequest2 = (PainterRequest) obj;
                int intValue12 = ((Integer) obj3).intValue();
                painterRequest2.getClass();
                GapComposer gapComposer16 = (GapComposer) ((Composer) obj2);
                gapComposer16.startReplaceGroup(352912401);
                AsyncImagePainter rememberAsyncImagePainter2 = AsyncImageKt.rememberAsyncImagePainter(painterRequest2, null, gapComposer16, intValue12 & 14, 1);
                gapComposer16.end(false);
                return rememberAsyncImagePainter2;
            case 14:
                PainterRequest painterRequest3 = (PainterRequest) obj;
                int intValue13 = ((Integer) obj3).intValue();
                painterRequest3.getClass();
                GapComposer gapComposer17 = (GapComposer) ((Composer) obj2);
                gapComposer17.startReplaceGroup(273048819);
                AsyncImagePainter rememberAsyncImagePainter3 = AsyncImageKt.rememberAsyncImagePainter(painterRequest3, null, gapComposer17, intValue13 & 14, 1);
                gapComposer17.end(false);
                return rememberAsyncImagePainter3;
            case 15:
                PainterRequest painterRequest4 = (PainterRequest) obj;
                int intValue14 = ((Integer) obj3).intValue();
                painterRequest4.getClass();
                GapComposer gapComposer18 = (GapComposer) ((Composer) obj2);
                gapComposer18.startReplaceGroup(1871274306);
                AsyncImagePainter rememberAsyncImagePainter4 = AsyncImageKt.rememberAsyncImagePainter(painterRequest4, null, gapComposer18, intValue14 & 14, 1);
                gapComposer18.end(false);
                return rememberAsyncImagePainter4;
            case 16:
                Composer composer13 = (Composer) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer19 = (GapComposer) composer13;
                if (gapComposer19.shouldExecute(intValue15 & 1, (intValue15 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer19, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer19, R.string.ok), (Map) null, (Function1) null, false);
                } else {
                    gapComposer19.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                Composer composer14 = (Composer) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer20 = (GapComposer) composer14;
                if (gapComposer20.shouldExecute(intValue16 & 1, (intValue16 & 17) != 16)) {
                    Modifier.Companion companion3 = Modifier.Companion.$$INSTANCE;
                    Modifier m298padding3ABfNKs3 = SpacerKt.m298padding3ABfNKs(SizeKt.fillMaxWidth(companion3, 1.0f), 24.0f);
                    Colors colors7 = (Colors) gapComposer20.consume(ArcadeThemeKt.LocalColors);
                    if (colors7 == null) {
                        colors7 = re$$ExternalSyntheticOutline0.m(gapComposer20, -1762997026, gapComposer20, false);
                    } else {
                        gapComposer20.startReplaceGroup(-1762997739);
                        gapComposer20.end(false);
                    }
                    Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(ImageKt.m177backgroundbw27NRU(m298padding3ABfNKs3, colors7.semantic.background.f1047app, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(12.0f)), 32.0f, 44.0f);
                    ColumnMeasurePolicy columnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer20, 48);
                    int hashCode6 = Long.hashCode(gapComposer20.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope6 = gapComposer20.currentCompositionLocalScope();
                    Modifier materializeModifier6 = PlatformKt.materializeModifier(gapComposer20, m299paddingVpY3zN4);
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
                    Updater.m576setimpl(gapComposer20, columnMeasurePolicy4, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer20, currentCompositionLocalScope6, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer20, Integer.valueOf(hashCode6), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer20, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer20, materializeModifier6, ComposeUiNode.Companion.SetModifier);
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion3, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 4.0f, 7);
                    String stringResource = Room.stringResource(gapComposer20, R.string.sponsor_search_no_results_title);
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal3 = ArcadeThemeKt.LocalTypography;
                    Room.m1165Text25TpFw(0, 0, 0, 3, 48, 0, 3832, 0L, (Composer) gapComposer20, m302paddingqDBjuR0$default, ((Typography) gapComposer20.consume(staticProvidableCompositionLocal3)).labelMedium, (TextLineBalancing) null, stringResource, (Map) null, (Function1) null, false);
                    Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3834, 0L, (Composer) gapComposer20, (Modifier) null, ((Typography) gapComposer20.consume(staticProvidableCompositionLocal3)).bodySmall, (TextLineBalancing) null, Room.stringResource(gapComposer20, R.string.sponsor_search_no_results_body), (Map) null, (Function1) null, false);
                    gapComposer20.end(true);
                } else {
                    gapComposer20.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                PainterRequest painterRequest5 = (PainterRequest) obj;
                int intValue17 = ((Integer) obj3).intValue();
                painterRequest5.getClass();
                GapComposer gapComposer21 = (GapComposer) ((Composer) obj2);
                gapComposer21.startReplaceGroup(797730060);
                AsyncImagePainter rememberAsyncImagePainter5 = AsyncImageKt.rememberAsyncImagePainter(painterRequest5, null, gapComposer21, intValue17 & 14, 1);
                gapComposer21.end(false);
                return rememberAsyncImagePainter5;
            case 19:
                Composer composer15 = (Composer) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                ((ScrollingScaffoldContentScope) obj).getClass();
                GapComposer gapComposer22 = (GapComposer) composer15;
                if (gapComposer22.shouldExecute(intValue18 & 1, (intValue18 & 17) != 16)) {
                    Modifier fillMaxSize3 = SizeKt.fillMaxSize(companion, 1.0f);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                    int hashCode7 = Long.hashCode(gapComposer22.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope7 = gapComposer22.currentCompositionLocalScope();
                    Modifier materializeModifier7 = PlatformKt.materializeModifier(gapComposer22, fillMaxSize3);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$16 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer22.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer22.startReusableNode();
                    if (gapComposer22.inserting) {
                        gapComposer22.createNode(layoutNode$Companion$Constructor$16);
                    } else {
                        gapComposer22.useNode();
                    }
                    Updater.m576setimpl(gapComposer22, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer22, currentCompositionLocalScope7, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer22, Integer.valueOf(hashCode7), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer22, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer22, materializeModifier7, ComposeUiNode.Companion.SetModifier);
                    ProgressCircularKt.ProgressCircular(0, 1, gapComposer22, null);
                    gapComposer22.end(true);
                } else {
                    gapComposer22.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                Composer composer16 = (Composer) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer23 = (GapComposer) composer16;
                if (gapComposer23.shouldExecute(intValue19 & 1, (intValue19 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer23, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer23, R.string.favorites_adding), (Map) null, (Function1) null, false);
                } else {
                    gapComposer23.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                Composer composer17 = (Composer) obj2;
                int intValue20 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer24 = (GapComposer) composer17;
                if (gapComposer24.shouldExecute(intValue20 & 1, (intValue20 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer24, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer24, R.string.favorites_added), (Map) null, (Function1) null, false);
                } else {
                    gapComposer24.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 22:
                Composer composer18 = (Composer) obj2;
                int intValue21 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer25 = (GapComposer) composer18;
                if (gapComposer25.shouldExecute(intValue21 & 1, (intValue21 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer25, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer25, R.string.favorites_add), (Map) null, (Function1) null, false);
                } else {
                    gapComposer25.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 23:
                Composer composer19 = (Composer) obj2;
                int intValue22 = ((Integer) obj3).intValue();
                ((String) obj).getClass();
                GapComposer gapComposer26 = (GapComposer) composer19;
                if (gapComposer26.shouldExecute(intValue22 & 1, (intValue22 & 17) != 16)) {
                    Modifier fillMaxSize4 = SizeKt.fillMaxSize(SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, 4.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14), 1.0f);
                    Icons icons = Icons.Business24;
                    Colors colors8 = (Colors) gapComposer26.consume(ArcadeThemeKt.LocalColors);
                    if (colors8 == null) {
                        colors8 = re$$ExternalSyntheticOutline0.m(gapComposer26, -1762997026, gapComposer26, false);
                    } else {
                        gapComposer26.startReplaceGroup(-1762997739);
                        gapComposer26.end(false);
                    }
                    Trace.m1191Iconww6aTOc(icons, (String) null, fillMaxSize4, colors8.semantic.icon.brand, gapComposer26, 438, 0);
                } else {
                    gapComposer26.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 24:
                Composer composer20 = (Composer) obj2;
                int intValue23 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer27 = (GapComposer) composer20;
                if (gapComposer27.shouldExecute(intValue23 & 1, (intValue23 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer27, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer27, R.string.close), (Map) null, (Function1) null, false);
                } else {
                    gapComposer27.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 25:
                Composer composer21 = (Composer) obj2;
                int intValue24 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer28 = (GapComposer) composer21;
                if (gapComposer28.shouldExecute(intValue24 & 1, (intValue24 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer28, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer28, R.string.ok), (Map) null, (Function1) null, false);
                } else {
                    gapComposer28.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 26:
                Composer composer22 = (Composer) obj2;
                int intValue25 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer29 = (GapComposer) composer22;
                if (gapComposer29.shouldExecute(intValue25 & 1, (intValue25 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer29, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer29, R.string.add_favorites), (Map) null, (Function1) null, false);
                } else {
                    gapComposer29.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 27:
                Composer composer23 = (Composer) obj2;
                int intValue26 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer30 = (GapComposer) composer23;
                if (gapComposer30.shouldExecute(intValue26 & 1, (intValue26 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer30, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer30, R.string.remove), (Map) null, (Function1) null, false);
                } else {
                    gapComposer30.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 28:
                Composer composer24 = (Composer) obj2;
                int intValue27 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer31 = (GapComposer) composer24;
                if (gapComposer31.shouldExecute(intValue27 & 1, (intValue27 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer31, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer31, R.string.add_favorites), (Map) null, (Function1) null, false);
                } else {
                    gapComposer31.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                PainterRequest painterRequest6 = (PainterRequest) obj;
                int intValue28 = ((Integer) obj3).intValue();
                painterRequest6.getClass();
                GapComposer gapComposer32 = (GapComposer) ((Composer) obj2);
                gapComposer32.startReplaceGroup(-1304698145);
                AsyncImagePainter rememberAsyncImagePainter6 = AsyncImageKt.rememberAsyncImagePainter(painterRequest6, null, gapComposer32, intValue28 & 14, 1);
                gapComposer32.end(false);
                return rememberAsyncImagePainter6;
        }
    }
}
