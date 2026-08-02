package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import com.squareup.cash.moneybot.views.menu.ExpandableContentKt;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class SimpleLayoutKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Modifier f$0;
    public final /* synthetic */ ComposableLambdaImpl f$1;

    public /* synthetic */ SimpleLayoutKt$$ExternalSyntheticLambda0(Modifier modifier, ComposableLambdaImpl composableLambdaImpl, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = modifier;
        this.f$1 = composableLambdaImpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        ComposableLambdaImpl composableLambdaImpl = this.f$1;
        Modifier modifier = this.f$0;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                SimpleLayoutKt.SimpleLayout(modifier, composableLambdaImpl, composer, Updater.updateChangedFlags(49));
                break;
            case 1:
                ExpandableContentKt.RecentChatHistoryPlaceholder(modifier, composableLambdaImpl, composer, Updater.updateChangedFlags(49));
                break;
            default:
                KeypadKt.PushOnPress(modifier, composableLambdaImpl, composer, Updater.updateChangedFlags(49));
                break;
        }
        return Unit.INSTANCE;
    }
}
