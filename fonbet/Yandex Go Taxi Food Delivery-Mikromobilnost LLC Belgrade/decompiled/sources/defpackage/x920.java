package defpackage;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class x920 {
    public final String a;
    public final Object b;

    public x920(String str, Object obj) {
        this.a = str;
        this.b = obj;
    }

    public final Object a(String str) {
        Object obj = this.b;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Map) {
            return ((Map) obj).get(str);
        }
        if (obj instanceof JSONObject) {
            return ((JSONObject) obj).opt(str);
        }
        ny61.u();
        return null;
    }

    public final Object b() {
        return this.b;
    }

    public final boolean c(String str) {
        Object obj = this.b;
        if (obj == null) {
            return false;
        }
        if (obj instanceof Map) {
            return ((Map) obj).containsKey(str);
        }
        if (obj instanceof JSONObject) {
            return ((JSONObject) obj).has(str);
        }
        ny61.u();
        return false;
    }
}
