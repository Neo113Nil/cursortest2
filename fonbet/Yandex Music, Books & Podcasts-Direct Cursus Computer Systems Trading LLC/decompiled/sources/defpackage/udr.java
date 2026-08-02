package defpackage;

import kotlin.Pair;
import kotlin.collections.CollectionsKt;

/* loaded from: classes5.dex */
public final class udr extends e7f {
    @Override // defpackage.e7f
    public final w4f a(w4f w4fVar) {
        w4fVar.getClass();
        if (!(w4fVar instanceof q5f)) {
            return w4fVar;
        }
        q5f q5fVar = (q5f) w4fVar;
        String str = (String) CollectionsKt.P(q5fVar.a.keySet());
        Object obj = q5fVar.get(str);
        obj.getClass();
        return new q5f(uah.j((q5f) obj, new Pair("type", x4f.c(str))));
    }
}
