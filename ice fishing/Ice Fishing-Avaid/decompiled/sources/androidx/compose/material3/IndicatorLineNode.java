package androidx.compose.material3;

import androidx.compose.animation.ColorVectorConverterKt;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.tokens.FilledTextFieldTokens;
import androidx.compose.ui.draw.CacheDrawModifierNode;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.OutlineKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Dp;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: TextField.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002BC\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010JI\u0010%\u001a\u00020&2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b'\u0010(J\b\u0010,\u001a\u00020&H\u0016J\u000e\u0010-\u001a\u00020&H\u0082@¢\u0006\u0002\u0010.J\b\u0010/\u001a\u00020&H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0011R\u0010\u0010\u000e\u001a\u00020\rX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u001d\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000b@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u001a\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020$0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010)\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u000e\u00100\u001a\u000201X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Landroidx/compose/material3/IndicatorLineNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "enabled", "", "isError", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "colors", "Landroidx/compose/material3/TextFieldColors;", "textFieldShape", "Landroidx/compose/ui/graphics/Shape;", "focusedIndicatorWidth", "Landroidx/compose/ui/unit/Dp;", "unfocusedIndicatorWidth", "<init>", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/ui/graphics/Shape;FFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "F", "focused", "trackFocusStateJob", "Lkotlinx/coroutines/Job;", "_colors", "getColors", "()Landroidx/compose/material3/TextFieldColors;", "colorAnimatable", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/ui/graphics/Color;", "Landroidx/compose/animation/core/AnimationVector4D;", "value", "_shape", "set_shape", "(Landroidx/compose/ui/graphics/Shape;)V", "shape", "getShape", "()Landroidx/compose/ui/graphics/Shape;", "widthAnimatable", "Landroidx/compose/animation/core/AnimationVector1D;", "update", "", "update-gv0btCI", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/ui/graphics/Shape;FF)V", "shouldAutoInvalidate", "getShouldAutoInvalidate", "()Z", "onAttach", "trackFocusState", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invalidateIndicator", "drawWithCacheModifierNode", "Landroidx/compose/ui/draw/CacheDrawModifierNode;", "material3"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class IndicatorLineNode extends DelegatingNode implements CompositionLocalConsumerModifierNode {
    public static final int $stable = 8;
    private TextFieldColors _colors;
    private Shape _shape;
    private Animatable<Color, AnimationVector4D> colorAnimatable;
    private final CacheDrawModifierNode drawWithCacheModifierNode;
    private boolean enabled;
    private boolean focused;
    private float focusedIndicatorWidth;
    private InteractionSource interactionSource;
    private boolean isError;
    private Job trackFocusStateJob;
    private float unfocusedIndicatorWidth;
    private final Animatable<Dp, AnimationVector1D> widthAnimatable;

    public /* synthetic */ IndicatorLineNode(boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors textFieldColors, Shape shape, float f, float f2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, interactionSource, textFieldColors, shape, f, f2);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    private IndicatorLineNode(boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors textFieldColors, Shape shape, float f, float f2) {
        this.enabled = z;
        this.isError = z2;
        this.interactionSource = interactionSource;
        this.focusedIndicatorWidth = f;
        this.unfocusedIndicatorWidth = f2;
        this._colors = textFieldColors;
        this._shape = shape;
        this.widthAnimatable = new Animatable<>(Dp.m9730boximpl((this.focused && this.enabled) ? this.focusedIndicatorWidth : this.unfocusedIndicatorWidth), VectorConvertersKt.getVectorConverter(Dp.INSTANCE), null, null, 12, null);
        this.drawWithCacheModifierNode = (CacheDrawModifierNode) delegate(DrawModifierKt.CacheDrawModifierNode(new Function1() { // from class: androidx.compose.material3.IndicatorLineNode$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                DrawResult drawWithCacheModifierNode$lambda$0;
                drawWithCacheModifierNode$lambda$0 = IndicatorLineNode.drawWithCacheModifierNode$lambda$0(IndicatorLineNode.this, (CacheDrawScope) obj);
                return drawWithCacheModifierNode$lambda$0;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextFieldColors getColors() {
        TextFieldColors textFieldColors = this._colors;
        if (textFieldColors != null) {
            return textFieldColors;
        }
        IndicatorLineNode indicatorLineNode = this;
        return TextFieldDefaults.INSTANCE.defaultTextFieldColors$material3(((MaterialTheme.Values) CompositionLocalConsumerModifierNodeKt.currentValueOf(indicatorLineNode, MaterialTheme.INSTANCE.getLocalMaterialTheme())).getColorScheme(), (TextSelectionColors) CompositionLocalConsumerModifierNodeKt.currentValueOf(indicatorLineNode, TextSelectionColorsKt.getLocalTextSelectionColors()));
    }

    private final void set_shape(Shape shape) {
        if (Intrinsics.areEqual(this._shape, shape)) {
            return;
        }
        this._shape = shape;
        this.drawWithCacheModifierNode.invalidateDrawCache();
    }

    private final Shape getShape() {
        Shape shape = this._shape;
        return shape == null ? ShapesKt.fromToken(((MaterialTheme.Values) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, MaterialTheme.INSTANCE.getLocalMaterialTheme())).getShapes(), FilledTextFieldTokens.INSTANCE.getContainerShape()) : shape;
    }

    /* renamed from: update-gv0btCI, reason: not valid java name */
    public final void m3364updategv0btCI(boolean enabled, boolean isError, InteractionSource interactionSource, TextFieldColors colors, Shape textFieldShape, float focusedIndicatorWidth, float unfocusedIndicatorWidth) {
        boolean z;
        Job launch$default;
        boolean z2 = true;
        if (this.enabled != enabled) {
            this.enabled = enabled;
            z = true;
        } else {
            z = false;
        }
        if (this.isError != isError) {
            this.isError = isError;
            z = true;
        }
        if (this.interactionSource != interactionSource) {
            this.interactionSource = interactionSource;
            Job job = this.trackFocusStateJob;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            launch$default = BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new IndicatorLineNode$update$1(this, null), 3, null);
            this.trackFocusStateJob = launch$default;
        }
        if (!Intrinsics.areEqual(this._colors, colors)) {
            this._colors = colors;
            z = true;
        }
        if (!Intrinsics.areEqual(this._shape, textFieldShape)) {
            set_shape(textFieldShape);
            z = true;
        }
        if (!Dp.m9737equalsimpl0(this.focusedIndicatorWidth, focusedIndicatorWidth)) {
            this.focusedIndicatorWidth = focusedIndicatorWidth;
            z = true;
        }
        if (Dp.m9737equalsimpl0(this.unfocusedIndicatorWidth, unfocusedIndicatorWidth)) {
            z2 = z;
        } else {
            this.unfocusedIndicatorWidth = unfocusedIndicatorWidth;
        }
        if (z2) {
            invalidateIndicator();
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new IndicatorLineNode$onAttach$1(this, null), 3, null);
        this.trackFocusStateJob = launch$default;
        if (this.colorAnimatable == null) {
            long m4235indicatorColorXeAY9LY = getColors().m4235indicatorColorXeAY9LY(this.enabled, this.isError, this.focused);
            this.colorAnimatable = new Animatable<>(Color.m6776boximpl(m4235indicatorColorXeAY9LY), ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(Color.m6790getColorSpaceimpl(m4235indicatorColorXeAY9LY)), null, null, 12, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object trackFocusState(Continuation<? super Unit> continuation) {
        this.focused = false;
        final ArrayList arrayList = new ArrayList();
        Object collect = this.interactionSource.getInteractions().collect(new FlowCollector() { // from class: androidx.compose.material3.IndicatorLineNode$trackFocusState$2
            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation2) {
                return emit((Interaction) obj, (Continuation<? super Unit>) continuation2);
            }

            public final Object emit(Interaction interaction, Continuation<? super Unit> continuation2) {
                boolean z;
                if (interaction instanceof FocusInteraction.Focus) {
                    arrayList.add(interaction);
                } else if (interaction instanceof FocusInteraction.Unfocus) {
                    arrayList.remove(((FocusInteraction.Unfocus) interaction).getFocus());
                }
                boolean z2 = !arrayList.isEmpty();
                z = this.focused;
                if (z2 != z) {
                    this.focused = z2;
                    this.invalidateIndicator();
                }
                return Unit.INSTANCE;
            }
        }, continuation);
        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invalidateIndicator() {
        BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new IndicatorLineNode$invalidateIndicator$1(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new IndicatorLineNode$invalidateIndicator$2(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DrawResult drawWithCacheModifierNode$lambda$0(final IndicatorLineNode indicatorLineNode, CacheDrawScope cacheDrawScope) {
        float mo528toPx0680j_4 = cacheDrawScope.mo528toPx0680j_4(indicatorLineNode.widthAnimatable.getValue().m9746unboximpl());
        Path Path = AndroidPath_androidKt.Path();
        OutlineKt.addOutline(Path, indicatorLineNode.getShape().mo422createOutlinePq9zytI(cacheDrawScope.m6299getSizeNHjbRc(), cacheDrawScope.getLayoutDirection(), cacheDrawScope));
        Path Path2 = AndroidPath_androidKt.Path();
        Path.CC.addRect$default(Path2, new Rect(0.0f, Float.intBitsToFloat((int) (cacheDrawScope.m6299getSizeNHjbRc() & 4294967295L)) - mo528toPx0680j_4, Float.intBitsToFloat((int) (cacheDrawScope.m6299getSizeNHjbRc() >> 32)), Float.intBitsToFloat((int) (4294967295L & cacheDrawScope.m6299getSizeNHjbRc()))), null, 2, null);
        final Path and = Path2.and(Path);
        return cacheDrawScope.onDrawWithContent(new Function1() { // from class: androidx.compose.material3.IndicatorLineNode$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit drawWithCacheModifierNode$lambda$0$2;
                drawWithCacheModifierNode$lambda$0$2 = IndicatorLineNode.drawWithCacheModifierNode$lambda$0$2(Path.this, indicatorLineNode, (ContentDrawScope) obj);
                return drawWithCacheModifierNode$lambda$0$2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit drawWithCacheModifierNode$lambda$0$2(Path path, IndicatorLineNode indicatorLineNode, ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        Animatable<Color, AnimationVector4D> animatable = indicatorLineNode.colorAnimatable;
        Intrinsics.checkNotNull(animatable);
        DrawScope.CC.m7374drawPathGBMwjPU$default(contentDrawScope, path, new SolidColor(animatable.getValue().m6796unboximpl(), null), 0.0f, null, null, 0, 60, null);
        return Unit.INSTANCE;
    }
}
