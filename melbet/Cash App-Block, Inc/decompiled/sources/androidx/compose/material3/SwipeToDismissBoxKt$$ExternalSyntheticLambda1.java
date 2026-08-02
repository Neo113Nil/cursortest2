package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import com.fillr.core.analytics.FillrAnalyticsServiceBuilder;
import com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupState;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.ui.theme.Theme;
import com.stripe.android.model.LinkBrand;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class SwipeToDismissBoxKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ boolean f$3;
    public final /* synthetic */ boolean f$4;
    public final /* synthetic */ boolean f$5;
    public final /* synthetic */ Function f$6;
    public final /* synthetic */ Object f$7;
    public final /* synthetic */ int f$9;

    public /* synthetic */ SwipeToDismissBoxKt$$ExternalSyntheticLambda1(SwipeToDismissBoxState swipeToDismissBoxState, ComposableLambdaImpl composableLambdaImpl, Modifier modifier, boolean z, boolean z2, boolean z3, Function1 function1, ComposableLambdaImpl composableLambdaImpl2, int i, int i2) {
        this.f$0 = swipeToDismissBoxState;
        this.f$1 = composableLambdaImpl;
        this.f$2 = modifier;
        this.f$3 = z;
        this.f$4 = z2;
        this.f$5 = z3;
        this.f$6 = function1;
        this.f$7 = composableLambdaImpl2;
        this.f$9 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$9;
        Object obj3 = this.f$2;
        Function function = this.f$6;
        Object obj4 = this.f$7;
        Object obj5 = this.f$1;
        Object obj6 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(12586041);
                MenuKt.SwipeToDismissBox((SwipeToDismissBoxState) obj6, (ComposableLambdaImpl) obj5, (Modifier) obj3, this.f$3, this.f$4, this.f$5, (Function1) function, (ComposableLambdaImpl) obj4, (Composer) obj, updateChangedFlags, this.f$9);
                break;
            case 1:
                ((Integer) obj2).intValue();
                int updateChangedFlags2 = Updater.updateChangedFlags(i2 | 1);
                FillrAnalyticsServiceBuilder.NetworkingLinkSignupLoaded(this.f$3, (NetworkingLinkSignupState.Payload) obj6, this.f$4, (Async) obj5, this.f$5, (Function1) function, (Function0) obj4, (Function0) obj3, (Composer) obj, updateChangedFlags2);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags3 = Updater.updateChangedFlags(i2 | 1);
                com.stripe.android.financialconnections.ui.components.TextKt.FinancialConnectionsTopAppBar(this.f$3, this.f$4, (Theme) obj6, (LinkBrand) obj5, (State) obj4, this.f$5, (Function0) function, (Modifier) obj3, (Composer) obj, updateChangedFlags3);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ SwipeToDismissBoxKt$$ExternalSyntheticLambda1(boolean z, NetworkingLinkSignupState.Payload payload, boolean z2, Async async, boolean z3, Function1 function1, Function0 function0, Function0 function02, int i) {
        this.f$3 = z;
        this.f$0 = payload;
        this.f$4 = z2;
        this.f$1 = async;
        this.f$5 = z3;
        this.f$6 = function1;
        this.f$7 = function0;
        this.f$2 = function02;
        this.f$9 = i;
    }

    public /* synthetic */ SwipeToDismissBoxKt$$ExternalSyntheticLambda1(boolean z, boolean z2, Theme theme, LinkBrand linkBrand, State state, boolean z3, Function0 function0, Modifier modifier, int i) {
        this.f$3 = z;
        this.f$4 = z2;
        this.f$0 = theme;
        this.f$1 = linkBrand;
        this.f$7 = state;
        this.f$5 = z3;
        this.f$6 = function0;
        this.f$2 = modifier;
        this.f$9 = i;
    }
}
