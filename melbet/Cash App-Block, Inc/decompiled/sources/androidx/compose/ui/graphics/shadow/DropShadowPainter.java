package androidx.compose.ui.graphics.shadow;

import androidx.camera.video.Recorder;
import androidx.collection.MutableScatterMap;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import coil3.Extras;
import kotlin.ranges.RangesKt___RangesKt;

/* loaded from: classes3.dex */
public final class DropShadowPainter extends Painter {
    public float alpha = 1.0f;
    public ColorFilter colorFilter;
    public final Recorder.AnonymousClass4 renderCreator;
    public final Shadow shadow;
    public final Shape shape;

    public DropShadowPainter(Shape shape, Shadow shadow, Recorder.AnonymousClass4 anonymousClass4) {
        this.shape = shape;
        this.shadow = shadow;
        this.renderCreator = anonymousClass4;
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean applyAlpha(float f) {
        this.alpha = f;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean applyColorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean applyLayoutDirection(LayoutDirection layoutDirection) {
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public final long mo759getIntrinsicSizeNHjbRc() {
        return 9205357640488583168L;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final void onDraw(DrawScope drawScope) {
        DropShadowRenderer dropShadowRenderer;
        Recorder.AnonymousClass4 anonymousClass4 = this.renderCreator;
        Shape shape = this.shape;
        long mo753getSizeNHjbRc = drawScope.mo753getSizeNHjbRc();
        LayoutDirection layoutDirection = drawScope.getLayoutDirection();
        Shadow shadow = this.shadow;
        synchronized (anonymousClass4) {
            AndroidShadowContext$ShadowKey androidShadowContext$ShadowKey = (AndroidShadowContext$ShadowKey) anonymousClass4.this$0;
            if (androidShadowContext$ShadowKey == null) {
                AndroidShadowContext$ShadowKey androidShadowContext$ShadowKey2 = new AndroidShadowContext$ShadowKey(ColorKt.RectangleShape, 0L, LayoutDirection.Ltr, 1.0f, null);
                anonymousClass4.this$0 = androidShadowContext$ShadowKey2;
                androidShadowContext$ShadowKey = androidShadowContext$ShadowKey2;
            }
            androidShadowContext$ShadowKey.shape = shape;
            androidShadowContext$ShadowKey.size = mo753getSizeNHjbRc;
            androidShadowContext$ShadowKey.layoutDirection = layoutDirection;
            androidShadowContext$ShadowKey.density = drawScope.getDensity();
            androidShadowContext$ShadowKey.shadow = new Shadow(shadow.radius, shadow.spread, 0L, shadow.color, shadow.alpha, shadow.blendMode);
            MutableScatterMap mutableScatterMap = (MutableScatterMap) anonymousClass4.val$audioErrorConsumer;
            if (mutableScatterMap == null) {
                mutableScatterMap = new MutableScatterMap();
                anonymousClass4.val$audioErrorConsumer = mutableScatterMap;
            }
            dropShadowRenderer = (DropShadowRenderer) mutableScatterMap.get(androidShadowContext$ShadowKey);
            if (dropShadowRenderer == null) {
                dropShadowRenderer = new DropShadowRenderer(shadow, shape.mo175createOutlinePq9zytI(mo753getSizeNHjbRc, layoutDirection, drawScope));
                MutableScatterMap mutableScatterMap2 = (MutableScatterMap) anonymousClass4.val$audioErrorConsumer;
                if (mutableScatterMap2 == null) {
                    mutableScatterMap2 = new MutableScatterMap();
                    anonymousClass4.val$audioErrorConsumer = mutableScatterMap2;
                }
                mutableScatterMap2.set(new AndroidShadowContext$ShadowKey(androidShadowContext$ShadowKey.shape, androidShadowContext$ShadowKey.size, androidShadowContext$ShadowKey.layoutDirection, androidShadowContext$ShadowKey.density, androidShadowContext$ShadowKey.shadow), dropShadowRenderer);
            }
        }
        float mo236toPx0680j_4 = drawScope.mo236toPx0680j_4(DpOffset.m1039getXD9Ej5fM(this.shadow.offset));
        float mo236toPx0680j_42 = drawScope.mo236toPx0680j_4(DpOffset.m1040getYD9Ej5fM(this.shadow.offset));
        ((Extras.Key) drawScope.getDrawContext().path).translate(mo236toPx0680j_4, mo236toPx0680j_42);
        try {
            ColorFilter colorFilter = this.colorFilter;
            long mo753getSizeNHjbRc2 = drawScope.mo753getSizeNHjbRc();
            Shadow shadow2 = dropShadowRenderer.shadow;
            dropShadowRenderer.m764drawShadowerFMhIw(drawScope, colorFilter, mo753getSizeNHjbRc2, shadow2.color, RangesKt___RangesKt.coerceIn(this.alpha * shadow2.alpha, RecyclerView.DECELERATION_RATE, 1.0f), dropShadowRenderer.shadow.blendMode);
        } finally {
            ((Extras.Key) drawScope.getDrawContext().path).translate(-mo236toPx0680j_4, -mo236toPx0680j_42);
        }
    }
}
