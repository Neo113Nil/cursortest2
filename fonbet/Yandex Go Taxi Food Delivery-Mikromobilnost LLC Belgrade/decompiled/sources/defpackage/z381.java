package defpackage;

import java.net.InetAddress;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;

/* loaded from: classes7.dex */
public final class z381 {
    public static final ConcurrentHashMap b = new ConcurrentHashMap();
    public final ConcurrentHashMap a = b;

    public final boolean a(int i, String str) {
        Object failure;
        ConcurrentHashMap concurrentHashMap = this.a;
        Object obj = concurrentHashMap.get(str);
        if (obj == null) {
            try {
                failure = Boolean.valueOf(InetAddress.getByName(str).isReachable(i));
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            if (failure instanceof Result.Failure) {
                failure = null;
            }
            Boolean bool = (Boolean) failure;
            obj = Boolean.valueOf(bool != null ? bool.booleanValue() : false);
            Object putIfAbsent = concurrentHashMap.putIfAbsent(str, obj);
            if (putIfAbsent != null) {
                obj = putIfAbsent;
            }
        }
        return ((Boolean) obj).booleanValue();
    }
}
