package w1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final b3.e f41559a;

    /* renamed from: b, reason: collision with root package name */
    public final List f41560b;

    /* renamed from: c, reason: collision with root package name */
    public final String f41561c;

    public u(Class cls, Class cls2, Class cls3, List list, b3.e eVar) {
        this.f41559a = eVar;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.f41560b = list;
        this.f41561c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final w a(int i, int i4, I1.a aVar, com.bumptech.glide.load.data.f fVar, u1.h hVar) {
        b3.e eVar = this.f41559a;
        List list = (List) eVar.k();
        try {
            List list2 = this.f41560b;
            int size = list2.size();
            w wVar = null;
            for (int i6 = 0; i6 < size; i6++) {
                try {
                    wVar = ((i) list2.get(i6)).a(i, i4, aVar, fVar, hVar);
                } catch (s e9) {
                    list.add(e9);
                }
                if (wVar != null) {
                    break;
                }
            }
            if (wVar != null) {
                return wVar;
            }
            throw new s(this.f41561c, new ArrayList(list));
        } finally {
            eVar.D(list);
        }
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f41560b.toArray()) + '}';
    }
}
