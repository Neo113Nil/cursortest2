package com.yandex.metrica.push.core.tracking;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class d implements b {
    private final a a;
    private final String b;

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class a {
        public static final a c = new a("EVENT_PUSH_TOKEN", 0, 14, "Push token");
        public static final a d = new a("EVENT_NOTIFICATION", 1, 15, "Push notification");
        private final int a;
        private final String b;

        private a(String str, int i, int i2, String str2) {
            this.a = i2;
            this.b = str2;
        }

        public String a() {
            return this.b;
        }

        public int b() {
            return this.a;
        }
    }

    public d(a aVar, String str) {
        this.a = aVar;
        this.b = str;
    }

    public Map<String, String> b() {
        HashMap hashMap = new HashMap();
        hashMap.put("appmetrica_push_version", String.valueOf(2003003));
        hashMap.put("appmetrica_push_version_name", "2.3.3");
        hashMap.put("appmetrica_push_transport", this.b);
        return hashMap;
    }

    public String c() {
        return this.a.a();
    }

    public int d() {
        return this.a.b();
    }
}
