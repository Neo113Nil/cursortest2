package defpackage;

import com.yandex.go.due_timetable.experiment.model.TimetableMainAction;
import kotlinx.serialization.KSerializer;

/* loaded from: classes12.dex */
public final class wez0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = TimetableMainAction.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
