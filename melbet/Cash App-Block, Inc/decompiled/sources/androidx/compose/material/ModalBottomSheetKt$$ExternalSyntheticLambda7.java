package androidx.compose.material;

import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.RangesKt___RangesKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class ModalBottomSheetKt$$ExternalSyntheticLambda7 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ long f$0;
    public final /* synthetic */ State f$1;

    public /* synthetic */ ModalBottomSheetKt$$ExternalSyntheticLambda7(long j, State state, int i) {
        this.$r8$classId = i;
        this.f$0 = j;
        this.f$1 = state;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        State state = this.f$1;
        switch (i) {
            case 0:
                DrawScope.m747drawRectnJ9OG0$default((DrawScope) obj, this.f$0, 0L, 0L, RangesKt___RangesKt.coerceIn(((Number) state.getValue()).floatValue(), RecyclerView.DECELERATION_RATE, 1.0f), null, null, 0, 118);
                break;
            default:
                DrawScope drawScope = (DrawScope) obj;
                drawScope.getClass();
                DrawScope.m747drawRectnJ9OG0$default(drawScope, Color.m675copywmQWz5c$default(((Number) state.getValue()).floatValue(), this.f$0, 14), 0L, 0L, RecyclerView.DECELERATION_RATE, null, null, 0, EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                break;
        }
        return Unit.INSTANCE;
    }
}
