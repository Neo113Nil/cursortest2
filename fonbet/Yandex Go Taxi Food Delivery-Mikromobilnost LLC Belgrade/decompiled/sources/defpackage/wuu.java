package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class wuu {
    public final HashMap a = new HashMap();
    public Map b;

    public final synchronized void a() {
        this.b = null;
        this.a.clear();
    }

    public final synchronized void b(Map map) {
        this.b = null;
        this.a.clear();
        this.a.putAll(map);
    }

    public final synchronized Map c() {
        try {
            if (this.b == null) {
                this.b = Collections.unmodifiableMap(new HashMap(this.a));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }

    public final synchronized void d(String str) {
        this.b = null;
        this.a.remove(str);
    }

    public final synchronized void e(String str, String str2) {
        this.b = null;
        this.a.put(str, str2);
    }
}
