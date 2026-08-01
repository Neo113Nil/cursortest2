package u1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final Z2.e f41176a;

    /* renamed from: b, reason: collision with root package name */
    public final List f41177b;

    /* renamed from: c, reason: collision with root package name */
    public final String f41178c;

    public v(Class cls, Class cls2, Class cls3, List list, Z2.e eVar) {
        this.f41176a = eVar;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.f41177b = list;
        this.f41178c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final x a(int i, int i6, G1.a aVar, com.bumptech.glide.load.data.f fVar, s1.h hVar) {
        Z2.e eVar = this.f41176a;
        List list = (List) eVar.k();
        try {
            List list2 = this.f41177b;
            int size = list2.size();
            x xVar = null;
            for (int i9 = 0; i9 < size; i9++) {
                try {
                    xVar = ((j) list2.get(i9)).a(i, i6, aVar, fVar, hVar);
                } catch (t e9) {
                    list.add(e9);
                }
                if (xVar != null) {
                    break;
                }
            }
            if (xVar != null) {
                return xVar;
            }
            throw new t(this.f41178c, new ArrayList(list));
        } finally {
            eVar.D(list);
        }
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f41177b.toArray()) + '}';
    }
}
