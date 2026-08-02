package androidx.compose.runtime;

import app.cash.broadway.ui.compose.DialogEventHandlerKt;
import com.squareup.cash.blockers.viewmodels.RegisterAliasViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class Updater$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ Updater$$ExternalSyntheticLambda0(int i, Function1 function1) {
        this.$r8$classId = 2;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(obj);
                break;
            case 1:
                function1.invoke(obj);
                break;
            case 2:
                ((Integer) obj2).getClass();
                DialogEventHandlerKt.DialogEventHandler(function1, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            default:
                String str = (String) obj;
                str.getClass();
                ((String) obj2).getClass();
                function1.invoke(new RegisterAliasViewEvent.Terms(str));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ Updater$$ExternalSyntheticLambda0(Function1 function1, int i, byte b) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }
}
