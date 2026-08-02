package com.plaid.internal;

import com.plaid.internal.C0095a6;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.collections.EmptyMap;

/* loaded from: classes5.dex */
public final class F6 {
    public static volatile WeakReference<G6> a;

    public static final class a {
        public static void a(String str, Map map, J6 j6) {
            str.getClass();
            map.getClass();
            j6.getClass();
            WeakReference weakReference = F6.a;
            G6 g6 = weakReference != null ? (G6) weakReference.get() : null;
            if (g6 != null) {
                g6.a(str, map, j6);
            } else {
                C0095a6.a.a(C0095a6.a, "RemoteLog: No controller registered, dropping event: ".concat(str));
            }
        }

        public static void b(Map map, String str) {
            str.getClass();
            map.getClass();
            a(str, map, J6.INFO);
        }

        public static void a(Map map, String str) {
            str.getClass();
            map.getClass();
            a(str, map, J6.ERROR);
        }

        public static void a() {
            EmptyMap emptyMap = EmptyMap.INSTANCE;
            emptyMap.getClass();
            a("TwilioSNA - processUrl failure", emptyMap, J6.ERROR);
        }

        public static void a(String str) {
            EmptyMap emptyMap = EmptyMap.INSTANCE;
            emptyMap.getClass();
            b(emptyMap, str);
        }
    }
}
