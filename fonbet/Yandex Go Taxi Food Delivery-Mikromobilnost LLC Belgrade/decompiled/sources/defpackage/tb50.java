package defpackage;

import com.yandex.mapkit.road_events_layer.RoadEventSignificance;
import java.util.LinkedHashMap;

/* loaded from: classes15.dex */
public abstract class tb50 {
    public static final LinkedHashMap a;
    public static final LinkedHashMap b;
    public static final LinkedHashMap c;
    public static final LinkedHashMap d;
    public static final LinkedHashMap e;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        RoadEventSignificance roadEventSignificance = RoadEventSignificance.MAJOR;
        linkedHashMap.put(roadEventSignificance, 15);
        RoadEventSignificance roadEventSignificance2 = RoadEventSignificance.MINOR;
        linkedHashMap.put(roadEventSignificance2, 15);
        a = linkedHashMap;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put(roadEventSignificance, 14);
        linkedHashMap2.put(roadEventSignificance2, 16);
        b = linkedHashMap2;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        RoadEventSignificance roadEventSignificance3 = RoadEventSignificance.CRUCIAL;
        linkedHashMap3.put(roadEventSignificance3, 13);
        linkedHashMap3.put(roadEventSignificance, 14);
        linkedHashMap3.put(roadEventSignificance2, 16);
        c = linkedHashMap3;
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        linkedHashMap4.put(roadEventSignificance3, 9);
        linkedHashMap4.put(roadEventSignificance, 14);
        linkedHashMap4.put(roadEventSignificance2, 16);
        d = linkedHashMap4;
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        linkedHashMap5.put(roadEventSignificance3, 8);
        linkedHashMap5.put(roadEventSignificance, 14);
        linkedHashMap5.put(roadEventSignificance2, 16);
        e = linkedHashMap5;
    }
}
