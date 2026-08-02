package com.squareup.cash.money.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.OffsetKt;
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
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.mikepenz.markdown.compose.components.CurrentComponentsBridge;
import com.mikepenz.markdown.compose.components.MarkdownComponentModel;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.RealToastIconScope;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.moneybot.views.markdown.MoneybotMarkdownKt;
import com.squareup.util.Strings;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.PolymorphicSerializerKt;
import org.intellij.markdown.MarkdownTokenTypes;
import org.intellij.markdown.ast.CompositeASTNode;

/* loaded from: classes6.dex */
public final /* synthetic */ class ComposableSingletons$MoneyTabUIKt$$ExternalSyntheticLambda0 implements Function3 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ ComposableSingletons$MoneyTabUIKt$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                RealToastIconScope realToastIconScope = (RealToastIconScope) obj;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                realToastIconScope.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((GapComposer) composer2).changed(realToastIconScope) ? 4 : 2;
                }
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                    realToastIconScope.Icon(Icons.CheckFill24, null, gapComposer2, ((intValue2 << 9) & 7168) | 390);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (!gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                Composer composer4 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (!gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                AdaptiveStackScope adaptiveStackScope = (AdaptiveStackScope) obj;
                Composer composer5 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                adaptiveStackScope.getClass();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= ((GapComposer) composer5).changed(adaptiveStackScope) ? 4 : 2;
                }
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 19) != 18)) {
                    Object rememberedValue = gapComposer5.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = new MoneyTabUIKt$$ExternalSyntheticLambda6(8);
                        gapComposer5.updateRememberedValue(rememberedValue);
                    }
                    Function0 function0 = (Function0) rememberedValue;
                    Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(adaptiveStackScope.horizontalWeight(companion, 1.0f), 52.0f);
                    Unit unit = Unit.INSTANCE;
                    Object rememberedValue2 = gapComposer5.rememberedValue();
                    if (rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = ComposableSingletons$LoadingComponentsKt$lambda$1474821147$1$2$1.INSTANCE;
                        gapComposer5.updateRememberedValue(rememberedValue2);
                    }
                    coil3.size.SizeKt.Button(function0, SuspendingPointerInputFilterKt.pointerInput(m277height3ABfNKs, unit, (PointerInputEventHandler) rememberedValue2), null, false, false, null, HypeWelcomeUIKt.f476lambda$1850672312, gapComposer5, 1572870, 60);
                    Object rememberedValue3 = gapComposer5.rememberedValue();
                    if (rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new MoneyTabUIKt$$ExternalSyntheticLambda6(9);
                        gapComposer5.updateRememberedValue(rememberedValue3);
                    }
                    Function0 function02 = (Function0) rememberedValue3;
                    Modifier m277height3ABfNKs2 = SizeKt.m277height3ABfNKs(adaptiveStackScope.horizontalWeight(companion, 1.0f), 52.0f);
                    Object rememberedValue4 = gapComposer5.rememberedValue();
                    if (rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = ComposableSingletons$LoadingComponentsKt$lambda$1474821147$1$2$1.INSTANCE$1;
                        gapComposer5.updateRememberedValue(rememberedValue4);
                    }
                    coil3.size.SizeKt.Button(function02, SuspendingPointerInputFilterKt.pointerInput(m277height3ABfNKs2, unit, (PointerInputEventHandler) rememberedValue4), null, false, false, null, HypeWelcomeUIKt.lambda$1373795263, gapComposer5, 1572870, 60);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                Composer composer6 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (!gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 17) != 16)) {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                Composer composer7 = (Composer) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 17) != 16)) {
                    HypeWelcomeUIKt.BalanceAppletTileLoadingShimmer(SizeKt.m277height3ABfNKs(companion, 260.0f), gapComposer7, 6);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                Composer composer8 = (Composer) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 17) != 16)) {
                    Colors colors = (Colors) gapComposer8.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer8, -1762997026, gapComposer8, false);
                    } else {
                        gapComposer8.startReplaceGroup(-1762997739);
                        gapComposer8.end(false);
                    }
                    DBUtil.SpacerWithinSectionMedium(0, 0, gapComposer8, ImageKt.m177backgroundbw27NRU(companion, colors.surface.money.background, rectangleShapeKt$RectangleShape$1));
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                Composer composer9 = (Composer) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 17) != 16)) {
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    ((DefaultSizes) gapComposer9.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    HypeWelcomeUIKt.UpsellTileLoadingShimmer(OffsetKt.aspectRatio(1.0f, SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2), false), gapComposer9, 0);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                Composer composer10 = (Composer) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 17) != 16)) {
                    Colors colors2 = (Colors) gapComposer10.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer10, -1762997026, gapComposer10, false);
                    } else {
                        gapComposer10.startReplaceGroup(-1762997739);
                        gapComposer10.end(false);
                    }
                    DBUtil.SpacerBetweenSectionLarge(0, 0, gapComposer10, ImageKt.m177backgroundbw27NRU(companion, colors2.surface.money.background, rectangleShapeKt$RectangleShape$1));
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                Composer composer11 = (Composer) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 17) != 16)) {
                    Colors colors3 = (Colors) gapComposer11.consume(ArcadeThemeKt.LocalColors);
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer11, -1762997026, gapComposer11, false);
                    } else {
                        gapComposer11.startReplaceGroup(-1762997739);
                        gapComposer11.end(false);
                    }
                    DBUtil.SpacerBetweenSectionLarge(0, 0, gapComposer11, ImageKt.m177backgroundbw27NRU(companion, colors3.surface.money.background, rectangleShapeKt$RectangleShape$1));
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                Composer composer12 = (Composer) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer12 = (GapComposer) composer12;
                if (gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 17) != 16)) {
                    SpacerKt.Spacer(gapComposer12, SizeKt.m277height3ABfNKs(companion, 38.0f));
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                Composer composer13 = (Composer) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer13 = (GapComposer) composer13;
                boolean shouldExecute = gapComposer13.shouldExecute(intValue13 & 1, (intValue13 & 17) != 16);
                Applier applier = gapComposer13.applier;
                if (shouldExecute) {
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer13, 48);
                    int hashCode = Long.hashCode(gapComposer13.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer13.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer13, companion);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer13.startReusableNode();
                    if (gapComposer13.inserting) {
                        gapComposer13.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer13.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer13, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer13, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf = Integer.valueOf(hashCode);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer13, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer13, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer13, materializeModifier, composeUiNode$Companion$SetModifier$14);
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(ClipKt.clip(SizeKt.m285size3ABfNKs(companion, 48.0f), RoundedCornerShapeKt.CircleShape), Strings.getColors(gapComposer13).semantic.background.standard, rectangleShapeKt$RectangleShape$1);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                    int hashCode2 = Long.hashCode(gapComposer13.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer13.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer13, m177backgroundbw27NRU);
                    gapComposer13.startReusableNode();
                    if (gapComposer13.inserting) {
                        gapComposer13.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer13.useNode();
                    }
                    Updater.m576setimpl(gapComposer13, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer13, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer13, composeUiNode$Companion$SetModifier$13, gapComposer13, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer13, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    Trace.m1191Iconww6aTOc(Icons.Failed24, (String) null, (Modifier) null, Strings.getColors(gapComposer13).semantic.icon.subtle, gapComposer13, 54, 4);
                    gapComposer13.end(true);
                    Strings.getSizes(gapComposer13).getClass();
                    Request$Priority$EnumUnboxingLocalUtility.m$1(DefaultSizes.spacing, companion, 16.0f, gapComposer13);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Center, Alignment.Companion.Start, gapComposer13, 6);
                    int hashCode3 = Long.hashCode(gapComposer13.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer13.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer13, companion);
                    gapComposer13.startReusableNode();
                    if (gapComposer13.inserting) {
                        gapComposer13.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer13.useNode();
                    }
                    Updater.m576setimpl(gapComposer13, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer13, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer13, composeUiNode$Companion$SetModifier$13, gapComposer13, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer13, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer13).semantic.text.standard, (Composer) gapComposer13, (Modifier) null, Strings.getTypography(gapComposer13).labelMedium, (TextLineBalancing) null, Room.stringResource(gapComposer13, R.string.moneybot_card_rendering_error), (Map) null, (Function1) null, false);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer13).semantic.text.standard, (Composer) gapComposer13, (Modifier) null, Strings.getTypography(gapComposer13).bodySmall, (TextLineBalancing) null, Room.stringResource(gapComposer13, R.string.something_went_wrong), (Map) null, (Function1) null, false);
                    gapComposer13.end(true);
                    gapComposer13.end(true);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                RealToastIconScope realToastIconScope2 = (RealToastIconScope) obj;
                Composer composer14 = (Composer) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                realToastIconScope2.getClass();
                if ((intValue14 & 6) == 0) {
                    intValue14 |= ((GapComposer) composer14).changed(realToastIconScope2) ? 4 : 2;
                }
                GapComposer gapComposer14 = (GapComposer) composer14;
                if (gapComposer14.shouldExecute(intValue14 & 1, (intValue14 & 19) != 18)) {
                    realToastIconScope2.Icon(Icons.AlertFill24, null, gapComposer14, ((intValue14 << 9) & 7168) | 390);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                Composer composer15 = (Composer) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer15 = (GapComposer) composer15;
                if (gapComposer15.shouldExecute(intValue15 & 1, (intValue15 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer15, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer15, R.string.moneybot_delete_chat_dialog_delete_button), (Map) null, (Function1) null, false);
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                Composer composer16 = (Composer) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer16 = (GapComposer) composer16;
                if (gapComposer16.shouldExecute(intValue16 & 1, (intValue16 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer16, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer16, R.string.moneybot_delete_chat_dialog_cancel_button), (Map) null, (Function1) null, false);
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 16:
                Composer composer17 = (Composer) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer17 = (GapComposer) composer17;
                if (gapComposer17.shouldExecute(intValue17 & 1, (intValue17 & 17) != 16)) {
                    Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(BoxScopeInstance.INSTANCE.align(companion, Alignment.Companion.BottomCenter), 1.0f);
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                    ((DefaultSizes) gapComposer17.consume(staticProvidableCompositionLocal)).getClass();
                    DefaultSizes.spacing.getClass();
                    ((DefaultSizes) gapComposer17.consume(staticProvidableCompositionLocal)).getClass();
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(fillMaxWidth2, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, 64.0f, 5);
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                    int hashCode4 = Long.hashCode(gapComposer17.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer17.currentCompositionLocalScope();
                    Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer17, m302paddingqDBjuR0$default);
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
                    Updater.m576setimpl(gapComposer17, maybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer17, currentCompositionLocalScope4, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer17, Integer.valueOf(hashCode4), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer17, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer17, materializeModifier4, ComposeUiNode.Companion.SetModifier);
                    ProgressCircularKt.ProgressCircular(6, 0, gapComposer17, SizeKt.m285size3ABfNKs(companion, 24.0f));
                    gapComposer17.end(true);
                } else {
                    gapComposer17.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                Composer composer18 = (Composer) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer18 = (GapComposer) composer18;
                if (gapComposer18.shouldExecute(intValue18 & 1, (intValue18 & 17) != 16)) {
                    Modifier m302paddingqDBjuR0$default2 = SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(companion, 1.0f), RecyclerView.DECELERATION_RATE, 215.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                    MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                    int hashCode5 = Long.hashCode(gapComposer18.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer18.currentCompositionLocalScope();
                    Modifier materializeModifier5 = PlatformKt.materializeModifier(gapComposer18, m302paddingqDBjuR0$default2);
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
                    Updater.m576setimpl(gapComposer18, maybeCachedBoxMeasurePolicy3, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer18, currentCompositionLocalScope5, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer18, Integer.valueOf(hashCode5), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer18, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer18, materializeModifier5, ComposeUiNode.Companion.SetModifier);
                    ModalKt.ProgressBranded(SizeKt.m285size3ABfNKs(companion, 150.0f), null, null, gapComposer18, 54, 12);
                    gapComposer18.end(true);
                } else {
                    gapComposer18.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                Composer composer19 = (Composer) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer19 = (GapComposer) composer19;
                if (gapComposer19.shouldExecute(intValue19 & 1, (intValue19 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer19, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer19, R.string.try_again), (Map) null, (Function1) null, false);
                } else {
                    gapComposer19.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                MarkdownComponentModel markdownComponentModel = (MarkdownComponentModel) obj;
                Composer composer20 = (Composer) obj2;
                int intValue20 = ((Integer) obj3).intValue();
                markdownComponentModel.getClass();
                if ((intValue20 & 6) == 0) {
                    intValue20 |= ((GapComposer) composer20).changed(markdownComponentModel) ? 4 : 2;
                }
                GapComposer gapComposer20 = (GapComposer) composer20;
                if (gapComposer20.shouldExecute(intValue20 & 1, (intValue20 & 19) != 18)) {
                    CurrentComponentsBridge.heading1.invoke(markdownComponentModel, gapComposer20, Integer.valueOf(intValue20 & 14));
                    MoneybotMarkdownKt.SpacerVertical20(null, gapComposer20, 0);
                } else {
                    gapComposer20.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                MarkdownComponentModel markdownComponentModel2 = (MarkdownComponentModel) obj;
                Composer composer21 = (Composer) obj2;
                int intValue21 = ((Integer) obj3).intValue();
                markdownComponentModel2.getClass();
                if ((intValue21 & 6) == 0) {
                    intValue21 |= ((GapComposer) composer21).changed(markdownComponentModel2) ? 4 : 2;
                }
                GapComposer gapComposer21 = (GapComposer) composer21;
                if (gapComposer21.shouldExecute(intValue21 & 1, (intValue21 & 19) != 18)) {
                    CurrentComponentsBridge.setextHeading2.invoke(markdownComponentModel2, gapComposer21, Integer.valueOf(intValue21 & 14));
                    MoneybotMarkdownKt.SpacerVertical20(null, gapComposer21, 0);
                } else {
                    gapComposer21.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                MarkdownComponentModel markdownComponentModel3 = (MarkdownComponentModel) obj;
                Composer composer22 = (Composer) obj2;
                int intValue22 = ((Integer) obj3).intValue();
                markdownComponentModel3.getClass();
                if ((intValue22 & 6) == 0) {
                    intValue22 |= ((GapComposer) composer22).changed(markdownComponentModel3) ? 4 : 2;
                }
                GapComposer gapComposer22 = (GapComposer) composer22;
                if (gapComposer22.shouldExecute(intValue22 & 1, (intValue22 & 19) != 18)) {
                    CurrentComponentsBridge.paragraph.invoke(markdownComponentModel3, gapComposer22, Integer.valueOf(intValue22 & 14));
                    CompositeASTNode compositeASTNode = markdownComponentModel3.node.parent;
                    if (Intrinsics.areEqual(compositeASTNode != null ? compositeASTNode.f1630type : null, MarkdownTokenTypes.LIST_ITEM)) {
                        gapComposer22.startReplaceGroup(-1076373326);
                        SpacerKt.Spacer(gapComposer22, SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), 12.0f));
                        gapComposer22.end(false);
                    } else {
                        gapComposer22.startReplaceGroup(-1076424104);
                        MoneybotMarkdownKt.SpacerVertical20(null, gapComposer22, 0);
                        gapComposer22.end(false);
                    }
                } else {
                    gapComposer22.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 22:
                MarkdownComponentModel markdownComponentModel4 = (MarkdownComponentModel) obj;
                Composer composer23 = (Composer) obj2;
                int intValue23 = ((Integer) obj3).intValue();
                markdownComponentModel4.getClass();
                if ((intValue23 & 6) == 0) {
                    intValue23 |= ((GapComposer) composer23).changed(markdownComponentModel4) ? 4 : 2;
                }
                GapComposer gapComposer23 = (GapComposer) composer23;
                if (gapComposer23.shouldExecute(intValue23 & 1, (intValue23 & 19) != 18)) {
                    MoneybotMarkdownKt.MoneybotMarkdownOrderedList(markdownComponentModel4.content, markdownComponentModel4.node, markdownComponentModel4.typography.ordered, PolymorphicSerializerKt.getListDepth(markdownComponentModel4), null, null, gapComposer23, 0);
                    DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer23, null);
                } else {
                    gapComposer23.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 23:
                MarkdownComponentModel markdownComponentModel5 = (MarkdownComponentModel) obj;
                Composer composer24 = (Composer) obj2;
                int intValue24 = ((Integer) obj3).intValue();
                markdownComponentModel5.getClass();
                if ((intValue24 & 6) == 0) {
                    intValue24 |= ((GapComposer) composer24).changed(markdownComponentModel5) ? 4 : 2;
                }
                GapComposer gapComposer24 = (GapComposer) composer24;
                if (gapComposer24.shouldExecute(intValue24 & 1, (intValue24 & 19) != 18)) {
                    MoneybotMarkdownKt.MoneybotMarkdownBulletList(markdownComponentModel5.content, markdownComponentModel5.node, markdownComponentModel5.typography.bullet, PolymorphicSerializerKt.getListDepth(markdownComponentModel5), null, null, gapComposer24, 0);
                    DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer24, null);
                } else {
                    gapComposer24.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 24:
                Composer composer25 = (Composer) obj2;
                int intValue25 = ((Integer) obj3).intValue();
                ((MarkdownComponentModel) obj).getClass();
                GapComposer gapComposer25 = (GapComposer) composer25;
                if (gapComposer25.shouldExecute(intValue25 & 1, (intValue25 & 17) != 16)) {
                    MoneybotMarkdownKt.HorizontalRule(gapComposer25, 0);
                } else {
                    gapComposer25.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 25:
                MarkdownComponentModel markdownComponentModel6 = (MarkdownComponentModel) obj;
                Composer composer26 = (Composer) obj2;
                int intValue26 = ((Integer) obj3).intValue();
                markdownComponentModel6.getClass();
                if ((intValue26 & 6) == 0) {
                    intValue26 |= ((GapComposer) composer26).changed(markdownComponentModel6) ? 4 : 2;
                }
                GapComposer gapComposer26 = (GapComposer) composer26;
                if (gapComposer26.shouldExecute(intValue26 & 1, (intValue26 & 19) != 18)) {
                    MoneybotMarkdownKt.MoneybotMarkdownTable(markdownComponentModel6.content, markdownComponentModel6.node, markdownComponentModel6.typography.table, null, null, null, gapComposer26, 0);
                } else {
                    gapComposer26.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 26:
                MarkdownComponentModel markdownComponentModel7 = (MarkdownComponentModel) obj;
                Composer composer27 = (Composer) obj2;
                int intValue27 = ((Integer) obj3).intValue();
                markdownComponentModel7.getClass();
                if ((intValue27 & 6) == 0) {
                    intValue27 |= ((GapComposer) composer27).changed(markdownComponentModel7) ? 4 : 2;
                }
                GapComposer gapComposer27 = (GapComposer) composer27;
                if (gapComposer27.shouldExecute(intValue27 & 1, (intValue27 & 19) != 18)) {
                    CurrentComponentsBridge.heading2.invoke(markdownComponentModel7, gapComposer27, Integer.valueOf(intValue27 & 14));
                    MoneybotMarkdownKt.SpacerVertical20(null, gapComposer27, 0);
                } else {
                    gapComposer27.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 27:
                MarkdownComponentModel markdownComponentModel8 = (MarkdownComponentModel) obj;
                Composer composer28 = (Composer) obj2;
                int intValue28 = ((Integer) obj3).intValue();
                markdownComponentModel8.getClass();
                if ((intValue28 & 6) == 0) {
                    intValue28 |= ((GapComposer) composer28).changed(markdownComponentModel8) ? 4 : 2;
                }
                GapComposer gapComposer28 = (GapComposer) composer28;
                if (gapComposer28.shouldExecute(intValue28 & 1, (intValue28 & 19) != 18)) {
                    CurrentComponentsBridge.heading3.invoke(markdownComponentModel8, gapComposer28, Integer.valueOf(intValue28 & 14));
                    MoneybotMarkdownKt.SpacerVertical20(null, gapComposer28, 0);
                } else {
                    gapComposer28.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 28:
                MarkdownComponentModel markdownComponentModel9 = (MarkdownComponentModel) obj;
                Composer composer29 = (Composer) obj2;
                int intValue29 = ((Integer) obj3).intValue();
                markdownComponentModel9.getClass();
                if ((intValue29 & 6) == 0) {
                    intValue29 |= ((GapComposer) composer29).changed(markdownComponentModel9) ? 4 : 2;
                }
                GapComposer gapComposer29 = (GapComposer) composer29;
                if (gapComposer29.shouldExecute(intValue29 & 1, (intValue29 & 19) != 18)) {
                    CurrentComponentsBridge.heading4.invoke(markdownComponentModel9, gapComposer29, Integer.valueOf(intValue29 & 14));
                    MoneybotMarkdownKt.SpacerVertical20(null, gapComposer29, 0);
                } else {
                    gapComposer29.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                MarkdownComponentModel markdownComponentModel10 = (MarkdownComponentModel) obj;
                Composer composer30 = (Composer) obj2;
                int intValue30 = ((Integer) obj3).intValue();
                markdownComponentModel10.getClass();
                if ((intValue30 & 6) == 0) {
                    intValue30 |= ((GapComposer) composer30).changed(markdownComponentModel10) ? 4 : 2;
                }
                GapComposer gapComposer30 = (GapComposer) composer30;
                if (gapComposer30.shouldExecute(intValue30 & 1, (intValue30 & 19) != 18)) {
                    CurrentComponentsBridge.heading5.invoke(markdownComponentModel10, gapComposer30, Integer.valueOf(intValue30 & 14));
                    MoneybotMarkdownKt.SpacerVertical20(null, gapComposer30, 0);
                } else {
                    gapComposer30.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
