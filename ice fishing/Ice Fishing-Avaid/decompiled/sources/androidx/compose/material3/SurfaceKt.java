package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.material3.internal.ChildParentSemanticsKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.PointerIconCompat;
import kotlin.Metadata;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: Surface.kt */
@Metadata(d1 = {"\u0000d\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aj\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u008e\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0096\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00152\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u009c\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u00152\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u001f2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0004\b\u001b\u0010 \u001a5\u0010!\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000b\u001a\u00020#H\u0003¢\u0006\u0004\b$\u0010%\u001aF\u0010\u0000\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020&2\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\b\u0010H\u0001¢\u0006\u0004\b'\u0010(\u001a\u001f\u0010)\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\nH\u0003¢\u0006\u0004\b+\u0010,\"\u0017\u0010-\u001a\b\u0012\u0004\u0012\u00020\n0.¢\u0006\b\n\u0000\u001a\u0004\b/\u00100¨\u00061"}, d2 = {"Surface", "", "modifier", "Landroidx/compose/ui/Modifier;", "shape", "Landroidx/compose/ui/graphics/Shape;", "color", "Landroidx/compose/ui/graphics/Color;", "contentColor", "tonalElevation", "Landroidx/compose/ui/unit/Dp;", "shadowElevation", "border", "Landroidx/compose/foundation/BorderStroke;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "Surface-T9BRK9s", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "onClick", "enabled", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "Surface-o_FOJdg", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "selected", "Surface-d85dljk", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "checked", "onCheckedChange", "Lkotlin/Function1;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "surface", "backgroundColor", "", "surface-XO-JAsU", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JLandroidx/compose/foundation/BorderStroke;F)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/graphics/ColorProducer;", "Surface-vz2T9sI", "(Landroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/ui/Modifier;FFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "surfaceColorAtElevation", "elevation", "surfaceColorAtElevation-CLU3JFs", "(JFLandroidx/compose/runtime/Composer;I)J", "LocalAbsoluteTonalElevation", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalAbsoluteTonalElevation", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "material3"}, k = 2, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class SurfaceKt {
    private static final ProvidableCompositionLocal<Dp> LocalAbsoluteTonalElevation = CompositionLocalKt.compositionLocalOf$default(null, new Function0() { // from class: androidx.compose.material3.SurfaceKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Dp LocalAbsoluteTonalElevation$lambda$0;
            LocalAbsoluteTonalElevation$lambda$0 = SurfaceKt.LocalAbsoluteTonalElevation$lambda$0();
            return LocalAbsoluteTonalElevation$lambda$0;
        }
    }, 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Surface_vz2T9sI$lambda$1(ColorProducer colorProducer, Modifier modifier, float f, float f2, Function2 function2, int i, int i2, Composer composer, int i3) {
        m4116Surfacevz2T9sI(colorProducer, modifier, f, f2, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* renamed from: Surface-T9BRK9s, reason: not valid java name */
    public static final void m4112SurfaceT9BRK9s(Modifier modifier, Shape shape, long j, long j2, float f, float f2, BorderStroke borderStroke, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -1093433818, "C(Surface)N(modifier,shape,color:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,tonalElevation:c#ui.unit.Dp,shadowElevation:c#ui.unit.Dp,border,content)100@5265L11,101@5312L22,107@5530L7,111@5704L884,108@5559L1029:Surface.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            modifier = Modifier.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        if ((i2 & 4) != 0) {
            j = MaterialTheme.INSTANCE.getColorScheme(composer, 6).getSurface();
        }
        if ((i2 & 8) != 0) {
            j2 = ColorSchemeKt.m2784contentColorForek8zF_U(j, composer, (i >> 6) & 14);
        }
        if ((i2 & 16) != 0) {
            f = Dp.m9732constructorimpl(0);
        }
        if ((i2 & 32) != 0) {
            f2 = Dp.m9732constructorimpl(0);
        }
        if ((i2 & 64) != 0) {
            borderStroke = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1093433818, i, -1, "androidx.compose.material3.Surface (Surface.kt:106)");
        }
        ProvidableCompositionLocal<Dp> providableCompositionLocal = LocalAbsoluteTonalElevation;
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(providableCompositionLocal);
        ComposerKt.sourceInformationMarkerEnd(composer);
        final float m9732constructorimpl = Dp.m9732constructorimpl(((Dp) consume).m9746unboximpl() + f);
        ProvidedValue[] providedValueArr = {ContentColorKt.getLocalContentColor().provides(Color.m6776boximpl(j2)), providableCompositionLocal.provides(Dp.m9730boximpl(m9732constructorimpl))};
        final long j3 = j;
        final Shape shape2 = shape;
        final BorderStroke borderStroke2 = borderStroke;
        final float f3 = f2;
        final Modifier modifier2 = modifier;
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.rememberComposableLambda(421772006, true, new Function2() { // from class: androidx.compose.material3.SurfaceKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit Surface_T9BRK9s$lambda$0;
                Surface_T9BRK9s$lambda$0 = SurfaceKt.Surface_T9BRK9s$lambda$0(Modifier.this, shape2, j3, m9732constructorimpl, borderStroke2, f3, function2, (Composer) obj, ((Integer) obj2).intValue());
                return Surface_T9BRK9s$lambda$0;
            }
        }, composer, 54), composer, ProvidedValue.$stable | 48);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Surface_T9BRK9s$lambda$0(Modifier modifier, Shape shape, long j, float f, BorderStroke borderStroke, float f2, Function2 function2, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C118@5906L69,120@6078L7,122@6194L256,128@6491L2,112@5714L868:Surface.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(421772006, i, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:112)");
            }
            long m4118surfaceColorAtElevationCLU3JFs = m4118surfaceColorAtElevationCLU3JFs(j, f, composer, 0);
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd(composer);
            Modifier m4117surfaceXOJAsU = m4117surfaceXOJAsU(modifier, shape, m4118surfaceColorAtElevationCLU3JFs, borderStroke, ((Density) consume).mo528toPx0680j_4(f2));
            ComposerKt.sourceInformationMarkerStart(composer, 1595987878, "CC(remember):Surface.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: androidx.compose.material3.SurfaceKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit Surface_T9BRK9s$lambda$0$1$0;
                        Surface_T9BRK9s$lambda$0$1$0 = SurfaceKt.Surface_T9BRK9s$lambda$0$1$0((SemanticsPropertyReceiver) obj);
                        return Surface_T9BRK9s$lambda$0$1$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            Modifier semantics = SemanticsModifierKt.semantics(m4117surfaceXOJAsU, false, (Function1) rememberedValue);
            Unit unit = Unit.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 1595997128, "CC(remember):Surface.kt#9igjgp");
            SurfaceKt$Surface$1$3$1 rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new PointerInputEventHandler() { // from class: androidx.compose.material3.SurfaceKt$Surface$1$3$1
                    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(semantics, unit, (PointerInputEventHandler) rememberedValue2);
            ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, pointerInput);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer m5864constructorimpl = Updater.m5864constructorimpl(composer);
            Updater.m5872setimpl(m5864constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 258689390, "C131@6563L9:Surface.kt#uh7d8r");
            function2.invoke(composer, 0);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Surface_T9BRK9s$lambda$0$1$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setContainer(semanticsPropertyReceiver, true);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* renamed from: Surface-o_FOJdg, reason: not valid java name */
    public static final void m4115Surfaceo_FOJdg(final Function0<Unit> function0, Modifier modifier, boolean z, Shape shape, long j, long j2, float f, float f2, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i, int i2, int i3) {
        boolean z2;
        ComposerKt.sourceInformationMarkerStart(composer, -1472753265, "C(Surface)N(onClick,modifier,enabled,shape,color:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,tonalElevation:c#ui.unit.Dp,shadowElevation:c#ui.unit.Dp,border,interactionSource,content)204@11073L11,205@11120L22,214@11516L7,218@11690L870,215@11545L1015:Surface.kt#uh7d8r");
        final Modifier modifier2 = (i3 & 2) != 0 ? Modifier.INSTANCE : modifier;
        final boolean z3 = (i3 & 4) != 0 ? true : z;
        final Shape rectangleShape = (i3 & 8) != 0 ? RectangleShapeKt.getRectangleShape() : shape;
        final long surface = (i3 & 16) != 0 ? MaterialTheme.INSTANCE.getColorScheme(composer, 6).getSurface() : j;
        long m2784contentColorForek8zF_U = (i3 & 32) != 0 ? ColorSchemeKt.m2784contentColorForek8zF_U(surface, composer, (i >> 12) & 14) : j2;
        float m9732constructorimpl = (i3 & 64) != 0 ? Dp.m9732constructorimpl(0) : f;
        final float m9732constructorimpl2 = (i3 & 128) != 0 ? Dp.m9732constructorimpl(0) : f2;
        BorderStroke borderStroke2 = (i3 & 256) != 0 ? null : borderStroke;
        MutableInteractionSource mutableInteractionSource2 = (i3 & 512) == 0 ? mutableInteractionSource : null;
        if (ComposerKt.isTraceInProgress()) {
            z2 = 1;
            ComposerKt.traceEventStart(-1472753265, i, i2, "androidx.compose.material3.Surface (Surface.kt:211)");
        } else {
            z2 = 1;
        }
        if (mutableInteractionSource2 == null) {
            composer.startReplaceGroup(-1701074900);
            ComposerKt.sourceInformation(composer, "213@11420L39");
            ComposerKt.sourceInformationMarkerStart(composer, 2023336598, "CC(remember):Surface.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer.updateRememberedValue(rememberedValue);
            }
            mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composer);
        } else {
            composer.startReplaceGroup(2023335947);
        }
        composer.endReplaceGroup();
        ProvidableCompositionLocal<Dp> providableCompositionLocal = LocalAbsoluteTonalElevation;
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(providableCompositionLocal);
        ComposerKt.sourceInformationMarkerEnd(composer);
        final float m9732constructorimpl3 = Dp.m9732constructorimpl(((Dp) consume).m9746unboximpl() + m9732constructorimpl);
        ProvidedValue[] providedValueArr = new ProvidedValue[2];
        providedValueArr[0] = ContentColorKt.getLocalContentColor().provides(Color.m6776boximpl(m2784contentColorForek8zF_U));
        providedValueArr[z2] = providableCompositionLocal.provides(Dp.m9730boximpl(m9732constructorimpl3));
        final BorderStroke borderStroke3 = borderStroke2;
        final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.rememberComposableLambda(849208527, z2, new Function2() { // from class: androidx.compose.material3.SurfaceKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit Surface_o_FOJdg$lambda$1;
                Surface_o_FOJdg$lambda$1 = SurfaceKt.Surface_o_FOJdg$lambda$1(Modifier.this, rectangleShape, surface, m9732constructorimpl3, borderStroke3, mutableInteractionSource3, z3, function0, m9732constructorimpl2, function2, (Composer) obj, ((Integer) obj2).intValue());
                return Surface_o_FOJdg$lambda$1;
            }
        }, composer, 54), composer, ProvidedValue.$stable | 48);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Surface_o_FOJdg$lambda$1(Modifier modifier, Shape shape, long j, float f, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, boolean z, Function0 function0, float f2, Function2 function2, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C226@11947L69,228@12119L7,219@11700L854:Surface.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(849208527, i, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:219)");
            }
            Modifier minimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier);
            long m4118surfaceColorAtElevationCLU3JFs = m4118surfaceColorAtElevationCLU3JFs(j, f, composer, 0);
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd(composer);
            Modifier childSemantics$default = ChildParentSemanticsKt.childSemantics$default(ClickableKt.m395clickableO2vRcR0$default(m4117surfaceXOJAsU(minimumInteractiveComponentSize, shape, m4118surfaceColorAtElevationCLU3JFs, borderStroke, ((Density) consume).mo528toPx0680j_4(f2)), mutableInteractionSource, RippleKt.m3792rippleH2RKhps$default(false, 0.0f, 0L, 7, null), z, null, null, function0, 24, null), null, 1, null);
            ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, childSemantics$default);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer m5864constructorimpl = Updater.m5864constructorimpl(composer);
            Updater.m5872setimpl(m5864constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -361808591, "C239@12535L9:Surface.kt#uh7d8r");
            function2.invoke(composer, 0);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* renamed from: Surface-d85dljk, reason: not valid java name */
    public static final void m4113Surfaced85dljk(final boolean z, final Function0<Unit> function0, Modifier modifier, boolean z2, Shape shape, long j, long j2, float f, float f2, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i, int i2, int i3) {
        boolean z3;
        ComposerKt.sourceInformationMarkerStart(composer, 1416521139, "C(Surface)N(selected,onClick,modifier,enabled,shape,color:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,tonalElevation:c#ui.unit.Dp,shadowElevation:c#ui.unit.Dp,border,interactionSource,content)312@16981L11,313@17028L22,322@17424L7,326@17598L916,323@17453L1061:Surface.kt#uh7d8r");
        final Modifier modifier2 = (i3 & 4) != 0 ? Modifier.INSTANCE : modifier;
        final boolean z4 = (i3 & 8) != 0 ? true : z2;
        final Shape rectangleShape = (i3 & 16) != 0 ? RectangleShapeKt.getRectangleShape() : shape;
        final long surface = (i3 & 32) != 0 ? MaterialTheme.INSTANCE.getColorScheme(composer, 6).getSurface() : j;
        long m2784contentColorForek8zF_U = (i3 & 64) != 0 ? ColorSchemeKt.m2784contentColorForek8zF_U(surface, composer, (i >> 15) & 14) : j2;
        float m9732constructorimpl = (i3 & 128) != 0 ? Dp.m9732constructorimpl(0) : f;
        final float m9732constructorimpl2 = (i3 & 256) != 0 ? Dp.m9732constructorimpl(0) : f2;
        BorderStroke borderStroke2 = (i3 & 512) != 0 ? null : borderStroke;
        MutableInteractionSource mutableInteractionSource2 = (i3 & 1024) == 0 ? mutableInteractionSource : null;
        if (ComposerKt.isTraceInProgress()) {
            z3 = 1;
            ComposerKt.traceEventStart(1416521139, i, i2, "androidx.compose.material3.Surface (Surface.kt:319)");
        } else {
            z3 = 1;
        }
        if (mutableInteractionSource2 == null) {
            composer.startReplaceGroup(1528105640);
            ComposerKt.sourceInformation(composer, "321@17328L39");
            ComposerKt.sourceInformationMarkerStart(composer, -227800934, "CC(remember):Surface.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer.updateRememberedValue(rememberedValue);
            }
            mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composer);
        } else {
            composer.startReplaceGroup(-227801585);
        }
        composer.endReplaceGroup();
        ProvidableCompositionLocal<Dp> providableCompositionLocal = LocalAbsoluteTonalElevation;
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(providableCompositionLocal);
        ComposerKt.sourceInformationMarkerEnd(composer);
        final float m9732constructorimpl3 = Dp.m9732constructorimpl(((Dp) consume).m9746unboximpl() + m9732constructorimpl);
        ProvidedValue[] providedValueArr = new ProvidedValue[2];
        providedValueArr[0] = ContentColorKt.getLocalContentColor().provides(Color.m6776boximpl(m2784contentColorForek8zF_U));
        providedValueArr[z3] = providableCompositionLocal.provides(Dp.m9730boximpl(m9732constructorimpl3));
        final BorderStroke borderStroke3 = borderStroke2;
        final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.rememberComposableLambda(1508735219, z3, new Function2() { // from class: androidx.compose.material3.SurfaceKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit Surface_d85dljk$lambda$1;
                Surface_d85dljk$lambda$1 = SurfaceKt.Surface_d85dljk$lambda$1(Modifier.this, rectangleShape, surface, m9732constructorimpl3, borderStroke3, z, mutableInteractionSource3, z4, function0, m9732constructorimpl2, function2, (Composer) obj, ((Integer) obj2).intValue());
                return Surface_d85dljk$lambda$1;
            }
        }, composer, 54), composer, ProvidedValue.$stable | 48);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Surface_d85dljk$lambda$1(Modifier modifier, Shape shape, long j, float f, BorderStroke borderStroke, boolean z, MutableInteractionSource mutableInteractionSource, boolean z2, Function0 function0, float f2, Function2 function2, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C334@17855L69,336@18027L7,327@17608L900:Surface.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1508735219, i, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:327)");
            }
            Modifier minimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier);
            long m4118surfaceColorAtElevationCLU3JFs = m4118surfaceColorAtElevationCLU3JFs(j, f, composer, 0);
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd(composer);
            Modifier childSemantics$default = ChildParentSemanticsKt.childSemantics$default(SelectableKt.m1543selectableO2vRcR0$default(m4117surfaceXOJAsU(minimumInteractiveComponentSize, shape, m4118surfaceColorAtElevationCLU3JFs, borderStroke, ((Density) consume).mo528toPx0680j_4(f2)), z, mutableInteractionSource, RippleKt.m3792rippleH2RKhps$default(false, 0.0f, 0L, 7, null), z2, null, function0, 16, null), null, 1, null);
            ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, childSemantics$default);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer m5864constructorimpl = Updater.m5864constructorimpl(composer);
            Updater.m5872setimpl(m5864constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 2010194061, "C348@18489L9:Surface.kt#uh7d8r");
            function2.invoke(composer, 0);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* renamed from: Surface-d85dljk, reason: not valid java name */
    public static final void m4114Surfaced85dljk(final boolean z, final Function1<? super Boolean, Unit> function1, Modifier modifier, boolean z2, Shape shape, long j, long j2, float f, float f2, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i, int i2, int i3) {
        boolean z3;
        ComposerKt.sourceInformationMarkerStart(composer, -1931279214, "C(Surface)N(checked,onCheckedChange,modifier,enabled,shape,color:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,tonalElevation:c#ui.unit.Dp,shadowElevation:c#ui.unit.Dp,border,interactionSource,content)421@23002L11,422@23049L22,431@23445L7,435@23619L926,432@23474L1071:Surface.kt#uh7d8r");
        final Modifier modifier2 = (i3 & 4) != 0 ? Modifier.INSTANCE : modifier;
        final boolean z4 = (i3 & 8) != 0 ? true : z2;
        final Shape rectangleShape = (i3 & 16) != 0 ? RectangleShapeKt.getRectangleShape() : shape;
        final long surface = (i3 & 32) != 0 ? MaterialTheme.INSTANCE.getColorScheme(composer, 6).getSurface() : j;
        long m2784contentColorForek8zF_U = (i3 & 64) != 0 ? ColorSchemeKt.m2784contentColorForek8zF_U(surface, composer, (i >> 15) & 14) : j2;
        float m9732constructorimpl = (i3 & 128) != 0 ? Dp.m9732constructorimpl(0) : f;
        final float m9732constructorimpl2 = (i3 & 256) != 0 ? Dp.m9732constructorimpl(0) : f2;
        BorderStroke borderStroke2 = (i3 & 512) != 0 ? null : borderStroke;
        MutableInteractionSource mutableInteractionSource2 = (i3 & 1024) == 0 ? mutableInteractionSource : null;
        if (ComposerKt.isTraceInProgress()) {
            z3 = 1;
            ComposerKt.traceEventStart(-1931279214, i, i2, "androidx.compose.material3.Surface (Surface.kt:428)");
        } else {
            z3 = 1;
        }
        if (mutableInteractionSource2 == null) {
            composer.startReplaceGroup(643383721);
            ComposerKt.sourceInformation(composer, "430@23349L39");
            ComposerKt.sourceInformationMarkerStart(composer, -533435015, "CC(remember):Surface.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer.updateRememberedValue(rememberedValue);
            }
            mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composer);
        } else {
            composer.startReplaceGroup(-533435666);
        }
        composer.endReplaceGroup();
        ProvidableCompositionLocal<Dp> providableCompositionLocal = LocalAbsoluteTonalElevation;
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(providableCompositionLocal);
        ComposerKt.sourceInformationMarkerEnd(composer);
        final float m9732constructorimpl3 = Dp.m9732constructorimpl(((Dp) consume).m9746unboximpl() + m9732constructorimpl);
        ProvidedValue[] providedValueArr = new ProvidedValue[2];
        providedValueArr[0] = ContentColorKt.getLocalContentColor().provides(Color.m6776boximpl(m2784contentColorForek8zF_U));
        providedValueArr[z3] = providableCompositionLocal.provides(Dp.m9730boximpl(m9732constructorimpl3));
        final BorderStroke borderStroke3 = borderStroke2;
        final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.rememberComposableLambda(-1839065134, z3, new Function2() { // from class: androidx.compose.material3.SurfaceKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit Surface_d85dljk$lambda$3;
                Surface_d85dljk$lambda$3 = SurfaceKt.Surface_d85dljk$lambda$3(Modifier.this, rectangleShape, surface, m9732constructorimpl3, borderStroke3, z, mutableInteractionSource3, z4, function1, m9732constructorimpl2, function2, (Composer) obj, ((Integer) obj2).intValue());
                return Surface_d85dljk$lambda$3;
            }
        }, composer, 54), composer, ProvidedValue.$stable | 48);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Surface_d85dljk$lambda$3(Modifier modifier, Shape shape, long j, float f, BorderStroke borderStroke, boolean z, MutableInteractionSource mutableInteractionSource, boolean z2, Function1 function1, float f2, Function2 function2, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C443@23876L69,445@24048L7,436@23629L910:Surface.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1839065134, i, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:436)");
            }
            Modifier minimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier);
            long m4118surfaceColorAtElevationCLU3JFs = m4118surfaceColorAtElevationCLU3JFs(j, f, composer, 0);
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd(composer);
            Modifier childSemantics$default = ChildParentSemanticsKt.childSemantics$default(ToggleableKt.m1550toggleableO2vRcR0$default(m4117surfaceXOJAsU(minimumInteractiveComponentSize, shape, m4118surfaceColorAtElevationCLU3JFs, borderStroke, ((Density) consume).mo528toPx0680j_4(f2)), z, mutableInteractionSource, RippleKt.m3792rippleH2RKhps$default(false, 0.0f, 0L, 7, null), z2, null, function1, 16, null), null, 1, null);
            ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, childSemantics$default);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer m5864constructorimpl = Updater.m5864constructorimpl(composer);
            Updater.m5872setimpl(m5864constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 1125458254, "C457@24520L9:Surface.kt#uh7d8r");
            function2.invoke(composer, 0);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* renamed from: surface-XO-JAsU, reason: not valid java name */
    private static final Modifier m4117surfaceXOJAsU(Modifier modifier, Shape shape, long j, BorderStroke borderStroke, float f) {
        Shape shape2;
        Modifier.Companion companion;
        if (f > 0.0f) {
            shape2 = shape;
            companion = GraphicsLayerModifierKt.m6953graphicsLayer_6ThJ44$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, shape2, false, null, 0L, 0L, 0, 0, null, 518111, null);
        } else {
            shape2 = shape;
            companion = Modifier.INSTANCE;
        }
        return ClipKt.clip(BackgroundKt.m352backgroundbw27NRU(modifier.then(companion).then(borderStroke != null ? BorderKt.border(Modifier.INSTANCE, borderStroke, shape2) : Modifier.INSTANCE), j, shape2), shape2);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0057  */
    /* renamed from: Surface-vz2T9sI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m4116Surfacevz2T9sI(final ColorProducer colorProducer, final Modifier modifier, float f, float f2, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        float f3;
        int i4;
        float f4;
        final float f5;
        final float f6;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-1185311536);
        ComposerKt.sourceInformation(startRestartGroup, "C(Surface)N(backgroundColor,modifier,tonalElevation:c#ui.unit.Dp,shadowElevation:c#ui.unit.Dp,content)492@25415L7,493@25499L7,494@25543L11,495@25640L1141,495@25559L1222:Surface.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(colorProducer) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            f3 = f;
            i3 |= startRestartGroup.changed(f3) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                f4 = f2;
                i3 |= startRestartGroup.changed(f4) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    i3 |= startRestartGroup.changedInstance(function2) ? 16384 : 8192;
                }
                if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    f5 = f3;
                    f6 = f4;
                } else {
                    final float m9732constructorimpl = i5 != 0 ? Dp.m9732constructorimpl(0) : f3;
                    final float m9732constructorimpl2 = i4 != 0 ? Dp.m9732constructorimpl(0) : f4;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1185311536, i3, -1, "androidx.compose.material3.Surface (Surface.kt:491)");
                    }
                    ProvidableCompositionLocal<Dp> providableCompositionLocal = LocalAbsoluteTonalElevation;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume = startRestartGroup.consume(providableCompositionLocal);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    float m9732constructorimpl3 = Dp.m9732constructorimpl(((Dp) consume).m9746unboximpl() + m9732constructorimpl);
                    ProvidableCompositionLocal<Boolean> localTonalElevationEnabled = ColorSchemeKt.getLocalTonalElevationEnabled();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume2 = startRestartGroup.consume(localTonalElevationEnabled);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final boolean booleanValue = ((Boolean) consume2).booleanValue();
                    final ColorScheme colorScheme = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, 6);
                    CompositionLocalKt.CompositionLocalProvider(providableCompositionLocal.provides(Dp.m9730boximpl(m9732constructorimpl3)), ComposableLambdaKt.rememberComposableLambda(85870608, true, new Function2() { // from class: androidx.compose.material3.SurfaceKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit Surface_vz2T9sI$lambda$0;
                            Surface_vz2T9sI$lambda$0 = SurfaceKt.Surface_vz2T9sI$lambda$0(Modifier.this, m9732constructorimpl2, colorProducer, colorScheme, booleanValue, m9732constructorimpl, function2, (Composer) obj, ((Integer) obj2).intValue());
                            return Surface_vz2T9sI$lambda$0;
                        }
                    }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f6 = m9732constructorimpl2;
                    f5 = m9732constructorimpl;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.SurfaceKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit Surface_vz2T9sI$lambda$1;
                            Surface_vz2T9sI$lambda$1 = SurfaceKt.Surface_vz2T9sI$lambda$1(ColorProducer.this, modifier, f5, f6, function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return Surface_vz2T9sI$lambda$1;
                        }
                    });
                    return;
                }
                return;
            }
            f4 = f2;
            if ((i & 24576) == 0) {
            }
            if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        f3 = f;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        f4 = f2;
        if ((i & 24576) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Surface_vz2T9sI$lambda$0$0$0(float f, GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.setShadowElevation(graphicsLayerScope.mo528toPx0680j_4(f));
        graphicsLayerScope.setClip(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Surface_vz2T9sI$lambda$0$1$0(ColorProducer colorProducer, ColorScheme colorScheme, boolean z, float f, DrawScope drawScope) {
        long mo3041invoke0d7_KjU = colorProducer.mo3041invoke0d7_KjU();
        if (Color.m6787equalsimpl0(mo3041invoke0d7_KjU, colorScheme.getSurface()) && z) {
            mo3041invoke0d7_KjU = ColorSchemeKt.m2797surfaceColorAtElevation3ABfNKs(colorScheme, f);
        }
        DrawScope.CC.m7379drawRectnJ9OG0$default(drawScope, mo3041invoke0d7_KjU, 0L, 0L, 0.0f, null, null, 0, 126, null);
        return Unit.INSTANCE;
    }

    /* renamed from: surfaceColorAtElevation-CLU3JFs, reason: not valid java name */
    private static final long m4118surfaceColorAtElevationCLU3JFs(long j, float f, Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, -2079918090, "C(surfaceColorAtElevation)N(color:c#ui.graphics.Color,elevation:c#ui.unit.Dp)530@26889L11,530@26901L37:Surface.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2079918090, i, -1, "androidx.compose.material3.surfaceColorAtElevation (Surface.kt:530)");
        }
        long m2782applyTonalElevationRFCenO8 = ColorSchemeKt.m2782applyTonalElevationRFCenO8(MaterialTheme.INSTANCE.getColorScheme(composer, 6), j, f, composer, (i << 3) & PointerIconCompat.TYPE_TEXT);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return m2782applyTonalElevationRFCenO8;
    }

    public static final ProvidableCompositionLocal<Dp> getLocalAbsoluteTonalElevation() {
        return LocalAbsoluteTonalElevation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Surface_vz2T9sI$lambda$0(Modifier modifier, final float f, final ColorProducer colorProducer, final ColorScheme colorScheme, final boolean z, final float f2, Function2 function2, Composer composer, int i) {
        Modifier.Companion companion;
        ComposerKt.sourceInformation(composer, "C509@26140L591,496@25650L1125:Surface.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(85870608, i, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:496)");
            }
            if (Dp.m9731compareTo0680j_4(f, Dp.m9732constructorimpl(0)) > 0) {
                composer.startReplaceGroup(-1629077399);
                ComposerKt.sourceInformation(composer, "501@25835L154");
                Modifier.Companion companion2 = Modifier.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer, 917282058, "CC(remember):Surface.kt#9igjgp");
                boolean changed = composer.changed(f);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function1() { // from class: androidx.compose.material3.SurfaceKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit Surface_vz2T9sI$lambda$0$0$0;
                            Surface_vz2T9sI$lambda$0$0$0 = SurfaceKt.Surface_vz2T9sI$lambda$0$0$0(f, (GraphicsLayerScope) obj);
                            return Surface_vz2T9sI$lambda$0$0$0;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                companion = GraphicsLayerModifierKt.graphicsLayer(companion2, (Function1) rememberedValue);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1628845550);
                composer.endReplaceGroup();
                companion = Modifier.INSTANCE;
            }
            Modifier then = modifier.then(companion);
            ComposerKt.sourceInformationMarkerStart(composer, 917292255, "CC(remember):Surface.kt#9igjgp");
            boolean changedInstance = composer.changedInstance(colorProducer) | composer.changed(colorScheme) | composer.changed(z) | composer.changed(f2);
            Object rememberedValue2 = composer.rememberedValue();
            if (changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function1() { // from class: androidx.compose.material3.SurfaceKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit Surface_vz2T9sI$lambda$0$1$0;
                        Surface_vz2T9sI$lambda$0$1$0 = SurfaceKt.Surface_vz2T9sI$lambda$0$1$0(ColorProducer.this, colorScheme, z, f2, (DrawScope) obj);
                        return Surface_vz2T9sI$lambda$0$1$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            Modifier drawBehind = DrawModifierKt.drawBehind(then, (Function1) rememberedValue2);
            ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, drawBehind);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer m5864constructorimpl = Updater.m5864constructorimpl(composer);
            Updater.m5872setimpl(m5864constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 1732559696, "C523@26756L9:Surface.kt#uh7d8r");
            function2.invoke(composer, 0);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Dp LocalAbsoluteTonalElevation$lambda$0() {
        return Dp.m9730boximpl(Dp.m9732constructorimpl(0));
    }
}
