package androidx.compose.foundation.border;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathOperation;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.graphics.layer.CompositingStrategy;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.IntSize;
import androidx.core.location.LocationRequestCompat;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;

/* compiled from: BorderLogic.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003JM\u0010\r\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0014\u001a\u00020\n2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\u0006\u0010\u0017\u001a\u00020\f2\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u001c\u001a\u00020\bH\u0082\bJ7\u0010\u001d\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\u00112\u0006\u0010\u0014\u001a\u00020\n2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\u0006\u0010\u0017\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u0005H\u0002J)\u0010 \u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\u00112\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020!H\u0002J)\u0010\"\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\u00112\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020#H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R!\u0010\r\u001a\u0015\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e¢\u0006\u0002\b\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Landroidx/compose/foundation/border/BorderLogic;", "", "<init>", "()V", "borderPath", "Landroidx/compose/ui/graphics/Path;", "borderWidth", "Lkotlin/Function0;", "", "lastBrush", "Landroidx/compose/ui/graphics/Brush;", "lastOutline", "Landroidx/compose/ui/graphics/Outline;", "drawBorder", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "Lkotlin/ExtensionFunctionType;", "drawScope", "width", "brush", "graphicsLayerProvider", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "outline", "offset", "Landroidx/compose/ui/geometry/Offset;", "drawBorder-2gY9BTk$foundation", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/graphics/Outline;J)V", "strokeWidthPx", "createDrawGenericBorder", "Landroidx/compose/ui/graphics/Outline$Generic;", "obtainPath", "createDrawRoundRectBorder", "Landroidx/compose/ui/graphics/Outline$Rounded;", "createDrawRectBorder", "Landroidx/compose/ui/graphics/Outline$Rectangle;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class BorderLogic {
    public static final int $stable = 8;
    private Path borderPath;
    private Function0<Float> borderWidth;
    private Function1<? super DrawScope, Unit> drawBorder;
    private Brush lastBrush;
    private Outline lastOutline;

    /* renamed from: drawBorder-2gY9BTk$foundation, reason: not valid java name */
    public final void m468drawBorder2gY9BTk$foundation(DrawScope drawScope, Function0<Float> width, Brush brush, Function0<GraphicsLayer> graphicsLayerProvider, Outline outline, long offset) {
        Function1<DrawScope, Unit> createDrawRectBorder;
        this.borderWidth = width;
        if (!Intrinsics.areEqual(brush, this.lastBrush) || !Intrinsics.areEqual(outline, this.lastOutline) || this.drawBorder == null) {
            this.lastBrush = brush;
            this.lastOutline = outline;
            if (outline instanceof Outline.Generic) {
                createDrawRectBorder = createDrawGenericBorder(brush, graphicsLayerProvider, (Outline.Generic) outline);
            } else if (outline instanceof Outline.Rounded) {
                createDrawRectBorder = createDrawRoundRectBorder(brush, (Outline.Rounded) outline);
            } else {
                if (!(outline instanceof Outline.Rectangle)) {
                    throw new NoWhenBranchMatchedException();
                }
                createDrawRectBorder = createDrawRectBorder(brush, (Outline.Rectangle) outline);
            }
            this.drawBorder = createDrawRectBorder;
        }
        if (Offset.m6516equalsimpl0(offset, Offset.INSTANCE.m6535getZeroF1C5BW0())) {
            Function1<? super DrawScope, Unit> function1 = this.drawBorder;
            Intrinsics.checkNotNull(function1);
            function1.invoke(drawScope);
            return;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (offset >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & offset));
        drawScope.getDrawContext().getTransform().translate(intBitsToFloat, intBitsToFloat2);
        try {
            Function1<? super DrawScope, Unit> function12 = this.drawBorder;
            Intrinsics.checkNotNull(function12);
            function12.invoke(drawScope);
        } finally {
            drawScope.getDrawContext().getTransform().translate(-intBitsToFloat, -intBitsToFloat2);
        }
    }

    private final float strokeWidthPx() {
        Function0<Float> function0 = this.borderWidth;
        Intrinsics.checkNotNull(function0);
        return RangesKt.coerceAtLeast(function0.invoke().floatValue(), 0.0f);
    }

    private final Function1<DrawScope, Unit> createDrawGenericBorder(final Brush brush, final Function0<GraphicsLayer> graphicsLayerProvider, final Outline.Generic outline) {
        final Rect bounds = outline.getPath().getBounds();
        final float minDimension = bounds.getMinDimension();
        final Path obtainPath = obtainPath();
        obtainPath.reset();
        Path.CC.addRect$default(obtainPath, bounds, null, 2, null);
        obtainPath.mo6654opN5in7k0(obtainPath, outline.getPath(), PathOperation.INSTANCE.m7104getDifferenceb3I0S0c());
        final long m9902constructorimpl = IntSize.m9902constructorimpl((((int) Math.ceil(bounds.getBottom() - bounds.getTop())) & 4294967295L) | (((int) Math.ceil(bounds.getRight() - bounds.getLeft())) << 32));
        return new Function1() { // from class: androidx.compose.foundation.border.BorderLogic$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit createDrawGenericBorder$lambda$1;
                createDrawGenericBorder$lambda$1 = BorderLogic.createDrawGenericBorder$lambda$1(BorderLogic.this, minDimension, outline, brush, graphicsLayerProvider, bounds, m9902constructorimpl, obtainPath, (DrawScope) obj);
                return createDrawGenericBorder$lambda$1;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createDrawGenericBorder$lambda$1$0$0(Rect rect, Outline.Generic generic, Brush brush, float f, Path path, DrawScope drawScope) {
        float f2 = -rect.getLeft();
        float f3 = -rect.getTop();
        drawScope.getDrawContext().getTransform().translate(f2, f3);
        try {
            DrawScope.CC.m7374drawPathGBMwjPU$default(drawScope, generic.getPath(), brush, 0.0f, new Stroke(f * 2, 0.0f, 0, 0, null, 30, null), null, 0, 52, null);
            float f4 = 1;
            float intBitsToFloat = (Float.intBitsToFloat((int) (drawScope.mo7294getSizeNHjbRc() >> 32)) + f4) / Float.intBitsToFloat((int) (drawScope.mo7294getSizeNHjbRc() >> 32));
            float intBitsToFloat2 = (Float.intBitsToFloat((int) (drawScope.mo7294getSizeNHjbRc() & 4294967295L)) + f4) / Float.intBitsToFloat((int) (drawScope.mo7294getSizeNHjbRc() & 4294967295L));
            long mo7293getCenterF1C5BW0 = drawScope.mo7293getCenterF1C5BW0();
            DrawContext drawContext = drawScope.getDrawContext();
            long mo7301getSizeNHjbRc = drawContext.mo7301getSizeNHjbRc();
            drawContext.getCanvas().save();
            try {
                drawContext.getTransform().mo7308scale0AR0LA0(intBitsToFloat, intBitsToFloat2, mo7293getCenterF1C5BW0);
                DrawScope.CC.m7374drawPathGBMwjPU$default(drawScope, path, brush, 0.0f, null, null, BlendMode.INSTANCE.m6699getClear0nO6VwU(), 28, null);
                drawScope.getDrawContext().getTransform().translate(-f2, -f3);
                return Unit.INSTANCE;
            } finally {
                drawContext.getCanvas().restore();
                drawContext.mo7302setSizeuvyYCjk(mo7301getSizeNHjbRc);
            }
        } catch (Throwable th) {
            drawScope.getDrawContext().getTransform().translate(-f2, -f3);
            throw th;
        }
    }

    private final Path obtainPath() {
        Path path = this.borderPath;
        if (path != null) {
            return path;
        }
        Path Path = AndroidPath_androidKt.Path();
        this.borderPath = Path;
        return Path;
    }

    private final Function1<DrawScope, Unit> createDrawRoundRectBorder(final Brush brush, Outline.Rounded outline) {
        final RoundRect roundRect = outline.getRoundRect();
        if (RoundRectKt.isSimple(roundRect)) {
            return new Function1() { // from class: androidx.compose.foundation.border.BorderLogic$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit createDrawRoundRectBorder$lambda$0;
                    createDrawRoundRectBorder$lambda$0 = BorderLogic.createDrawRoundRectBorder$lambda$0(BorderLogic.this, roundRect, brush, (DrawScope) obj);
                    return createDrawRoundRectBorder$lambda$0;
                }
            };
        }
        final Path obtainPath = obtainPath();
        final Ref.FloatRef floatRef = new Ref.FloatRef();
        floatRef.element = Float.NaN;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        return new Function1() { // from class: androidx.compose.foundation.border.BorderLogic$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit createDrawRoundRectBorder$lambda$1;
                createDrawRoundRectBorder$lambda$1 = BorderLogic.createDrawRoundRectBorder$lambda$1(BorderLogic.this, roundRect, floatRef, objectRef, obtainPath, brush, (DrawScope) obj);
                return createDrawRoundRectBorder$lambda$1;
            }
        };
    }

    private final Function1<DrawScope, Unit> createDrawRectBorder(final Brush brush, Outline.Rectangle outline) {
        final Rect rect = outline.getRect();
        return new Function1() { // from class: androidx.compose.foundation.border.BorderLogic$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit createDrawRectBorder$lambda$0;
                createDrawRectBorder$lambda$0 = BorderLogic.createDrawRectBorder$lambda$0(BorderLogic.this, rect, brush, (DrawScope) obj);
                return createDrawRectBorder$lambda$0;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createDrawGenericBorder$lambda$1(BorderLogic borderLogic, float f, final Outline.Generic generic, final Brush brush, Function0 function0, final Rect rect, long j, final Path path, DrawScope drawScope) {
        Function0<Float> function02 = borderLogic.borderWidth;
        Intrinsics.checkNotNull(function02);
        final float coerceAtLeast = RangesKt.coerceAtLeast(function02.invoke().floatValue(), 0.0f);
        if (2 * coerceAtLeast > f) {
            DrawScope.CC.m7374drawPathGBMwjPU$default(drawScope, generic.getPath(), brush, 0.0f, null, null, 0, 60, null);
        } else {
            GraphicsLayer graphicsLayer = (GraphicsLayer) function0.invoke();
            graphicsLayer.m7479setCompositingStrategyWpw9cng(CompositingStrategy.INSTANCE.m7464getOffscreenke2Ky5w());
            float left = rect.getLeft();
            float top = rect.getTop();
            drawScope.getDrawContext().getTransform().translate(left, top);
            try {
                drawScope.mo7295recordJVtK1S4(graphicsLayer, j, new Function1() { // from class: androidx.compose.foundation.border.BorderLogic$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit createDrawGenericBorder$lambda$1$0$0;
                        createDrawGenericBorder$lambda$1$0$0 = BorderLogic.createDrawGenericBorder$lambda$1$0$0(Rect.this, generic, brush, coerceAtLeast, path, (DrawScope) obj);
                        return createDrawGenericBorder$lambda$1$0$0;
                    }
                });
                GraphicsLayerKt.drawLayer(drawScope, graphicsLayer);
            } finally {
                drawScope.getDrawContext().getTransform().translate(-left, -top);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createDrawRoundRectBorder$lambda$0(BorderLogic borderLogic, RoundRect roundRect, Brush brush, DrawScope drawScope) {
        long m470shrinkKibmq7A;
        Function0<Float> function0 = borderLogic.borderWidth;
        Intrinsics.checkNotNull(function0);
        float coerceAtLeast = RangesKt.coerceAtLeast(function0.invoke().floatValue(), 0.0f);
        float f = 2;
        float f2 = coerceAtLeast / f;
        boolean z = f * coerceAtLeast > RoundRectKt.getMinDimension(roundRect);
        long m6569getTopLeftCornerRadiuskKHJgLs = roundRect.m6569getTopLeftCornerRadiuskKHJgLs();
        Stroke stroke = new Stroke(coerceAtLeast, 0.0f, 0, 0, null, 30, null);
        if (z) {
            float left = roundRect.getLeft();
            long m6511constructorimpl = Offset.m6511constructorimpl((Float.floatToRawIntBits(roundRect.getTop()) & 4294967295L) | (Float.floatToRawIntBits(left) << 32));
            float width = roundRect.getWidth();
            DrawScope.CC.m7380drawRoundRectZuiqVtQ$default(drawScope, brush, m6511constructorimpl, Size.m6579constructorimpl((Float.floatToRawIntBits(roundRect.getHeight()) & 4294967295L) | (Float.floatToRawIntBits(width) << 32)), m6569getTopLeftCornerRadiuskKHJgLs, 0.0f, null, null, 0, 240, null);
        } else if (Float.intBitsToFloat((int) (m6569getTopLeftCornerRadiuskKHJgLs >> 32)) < f2) {
            float left2 = roundRect.getLeft() + coerceAtLeast;
            float top = roundRect.getTop() + coerceAtLeast;
            float right = roundRect.getRight() - coerceAtLeast;
            float bottom = roundRect.getBottom() - coerceAtLeast;
            int m6774getDifferencertfAjoo = ClipOp.INSTANCE.m6774getDifferencertfAjoo();
            DrawContext drawContext = drawScope.getDrawContext();
            long mo7301getSizeNHjbRc = drawContext.mo7301getSizeNHjbRc();
            drawContext.getCanvas().save();
            try {
                drawContext.getTransform().mo7304clipRectN_I0leg(left2, top, right, bottom, m6774getDifferencertfAjoo);
                long m6511constructorimpl2 = Offset.m6511constructorimpl((Float.floatToRawIntBits(roundRect.getLeft()) << 32) | (Float.floatToRawIntBits(roundRect.getTop()) & 4294967295L));
                float width2 = roundRect.getWidth();
                DrawScope.CC.m7380drawRoundRectZuiqVtQ$default(drawScope, brush, m6511constructorimpl2, Size.m6579constructorimpl((4294967295L & Float.floatToRawIntBits(roundRect.getHeight())) | (Float.floatToRawIntBits(width2) << 32)), m6569getTopLeftCornerRadiuskKHJgLs, 0.0f, null, null, 0, 240, null);
            } finally {
                drawContext.getCanvas().restore();
                drawContext.mo7302setSizeuvyYCjk(mo7301getSizeNHjbRc);
            }
        } else {
            long m6511constructorimpl3 = Offset.m6511constructorimpl((Float.floatToRawIntBits(roundRect.getLeft() + f2) << 32) | (Float.floatToRawIntBits(roundRect.getTop() + f2) & 4294967295L));
            float width3 = roundRect.getWidth() - coerceAtLeast;
            long m6579constructorimpl = Size.m6579constructorimpl((4294967295L & Float.floatToRawIntBits(roundRect.getHeight() - coerceAtLeast)) | (Float.floatToRawIntBits(width3) << 32));
            m470shrinkKibmq7A = BorderLogicKt.m470shrinkKibmq7A(m6569getTopLeftCornerRadiuskKHJgLs, f2);
            DrawScope.CC.m7380drawRoundRectZuiqVtQ$default(drawScope, brush, m6511constructorimpl3, m6579constructorimpl, m470shrinkKibmq7A, 0.0f, stroke, null, 0, 208, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r10v1, types: [T, androidx.compose.ui.graphics.Path] */
    public static final Unit createDrawRoundRectBorder$lambda$1(BorderLogic borderLogic, RoundRect roundRect, Ref.FloatRef floatRef, Ref.ObjectRef objectRef, Path path, Brush brush, DrawScope drawScope) {
        ?? createRoundRectPath;
        Function0<Float> function0 = borderLogic.borderWidth;
        Intrinsics.checkNotNull(function0);
        float coerceAtLeast = RangesKt.coerceAtLeast(function0.invoke().floatValue(), 0.0f);
        boolean z = ((float) 2) * coerceAtLeast > RoundRectKt.getMinDimension(roundRect);
        if (floatRef.element != coerceAtLeast) {
            createRoundRectPath = BorderLogicKt.createRoundRectPath(path, roundRect, coerceAtLeast, z);
            objectRef.element = createRoundRectPath;
            floatRef.element = coerceAtLeast;
        }
        T t = objectRef.element;
        Intrinsics.checkNotNull(t);
        DrawScope.CC.m7374drawPathGBMwjPU$default(drawScope, (Path) t, brush, 0.0f, null, null, 0, 60, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createDrawRectBorder$lambda$0(BorderLogic borderLogic, Rect rect, Brush brush, DrawScope drawScope) {
        long m6511constructorimpl;
        long m6579constructorimpl;
        Function0<Float> function0 = borderLogic.borderWidth;
        Intrinsics.checkNotNull(function0);
        float coerceAtLeast = RangesKt.coerceAtLeast(function0.invoke().floatValue(), 0.0f);
        float f = 2;
        boolean z = coerceAtLeast * f > rect.getMinDimension();
        if (z) {
            m6511constructorimpl = rect.m6554getTopLeftF1C5BW0();
        } else {
            float left = rect.getLeft() + (coerceAtLeast / f);
            m6511constructorimpl = Offset.m6511constructorimpl((Float.floatToRawIntBits(rect.getTop() + r0) & 4294967295L) | (Float.floatToRawIntBits(left) << 32));
        }
        long j = m6511constructorimpl;
        if (z) {
            m6579constructorimpl = rect.m6552getSizeNHjbRc();
        } else {
            float right = (rect.getRight() - rect.getLeft()) - coerceAtLeast;
            m6579constructorimpl = Size.m6579constructorimpl((4294967295L & Float.floatToRawIntBits((rect.getBottom() - rect.getTop()) - coerceAtLeast)) | (Float.floatToRawIntBits(right) << 32));
        }
        DrawScope.CC.m7378drawRectAsUm42w$default(drawScope, brush, j, m6579constructorimpl, 0.0f, z ? Fill.INSTANCE : new Stroke(coerceAtLeast, 0.0f, 0, 0, null, 30, null), null, 0, LocationRequestCompat.QUALITY_LOW_POWER, null);
        return Unit.INSTANCE;
    }
}
