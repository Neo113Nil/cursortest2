package defpackage;

import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.Cluster;
import com.yandex.mapkit.map.ClusterListener;
import com.yandex.mapkit.map.ClusterTapListener;
import com.yandex.mapkit.map.PlacemarkMapObject;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.collections.b;
import ru.yandextaxi.flutter_yandex_mapkit.ReferenceType;

/* loaded from: classes7.dex */
public final class z7c implements ClusterListener {
    public final String a;
    public final t7c b;
    public final ini0 c;
    public final LinkedHashMap d;

    public z7c(String str, t7c t7cVar, ini0 ini0Var, LinkedHashMap linkedHashMap) {
        this.a = str;
        this.b = t7cVar;
        this.c = ini0Var;
        this.d = linkedHashMap;
    }

    @Override // com.yandex.mapkit.map.ClusterListener
    public final void onClusterAdded(final Cluster cluster) {
        final String uuid = UUID.randomUUID().toString();
        PlacemarkMapObject appearance = cluster.getAppearance();
        this.d.put(uuid, appearance);
        List<PlacemarkMapObject> placemarks = cluster.getPlacemarks();
        final ArrayList arrayList = new ArrayList();
        for (PlacemarkMapObject placemarkMapObject : placemarks) {
            IdentityHashMap identityHashMap = (IdentityHashMap) this.c.b.get(ReferenceType.MAP_OBJECT);
            String str = identityHashMap != null ? (String) identityHashMap.get(placemarkMapObject) : null;
            if (str != null) {
                arrayList.add(str);
            }
        }
        cluster.addClusterTapListener(new ClusterTapListener() { // from class: y7c
            @Override // com.yandex.mapkit.map.ClusterTapListener
            public final boolean onClusterTap(Cluster cluster2) {
                Pair pair = new Pair("type", "cluster_tap");
                z7c z7cVar = z7c.this;
                Map i = b.i(pair, new Pair("collectionId", z7cVar.a), new Pair("clusterId", uuid), new Pair("placemarkIds", arrayList), new Pair("size", Integer.valueOf(cluster.getSize())));
                yeo yeoVar = z7cVar.b.a;
                if (yeoVar == null) {
                    return true;
                }
                yeoVar.success(i);
                return true;
            }
        });
        Point geometry = appearance.getGeometry();
        Map i = b.i(new Pair("collectionId", this.a), new Pair("clusterId", uuid), new Pair("placemarkIds", arrayList), new Pair("size", Integer.valueOf(cluster.getSize())), new Pair("geometry", b.i(new Pair("lat", Double.valueOf(geometry.getLatitude())), new Pair("lon", Double.valueOf(geometry.getLongitude())))));
        yeo yeoVar = this.b.a;
        if (yeoVar != null) {
            yeoVar.success(i);
        }
    }
}
