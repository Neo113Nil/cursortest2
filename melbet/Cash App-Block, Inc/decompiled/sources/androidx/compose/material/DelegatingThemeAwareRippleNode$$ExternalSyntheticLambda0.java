package androidx.compose.material;

import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.material.ripple.AndroidRippleNode;
import androidx.compose.material.ripple.RippleAlpha;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.node.DepthSortedSetKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class DelegatingThemeAwareRippleNode$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DelegatingThemeAwareRippleNode f$0;

    public /* synthetic */ DelegatingThemeAwareRippleNode$$ExternalSyntheticLambda0(DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode, int i) {
        this.$r8$classId = i;
        this.f$0 = delegatingThemeAwareRippleNode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        RippleAlpha rippleAlpha;
        int i = this.$r8$classId;
        DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode = this.f$0;
        switch (i) {
            case 0:
                RippleConfiguration rippleConfiguration = (RippleConfiguration) DepthSortedSetKt.currentValueOf(delegatingThemeAwareRippleNode, RippleKt.LocalRippleConfiguration);
                AndroidRippleNode androidRippleNode = delegatingThemeAwareRippleNode.rippleNode;
                if (rippleConfiguration == null) {
                    if (androidRippleNode != null) {
                        delegatingThemeAwareRippleNode.undelegate(androidRippleNode);
                    }
                    delegatingThemeAwareRippleNode.rippleNode = null;
                } else if (androidRippleNode == null) {
                    int i2 = 1;
                    RippleNodeFactory$create$colorProducer$1 rippleNodeFactory$create$colorProducer$1 = new RippleNodeFactory$create$colorProducer$1(delegatingThemeAwareRippleNode, i2);
                    DelegatingThemeAwareRippleNode$$ExternalSyntheticLambda0 delegatingThemeAwareRippleNode$$ExternalSyntheticLambda0 = new DelegatingThemeAwareRippleNode$$ExternalSyntheticLambda0(delegatingThemeAwareRippleNode, i2);
                    MutableInteractionSourceImpl mutableInteractionSourceImpl = delegatingThemeAwareRippleNode.interactionSource;
                    boolean z = delegatingThemeAwareRippleNode.bounded;
                    float f = delegatingThemeAwareRippleNode.radius;
                    TweenSpec tweenSpec = androidx.compose.material.ripple.RippleKt.DefaultTweenSpec;
                    AndroidRippleNode androidRippleNode2 = new AndroidRippleNode(mutableInteractionSourceImpl, z, f, rippleNodeFactory$create$colorProducer$1, delegatingThemeAwareRippleNode$$ExternalSyntheticLambda0);
                    delegatingThemeAwareRippleNode.delegate(androidRippleNode2);
                    delegatingThemeAwareRippleNode.rippleNode = androidRippleNode2;
                }
                return Unit.INSTANCE;
            default:
                RippleConfiguration rippleConfiguration2 = (RippleConfiguration) DepthSortedSetKt.currentValueOf(delegatingThemeAwareRippleNode, RippleKt.LocalRippleConfiguration);
                if (rippleConfiguration2 == null || (rippleAlpha = rippleConfiguration2.rippleAlpha) == null) {
                    return ((Colors) DepthSortedSetKt.currentValueOf(delegatingThemeAwareRippleNode, ColorsKt.LocalColors)).isLight() ? ((double) ColorKt.m690luminance8_81llA(((Color) DepthSortedSetKt.currentValueOf(delegatingThemeAwareRippleNode, ContentColorKt.LocalContentColor)).value)) > 0.5d ? RippleKt.LightThemeHighContrastRippleAlpha : RippleKt.LightThemeLowContrastRippleAlpha : RippleKt.DarkThemeRippleAlpha;
                }
                return rippleAlpha;
        }
    }
}
