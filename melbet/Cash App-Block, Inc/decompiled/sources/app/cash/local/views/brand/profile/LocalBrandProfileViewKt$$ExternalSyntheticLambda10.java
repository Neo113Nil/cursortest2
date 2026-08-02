package app.cash.local.views.brand.profile;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import com.squareup.cash.support.chat.views.transcript.message.compose.MessageFileKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class LocalBrandProfileViewKt$$ExternalSyntheticLambda10 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ Function0 f$1;
    public final /* synthetic */ ComposableLambdaImpl f$2;
    public final /* synthetic */ int f$3;

    public /* synthetic */ LocalBrandProfileViewKt$$ExternalSyntheticLambda10(boolean z, Function0 function0, ComposableLambdaImpl composableLambdaImpl, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = z;
        this.f$1 = function0;
        this.f$2 = composableLambdaImpl;
        this.f$3 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$3;
        ComposableLambdaImpl composableLambdaImpl = this.f$2;
        Function0 function0 = this.f$1;
        boolean z = this.f$0;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                LocalBrandLocationRowKt.LocalBrandProfileSheet(z, function0, composableLambdaImpl, composer, Updater.updateChangedFlags(i2 | 1));
                break;
            default:
                MessageFileKt.MessageRetryPopupMenu(z, function0, composableLambdaImpl, composer, Updater.updateChangedFlags(i2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
