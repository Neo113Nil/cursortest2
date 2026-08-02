package app.cash.local.views.cart;

import android.icu.text.MessageFormat;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import app.cash.local.views.fulfillment.FulfillmentRadioCellKt;
import com.squareup.cash.R;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.protos.cash.local.client.v1.LocalFulfillmentType;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes3.dex */
public final /* synthetic */ class LocalBrandLocationCartViewKt$$ExternalSyntheticLambda37 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ LocalFulfillmentType f$0;

    public /* synthetic */ LocalBrandLocationCartViewKt$$ExternalSyntheticLambda37(LocalFulfillmentType localFulfillmentType, int i) {
        this.$r8$classId = i;
        this.f$0 = localFulfillmentType;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        LocalFulfillmentType localFulfillmentType = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    String stringResource = Room.stringResource(gapComposer, FulfillmentRadioCellKt.getStringResId(localFulfillmentType));
                    if (stringResource.length() > 0) {
                        StringBuilder sb = new StringBuilder();
                        String valueOf = String.valueOf(stringResource.charAt(0));
                        valueOf.getClass();
                        String lowerCase = valueOf.toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        sb.append((Object) lowerCase);
                        sb.append(stringResource.substring(1));
                        stringResource = sb.toString();
                    }
                    String format2 = new MessageFormat(Room.stringResource(gapComposer, R.string.local_views_fulfillment_switch_to)).format(new Object[]{stringResource});
                    format2.getClass();
                    Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3838, 0L, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, format2, (Map) null, (Function1) null, false);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    String stringResource2 = Room.stringResource(gapComposer2, FulfillmentRadioCellKt.getStringResId(localFulfillmentType));
                    if (stringResource2.length() > 0) {
                        StringBuilder sb2 = new StringBuilder();
                        String valueOf2 = String.valueOf(stringResource2.charAt(0));
                        valueOf2.getClass();
                        String lowerCase2 = valueOf2.toLowerCase(Locale.ROOT);
                        lowerCase2.getClass();
                        sb2.append((Object) lowerCase2);
                        sb2.append(stringResource2.substring(1));
                        stringResource2 = sb2.toString();
                    }
                    String format3 = new MessageFormat(Room.stringResource(gapComposer2, R.string.local_views_fulfillment_switch_to)).format(new Object[]{stringResource2});
                    format3.getClass();
                    Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3838, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, format3, (Map) null, (Function1) null, false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            default:
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                    String stringResource3 = Room.stringResource(gapComposer3, FulfillmentRadioCellKt.getStringResId(localFulfillmentType));
                    if (stringResource3.length() > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        String valueOf3 = String.valueOf(stringResource3.charAt(0));
                        valueOf3.getClass();
                        String lowerCase3 = valueOf3.toLowerCase(Locale.ROOT);
                        lowerCase3.getClass();
                        sb3.append((Object) lowerCase3);
                        sb3.append(stringResource3.substring(1));
                        stringResource3 = sb3.toString();
                    }
                    String format4 = new MessageFormat(Room.stringResource(gapComposer3, R.string.local_views_fulfillment_switch_to)).format(new Object[]{stringResource3});
                    format4.getClass();
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, format4, (Map) null, (Function1) null, false);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
