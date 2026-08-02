package com.squareup.cash.arcade.theme;

import android.content.res.Configuration;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.material.ripple.AndroidRippleNode;
import androidx.compose.material.ripple.RippleAlpha;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.ColorsDarkKt;
import com.squareup.cash.arcade.ColorsLightKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class RippleNode$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RippleNode f$0;

    public /* synthetic */ RippleNode$$ExternalSyntheticLambda0(RippleNode rippleNode, int i) {
        this.$r8$classId = i;
        this.f$0 = rippleNode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        final RippleNode rippleNode = this.f$0;
        switch (i) {
            case 0:
                if (rippleNode.rippleNode == null) {
                    MutableInteractionSourceImpl mutableInteractionSourceImpl = rippleNode.interactionSource;
                    boolean z = rippleNode.bounded;
                    float f = rippleNode.radius;
                    ColorProducer colorProducer = new ColorProducer() { // from class: com.squareup.cash.arcade.theme.RippleNode$attachNewRipple$1
                        @Override // androidx.compose.ui.graphics.ColorProducer
                        /* renamed from: invoke-0d7_KjU */
                        public final long mo501invoke0d7_KjU() {
                            RippleNode rippleNode2 = RippleNode.this;
                            long mo501invoke0d7_KjU = rippleNode2.color.mo501invoke0d7_KjU();
                            if (mo501invoke0d7_KjU != 16) {
                                return mo501invoke0d7_KjU;
                            }
                            long j = ((RippleConfiguration) DepthSortedSetKt.currentValueOf(rippleNode2, RippleKt.LocalRippleConfiguration)).color;
                            if (j != 16) {
                                return j;
                            }
                            Colors colors = (Colors) DepthSortedSetKt.currentValueOf(rippleNode2, ArcadeThemeKt.LocalColors);
                            if (colors != null) {
                                return colors.semantic.background.ripple;
                            }
                            return ((((Configuration) DepthSortedSetKt.currentValueOf(rippleNode2, AndroidCompositionLocals_androidKt.LocalConfiguration)).uiMode & 48) == 32 ? ColorsDarkKt.colorsDark : ColorsLightKt.colorsLight).semantic.background.ripple;
                        }
                    };
                    RippleNode$$ExternalSyntheticLambda0 rippleNode$$ExternalSyntheticLambda0 = new RippleNode$$ExternalSyntheticLambda0(rippleNode, 1);
                    TweenSpec tweenSpec = androidx.compose.material.ripple.RippleKt.DefaultTweenSpec;
                    AndroidRippleNode androidRippleNode = new AndroidRippleNode(mutableInteractionSourceImpl, z, f, colorProducer, rippleNode$$ExternalSyntheticLambda0);
                    rippleNode.delegate(androidRippleNode);
                    rippleNode.rippleNode = androidRippleNode;
                }
                return Unit.INSTANCE;
            default:
                RippleAlpha rippleAlpha = rippleNode.alpha;
                return rippleAlpha == null ? ((RippleConfiguration) DepthSortedSetKt.currentValueOf(rippleNode, RippleKt.LocalRippleConfiguration)).rippleAlpha : rippleAlpha;
        }
    }
}
