package androidx.compose.ui.graphics;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import coil3.size.SizeKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class ReusableGraphicsLayerScope implements Density {
    public long ambientShadowColor;
    public int blendMode;
    public float cameraDistance;
    public boolean clip;
    public int compositingStrategy;
    public Density graphicsDensity;
    public LayoutDirection layoutDirection;
    public int mutatedFields;
    public ColorKt outline;
    public RenderEffect renderEffect;
    public float rotationX;
    public float rotationY;
    public float rotationZ;
    public float shadowElevation;
    public Shape shape;
    public long size;
    public long spotShadowColor;
    public long transformOrigin;
    public float translationX;
    public float translationY;
    public float scaleX = 1.0f;
    public float scaleY = 1.0f;
    public float alpha = 1.0f;

    public ReusableGraphicsLayerScope() {
        long j = GraphicsLayerScopeKt.DefaultShadowColor;
        this.ambientShadowColor = j;
        this.spotShadowColor = j;
        this.cameraDistance = 8.0f;
        this.transformOrigin = TransformOrigin.Center;
        this.shape = ColorKt.RectangleShape;
        this.compositingStrategy = 0;
        this.size = 9205357640488583168L;
        this.graphicsDensity = SizeKt.Density$default();
        this.layoutDirection = LayoutDirection.Ltr;
        this.blendMode = 3;
    }

    @Override // androidx.compose.ui.unit.Density
    public final float getDensity() {
        return this.graphicsDensity.getDensity();
    }

    @Override // androidx.compose.ui.unit.Density
    public final float getFontScale() {
        return this.graphicsDensity.getFontScale();
    }

    public final void reset() {
        setScaleX(1.0f);
        setScaleY(1.0f);
        setAlpha(1.0f);
        setTranslationX(RecyclerView.DECELERATION_RATE);
        setTranslationY(RecyclerView.DECELERATION_RATE);
        setShadowElevation(RecyclerView.DECELERATION_RATE);
        long j = GraphicsLayerScopeKt.DefaultShadowColor;
        m708setAmbientShadowColor8_81llA(j);
        m710setSpotShadowColor8_81llA(j);
        setRotationX(RecyclerView.DECELERATION_RATE);
        setRotationY(RecyclerView.DECELERATION_RATE);
        setRotationZ(RecyclerView.DECELERATION_RATE);
        setCameraDistance(8.0f);
        m711setTransformOrigin__ExYCQ(TransformOrigin.Center);
        setShape(ColorKt.RectangleShape);
        setClip(false);
        setRenderEffect(null);
        if (this.blendMode != 3) {
            this.mutatedFields |= PKIFailureInfo.signerNotTrusted;
            this.blendMode = 3;
        }
        m709setCompositingStrategyaDBOjCE(0);
        this.size = 9205357640488583168L;
        this.outline = null;
        this.mutatedFields = 0;
    }

    public final void setAlpha(float f) {
        if (this.alpha == f) {
            return;
        }
        this.mutatedFields |= 4;
        this.alpha = f;
    }

    /* renamed from: setAmbientShadowColor-8_81llA, reason: not valid java name */
    public final void m708setAmbientShadowColor8_81llA(long j) {
        if (Color.m676equalsimpl0(this.ambientShadowColor, j)) {
            return;
        }
        this.mutatedFields |= 64;
        this.ambientShadowColor = j;
    }

    public final void setCameraDistance(float f) {
        if (this.cameraDistance == f) {
            return;
        }
        this.mutatedFields |= 2048;
        this.cameraDistance = f;
    }

    public final void setClip(boolean z) {
        if (this.clip != z) {
            this.mutatedFields |= 16384;
            this.clip = z;
        }
    }

    /* renamed from: setCompositingStrategy-aDBOjCE, reason: not valid java name */
    public final void m709setCompositingStrategyaDBOjCE(int i) {
        if (this.compositingStrategy == i) {
            return;
        }
        this.mutatedFields |= 32768;
        this.compositingStrategy = i;
    }

    public final void setRenderEffect(RenderEffect renderEffect) {
        if (Intrinsics.areEqual(this.renderEffect, renderEffect)) {
            return;
        }
        this.mutatedFields |= PKIFailureInfo.unsupportedVersion;
        this.renderEffect = renderEffect;
    }

    public final void setRotationX(float f) {
        if (this.rotationX == f) {
            return;
        }
        this.mutatedFields |= 256;
        this.rotationX = f;
    }

    public final void setRotationY(float f) {
        if (this.rotationY == f) {
            return;
        }
        this.mutatedFields |= 512;
        this.rotationY = f;
    }

    public final void setRotationZ(float f) {
        if (this.rotationZ == f) {
            return;
        }
        this.mutatedFields |= 1024;
        this.rotationZ = f;
    }

    public final void setScaleX(float f) {
        if (this.scaleX == f) {
            return;
        }
        this.mutatedFields |= 1;
        this.scaleX = f;
    }

    public final void setScaleY(float f) {
        if (this.scaleY == f) {
            return;
        }
        this.mutatedFields |= 2;
        this.scaleY = f;
    }

    public final void setShadowElevation(float f) {
        if (this.shadowElevation == f) {
            return;
        }
        this.mutatedFields |= 32;
        this.shadowElevation = f;
    }

    public final void setShape(Shape shape) {
        if (Intrinsics.areEqual(this.shape, shape)) {
            return;
        }
        this.mutatedFields |= PKIFailureInfo.certRevoked;
        this.shape = shape;
    }

    /* renamed from: setSpotShadowColor-8_81llA, reason: not valid java name */
    public final void m710setSpotShadowColor8_81llA(long j) {
        if (Color.m676equalsimpl0(this.spotShadowColor, j)) {
            return;
        }
        this.mutatedFields |= 128;
        this.spotShadowColor = j;
    }

    /* renamed from: setTransformOrigin-__ExYCQ, reason: not valid java name */
    public final void m711setTransformOrigin__ExYCQ(long j) {
        if (TransformOrigin.m714equalsimpl0(this.transformOrigin, j)) {
            return;
        }
        this.mutatedFields |= 4096;
        this.transformOrigin = j;
    }

    public final void setTranslationX(float f) {
        if (this.translationX == f) {
            return;
        }
        this.mutatedFields |= 8;
        this.translationX = f;
    }

    public final void setTranslationY(float f) {
        if (this.translationY == f) {
            return;
        }
        this.mutatedFields |= 16;
        this.translationY = f;
    }
}
