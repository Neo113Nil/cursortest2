package defpackage;

import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$Accordion;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$AiBubble;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$CollapsingContainer;
import com.yandex.go.taxi.order.models.api.response.a7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.a;
import kotlin.collections.builders.MapBuilder;

/* loaded from: classes12.dex */
public final /* synthetic */ class z8s implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ MapBuilder b;

    public /* synthetic */ z8s(MapBuilder mapBuilder, int i) {
        this.a = i;
        this.b = mapBuilder;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        Iterable singletonList;
        int i = this.a;
        MapBuilder mapBuilder = this.b;
        String str = (String) obj;
        switch (i) {
            case 0:
                Iterator it = ((vf00) mapBuilder.entrySet()).iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    str = cvu0.v(str, (String) entry.getKey(), (String) entry.getValue(), false);
                }
                return str;
            case 1:
                a7 a7Var = (a7) mapBuilder.get(str);
                if (a7Var instanceof RideCardItemDto$CollapsingContainer) {
                    List singletonList2 = Collections.singletonList(str);
                    List list = ((RideCardItemDto$CollapsingContainer) a7Var).c;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (mapBuilder.containsKey((String) obj2)) {
                            arrayList.add(obj2);
                        }
                    }
                    singletonList = a.m0(arrayList, singletonList2);
                } else if (a7Var instanceof RideCardItemDto$Accordion) {
                    List singletonList3 = Collections.singletonList(str);
                    List list2 = ((RideCardItemDto$Accordion) a7Var).d.a;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : list2) {
                        if (mapBuilder.containsKey((String) obj3)) {
                            arrayList2.add(obj3);
                        }
                    }
                    singletonList = a.m0(arrayList2, singletonList3);
                } else if (a7Var instanceof RideCardItemDto$AiBubble) {
                    List singletonList4 = Collections.singletonList(str);
                    List list3 = ((RideCardItemDto$AiBubble) a7Var).f;
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj4 : list3) {
                        if (mapBuilder.containsKey((String) obj4)) {
                            arrayList3.add(obj4);
                        }
                    }
                    singletonList = a.m0(arrayList3, singletonList4);
                } else {
                    singletonList = Collections.singletonList(str);
                }
                return singletonList;
            default:
                a7 a7Var2 = (a7) mapBuilder.get(str);
                if (a7Var2 == null) {
                    return null;
                }
                return new Pair(str, a7Var2);
        }
    }
}
