package com.squareup.cash.collapsingtoolbar.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.DecayAnimationSpecImpl;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.gestures.DefaultFlingBehavior;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda23;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda26;
import androidx.compose.material3.SliderKt$$ExternalSyntheticLambda4;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.mlkit.vision.common.zzb;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.components.BadgeKt$BadgeAssetLayout$3$2$1;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.checks.CheckDepositAmountKt$$ExternalSyntheticLambda1;
import com.squareup.cash.data.db.RealAppConfigManager$$ExternalSyntheticLambda7;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda10;
import com.squareup.cash.moneybot.views.plugins.SlottedMetricKt$$ExternalSyntheticLambda3;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.mooncake.compose_ui.components.NavigationIconType;
import com.squareup.cash.offers.views.OffersFormattedDetailKt$$ExternalSyntheticLambda7;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda0;
import com.squareup.cash.sheet.RealSheetState;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.ranges.RangesKt___RangesKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class CollapsingToolbarKt {
    public static final ComposableLambdaImpl lambda$1611071193 = new ComposableLambdaImpl(new RealAppConfigManager$$ExternalSyntheticLambda7(8), false, 1611071193);

    /* renamed from: CollapsingHeaderScaffold-8r3B23s, reason: not valid java name */
    public static final void m3475CollapsingHeaderScaffold8r3B23s(Modifier modifier, ComposableLambdaImpl composableLambdaImpl, ComposableLambdaImpl composableLambdaImpl2, long j, ComposableLambdaImpl composableLambdaImpl3, NavigationType navigationType, Function0 function0, ComposableLambdaImpl composableLambdaImpl4, Composer composer, int i) {
        long j2;
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-994077927);
        int i2 = i | (gapComposer.changed(modifier) ? 4 : 2) | 1024 | (gapComposer.changedInstance(function0) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted);
        if (gapComposer.shouldExecute(i2 & 1, (4793491 & i2) != 4793490)) {
            gapComposer.startDefaults();
            if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j2 = colors.semantic.background.f1047app;
            } else {
                gapComposer.skipToGroupEnd();
                j2 = j;
            }
            gapComposer.endDefaults();
            CollapsingToolbarScaffoldState rememberCollapsingToolbarScaffoldState = rememberCollapsingToolbarScaffoldState(gapComposer);
            Modifier clipToBounds = ClipKt.clipToBounds(modifier);
            ScrollStrategy[] scrollStrategyArr = ScrollStrategy.$VALUES;
            CollapsingToolbarScaffold(clipToBounds, rememberCollapsingToolbarScaffoldState, false, null, Expect_jvmKt.rememberComposableLambda(1645285427, new SlottedMetricKt$$ExternalSyntheticLambda3(rememberCollapsingToolbarScaffoldState, j2, composableLambdaImpl2, navigationType, function0, composableLambdaImpl3, composableLambdaImpl), gapComposer), composableLambdaImpl4, gapComposer, 1769856);
        } else {
            gapComposer.skipToGroupEnd();
            j2 = j;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DatePickerKt$$ExternalSyntheticLambda26(modifier, composableLambdaImpl, composableLambdaImpl2, j2, composableLambdaImpl3, navigationType, function0, composableLambdaImpl4, i);
        }
    }

    /* renamed from: CollapsingHeaderScaffoldMooncake-8r3B23s, reason: not valid java name */
    public static final void m3476CollapsingHeaderScaffoldMooncake8r3B23s(final ComposableLambdaImpl composableLambdaImpl, final ComposableLambdaImpl composableLambdaImpl2, final long j, Function3 function3, NavigationIconType navigationIconType, final Function0 function0, ComposableLambdaImpl composableLambdaImpl3, Composer composer, int i) {
        Function3 function32;
        final NavigationIconType navigationIconType2;
        final Function3 function33;
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1142968274);
        int i2 = i | (gapComposer.changed(j) ? 2048 : 1024) | 221184 | (gapComposer.changedInstance(function0) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted);
        if (gapComposer.shouldExecute(i2 & 1, (4793491 & i2) != 4793490)) {
            gapComposer.startDefaults();
            if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                navigationIconType2 = NavigationIconType.CLOSE;
                function33 = lambda$1611071193;
            } else {
                gapComposer.skipToGroupEnd();
                function33 = function3;
                navigationIconType2 = navigationIconType;
            }
            gapComposer.endDefaults();
            final CollapsingToolbarScaffoldState rememberCollapsingToolbarScaffoldState = rememberCollapsingToolbarScaffoldState(gapComposer);
            WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
            final float mo267calculateTopPaddingD9Ej5fM = SpacerKt.asPaddingValues(Arrangement$End$1.current(gapComposer).statusBars, gapComposer).mo267calculateTopPaddingD9Ej5fM() + 56.0f;
            Modifier clipToBounds = ClipKt.clipToBounds(Modifier.Companion.$$INSTANCE);
            ScrollStrategy[] scrollStrategyArr = ScrollStrategy.$VALUES;
            CollapsingToolbarScaffold(clipToBounds, rememberCollapsingToolbarScaffoldState, false, null, Expect_jvmKt.rememberComposableLambda(106576876, new Function3() { // from class: com.squareup.cash.collapsingtoolbar.views.CollapsingHeaderScaffoldMooncakeKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    CollapsingToolbarScopeInstance collapsingToolbarScopeInstance = (CollapsingToolbarScopeInstance) obj;
                    Composer composer2 = (Composer) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    collapsingToolbarScopeInstance.getClass();
                    if ((intValue & 6) == 0) {
                        intValue |= (intValue & 8) == 0 ? ((GapComposer) composer2).changed(collapsingToolbarScopeInstance) : ((GapComposer) composer2).changedInstance(collapsingToolbarScopeInstance) ? 4 : 2;
                    }
                    GapComposer gapComposer2 = (GapComposer) composer2;
                    boolean shouldExecute = gapComposer2.shouldExecute(intValue & 1, (intValue & 19) != 18);
                    Applier applier = gapComposer2.applier;
                    if (shouldExecute) {
                        CollapsingToolbarState collapsingToolbarState = CollapsingToolbarScaffoldState.this.toolbarState;
                        float intValue2 = collapsingToolbarState.minHeightState$delegate.getIntValue();
                        float intValue3 = collapsingToolbarState.maxHeightState$delegate.getIntValue();
                        float intValue4 = collapsingToolbarState.height$delegate.getIntValue();
                        float f = intValue2 * 3.0f;
                        boolean z = intValue3 >= f;
                        float f2 = z ? intValue2 * 2.0f : (intValue3 * 2.0f) / 3.0f;
                        if (!z) {
                            f = intValue3;
                        }
                        float f3 = (intValue4 - f2) / (f - f2);
                        float f4 = RecyclerView.DECELERATION_RATE;
                        float coerceIn = RangesKt___RangesKt.coerceIn(f3, RecyclerView.DECELERATION_RATE, 1.0f);
                        if (intValue2 > RecyclerView.DECELERATION_RATE) {
                            float f5 = z ? 2.0f * intValue2 : (intValue3 * 2.0f) / 3.0f;
                            f4 = RangesKt___RangesKt.coerceIn((intValue4 - f5) / (intValue2 - f5), RecyclerView.DECELERATION_RATE, 1.0f);
                        }
                        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                        long j2 = j;
                        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
                        Modifier road = CollapsingToolbarScopeInstance.road(AlphaKt.alpha(ImageKt.m177backgroundbw27NRU(companion, j2, rectangleShapeKt$RectangleShape$1), coerceIn));
                        float f6 = mo267calculateTopPaddingD9Ej5fM;
                        Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(road, RecyclerView.DECELERATION_RATE, f6, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                        BiasAlignment biasAlignment = Alignment.Companion.TopStart;
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                        int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                        Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m302paddingqDBjuR0$default);
                        ComposeUiNode.Companion.getClass();
                        Function0 function02 = ComposeUiNode.Companion.Constructor;
                        if (applier == null) {
                            Updater.invalidApplier();
                            throw null;
                        }
                        gapComposer2.startReusableNode();
                        if (gapComposer2.inserting) {
                            gapComposer2.createNode(function02);
                        } else {
                            gapComposer2.useNode();
                        }
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                        Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                        Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                        Integer valueOf = Integer.valueOf(hashCode);
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                        Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$13);
                        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                        Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                        Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
                        float f7 = f4;
                        Recorder$$ExternalSyntheticOutline2.m(0, composableLambdaImpl2, gapComposer2, true);
                        Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(SizeKt.m277height3ABfNKs(companion, f6), j2, rectangleShapeKt$RectangleShape$1);
                        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                        int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
                        Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, m177backgroundbw27NRU);
                        gapComposer2.startReusableNode();
                        if (gapComposer2.inserting) {
                            gapComposer2.createNode(function02);
                        } else {
                            gapComposer2.useNode();
                        }
                        Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                        Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                        Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                        ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1506806143, new OffersFormattedDetailKt$$ExternalSyntheticLambda7(f7, composableLambdaImpl, 2), gapComposer2);
                        Function0 function03 = function0;
                        boolean changed = gapComposer2.changed(function03);
                        Object rememberedValue = gapComposer2.rememberedValue();
                        if (changed || rememberedValue == Composer.Companion.Empty) {
                            rememberedValue = new ComposeDialogKt$$ExternalSyntheticLambda10(13, function03);
                            gapComposer2.updateRememberedValue(rememberedValue);
                        }
                        KeypadKt.m3653Toolbar7ZsnBMk(rememberComposableLambda, null, navigationIconType2, 0L, (Function0) rememberedValue, function33, gapComposer2, 6, 54);
                        gapComposer2.end(true);
                    } else {
                        gapComposer2.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), composableLambdaImpl3, gapComposer, 1769856);
            function32 = function33;
        } else {
            gapComposer.skipToGroupEnd();
            function32 = function3;
            navigationIconType2 = navigationIconType;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DatePickerKt$$ExternalSyntheticLambda23(composableLambdaImpl, composableLambdaImpl2, j, function32, navigationIconType2, function0, composableLambdaImpl3, i);
        }
    }

    public static final void CollapsingToolbar(CollapsingToolbarState collapsingToolbarState, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        int i2;
        collapsingToolbarState.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-562774732);
        int i3 = i & 6;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        if (i3 == 0) {
            i2 = (gapComposer.changed(companion) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(collapsingToolbarState) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(composableLambdaImpl) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new CollapsingToolbarMeasurePolicy(collapsingToolbarState);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            CollapsingToolbarMeasurePolicy collapsingToolbarMeasurePolicy = (CollapsingToolbarMeasurePolicy) rememberedValue;
            Modifier clipToBounds = ClipKt.clipToBounds(companion);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, clipToBounds);
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
            Updater.m576setimpl(gapComposer, collapsingToolbarMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            composableLambdaImpl.invoke(CollapsingToolbarScopeInstance.INSTANCE, gapComposer, Integer.valueOf(((i2 >> 3) & 112) | 6));
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CheckDepositAmountKt$$ExternalSyntheticLambda1(collapsingToolbarState, composableLambdaImpl, i);
        }
    }

    public static final void CollapsingToolbarScaffold(Modifier modifier, CollapsingToolbarScaffoldState collapsingToolbarScaffoldState, boolean z, Modifier modifier2, ComposableLambdaImpl composableLambdaImpl, ComposableLambdaImpl composableLambdaImpl2, Composer composer, int i) {
        int i2;
        boolean z2;
        Modifier modifier3;
        ScrollStrategy[] scrollStrategyArr = ScrollStrategy.$VALUES;
        modifier.getClass();
        collapsingToolbarScaffoldState.getClass();
        CollapsingToolbarState collapsingToolbarState = collapsingToolbarScaffoldState.toolbarState;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(936073827);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(collapsingToolbarScaffoldState) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(2) ? 256 : 128;
        }
        int i3 = i2 | 27648;
        if ((196608 & i) == 0) {
            i3 |= gapComposer.changedInstance(composableLambdaImpl) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= gapComposer.changedInstance(composableLambdaImpl2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if (gapComposer.shouldExecute(i3 & 1, (599187 & i3) != 599186)) {
            DecayAnimationSpecImpl rememberSplineBasedDecay = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(gapComposer);
            boolean changed = gapComposer.changed(rememberSplineBasedDecay);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = new DefaultFlingBehavior(rememberSplineBasedDecay);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DefaultFlingBehavior defaultFlingBehavior = (DefaultFlingBehavior) rememberedValue;
            LayoutDirection layoutDirection = (LayoutDirection) gapComposer.consume(CompositionLocalsKt.LocalLayoutDirection);
            int i4 = i3 & 896;
            int i5 = i3 & 112;
            boolean z3 = (i4 == 256) | (i5 == 32);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z3 || rememberedValue2 == neverEqualPolicy) {
                collapsingToolbarScaffoldState.offsetYState.getClass();
                collapsingToolbarState.getClass();
                defaultFlingBehavior.getClass();
                rememberedValue2 = new RealSheetState.SheetNestedScrollConnection(collapsingToolbarState, defaultFlingBehavior);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier then = modifier.then(NestedScrollModifierKt.nestedScroll(companion, (NestedScrollConnection) rememberedValue2, null));
            boolean changed2 = (i4 == 256) | gapComposer.changed(collapsingToolbarState) | (i5 == 32) | gapComposer.changed(layoutDirection.ordinal());
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new BadgeKt$BadgeAssetLayout$3$2$1(collapsingToolbarState, collapsingToolbarScaffoldState, layoutDirection);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue3;
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
            Updater.m576setimpl(gapComposer, measurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            CollapsingToolbar(collapsingToolbarState, Expect_jvmKt.rememberComposableLambda(1577543545, new OverlayKt$$ExternalSyntheticLambda0(composableLambdaImpl, 9), gapComposer), gapComposer, ((i3 >> 12) & 14) | MLKEMEngine.KyberPolyBytes);
            composableLambdaImpl2.invoke(CollapsingToolbarScaffoldScopeInstance.INSTANCE, gapComposer, Integer.valueOf(((i3 >> 15) & 112) | 6));
            z2 = true;
            gapComposer.end(true);
            modifier3 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            z2 = z;
            modifier3 = modifier2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SliderKt$$ExternalSyntheticLambda4(modifier, collapsingToolbarScaffoldState, z2, modifier3, composableLambdaImpl, composableLambdaImpl2, i);
        }
    }

    public static final CollapsingToolbarScaffoldState rememberCollapsingToolbarScaffoldState(Composer composer) {
        GapComposer gapComposer = (GapComposer) composer;
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = new CollapsingToolbarState();
            gapComposer.updateRememberedValue(rememberedValue);
        }
        CollapsingToolbarState collapsingToolbarState = (CollapsingToolbarState) rememberedValue;
        Object[] objArr = {collapsingToolbarState};
        collapsingToolbarState.getClass();
        zzb zzbVar = new zzb();
        zzbVar.zza = collapsingToolbarState;
        boolean changed = ((GapComposer) composer).changed(collapsingToolbarState);
        GapComposer gapComposer2 = (GapComposer) composer;
        Object rememberedValue2 = gapComposer2.rememberedValue();
        if (changed || rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new SsnViewKt$$ExternalSyntheticLambda4(collapsingToolbarState, 26);
            gapComposer2.updateRememberedValue(rememberedValue2);
        }
        return (CollapsingToolbarScaffoldState) SaverKt.m581rememberSaveable(objArr, (Saver) zzbVar, (Function0) rememberedValue2, (Composer) gapComposer2, 0);
    }
}
