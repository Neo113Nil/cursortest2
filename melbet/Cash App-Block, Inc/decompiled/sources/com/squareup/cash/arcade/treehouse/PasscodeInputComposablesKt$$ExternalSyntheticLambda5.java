package com.squareup.cash.arcade.treehouse;

import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final /* synthetic */ class PasscodeInputComposablesKt$$ExternalSyntheticLambda5 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ long f$0;
    public final /* synthetic */ long f$1;
    public final /* synthetic */ State f$2;

    public /* synthetic */ PasscodeInputComposablesKt$$ExternalSyntheticLambda5(long j, long j2, State state, int i) {
        this.$r8$classId = i;
        this.f$0 = j;
        this.f$1 = j2;
        this.f$2 = state;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        State state = this.f$2;
        switch (i) {
            case 0:
                DrawScope drawScope = (DrawScope) obj;
                drawScope.getClass();
                float m642getMinDimensionimpl = Size.m642getMinDimensionimpl(drawScope.mo753getSizeNHjbRc()) / 2.0f;
                DrawScope.m738drawCircleVaOC9Bg$default(drawScope, this.f$0, m642getMinDimensionimpl, 0L, null, 0, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                if (((Number) state.getValue()).floatValue() > RecyclerView.DECELERATION_RATE) {
                    DrawScope.m738drawCircleVaOC9Bg$default(drawScope, this.f$1, ((Number) state.getValue()).floatValue() * m642getMinDimensionimpl, 0L, null, 0, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                }
                break;
            default:
                DrawScope drawScope2 = (DrawScope) obj;
                drawScope2.getClass();
                float floatValue = ((Number) state.getValue()).floatValue() * 360.0f;
                float f = (floatValue <= RecyclerView.DECELERATION_RATE || floatValue >= 360.0f) ? 0.0f : 6.0f;
                float f2 = (360.0f - floatValue) - (2.0f * f);
                if (floatValue > RecyclerView.DECELERATION_RATE) {
                    DrawScope.m737drawArcyD3GUKo$default(drawScope2, this.f$0, -90.0f, floatValue, 0L, 0L, RecyclerView.DECELERATION_RATE, new Stroke(drawScope2.mo236toPx0680j_4(10.0f), RecyclerView.DECELERATION_RATE, 1, 0, null, 26), 880);
                }
                if (f2 > RecyclerView.DECELERATION_RATE) {
                    DrawScope.m737drawArcyD3GUKo$default(drawScope2, this.f$1, (floatValue - 90.0f) + f, f2, 0L, 0L, RecyclerView.DECELERATION_RATE, new Stroke(drawScope2.mo236toPx0680j_4(4.0f), RecyclerView.DECELERATION_RATE, 1, 0, null, 26), 880);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
