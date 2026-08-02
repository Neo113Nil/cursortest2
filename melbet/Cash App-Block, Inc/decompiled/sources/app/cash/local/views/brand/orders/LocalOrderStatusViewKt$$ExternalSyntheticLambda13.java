package app.cash.local.views.brand.orders;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import app.cash.local.viewmodels.LocalOrderStatusViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class LocalOrderStatusViewKt$$ExternalSyntheticLambda13 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ LocalOrderStatusViewModel.Loaded f$1;
    public final /* synthetic */ Function1 f$2;
    public final /* synthetic */ int f$4;

    public /* synthetic */ LocalOrderStatusViewKt$$ExternalSyntheticLambda13(LocalOrderStatusViewModel.Loaded loaded, Function1 function1, int i, int i2) {
        this.$r8$classId = i2;
        this.f$1 = loaded;
        this.f$2 = function1;
        this.f$4 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                LocalOrderStatusViewKt.LocalOrderStatusLoadedView(this.f$1, this.f$2, composer, Updater.updateChangedFlags(this.f$4 | 1));
                break;
            case 1:
                LocalOrderStatusViewKt.FulfillmentContent(this.f$1, this.f$2, composer, Updater.updateChangedFlags(this.f$4 | 1));
                break;
            case 2:
                LocalOrderStatusViewKt.StandardFulfillmentView(this.f$1, this.f$2, composer, Updater.updateChangedFlags(this.f$4 | 1));
                break;
            default:
                LocalOrderStatusViewKt.InStoreOpenTabClosedView(this.f$1, this.f$2, composer, Updater.updateChangedFlags(this.f$4 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
