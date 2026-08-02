package defpackage;

import com.yandex.go.navigator.events.NavigatorTag;
import com.yandex.mapkit.directions.driving.Event;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.road_events.EventTag;
import com.yandex.mapkit.road_events.RoadEventMetadata;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes12.dex */
public final class x1l0 {
    public final zuj0 a;
    public final mg50 b;
    public final LinkedHashMap c;

    public x1l0(zuj0 zuj0Var, mg50 mg50Var, wsk0 wsk0Var) {
        this.a = zuj0Var;
        this.b = mg50Var;
        wsk0Var.getClass();
        this.c = wsk0.a();
    }

    public final EventTag a(Event event) {
        Object next;
        NavigatorTag navigatorTag;
        NavigatorTag navigatorTag2;
        Iterator<T> it = event.getTags().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                LinkedHashMap linkedHashMap = this.c;
                kg50 kg50Var = (kg50) linkedHashMap.get((EventTag) next);
                int priority = (kg50Var == null || (navigatorTag2 = kg50Var.a) == null) ? 0 : navigatorTag2.getPriority();
                do {
                    Object next2 = it.next();
                    kg50 kg50Var2 = (kg50) linkedHashMap.get((EventTag) next2);
                    int priority2 = (kg50Var2 == null || (navigatorTag = kg50Var2.a) == null) ? 0 : navigatorTag.getPriority();
                    if (priority < priority2) {
                        next = next2;
                        priority = priority2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        EventTag eventTag = (EventTag) next;
        nsk0 nsk0Var = eventTag != null ? new nsk0(event.getEventId(), event.getLocation(), eventTag) : null;
        if (nsk0Var != null) {
            return nsk0Var.c;
        }
        return null;
    }

    public final nsk0 b(RoadEventMetadata roadEventMetadata) {
        Object next;
        NavigatorTag navigatorTag;
        NavigatorTag navigatorTag2;
        Iterator<T> it = roadEventMetadata.getTags().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                LinkedHashMap linkedHashMap = this.c;
                kg50 kg50Var = (kg50) linkedHashMap.get((EventTag) next);
                int priority = (kg50Var == null || (navigatorTag2 = kg50Var.a) == null) ? 0 : navigatorTag2.getPriority();
                do {
                    Object next2 = it.next();
                    kg50 kg50Var2 = (kg50) linkedHashMap.get((EventTag) next2);
                    int priority2 = (kg50Var2 == null || (navigatorTag = kg50Var2.a) == null) ? 0 : navigatorTag.getPriority();
                    if (priority < priority2) {
                        next = next2;
                        priority = priority2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        EventTag eventTag = (EventTag) next;
        if (eventTag != null) {
            return new nsk0(roadEventMetadata.getEventId(), new Point(0.0d, 0.0d), eventTag);
        }
        return null;
    }
}
