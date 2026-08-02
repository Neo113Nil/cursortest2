package defpackage;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
public final class g5m {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();

    public static final a5m a(Context context, z4m z4mVar, String str, String str2) {
        Object computeIfAbsent = a.computeIfAbsent(z4mVar + '-' + str + '-' + str2, new so6(2, new i50(context, z4mVar, str, str2, 15)));
        computeIfAbsent.getClass();
        return (a5m) computeIfAbsent;
    }
}
