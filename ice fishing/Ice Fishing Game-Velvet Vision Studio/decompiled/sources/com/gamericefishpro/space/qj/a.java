package com.gamericefishpro.space.qj;

import com.gamericefishpro.space.i9.d5;
import com.gamericefishpro.space.ki.b;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();

    public static final String a(b kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        ConcurrentHashMap concurrentHashMap = a;
        String str = (String) concurrentHashMap.get(kClass);
        if (str != null) {
            return str;
        }
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        String name = d5.C(kClass).getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        concurrentHashMap.put(kClass, name);
        return name;
    }
}
