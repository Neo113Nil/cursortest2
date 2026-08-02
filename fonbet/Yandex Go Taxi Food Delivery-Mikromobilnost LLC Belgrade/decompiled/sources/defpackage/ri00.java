package defpackage;

import com.yandex.mapkit.map.MapLoadStatistics;
import com.yandex.mapkit.map.MapLoadedListener;

/* loaded from: classes15.dex */
public final class ri00 implements MapLoadedListener {
    public final /* synthetic */ j18 a;

    public ri00(j18 j18Var) {
        this.a = j18Var;
    }

    @Override // com.yandex.mapkit.map.MapLoadedListener
    public final void onMapLoaded(MapLoadStatistics mapLoadStatistics) {
        this.a.resumeWith(mapLoadStatistics);
    }
}
