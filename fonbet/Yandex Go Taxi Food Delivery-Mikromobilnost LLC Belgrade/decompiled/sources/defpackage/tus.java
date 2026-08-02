package defpackage;

import com.yandex.go.navigator.gas_stations.filters.repositories.b;
import com.yandex.go.navigator.gas_stations.models.GasStationSearchType;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class tus {
    public final HashMap a = new HashMap();
    public final r0 b;
    public final r0 c;
    public boolean d;
    public final r0 e;
    public final r0 f;
    public final r0 g;
    public final r0 h;
    public Map i;
    public final r0 j;
    public final r0 k;
    public List l;
    public final b m;

    public tus() {
        r0 c = bvf0.c(Boolean.TRUE);
        this.b = c;
        this.c = c;
        this.d = true;
        r0 c2 = bvf0.c(null);
        this.e = c2;
        this.f = c2;
        r0 c3 = bvf0.c(kotlin.collections.b.f());
        this.g = c3;
        this.h = c3;
        this.i = kotlin.collections.b.f();
        EmptyList emptyList = EmptyList.a;
        r0 c4 = bvf0.c(emptyList);
        this.j = c4;
        this.k = c4;
        this.l = emptyList;
        this.m = new b(c);
    }

    public final GasStationSearchType a() {
        return ((Boolean) this.b.getValue()).booleanValue() ? GasStationSearchType.ON_ROUTE : GasStationSearchType.ON_AREA;
    }

    public final void b() {
        this.g.l(this.i);
        this.j.l(this.l);
        qv10.B(this.d, this.b, null);
    }
}
