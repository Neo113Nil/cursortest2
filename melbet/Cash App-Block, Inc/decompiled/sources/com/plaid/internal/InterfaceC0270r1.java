package com.plaid.internal;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.plaid.internal.r1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC0270r1 {

    /* renamed from: com.plaid.internal.r1$a */
    public static class a {
        public final String a;
        public final boolean b;
        public final int c;
        public final String d;

        public a(String str, boolean z, String str2, int i) {
            this.a = str;
            this.b = z;
            this.d = str2;
            this.c = i;
        }
    }

    /* renamed from: com.plaid.internal.r1$b */
    public static class b {
        public final String a;
        public final int b;
        public final String c;
        public final Map<String, String> d;

        public b(int i, String str, String str2, Map<String, List<String>> map) {
            this.a = str2;
            this.b = i;
            this.c = str;
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                if (entry.getKey() != null) {
                    hashMap.put(entry.getKey().toLowerCase(), TextUtils.join(", ", entry.getValue()));
                }
            }
            this.d = Collections.unmodifiableMap(hashMap);
        }
    }

    b a(a aVar);

    void a();

    EnumC0340z isConnected();
}
