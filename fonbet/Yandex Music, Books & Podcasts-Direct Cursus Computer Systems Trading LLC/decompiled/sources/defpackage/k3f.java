package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class k3f {
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    public final void a(v2f v2fVar, Function0 function0, Function1 function1) {
        this.a.put(Integer.valueOf(v2fVar.a), new jnn(v2fVar, function0, function1));
    }
}
