package defpackage;

import java.util.HashMap;
import kotlin.collections.b;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes9.dex */
public final class qoy {
    public final HashMap a = new HashMap();

    public final tpr a(String str) {
        HashMap hashMap = this.a;
        if (!hashMap.containsKey(str)) {
            hashMap.put(str, bvf0.c(rly.a));
        }
        return (tpr) b.g(str, hashMap);
    }

    public final void b(String str, sly slyVar) {
        HashMap hashMap = this.a;
        if (hashMap.containsKey(str)) {
            ((r0) ((pz40) b.g(str, hashMap))).l(slyVar);
        } else {
            hashMap.put(str, bvf0.c(slyVar));
        }
    }
}
