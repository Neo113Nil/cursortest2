package defpackage;

import com.yandex.mapkit.GeoObject;
import com.yandex.mapkit.road_events.EventInfoSession;
import com.yandex.mapkit.road_events.RoadEventMetadata;
import com.yandex.runtime.Error;
import java.util.Calendar;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class v290 implements EventInfoSession.EventInfoListener {
    public final /* synthetic */ w290 a;

    public v290(w290 w290Var) {
        this.a = w290Var;
    }

    @Override // com.yandex.mapkit.road_events.EventInfoSession.EventInfoListener
    public final void onEventInfoError(Error error) {
        hst hstVar = jst.e;
        Objects.toString(error);
        hstVar.getClass();
        r0 r0Var = this.a.I;
        r0Var.getClass();
        r0Var.m(null, md60.a);
    }

    @Override // com.yandex.mapkit.road_events.EventInfoSession.EventInfoListener
    public final void onEventInfoReceived(GeoObject geoObject) {
        Object failure;
        w290 w290Var = this.a;
        r0 r0Var = w290Var.I;
        try {
            RoadEventMetadata roadEventMetadata = (RoadEventMetadata) geoObject.getMetadataContainer().getItem(RoadEventMetadata.class);
            TimeZone timeZone = TimeZone.getTimeZone("GMT");
            Calendar calendar = Calendar.getInstance(timeZone);
            o430 o430Var = e3n.b;
            long value = roadEventMetadata.getModificationTime().getValue();
            DurationUnit durationUnit = DurationUnit.SECONDS;
            calendar.setTimeInMillis(e3n.e(kp50.V(value, durationUnit)) + e3n.e(kp50.U(roadEventMetadata.getModificationTime().getTzOffset(), durationUnit)));
            String e = t7s.e(w290Var.B, w290Var.C, calendar, timeZone);
            nyy nyyVar = new nyy(((avj0) w290Var.z).i(kyh0.navigator_incidents_overview_reported_subtitle, e));
            r0Var.getClass();
            r0Var.m(null, nyyVar);
            failure = zy11.a;
        } catch (CancellationException e2) {
            throw e2;
        } catch (Exception e3) {
            failure = new Result.Failure(e3);
        }
        if (Result.a(failure) != null) {
            jst.e.getClass();
            r0Var.getClass();
            r0Var.m(null, md60.a);
        }
    }
}
