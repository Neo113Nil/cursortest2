package androidx.compose.material;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.node.DepthSortedSetKt;
import com.squareup.cash.family.familyhub.views.DisabledClickableNode;

/* loaded from: classes3.dex */
public final class RippleNodeFactory$create$colorProducer$1 implements ColorProducer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object this$0;

    public /* synthetic */ RippleNodeFactory$create$colorProducer$1(Object obj, int i) {
        this.$r8$classId = i;
        this.this$0 = obj;
    }

    @Override // androidx.compose.ui.graphics.ColorProducer
    /* renamed from: invoke-0d7_KjU, reason: not valid java name */
    public final long mo501invoke0d7_KjU() {
        int i = this.$r8$classId;
        Object obj = this.this$0;
        switch (i) {
            case 0:
                return ((RippleNodeFactory) obj).color;
            case 1:
                DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode = (DelegatingThemeAwareRippleNode) obj;
                long mo501invoke0d7_KjU = delegatingThemeAwareRippleNode.color.mo501invoke0d7_KjU();
                if (mo501invoke0d7_KjU != 16) {
                    return mo501invoke0d7_KjU;
                }
                RippleConfiguration rippleConfiguration = (RippleConfiguration) DepthSortedSetKt.currentValueOf(delegatingThemeAwareRippleNode, RippleKt.LocalRippleConfiguration);
                if (rippleConfiguration != null) {
                    long j = rippleConfiguration.color;
                    if (j != 16) {
                        return j;
                    }
                }
                long j2 = ((Color) DepthSortedSetKt.currentValueOf(delegatingThemeAwareRippleNode, ContentColorKt.LocalContentColor)).value;
                return (((Colors) DepthSortedSetKt.currentValueOf(delegatingThemeAwareRippleNode, ColorsKt.LocalColors)).isLight() || ((double) ColorKt.m690luminance8_81llA(j2)) >= 0.5d) ? j2 : Color.White;
            case 2:
                DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode2 = (DelegatingThemeAwareRippleNode) obj;
                long mo501invoke0d7_KjU2 = delegatingThemeAwareRippleNode2.color.mo501invoke0d7_KjU();
                if (mo501invoke0d7_KjU2 != 16) {
                    return mo501invoke0d7_KjU2;
                }
                androidx.compose.material3.RippleConfiguration rippleConfiguration2 = (androidx.compose.material3.RippleConfiguration) DepthSortedSetKt.currentValueOf(delegatingThemeAwareRippleNode2, androidx.compose.material3.RippleKt.LocalRippleConfiguration);
                if (rippleConfiguration2 != null) {
                    long j3 = rippleConfiguration2.color;
                    if (j3 != 16) {
                        return j3;
                    }
                }
                return ((Color) DepthSortedSetKt.currentValueOf(delegatingThemeAwareRippleNode2, androidx.compose.material3.ContentColorKt.LocalContentColor)).value;
            case 3:
                return ((androidx.compose.material3.RippleNodeFactory) obj).color;
            default:
                return ((com.squareup.cash.arcade.theme.RippleConfiguration) DepthSortedSetKt.currentValueOf((DisabledClickableNode) obj, com.squareup.cash.arcade.theme.RippleKt.LocalRippleConfiguration)).color;
        }
    }
}
