package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.yandex.go.scooters.ignition.data.g;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import org.altbeacon.beacon.Region;
import org.altbeacon.beacon.RegionViewModel;
import org.altbeacon.beacon.b;

/* loaded from: classes4.dex */
public class y7w {
    public static void a(Context context, Intent intent) {
        wvb1 wvb1Var;
        o8g0 o8g0Var = null;
        o8g0Var = null;
        if (intent == null || intent.getExtras() == null) {
            wvb1Var = null;
        } else {
            if (intent.getExtras().getBundle("monitoringData") != null) {
                Bundle bundle = intent.getExtras().getBundle("monitoringData");
                bundle.setClassLoader(Region.class.getClassLoader());
                wvb1Var = new wvb1(bundle.getBoolean("inside"), bundle.get("region") != null ? (Region) bundle.getSerializable("region") : null);
            } else {
                wvb1Var = null;
            }
            if (intent.getExtras().getBundle("rangingData") != null) {
                Bundle bundle2 = intent.getExtras().getBundle("rangingData");
                bundle2.setClassLoader(Region.class.getClassLoader());
                o8g0Var = new o8g0(bundle2.get("beacons") != null ? (Collection) bundle2.getSerializable("beacons") : null, bundle2.get("region") != null ? (Region) bundle2.getSerializable("region") : null);
            }
        }
        if (o8g0Var != null) {
            Collection collection = (Collection) o8g0Var.a;
            Region region = (Region) o8g0Var.b;
            Set unmodifiableSet = Collections.unmodifiableSet(b.j(context).d);
            if (unmodifiableSet != null) {
                Iterator it = unmodifiableSet.iterator();
                while (it.hasNext()) {
                    ((g) it.next()).g.g(collection);
                }
            }
            b.j(context);
            if (b.j(context).y.get(region) != null) {
                HashMap hashMap = b.j(context).y;
                RegionViewModel regionViewModel = (RegionViewModel) hashMap.get(region);
                if (regionViewModel == null) {
                    regionViewModel = new RegionViewModel();
                    hashMap.put(region, regionViewModel);
                }
                ((dy40) regionViewModel.c.getValue()).m(collection);
            }
        }
        if (wvb1Var != null) {
            Region region2 = (Region) wvb1Var.b;
            Set unmodifiableSet2 = Collections.unmodifiableSet(b.j(context).e);
            Integer valueOf = Integer.valueOf(wvb1Var.a ? 1 : 0);
            if (unmodifiableSet2 != null) {
                Iterator it2 = unmodifiableSet2.iterator();
                if (it2.hasNext()) {
                    throw unr0.i(it2);
                }
            }
            if (b.j(context).y.get(region2) != null) {
                HashMap hashMap2 = b.j(context).y;
                RegionViewModel regionViewModel2 = (RegionViewModel) hashMap2.get(region2);
                if (regionViewModel2 == null) {
                    regionViewModel2 = new RegionViewModel();
                    hashMap2.put(region2, regionViewModel2);
                }
                ((dy40) regionViewModel2.b.getValue()).m(valueOf);
            }
        }
    }
}
