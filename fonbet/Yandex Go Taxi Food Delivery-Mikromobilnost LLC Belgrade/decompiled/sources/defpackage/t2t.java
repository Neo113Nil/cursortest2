package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.a;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import ru.yandex.taxi.common_models.net.geometry.GeometryType;

/* loaded from: classes5.dex */
public final class t2t extends vfx {
    public static final t2t a = new t2t();

    public static ArrayList c(a aVar) {
        ArrayList arrayList = new ArrayList(tcc.n(aVar, 10));
        Iterator it = aVar.a.iterator();
        while (it.hasNext()) {
            a l = qcx.l((b) it.next());
            ArrayList arrayList2 = new ArrayList(tcc.n(l, 10));
            for (b bVar : l.a) {
                b0t b0tVar = b0t.a;
                arrayList2.add(b0t.a(bVar));
            }
            arrayList.add(arrayList2);
        }
        return arrayList;
    }

    @Override // defpackage.vfx
    public final Object a(ncx ncxVar) {
        c m = qcx.m(ncxVar.t());
        b bVar = (b) m.get("type");
        String g = bVar != null ? qcx.g(qcx.n(bVar)) : null;
        b bVar2 = (b) m.get("coordinates");
        a l = bVar2 != null ? qcx.l(bVar2) : null;
        if (jl40.l(g, "Polygon")) {
            return new u2t(scc.h(l != null ? c(l) : null), GeometryType.POLYGON);
        }
        if (!jl40.l(g, "MultiPolygon")) {
            return new u2t(null, null);
        }
        if (l != null) {
            r0 = new ArrayList(tcc.n(l, 10));
            Iterator it = l.a.iterator();
            while (it.hasNext()) {
                a l2 = qcx.l((b) it.next());
                a.getClass();
                r0.add(c(l2));
            }
        }
        return new u2t(r0, GeometryType.MULTI_POLYGON);
    }

    @Override // defpackage.vfx
    public final void b(vcx vcxVar, Object obj) {
        throw new SerializationException("Geometry does not support serialize operation");
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return c.Companion.serializer().getDescriptor();
    }
}
