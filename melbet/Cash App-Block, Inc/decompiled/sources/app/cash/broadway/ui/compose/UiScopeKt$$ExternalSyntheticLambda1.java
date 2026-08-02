package app.cash.broadway.ui.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import com.squareup.cash.mooncake.compose_ui.ComposeMooncakeThemeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class UiScopeKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ComposableLambdaImpl f$0;

    public /* synthetic */ UiScopeKt$$ExternalSyntheticLambda1(ComposableLambdaImpl composableLambdaImpl) {
        this.$r8$classId = 1;
        this.f$0 = composableLambdaImpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        ComposableLambdaImpl composableLambdaImpl = this.f$0;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                UiScopeKt.UiScope(composableLambdaImpl, composer, Updater.updateChangedFlags(7));
                break;
            case 1:
                int intValue = num.intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    composableLambdaImpl.invoke((Object) gapComposer, (Object) 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                num.getClass();
                ComposeMooncakeThemeKt.MooncakeTheme(composableLambdaImpl, composer, Updater.updateChangedFlags(7));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ UiScopeKt$$ExternalSyntheticLambda1(int i, int i2, ComposableLambdaImpl composableLambdaImpl) {
        this.$r8$classId = i2;
        this.f$0 = composableLambdaImpl;
    }
}
