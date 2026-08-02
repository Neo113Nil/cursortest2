package com.squareup.cash.money.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.recyclerview.widget.RecyclerView;
import coil3.Extras;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda28;
import com.squareup.util.MathsKt;
import com.squareup.util.Strings;
import com.squareup.wire.GrpcMethod;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes6.dex */
public final /* synthetic */ class MoneyTabUIKt$$ExternalSyntheticLambda10 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ State f$0;

    public /* synthetic */ MoneyTabUIKt$$ExternalSyntheticLambda10(State state, int i) {
        this.$r8$classId = i;
        this.f$0 = state;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        State state = this.f$0;
        switch (i) {
            case 0:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope.getClass();
                reusableGraphicsLayerScope.setScaleX(((Number) state.getValue()).floatValue());
                reusableGraphicsLayerScope.setScaleY(((Number) state.getValue()).floatValue());
                return Unit.INSTANCE;
            case 1:
                ((ReusableGraphicsLayerScope) obj).setAlpha(((Number) state.getValue()).floatValue());
                return Unit.INSTANCE;
            case 2:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope2 = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope2.getClass();
                reusableGraphicsLayerScope2.setAlpha(((Number) state.getValue()).floatValue());
                return Unit.INSTANCE;
            case 3:
                ((Density) obj).getClass();
                return new IntOffset(r14.mo230roundToPx0680j_4(((Dp) state.getValue()).value) << 32);
            case 4:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope3 = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope3.getClass();
                reusableGraphicsLayerScope3.setAlpha(MathsKt.min(((Number) state.getValue()).floatValue(), 1.0f));
                return Unit.INSTANCE;
            case 5:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope4 = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope4.getClass();
                reusableGraphicsLayerScope4.setAlpha(MathsKt.min(((Number) state.getValue()).floatValue(), 1.0f));
                return Unit.INSTANCE;
            case 6:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope5 = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope5.getClass();
                reusableGraphicsLayerScope5.setAlpha(Math.min(((Number) state.getValue()).floatValue(), 1.0f));
                return Unit.INSTANCE;
            case 7:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope6 = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope6.getClass();
                reusableGraphicsLayerScope6.setAlpha(Math.min(((Number) state.getValue()).floatValue(), 1.0f));
                return Unit.INSTANCE;
            case 8:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope7 = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope7.getClass();
                reusableGraphicsLayerScope7.setScaleY(((Number) state.getValue()).floatValue());
                reusableGraphicsLayerScope7.setScaleX(((Number) state.getValue()).floatValue());
                return Unit.INSTANCE;
            case 9:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope8 = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope8.getClass();
                reusableGraphicsLayerScope8.setAlpha(((Number) state.getValue()).floatValue());
                return Unit.INSTANCE;
            case 10:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope9 = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope9.getClass();
                reusableGraphicsLayerScope9.setAlpha(((Number) state.getValue()).floatValue());
                return Unit.INSTANCE;
            case 11:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope10 = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope10.getClass();
                reusableGraphicsLayerScope10.setAlpha(((Number) state.getValue()).floatValue());
                return Unit.INSTANCE;
            case 12:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope11 = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope11.getClass();
                reusableGraphicsLayerScope11.setAlpha(((Number) state.getValue()).floatValue());
                reusableGraphicsLayerScope11.m709setCompositingStrategyaDBOjCE(1);
                return Unit.INSTANCE;
            case 13:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope12 = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope12.getClass();
                reusableGraphicsLayerScope12.setAlpha(((Number) state.getValue()).floatValue());
                reusableGraphicsLayerScope12.setScaleX(ViewfinderDefaults.lerp(0.6f, 1.0f, ((Number) state.getValue()).floatValue()));
                reusableGraphicsLayerScope12.setScaleY(ViewfinderDefaults.lerp(0.6f, 1.0f, ((Number) state.getValue()).floatValue()));
                return Unit.INSTANCE;
            case 14:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope13 = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope13.getClass();
                reusableGraphicsLayerScope13.setAlpha(((Number) state.getValue()).floatValue());
                return Unit.INSTANCE;
            case 15:
                LayoutNodeDrawScope layoutNodeDrawScope = (LayoutNodeDrawScope) obj;
                layoutNodeDrawScope.getClass();
                CanvasDrawScope canvasDrawScope = layoutNodeDrawScope.canvasDrawScope;
                float floatValue = ((Number) state.getValue()).floatValue() * Float.intBitsToFloat((int) (canvasDrawScope.mo753getSizeNHjbRc() >> 32));
                float mo236toPx0680j_4 = layoutNodeDrawScope.mo236toPx0680j_4(16.0f);
                AndroidPath Path = AndroidPath_androidKt.Path();
                float intBitsToFloat = Float.intBitsToFloat((int) (canvasDrawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax));
                long floatToRawIntBits = (Float.floatToRawIntBits(mo236toPx0680j_4) << 32) | (Float.floatToRawIntBits(mo236toPx0680j_4) & BodyPartID.bodyIdMax);
                AndroidPath.addRoundRect$default(Path, Strings.RoundRect(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, floatValue, intBitsToFloat, Float.intBitsToFloat((int) (floatToRawIntBits >> 32)), Float.intBitsToFloat((int) (BodyPartID.bodyIdMax & floatToRawIntBits))));
                GrpcMethod grpcMethod = canvasDrawScope.drawContext;
                long m3999getSizeNHjbRc = grpcMethod.m3999getSizeNHjbRc();
                grpcMethod.getCanvas().save();
                try {
                    ((Extras.Key) grpcMethod.path).m1434clipPathmtrdDE(Path, 1);
                    layoutNodeDrawScope.drawContent();
                    Recorder$$ExternalSyntheticOutline2.m(grpcMethod, m3999getSizeNHjbRc);
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    Recorder$$ExternalSyntheticOutline2.m(grpcMethod, m3999getSizeNHjbRc);
                    throw th;
                }
            case 16:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope14 = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope14.getClass();
                reusableGraphicsLayerScope14.setAlpha(((Number) state.getValue()).floatValue());
                reusableGraphicsLayerScope14.setScaleX(((Number) state.getValue()).floatValue());
                reusableGraphicsLayerScope14.setScaleY(((Number) state.getValue()).floatValue());
                return Unit.INSTANCE;
            case 17:
                ((Density) obj).getClass();
                return new IntOffset(r14.mo230roundToPx0680j_4(((Dp) state.getValue()).value) << 32);
            case 18:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope15 = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope15.getClass();
                reusableGraphicsLayerScope15.setRotationZ(((Number) state.getValue()).floatValue());
                return Unit.INSTANCE;
            case 19:
                ((AnimatedContentTransitionScopeImpl) obj).getClass();
                return ((Boolean) state.getValue()).booleanValue() ? AnimatedContentKt.with(EnterExitTransitionKt.fadeIn$default(null, 3), EnterExitTransitionKt.fadeOut$default(null, 3)) : AnimatedContentKt.with(EnterExitTransitionKt.slideInVertically(AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, 1500.0f, null, 5), new TabToolbarsKt$$ExternalSyntheticLambda28(12)).plus(EnterExitTransitionKt.fadeIn$default(AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, 1500.0f, null, 5), 2)), EnterExitTransitionKt.fadeOut$default(AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, 10000.0f, null, 5), 2));
            case 20:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope16 = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope16.getClass();
                reusableGraphicsLayerScope16.setAlpha(((Number) state.getValue()).floatValue());
                return Unit.INSTANCE;
            case 21:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope17 = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope17.getClass();
                reusableGraphicsLayerScope17.setAlpha(((Number) state.getValue()).floatValue());
                return Unit.INSTANCE;
            case 22:
                DrawScope drawScope = (DrawScope) obj;
                drawScope.getClass();
                DrawScope.m747drawRectnJ9OG0$default(drawScope, ((Color) state.getValue()).value, 0L, 0L, RecyclerView.DECELERATION_RATE, null, null, 0, EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                return Unit.INSTANCE;
            case 23:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope18 = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope18.getClass();
                reusableGraphicsLayerScope18.setAlpha(((Number) state.getValue()).floatValue());
                return Unit.INSTANCE;
            case 24:
                DrawScope drawScope2 = (DrawScope) obj;
                drawScope2.getClass();
                DrawScope.m747drawRectnJ9OG0$default(drawScope2, ((Color) state.getValue()).value, 0L, 0L, RecyclerView.DECELERATION_RATE, null, null, 0, EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                return Unit.INSTANCE;
            case 25:
                ((Density) obj).getClass();
                return new IntOffset(((IntOffset) state.getValue()).packedValue);
            case 26:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope19 = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope19.getClass();
                reusableGraphicsLayerScope19.setScaleX(((Number) state.getValue()).floatValue());
                reusableGraphicsLayerScope19.setScaleY(((Number) state.getValue()).floatValue());
                return Unit.INSTANCE;
            case 27:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope20 = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope20.getClass();
                reusableGraphicsLayerScope20.setShadowElevation(reusableGraphicsLayerScope20.graphicsDensity.getDensity() * ((Dp) state.getValue()).value);
                return Unit.INSTANCE;
            default:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope21 = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope21.getClass();
                reusableGraphicsLayerScope21.setShadowElevation(reusableGraphicsLayerScope21.graphicsDensity.getDensity() * ((Dp) state.getValue()).value);
                return Unit.INSTANCE;
        }
    }
}
