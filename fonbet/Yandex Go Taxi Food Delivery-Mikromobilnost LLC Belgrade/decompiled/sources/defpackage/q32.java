package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class q32 {
    public final String a;
    public final LinkedHashMap b = new LinkedHashMap();
    public String c;

    public q32(String str) {
        this.a = str;
    }

    public final LinkedHashMap a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.c;
    }

    public final void d(Object obj, String str) {
        this.b.put(str, obj);
    }

    public final void e(Map map) {
        if (map != null) {
            this.b.putAll(map);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q32) && this.a.equals(((q32) obj).a);
    }

    public final void f(String str) {
        this.c = str;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("AnalyticsEvent(name=", this.a, Extension.C_BRAKE);
    }
}
