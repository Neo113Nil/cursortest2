package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import com.squareup.cash.initialscreenloader.views.InitialScreenPlaceholderViewKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class BoxKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ BoxKt$$ExternalSyntheticLambda0(Object obj, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ((Integer) obj2).intValue();
                BoxKt.Box((Modifier) this.f$0, (Composer) obj, Updater.updateChangedFlags(this.f$1 | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                InitialScreenPlaceholderViewKt.InitialScreenPlaceholder((Function1) this.f$0, (Composer) obj, Updater.updateChangedFlags(this.f$1 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
