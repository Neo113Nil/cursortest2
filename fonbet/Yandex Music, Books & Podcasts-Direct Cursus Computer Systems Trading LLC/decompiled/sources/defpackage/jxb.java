package defpackage;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class jxb {
    public static final jxb b = new jxb(new JsonObject());
    public final JsonObject a;

    public jxb(JsonObject jsonObject) {
        jsonObject.getClass();
        this.a = jsonObject;
    }

    public final Boolean a(String str) {
        JsonElement v = this.a.v(str);
        if (v != null) {
            return cxb.E(v);
        }
        return null;
    }

    public final Integer b(String str) {
        JsonElement v = this.a.v(str);
        if (v != null) {
            return cxb.F(v);
        }
        return null;
    }

    public final JsonArray c(String str) {
        str.getClass();
        JsonElement v = this.a.v(str);
        if (v != null) {
            if (!(v instanceof JsonArray)) {
                v = null;
            }
            if (v != null) {
                return v.g();
            }
        }
        return null;
    }

    public final JsonObject d(String str) {
        JsonElement v = this.a.v(str);
        if (v != null) {
            if (!(v instanceof JsonObject)) {
                v = null;
            }
            if (v != null) {
                return v.m();
            }
        }
        return null;
    }

    public final Long e(String str) {
        JsonElement v = this.a.v(str);
        if (v != null) {
            return cxb.H(v);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jxb) && Intrinsics.d(this.a, ((jxb) obj).a);
    }

    public final String f(String str) {
        JsonElement v = this.a.v(str);
        if (v != null) {
            return cxb.I(v);
        }
        return null;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "ExperimentDetails(data=" + this.a + ")";
    }
}
