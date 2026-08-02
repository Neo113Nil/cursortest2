package androidx.compose.material;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.unit.Dp;
import kotlin.ULong;

/* loaded from: classes.dex */
public final class RippleNodeFactory implements IndicationNodeFactory {
    public final boolean bounded;
    public final long color;
    public final float radius;

    public RippleNodeFactory(float f, long j, boolean z) {
        this.bounded = z;
        this.radius = f;
        this.color = j;
    }

    @Override // androidx.compose.foundation.IndicationNodeFactory
    public final DelegatableNode create(MutableInteractionSourceImpl mutableInteractionSourceImpl) {
        RippleNodeFactory$create$colorProducer$1 rippleNodeFactory$create$colorProducer$1 = new RippleNodeFactory$create$colorProducer$1(this, 0);
        return new DelegatingThemeAwareRippleNode(mutableInteractionSourceImpl, this.bounded, this.radius, rippleNodeFactory$create$colorProducer$1, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RippleNodeFactory)) {
            return false;
        }
        RippleNodeFactory rippleNodeFactory = (RippleNodeFactory) obj;
        if (this.bounded == rippleNodeFactory.bounded && Dp.m1037equalsimpl0(this.radius, rippleNodeFactory.radius)) {
            return Color.m676equalsimpl0(this.color, rippleNodeFactory.color);
        }
        return false;
    }

    @Override // androidx.compose.foundation.IndicationNodeFactory
    public final int hashCode() {
        int m = CameraState$Type$EnumUnboxingLocalUtility.m(this.radius, Boolean.hashCode(this.bounded) * 31, 961);
        int i = Color.$r8$clinit;
        ULong.Companion companion = ULong.Companion;
        return Long.hashCode(this.color) + m;
    }
}
