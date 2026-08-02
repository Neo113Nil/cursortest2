package androidx.compose.material;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class MenuKt$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ MutableTransitionState f$0;
    public final /* synthetic */ MutableState f$1;
    public final /* synthetic */ ScrollState f$2;
    public final /* synthetic */ Modifier f$3;
    public final /* synthetic */ ComposableLambdaImpl f$4;

    public /* synthetic */ MenuKt$$ExternalSyntheticLambda2(MutableTransitionState mutableTransitionState, MutableState mutableState, ScrollState scrollState, Modifier modifier, ComposableLambdaImpl composableLambdaImpl) {
        this.f$0 = mutableTransitionState;
        this.f$1 = mutableState;
        this.f$2 = scrollState;
        this.f$3 = modifier;
        this.f$4 = composableLambdaImpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ((Integer) obj2).getClass();
                CardKt.DropdownMenuContent(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, (Composer) obj, Updater.updateChangedFlags(49));
                break;
            default:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    CardKt.DropdownMenuContent(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, gapComposer, 48);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ MenuKt$$ExternalSyntheticLambda2(MutableTransitionState mutableTransitionState, MutableState mutableState, ScrollState scrollState, Modifier modifier, ComposableLambdaImpl composableLambdaImpl, int i) {
        this.f$0 = mutableTransitionState;
        this.f$1 = mutableState;
        this.f$2 = scrollState;
        this.f$3 = modifier;
        this.f$4 = composableLambdaImpl;
    }
}
