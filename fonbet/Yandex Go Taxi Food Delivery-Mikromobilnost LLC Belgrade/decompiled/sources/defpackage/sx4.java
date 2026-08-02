package defpackage;

import com.yandex.go.layers.api.model.params.Mode;
import com.yandex.go.layers.api.model.params.Screen;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.go.taxi.tariffs.repository.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import ru.yandex.taxi.layers.e;
import ru.yandex.taxi.map.utils.a;

/* loaded from: classes9.dex */
public abstract class sx4 {
    public final wnt a;
    public final e b;
    public final pwy0 c;
    public final nmx d;
    public final wiq0 e;
    public final g f;
    public final wd7 g;

    public sx4(wnt wntVar, e eVar, pwy0 pwy0Var, nmx nmxVar, wiq0 wiq0Var, g gVar, wd7 wd7Var) {
        this.a = wntVar;
        this.b = eVar;
        this.c = pwy0Var;
        this.d = nmxVar;
        this.e = wiq0Var;
        this.f = gVar;
        this.g = wd7Var;
    }

    public final b a(l3u0 l3u0Var, un0 un0Var) {
        c a;
        c m = qcx.m(((xnt) this.a).a(l3u0Var, l3u0.Companion.serializer()));
        return (un0Var == null || (a = un0Var.a(m)) == null) ? m : a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.ArrayList] */
    public final l3u0 b(zzs zzsVar, byx byxVar, String str, boolean z) {
        ?? r1;
        String b;
        String str2;
        ArrayList b2 = this.d.b();
        pex0 m = ((k) this.e).m();
        hp40 hp40Var = m != null ? new hp40(Boolean.valueOf(m.K0), this.f.b()) : null;
        zzs zzsVar2 = (zzs) this.g.b.get(byxVar.b.a.getAnalyticsName());
        e eVar = this.b;
        if (zzsVar2 == null) {
            zzsVar2 = ((gh00) eVar.a).e.b();
        }
        uc4 D = a.D(((gh00) eVar.a).e.f());
        float j = ((gh00) eVar.a).j();
        Mode mode = byxVar.b.a;
        Screen screen = byxVar.a;
        if (b2 != null) {
            r1 = new ArrayList(tcc.n(b2, 10));
            Iterator it = b2.iterator();
            while (it.hasNext()) {
                jmx jmxVar = (jmx) it.next();
                r1.add(jmxVar.getService() + ":" + jmxVar.a());
            }
        } else {
            r1 = EmptyList.a;
        }
        List list = r1;
        kj21 kj21Var = new kj21(new tmd0(str));
        if (b2 != null) {
            Iterator it2 = b2.iterator();
            while (it2.hasNext()) {
                jmx jmxVar2 = (jmx) it2.next();
                if (jmxVar2 instanceof uvx0) {
                    uvx0 uvx0Var = (uvx0) jmxVar2;
                    if (jl40.l(uvx0Var.c(), Boolean.TRUE)) {
                        b = uvx0Var.b();
                        break;
                    }
                }
            }
        }
        b = null;
        if (b == null) {
            str2 = m != null ? m.b : null;
        } else {
            str2 = b;
        }
        return new l3u0(zzsVar2, D, j, mode, screen, zzsVar, list, kj21Var, b2, hp40Var, str2, this.c.getThemeType().c(), new m310(z));
    }
}
