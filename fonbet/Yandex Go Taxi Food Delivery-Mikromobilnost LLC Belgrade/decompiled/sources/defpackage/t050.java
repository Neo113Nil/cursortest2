package defpackage;

import android.graphics.PointF;
import com.yandex.go.places.impl.ui.main.map.my_places.b;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.mapkit.map.MapObject;
import com.yandex.mapkit.map.MapObjectTapListener;
import com.yandex.runtime.image.ImageProvider;
import defpackage.sls;
import defpackage.tje;
import defpackage.y050;
import defpackage.z050;
import defpackage.zy11;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes13.dex */
public final class t050 implements s050 {
    public final /* synthetic */ b a;

    public t050(b bVar) {
        this.a = bVar;
    }

    @Override // defpackage.s050
    public final void E6(List list) {
        for (Map.Entry entry : this.a.x.entrySet()) {
            String str = (String) entry.getKey();
            f4c0 f4c0Var = (f4c0) entry.getValue();
            List list2 = list.contains(str) ? r050.a : r050.b;
            if (!jl40.l(f4c0Var.p, list2)) {
                f4c0Var.C(list2);
            }
        }
    }

    @Override // defpackage.s050
    public final void l3(List list) {
        final b bVar = this.a;
        LinkedHashMap linkedHashMap = bVar.x;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final z050 z050Var = (z050) it.next();
            f4c0 f4c0Var = (f4c0) linkedHashMap.get(z050Var.a);
            if (f4c0Var != null) {
                f4c0Var.d();
            }
            String str = z050Var.a;
            f4c0 f4c0Var2 = new f4c0(cwa1.d(z050Var.c), null, 6);
            ImageProvider imageProvider = z050Var.f;
            if (imageProvider == null || !z050Var.e) {
                f4c0Var2.y(z050Var.d);
            } else {
                f4c0Var2.z(imageProvider, new IconStyle().setAnchor(new PointF(0.5f, 0.8f)));
            }
            f4c0Var2.g(new MapObjectTapListener() { // from class: com.yandex.go.places.impl.ui.main.map.my_places.a
                @Override // com.yandex.mapkit.map.MapObjectTapListener
                public final boolean onMapObjectTap(MapObject mapObject, Point point) {
                    final y050 y050Var = b.this.c;
                    y050Var.B.c = null;
                    com.yandex.go.places.impl.navigation.common.navigator.internal.b bVar2 = y050Var.E;
                    bVar2.m.b();
                    z050 z050Var2 = z050Var;
                    bVar2.g(z050Var2.b, z050Var2.c, new sls() { // from class: com.yandex.go.places.impl.ui.main.map.my_places.c
                        @Override // defpackage.sls
                        public final Object invoke() {
                            y050 y050Var2 = y050.this;
                            tje.N(y050Var2.Jg(), null, null, new MyPlacesMapPresenter$onMyPlacesPinTapped$1$1(y050Var2, null), 3);
                            return zy11.a;
                        }
                    });
                    tje.N(y050Var.Jg(), null, null, new MyPlacesMapPresenter$onMyPlacesPinTapped$2(y050Var, z050Var2, null), 3);
                    return true;
                }
            });
            f4c0Var2.b(bVar.w);
            linkedHashMap.put(str, f4c0Var2);
        }
    }
}
