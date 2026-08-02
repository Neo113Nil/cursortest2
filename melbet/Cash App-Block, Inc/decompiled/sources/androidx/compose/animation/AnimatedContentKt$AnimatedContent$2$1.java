package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.TransformOrigin;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class AnimatedContentKt$AnimatedContent$2$1 extends Lambda implements Function1 {
    public static final AnimatedContentKt$AnimatedContent$2$1 INSTANCE;
    public static final AnimatedContentKt$AnimatedContent$2$1 INSTANCE$1;
    public static final AnimatedContentKt$AnimatedContent$2$1 INSTANCE$2;
    public final /* synthetic */ int $r8$classId;

    static {
        int i = 1;
        INSTANCE = new AnimatedContentKt$AnimatedContent$2$1(i, 0);
        INSTANCE$1 = new AnimatedContentKt$AnimatedContent$2$1(i, 1);
        INSTANCE$2 = new AnimatedContentKt$AnimatedContent$2$1(i, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AnimatedContentKt$AnimatedContent$2$1(int i, int i2) {
        super(i);
        this.$r8$classId = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                return obj;
            case 1:
                long j = ((TransformOrigin) obj).packedValue;
                return new AnimationVector2D(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)));
            default:
                AnimationVector2D animationVector2D = (AnimationVector2D) obj;
                return new TransformOrigin(ColorKt.TransformOrigin(animationVector2D.v1, animationVector2D.v2));
        }
    }
}
