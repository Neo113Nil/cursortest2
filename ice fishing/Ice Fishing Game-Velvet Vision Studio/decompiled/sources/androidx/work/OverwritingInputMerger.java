package androidx.work;

import com.gamericefishpro.space.l6.f;
import com.gamericefishpro.space.l6.g;
import com.gamericefishpro.space.l6.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class OverwritingInputMerger extends j {
    @Override // com.gamericefishpro.space.l6.j
    public final g a(ArrayList arrayList) throws Throwable {
        f fVar = new f(0);
        HashMap map = new HashMap();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            map.putAll(Collections.unmodifiableMap(((g) obj).a));
        }
        fVar.a(map);
        g gVar = new g(fVar.a);
        g.c(gVar);
        return gVar;
    }
}
