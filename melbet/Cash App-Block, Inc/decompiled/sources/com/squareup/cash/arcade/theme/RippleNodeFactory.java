package com.squareup.cash.arcade.theme;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.material.ripple.RippleAlpha;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.unit.Dp;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class RippleNodeFactory implements IndicationNodeFactory {
    public final RippleAlpha alpha;
    public final boolean bounded;
    public final ColorProducer colorProducer;
    public final float radius;

    public RippleNodeFactory(ColorProducer colorProducer, boolean z, float f, RippleAlpha rippleAlpha) {
        colorProducer.getClass();
        this.colorProducer = colorProducer;
        this.bounded = z;
        this.radius = f;
        this.alpha = rippleAlpha;
    }

    @Override // androidx.compose.foundation.IndicationNodeFactory
    public final DelegatableNode create(MutableInteractionSourceImpl mutableInteractionSourceImpl) {
        mutableInteractionSourceImpl.getClass();
        return new RippleNode(mutableInteractionSourceImpl, this.bounded, this.radius, this.colorProducer, this.alpha);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RippleNodeFactory)) {
            return false;
        }
        RippleNodeFactory rippleNodeFactory = (RippleNodeFactory) obj;
        return Intrinsics.areEqual(this.colorProducer, rippleNodeFactory.colorProducer) && this.bounded == rippleNodeFactory.bounded && Dp.m1037equalsimpl0(this.radius, rippleNodeFactory.radius) && Intrinsics.areEqual(this.alpha, rippleNodeFactory.alpha);
    }

    @Override // androidx.compose.foundation.IndicationNodeFactory
    public final int hashCode() {
        int m = CameraState$Type$EnumUnboxingLocalUtility.m(this.radius, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.colorProducer.hashCode() * 31, 31, this.bounded), 31);
        RippleAlpha rippleAlpha = this.alpha;
        return m + (rippleAlpha == null ? 0 : rippleAlpha.hashCode());
    }

    public final String toString() {
        return "RippleNodeFactory(colorProducer=" + this.colorProducer + ", bounded=" + this.bounded + ", radius=" + Dp.m1038toStringimpl(this.radius) + ", alpha=" + this.alpha + ")";
    }
}
