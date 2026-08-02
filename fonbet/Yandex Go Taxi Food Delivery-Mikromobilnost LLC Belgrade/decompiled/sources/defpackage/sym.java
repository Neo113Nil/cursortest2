package defpackage;

import android.content.Context;
import com.yandex.go.due_timetable.experiment.IntercityTimetableConfigExperiment;
import com.yandex.go.due_timetable.experiment.d;
import com.yandex.go.due_timetable.experiment.e;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import java.util.Iterator;

/* loaded from: classes12.dex */
public final class sym implements v1n {
    public final Context a;
    public final IntercityTimetableConfigExperiment.TimeslotConfigurationRule b;

    public sym(Context context, wiq0 wiq0Var, d dVar) {
        this.a = context;
        pex0 m = ((k) wiq0Var).m();
        Object obj = null;
        String str = m != null ? m.b : null;
        str = str == null ? "" : str;
        Iterator it = ((IntercityTimetableConfigExperiment) ((e) dVar).a.b()).b.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (jl40.l(((IntercityTimetableConfigExperiment.TimeslotConfigurationRule) next).a, str)) {
                obj = next;
                break;
            }
        }
        this.b = (IntercityTimetableConfigExperiment.TimeslotConfigurationRule) obj;
    }
}
