package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class kj5 implements lj5 {
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    public final void a(String str) {
        ssg.a(4, "CommunicationTriggerFilterImpl", "remove filter ".concat(str), null);
        this.a.remove(str);
    }

    public final void b(String str, Function2 function2) {
        ssg.a(4, "CommunicationTriggerFilterImpl", "set filter ".concat(str), null);
        this.a.put(str, function2);
    }
}
