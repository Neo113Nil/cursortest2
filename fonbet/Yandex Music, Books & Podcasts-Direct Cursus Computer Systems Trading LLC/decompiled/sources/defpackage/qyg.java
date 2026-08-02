package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class qyg extends w1g {
    public final JSONObject a;

    public qyg(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qyg) && this.a.equals(((qyg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Embedded(json=" + this.a + ')';
    }
}
