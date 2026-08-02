package androidx.compose.animation;

import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.unit.IntSize;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final class CrossfadeKt$Crossfade$3$1 extends Lambda implements Function1 {
    public static final CrossfadeKt$Crossfade$3$1 INSTANCE;
    public static final CrossfadeKt$Crossfade$3$1 INSTANCE$1;
    public static final CrossfadeKt$Crossfade$3$1 INSTANCE$10;
    public static final CrossfadeKt$Crossfade$3$1 INSTANCE$11;
    public static final CrossfadeKt$Crossfade$3$1 INSTANCE$12;
    public static final CrossfadeKt$Crossfade$3$1 INSTANCE$13;
    public static final CrossfadeKt$Crossfade$3$1 INSTANCE$14;
    public static final CrossfadeKt$Crossfade$3$1 INSTANCE$15;
    public static final CrossfadeKt$Crossfade$3$1 INSTANCE$16;
    public static final CrossfadeKt$Crossfade$3$1 INSTANCE$17;
    public static final CrossfadeKt$Crossfade$3$1 INSTANCE$18;
    public static final CrossfadeKt$Crossfade$3$1 INSTANCE$2;
    public static final CrossfadeKt$Crossfade$3$1 INSTANCE$3;
    public static final CrossfadeKt$Crossfade$3$1 INSTANCE$4;
    public static final CrossfadeKt$Crossfade$3$1 INSTANCE$5;
    public static final CrossfadeKt$Crossfade$3$1 INSTANCE$6;
    public static final CrossfadeKt$Crossfade$3$1 INSTANCE$7;
    public static final CrossfadeKt$Crossfade$3$1 INSTANCE$8;
    public static final CrossfadeKt$Crossfade$3$1 INSTANCE$9;
    public final /* synthetic */ int $r8$classId;

    static {
        int i = 1;
        INSTANCE$1 = new CrossfadeKt$Crossfade$3$1(i, 1);
        INSTANCE$2 = new CrossfadeKt$Crossfade$3$1(i, 2);
        INSTANCE$3 = new CrossfadeKt$Crossfade$3$1(i, 3);
        INSTANCE$4 = new CrossfadeKt$Crossfade$3$1(i, 4);
        INSTANCE$5 = new CrossfadeKt$Crossfade$3$1(i, 5);
        INSTANCE$6 = new CrossfadeKt$Crossfade$3$1(i, 6);
        INSTANCE$7 = new CrossfadeKt$Crossfade$3$1(i, 7);
        INSTANCE$8 = new CrossfadeKt$Crossfade$3$1(i, 8);
        INSTANCE$9 = new CrossfadeKt$Crossfade$3$1(i, 9);
        INSTANCE = new CrossfadeKt$Crossfade$3$1(i, 0);
        INSTANCE$10 = new CrossfadeKt$Crossfade$3$1(i, 10);
        INSTANCE$11 = new CrossfadeKt$Crossfade$3$1(i, 11);
        INSTANCE$12 = new CrossfadeKt$Crossfade$3$1(i, 12);
        INSTANCE$13 = new CrossfadeKt$Crossfade$3$1(i, 13);
        INSTANCE$14 = new CrossfadeKt$Crossfade$3$1(i, 14);
        INSTANCE$15 = new CrossfadeKt$Crossfade$3$1(i, 15);
        INSTANCE$16 = new CrossfadeKt$Crossfade$3$1(i, 16);
        INSTANCE$17 = new CrossfadeKt$Crossfade$3$1(i, 17);
        INSTANCE$18 = new CrossfadeKt$Crossfade$3$1(i, 18);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CrossfadeKt$Crossfade$3$1(int i) {
        super(1);
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                return obj;
            case 1:
                return AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, 90, null, 4), 2).plus(EnterExitTransitionKt.m147scaleInL8ZKhE$default(AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, 90, null, 4), 0.92f, 4)), EnterExitTransitionKt.fadeOut$default(AnimatableKt.tween$default(90, 0, null, 6), 2));
            case 2:
                return obj;
            case 3:
                return Integer.valueOf(((Number) obj).intValue());
            case 4:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 5:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return bool2;
            case 6:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                return bool3;
            case 7:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                return bool4;
            case 8:
                Boolean bool5 = (Boolean) obj;
                bool5.booleanValue();
                return bool5;
            case 9:
                long m674convertvNxB06k = Color.m674convertvNxB06k(((Color) obj).value, ColorSpaces.Oklab);
                return new AnimationVector4D(Color.m677getAlphaimpl(m674convertvNxB06k), Color.m681getRedimpl(m674convertvNxB06k), Color.m680getGreenimpl(m674convertvNxB06k), Color.m678getBlueimpl(m674convertvNxB06k));
            case 10:
                return AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, null, 7);
            case 11:
                ((IntSize) obj).getClass();
                return new IntSize(0L);
            case 12:
                ((IntSize) obj).getClass();
                return new IntSize(0L);
            case 13:
                return Integer.valueOf((-((Number) obj).intValue()) / 2);
            case 14:
                return Integer.valueOf((-((Number) obj).intValue()) / 2);
            case 15:
                return Integer.valueOf((-((Number) obj).intValue()) / 2);
            case 16:
                return EnterExitTransitionKt.DefaultOffsetAnimationSpec;
            case 17:
                return Boolean.valueOf(((EnterExitState) obj) == EnterExitState.Visible);
            case 18:
                return Boolean.valueOf(((EnterExitState) obj) == EnterExitState.Visible);
            case 19:
                return new IntSize((((int) (((IntSize) obj).packedValue & BodyPartID.bodyIdMax)) & BodyPartID.bodyIdMax) | (0 << 32));
            case 20:
                return new IntSize((((int) (((IntSize) obj).packedValue >> 32)) << 32) | (0 & BodyPartID.bodyIdMax));
            case 21:
                return new IntSize((((int) (((IntSize) obj).packedValue & BodyPartID.bodyIdMax)) & BodyPartID.bodyIdMax) | (0 << 32));
            default:
                return new IntSize((((int) (((IntSize) obj).packedValue >> 32)) << 32) | (0 & BodyPartID.bodyIdMax));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CrossfadeKt$Crossfade$3$1(int i, int i2) {
        super(i);
        this.$r8$classId = i2;
    }
}
