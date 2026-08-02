package com.squareup.cash.card.onboarding;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.local.views.LocalViewFactory$createUi$view$3$1$1$1;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.fillr.featuretoggle.UnleashContext;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.borrow.views.BorrowHomeKt$$ExternalSyntheticLambda1;
import com.squareup.cash.card.ui.CashCardKt$$ExternalSyntheticLambda1;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda10;
import com.squareup.protos.franklin.cards.CardTheme;
import com.squareup.util.cash.ColorsKt;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public abstract class CardStyleItemViewKt {
    public static final /* synthetic */ int $r8$clinit = 0;

    static {
        CardTheme cardTheme = CardStudioViewKt.BLACK_CARD_THEME;
        CustomizationDetails customizationDetails = (65530 & 16) != 0 ? new CustomizationDetails() : null;
        cardTheme.getClass();
        customizationDetails.getClass();
        ColorsKt.toColor(ColorKt.m694toArgb8_81llA(Color.Red));
    }

    public static final void CardStyleItem(Modifier modifier, CardStyleItemViewModel cardStyleItemViewModel, Function0 function0, Composer composer, int i) {
        Modifier.Companion companion;
        float f;
        boolean z;
        boolean z2;
        boolean z3;
        cardStyleItemViewModel.getClass();
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1489622613);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changedInstance(cardStyleItemViewModel) ? 32 : 16) | (gapComposer.changedInstance(function0) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            State animateFloatAsState = AnimateAsStateKt.animateFloatAsState(((Boolean) mutableState.getValue()).booleanValue() ? 0.95f : 1.0f, null, "card pressed scale", null, gapComposer, 3072, 22);
            int i3 = i2 & 896;
            boolean changedInstance = gapComposer.changedInstance(cardStyleItemViewModel) | (i3 == 256);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new BorrowHomeKt$$ExternalSyntheticLambda1(13, cardStyleItemViewModel, function0);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(SemanticsModifierKt.clearAndSetSemantics(modifier, (Function1) rememberedValue2), 1.0f);
            Unit unit = Unit.INSTANCE;
            boolean z4 = i3 == 256;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (z4 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new LocalViewFactory$createUi$view$3$1$1$1(6, mutableState, function0);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(fillMaxWidth, unit, (PointerInputEventHandler) rememberedValue3);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, pointerInput);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            Color color = null;
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
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            StyledCardViewModel styledCardViewModel = cardStyleItemViewModel.card;
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion2, 1.0f);
            BiasAlignment biasAlignment = Alignment.Companion.Center;
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier align = boxScopeInstance.align(fillMaxWidth2, biasAlignment);
            boolean changed = gapComposer.changed(animateFloatAsState);
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (changed || rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = new MoneyTabUIKt$$ExternalSyntheticLambda10(animateFloatAsState, 8);
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            StyledCardViewKt.m3439StyledCardnSlTg7c(styledCardViewModel, AlphaKt.alpha(ImageKt.m178borderxT4_qwU(ColorKt.graphicsLayer(align, (Function1) rememberedValue4), 0.5f, Color.m675copywmQWz5c$default(0.06f, Color.Black, 14), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(12.0f)), cardStyleItemViewModel.available ? 1.0f : 0.25f), null, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, false, gapComposer, 0, 60);
            gapComposer.startReplaceGroup(-731958082);
            UnleashContext unleashContext = cardStyleItemViewModel.cardDetails;
            String str = (String) unleashContext.sessionId;
            String str2 = (String) unleashContext.userId;
            String str3 = (String) unleashContext.remoteAddress;
            boolean z5 = str != null;
            boolean z6 = str3 != null;
            boolean z7 = str2 != null;
            if (z5 || z6 || z7) {
                gapComposer.startReplaceGroup(-404547548);
                Modifier m272offsetVpY3zN4 = OffsetKt.m272offsetVpY3zN4(boxScopeInstance.align(companion2, Alignment.Companion.BottomEnd), 4.0f, 4.0f);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(ImageKt.m177backgroundbw27NRU(m272offsetVpY3zN4, colors.semantic.background.f1047app, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(72.0f)), 12.0f, 8.0f);
                RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer, 0);
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m299paddingVpY3zN4);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                if (z7) {
                    gapComposer.startReplaceGroup(1150702524);
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion2, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, (z5 || z6) ? 8.0f : RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 11);
                    companion = companion2;
                    str2.getClass();
                    TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
                    com.squareup.protos.cash.ui.Color color2 = (com.squareup.protos.cash.ui.Color) unleashContext.properties;
                    if (color2 == null) {
                        gapComposer.startReplaceGroup(1150919647);
                        z3 = false;
                        gapComposer.end(false);
                    } else {
                        z3 = false;
                        color = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer, 1976789090, color2, gapComposer, false);
                    }
                    Color color3 = color;
                    boolean z8 = z3;
                    long j = color3 != null ? color3.value : Color.Unspecified;
                    gapComposer = gapComposer;
                    z = z8;
                    f = 1.0f;
                    Room.m1165Text25TpFw(0, 1, 0, 0, 1572864, 0, 4016, j, (Composer) gapComposer, m302paddingqDBjuR0$default, textStyle, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                    gapComposer.end(z);
                } else {
                    companion = companion2;
                    f = 1.0f;
                    z = false;
                    gapComposer = gapComposer;
                    gapComposer.startReplaceGroup(1151004650);
                    gapComposer.end(false);
                }
                if (z5) {
                    gapComposer.startReplaceGroup(1151052793);
                    Modifier then = SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, z6 ? 8.0f : RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 11).then(new LayoutWeightElement(f, z));
                    str.getClass();
                    Room.m1165Text25TpFw(2, 1, 0, 0, 1769472, 0, 3992, 0L, (Composer) gapComposer, then, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyMedium, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                    gapComposer.end(z);
                } else {
                    gapComposer.startReplaceGroup(1151357802);
                    gapComposer.end(z);
                }
                if (z6) {
                    gapComposer.startReplaceGroup(1151388895);
                    str3.getClass();
                    Room.m1165Text25TpFw(0, 1, 0, 0, 1572864, 0, 4026, 0L, (Composer) gapComposer, (Modifier) null, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelMedium, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                    gapComposer.end(z);
                } else {
                    gapComposer.startReplaceGroup(1151491722);
                    gapComposer.end(z);
                }
                z2 = true;
                gapComposer.end(true);
                gapComposer.end(z);
            } else {
                gapComposer.startReplaceGroup(-403433749);
                gapComposer.end(false);
                z = false;
                gapComposer = gapComposer;
                z2 = true;
            }
            gapComposer.end(z);
            gapComposer.end(z2);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CashCardKt$$ExternalSyntheticLambda1(modifier, cardStyleItemViewModel, function0, i, 7);
        }
    }
}
