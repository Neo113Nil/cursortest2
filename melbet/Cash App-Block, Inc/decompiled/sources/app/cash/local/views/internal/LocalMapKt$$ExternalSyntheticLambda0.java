package app.cash.local.views.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import app.cash.local.primitives.GpsCoordinates;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class LocalMapKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ GpsCoordinates f$0;

    public /* synthetic */ LocalMapKt$$ExternalSyntheticLambda0(GpsCoordinates gpsCoordinates) {
        this.f$0 = gpsCoordinates;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        GpsCoordinates gpsCoordinates = this.f$0;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    LocalMapKt.LocalMapMarker(gpsCoordinates, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                num.getClass();
                LocalMapKt.LocalMapMarker(gpsCoordinates, composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ LocalMapKt$$ExternalSyntheticLambda0(GpsCoordinates gpsCoordinates, int i) {
        this.f$0 = gpsCoordinates;
    }
}
