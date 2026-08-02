package defpackage;

import android.graphics.PointF;
import com.yandex.mapkit.maps.core.geometry.FloatPointFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlin.collections.b;
import ru.yandex.yandexmaps.multiplatform.pin.war.internal.util.PlacemarkType;

/* loaded from: classes7.dex */
public final class qub0 extends nub0 {
    public final sub0 a;
    public Map b;
    public Map c;
    public Map d;
    public Map e;

    public qub0(sub0 sub0Var) {
        super(new ue60());
        this.a = sub0Var;
        this.b = b.f();
        this.c = b.f();
        this.d = b.f();
        this.e = b.f();
    }

    public static ga20 e(mwb0 mwb0Var, PlacemarkType placemarkType, c3c0 c3c0Var) {
        String str = null;
        if ((placemarkType == PlacemarkType.LABEL_S || placemarkType == PlacemarkType.LABEL_M) && c3c0Var != null) {
            str = c3c0Var.a;
        }
        return new ga20(mwb0Var, placemarkType, str);
    }

    @Override // defpackage.nub0
    public final PointF a(mwb0 mwb0Var, PlacemarkType placemarkType, c3c0 c3c0Var) {
        PointF pointF = (PointF) this.c.get(e(mwb0Var, placemarkType, c3c0Var));
        return pointF == null ? FloatPointFactory.INSTANCE.create(0.0f, 0.0f) : pointF;
    }

    @Override // defpackage.nub0
    public final f2c0 b(mwb0 mwb0Var, PlacemarkType placemarkType, boolean z, c3c0 c3c0Var) {
        return (f2c0) this.d.get(new fav(mwb0Var, placemarkType, z));
    }

    @Override // defpackage.nub0
    public final i2c0 c(mwb0 mwb0Var, PlacemarkType placemarkType, c3c0 c3c0Var) {
        i2c0 i2c0Var = (i2c0) this.b.get(e(mwb0Var, placemarkType, c3c0Var));
        return i2c0Var == null ? new i2c0(0, 0) : i2c0Var;
    }

    @Override // defpackage.nub0
    public final List d(mwb0 mwb0Var) {
        List list = (List) this.e.get(mwb0Var);
        return list == null ? EmptyList.a : list;
    }

    public final void f(ArrayList arrayList) {
        int d = gw00.d(tcc.n(arrayList, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            oub0 oub0Var = (oub0) it.next();
            mwb0 mwb0Var = oub0Var.a;
            PlacemarkType placemarkType = oub0Var.b;
            boolean z = oub0Var.c;
            fav favVar = new fav(mwb0Var, placemarkType, z);
            c3c0 c3c0Var = oub0Var.d;
            if (placemarkType != PlacemarkType.LABEL_S && placemarkType != PlacemarkType.LABEL_M) {
                c3c0Var = null;
            }
            Pair pair = new Pair(favVar, this.a.b(mwb0Var, placemarkType, z, c3c0Var));
            linkedHashMap.put(pair.c(), pair.f());
        }
        this.d = linkedHashMap;
    }

    public final void g(ArrayList arrayList, Collection collection) {
        List I = a.I(arrayList);
        int d = gw00.d(tcc.n(I, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        for (Object obj : I) {
            linkedHashMap.put(obj, collection);
        }
        h(linkedHashMap);
    }

    public final void h(LinkedHashMap linkedHashMap) {
        sub0 sub0Var;
        Set<mwb0> keySet = linkedHashMap.keySet();
        int d = gw00.d(tcc.n(keySet, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(d);
        Iterator it = keySet.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            sub0Var = this.a;
            if (!hasNext) {
                break;
            }
            Object next = it.next();
            linkedHashMap2.put(next, sub0Var.d((mwb0) next));
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        for (mwb0 mwb0Var : keySet) {
            Collection collection = (Collection) linkedHashMap.get(mwb0Var);
            EmptyList emptyList = EmptyList.a;
            if (collection == null) {
                collection = emptyList;
            }
            for (PlacemarkType placemarkType : a.I(collection)) {
                List<c3c0> list = (List) linkedHashMap2.get(mwb0Var);
                if (list == null) {
                    list = emptyList;
                }
                int i = pub0.a[placemarkType.ordinal()];
                if (i != 1 && i != 2) {
                    list = Collections.singletonList(null);
                }
                for (c3c0 c3c0Var : list) {
                    ga20 e = e(mwb0Var, placemarkType, c3c0Var);
                    if (placemarkType != PlacemarkType.LABEL_S && placemarkType != PlacemarkType.LABEL_M) {
                        c3c0Var = null;
                    }
                    linkedHashMap3.put(e, sub0Var.c(mwb0Var, placemarkType, c3c0Var));
                    linkedHashMap4.put(e, sub0Var.a(mwb0Var, placemarkType, c3c0Var));
                }
            }
        }
        this.e = linkedHashMap2;
        this.b = linkedHashMap3;
        this.c = linkedHashMap4;
    }
}
