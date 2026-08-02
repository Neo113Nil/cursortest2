package defpackage;

import android.app.Application;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class dc7 implements cc7 {
    public final Application a;
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    public dc7(Application application) {
        this.a = application;
    }

    public final wb7 a(String str) {
        Object putIfAbsent;
        ConcurrentHashMap concurrentHashMap = this.b;
        Object obj = concurrentHashMap.get(str);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(str, (obj = dmm.b(new xyn(new wq(str, 18)), new aw5(13, this, str), 6)))) != null) {
            obj = putIfAbsent;
        }
        return (wb7) obj;
    }

    public final wb7 b(String str) {
        return a("global" + File.separator + str);
    }

    public final wb7 c(String str, String str2) {
        str.getClass();
        return a(str + File.separator + str2);
    }
}
