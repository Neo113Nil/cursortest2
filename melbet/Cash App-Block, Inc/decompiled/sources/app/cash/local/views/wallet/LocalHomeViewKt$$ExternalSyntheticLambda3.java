package app.cash.local.views.wallet;

import androidx.camera.core.AspectRatio;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import app.cash.local.viewmodels.LocalOrderStatusViewModel;
import app.cash.local.views.brand.orders.LocalOrderStatusViewKt;
import com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeWidgetViewModel;
import com.squareup.cash.bitcoin.views.applet.BitcoinHomeViewKt;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.cash.wallet.views.UtilsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class LocalHomeViewKt$$ExternalSyntheticLambda3 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ boolean f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ LocalHomeViewKt$$ExternalSyntheticLambda3(Object obj, boolean z, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = z;
        this.f$2 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$2;
        boolean z = this.f$1;
        Object obj3 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(i2 | 1);
                LocalHomeViewKt.LocalHomeLoadingView(updateChangedFlags, (Composer) obj, (Modifier) obj3, z);
                break;
            case 1:
                ((Integer) obj2).getClass();
                AspectRatio.PredictiveBackHandler(z, (Function2) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                LocalOrderStatusViewKt.OrderSummaryView((LocalOrderStatusViewModel.Loaded) obj3, z, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                BitcoinHomeViewKt.AddSeparator(z, (BitcoinHomeWidgetViewModel) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                UtilsKt.Render((CardSchemeViewModel.Module.Icon) obj3, z, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ LocalHomeViewKt$$ExternalSyntheticLambda3(boolean z, Object obj, int i, int i2) {
        this.$r8$classId = i2;
        this.f$1 = z;
        this.f$0 = obj;
        this.f$2 = i;
    }
}
