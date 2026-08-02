package androidx.compose.material3;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.material3.internal.ChildSemanticsNodeElement;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.navigation.Navigation$$ExternalSyntheticLambda1;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class SurfaceKt {
    public static final DynamicProvidableCompositionLocal LocalAbsoluteTonalElevation = new DynamicProvidableCompositionLocal(new androidx.compose.material.TextKt$$ExternalSyntheticLambda0(20));

    /* renamed from: Surface-T9BRK9s, reason: not valid java name */
    public static final void m554SurfaceT9BRK9s(Modifier modifier, Shape shape, final long j, long j2, float f, final ComposableLambdaImpl composableLambdaImpl, Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            modifier = Modifier.Companion.$$INSTANCE;
        }
        if ((i2 & 2) != 0) {
            shape = ColorKt.RectangleShape;
        }
        if ((i2 & 8) != 0) {
            j2 = ColorSchemeKt.m519contentColorForek8zF_U(j, composer);
        }
        if ((i2 & 32) != 0) {
            f = 0.0f;
        }
        GapComposer gapComposer = (GapComposer) composer;
        DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = LocalAbsoluteTonalElevation;
        final float f2 = ((Dp) gapComposer.consume(dynamicProvidableCompositionLocal)).value + RecyclerView.DECELERATION_RATE;
        ProvidedValue[] providedValueArr = {Recorder$$ExternalSyntheticOutline2.m(j2, ContentColorKt.LocalContentColor), dynamicProvidableCompositionLocal.defaultProvidedValue$runtime(new Dp(f2))};
        final Shape shape2 = shape;
        final float f3 = f;
        final BorderStroke borderStroke = null;
        final Modifier modifier2 = modifier;
        Updater.CompositionLocalProvider(providedValueArr, Expect_jvmKt.rememberComposableLambda(421772006, new Function2() { // from class: androidx.compose.material3.SurfaceKt$Surface$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer2 = (Composer) obj;
                int intValue = ((Number) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Modifier m557access$surfaceXOJAsU = SurfaceKt.m557access$surfaceXOJAsU(Modifier.this, shape2, SurfaceKt.m558access$surfaceColorAtElevationCLU3JFs(j, f2, gapComposer2), borderStroke, ((Density) gapComposer2.consume(CompositionLocalsKt.LocalDensity)).mo236toPx0680j_4(f3));
                    Object rememberedValue = gapComposer2.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = new androidx.compose.material.ButtonKt$$ExternalSyntheticLambda2(29);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    Modifier semantics = SemanticsModifierKt.semantics(m557access$surfaceXOJAsU, false, (Function1) rememberedValue);
                    Unit unit = Unit.INSTANCE;
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = SurfaceKt$Surface$1$3$1.INSTANCE;
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(semantics, unit, (PointerInputEventHandler) rememberedValue2);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, true);
                    int currentCompositeKeyHash = Updater.getCurrentCompositeKeyHash(gapComposer2);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, pointerInput);
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
                    Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    if (gapComposer2.inserting || !Intrinsics.areEqual(gapComposer2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash, gapComposer2, currentCompositeKeyHash, composeUiNode$Companion$SetModifier$1);
                    }
                    Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    Recorder$$ExternalSyntheticOutline2.m(0, composableLambdaImpl, gapComposer2, true);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            }
        }, gapComposer), gapComposer, 56);
    }

    /* renamed from: Surface-d85dljk, reason: not valid java name */
    public static final void m555Surfaced85dljk(final boolean z, final Function0 function0, final Modifier modifier, final boolean z2, final Shape shape, final long j, final BorderStroke borderStroke, final ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        long m519contentColorForek8zF_U = ColorSchemeKt.m519contentColorForek8zF_U(j, composer);
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1528143336);
        Object rememberedValue = gapComposer.rememberedValue();
        if (rememberedValue == Composer.Companion.Empty) {
            rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
        }
        final MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue;
        gapComposer.end(false);
        GapComposer gapComposer2 = (GapComposer) composer;
        DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = LocalAbsoluteTonalElevation;
        final float f = ((Dp) gapComposer2.consume(dynamicProvidableCompositionLocal)).value + RecyclerView.DECELERATION_RATE;
        Updater.CompositionLocalProvider(new ProvidedValue[]{Recorder$$ExternalSyntheticOutline2.m(m519contentColorForek8zF_U, ContentColorKt.LocalContentColor), dynamicProvidableCompositionLocal.defaultProvidedValue$runtime(new Dp(f))}, Expect_jvmKt.rememberComposableLambda(1508735219, new Function2() { // from class: androidx.compose.material3.SurfaceKt$Surface$3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Modifier then;
                Composer composer2 = (Composer) obj;
                int intValue = ((Number) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer2;
                if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    HorizontalAlignmentLine horizontalAlignmentLine = InteractiveComponentSizeKt.MinimumInteractiveTopAlignmentLine;
                    then = SelectableKt.m334selectableO2vRcR0(SurfaceKt.m557access$surfaceXOJAsU(Modifier.this.then(MinimumInteractiveModifier.INSTANCE), shape, SurfaceKt.m558access$surfaceColorAtElevationCLU3JFs(j, f, gapComposer3), borderStroke, ((Density) gapComposer3.consume(CompositionLocalsKt.LocalDensity)).mo236toPx0680j_4(RecyclerView.DECELERATION_RATE)), z, mutableInteractionSourceImpl, RippleKt.m548rippleH2RKhps$default(7, RecyclerView.DECELERATION_RATE, false), z2, null, function0).then(new ChildSemanticsNodeElement(new Navigation$$ExternalSyntheticLambda1(3)));
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, true);
                    int currentCompositeKeyHash = Updater.getCurrentCompositeKeyHash(gapComposer3);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, then);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer3.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer3.startReusableNode();
                    if (gapComposer3.inserting) {
                        gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer3.useNode();
                    }
                    Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    if (gapComposer3.inserting || !Intrinsics.areEqual(gapComposer3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash, gapComposer3, currentCompositeKeyHash, composeUiNode$Companion$SetModifier$1);
                    }
                    Updater.m576setimpl(gapComposer3, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    Recorder$$ExternalSyntheticOutline2.m(0, composableLambdaImpl, gapComposer3, true);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            }
        }, gapComposer2), gapComposer2, 56);
    }

    /* renamed from: Surface-o_FOJdg, reason: not valid java name */
    public static final void m556Surfaceo_FOJdg(final Function0 function0, final Modifier modifier, boolean z, final Shape shape, final long j, long j2, float f, float f2, BorderStroke borderStroke, MutableInteractionSourceImpl mutableInteractionSourceImpl, final ComposableLambdaImpl composableLambdaImpl, Composer composer, int i, int i2) {
        final MutableInteractionSourceImpl mutableInteractionSourceImpl2;
        final boolean z2 = (i2 & 4) != 0 ? true : z;
        long m519contentColorForek8zF_U = (i2 & 32) != 0 ? ColorSchemeKt.m519contentColorForek8zF_U(j, composer) : j2;
        float f3 = (i2 & 64) != 0 ? 0.0f : f;
        final float f4 = (i2 & 128) != 0 ? 0.0f : f2;
        final BorderStroke borderStroke2 = (i2 & 256) != 0 ? null : borderStroke;
        GapComposer gapComposer = (GapComposer) composer;
        if (mutableInteractionSourceImpl == null) {
            gapComposer.startReplaceGroup(-1701037204);
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
            }
            gapComposer.end(false);
            mutableInteractionSourceImpl2 = (MutableInteractionSourceImpl) rememberedValue;
        } else {
            gapComposer.startReplaceGroup(2023337163);
            gapComposer.end(false);
            mutableInteractionSourceImpl2 = mutableInteractionSourceImpl;
        }
        GapComposer gapComposer2 = (GapComposer) composer;
        DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = LocalAbsoluteTonalElevation;
        final float f5 = ((Dp) gapComposer2.consume(dynamicProvidableCompositionLocal)).value + f3;
        Updater.CompositionLocalProvider(new ProvidedValue[]{Recorder$$ExternalSyntheticOutline2.m(m519contentColorForek8zF_U, ContentColorKt.LocalContentColor), dynamicProvidableCompositionLocal.defaultProvidedValue$runtime(new Dp(f5))}, Expect_jvmKt.rememberComposableLambda(849208527, new Function2() { // from class: androidx.compose.material3.SurfaceKt$Surface$2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Modifier then;
                Composer composer2 = (Composer) obj;
                int intValue = ((Number) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer2;
                if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    HorizontalAlignmentLine horizontalAlignmentLine = InteractiveComponentSizeKt.MinimumInteractiveTopAlignmentLine;
                    then = ImageKt.m182clickableO2vRcR0$default(SurfaceKt.m557access$surfaceXOJAsU(Modifier.this.then(MinimumInteractiveModifier.INSTANCE), shape, SurfaceKt.m558access$surfaceColorAtElevationCLU3JFs(j, f5, gapComposer3), borderStroke2, ((Density) gapComposer3.consume(CompositionLocalsKt.LocalDensity)).mo236toPx0680j_4(f4)), mutableInteractionSourceImpl2, RippleKt.m548rippleH2RKhps$default(7, RecyclerView.DECELERATION_RATE, false), z2, null, null, function0, 24).then(new ChildSemanticsNodeElement(new Navigation$$ExternalSyntheticLambda1(3)));
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, true);
                    int currentCompositeKeyHash = Updater.getCurrentCompositeKeyHash(gapComposer3);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, then);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer3.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer3.startReusableNode();
                    if (gapComposer3.inserting) {
                        gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer3.useNode();
                    }
                    Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    if (gapComposer3.inserting || !Intrinsics.areEqual(gapComposer3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash, gapComposer3, currentCompositeKeyHash, composeUiNode$Companion$SetModifier$1);
                    }
                    Updater.m576setimpl(gapComposer3, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    Recorder$$ExternalSyntheticOutline2.m(0, composableLambdaImpl, gapComposer3, true);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            }
        }, gapComposer2), gapComposer2, 56);
    }

    /* renamed from: access$surface-XO-JAsU, reason: not valid java name */
    public static final Modifier m557access$surfaceXOJAsU(Modifier modifier, Shape shape, long j, BorderStroke borderStroke, float f) {
        Shape shape2;
        Modifier modifier2;
        Modifier modifier3 = Modifier.Companion.$$INSTANCE;
        if (f > RecyclerView.DECELERATION_RATE) {
            shape2 = shape;
            modifier2 = ColorKt.m686graphicsLayerAp8cVGQ$default(modifier3, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, f, shape2, 124895);
        } else {
            shape2 = shape;
            modifier2 = modifier3;
        }
        Modifier then = modifier.then(modifier2);
        if (borderStroke != null) {
            modifier3 = ImageKt.m179borderziNgDLE(modifier3, borderStroke.width, borderStroke.brush, shape2);
        }
        return ClipKt.clip(ImageKt.m177backgroundbw27NRU(then.then(modifier3), j, shape2), shape2);
    }

    /* renamed from: access$surfaceColorAtElevation-CLU3JFs, reason: not valid java name */
    public static final long m558access$surfaceColorAtElevationCLU3JFs(long j, float f, GapComposer gapComposer) {
        ColorScheme colorScheme = (ColorScheme) gapComposer.consume(ColorSchemeKt.LocalColorScheme);
        boolean booleanValue = ((Boolean) gapComposer.consume(ColorSchemeKt.LocalTonalElevationEnabled)).booleanValue();
        long j2 = colorScheme.surface;
        return (Color.m676equalsimpl0(j, j2) && booleanValue) ? Dp.m1037equalsimpl0(f, RecyclerView.DECELERATION_RATE) ? j2 : ColorKt.m684compositeOverOWjLjI(Color.m675copywmQWz5c$default(((((float) Math.log(f + 1.0f)) * 4.5f) + 2.0f) / 100.0f, colorScheme.surfaceTint, 14), j2) : j;
    }
}
