package app.cash.local.views.cart;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import app.cash.local.viewmodels.LocalBrandLocationCartViewModel;
import com.squareup.cash.R;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes3.dex */
public final /* synthetic */ class LocalBrandLocationCartViewKt$$ExternalSyntheticLambda35 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ LocalBrandLocationCartViewModel.Fulfillment f$0;

    public /* synthetic */ LocalBrandLocationCartViewKt$$ExternalSyntheticLambda35(LocalBrandLocationCartViewModel.Fulfillment fulfillment, int i) {
        this.$r8$classId = i;
        this.f$0 = fulfillment;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        int i2 = R.string.local_views_change_location;
        LocalBrandLocationCartViewModel.Fulfillment fulfillment = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    if (!(fulfillment instanceof LocalBrandLocationCartViewModel.Fulfillment.Delivery)) {
                        if (!(fulfillment instanceof LocalBrandLocationCartViewModel.Fulfillment.Pickup)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        }
                    } else {
                        i2 = R.string.local_views_change_address;
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3838, 0L, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer, i2), (Map) null, (Function1) null, false);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (!(fulfillment instanceof LocalBrandLocationCartViewModel.Fulfillment.Delivery)) {
                        if (!(fulfillment instanceof LocalBrandLocationCartViewModel.Fulfillment.Pickup)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        }
                    } else {
                        i2 = R.string.local_views_change_address;
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3838, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer2, i2), (Map) null, (Function1) null, false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
