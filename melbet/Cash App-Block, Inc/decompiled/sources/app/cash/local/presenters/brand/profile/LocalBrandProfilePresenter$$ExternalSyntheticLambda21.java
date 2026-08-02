package app.cash.local.presenters.brand.profile;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.local.primitives.BrandSpot;
import com.squareup.cash.wallet.views.CardRegistry$CardTransition$TransitionType;
import com.squareup.cash.wallet.views.CardTransitionKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class LocalBrandProfilePresenter$$ExternalSyntheticLambda21 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState f$0;
    public final /* synthetic */ MutableState f$1;
    public final /* synthetic */ State f$2;

    public /* synthetic */ LocalBrandProfilePresenter$$ExternalSyntheticLambda21(MutableState mutableState, MutableState mutableState2, State state, int i) {
        this.$r8$classId = i;
        this.f$0 = mutableState;
        this.f$1 = mutableState2;
        this.f$2 = state;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        State state = this.f$2;
        MutableState mutableState = this.f$1;
        MutableState mutableState2 = this.f$0;
        switch (i) {
            case 0:
                String models$lambda$9 = LocalBrandProfilePresenter.models$lambda$9(mutableState2);
                return models$lambda$9 != null ? new BrandSpot(models$lambda$9, LocalBrandProfilePresenter.models$lambda$4(mutableState)) : (BrandSpot) state.getValue();
            default:
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = CardTransitionKt.LocalCardRegistry;
                return Float.valueOf(((((Boolean) mutableState2.getValue()).booleanValue() && ((CardRegistry$CardTransition$TransitionType) mutableState.getValue()) == CardRegistry$CardTransition$TransitionType.SOURCE) || ((Boolean) state.getValue()).booleanValue()) ? RecyclerView.DECELERATION_RATE : 1.0f);
        }
    }
}
