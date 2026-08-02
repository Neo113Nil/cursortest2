package com.miteksystems.misnap.core.internal;

import java.util.LinkedHashMap;

/* loaded from: classes4.dex */
public abstract class ContextHelper {
    public static final Object a = new Object();
    public static final LinkedHashMap b = new LinkedHashMap();

    public static void add(Object obj, String str) {
        obj.getClass();
        synchronized (a) {
            b.put(str, obj);
        }
    }
}
